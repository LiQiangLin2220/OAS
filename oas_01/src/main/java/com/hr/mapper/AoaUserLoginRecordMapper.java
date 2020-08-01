package com.hr.mapper;

import com.hr.entity.AoaUserLoginRecord;
import com.hr.entity.AoaUserLoginRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AoaUserLoginRecordMapper {
    long countByExample(AoaUserLoginRecordExample example);

    int deleteByExample(AoaUserLoginRecordExample example);

    int deleteByPrimaryKey(Long recordId);

    int insert(AoaUserLoginRecord record);

    int insertSelective(AoaUserLoginRecord record);

    List<AoaUserLoginRecord> selectByExample(AoaUserLoginRecordExample example);

    AoaUserLoginRecord selectByPrimaryKey(Long recordId);

    int updateByExampleSelective(@Param("record") AoaUserLoginRecord record, @Param("example") AoaUserLoginRecordExample example);

    int updateByExample(@Param("record") AoaUserLoginRecord record, @Param("example") AoaUserLoginRecordExample example);

    int updateByPrimaryKeySelective(AoaUserLoginRecord record);

    int updateByPrimaryKey(AoaUserLoginRecord record);
}