package com.hr.mapper;

import com.hr.entity.AoaDept;
import com.hr.entity.AoaDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AoaDeptMapper {
    long countByExample(AoaDeptExample example);

    int deleteByExample(AoaDeptExample example);

    int deleteByPrimaryKey(Long deptId);

    int insert(AoaDept record);

    int insertSelective(AoaDept record);

    List<AoaDept> selectByExample(AoaDeptExample example);

    AoaDept selectByPrimaryKey(Long deptId);

    int updateByExampleSelective(@Param("record") AoaDept record, @Param("example") AoaDeptExample example);

    int updateByExample(@Param("record") AoaDept record, @Param("example") AoaDeptExample example);

    int updateByPrimaryKeySelective(AoaDept record);

    int updateByPrimaryKey(AoaDept record);
}