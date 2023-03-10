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

/**
 * WorkflowInfoDTO
 */

public class WorkflowInfoDTO {
  /**
   * Type of the Workflow Request. It shows which type of request is it. 
   */
  @JsonAdapter(WorkflowTypeEnum.Adapter.class)
  public enum WorkflowTypeEnum {
    APPLICATION_CREATION("APPLICATION_CREATION"),
    
    SUBSCRIPTION_CREATION("SUBSCRIPTION_CREATION"),
    
    USER_SIGNUP("USER_SIGNUP"),
    
    APPLICATION_REGISTRATION_PRODUCTION("APPLICATION_REGISTRATION_PRODUCTION"),
    
    APPLICATION_REGISTRATION_SANDBOX("APPLICATION_REGISTRATION_SANDBOX"),
    
    APPLICATION_DELETION("APPLICATION_DELETION"),
    
    API_STATE("API_STATE"),
    
    SUBSCRIPTION_DELETION("SUBSCRIPTION_DELETION"),
    
    SUBSCRIPTION_UPDATE("SUBSCRIPTION_UPDATE");

    private String value;

    WorkflowTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WorkflowTypeEnum fromValue(String text) {
      for (WorkflowTypeEnum b : WorkflowTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WorkflowTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WorkflowTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WorkflowTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WorkflowTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("workflowType")
  private WorkflowTypeEnum workflowType = null;

  /**
   * Show the Status of the the workflow request whether it is approved or created. 
   */
  @JsonAdapter(WorkflowStatusEnum.Adapter.class)
  public enum WorkflowStatusEnum {
    APPROVED("APPROVED"),
    
    CREATED("CREATED");

    private String value;

    WorkflowStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WorkflowStatusEnum fromValue(String text) {
      for (WorkflowStatusEnum b : WorkflowStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WorkflowStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WorkflowStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WorkflowStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WorkflowStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("workflowStatus")
  private WorkflowStatusEnum workflowStatus = null;

  @SerializedName("createdTime")
  private String createdTime = null;

  @SerializedName("updatedTime")
  private String updatedTime = null;

  @SerializedName("referenceId")
  private String referenceId = null;

  @SerializedName("properties")
  private Object properties = null;

  @SerializedName("description")
  private String description = null;

  public WorkflowInfoDTO workflowType(WorkflowTypeEnum workflowType) {
    this.workflowType = workflowType;
    return this;
  }

   /**
   * Type of the Workflow Request. It shows which type of request is it. 
   * @return workflowType
  **/
  @ApiModelProperty(example = "APPLICATION_CREATION", value = "Type of the Workflow Request. It shows which type of request is it. ")
  public WorkflowTypeEnum getWorkflowType() {
    return workflowType;
  }

  public void setWorkflowType(WorkflowTypeEnum workflowType) {
    this.workflowType = workflowType;
  }

  public WorkflowInfoDTO workflowStatus(WorkflowStatusEnum workflowStatus) {
    this.workflowStatus = workflowStatus;
    return this;
  }

   /**
   * Show the Status of the the workflow request whether it is approved or created. 
   * @return workflowStatus
  **/
  @ApiModelProperty(example = "APPROVED", value = "Show the Status of the the workflow request whether it is approved or created. ")
  public WorkflowStatusEnum getWorkflowStatus() {
    return workflowStatus;
  }

  public void setWorkflowStatus(WorkflowStatusEnum workflowStatus) {
    this.workflowStatus = workflowStatus;
  }

  public WorkflowInfoDTO createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Time of the the workflow request created. 
   * @return createdTime
  **/
  @ApiModelProperty(example = "2020-02-10 10:10:19.704", value = "Time of the the workflow request created. ")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  public WorkflowInfoDTO updatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

   /**
   * Time of the the workflow request updated. 
   * @return updatedTime
  **/
  @ApiModelProperty(example = "2020-02-10 10:10:19.704", value = "Time of the the workflow request updated. ")
  public String getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
  }

  public WorkflowInfoDTO referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Workflow external reference is used to identify the workflow requests uniquely. 
   * @return referenceId
  **/
  @ApiModelProperty(example = "5871244b-d6f3-466e-8995-8accd1e64303", value = "Workflow external reference is used to identify the workflow requests uniquely. ")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public WorkflowInfoDTO properties(Object properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public Object getProperties() {
    return properties;
  }

  public void setProperties(Object properties) {
    this.properties = properties;
  }

  public WorkflowInfoDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description is a message with basic details about the workflow request. 
   * @return description
  **/
  @ApiModelProperty(example = "Approve application [APP1] creation request from application creator - admin with throttling tier - 10MinPer", value = "description is a message with basic details about the workflow request. ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowInfoDTO workflowInfo = (WorkflowInfoDTO) o;
    return Objects.equals(this.workflowType, workflowInfo.workflowType) &&
        Objects.equals(this.workflowStatus, workflowInfo.workflowStatus) &&
        Objects.equals(this.createdTime, workflowInfo.createdTime) &&
        Objects.equals(this.updatedTime, workflowInfo.updatedTime) &&
        Objects.equals(this.referenceId, workflowInfo.referenceId) &&
        Objects.equals(this.properties, workflowInfo.properties) &&
        Objects.equals(this.description, workflowInfo.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowType, workflowStatus, createdTime, updatedTime, referenceId, properties, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowInfoDTO {\n");
    
    sb.append("    workflowType: ").append(toIndentedString(workflowType)).append("\n");
    sb.append("    workflowStatus: ").append(toIndentedString(workflowStatus)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

