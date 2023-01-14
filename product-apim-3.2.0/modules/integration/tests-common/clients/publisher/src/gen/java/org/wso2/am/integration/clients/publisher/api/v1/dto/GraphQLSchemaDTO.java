/*
 * 0CodeAPI Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.1
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.publisher.api.v1.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GraphQLSchemaDTO
 */

public class GraphQLSchemaDTO {
  @SerializedName("name")
  private String name = null;

  @SerializedName("schemaDefinition")
  private String schemaDefinition = null;

  public GraphQLSchemaDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "admin--HackerNewsAPI.graphql", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GraphQLSchemaDTO schemaDefinition(String schemaDefinition) {
    this.schemaDefinition = schemaDefinition;
    return this;
  }

   /**
   * Get schemaDefinition
   * @return schemaDefinition
  **/
  @ApiModelProperty(value = "")
  public String getSchemaDefinition() {
    return schemaDefinition;
  }

  public void setSchemaDefinition(String schemaDefinition) {
    this.schemaDefinition = schemaDefinition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphQLSchemaDTO graphQLSchema = (GraphQLSchemaDTO) o;
    return Objects.equals(this.name, graphQLSchema.name) &&
        Objects.equals(this.schemaDefinition, graphQLSchema.schemaDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, schemaDefinition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphQLSchemaDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    schemaDefinition: ").append(toIndentedString(schemaDefinition)).append("\n");
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

