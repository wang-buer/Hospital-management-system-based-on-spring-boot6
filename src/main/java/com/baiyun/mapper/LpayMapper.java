package com.baiyun.mapper;

import com.baiyun.entity.Lrecord;
import com.baiyun.entity.Pay;
import com.baiyun.entity.Register;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LpayMapper {

    int updPay(Register register);
    int addPay(Register register);
    List<Pay> selPays(Register register);
    List<Lrecord> selSurplus(Lrecord lrecord);
}
