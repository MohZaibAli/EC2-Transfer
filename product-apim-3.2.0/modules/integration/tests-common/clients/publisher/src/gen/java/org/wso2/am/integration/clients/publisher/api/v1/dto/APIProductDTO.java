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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.wso2.am.integration.clients.publisher.api.v1.dto.APICorsConfigurationDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.APIMonetizationInfoDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.APIProductBusinessInformationDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.APIScopeDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.ProductAPIDTO;

/**
 * APIProductDTO
 */

public class APIProductDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("context")
  private String context = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("provider")
  private String provider = null;

  @SerializedName("hasThumbnail")
  private Boolean hasThumbnail = null;

  /**
   * State of the API product. Only published api products are visible on the store 
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    CREATED("CREATED"),
    
    PUBLISHED("PUBLISHED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("enableSchemaValidation")
  private Boolean enableSchemaValidation = null;

  @SerializedName("enableStore")
  private Boolean enableStore = null;

  @SerializedName("responseCachingEnabled")
  private Boolean responseCachingEnabled = null;

  @SerializedName("cacheTimeout")
  private Integer cacheTimeout = null;

  /**
   * The visibility level of the API. Accepts one of the following. PUBLIC, PRIVATE, RESTRICTED.
   */
  @JsonAdapter(VisibilityEnum.Adapter.class)
  public enum VisibilityEnum {
    PUBLIC("PUBLIC"),
    
    PRIVATE("PRIVATE"),
    
    RESTRICTED("RESTRICTED");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VisibilityEnum fromValue(String text) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VisibilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisibilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VisibilityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VisibilityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("visibility")
  private VisibilityEnum visibility = VisibilityEnum.PUBLIC;

  @SerializedName("visibleRoles")
  private List<String> visibleRoles = null;

  @SerializedName("visibleTenants")
  private List<String> visibleTenants = null;

  /**
   * Defines whether the API Product is restricted to certain set of publishers or creators or is it visible to all the publishers and creators. If the accessControl restriction is none, this API Product can be modified by all the publishers and creators, if not it can only be viewable/modifiable by certain set of publishers and creators, based on the restriction. 
   */
  @JsonAdapter(AccessControlEnum.Adapter.class)
  public enum AccessControlEnum {
    NONE("NONE"),
    
    RESTRICTED("RESTRICTED");

    private String value;

    AccessControlEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessControlEnum fromValue(String text) {
      for (AccessControlEnum b : AccessControlEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccessControlEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessControlEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessControlEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccessControlEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("accessControl")
  private AccessControlEnum accessControl = AccessControlEnum.NONE;

  @SerializedName("accessControlRoles")
  private List<String> accessControlRoles = null;

  @SerializedName("gatewayEnvironments")
  private List<String> gatewayEnvironments = null;

  @SerializedName("apiType")
  private String apiType = null;

  @SerializedName("transport")
  private List<String> transport = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("policies")
  private List<String> policies = null;

  @SerializedName("apiThrottlingPolicy")
  private String apiThrottlingPolicy = null;

  @SerializedName("authorizationHeader")
  private String authorizationHeader = null;

  @SerializedName("securityScheme")
  private List<String> securityScheme = null;

  /**
   * The subscription availability. Accepts one of the following. CURRENT_TENANT, ALL_TENANTS or SPECIFIC_TENANTS.
   */
  @JsonAdapter(SubscriptionAvailabilityEnum.Adapter.class)
  public enum SubscriptionAvailabilityEnum {
    CURRENT_TENANT("CURRENT_TENANT"),
    
    ALL_TENANTS("ALL_TENANTS"),
    
    SPECIFIC_TENANTS("SPECIFIC_TENANTS");

    private String value;

    SubscriptionAvailabilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubscriptionAvailabilityEnum fromValue(String text) {
      for (SubscriptionAvailabilityEnum b : SubscriptionAvailabilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SubscriptionAvailabilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubscriptionAvailabilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubscriptionAvailabilityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SubscriptionAvailabilityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("subscriptionAvailability")
  private SubscriptionAvailabilityEnum subscriptionAvailability = SubscriptionAvailabilityEnum.ALL_TENANTS;

  @SerializedName("subscriptionAvailableTenants")
  private List<String> subscriptionAvailableTenants = null;

  @SerializedName("additionalProperties")
  private Map<String, String> additionalProperties = null;

  @SerializedName("monetization")
  private APIMonetizationInfoDTO monetization = null;

  @SerializedName("businessInformation")
  private APIProductBusinessInformationDTO businessInformation = null;

  @SerializedName("corsConfiguration")
  private APICorsConfigurationDTO corsConfiguration = null;

  @SerializedName("createdTime")
  private String createdTime = null;

  @SerializedName("lastUpdatedTime")
  private String lastUpdatedTime = null;

  @SerializedName("apis")
  private List<ProductAPIDTO> apis = null;

  @SerializedName("scopes")
  private List<APIScopeDTO> scopes = null;

  @SerializedName("categories")
  private List<String> categories = null;

  public APIProductDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * UUID of the api product 
   * @return id
  **/
  @ApiModelProperty(example = "01234567-0123-0123-0123-012345678901", value = "UUID of the api product ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public APIProductDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the API Product
   * @return name
  **/
  @ApiModelProperty(example = "CalculatorAPIProduct", required = true, value = "Name of the API Product")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public APIProductDTO context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(example = "CalculatorAPI", value = "")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public APIProductDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A brief description about the API
   * @return description
  **/
  @ApiModelProperty(example = "A calculator API Product that supports basic operations", value = "A brief description about the API")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public APIProductDTO provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * If the provider value is not given, the user invoking the API will be used as the provider. 
   * @return provider
  **/
  @ApiModelProperty(example = "admin", value = "If the provider value is not given, the user invoking the API will be used as the provider. ")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public APIProductDTO hasThumbnail(Boolean hasThumbnail) {
    this.hasThumbnail = hasThumbnail;
    return this;
  }

   /**
   * Get hasThumbnail
   * @return hasThumbnail
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isHasThumbnail() {
    return hasThumbnail;
  }

  public void setHasThumbnail(Boolean hasThumbnail) {
    this.hasThumbnail = hasThumbnail;
  }

  public APIProductDTO state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * State of the API product. Only published api products are visible on the store 
   * @return state
  **/
  @ApiModelProperty(value = "State of the API product. Only published api products are visible on the store ")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public APIProductDTO enableSchemaValidation(Boolean enableSchemaValidation) {
    this.enableSchemaValidation = enableSchemaValidation;
    return this;
  }

   /**
   * Get enableSchemaValidation
   * @return enableSchemaValidation
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isEnableSchemaValidation() {
    return enableSchemaValidation;
  }

  public void setEnableSchemaValidation(Boolean enableSchemaValidation) {
    this.enableSchemaValidation = enableSchemaValidation;
  }

  public APIProductDTO enableStore(Boolean enableStore) {
    this.enableStore = enableStore;
    return this;
  }

   /**
   * Get enableStore
   * @return enableStore
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isEnableStore() {
    return enableStore;
  }

  public void setEnableStore(Boolean enableStore) {
    this.enableStore = enableStore;
  }

  public APIProductDTO responseCachingEnabled(Boolean responseCachingEnabled) {
    this.responseCachingEnabled = responseCachingEnabled;
    return this;
  }

   /**
   * Get responseCachingEnabled
   * @return responseCachingEnabled
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isResponseCachingEnabled() {
    return responseCachingEnabled;
  }

  public void setResponseCachingEnabled(Boolean responseCachingEnabled) {
    this.responseCachingEnabled = responseCachingEnabled;
  }

  public APIProductDTO cacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
    return this;
  }

   /**
   * Get cacheTimeout
   * @return cacheTimeout
  **/
  @ApiModelProperty(example = "300", value = "")
  public Integer getCacheTimeout() {
    return cacheTimeout;
  }

  public void setCacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
  }

  public APIProductDTO visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * The visibility level of the API. Accepts one of the following. PUBLIC, PRIVATE, RESTRICTED.
   * @return visibility
  **/
  @ApiModelProperty(example = "PUBLIC", value = "The visibility level of the API. Accepts one of the following. PUBLIC, PRIVATE, RESTRICTED.")
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public APIProductDTO visibleRoles(List<String> visibleRoles) {
    this.visibleRoles = visibleRoles;
    return this;
  }

  public APIProductDTO addVisibleRolesItem(String visibleRolesItem) {
    if (this.visibleRoles == null) {
      this.visibleRoles = new ArrayList<>();
    }
    this.visibleRoles.add(visibleRolesItem);
    return this;
  }

   /**
   * The user roles that are able to access the API
   * @return visibleRoles
  **/
  @ApiModelProperty(example = "[]", value = "The user roles that are able to access the API")
  public List<String> getVisibleRoles() {
    return visibleRoles;
  }

  public void setVisibleRoles(List<String> visibleRoles) {
    this.visibleRoles = visibleRoles;
  }

  public APIProductDTO visibleTenants(List<String> visibleTenants) {
    this.visibleTenants = visibleTenants;
    return this;
  }

  public APIProductDTO addVisibleTenantsItem(String visibleTenantsItem) {
    if (this.visibleTenants == null) {
      this.visibleTenants = new ArrayList<>();
    }
    this.visibleTenants.add(visibleTenantsItem);
    return this;
  }

   /**
   * Get visibleTenants
   * @return visibleTenants
  **/
  @ApiModelProperty(value = "")
  public List<String> getVisibleTenants() {
    return visibleTenants;
  }

  public void setVisibleTenants(List<String> visibleTenants) {
    this.visibleTenants = visibleTenants;
  }

  public APIProductDTO accessControl(AccessControlEnum accessControl) {
    this.accessControl = accessControl;
    return this;
  }

   /**
   * Defines whether the API Product is restricted to certain set of publishers or creators or is it visible to all the publishers and creators. If the accessControl restriction is none, this API Product can be modified by all the publishers and creators, if not it can only be viewable/modifiable by certain set of publishers and creators, based on the restriction. 
   * @return accessControl
  **/
  @ApiModelProperty(value = "Defines whether the API Product is restricted to certain set of publishers or creators or is it visible to all the publishers and creators. If the accessControl restriction is none, this API Product can be modified by all the publishers and creators, if not it can only be viewable/modifiable by certain set of publishers and creators, based on the restriction. ")
  public AccessControlEnum getAccessControl() {
    return accessControl;
  }

  public void setAccessControl(AccessControlEnum accessControl) {
    this.accessControl = accessControl;
  }

  public APIProductDTO accessControlRoles(List<String> accessControlRoles) {
    this.accessControlRoles = accessControlRoles;
    return this;
  }

  public APIProductDTO addAccessControlRolesItem(String accessControlRolesItem) {
    if (this.accessControlRoles == null) {
      this.accessControlRoles = new ArrayList<>();
    }
    this.accessControlRoles.add(accessControlRolesItem);
    return this;
  }

   /**
   * The user roles that are able to view/modify as API Product publisher or creator.
   * @return accessControlRoles
  **/
  @ApiModelProperty(example = "[\"admin\"]", value = "The user roles that are able to view/modify as API Product publisher or creator.")
  public List<String> getAccessControlRoles() {
    return accessControlRoles;
  }

  public void setAccessControlRoles(List<String> accessControlRoles) {
    this.accessControlRoles = accessControlRoles;
  }

  public APIProductDTO gatewayEnvironments(List<String> gatewayEnvironments) {
    this.gatewayEnvironments = gatewayEnvironments;
    return this;
  }

  public APIProductDTO addGatewayEnvironmentsItem(String gatewayEnvironmentsItem) {
    if (this.gatewayEnvironments == null) {
      this.gatewayEnvironments = new ArrayList<>();
    }
    this.gatewayEnvironments.add(gatewayEnvironmentsItem);
    return this;
  }

   /**
   * List of gateway environments the API Product is available 
   * @return gatewayEnvironments
  **/
  @ApiModelProperty(example = "[\"Production and Sandbox\"]", value = "List of gateway environments the API Product is available ")
  public List<String> getGatewayEnvironments() {
    return gatewayEnvironments;
  }

  public void setGatewayEnvironments(List<String> gatewayEnvironments) {
    this.gatewayEnvironments = gatewayEnvironments;
  }

  public APIProductDTO apiType(String apiType) {
    this.apiType = apiType;
    return this;
  }

   /**
   * The api type to be used. Accepted values are API, API PRODUCT
   * @return apiType
  **/
  @ApiModelProperty(example = "APIProduct", value = "The api type to be used. Accepted values are API, API PRODUCT")
  public String getApiType() {
    return apiType;
  }

  public void setApiType(String apiType) {
    this.apiType = apiType;
  }

  public APIProductDTO transport(List<String> transport) {
    this.transport = transport;
    return this;
  }

  public APIProductDTO addTransportItem(String transportItem) {
    if (this.transport == null) {
      this.transport = new ArrayList<>();
    }
    this.transport.add(transportItem);
    return this;
  }

   /**
   * Supported transports for the API (http and/or https). 
   * @return transport
  **/
  @ApiModelProperty(example = "[\"http\",\"https\"]", value = "Supported transports for the API (http and/or https). ")
  public List<String> getTransport() {
    return transport;
  }

  public void setTransport(List<String> transport) {
    this.transport = transport;
  }

  public APIProductDTO tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public APIProductDTO addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(example = "[\"substract\",\"add\"]", value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public APIProductDTO policies(List<String> policies) {
    this.policies = policies;
    return this;
  }

  public APIProductDTO addPoliciesItem(String policiesItem) {
    if (this.policies == null) {
      this.policies = new ArrayList<>();
    }
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * Get policies
   * @return policies
  **/
  @ApiModelProperty(example = "[\"Unlimited\"]", value = "")
  public List<String> getPolicies() {
    return policies;
  }

  public void setPolicies(List<String> policies) {
    this.policies = policies;
  }

  public APIProductDTO apiThrottlingPolicy(String apiThrottlingPolicy) {
    this.apiThrottlingPolicy = apiThrottlingPolicy;
    return this;
  }

   /**
   * The API level throttling policy selected for the particular API Product
   * @return apiThrottlingPolicy
  **/
  @ApiModelProperty(example = "Unlimited", value = "The API level throttling policy selected for the particular API Product")
  public String getApiThrottlingPolicy() {
    return apiThrottlingPolicy;
  }

  public void setApiThrottlingPolicy(String apiThrottlingPolicy) {
    this.apiThrottlingPolicy = apiThrottlingPolicy;
  }

  public APIProductDTO authorizationHeader(String authorizationHeader) {
    this.authorizationHeader = authorizationHeader;
    return this;
  }

   /**
   * Name of the Authorization header used for invoking the API. If it is not set, Authorization header name specified in tenant or system level will be used. 
   * @return authorizationHeader
  **/
  @ApiModelProperty(value = "Name of the Authorization header used for invoking the API. If it is not set, Authorization header name specified in tenant or system level will be used. ")
  public String getAuthorizationHeader() {
    return authorizationHeader;
  }

  public void setAuthorizationHeader(String authorizationHeader) {
    this.authorizationHeader = authorizationHeader;
  }

  public APIProductDTO securityScheme(List<String> securityScheme) {
    this.securityScheme = securityScheme;
    return this;
  }

  public APIProductDTO addSecuritySchemeItem(String securitySchemeItem) {
    if (this.securityScheme == null) {
      this.securityScheme = new ArrayList<>();
    }
    this.securityScheme.add(securitySchemeItem);
    return this;
  }

   /**
   * Types of API security, the current API secured with. It can be either OAuth2 or mutual SSL or both. If it is not set OAuth2 will be set as the security for the current API. 
   * @return securityScheme
  **/
  @ApiModelProperty(value = "Types of API security, the current API secured with. It can be either OAuth2 or mutual SSL or both. If it is not set OAuth2 will be set as the security for the current API. ")
  public List<String> getSecurityScheme() {
    return securityScheme;
  }

  public void setSecurityScheme(List<String> securityScheme) {
    this.securityScheme = securityScheme;
  }

  public APIProductDTO subscriptionAvailability(SubscriptionAvailabilityEnum subscriptionAvailability) {
    this.subscriptionAvailability = subscriptionAvailability;
    return this;
  }

   /**
   * The subscription availability. Accepts one of the following. CURRENT_TENANT, ALL_TENANTS or SPECIFIC_TENANTS.
   * @return subscriptionAvailability
  **/
  @ApiModelProperty(example = "CURRENT_TENANT", value = "The subscription availability. Accepts one of the following. CURRENT_TENANT, ALL_TENANTS or SPECIFIC_TENANTS.")
  public SubscriptionAvailabilityEnum getSubscriptionAvailability() {
    return subscriptionAvailability;
  }

  public void setSubscriptionAvailability(SubscriptionAvailabilityEnum subscriptionAvailability) {
    this.subscriptionAvailability = subscriptionAvailability;
  }

  public APIProductDTO subscriptionAvailableTenants(List<String> subscriptionAvailableTenants) {
    this.subscriptionAvailableTenants = subscriptionAvailableTenants;
    return this;
  }

  public APIProductDTO addSubscriptionAvailableTenantsItem(String subscriptionAvailableTenantsItem) {
    if (this.subscriptionAvailableTenants == null) {
      this.subscriptionAvailableTenants = new ArrayList<>();
    }
    this.subscriptionAvailableTenants.add(subscriptionAvailableTenantsItem);
    return this;
  }

   /**
   * Get subscriptionAvailableTenants
   * @return subscriptionAvailableTenants
  **/
  @ApiModelProperty(example = "[\"tenant1\",\"tenant2\"]", value = "")
  public List<String> getSubscriptionAvailableTenants() {
    return subscriptionAvailableTenants;
  }

  public void setSubscriptionAvailableTenants(List<String> subscriptionAvailableTenants) {
    this.subscriptionAvailableTenants = subscriptionAvailableTenants;
  }

  public APIProductDTO additionalProperties(Map<String, String> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public APIProductDTO putAdditionalPropertiesItem(String key, String additionalPropertiesItem) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<>();
    }
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * Map of custom properties of API
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "Map of custom properties of API")
  public Map<String, String> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, String> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public APIProductDTO monetization(APIMonetizationInfoDTO monetization) {
    this.monetization = monetization;
    return this;
  }

   /**
   * Get monetization
   * @return monetization
  **/
  @ApiModelProperty(value = "")
  public APIMonetizationInfoDTO getMonetization() {
    return monetization;
  }

  public void setMonetization(APIMonetizationInfoDTO monetization) {
    this.monetization = monetization;
  }

  public APIProductDTO businessInformation(APIProductBusinessInformationDTO businessInformation) {
    this.businessInformation = businessInformation;
    return this;
  }

   /**
   * Get businessInformation
   * @return businessInformation
  **/
  @ApiModelProperty(value = "")
  public APIProductBusinessInformationDTO getBusinessInformation() {
    return businessInformation;
  }

  public void setBusinessInformation(APIProductBusinessInformationDTO businessInformation) {
    this.businessInformation = businessInformation;
  }

  public APIProductDTO corsConfiguration(APICorsConfigurationDTO corsConfiguration) {
    this.corsConfiguration = corsConfiguration;
    return this;
  }

   /**
   * Get corsConfiguration
   * @return corsConfiguration
  **/
  @ApiModelProperty(value = "")
  public APICorsConfigurationDTO getCorsConfiguration() {
    return corsConfiguration;
  }

  public void setCorsConfiguration(APICorsConfigurationDTO corsConfiguration) {
    this.corsConfiguration = corsConfiguration;
  }

  public APIProductDTO createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @ApiModelProperty(example = "2017-02-20T13:57:16.229+0000", value = "")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  public APIProductDTO lastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

   /**
   * Get lastUpdatedTime
   * @return lastUpdatedTime
  **/
  @ApiModelProperty(example = "2017-02-20T13:57:16.229+0000", value = "")
  public String getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public APIProductDTO apis(List<ProductAPIDTO> apis) {
    this.apis = apis;
    return this;
  }

  public APIProductDTO addApisItem(ProductAPIDTO apisItem) {
    if (this.apis == null) {
      this.apis = new ArrayList<>();
    }
    this.apis.add(apisItem);
    return this;
  }

   /**
   * APIs and resources in the API Product. 
   * @return apis
  **/
  @ApiModelProperty(value = "APIs and resources in the API Product. ")
  public List<ProductAPIDTO> getApis() {
    return apis;
  }

  public void setApis(List<ProductAPIDTO> apis) {
    this.apis = apis;
  }

  public APIProductDTO scopes(List<APIScopeDTO> scopes) {
    this.scopes = scopes;
    return this;
  }

  public APIProductDTO addScopesItem(APIScopeDTO scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @ApiModelProperty(value = "")
  public List<APIScopeDTO> getScopes() {
    return scopes;
  }

  public void setScopes(List<APIScopeDTO> scopes) {
    this.scopes = scopes;
  }

  public APIProductDTO categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public APIProductDTO addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * API categories 
   * @return categories
  **/
  @ApiModelProperty(value = "API categories ")
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIProductDTO apIProduct = (APIProductDTO) o;
    return Objects.equals(this.id, apIProduct.id) &&
        Objects.equals(this.name, apIProduct.name) &&
        Objects.equals(this.context, apIProduct.context) &&
        Objects.equals(this.description, apIProduct.description) &&
        Objects.equals(this.provider, apIProduct.provider) &&
        Objects.equals(this.hasThumbnail, apIProduct.hasThumbnail) &&
        Objects.equals(this.state, apIProduct.state) &&
        Objects.equals(this.enableSchemaValidation, apIProduct.enableSchemaValidation) &&
        Objects.equals(this.enableStore, apIProduct.enableStore) &&
        Objects.equals(this.responseCachingEnabled, apIProduct.responseCachingEnabled) &&
        Objects.equals(this.cacheTimeout, apIProduct.cacheTimeout) &&
        Objects.equals(this.visibility, apIProduct.visibility) &&
        Objects.equals(this.visibleRoles, apIProduct.visibleRoles) &&
        Objects.equals(this.visibleTenants, apIProduct.visibleTenants) &&
        Objects.equals(this.accessControl, apIProduct.accessControl) &&
        Objects.equals(this.accessControlRoles, apIProduct.accessControlRoles) &&
        Objects.equals(this.gatewayEnvironments, apIProduct.gatewayEnvironments) &&
        Objects.equals(this.apiType, apIProduct.apiType) &&
        Objects.equals(this.transport, apIProduct.transport) &&
        Objects.equals(this.tags, apIProduct.tags) &&
        Objects.equals(this.policies, apIProduct.policies) &&
        Objects.equals(this.apiThrottlingPolicy, apIProduct.apiThrottlingPolicy) &&
        Objects.equals(this.authorizationHeader, apIProduct.authorizationHeader) &&
        Objects.equals(this.securityScheme, apIProduct.securityScheme) &&
        Objects.equals(this.subscriptionAvailability, apIProduct.subscriptionAvailability) &&
        Objects.equals(this.subscriptionAvailableTenants, apIProduct.subscriptionAvailableTenants) &&
        Objects.equals(this.additionalProperties, apIProduct.additionalProperties) &&
        Objects.equals(this.monetization, apIProduct.monetization) &&
        Objects.equals(this.businessInformation, apIProduct.businessInformation) &&
        Objects.equals(this.corsConfiguration, apIProduct.corsConfiguration) &&
        Objects.equals(this.createdTime, apIProduct.createdTime) &&
        Objects.equals(this.lastUpdatedTime, apIProduct.lastUpdatedTime) &&
        Objects.equals(this.apis, apIProduct.apis) &&
        Objects.equals(this.scopes, apIProduct.scopes) &&
        Objects.equals(this.categories, apIProduct.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, context, description, provider, hasThumbnail, state, enableSchemaValidation, enableStore, responseCachingEnabled, cacheTimeout, visibility, visibleRoles, visibleTenants, accessControl, accessControlRoles, gatewayEnvironments, apiType, transport, tags, policies, apiThrottlingPolicy, authorizationHeader, securityScheme, subscriptionAvailability, subscriptionAvailableTenants, additionalProperties, monetization, businessInformation, corsConfiguration, createdTime, lastUpdatedTime, apis, scopes, categories);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIProductDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    hasThumbnail: ").append(toIndentedString(hasThumbnail)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    enableSchemaValidation: ").append(toIndentedString(enableSchemaValidation)).append("\n");
    sb.append("    enableStore: ").append(toIndentedString(enableStore)).append("\n");
    sb.append("    responseCachingEnabled: ").append(toIndentedString(responseCachingEnabled)).append("\n");
    sb.append("    cacheTimeout: ").append(toIndentedString(cacheTimeout)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    visibleRoles: ").append(toIndentedString(visibleRoles)).append("\n");
    sb.append("    visibleTenants: ").append(toIndentedString(visibleTenants)).append("\n");
    sb.append("    accessControl: ").append(toIndentedString(accessControl)).append("\n");
    sb.append("    accessControlRoles: ").append(toIndentedString(accessControlRoles)).append("\n");
    sb.append("    gatewayEnvironments: ").append(toIndentedString(gatewayEnvironments)).append("\n");
    sb.append("    apiType: ").append(toIndentedString(apiType)).append("\n");
    sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    apiThrottlingPolicy: ").append(toIndentedString(apiThrottlingPolicy)).append("\n");
    sb.append("    authorizationHeader: ").append(toIndentedString(authorizationHeader)).append("\n");
    sb.append("    securityScheme: ").append(toIndentedString(securityScheme)).append("\n");
    sb.append("    subscriptionAvailability: ").append(toIndentedString(subscriptionAvailability)).append("\n");
    sb.append("    subscriptionAvailableTenants: ").append(toIndentedString(subscriptionAvailableTenants)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    monetization: ").append(toIndentedString(monetization)).append("\n");
    sb.append("    businessInformation: ").append(toIndentedString(businessInformation)).append("\n");
    sb.append("    corsConfiguration: ").append(toIndentedString(corsConfiguration)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
    sb.append("    apis: ").append(toIndentedString(apis)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

