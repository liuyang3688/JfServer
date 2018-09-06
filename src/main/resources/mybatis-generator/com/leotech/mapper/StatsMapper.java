package com.leotech.mapper;

import com.leotech.entity.Stats;
import com.leotech.entity.StatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatsMapper {
    int countByExample(StatsExample example);

    int deleteByExample(StatsExample example);

    int deleteByPrimaryKey(String name);

    int insert(Stats record);

    int insertSelective(Stats record);

    List<Stats> selectByExample(StatsExample example);

    Stats selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") Stats record, @Param("example") StatsExample example);

    int updateByExample(@Param("record") Stats record, @Param("example") StatsExample example);

    int updateByPrimaryKeySelective(Stats record);

    int updateByPrimaryKey(Stats record);
}