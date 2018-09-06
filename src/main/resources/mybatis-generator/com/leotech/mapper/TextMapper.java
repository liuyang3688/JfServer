package com.leotech.mapper;

import com.leotech.entity.Text;
import com.leotech.entity.TextExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TextMapper {
    int countByExample(TextExample example);

    int deleteByExample(TextExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Text record);

    int insertSelective(Text record);

    List<Text> selectByExample(TextExample example);

    Text selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Text record, @Param("example") TextExample example);

    int updateByExample(@Param("record") Text record, @Param("example") TextExample example);

    int updateByPrimaryKeySelective(Text record);

    int updateByPrimaryKey(Text record);
}