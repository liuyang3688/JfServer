package com.leotech.mapper;

import com.leotech.entity.Clone;
import com.leotech.entity.CloneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CloneMapper {
    int countByExample(CloneExample example);

    int deleteByExample(CloneExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Clone record);

    int insertSelective(Clone record);

    List<Clone> selectByExample(CloneExample example);

    Clone selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Clone record, @Param("example") CloneExample example);

    int updateByExample(@Param("record") Clone record, @Param("example") CloneExample example);

    int updateByPrimaryKeySelective(Clone record);

    int updateByPrimaryKey(Clone record);
}