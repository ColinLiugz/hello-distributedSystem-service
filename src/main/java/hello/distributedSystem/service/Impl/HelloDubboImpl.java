package hello.distributedSystem.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import service.HelloDubboFacade;

/**
 * @Author: Colin
 * @Date: 2018/8/5 20:43
 */
@Component("helloDubboFacade")
@Service(version = "1.0.0")
public class HelloDubboImpl implements HelloDubboFacade {

    @Override
    public String sayHello(String name) {
        System.out.println("》》》》》被调用一次《《《《《");
        return "Hello "+name;
    }
}
