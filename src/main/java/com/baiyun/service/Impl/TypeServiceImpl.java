package com.baiyun.service.Impl;

import com.baiyun.entity.Type;
import com.baiyun.mapper.TypeMapper;
import com.baiyun.service.TypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class TypeServiceImpl implements TypeService {
    @Resource
    private TypeMapper typeMapper;
    @Override
    public List<Type> findAllType(Type type) {
        return typeMapper.findAllType(type);
    }

    @Override
    public int deleteType(Integer typeId) {
        return typeMapper.deleteType(typeId);
    }

    @Override
    public int addType(Type type) {
        return typeMapper.addType(type);
    }


    @Override
    public int count(Type type) {
        return typeMapper.count(type);
    }
}
