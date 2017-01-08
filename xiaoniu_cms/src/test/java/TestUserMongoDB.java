import com.xiaoniu.cms.dao.UserDao;
import com.xiaoniu.cms.model.vo.User;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by wzyoung on 2017/1/8.
 */
public class TestUserMongoDB {

    private static UserDao userDaoImpl;
    private static String collectionName;

    @BeforeClass
    public static void initSpring() {
        try {
            ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(
                    new String[]{"classpath:spring/applicationContext.xml", "classpath:spring/dispatchServlet-servlet.xml"});
            userDaoImpl = (UserDao) app.getBean("userDaoImpl");
            collectionName = "users_test";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAdd() {

        userDaoImpl.dropCollection(collectionName);

        //添加一百个user
        for (int i = 1; i < 100; i++) {
            User user = new User();
            user.setId("" + i);
            user.setAge(i);
            user.setName("zcy" + i);
            user.setPassword("zcy" + i);
            userDaoImpl.insert(user, collectionName);
        }

        List<User> list = userDaoImpl.findAll(User.class, collectionName);
//        Map<String, Object> params = new HashMap<>();
//        params.put("maxAge", 10000);
//        List<User> list = userDaoImpl.findAll(params, collectionName);
        System.out.println("user.count()==" + list.size());

    }


}
