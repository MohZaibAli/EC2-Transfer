/*
 * 0CodeAPI Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.1.66/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: 0.11.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.samples.utils.publisher.rest.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Wsdl
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-01T12:34:23.624+05:30")
public class Wsdl {
  @SerializedName("name")
  private String name = null;

  @SerializedName("wsdlDefinition")
  private String wsdlDefinition = null;

  public Wsdl name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "admin--calculatorAPI2.0.wsdl", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Wsdl wsdlDefinition(String wsdlDefinition) {
    this.wsdlDefinition = wsdlDefinition;
    return this;
  }

   /**
   * Get wsdlDefinition
   * @return wsdlDefinition
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWsdlDefinition() {
    return wsdlDefinition;
  }

  public void setWsdlDefinition(String wsdlDefinition) {
    this.wsdlDefinition = wsdlDefinition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wsdl wsdl = (Wsdl) o;
    return Objects.equals(this.name, wsdl.name) &&
        Objects.equals(this.wsdlDefinition, wsdl.wsdlDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, wsdlDefinition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wsdl {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    wsdlDefinition: ").append(toIndentedString(wsdlDefinition)).append("\n");
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

