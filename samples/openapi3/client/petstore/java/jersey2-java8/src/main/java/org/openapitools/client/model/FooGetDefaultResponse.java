/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.client.model.Foo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * FooGetDefaultResponse
 */
@JsonPropertyOrder({
  FooGetDefaultResponse.JSON_PROPERTY_STRING
})
@JsonTypeName("_foo_get_default_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class FooGetDefaultResponse {
  public static final String JSON_PROPERTY_STRING = "string";
  @javax.annotation.Nullable
  private Foo string;

  public FooGetDefaultResponse() { 
  }

  public FooGetDefaultResponse string(@javax.annotation.Nullable Foo string) {
    this.string = string;
    return this;
  }

  /**
   * Get string
   * @return string
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Foo getString() {
    return string;
  }


  @JsonProperty(JSON_PROPERTY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setString(@javax.annotation.Nullable Foo string) {
    this.string = string;
  }


  /**
   * Return true if this _foo_get_default_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o, false, null, true);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FooGetDefaultResponse {\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
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

