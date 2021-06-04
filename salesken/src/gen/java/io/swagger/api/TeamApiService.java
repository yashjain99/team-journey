package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Body;
import io.swagger.model.Body1;
import io.swagger.model.CreateTeam;
import io.swagger.model.DeleteTeam;
import io.swagger.model.TeamById;
import io.swagger.model.TeamList;
import io.swagger.model.UpdateTeamDetails;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-06-04T13:25:37.333Z[GMT]")public abstract class TeamApiService {
    public abstract Response createTeam(Body body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteTeam(Integer id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listTeam(Integer orgId, String search,SecurityContext securityContext) throws NotFoundException;
    public abstract Response teamById(Integer id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateTeamDetails(Body1 body,Integer id,SecurityContext securityContext) throws NotFoundException;
}
