package de.starwit.aicockpit;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import de.starwit.aicockpit.AutonomyLevel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Decision
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-28T20:47:24.051824173+01:00[Europe/Berlin]")
public class Decision {

  private Integer id;

  private String name;

  private UUID uuid;

  private AutonomyLevel autonomyLevel;

  @Valid
  private List<@Valid Decision> followingDecisions;

  public Decision id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Decision name(String name) {
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

  public Decision uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Globally unique ID
   * @return uuid
  */
  @Valid 
  @Schema(name = "uuid", description = "Globally unique ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uuid")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public Decision autonomyLevel(AutonomyLevel autonomyLevel) {
    this.autonomyLevel = autonomyLevel;
    return this;
  }

  /**
   * Get autonomyLevel
   * @return autonomyLevel
  */
  @Valid 
  @Schema(name = "autonomyLevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autonomyLevel")
  public AutonomyLevel getAutonomyLevel() {
    return autonomyLevel;
  }

  public void setAutonomyLevel(AutonomyLevel autonomyLevel) {
    this.autonomyLevel = autonomyLevel;
  }

  public Decision followingDecisions(List<@Valid Decision> followingDecisions) {
    this.followingDecisions = followingDecisions;
    return this;
  }

  public Decision addFollowingDecisionsItem(Decision followingDecisionsItem) {
    if (this.followingDecisions == null) {
      this.followingDecisions = new ArrayList<>();
    }
    this.followingDecisions.add(followingDecisionsItem);
    return this;
  }

  /**
   * Decisions that use output of this decisions. Can be null
   * @return followingDecisions
  */
  @Valid 
  @Schema(name = "followingDecisions", example = "[{\"id\":0,\"name\":\"NextDecision\",\"uuid\":\"3fa85f64-5717-4562-b3fc-2c963f66afa6\",\"autonomyLevel\":\"autonomous\"},{\"id\":1,\"name\":\"AnotherDecision\",\"uuid\":\"3fa85f64-4417-4562-b3fc-2c963f66afa6\",\"autonomyLevel\":\"proposalOnly\"}]", description = "Decisions that use output of this decisions. Can be null", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followingDecisions")
  public List<@Valid Decision> getFollowingDecisions() {
    return followingDecisions;
  }

  public void setFollowingDecisions(List<@Valid Decision> followingDecisions) {
    this.followingDecisions = followingDecisions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Decision decision = (Decision) o;
    return Objects.equals(this.id, decision.id) &&
        Objects.equals(this.name, decision.name) &&
        Objects.equals(this.uuid, decision.uuid) &&
        Objects.equals(this.autonomyLevel, decision.autonomyLevel) &&
        Objects.equals(this.followingDecisions, decision.followingDecisions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, uuid, autonomyLevel, followingDecisions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Decision {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    autonomyLevel: ").append(toIndentedString(autonomyLevel)).append("\n");
    sb.append("    followingDecisions: ").append(toIndentedString(followingDecisions)).append("\n");
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

