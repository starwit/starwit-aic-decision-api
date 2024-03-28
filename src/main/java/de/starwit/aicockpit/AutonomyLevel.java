package de.starwit.aicockpit;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AutonomyLevel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-28T20:47:24.051824173+01:00[Europe/Berlin]")
public enum AutonomyLevel {
  
  AUTONOMOUS("autonomous"),
  
  PROPOSALONLY("proposalOnly"),
  
  DISABLED("disabled");

  private String value;

  AutonomyLevel(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AutonomyLevel fromValue(String value) {
    for (AutonomyLevel b : AutonomyLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

