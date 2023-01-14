/**
 * Companies House identity service
 * Companies House identity and authentication service.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.wso2.client.model.CompaniesHouseIdentityService;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class TokenVerify {
  
  @SerializedName("user_id")
  private String userId = null;
  @SerializedName("application")
  private String application = null;
  @SerializedName("expires_in")
  private Integer expiresIn = null;
  @SerializedName("scope")
  private String scope = null;

  /**
   * The ID of the user who authorised the access token.
   **/
  @ApiModelProperty(value = "The ID of the user who authorised the access token.")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * The ID of the application that was granted this access token.
   **/
  @ApiModelProperty(value = "The ID of the application that was granted this access token.")
  public String getApplication() {
    return application;
  }
  public void setApplication(String application) {
    this.application = application;
  }

  /**
   * Time in seconds until token expires.
   **/
  @ApiModelProperty(value = "Time in seconds until token expires.")
  public Integer getExpiresIn() {
    return expiresIn;
  }
  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  /**
   * A space-seperated list of scopes that were granted for this access token.
   **/
  @ApiModelProperty(value = "A space-seperated list of scopes that were granted for this access token.")
  public String getScope() {
    return scope;
  }
  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenVerify tokenVerify = (TokenVerify) o;
    return (this.userId == null ? tokenVerify.userId == null : this.userId.equals(tokenVerify.userId)) &&
        (this.application == null ? tokenVerify.application == null : this.application.equals(tokenVerify.application)) &&
        (this.expiresIn == null ? tokenVerify.expiresIn == null : this.expiresIn.equals(tokenVerify.expiresIn)) &&
        (this.scope == null ? tokenVerify.scope == null : this.scope.equals(tokenVerify.scope));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.application == null ? 0: this.application.hashCode());
    result = 31 * result + (this.expiresIn == null ? 0: this.expiresIn.hashCode());
    result = 31 * result + (this.scope == null ? 0: this.scope.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenVerify {\n");
    
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  application: ").append(application).append("\n");
    sb.append("  expiresIn: ").append(expiresIn).append("\n");
    sb.append("  scope: ").append(scope).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}