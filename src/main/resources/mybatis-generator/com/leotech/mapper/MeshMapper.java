package com.leotech.mapper;

import com.leotech.entity.Mesh;
import com.leotech.entity.MeshExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeshMapper {
    int countByExample(MeshExample example);

    int deleteByExample(MeshExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mesh record);

    int insertSelective(Mesh record);

    List<Mesh> selectByExample(MeshExample example);

    Mesh selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mesh record, @Param("example") MeshExample example);

    int updateByExample(@Param("record") Mesh record, @Param("example") MeshExample example);

    int updateByPrimaryKeySelective(Mesh record);

    int updateByPrimaryKey(Mesh record);
}