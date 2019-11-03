package com.chen.spi;

import org.apache.dubbo.common.URL;

/**
 * @Author liu
 * @Date 2019-11-01 12:50
 */
public class CarWrapper implements CarDemo {

    private CarDemo carDemo;

    public CarWrapper(CarDemo carDemo) {
        this.carDemo = carDemo;
    }

    @Override
    public void sayHello(URL url) {
        System.out.println("before");
        carDemo.sayHello(url);
        System.out.println("after");
    }
}
