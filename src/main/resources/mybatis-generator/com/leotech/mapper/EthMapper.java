package com.leotech.mapper;

import com.leotech.entity.Eth;
import com.leotech.entity.EthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EthMapper {
    int countByExample(EthExample example);

    int deleteByExample(EthExample example);

    int insert(Eth record);

    int insertSelective(Eth record);

    List<Eth> selectByExample(EthExample example);

    int updateByExampleSelective(@Param("record") Eth record, @Param("example") EthExample example);

    int updateByExample(@Param("record") Eth record, @Param("example") EthExample example);
}