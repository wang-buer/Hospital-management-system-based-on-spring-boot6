package com.baiyun.mapper;

import com.baiyun.entity.Warehuose;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WarehuoseMapper {
    //库房的增删查改
    List<Warehuose> findAllWarehuose(Warehuose warehuose);
    int deleteWarehuose(Integer warehouseId);
    int addWarehuose(Warehuose warehuose);
    int count(Warehuose warehuose);
}
