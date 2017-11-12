package server;

import cn.rojeralone.thrift.User;
import cn.rojeralone.thrift.UserService;
import org.apache.thrift.TException;

/**
 * Created by zhangrenjie on 2017-11-12
 */
public class UserServiceImpl implements UserService.Iface{

    private static User user = new User();
    static {
        user.setName("RojerAlone");
        user.setAge(21);
    }

    public User get() throws TException {
        return user;
    }

    public void sayHello(String name) throws TException {
        System.out.println("hello " + name);
    }

}
