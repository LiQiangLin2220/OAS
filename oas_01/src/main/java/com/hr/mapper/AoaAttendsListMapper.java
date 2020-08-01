package com.hr.mapper;

import com.hr.entity.AoaAttendsList;
import com.hr.entity.AoaAttendsListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AoaAttendsListMapper {
    long countByExample(AoaAttendsListExample example);

    int deleteByExample(AoaAttendsListExample example);

    int deleteByPrimaryKey(Long attendsId);

    int insert(AoaAttendsList record);

    int insertSelective(AoaAttendsList record);

    List<AoaAttendsList> selectByExample(AoaAttendsListExample example);

    AoaAttendsList selectByPrimaryKey(Long attendsId);

    int updateByExampleSelective(@Param("record") AoaAttendsList record, @Param("example") AoaAttendsListExample example);

    int updateByExample(@Param("record") AoaAttendsList record, @Param("example") AoaAttendsListExample example);

    int updateByPrimaryKeySelective(AoaAttendsList record);

    int updateByPrimaryKey(AoaAttendsList record);
}