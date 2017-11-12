namespace java cn.rojeralone.thrift

const i32 value = 1024 # 常量用　const 表示

struct User { # 结构体用　struct 表示，相当于 Java 中的 bean
    1: string name
    2: i32 age
}

service UserService { // service 定义服务接口
    User get();
    void sayHello(1: string name);
}