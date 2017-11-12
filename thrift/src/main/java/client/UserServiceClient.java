package client;

import cn.rojeralone.thrift.User;
import cn.rojeralone.thrift.UserService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * Created by zhangrenjie on 2017-11-12
 */
public class UserServiceClient {

    private static final int PORT = 8888;

    public static void main(String[] args) {
        try {
            TTransport transport = new TSocket("localhost", PORT); // 设置服务位置
            transport.open(); // 开启
            TProtocol protocol = new TBinaryProtocol(transport); // 设置传输协议
            UserService.Client service = new UserService.Client(protocol);
            User user = service.get();
            service.sayHello(user.getName());
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        }
    }

}
