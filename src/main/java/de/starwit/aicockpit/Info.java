package de.starwit.aicockpit;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import de.starwit.aicockpit.DecisionModel;
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
 * Info
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-28T20:47:24.051824173+01:00[Europe/Berlin]")
public class Info {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime generationDate;

  private String systemDescription;

  private String apiVersion;

  private DecisionModel usedModel;

  public Info generationDate(OffsetDateTime generationDate) {
    this.generationDate = generationDate;
    return this;
  }

  /**
   * Last date this interface was updated.
   * @return generationDate
  */
  @Valid 
  @Schema(name = "generationDate", description = "Last date this interface was updated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generationDate")
  public OffsetDateTime getGenerationDate() {
    return generationDate;
  }

  public void setGenerationDate(OffsetDateTime generationDate) {
    this.generationDate = generationDate;
  }

  public Info systemDescription(String systemDescription) {
    this.systemDescription = systemDescription;
    return this;
  }

  /**
   * additional info for this system
   * @return systemDescription
  */
  
  @Schema(name = "systemDescription", description = "additional info for this system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("systemDescription")
  public String getSystemDescription() {
    return systemDescription;
  }

  public void setSystemDescription(String systemDescription) {
    this.systemDescription = systemDescription;
  }

  public Info apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Get apiVersion
   * @return apiVersion
  */
  
  @Schema(name = "apiVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("apiVersion")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public Info usedModel(DecisionModel usedModel) {
    this.usedModel = usedModel;
    return this;
  }

  /**
   * Get usedModel
   * @return usedModel
  */
  @Valid 
  @Schema(name = "usedModel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usedModel")
  public DecisionModel getUsedModel() {
    return usedModel;
  }

  public void setUsedModel(DecisionModel usedModel) {
    this.usedModel = usedModel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Info info = (Info) o;
    return Objects.equals(this.generationDate, info.generationDate) &&
        Objects.equals(this.systemDescription, info.systemDescription) &&
        Objects.equals(this.apiVersion, info.apiVersion) &&
        Objects.equals(this.usedModel, info.usedModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generationDate, systemDescription, apiVersion, usedModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Info {\n");
    sb.append("    generationDate: ").append(toIndentedString(generationDate)).append("\n");
    sb.append("    systemDescription: ").append(toIndentedString(systemDescription)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    usedModel: ").append(toIndentedString(usedModel)).append("\n");
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

