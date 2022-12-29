package com.baiyun.service;

import com.baiyun.entity.Lrecord;
import com.baiyun.entity.Pay;
import com.baiyun.entity.Register;

import java.util.List;

public interface LpayService {

    int updPay(Register register);
    int addPay(Register register);
    List<Pay> selPays(Register register);
    List<Lrecord> selSurplus(Lrecord lrecord);
}
