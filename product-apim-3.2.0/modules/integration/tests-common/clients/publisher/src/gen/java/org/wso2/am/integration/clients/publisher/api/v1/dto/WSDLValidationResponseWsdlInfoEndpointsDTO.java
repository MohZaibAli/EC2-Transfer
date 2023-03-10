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
 * WSDLValidationResponseWsdlInfoEndpointsDTO
 */

public class WSDLValidationResponseWsdlInfoEndpointsDTO {
  @SerializedName("name")
  private String name = null;

  @SerializedName("location")
  private String location = null;

  public WSDLValidationResponseWsdlInfoEndpointsDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the endpoint
   * @return name
  **/
  @ApiModelProperty(example = "StockQuoteSoap", value = "Name of the endpoint")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WSDLValidationResponseWsdlInfoEndpointsDTO location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Endpoint URL
   * @return location
  **/
  @ApiModelProperty(example = "http://www.webservicex.net/stockquote.asmx", value = "Endpoint URL")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WSDLValidationResponseWsdlInfoEndpointsDTO wsDLValidationResponseWsdlInfoEndpoints = (WSDLValidationResponseWsdlInfoEndpointsDTO) o;
    return Objects.equals(this.name, wsDLValidationResponseWsdlInfoEndpoints.name) &&
        Objects.equals(this.location, wsDLValidationResponseWsdlInfoEndpoints.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WSDLValidationResponseWsdlInfoEndpointsDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

