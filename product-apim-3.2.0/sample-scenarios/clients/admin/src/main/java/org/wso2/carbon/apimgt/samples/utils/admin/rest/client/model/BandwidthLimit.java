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
import org.wso2.carbon.apimgt.samples.utils.admin.rest.client.model.ThrottleLimit;

/**
 * BandwidthLimit
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-01T13:06:20.200+05:30")
public class BandwidthLimit extends ThrottleLimit {
  @SerializedName("dataAmount")
  private Long dataAmount = null;

  @SerializedName("dataUnit")
  private String dataUnit = null;

  public BandwidthLimit dataAmount(Long dataAmount) {
    this.dataAmount = dataAmount;
    return this;
  }

   /**
   * Amount of data allowed to be transfered
   * @return dataAmount
  **/
  @ApiModelProperty(example = "1000", value = "Amount of data allowed to be transfered")
  public Long getDataAmount() {
    return dataAmount;
  }

  public void setDataAmount(Long dataAmount) {
    this.dataAmount = dataAmount;
  }

  public BandwidthLimit dataUnit(String dataUnit) {
    this.dataUnit = dataUnit;
    return this;
  }

   /**
   * Unit of data allowed to be transfered. Allowed values are \"KB\", \"MB\" and \"GB\"
   * @return dataUnit
  **/
  @ApiModelProperty(example = "KB", value = "Unit of data allowed to be transfered. Allowed values are \"KB\", \"MB\" and \"GB\"")
  public String getDataUnit() {
    return dataUnit;
  }

  public void setDataUnit(String dataUnit) {
    this.dataUnit = dataUnit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BandwidthLimit bandwidthLimit = (BandwidthLimit) o;
    return Objects.equals(this.dataAmount, bandwidthLimit.dataAmount) &&
        Objects.equals(this.dataUnit, bandwidthLimit.dataUnit) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataAmount, dataUnit, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BandwidthLimit {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dataAmount: ").append(toIndentedString(dataAmount)).append("\n");
    sb.append("    dataUnit: ").append(toIndentedString(dataUnit)).append("\n");
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

