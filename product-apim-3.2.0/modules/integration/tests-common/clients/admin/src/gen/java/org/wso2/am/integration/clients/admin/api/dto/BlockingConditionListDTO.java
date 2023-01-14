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
import java.util.ArrayList;
import java.util.List;
import org.wso2.am.integration.clients.admin.api.dto.BlockingConditionDTO;

/**
 * BlockingConditionListDTO
 */

public class BlockingConditionListDTO {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("list")
  private List<BlockingConditionDTO> list = null;

  public BlockingConditionListDTO count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of Blocking Conditions returned. 
   * @return count
  **/
  @ApiModelProperty(example = "1", value = "Number of Blocking Conditions returned. ")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public BlockingConditionListDTO list(List<BlockingConditionDTO> list) {
    this.list = list;
    return this;
  }

  public BlockingConditionListDTO addListItem(BlockingConditionDTO listItem) {
    if (this.list == null) {
      this.list = new ArrayList<>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(value = "")
  public List<BlockingConditionDTO> getList() {
    return list;
  }

  public void setList(List<BlockingConditionDTO> list) {
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
    BlockingConditionListDTO blockingConditionList = (BlockingConditionListDTO) o;
    return Objects.equals(this.count, blockingConditionList.count) &&
        Objects.equals(this.list, blockingConditionList.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockingConditionListDTO {\n");
    
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

