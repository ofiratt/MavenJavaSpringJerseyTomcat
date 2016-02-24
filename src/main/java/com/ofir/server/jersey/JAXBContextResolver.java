package com.ofir.server.jersey;

import javax.inject.Named;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;

import com.ofir.server.data.Been;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.api.json.JSONJAXBContext;


@Named
@Provider
@Produces(MediaType.APPLICATION_JSON)
public class JAXBContextResolver implements ContextResolver<JAXBContext> {

    private final JAXBContext context;
    private Class[] types = {Been.class};

    public JAXBContextResolver() throws Exception {
        this.context = new JSONJAXBContext(JSONConfiguration.natural().build(), types);
    }
    public JAXBContext getContext(Class<?> objectType) {
        for (Class clazz : types) {
            if (clazz.equals(objectType)) {
                return context;
            }
        }

        return null;
    }
}