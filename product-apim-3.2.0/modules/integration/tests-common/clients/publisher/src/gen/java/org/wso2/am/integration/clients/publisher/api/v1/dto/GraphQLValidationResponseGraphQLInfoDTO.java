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
import java.util.ArrayList;
import java.util.List;
import org.wso2.am.integration.clients.publisher.api.v1.dto.APIOperationsDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.GraphQLSchemaDTO;

/**
 * Summary of the GraphQL including the basic information
 */
@ApiModel(description = "Summary of the GraphQL including the basic information")

public class GraphQLValidationResponseGraphQLInfoDTO {
  @SerializedName("operations")
  private List<APIOperationsDTO> operations = null;

  @SerializedName("graphQLSchema")
  private GraphQLSchemaDTO graphQLSchema = null;

  public GraphQLValidationResponseGraphQLInfoDTO operations(List<APIOperationsDTO> operations) {
    this.operations = operations;
    return this;
  }

  public GraphQLValidationResponseGraphQLInfoDTO addOperationsItem(APIOperationsDTO operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<>();
    }
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * Get operations
   * @return operations
  **/
  @ApiModelProperty(value = "")
  public List<APIOperationsDTO> getOperations() {
    return operations;
  }

  public void setOperations(List<APIOperationsDTO> operations) {
    this.operations = operations;
  }

  public GraphQLValidationResponseGraphQLInfoDTO graphQLSchema(GraphQLSchemaDTO graphQLSchema) {
    this.graphQLSchema = graphQLSchema;
    return this;
  }

   /**
   * Get graphQLSchema
   * @return graphQLSchema
  **/
  @ApiModelProperty(value = "")
  public GraphQLSchemaDTO getGraphQLSchema() {
    return graphQLSchema;
  }

  public void setGraphQLSchema(GraphQLSchemaDTO graphQLSchema) {
    this.graphQLSchema = graphQLSchema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphQLValidationResponseGraphQLInfoDTO graphQLValidationResponseGraphQLInfo = (GraphQLValidationResponseGraphQLInfoDTO) o;
    return Objects.equals(this.operations, graphQLValidationResponseGraphQLInfo.operations) &&
        Objects.equals(this.graphQLSchema, graphQLValidationResponseGraphQLInfo.graphQLSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operations, graphQLSchema);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphQLValidationResponseGraphQLInfoDTO {\n");
    
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    graphQLSchema: ").append(toIndentedString(graphQLSchema)).append("\n");
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

