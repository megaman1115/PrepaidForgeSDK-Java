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
import com.prepaidforge.client.model.Country;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * CountryPriceException
 */

public class CountryPriceException {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_UPDATED = "dateUpdated";
  @SerializedName(SERIALIZED_NAME_DATE_UPDATED)
  private OffsetDateTime dateUpdated;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private Country country = null;

  /**
   * Gets or Sets productCategory
   */
  @JsonAdapter(ProductCategoryEnum.Adapter.class)
  public enum ProductCategoryEnum {
    GIFTCARD("GIFTCARD"),
    
    PREPAID_PHONE("PREPAID_PHONE"),
    
    PREPAID_INTERNET("PREPAID_INTERNET"),
    
    GAME("GAME");

    private String value;

    ProductCategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProductCategoryEnum fromValue(String value) {
      for (ProductCategoryEnum b : ProductCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProductCategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProductCategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProductCategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ProductCategoryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PRODUCT_CATEGORY = "productCategory";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CATEGORY)
  private ProductCategoryEnum productCategory;

  public static final String SERIALIZED_NAME_EXTRA_COST_PERCENTAGE = "extraCostPercentage";
  @SerializedName(SERIALIZED_NAME_EXTRA_COST_PERCENTAGE)
  private BigDecimal extraCostPercentage;

  public CountryPriceException id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CountryPriceException dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public CountryPriceException dateUpdated(OffsetDateTime dateUpdated) {
    this.dateUpdated = dateUpdated;
    return this;
  }

   /**
   * Get dateUpdated
   * @return dateUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateUpdated() {
    return dateUpdated;
  }

  public void setDateUpdated(OffsetDateTime dateUpdated) {
    this.dateUpdated = dateUpdated;
  }

  public CountryPriceException country(Country country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public CountryPriceException productCategory(ProductCategoryEnum productCategory) {
    this.productCategory = productCategory;
    return this;
  }

   /**
   * Get productCategory
   * @return productCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public ProductCategoryEnum getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(ProductCategoryEnum productCategory) {
    this.productCategory = productCategory;
  }

  public CountryPriceException extraCostPercentage(BigDecimal extraCostPercentage) {
    this.extraCostPercentage = extraCostPercentage;
    return this;
  }

   /**
   * Get extraCostPercentage
   * @return extraCostPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public BigDecimal getExtraCostPercentage() {
    return extraCostPercentage;
  }

  public void setExtraCostPercentage(BigDecimal extraCostPercentage) {
    this.extraCostPercentage = extraCostPercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryPriceException countryPriceException = (CountryPriceException) o;
    return Objects.equals(this.id, countryPriceException.id) &&
        Objects.equals(this.dateCreated, countryPriceException.dateCreated) &&
        Objects.equals(this.dateUpdated, countryPriceException.dateUpdated) &&
        Objects.equals(this.country, countryPriceException.country) &&
        Objects.equals(this.productCategory, countryPriceException.productCategory) &&
        Objects.equals(this.extraCostPercentage, countryPriceException.extraCostPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateCreated, dateUpdated, country, productCategory, extraCostPercentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryPriceException {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    extraCostPercentage: ").append(toIndentedString(extraCostPercentage)).append("\n");
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

