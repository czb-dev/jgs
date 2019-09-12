package cn.kgc.mapper;

import cn.kgc.bean.Bill;

import java.util.List;

public interface BillMapper {
    List<Bill> getBillList(Bill bill);
}
