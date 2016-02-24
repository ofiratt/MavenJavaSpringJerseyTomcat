package com.ofir.server.data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by ofira on 24-Feb-16.
 */
@XmlRootElement
public class Been {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
