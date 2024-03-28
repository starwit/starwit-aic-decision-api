package de.starwit.aicockpit;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import de.starwit.aicockpit.ModelType;
import java.net.URI;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DecisionModel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-28T20:47:24.051824173+01:00[Europe/Berlin]")
public class DecisionModel {

  private String name;

  private String version;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastDeployment;

  private ModelType modelType;

  private URI modelLink;

  private Boolean publicTrainingData;

  private URI linkToPublicTrainingData;

  public DecisionModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DecisionModel version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public DecisionModel lastDeployment(OffsetDateTime lastDeployment) {
    this.lastDeployment = lastDeployment;
    return this;
  }

  /**
   * Get lastDeployment
   * @return lastDeployment
  */
  @Valid 
  @Schema(name = "lastDeployment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastDeployment")
  public OffsetDateTime getLastDeployment() {
    return lastDeployment;
  }

  public void setLastDeployment(OffsetDateTime lastDeployment) {
    this.lastDeployment = lastDeployment;
  }

  public DecisionModel modelType(ModelType modelType) {
    this.modelType = modelType;
    return this;
  }

  /**
   * Get modelType
   * @return modelType
  */
  @Valid 
  @Schema(name = "modelType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modelType")
  public ModelType getModelType() {
    return modelType;
  }

  public void setModelType(ModelType modelType) {
    this.modelType = modelType;
  }

  public DecisionModel modelLink(URI modelLink) {
    this.modelLink = modelLink;
    return this;
  }

  /**
   * Link to model documentation
   * @return modelLink
  */
  @Valid 
  @Schema(name = "modelLink", description = "Link to model documentation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modelLink")
  public URI getModelLink() {
    return modelLink;
  }

  public void setModelLink(URI modelLink) {
    this.modelLink = modelLink;
  }

  public DecisionModel publicTrainingData(Boolean publicTrainingData) {
    this.publicTrainingData = publicTrainingData;
    return this;
  }

  /**
   * Is model based on public training data?
   * @return publicTrainingData
  */
  
  @Schema(name = "publicTrainingData", description = "Is model based on public training data?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publicTrainingData")
  public Boolean getPublicTrainingData() {
    return publicTrainingData;
  }

  public void setPublicTrainingData(Boolean publicTrainingData) {
    this.publicTrainingData = publicTrainingData;
  }

  public DecisionModel linkToPublicTrainingData(URI linkToPublicTrainingData) {
    this.linkToPublicTrainingData = linkToPublicTrainingData;
    return this;
  }

  /**
   * Link to public training data / documentation.
   * @return linkToPublicTrainingData
  */
  @Valid 
  @Schema(name = "linkToPublicTrainingData", description = "Link to public training data / documentation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkToPublicTrainingData")
  public URI getLinkToPublicTrainingData() {
    return linkToPublicTrainingData;
  }

  public void setLinkToPublicTrainingData(URI linkToPublicTrainingData) {
    this.linkToPublicTrainingData = linkToPublicTrainingData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionModel decisionModel = (DecisionModel) o;
    return Objects.equals(this.name, decisionModel.name) &&
        Objects.equals(this.version, decisionModel.version) &&
        Objects.equals(this.lastDeployment, decisionModel.lastDeployment) &&
        Objects.equals(this.modelType, decisionModel.modelType) &&
        Objects.equals(this.modelLink, decisionModel.modelLink) &&
        Objects.equals(this.publicTrainingData, decisionModel.publicTrainingData) &&
        Objects.equals(this.linkToPublicTrainingData, decisionModel.linkToPublicTrainingData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version, lastDeployment, modelType, modelLink, publicTrainingData, linkToPublicTrainingData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    lastDeployment: ").append(toIndentedString(lastDeployment)).append("\n");
    sb.append("    modelType: ").append(toIndentedString(modelType)).append("\n");
    sb.append("    modelLink: ").append(toIndentedString(modelLink)).append("\n");
    sb.append("    publicTrainingData: ").append(toIndentedString(publicTrainingData)).append("\n");
    sb.append("    linkToPublicTrainingData: ").append(toIndentedString(linkToPublicTrainingData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

