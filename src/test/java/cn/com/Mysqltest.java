package cn.com;


import cn.com.bean.User;
import cn.com.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:springconfig.xml"})
public class Mysqltest {
  @Autowired
  UserDao userDao;
  @Test
  public void test1(){
    int  i =userDao.select_User_Uphone_uPassword(new User(2,"1"));
    System.out.println(i);
  }
}
