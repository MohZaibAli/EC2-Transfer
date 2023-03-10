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
import org.wso2.am.integration.clients.publisher.api.v1.dto.ErrorListItemDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.OpenAPIDefinitionValidationResponseInfoDTO;

/**
 * OpenAPIDefinitionValidationResponseDTO
 */

public class OpenAPIDefinitionValidationResponseDTO {
  @SerializedName("isValid")
  private Boolean isValid = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("info")
  private OpenAPIDefinitionValidationResponseInfoDTO info = null;

  @SerializedName("errors")
  private List<ErrorListItemDTO> errors = null;

  public OpenAPIDefinitionValidationResponseDTO isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

   /**
   * This attribute declares whether this definition is valid or not. 
   * @return isValid
  **/
  @ApiModelProperty(example = "true", required = true, value = "This attribute declares whether this definition is valid or not. ")
  public Boolean isIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  public OpenAPIDefinitionValidationResponseDTO content(String content) {
    this.content = content;
    return this;
  }

   /**
   * OpenAPI definition content. 
   * @return content
  **/
  @ApiModelProperty(value = "OpenAPI definition content. ")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public OpenAPIDefinitionValidationResponseDTO info(OpenAPIDefinitionValidationResponseInfoDTO info) {
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @ApiModelProperty(value = "")
  public OpenAPIDefinitionValidationResponseInfoDTO getInfo() {
    return info;
  }

  public void setInfo(OpenAPIDefinitionValidationResponseInfoDTO info) {
    this.info = info;
  }

  public OpenAPIDefinitionValidationResponseDTO errors(List<ErrorListItemDTO> errors) {
    this.errors = errors;
    return this;
  }

  public OpenAPIDefinitionValidationResponseDTO addErrorsItem(ErrorListItemDTO errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * If there are more than one error list them out. For example, list out validation errors by each field. 
   * @return errors
  **/
  @ApiModelProperty(value = "If there are more than one error list them out. For example, list out validation errors by each field. ")
  public List<ErrorListItemDTO> getErrors() {
    return errors;
  }

  public void setErrors(List<ErrorListItemDTO> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenAPIDefinitionValidationResponseDTO openAPIDefinitionValidationResponse = (OpenAPIDefinitionValidationResponseDTO) o;
    return Objects.equals(this.isValid, openAPIDefinitionValidationResponse.isValid) &&
        Objects.equals(this.content, openAPIDefinitionValidationResponse.content) &&
        Objects.equals(this.info, openAPIDefinitionValidationResponse.info) &&
        Objects.equals(this.errors, openAPIDefinitionValidationResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isValid, content, info, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenAPIDefinitionValidationResponseDTO {\n");
    
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

