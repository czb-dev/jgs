package util;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created with IDEA
 * author:bdqn kgc zhou qi chao
 * Date:2019/8/29
 * Time:14:08
 */
public class MyBatisUtil {

    private static SqlSessionFactory sqlSessionFactory;

    static {//静态代码块，只会加载一次

        InputStream inputStream = MyBatisUtil.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    public static SqlSession getSqlSession(){

        return sqlSessionFactory.openSession(false);//true，自动提交
    }

    public static void closeSqlSession(SqlSession sqlSession){
        if(sqlSession != null){
            sqlSession.close();
        }
    }
}
