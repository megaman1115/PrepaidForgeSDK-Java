/*
 * Prepaidforge API
 * The public api for prepaidforge
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.prepaidforge.client.model;

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
 * StockRequest
 */

public class StockRequest {
  /**
   * Gets or Sets types
   */
  @JsonAdapter(TypesEnum.Adapter.class)
  public enum TypesEnum {
    TEXT("TEXT"),
    
    SCAN("SCAN"),
    
    FULLSCAN("FULLSCAN"),
    
    OCR("OCR"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    TypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypesEnum fromValue(String value) {
      for (TypesEnum b : TypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPES = "types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  private List<TypesEnum> types = new ArrayList<TypesEnum>();

  public static final String SERIALIZED_NAME_SKUS = "skus";
  @SerializedName(SERIALIZED_NAME_SKUS)
  private List<String> skus = new ArrayList<String>();

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchantName";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public StockRequest types(List<TypesEnum> types) {
    this.types = types;
    return this;
  }

  public StockRequest addTypesItem(TypesEnum typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<TypesEnum>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<TypesEnum> getTypes() {
    return types;
  }

  public void setTypes(List<TypesEnum> types) {
    this.types = types;
  }

  public StockRequest skus(List<String> skus) {
    this.skus = skus;
    return this;
  }

  public StockRequest addSkusItem(String skusItem) {
    if (this.skus == null) {
      this.skus = new ArrayList<String>();
    }
    this.skus.add(skusItem);
    return this;
  }

   /**
   * Get skus
   * @return skus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<String> getSkus() {
    return skus;
  }

  public void setSkus(List<String> skus) {
    this.skus = skus;
  }

  public StockRequest merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

   /**
   * Get merchantName
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockRequest stockRequest = (StockRequest) o;
    return Objects.equals(this.types, stockRequest.types) &&
        Objects.equals(this.skus, stockRequest.skus) &&
        Objects.equals(this.merchantName, stockRequest.merchantName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(types, skus, merchantName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockRequest {\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    skus: ").append(toIndentedString(skus)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
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

