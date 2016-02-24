package com.ofir.server.filter;

import javax.inject.Named;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.Provider;

import com.sun.jersey.core.header.InBoundHeaders;
import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.StringWriter;

@Provider
@Named
public class SecurityFilter implements ContainerRequestFilter {

    @Override
    public ContainerRequest filter(ContainerRequest request) {
        String token = request.getHeaderValue("token");

        request.setHeaders(getHeadersData(request,token));

        return request;
    }

    private InBoundHeaders getHeadersData(ContainerRequest request,String token) {
        InBoundHeaders headers = new InBoundHeaders();

        if (request.getHeaderValue("content-length") != null) {
            headers.add("content-length", request.getHeaderValue("content-length"));
        }
        headers.add("content-type", request.getHeaderValue("content-type"));
        headers.add("connection", request.getHeaderValue("connection"));
        headers.add("user-agent", request.getHeaderValue("user-agent"));
        headers.add("accept-encoding", request.getHeaderValue("accept-encoding"));
        headers.add("host", request.getHeaderValue("host"));
        return headers;
    }
    private void throwUnauthorizedException() throws WebApplicationException {
        //TODO add user blocked to the log
        ResponseBuilder builder = null;
        String response = "User Blocked";
        builder = Response.status(Response.Status.UNAUTHORIZED).entity(response);
        throw new WebApplicationException(builder.build());
    }

    private String getBody(ContainerRequest req) {
        try {
            StringWriter writer = new StringWriter();
            IOUtils.copy(req.getEntityInputStream(), writer, "UTF-8");
            return writer.toString();
        } catch (IOException e) {
        }
        return null;
    }
}
