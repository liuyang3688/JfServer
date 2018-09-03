package com.leotech.config;
import com.leotech.util.GlobalListener;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

//web.xml
public class ExWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.addListener(GlobalListener.class);
        super.onStartup(servletContext);
    };

//    @Override
//    protected void registerDispatcherServlet(ServletContext servletContext) {
//        String servletName = getServletName();
//        Assert.hasLength(servletName, "getServletName() may not return empty or null");
//
//        WebApplicationContext servletAppContext = createServletApplicationContext();
//        Assert.notNull(servletAppContext,
//                "createServletApplicationContext() did not return an application " +
//                        "context for servlet [" + servletName + "]");
//
//        DispatcherServlet dispatcherServlet = new DispatcherServlet(servletAppContext);
//
//        // throw NoHandlerFoundException to Controller
//        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
//
//        ServletRegistration.Dynamic registration = servletContext.addServlet(servletName, dispatcherServlet);
//        Assert.notNull(registration,
//                "Failed to register servlet with name '" + servletName + "'." +
//                        "Check if there is another servlet registered under the same name.");
//
//        registration.setLoadOnStartup(1);
//        registration.addMapping(getServletMappings());
//        registration.setAsyncSupported(isAsyncSupported());
//
//        customizeRegistration(registration);
//    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        // 返回配置IOC容器的类的类对象
        return new Class<?>[] { AppConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        // 返回配置SpringMVC的类的类对象
        return new Class<?>[] { WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" }; //映射路径
    }

    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setBeanName("encodingFilter");
        filter.setEncoding("utf-8");
        filter.setForceEncoding(true);
        return new Filter[]{filter};
    }

    @Override
    protected DispatcherServlet createDispatcherServlet(WebApplicationContext servletAppContext) {
        final DispatcherServlet dispatcherServlet = (DispatcherServlet) super.createDispatcherServlet(servletAppContext);
        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
        return dispatcherServlet;
    }
}