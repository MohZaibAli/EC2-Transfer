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
 * ApplicationTokenGenerateRequestDTO
 */

public class ApplicationTokenGenerateRequestDTO {
  @SerializedName("consumerSecret")
  private String consumerSecret = null;

  @SerializedName("validityPeriod")
  private Long validityPeriod = null;

  @SerializedName("scopes")
  private List<String> scopes = null;

  @SerializedName("revokeToken")
  private String revokeToken = null;

  @SerializedName("additionalProperties")
  private Object additionalProperties = null;

  public ApplicationTokenGenerateRequestDTO consumerSecret(String consumerSecret) {
    this.consumerSecret = consumerSecret;
    return this;
  }

   /**
   * Consumer secret of the application
   * @return consumerSecret
  **/
  @ApiModelProperty(value = "Consumer secret of the application")
  public String getConsumerSecret() {
    return consumerSecret;
  }

  public void setConsumerSecret(String consumerSecret) {
    this.consumerSecret = consumerSecret;
  }

  public ApplicationTokenGenerateRequestDTO validityPeriod(Long validityPeriod) {
    this.validityPeriod = validityPeriod;
    return this;
  }

   /**
   * Token validity period
   * @return validityPeriod
  **/
  @ApiModelProperty(value = "Token validity period")
  public Long getValidityPeriod() {
    return validityPeriod;
  }

  public void setValidityPeriod(Long validityPeriod) {
    this.validityPeriod = validityPeriod;
  }

  public ApplicationTokenGenerateRequestDTO scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public ApplicationTokenGenerateRequestDTO addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * Allowed scopes (space seperated) for the access token
   * @return scopes
  **/
  @ApiModelProperty(value = "Allowed scopes (space seperated) for the access token")
  public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }

  public ApplicationTokenGenerateRequestDTO revokeToken(String revokeToken) {
    this.revokeToken = revokeToken;
    return this;
  }

   /**
   * Token to be revoked, if any
   * @return revokeToken
  **/
  @ApiModelProperty(value = "Token to be revoked, if any")
  public String getRevokeToken() {
    return revokeToken;
  }

  public void setRevokeToken(String revokeToken) {
    this.revokeToken = revokeToken;
  }

  public ApplicationTokenGenerateRequestDTO additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

   /**
   * Additional parameters if Authorization server needs any
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "Additional parameters if Authorization server needs any")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationTokenGenerateRequestDTO applicationTokenGenerateRequest = (ApplicationTokenGenerateRequestDTO) o;
    return Objects.equals(this.consumerSecret, applicationTokenGenerateRequest.consumerSecret) &&
        Objects.equals(this.validityPeriod, applicationTokenGenerateRequest.validityPeriod) &&
        Objects.equals(this.scopes, applicationTokenGenerateRequest.scopes) &&
        Objects.equals(this.revokeToken, applicationTokenGenerateRequest.revokeToken) &&
        Objects.equals(this.additionalProperties, applicationTokenGenerateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerSecret, validityPeriod, scopes, revokeToken, additionalProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationTokenGenerateRequestDTO {\n");
    
    sb.append("    consumerSecret: ").append(toIndentedString(consumerSecret)).append("\n");
    sb.append("    validityPeriod: ").append(toIndentedString(validityPeriod)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    revokeToken: ").append(toIndentedString(revokeToken)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

