package com.hr.mapper;

import com.hr.entity.AoaUser;
import com.hr.entity.AoaUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AoaUserMapper {
    long countByExample(AoaUserExample example);

    int deleteByExample(AoaUserExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(AoaUser record);

    int insertSelective(AoaUser record);

    List<AoaUser> selectByExample(AoaUserExample example);

    AoaUser selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") AoaUser record, @Param("example") AoaUserExample example);

    int updateByExample(@Param("record") AoaUser record, @Param("example") AoaUserExample example);

    int updateByPrimaryKeySelective(AoaUser record);

    int updateByPrimaryKey(AoaUser record);
}