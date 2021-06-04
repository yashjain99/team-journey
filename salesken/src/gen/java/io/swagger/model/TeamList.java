/*
 * Team Management
 * This API is used to perform the CRUD operations on the team database.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: admin@salesken.ai
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Team;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * TeamList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-06-04T13:25:37.333Z[GMT]")public class TeamList   {
  @JsonProperty("responseCode")
  private Integer responseCode = null;

  @JsonProperty("responseMessage")
  private String responseMessage = null;

  @JsonProperty("response")
  private List<Team> response = new ArrayList<Team>();

  public TeamList responseCode(Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  /**
   * Get responseCode
   * @return responseCode
   **/
  @JsonProperty("responseCode")
  @Schema(example = "200", required = true, description = "")
  @NotNull
  public Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  public TeamList responseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
    return this;
  }

  /**
   * Get responseMessage
   * @return responseMessage
   **/
  @JsonProperty("responseMessage")
  @Schema(example = "Successfully listing teams", required = true, description = "")
  @NotNull
  public String getResponseMessage() {
    return responseMessage;
  }

  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }

  public TeamList response(List<Team> response) {
    this.response = response;
    return this;
  }

  public TeamList addResponseItem(Team responseItem) {
    this.response.add(responseItem);
    return this;
  }

  /**
   * Get response
   * @return response
   **/
  @JsonProperty("response")
  @Schema(required = true, description = "")
  @NotNull
  @Valid
  public List<Team> getResponse() {
    return response;
  }

  public void setResponse(List<Team> response) {
    this.response = response;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamList teamList = (TeamList) o;
    return Objects.equals(this.responseCode, teamList.responseCode) &&
        Objects.equals(this.responseMessage, teamList.responseMessage) &&
        Objects.equals(this.response, teamList.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseCode, responseMessage, response);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamList {\n");
    
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
