package com.chen.spi;

import org.apache.dubbo.common.URL;

/**
 * @Author liu
 * @Date 2019-11-01 12:51
 */
public class BenzCar implements CarDemo {

    private CarDemo carDemo;

    //自动注入
    public void setCarDemo(CarDemo carDemo) {
        this.carDemo = carDemo;
    }

    @Override
    public void sayHello(URL url) {
        System.out.println("干啥呢");
        carDemo.sayHello(url);
    }
}
