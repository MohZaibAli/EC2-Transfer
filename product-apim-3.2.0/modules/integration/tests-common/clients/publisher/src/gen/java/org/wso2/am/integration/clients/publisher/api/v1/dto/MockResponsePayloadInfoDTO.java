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
 * MockResponsePayloadInfoDTO
 */

public class MockResponsePayloadInfoDTO {
  @SerializedName("path")
  private String path = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("verb")
  private String verb = null;

  public MockResponsePayloadInfoDTO path(String path) {
    this.path = path;
    return this;
  }

   /**
   * path of the resource
   * @return path
  **/
  @ApiModelProperty(value = "path of the resource")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public MockResponsePayloadInfoDTO content(String content) {
    this.content = content;
    return this;
  }

   /**
   * new modified code
   * @return content
  **/
  @ApiModelProperty(value = "new modified code")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public MockResponsePayloadInfoDTO verb(String verb) {
    this.verb = verb;
    return this;
  }

   /**
   * Get verb
   * @return verb
  **/
  @ApiModelProperty(value = "")
  public String getVerb() {
    return verb;
  }

  public void setVerb(String verb) {
    this.verb = verb;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MockResponsePayloadInfoDTO mockResponsePayloadInfo = (MockResponsePayloadInfoDTO) o;
    return Objects.equals(this.path, mockResponsePayloadInfo.path) &&
        Objects.equals(this.content, mockResponsePayloadInfo.content) &&
        Objects.equals(this.verb, mockResponsePayloadInfo.verb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, content, verb);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MockResponsePayloadInfoDTO {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
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

