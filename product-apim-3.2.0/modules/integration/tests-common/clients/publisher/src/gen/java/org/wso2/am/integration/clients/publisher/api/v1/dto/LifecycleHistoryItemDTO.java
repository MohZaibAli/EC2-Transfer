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
 * LifecycleHistoryItemDTO
 */

public class LifecycleHistoryItemDTO {
  @SerializedName("previousState")
  private String previousState = null;

  @SerializedName("postState")
  private String postState = null;

  @SerializedName("user")
  private String user = null;

  @SerializedName("updatedTime")
  private String updatedTime = null;

  public LifecycleHistoryItemDTO previousState(String previousState) {
    this.previousState = previousState;
    return this;
  }

   /**
   * Get previousState
   * @return previousState
  **/
  @ApiModelProperty(example = "Created", value = "")
  public String getPreviousState() {
    return previousState;
  }

  public void setPreviousState(String previousState) {
    this.previousState = previousState;
  }

  public LifecycleHistoryItemDTO postState(String postState) {
    this.postState = postState;
    return this;
  }

   /**
   * Get postState
   * @return postState
  **/
  @ApiModelProperty(example = "Published", value = "")
  public String getPostState() {
    return postState;
  }

  public void setPostState(String postState) {
    this.postState = postState;
  }

  public LifecycleHistoryItemDTO user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(example = "admin", value = "")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public LifecycleHistoryItemDTO updatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

   /**
   * Get updatedTime
   * @return updatedTime
  **/
  @ApiModelProperty(example = "2019-02-31T23:59:60Z", value = "")
  public String getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LifecycleHistoryItemDTO lifecycleHistoryItem = (LifecycleHistoryItemDTO) o;
    return Objects.equals(this.previousState, lifecycleHistoryItem.previousState) &&
        Objects.equals(this.postState, lifecycleHistoryItem.postState) &&
        Objects.equals(this.user, lifecycleHistoryItem.user) &&
        Objects.equals(this.updatedTime, lifecycleHistoryItem.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previousState, postState, user, updatedTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LifecycleHistoryItemDTO {\n");
    
    sb.append("    previousState: ").append(toIndentedString(previousState)).append("\n");
    sb.append("    postState: ").append(toIndentedString(postState)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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

