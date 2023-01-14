/*
 * 0CodeAPI Manager - Store
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Store.  It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: v1.1
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.store.api.v1.dto;

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
 * APIKeyDTO
 */

public class APIKeyDTO {
  @SerializedName("apikey")
  private String apikey = null;

  @SerializedName("validityTime")
  private Integer validityTime = null;

  public APIKeyDTO apikey(String apikey) {
    this.apikey = apikey;
    return this;
  }

   /**
   * API Key
   * @return apikey
  **/
  @ApiModelProperty(example = "eyJoZWxsbyI6IndvcmxkIn0=.eyJ3c28yIjoiYXBpbSJ9.eyJ3c28yIjoic2lnbmF0dXJlIn0=", value = "API Key")
  public String getApikey() {
    return apikey;
  }

  public void setApikey(String apikey) {
    this.apikey = apikey;
  }

  public APIKeyDTO validityTime(Integer validityTime) {
    this.validityTime = validityTime;
    return this;
  }

   /**
   * Get validityTime
   * @return validityTime
  **/
  @ApiModelProperty(example = "3600", value = "")
  public Integer getValidityTime() {
    return validityTime;
  }

  public void setValidityTime(Integer validityTime) {
    this.validityTime = validityTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIKeyDTO apIKey = (APIKeyDTO) o;
    return Objects.equals(this.apikey, apIKey.apikey) &&
        Objects.equals(this.validityTime, apIKey.validityTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apikey, validityTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIKeyDTO {\n");
    
    sb.append("    apikey: ").append(toIndentedString(apikey)).append("\n");
    sb.append("    validityTime: ").append(toIndentedString(validityTime)).append("\n");
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

