package io.swagger.api.factories;

import io.swagger.api.TeamApiService;
import io.swagger.api.impl.TeamApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-06-04T13:25:37.333Z[GMT]")public class TeamApiServiceFactory {
    private final static TeamApiService service = new TeamApiServiceImpl();

    public static TeamApiService getTeamApi() {
        return service;
    }
}
