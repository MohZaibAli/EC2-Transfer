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
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.apimgt.samples.utils.admin.rest.client.model.ApplicationThrottlePolicy;

/**
 * ApplicationThrottlePolicyList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-01T13:06:20.200+05:30")
public class ApplicationThrottlePolicyList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("list")
  private List<ApplicationThrottlePolicy> list = new ArrayList<ApplicationThrottlePolicy>();

  public ApplicationThrottlePolicyList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of Application Throttling Policies returned. 
   * @return count
  **/
  @ApiModelProperty(example = "1", value = "Number of Application Throttling Policies returned. ")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ApplicationThrottlePolicyList list(List<ApplicationThrottlePolicy> list) {
    this.list = list;
    return this;
  }

  public ApplicationThrottlePolicyList addListItem(ApplicationThrottlePolicy listItem) {
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ApplicationThrottlePolicy> getList() {
    return list;
  }

  public void setList(List<ApplicationThrottlePolicy> list) {
    this.list = list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationThrottlePolicyList applicationThrottlePolicyList = (ApplicationThrottlePolicyList) o;
    return Objects.equals(this.count, applicationThrottlePolicyList.count) &&
        Objects.equals(this.list, applicationThrottlePolicyList.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationThrottlePolicyList {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

