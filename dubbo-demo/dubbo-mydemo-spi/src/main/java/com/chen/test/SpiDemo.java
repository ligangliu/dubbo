package com.chen.test;

import com.chen.spi.CarDemo;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author liu
 * @Date 2019-11-01 13:17
 */
public class SpiDemo {

    public static void main(String[] args) {
        /**
         * ExtensionLoader.getExtensionLoader 就是为该接口new 一个ExtensionLoader，然后缓存起来
         */
        ExtensionLoader<CarDemo> extensionLoader =
                ExtensionLoader.getExtensionLoader(CarDemo.class);
        Map<String ,String > map = new HashMap<>();
        map.put("car","red");
        URL url = new URL("","",1,map);
        CarDemo red = extensionLoader.getExtension("benz");
        red.sayHello(url);
    }

}
