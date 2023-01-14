/*
 * 0CodeAPI Manager - Admin
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Admin Portal. Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.5.176/components/apimgt/org.wso2.carbon.apimgt.rest.api.admin/src/main/resources/admin-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.2
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.admin.api.dto;

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
import org.wso2.am.integration.clients.admin.api.dto.ThrottleLimitDTO;
import org.wso2.am.integration.clients.admin.api.dto.ThrottlePolicyDTO;

/**
 * ApplicationThrottlePolicyDTO
 */

public class ApplicationThrottlePolicyDTO {
  @SerializedName("policyId")
  private String policyId = null;

  @SerializedName("policyName")
  private String policyName = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("isDeployed")
  private Boolean isDeployed = false;

  @SerializedName("defaultLimit")
  private ThrottleLimitDTO defaultLimit = null;

  public ApplicationThrottlePolicyDTO policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * Id of policy
   * @return policyId
  **/
  @ApiModelProperty(example = "0c6439fd-9b16-3c2e-be6e-1086e0b9aa93", value = "Id of policy")
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  public ApplicationThrottlePolicyDTO policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

   /**
   * Name of policy
   * @return policyName
  **/
  @ApiModelProperty(example = "Policy1", required = true, value = "Name of policy")
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  public ApplicationThrottlePolicyDTO displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of the policy
   * @return displayName
  **/
  @ApiModelProperty(value = "Display name of the policy")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ApplicationThrottlePolicyDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the policy
   * @return description
  **/
  @ApiModelProperty(value = "Description of the policy")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ApplicationThrottlePolicyDTO isDeployed(Boolean isDeployed) {
    this.isDeployed = isDeployed;
    return this;
  }

   /**
   * Indicates whether the policy is deployed successfully or not.
   * @return isDeployed
  **/
  @ApiModelProperty(value = "Indicates whether the policy is deployed successfully or not.")
  public Boolean isIsDeployed() {
    return isDeployed;
  }

  public void setIsDeployed(Boolean isDeployed) {
    this.isDeployed = isDeployed;
  }

  public ApplicationThrottlePolicyDTO defaultLimit(ThrottleLimitDTO defaultLimit) {
    this.defaultLimit = defaultLimit;
    return this;
  }

   /**
   * Get defaultLimit
   * @return defaultLimit
  **/
  @ApiModelProperty(required = true, value = "")
  public ThrottleLimitDTO getDefaultLimit() {
    return defaultLimit;
  }

  public void setDefaultLimit(ThrottleLimitDTO defaultLimit) {
    this.defaultLimit = defaultLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationThrottlePolicyDTO applicationThrottlePolicy = (ApplicationThrottlePolicyDTO) o;
    return Objects.equals(this.policyId, applicationThrottlePolicy.policyId) &&
        Objects.equals(this.policyName, applicationThrottlePolicy.policyName) &&
        Objects.equals(this.displayName, applicationThrottlePolicy.displayName) &&
        Objects.equals(this.description, applicationThrottlePolicy.description) &&
        Objects.equals(this.isDeployed, applicationThrottlePolicy.isDeployed) &&
        Objects.equals(this.defaultLimit, applicationThrottlePolicy.defaultLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId, policyName, displayName, description, isDeployed, defaultLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationThrottlePolicyDTO {\n");
    
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isDeployed: ").append(toIndentedString(isDeployed)).append("\n");
    sb.append("    defaultLimit: ").append(toIndentedString(defaultLimit)).append("\n");
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

