package com.yimint.common.interfaces;

import com.yimint.common.domain.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("test")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML}) // #2
@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
public interface TestService {
    @GET // #3
    @Path("{id: \\d+}")
    public User getUser(@PathParam("id") String uId);
}
