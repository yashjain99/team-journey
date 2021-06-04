package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.TeamApiService;
import io.swagger.api.factories.TeamApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

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

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/team")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-06-04T13:24:38.095Z[GMT]")public class TeamApi  {
   private final TeamApiService delegate;

   public TeamApi(@Context ServletConfig servletContext) {
      TeamApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("TeamApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (TeamApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = TeamApiServiceFactory.getTeamApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Create Team", description = "Use this API to create a new team. Can be called from the Sales Manager Web App.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "Team Journey" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Successfully created team", content = @Content(schema = @Schema(implementation = CreateTeam.class))),
        
        @ApiResponse(responseCode = "400", description = "Organization Id or Owner Id is null or not of type Integer / Team name is null or not of type String"),
        
        @ApiResponse(responseCode = "403", description = "Auth token invalid / Auth token holder is not authorized"),
        
        @ApiResponse(responseCode = "401", description = "Auth token not supplied"),
        
        @ApiResponse(responseCode = "404", description = "Not found") })
    public Response createTeam(@Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true) Body body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createTeam(body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Delete Team", description = "Use this API to delete the team. Can be called from the Sales Manager Web App.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "Team Journey" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successfully deleted team", content = @Content(schema = @Schema(implementation = DeleteTeam.class))),
        
        @ApiResponse(responseCode = "400", description = "Team Id is null or not of type Integer"),
        
        @ApiResponse(responseCode = "401", description = "Auth token not supplied"),
        
        @ApiResponse(responseCode = "403", description = "Auth token invalid/Auth token holder is not authorized"),
        
        @ApiResponse(responseCode = "404", description = "Team Not Found") })
    public Response deleteTeam(@Parameter(in = ParameterIn.PATH, description = "Provide the Team Id",required=true) @PathParam("id") Integer id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteTeam(id,securityContext);
    }
    @GET
    @Path("/organization/{orgId}")
    
    @Produces({ "application/json" })
    @Operation(summary = "List all Teams of organization", description = "Use this API to get all teams / search teams in an organization. Can be called from the Sales Manager Web App.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "Team Journey" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successfully listing teams", content = @Content(schema = @Schema(implementation = TeamList.class))),
        
        @ApiResponse(responseCode = "400", description = "Organization Id is null or not of type Integer"),
        
        @ApiResponse(responseCode = "403", description = "Auth token invalid / Auth token holder is not authorized"),
        
        @ApiResponse(responseCode = "401", description = "Auth token not supplied"),
        
        @ApiResponse(responseCode = "404", description = "Team not found") })
    public Response listTeam(@Parameter(in = ParameterIn.PATH, description = "Pass the organization Id",required=true) @PathParam("orgId") Integer orgId
,@Parameter(in = ParameterIn.QUERY, description = "Pass an optional search query") @QueryParam("search") String search
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listTeam(orgId,search,securityContext);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Team by Id", description = "Use this API to get a team by Id. Can be called from the Sales Manager Web App.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "Team Journey" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successfully found team", content = @Content(schema = @Schema(implementation = TeamById.class))),
        
        @ApiResponse(responseCode = "400", description = "Team Id is null or not of type Integer"),
        
        @ApiResponse(responseCode = "403", description = "Auth token invalid / Auth token holder is not authorized"),
        
        @ApiResponse(responseCode = "401", description = "Auth token not supplied"),
        
        @ApiResponse(responseCode = "404", description = "Team not found") })
    public Response teamById(@Parameter(in = ParameterIn.PATH, description = "Pass the team Id",required=true) @PathParam("id") Integer id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.teamById(id,securityContext);
    }
    @POST
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Edit / Update Team Details", description = "Use this API to edit / update team details such as addition / deletion of team members, edit team name and description and assign / re-assign team owner. Can be called from the Sales Manager Web App.", security = {
        @SecurityRequirement(name = "bearerAuth")    }, tags={ "Team Journey" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successfully updated team", content = @Content(schema = @Schema(implementation = UpdateTeamDetails.class))),
        
        @ApiResponse(responseCode = "400", description = "Team Id or Owner Id is null or not of type Integer / Team name is null or not of type String"),
        
        @ApiResponse(responseCode = "403", description = "Auth token invalid / Auth token holder is not authorized"),
        
        @ApiResponse(responseCode = "401", description = "Auth token not supplied"),
        
        @ApiResponse(responseCode = "404", description = "Team not found") })
    public Response updateTeamDetails(@Parameter(in = ParameterIn.DEFAULT, description = "" ,required=true) Body1 body

,@Parameter(in = ParameterIn.PATH, description = "Provide the Team Id",required=true) @PathParam("id") Integer id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateTeamDetails(body,id,securityContext);
    }
}
