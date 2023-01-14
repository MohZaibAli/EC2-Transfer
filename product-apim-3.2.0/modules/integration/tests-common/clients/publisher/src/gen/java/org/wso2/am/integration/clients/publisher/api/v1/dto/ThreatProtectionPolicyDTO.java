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
 * ThreatProtectionPolicyDTO
 */

public class ThreatProtectionPolicyDTO {
  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("policy")
  private String policy = null;

  public ThreatProtectionPolicyDTO uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Policy ID
   * @return uuid
  **/
  @ApiModelProperty(value = "Policy ID")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public ThreatProtectionPolicyDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the policy
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the policy")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ThreatProtectionPolicyDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the policy
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of the policy")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ThreatProtectionPolicyDTO policy(String policy) {
    this.policy = policy;
    return this;
  }

   /**
   * policy as a json string
   * @return policy
  **/
  @ApiModelProperty(required = true, value = "policy as a json string")
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreatProtectionPolicyDTO threatProtectionPolicy = (ThreatProtectionPolicyDTO) o;
    return Objects.equals(this.uuid, threatProtectionPolicy.uuid) &&
        Objects.equals(this.name, threatProtectionPolicy.name) &&
        Objects.equals(this.type, threatProtectionPolicy.type) &&
        Objects.equals(this.policy, threatProtectionPolicy.policy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, type, policy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreatProtectionPolicyDTO {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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

