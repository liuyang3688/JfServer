package com.leotech.dao;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.leotech.dao.base.ExHibernateDaoSupport;
import com.leotech.entity.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class TemplateDao extends ExHibernateDaoSupport {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Template> getAll()
    {
        return (List<Template>)getHibernateTemplate().find("from " + Template.class.getName());
    }
    public JSONArray getAll_3d()
	{
		final JSONArray tpls = new JSONArray();
		try {
			String sqlFilter = " where isShow=1  and template.material = material.id";
			String strSql = "select *  from template, material";
			strSql += sqlFilter;
			jdbcTemplate.query(strSql, new RowCallbackHandler(){
				public void processRow(ResultSet result) throws SQLException {
					JSONObject tpl = new JSONObject();
					tpl.put("id", result.getInt("id"));
					tpl.put("name", result.getString("name"));
					tpl.put("type", result.getString("type"));
					tpl.put("length", result.getDouble("length"));
					tpl.put("width", result.getDouble("width"));
					tpl.put("height", result.getDouble("height"));
					tpl.put("pos_x", result.getDouble("pos_x"));
					tpl.put("pos_y", result.getDouble("pos_y"));
					tpl.put("pos_z", result.getDouble("pos_z"));
					tpl.put("rot_x", result.getDouble("rot_x"));
					tpl.put("rot_y", result.getDouble("rot_y"));
					tpl.put("rot_z", result.getDouble("rot_z"));
					tpl.put("scl_x", result.getDouble("scl_x"));
					tpl.put("scl_y", result.getDouble("scl_y"));
					tpl.put("scl_z", result.getDouble("scl_z"));
					tpl.put("transparent", result.getDouble("transparent"));
					tpl.put("opacity", result.getDouble("opacity"));
					tpl.put("length", result.getDouble("length"));
					tpl.put("skinColor", result.getString("skinColor"));
					tpl.put("isRepeat", result.getInt("isRepeat"));
					tpl.put("imgurl", result.getString("imgurl"));
					JSONObject up = new JSONObject();
					up.put("skinColor", result.getString("skin_up_skinColor"));
					up.put("imgurl", result.getString("skin_up_imgurl"));
					tpl.put("skin_up", up);
					JSONObject down = new JSONObject();
					down.put("skinColor", result.getString("skin_down_skinColor"));
					down.put("imgurl", result.getString("skin_down_imgurl"));
					tpl.put("skin_down", down);
					JSONObject left = new JSONObject();
					left.put("skinColor", result.getString("skin_left_skinColor"));
					left.put("imgurl", result.getString("skin_left_imgurl"));
					tpl.put("skin_left", left);
					JSONObject right = new JSONObject();
					right.put("skinColor", result.getString("skin_right_skinColor"));
					right.put("imgurl", result.getString("skin_right_imgurl"));
					tpl.put("skin_right", right);
					JSONObject fore = new JSONObject();
					fore.put("skinColor", result.getString("skin_fore_skinColor"));
					fore.put("imgurl", result.getString("skin_fore_imgurl"));
					tpl.put("skin_fore", fore);
					JSONObject back = new JSONObject();
					back.put("skinColor", result.getString("skin_back_skinColor"));
					back.put("imgurl", result.getString("skin_back_imgurl"));
					tpl.put("skin_back", back);
					//parent opcode
					tpl.put("parent", result.getString("parent"));
					tpl.put("opcode", result.getString("opcode"));
					tpls.add(tpl);
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tpls;
	}
}