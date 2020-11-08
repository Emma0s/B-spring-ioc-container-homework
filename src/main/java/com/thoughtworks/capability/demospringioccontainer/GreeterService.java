package com.thoughtworks.capability.demospringioccontainer;

import java.util.Date;

public class GreeterService {
    public GreeterService() {
        System.out.println(new Date());
    }
    String sayHi(){
        return "hello world";
    }
}
