package com.leotech.mapper;

import com.leotech.entity.Cable;
import com.leotech.entity.CableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CableMapper {
    int countByExample(CableExample example);

    int deleteByExample(CableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cable record);

    int insertSelective(Cable record);

    List<Cable> selectByExample(CableExample example);

    Cable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cable record, @Param("example") CableExample example);

    int updateByExample(@Param("record") Cable record, @Param("example") CableExample example);

    int updateByPrimaryKeySelective(Cable record);

    int updateByPrimaryKey(Cable record);
}