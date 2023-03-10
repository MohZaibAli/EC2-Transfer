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
import org.wso2.am.integration.clients.publisher.api.v1.dto.WSDLValidationResponseWsdlInfoDTO;

/**
 * WSDLValidationResponseDTO
 */

public class WSDLValidationResponseDTO {
  @SerializedName("isValid")
  private Boolean isValid = null;

  @SerializedName("errors")
  private List<ErrorListItemDTO> errors = null;

  @SerializedName("wsdlInfo")
  private WSDLValidationResponseWsdlInfoDTO wsdlInfo = null;

  public WSDLValidationResponseDTO isValid(Boolean isValid) {
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

  public WSDLValidationResponseDTO errors(List<ErrorListItemDTO> errors) {
    this.errors = errors;
    return this;
  }

  public WSDLValidationResponseDTO addErrorsItem(ErrorListItemDTO errorsItem) {
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

  public WSDLValidationResponseDTO wsdlInfo(WSDLValidationResponseWsdlInfoDTO wsdlInfo) {
    this.wsdlInfo = wsdlInfo;
    return this;
  }

   /**
   * Get wsdlInfo
   * @return wsdlInfo
  **/
  @ApiModelProperty(value = "")
  public WSDLValidationResponseWsdlInfoDTO getWsdlInfo() {
    return wsdlInfo;
  }

  public void setWsdlInfo(WSDLValidationResponseWsdlInfoDTO wsdlInfo) {
    this.wsdlInfo = wsdlInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WSDLValidationResponseDTO wsDLValidationResponse = (WSDLValidationResponseDTO) o;
    return Objects.equals(this.isValid, wsDLValidationResponse.isValid) &&
        Objects.equals(this.errors, wsDLValidationResponse.errors) &&
        Objects.equals(this.wsdlInfo, wsDLValidationResponse.wsdlInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isValid, errors, wsdlInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WSDLValidationResponseDTO {\n");
    
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    wsdlInfo: ").append(toIndentedString(wsdlInfo)).append("\n");
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

