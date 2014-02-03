package com.osbook.chapter3recipe2.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.osbook.chapter3recipe2.service.BoilerpipeContentExtractionService;
import com.osbook.chapter3recipe2.service.Content;

@Path("/extract")
public class ContentExtractionResource {

    @Inject
    private BoilerpipeContentExtractionService boilerpipeContentExtractionService;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public Content extractContent(@QueryParam("url") String url) {
        return boilerpipeContentExtractionService.content(url);
    }
}
