package com.ofir.server.controller;

import javax.inject.Named;


@Named
public class GetTextController {



    public String getData(String name){
        return "your name is: "+ name;
    }
}
