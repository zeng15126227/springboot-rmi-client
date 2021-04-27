package com.example.springbootrmiclient.Config;

import com.example.springbootrmiclient.Service.ShellService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@Configuration
public class RMIClient {
    @Bean(name="shellService")
    public RmiProxyFactoryBean getService(){
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceUrl("rmi://172.16.21.73:9099/shellService");
        rmiProxyFactoryBean.setServiceInterface(ShellService.class);
        return rmiProxyFactoryBean;
    }
}
