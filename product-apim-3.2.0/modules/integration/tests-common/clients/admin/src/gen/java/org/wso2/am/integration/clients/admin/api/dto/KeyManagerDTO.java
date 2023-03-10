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
import org.wso2.am.integration.clients.admin.api.dto.ClaimMappingEntryDTO;
import org.wso2.am.integration.clients.admin.api.dto.KeyManagerCertificatesDTO;
import org.wso2.am.integration.clients.admin.api.dto.TokenValidationDTO;

/**
 * KeyManagerDTO
 */

public class KeyManagerDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("introspectionEndpoint")
  private String introspectionEndpoint = null;

  @SerializedName("clientRegistrationEndpoint")
  private String clientRegistrationEndpoint = null;

  @SerializedName("tokenEndpoint")
  private String tokenEndpoint = null;

  @SerializedName("revokeEndpoint")
  private String revokeEndpoint = null;

  @SerializedName("userInfoEndpoint")
  private String userInfoEndpoint = null;

  @SerializedName("authorizeEndpoint")
  private String authorizeEndpoint = null;

  @SerializedName("certificates")
  private KeyManagerCertificatesDTO certificates = null;

  @SerializedName("issuer")
  private String issuer = null;

  @SerializedName("scopeManagementEndpoint")
  private String scopeManagementEndpoint = null;

  @SerializedName("availableGrantTypes")
  private List<String> availableGrantTypes = null;

  @SerializedName("enableTokenGeneration")
  private Boolean enableTokenGeneration = null;

  @SerializedName("enableTokenEncryption")
  private Boolean enableTokenEncryption = false;

  @SerializedName("enableTokenHashing")
  private Boolean enableTokenHashing = false;

  @SerializedName("enableMapOAuthConsumerApps")
  private Boolean enableMapOAuthConsumerApps = false;

  @SerializedName("enableOAuthAppCreation")
  private Boolean enableOAuthAppCreation = false;

  @SerializedName("enableSelfValidationJWT")
  private Boolean enableSelfValidationJWT = true;

  @SerializedName("claimMapping")
  private List<ClaimMappingEntryDTO> claimMapping = null;

  @SerializedName("consumerKeyClaim")
  private String consumerKeyClaim = null;

  @SerializedName("scopesClaim")
  private String scopesClaim = null;

  @SerializedName("tokenValidation")
  private List<TokenValidationDTO> tokenValidation = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("additionalProperties")
  private Object additionalProperties = null;

  public KeyManagerDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "01234567-0123-0123-0123-012345678901", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public KeyManagerDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "WSO2 IS", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public KeyManagerDTO displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * display name of Key Manager to  show in UI 
   * @return displayName
  **/
  @ApiModelProperty(example = "KeyManager1", value = "display name of Key Manager to  show in UI ")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public KeyManagerDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "IS", required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public KeyManagerDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "This is a key manager for Developers", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public KeyManagerDTO introspectionEndpoint(String introspectionEndpoint) {
    this.introspectionEndpoint = introspectionEndpoint;
    return this;
  }

   /**
   * Get introspectionEndpoint
   * @return introspectionEndpoint
  **/
  @ApiModelProperty(example = "", value = "")
  public String getIntrospectionEndpoint() {
    return introspectionEndpoint;
  }

  public void setIntrospectionEndpoint(String introspectionEndpoint) {
    this.introspectionEndpoint = introspectionEndpoint;
  }

  public KeyManagerDTO clientRegistrationEndpoint(String clientRegistrationEndpoint) {
    this.clientRegistrationEndpoint = clientRegistrationEndpoint;
    return this;
  }

   /**
   * Get clientRegistrationEndpoint
   * @return clientRegistrationEndpoint
  **/
  @ApiModelProperty(example = "", value = "")
  public String getClientRegistrationEndpoint() {
    return clientRegistrationEndpoint;
  }

  public void setClientRegistrationEndpoint(String clientRegistrationEndpoint) {
    this.clientRegistrationEndpoint = clientRegistrationEndpoint;
  }

  public KeyManagerDTO tokenEndpoint(String tokenEndpoint) {
    this.tokenEndpoint = tokenEndpoint;
    return this;
  }

   /**
   * Get tokenEndpoint
   * @return tokenEndpoint
  **/
  @ApiModelProperty(example = "", value = "")
  public String getTokenEndpoint() {
    return tokenEndpoint;
  }

  public void setTokenEndpoint(String tokenEndpoint) {
    this.tokenEndpoint = tokenEndpoint;
  }

  public KeyManagerDTO revokeEndpoint(String revokeEndpoint) {
    this.revokeEndpoint = revokeEndpoint;
    return this;
  }

   /**
   * Get revokeEndpoint
   * @return revokeEndpoint
  **/
  @ApiModelProperty(example = "", value = "")
  public String getRevokeEndpoint() {
    return revokeEndpoint;
  }

  public void setRevokeEndpoint(String revokeEndpoint) {
    this.revokeEndpoint = revokeEndpoint;
  }

  public KeyManagerDTO userInfoEndpoint(String userInfoEndpoint) {
    this.userInfoEndpoint = userInfoEndpoint;
    return this;
  }

   /**
   * Get userInfoEndpoint
   * @return userInfoEndpoint
  **/
  @ApiModelProperty(example = "", value = "")
  public String getUserInfoEndpoint() {
    return userInfoEndpoint;
  }

  public void setUserInfoEndpoint(String userInfoEndpoint) {
    this.userInfoEndpoint = userInfoEndpoint;
  }

  public KeyManagerDTO authorizeEndpoint(String authorizeEndpoint) {
    this.authorizeEndpoint = authorizeEndpoint;
    return this;
  }

   /**
   * Get authorizeEndpoint
   * @return authorizeEndpoint
  **/
  @ApiModelProperty(example = "", value = "")
  public String getAuthorizeEndpoint() {
    return authorizeEndpoint;
  }

  public void setAuthorizeEndpoint(String authorizeEndpoint) {
    this.authorizeEndpoint = authorizeEndpoint;
  }

  public KeyManagerDTO certificates(KeyManagerCertificatesDTO certificates) {
    this.certificates = certificates;
    return this;
  }

   /**
   * Get certificates
   * @return certificates
  **/
  @ApiModelProperty(value = "")
  public KeyManagerCertificatesDTO getCertificates() {
    return certificates;
  }

  public void setCertificates(KeyManagerCertificatesDTO certificates) {
    this.certificates = certificates;
  }

  public KeyManagerDTO issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @ApiModelProperty(example = "", value = "")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public KeyManagerDTO scopeManagementEndpoint(String scopeManagementEndpoint) {
    this.scopeManagementEndpoint = scopeManagementEndpoint;
    return this;
  }

   /**
   * Get scopeManagementEndpoint
   * @return scopeManagementEndpoint
  **/
  @ApiModelProperty(example = "", value = "")
  public String getScopeManagementEndpoint() {
    return scopeManagementEndpoint;
  }

  public void setScopeManagementEndpoint(String scopeManagementEndpoint) {
    this.scopeManagementEndpoint = scopeManagementEndpoint;
  }

  public KeyManagerDTO availableGrantTypes(List<String> availableGrantTypes) {
    this.availableGrantTypes = availableGrantTypes;
    return this;
  }

  public KeyManagerDTO addAvailableGrantTypesItem(String availableGrantTypesItem) {
    if (this.availableGrantTypes == null) {
      this.availableGrantTypes = new ArrayList<>();
    }
    this.availableGrantTypes.add(availableGrantTypesItem);
    return this;
  }

   /**
   * Get availableGrantTypes
   * @return availableGrantTypes
  **/
  @ApiModelProperty(value = "")
  public List<String> getAvailableGrantTypes() {
    return availableGrantTypes;
  }

  public void setAvailableGrantTypes(List<String> availableGrantTypes) {
    this.availableGrantTypes = availableGrantTypes;
  }

  public KeyManagerDTO enableTokenGeneration(Boolean enableTokenGeneration) {
    this.enableTokenGeneration = enableTokenGeneration;
    return this;
  }

   /**
   * Get enableTokenGeneration
   * @return enableTokenGeneration
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isEnableTokenGeneration() {
    return enableTokenGeneration;
  }

  public void setEnableTokenGeneration(Boolean enableTokenGeneration) {
    this.enableTokenGeneration = enableTokenGeneration;
  }

  public KeyManagerDTO enableTokenEncryption(Boolean enableTokenEncryption) {
    this.enableTokenEncryption = enableTokenEncryption;
    return this;
  }

   /**
   * Get enableTokenEncryption
   * @return enableTokenEncryption
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isEnableTokenEncryption() {
    return enableTokenEncryption;
  }

  public void setEnableTokenEncryption(Boolean enableTokenEncryption) {
    this.enableTokenEncryption = enableTokenEncryption;
  }

  public KeyManagerDTO enableTokenHashing(Boolean enableTokenHashing) {
    this.enableTokenHashing = enableTokenHashing;
    return this;
  }

   /**
   * Get enableTokenHashing
   * @return enableTokenHashing
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isEnableTokenHashing() {
    return enableTokenHashing;
  }

  public void setEnableTokenHashing(Boolean enableTokenHashing) {
    this.enableTokenHashing = enableTokenHashing;
  }

  public KeyManagerDTO enableMapOAuthConsumerApps(Boolean enableMapOAuthConsumerApps) {
    this.enableMapOAuthConsumerApps = enableMapOAuthConsumerApps;
    return this;
  }

   /**
   * Get enableMapOAuthConsumerApps
   * @return enableMapOAuthConsumerApps
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isEnableMapOAuthConsumerApps() {
    return enableMapOAuthConsumerApps;
  }

  public void setEnableMapOAuthConsumerApps(Boolean enableMapOAuthConsumerApps) {
    this.enableMapOAuthConsumerApps = enableMapOAuthConsumerApps;
  }

  public KeyManagerDTO enableOAuthAppCreation(Boolean enableOAuthAppCreation) {
    this.enableOAuthAppCreation = enableOAuthAppCreation;
    return this;
  }

   /**
   * Get enableOAuthAppCreation
   * @return enableOAuthAppCreation
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isEnableOAuthAppCreation() {
    return enableOAuthAppCreation;
  }

  public void setEnableOAuthAppCreation(Boolean enableOAuthAppCreation) {
    this.enableOAuthAppCreation = enableOAuthAppCreation;
  }

  public KeyManagerDTO enableSelfValidationJWT(Boolean enableSelfValidationJWT) {
    this.enableSelfValidationJWT = enableSelfValidationJWT;
    return this;
  }

   /**
   * Get enableSelfValidationJWT
   * @return enableSelfValidationJWT
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isEnableSelfValidationJWT() {
    return enableSelfValidationJWT;
  }

  public void setEnableSelfValidationJWT(Boolean enableSelfValidationJWT) {
    this.enableSelfValidationJWT = enableSelfValidationJWT;
  }

  public KeyManagerDTO claimMapping(List<ClaimMappingEntryDTO> claimMapping) {
    this.claimMapping = claimMapping;
    return this;
  }

  public KeyManagerDTO addClaimMappingItem(ClaimMappingEntryDTO claimMappingItem) {
    if (this.claimMapping == null) {
      this.claimMapping = new ArrayList<>();
    }
    this.claimMapping.add(claimMappingItem);
    return this;
  }

   /**
   * Get claimMapping
   * @return claimMapping
  **/
  @ApiModelProperty(value = "")
  public List<ClaimMappingEntryDTO> getClaimMapping() {
    return claimMapping;
  }

  public void setClaimMapping(List<ClaimMappingEntryDTO> claimMapping) {
    this.claimMapping = claimMapping;
  }

  public KeyManagerDTO consumerKeyClaim(String consumerKeyClaim) {
    this.consumerKeyClaim = consumerKeyClaim;
    return this;
  }

   /**
   * Get consumerKeyClaim
   * @return consumerKeyClaim
  **/
  @ApiModelProperty(example = "azp", value = "")
  public String getConsumerKeyClaim() {
    return consumerKeyClaim;
  }

  public void setConsumerKeyClaim(String consumerKeyClaim) {
    this.consumerKeyClaim = consumerKeyClaim;
  }

  public KeyManagerDTO scopesClaim(String scopesClaim) {
    this.scopesClaim = scopesClaim;
    return this;
  }

   /**
   * Get scopesClaim
   * @return scopesClaim
  **/
  @ApiModelProperty(example = "scp", value = "")
  public String getScopesClaim() {
    return scopesClaim;
  }

  public void setScopesClaim(String scopesClaim) {
    this.scopesClaim = scopesClaim;
  }

  public KeyManagerDTO tokenValidation(List<TokenValidationDTO> tokenValidation) {
    this.tokenValidation = tokenValidation;
    return this;
  }

  public KeyManagerDTO addTokenValidationItem(TokenValidationDTO tokenValidationItem) {
    if (this.tokenValidation == null) {
      this.tokenValidation = new ArrayList<>();
    }
    this.tokenValidation.add(tokenValidationItem);
    return this;
  }

   /**
   * Get tokenValidation
   * @return tokenValidation
  **/
  @ApiModelProperty(value = "")
  public List<TokenValidationDTO> getTokenValidation() {
    return tokenValidation;
  }

  public void setTokenValidation(List<TokenValidationDTO> tokenValidation) {
    this.tokenValidation = tokenValidation;
  }

  public KeyManagerDTO enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public KeyManagerDTO additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

   /**
   * Get additionalProperties
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyManagerDTO keyManager = (KeyManagerDTO) o;
    return Objects.equals(this.id, keyManager.id) &&
        Objects.equals(this.name, keyManager.name) &&
        Objects.equals(this.displayName, keyManager.displayName) &&
        Objects.equals(this.type, keyManager.type) &&
        Objects.equals(this.description, keyManager.description) &&
        Objects.equals(this.introspectionEndpoint, keyManager.introspectionEndpoint) &&
        Objects.equals(this.clientRegistrationEndpoint, keyManager.clientRegistrationEndpoint) &&
        Objects.equals(this.tokenEndpoint, keyManager.tokenEndpoint) &&
        Objects.equals(this.revokeEndpoint, keyManager.revokeEndpoint) &&
        Objects.equals(this.userInfoEndpoint, keyManager.userInfoEndpoint) &&
        Objects.equals(this.authorizeEndpoint, keyManager.authorizeEndpoint) &&
        Objects.equals(this.certificates, keyManager.certificates) &&
        Objects.equals(this.issuer, keyManager.issuer) &&
        Objects.equals(this.scopeManagementEndpoint, keyManager.scopeManagementEndpoint) &&
        Objects.equals(this.availableGrantTypes, keyManager.availableGrantTypes) &&
        Objects.equals(this.enableTokenGeneration, keyManager.enableTokenGeneration) &&
        Objects.equals(this.enableTokenEncryption, keyManager.enableTokenEncryption) &&
        Objects.equals(this.enableTokenHashing, keyManager.enableTokenHashing) &&
        Objects.equals(this.enableMapOAuthConsumerApps, keyManager.enableMapOAuthConsumerApps) &&
        Objects.equals(this.enableOAuthAppCreation, keyManager.enableOAuthAppCreation) &&
        Objects.equals(this.enableSelfValidationJWT, keyManager.enableSelfValidationJWT) &&
        Objects.equals(this.claimMapping, keyManager.claimMapping) &&
        Objects.equals(this.consumerKeyClaim, keyManager.consumerKeyClaim) &&
        Objects.equals(this.scopesClaim, keyManager.scopesClaim) &&
        Objects.equals(this.tokenValidation, keyManager.tokenValidation) &&
        Objects.equals(this.enabled, keyManager.enabled) &&
        Objects.equals(this.additionalProperties, keyManager.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, displayName, type, description, introspectionEndpoint, clientRegistrationEndpoint, tokenEndpoint, revokeEndpoint, userInfoEndpoint, authorizeEndpoint, certificates, issuer, scopeManagementEndpoint, availableGrantTypes, enableTokenGeneration, enableTokenEncryption, enableTokenHashing, enableMapOAuthConsumerApps, enableOAuthAppCreation, enableSelfValidationJWT, claimMapping, consumerKeyClaim, scopesClaim, tokenValidation, enabled, additionalProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyManagerDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    introspectionEndpoint: ").append(toIndentedString(introspectionEndpoint)).append("\n");
    sb.append("    clientRegistrationEndpoint: ").append(toIndentedString(clientRegistrationEndpoint)).append("\n");
    sb.append("    tokenEndpoint: ").append(toIndentedString(tokenEndpoint)).append("\n");
    sb.append("    revokeEndpoint: ").append(toIndentedString(revokeEndpoint)).append("\n");
    sb.append("    userInfoEndpoint: ").append(toIndentedString(userInfoEndpoint)).append("\n");
    sb.append("    authorizeEndpoint: ").append(toIndentedString(authorizeEndpoint)).append("\n");
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    scopeManagementEndpoint: ").append(toIndentedString(scopeManagementEndpoint)).append("\n");
    sb.append("    availableGrantTypes: ").append(toIndentedString(availableGrantTypes)).append("\n");
    sb.append("    enableTokenGeneration: ").append(toIndentedString(enableTokenGeneration)).append("\n");
    sb.append("    enableTokenEncryption: ").append(toIndentedString(enableTokenEncryption)).append("\n");
    sb.append("    enableTokenHashing: ").append(toIndentedString(enableTokenHashing)).append("\n");
    sb.append("    enableMapOAuthConsumerApps: ").append(toIndentedString(enableMapOAuthConsumerApps)).append("\n");
    sb.append("    enableOAuthAppCreation: ").append(toIndentedString(enableOAuthAppCreation)).append("\n");
    sb.append("    enableSelfValidationJWT: ").append(toIndentedString(enableSelfValidationJWT)).append("\n");
    sb.append("    claimMapping: ").append(toIndentedString(claimMapping)).append("\n");
    sb.append("    consumerKeyClaim: ").append(toIndentedString(consumerKeyClaim)).append("\n");
    sb.append("    scopesClaim: ").append(toIndentedString(scopesClaim)).append("\n");
    sb.append("    tokenValidation: ").append(toIndentedString(tokenValidation)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

