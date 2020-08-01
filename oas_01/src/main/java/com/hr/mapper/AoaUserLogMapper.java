package com.hr.mapper;

import com.hr.entity.AoaUserLog;
import com.hr.entity.AoaUserLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AoaUserLogMapper {
    long countByExample(AoaUserLogExample example);

    int deleteByExample(AoaUserLogExample example);

    int deleteByPrimaryKey(Long logId);

    int insert(AoaUserLog record);

    int insertSelective(AoaUserLog record);

    List<AoaUserLog> selectByExample(AoaUserLogExample example);

    AoaUserLog selectByPrimaryKey(Long logId);

    int updateByExampleSelective(@Param("record") AoaUserLog record, @Param("example") AoaUserLogExample example);

    int updateByExample(@Param("record") AoaUserLog record, @Param("example") AoaUserLogExample example);

    int updateByPrimaryKeySelective(AoaUserLog record);

    int updateByPrimaryKey(AoaUserLog record);
}