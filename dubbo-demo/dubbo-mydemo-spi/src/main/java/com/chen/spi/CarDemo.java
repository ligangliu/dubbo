package com.chen.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @Author liu
 * @Date 2019-11-01 12:39
 */
@SPI
public interface CarDemo {
    @Adaptive("car")
    void sayHello(URL url);
}
