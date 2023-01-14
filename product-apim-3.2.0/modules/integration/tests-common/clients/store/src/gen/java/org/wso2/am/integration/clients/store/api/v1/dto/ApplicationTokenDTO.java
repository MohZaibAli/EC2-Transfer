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
import java.util.ArrayList;
import java.util.List;

/**
 * ApplicationTokenDTO
 */

public class ApplicationTokenDTO {
  @SerializedName("accessToken")
  private String accessToken = null;

  @SerializedName("tokenScopes")
  private List<String> tokenScopes = null;

  @SerializedName("validityTime")
  private Long validityTime = null;

  public ApplicationTokenDTO accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Access token
   * @return accessToken
  **/
  @ApiModelProperty(example = "1.2345678901234568E30", value = "Access token")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public ApplicationTokenDTO tokenScopes(List<String> tokenScopes) {
    this.tokenScopes = tokenScopes;
    return this;
  }

  public ApplicationTokenDTO addTokenScopesItem(String tokenScopesItem) {
    if (this.tokenScopes == null) {
      this.tokenScopes = new ArrayList<>();
    }
    this.tokenScopes.add(tokenScopesItem);
    return this;
  }

   /**
   * Valid comma seperated scopes for the access token
   * @return tokenScopes
  **/
  @ApiModelProperty(example = "\"default,read_api,write_api\"", value = "Valid comma seperated scopes for the access token")
  public List<String> getTokenScopes() {
    return tokenScopes;
  }

  public void setTokenScopes(List<String> tokenScopes) {
    this.tokenScopes = tokenScopes;
  }

  public ApplicationTokenDTO validityTime(Long validityTime) {
    this.validityTime = validityTime;
    return this;
  }

   /**
   * Maximum validity time for the access token
   * @return validityTime
  **/
  @ApiModelProperty(example = "3600", value = "Maximum validity time for the access token")
  public Long getValidityTime() {
    return validityTime;
  }

  public void setValidityTime(Long validityTime) {
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
    ApplicationTokenDTO applicationToken = (ApplicationTokenDTO) o;
    return Objects.equals(this.accessToken, applicationToken.accessToken) &&
        Objects.equals(this.tokenScopes, applicationToken.tokenScopes) &&
        Objects.equals(this.validityTime, applicationToken.validityTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, tokenScopes, validityTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationTokenDTO {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenScopes: ").append(toIndentedString(tokenScopes)).append("\n");
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

