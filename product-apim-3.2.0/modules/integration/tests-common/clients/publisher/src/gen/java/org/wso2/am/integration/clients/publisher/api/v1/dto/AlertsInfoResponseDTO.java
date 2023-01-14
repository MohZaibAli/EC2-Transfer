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
import org.wso2.am.integration.clients.publisher.api.v1.dto.AlertConfigDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.AlertDTO;

/**
 * AlertsInfoResponseDTO
 */

public class AlertsInfoResponseDTO {
  @SerializedName("alerts")
  private List<AlertDTO> alerts = null;

  @SerializedName("emailList")
  private List<String> emailList = null;

  @SerializedName("failedConfigurations")
  private List<AlertConfigDTO> failedConfigurations = null;

  public AlertsInfoResponseDTO alerts(List<AlertDTO> alerts) {
    this.alerts = alerts;
    return this;
  }

  public AlertsInfoResponseDTO addAlertsItem(AlertDTO alertsItem) {
    if (this.alerts == null) {
      this.alerts = new ArrayList<>();
    }
    this.alerts.add(alertsItem);
    return this;
  }

   /**
   * Get alerts
   * @return alerts
  **/
  @ApiModelProperty(value = "")
  public List<AlertDTO> getAlerts() {
    return alerts;
  }

  public void setAlerts(List<AlertDTO> alerts) {
    this.alerts = alerts;
  }

  public AlertsInfoResponseDTO emailList(List<String> emailList) {
    this.emailList = emailList;
    return this;
  }

  public AlertsInfoResponseDTO addEmailListItem(String emailListItem) {
    if (this.emailList == null) {
      this.emailList = new ArrayList<>();
    }
    this.emailList.add(emailListItem);
    return this;
  }

   /**
   * Get emailList
   * @return emailList
  **/
  @ApiModelProperty(value = "")
  public List<String> getEmailList() {
    return emailList;
  }

  public void setEmailList(List<String> emailList) {
    this.emailList = emailList;
  }

  public AlertsInfoResponseDTO failedConfigurations(List<AlertConfigDTO> failedConfigurations) {
    this.failedConfigurations = failedConfigurations;
    return this;
  }

  public AlertsInfoResponseDTO addFailedConfigurationsItem(AlertConfigDTO failedConfigurationsItem) {
    if (this.failedConfigurations == null) {
      this.failedConfigurations = new ArrayList<>();
    }
    this.failedConfigurations.add(failedConfigurationsItem);
    return this;
  }

   /**
   * Get failedConfigurations
   * @return failedConfigurations
  **/
  @ApiModelProperty(value = "")
  public List<AlertConfigDTO> getFailedConfigurations() {
    return failedConfigurations;
  }

  public void setFailedConfigurations(List<AlertConfigDTO> failedConfigurations) {
    this.failedConfigurations = failedConfigurations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertsInfoResponseDTO alertsInfoResponse = (AlertsInfoResponseDTO) o;
    return Objects.equals(this.alerts, alertsInfoResponse.alerts) &&
        Objects.equals(this.emailList, alertsInfoResponse.emailList) &&
        Objects.equals(this.failedConfigurations, alertsInfoResponse.failedConfigurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alerts, emailList, failedConfigurations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertsInfoResponseDTO {\n");
    
    sb.append("    alerts: ").append(toIndentedString(alerts)).append("\n");
    sb.append("    emailList: ").append(toIndentedString(emailList)).append("\n");
    sb.append("    failedConfigurations: ").append(toIndentedString(failedConfigurations)).append("\n");
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

