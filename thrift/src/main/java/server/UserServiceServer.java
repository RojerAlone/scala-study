package server;

import cn.rojeralone.thrift.UserService;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

/**
 * Created by RojerAlone on 2017-11-12
 */
public class UserServiceServer {

    private static final int PORT = 8888;

    public static void main(String[] args) {
        try {
            TServerSocket socket = new TServerSocket(PORT); // 设置 thrift 服务监听端口
            TBinaryProtocol.Factory factory = new TBinaryProtocol.Factory(); // 协议工厂
            TProcessor processor = new UserService.Processor(new UserServiceImpl()); // 绑定服务的实现
            TServer server = new TThreadPoolServer(processor, socket, factory); // 创建服务器对象
            System.out.println("thrift server start on port : " + PORT);
            server.serve(); // 开启服务
        } catch (TTransportException e) {
            e.printStackTrace();
        }
    }

}
