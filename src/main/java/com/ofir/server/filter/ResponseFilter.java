package com.ofir.server.filter;

import com.sun.jersey.spi.container.ContainerResponseFilter;


import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerResponse;

import javax.ws.rs.ext.Provider;

@Provider
public class ResponseFilter implements ContainerResponseFilter {

    public ContainerResponse filter(ContainerRequest creq,
                                    ContainerResponse cresp) {

        cresp.getHttpHeaders().putSingle("token", "some token"); //creq.getHeaderValue("token")

        return cresp;
    }

}