/*
 * 0CodeAPI Manager - Admin
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Admin Portal. Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.1.66/components/apimgt/org.wso2.carbon.apimgt.rest.api.admin/src/main/resources/admin-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: 0.11.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.samples.utils.admin.rest.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Throttling Conditions
 */
@ApiModel(description = "Throttling Conditions")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-01T13:06:20.200+05:30")

public class ThrottleCondition {
  /**
   * Type of the thottling condition. Allowed values are HeaderCondition, IPCondition, JWTClaimsCondition, QueryParameterCondition 
   */
  public enum TypeEnum {
    @SerializedName("HeaderCondition")
    HEADERCONDITION("HeaderCondition"),
    
    @SerializedName("IPCondition")
    IPCONDITION("IPCondition"),
    
    @SerializedName("JWTClaimsCondition")
    JWTCLAIMSCONDITION("JWTClaimsCondition"),
    
    @SerializedName("QueryParameterCondition")
    QUERYPARAMETERCONDITION("QueryParameterCondition");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("invertCondition")
  private Boolean invertCondition = false;

  public ThrottleCondition type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the thottling condition. Allowed values are HeaderCondition, IPCondition, JWTClaimsCondition, QueryParameterCondition 
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "Type of the thottling condition. Allowed values are HeaderCondition, IPCondition, JWTClaimsCondition, QueryParameterCondition ")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ThrottleCondition invertCondition(Boolean invertCondition) {
    this.invertCondition = invertCondition;
    return this;
  }

   /**
   * Specifies whether inversion of the condition to be matched against the request
   * @return invertCondition
  **/
  @ApiModelProperty(example = "null", value = "Specifies whether inversion of the condition to be matched against the request")
  public Boolean getInvertCondition() {
    return invertCondition;
  }

  public void setInvertCondition(Boolean invertCondition) {
    this.invertCondition = invertCondition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThrottleCondition throttleCondition = (ThrottleCondition) o;
    return Objects.equals(this.type, throttleCondition.type) &&
        Objects.equals(this.invertCondition, throttleCondition.invertCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, invertCondition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThrottleCondition {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    invertCondition: ").append(toIndentedString(invertCondition)).append("\n");
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
