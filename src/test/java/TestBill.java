import cn.kgc.bean.Bill;
import cn.kgc.mapper.BillMapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.MyBatisUtil;

import java.util.List;

public class TestBill {
    SqlSession sqlSession = null;
    BillMapper billMapper = null;
    @Before
    public void before(){

        sqlSession = MyBatisUtil.getSqlSession();
        billMapper = sqlSession.getMapper(BillMapper.class);
    }

    @Test
    public  void test01(){
        Bill bill = new Bill();
        bill.setProductName("洗");
        bill.setIsPayment(2);
        bill.setProviderId(13);
        List<Bill> billList = billMapper.getBillList(bill);
        System.out.println(billList.get(0));

    }



    @After
    public void after(){

        MyBatisUtil.closeSqlSession(sqlSession);
    }
}
