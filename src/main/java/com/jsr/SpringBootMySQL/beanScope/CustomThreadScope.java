package com.jsr.SpringBootMySQL.beanScope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;

public class CustomThreadScope implements Scope {

    CustomThreadLocal customThreadLocal = new CustomThreadLocal();

    public CustomThreadScope(){
        System.out.println("BeanScopeTestService() instance created");
    }


    @Override
    public Object get(String s, ObjectFactory<?> objectFactory) {
        return null;
    }

    @Override
    public Object remove(String s) {
        return null;
    }

    @Override
    public void registerDestructionCallback(String s, Runnable runnable) {

    }

    @Override
    public Object resolveContextualObject(String s) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }

    class CustomThreadLocal extends ThreadLocal {
        protected Map<String, Object> initialValue(){
            System.out.println("Initializing Threadlocal");
            return new HashMap<String, Object>();
        }
    }
}
