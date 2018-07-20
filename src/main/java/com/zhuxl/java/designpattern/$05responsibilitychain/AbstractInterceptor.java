package com.zhuxl.java.designpattern.$05responsibilitychain;


public abstract class AbstractInterceptor {
    private String name;

    private AbstractInterceptor nextInterceptor;

    public AbstractInterceptor(String name) {
        this.name = name;
    }

    public abstract void interceptor(RequestContent requestContent);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNextInterceptor(AbstractInterceptor nextInterceptor) {
        this.nextInterceptor = nextInterceptor;
    }

    public AbstractInterceptor getNextInterceptor() {
        return nextInterceptor;
    }


}
