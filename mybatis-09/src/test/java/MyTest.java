import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);

        sqlSession.close();

        System.out.println("================");

        User user2 = mapper2.queryUserById(1);

        User user3 = mapper2.queryUserById(2);

        System.out.println(user2);
        System.out.println(user3);

//        //mapper.updateUser(new User(2,"aaaa","bbbb"));
//
//        //sqlSession.clearCache();//手动清理缓存
//
//        System.out.println("================");
//
//        User user1 = mapper.queryUserById(1);
//        System.out.println(user1);
//
//        System.out.println(user1==user);

        User user4 = mapper2.queryUserById(2);

        System.out.println(user4);

        sqlSession2.close();
    }
}
