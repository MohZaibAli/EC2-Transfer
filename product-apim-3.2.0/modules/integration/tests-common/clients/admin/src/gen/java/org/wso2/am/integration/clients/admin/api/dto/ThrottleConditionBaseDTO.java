/*
 * 0CodeAPI Manager - Admin
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Admin Portal. Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.5.176/components/apimgt/org.wso2.carbon.apimgt.rest.api.admin/src/main/resources/admin-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.1
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
 * ThrottleConditionBaseDTO
 */

public class ThrottleConditionBaseDTO {
  @SerializedName("invertCondition")
  private Boolean invertCondition = false;

  public ThrottleConditionBaseDTO invertCondition(Boolean invertCondition) {
    this.invertCondition = invertCondition;
    return this;
  }

   /**
   * Specifies whether inversion of the condition to be matched against the request.  **Note:** When you add conditional groups for advanced throttling policies, this paramater should have the same value (&#39;true&#39; or &#39;false&#39;) for the same type of conditional group. 
   * @return invertCondition
  **/
  @ApiModelProperty(value = "Specifies whether inversion of the condition to be matched against the request.  **Note:** When you add conditional groups for advanced throttling policies, this paramater should have the same value ('true' or 'false') for the same type of conditional group. ")
  public Boolean isInvertCondition() {
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
    ThrottleConditionBaseDTO throttleConditionBase = (ThrottleConditionBaseDTO) o;
    return Objects.equals(this.invertCondition, throttleConditionBase.invertCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invertCondition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThrottleConditionBaseDTO {\n");
    
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

