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

/**
 * APIProductInfoDTO
 */

public class APIProductInfoDTO {
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

  @SerializedName("securityScheme")
  private List<String> securityScheme = null;

  public APIProductInfoDTO id(String id) {
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

  public APIProductInfoDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the API Product
   * @return name
  **/
  @ApiModelProperty(example = "CalculatorAPIProduct", value = "Name of the API Product")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public APIProductInfoDTO context(String context) {
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

  public APIProductInfoDTO description(String description) {
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

  public APIProductInfoDTO provider(String provider) {
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

  public APIProductInfoDTO hasThumbnail(Boolean hasThumbnail) {
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

  public APIProductInfoDTO state(StateEnum state) {
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

  public APIProductInfoDTO securityScheme(List<String> securityScheme) {
    this.securityScheme = securityScheme;
    return this;
  }

  public APIProductInfoDTO addSecuritySchemeItem(String securitySchemeItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIProductInfoDTO apIProductInfo = (APIProductInfoDTO) o;
    return Objects.equals(this.id, apIProductInfo.id) &&
        Objects.equals(this.name, apIProductInfo.name) &&
        Objects.equals(this.context, apIProductInfo.context) &&
        Objects.equals(this.description, apIProductInfo.description) &&
        Objects.equals(this.provider, apIProductInfo.provider) &&
        Objects.equals(this.hasThumbnail, apIProductInfo.hasThumbnail) &&
        Objects.equals(this.state, apIProductInfo.state) &&
        Objects.equals(this.securityScheme, apIProductInfo.securityScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, context, description, provider, hasThumbnail, state, securityScheme);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIProductInfoDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    hasThumbnail: ").append(toIndentedString(hasThumbnail)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    securityScheme: ").append(toIndentedString(securityScheme)).append("\n");
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
