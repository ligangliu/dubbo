package com.chen.spi;

import org.apache.dubbo.common.URL;

/**
 * @Author liu
 * @Date 2019-11-01 12:52
 */
public class BlackCar implements CarDemo {

    @Override
    public void sayHello(URL url) {
        System.out.println("BlackCar");
    }
}
