package com.ofir.server.filter;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;

import javax.inject.Named;
import javax.ws.rs.ext.Provider;

@Named
@Provider
public class AnotherFilterExample implements ContainerRequestFilter {
    @Override
    public ContainerRequest filter(ContainerRequest request) {
        return request;
    }
}
