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
import org.wso2.am.integration.clients.publisher.api.v1.dto.SearchResultDTO;

/**
 * DocumentSearchResultDTO
 */

public class DocumentSearchResultDTO extends SearchResultDTO {
  /**
   * Gets or Sets docType
   */
  @JsonAdapter(DocTypeEnum.Adapter.class)
  public enum DocTypeEnum {
    HOWTO("HOWTO"),
    
    SAMPLES("SAMPLES"),
    
    PUBLIC_FORUM("PUBLIC_FORUM"),
    
    SUPPORT_FORUM("SUPPORT_FORUM"),
    
    API_MESSAGE_FORMAT("API_MESSAGE_FORMAT"),
    
    SWAGGER_DOC("SWAGGER_DOC"),
    
    OTHER("OTHER");

    private String value;

    DocTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DocTypeEnum fromValue(String text) {
      for (DocTypeEnum b : DocTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DocTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DocTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DocTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DocTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("docType")
  private DocTypeEnum docType = null;

  @SerializedName("summary")
  private String summary = null;

  /**
   * Gets or Sets sourceType
   */
  @JsonAdapter(SourceTypeEnum.Adapter.class)
  public enum SourceTypeEnum {
    INLINE("INLINE"),
    
    URL("URL"),
    
    FILE("FILE");

    private String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceTypeEnum fromValue(String text) {
      for (SourceTypeEnum b : SourceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SourceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SourceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("sourceType")
  private SourceTypeEnum sourceType = null;

  @SerializedName("sourceUrl")
  private String sourceUrl = null;

  @SerializedName("otherTypeName")
  private String otherTypeName = null;

  /**
   * Gets or Sets visibility
   */
  @JsonAdapter(VisibilityEnum.Adapter.class)
  public enum VisibilityEnum {
    OWNER_ONLY("OWNER_ONLY"),
    
    PRIVATE("PRIVATE"),
    
    API_LEVEL("API_LEVEL");

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
  private VisibilityEnum visibility = null;

  @SerializedName("apiName")
  private String apiName = null;

  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("apiProvider")
  private String apiProvider = null;

  @SerializedName("apiUUID")
  private String apiUUID = null;

  @SerializedName("associatedType")
  private String associatedType = null;

  public DocumentSearchResultDTO docType(DocTypeEnum docType) {
    this.docType = docType;
    return this;
  }

   /**
   * Get docType
   * @return docType
  **/
  @ApiModelProperty(example = "HOWTO", value = "")
  public DocTypeEnum getDocType() {
    return docType;
  }

  public void setDocType(DocTypeEnum docType) {
    this.docType = docType;
  }

  public DocumentSearchResultDTO summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(example = "Summary of Calculator Documentation", value = "")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public DocumentSearchResultDTO sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @ApiModelProperty(example = "INLINE", value = "")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  public DocumentSearchResultDTO sourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

   /**
   * Get sourceUrl
   * @return sourceUrl
  **/
  @ApiModelProperty(example = "", value = "")
  public String getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  public DocumentSearchResultDTO otherTypeName(String otherTypeName) {
    this.otherTypeName = otherTypeName;
    return this;
  }

   /**
   * Get otherTypeName
   * @return otherTypeName
  **/
  @ApiModelProperty(example = "", value = "")
  public String getOtherTypeName() {
    return otherTypeName;
  }

  public void setOtherTypeName(String otherTypeName) {
    this.otherTypeName = otherTypeName;
  }

  public DocumentSearchResultDTO visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @ApiModelProperty(example = "API_LEVEL", value = "")
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public DocumentSearchResultDTO apiName(String apiName) {
    this.apiName = apiName;
    return this;
  }

   /**
   * The name of the associated API
   * @return apiName
  **/
  @ApiModelProperty(example = "TestAPI", value = "The name of the associated API")
  public String getApiName() {
    return apiName;
  }

  public void setApiName(String apiName) {
    this.apiName = apiName;
  }

  public DocumentSearchResultDTO apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * The version of the associated API
   * @return apiVersion
  **/
  @ApiModelProperty(example = "1.0.0", value = "The version of the associated API")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public DocumentSearchResultDTO apiProvider(String apiProvider) {
    this.apiProvider = apiProvider;
    return this;
  }

   /**
   * Get apiProvider
   * @return apiProvider
  **/
  @ApiModelProperty(example = "admin", value = "")
  public String getApiProvider() {
    return apiProvider;
  }

  public void setApiProvider(String apiProvider) {
    this.apiProvider = apiProvider;
  }

  public DocumentSearchResultDTO apiUUID(String apiUUID) {
    this.apiUUID = apiUUID;
    return this;
  }

   /**
   * Get apiUUID
   * @return apiUUID
  **/
  @ApiModelProperty(value = "")
  public String getApiUUID() {
    return apiUUID;
  }

  public void setApiUUID(String apiUUID) {
    this.apiUUID = apiUUID;
  }

  public DocumentSearchResultDTO associatedType(String associatedType) {
    this.associatedType = associatedType;
    return this;
  }

   /**
   * Get associatedType
   * @return associatedType
  **/
  @ApiModelProperty(value = "")
  public String getAssociatedType() {
    return associatedType;
  }

  public void setAssociatedType(String associatedType) {
    this.associatedType = associatedType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentSearchResultDTO documentSearchResult = (DocumentSearchResultDTO) o;
    return Objects.equals(this.docType, documentSearchResult.docType) &&
        Objects.equals(this.summary, documentSearchResult.summary) &&
        Objects.equals(this.sourceType, documentSearchResult.sourceType) &&
        Objects.equals(this.sourceUrl, documentSearchResult.sourceUrl) &&
        Objects.equals(this.otherTypeName, documentSearchResult.otherTypeName) &&
        Objects.equals(this.visibility, documentSearchResult.visibility) &&
        Objects.equals(this.apiName, documentSearchResult.apiName) &&
        Objects.equals(this.apiVersion, documentSearchResult.apiVersion) &&
        Objects.equals(this.apiProvider, documentSearchResult.apiProvider) &&
        Objects.equals(this.apiUUID, documentSearchResult.apiUUID) &&
        Objects.equals(this.associatedType, documentSearchResult.associatedType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docType, summary, sourceType, sourceUrl, otherTypeName, visibility, apiName, apiVersion, apiProvider, apiUUID, associatedType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentSearchResultDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    otherTypeName: ").append(toIndentedString(otherTypeName)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    apiProvider: ").append(toIndentedString(apiProvider)).append("\n");
    sb.append("    apiUUID: ").append(toIndentedString(apiUUID)).append("\n");
    sb.append("    associatedType: ").append(toIndentedString(associatedType)).append("\n");
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

