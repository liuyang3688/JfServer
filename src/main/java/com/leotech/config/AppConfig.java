package com.leotech.config;

import com.leotech.rt.AirCondComThread;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.transaction.managed.ManagedTransactionFactory;
import org.hibernate.SessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.transaction.SpringManagedTransactionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.jta.TransactionFactory;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Configuration
@EnableAspectJAutoProxy
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.leotech"},
    excludeFilters={@ComponentScan.Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)  })
public class AppConfig  {
    private Properties prop = new Properties();
    @Autowired
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(dataSource);
        return template;
    }
    @Bean
    public ComboPooledDataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try {
            InputStream in = AirCondComThread.class.getResourceAsStream("/config/db.properties");
            prop.load(in);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dataSource.setDriverClass(prop.getProperty("jdbc.driver", "com.mysql.jdbc.Driver"));
            dataSource.setJdbcUrl(prop.getProperty("jdbc.url","jdbc:mysql://127.0.0.1:3306/db"));
            dataSource.setUser(prop.getProperty("jdbc.user","root"));
            dataSource.setPassword(prop.getProperty("jdbc.pass","admin"));
        }
        return dataSource;
    }

//    @Bean
//    @Autowired
//    public SqlSessionFactoryBean sqlSessionFactory(ComboPooledDataSource dataSource){
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//        bean.setConfigLocation(new ClassPathResource("config/mybatis.cfg.xml"));
//        //bean.setTransactionFactory(new ManagedTransactionFactory());
//        return bean;
//    }

//    @Bean
//    @Autowired
//    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
//        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory);
//        return template;
//    }

    @Bean
    public LocalSessionFactoryBean sessionFactory() throws IOException {
		LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
        bean.setConfigLocation(new ClassPathResource("config/hibernate.cfg.xml"));
		return bean;
    }

//    @Bean
//    @Autowired
//    public DataSourceTransactionManager transactionManager(ComboPooledDataSource dataSource) {
//        DataSourceTransactionManager manager = new DataSourceTransactionManager();
//        manager.setDataSource(dataSource);
//        return manager;
//    }

    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
        HibernateTransactionManager manager = new HibernateTransactionManager();
        manager.setSessionFactory(sessionFactory);
        return manager;
    }
}
