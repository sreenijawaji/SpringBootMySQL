package com.jsr.SpringBootMySQL.BeanProcessor;

import com.jsr.SpringBootMySQL.pojo.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.security.auth.callback.PasswordCallback;

@Component
public class PasswordValidationBeanPostProcessor implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        if(bean instanceof User user){
//            if(!isValidPassword(user.getPassword())){
//
//            }
//        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }



    private boolean isValidPassword(String password){
        return password.length() >=8 && password.matches(".*[@#$%!].*");
    }

}
