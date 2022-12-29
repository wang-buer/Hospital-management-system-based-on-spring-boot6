package com.baiyun.service.Impl;

import com.baiyun.entity.Finance;
import com.baiyun.entity.SdoctorDuibi;
import com.baiyun.entity.currentFinance;
import com.baiyun.mapper.FinanceMapper;
import com.baiyun.service.FinanceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class FinanceServiceImpl implements FinanceService {
    @Resource
    private FinanceMapper FinanceMapper;
    @Override
    public List<Double> reportYearFinance(String year) {
        return FinanceMapper.reportYearFinance(year);
    }

    @Override
    public List<Finance> reportYearBingFinance() {
        return FinanceMapper.reportYearBingFinance();
    }

    @Override
    public List<Double> zhuYuanYearFinance(String year) {
        return FinanceMapper.zhuYuanYearFinance(year);
    }

    @Override
    public List<Finance> zhuYuanYearBingFinance() {
        return FinanceMapper.zhuYuanYearBingFinance();
    }

    @Override
    public List<SdoctorDuibi> doctorDuibi(SdoctorDuibi sdoctorDuibi) {
        return FinanceMapper.doctorDuibi(sdoctorDuibi);
    }

    @Override
    public List<SdoctorDuibi> zDoctorDuibi(SdoctorDuibi sdoctorDuibi) {
        return FinanceMapper.zDoctorDuibi(sdoctorDuibi);
    }

    @Override
    public List<currentFinance> currentFinance(String current) {
        return FinanceMapper.currentFinance(current);
    }
}
