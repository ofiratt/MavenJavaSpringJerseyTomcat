package com.ofir.server.api;

import com.ofir.server.controller.GetTextController;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Named
@Path("/getText")
public class GetTextAPI{

    @Inject
    GetTextController commentController;

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getComment(@QueryParam("name") String name){

        return Response.ok(commentController.getData(name)).build();
    }
}
