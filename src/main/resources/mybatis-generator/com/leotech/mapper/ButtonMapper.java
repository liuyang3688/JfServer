package com.leotech.mapper;

import com.leotech.entity.Button;
import com.leotech.entity.ButtonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ButtonMapper {
    int countByExample(ButtonExample example);

    int deleteByExample(ButtonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Button record);

    int insertSelective(Button record);

    List<Button> selectByExample(ButtonExample example);

    Button selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Button record, @Param("example") ButtonExample example);

    int updateByExample(@Param("record") Button record, @Param("example") ButtonExample example);

    int updateByPrimaryKeySelective(Button record);

    int updateByPrimaryKey(Button record);
}