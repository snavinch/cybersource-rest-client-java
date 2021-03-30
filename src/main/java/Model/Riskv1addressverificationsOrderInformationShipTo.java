/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Riskv1addressverificationsOrderInformationShipTo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-26T11:59:18.619+05:30")
public class Riskv1addressverificationsOrderInformationShipTo {
  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("address3")
  private String address3 = null;

  @SerializedName("address4")
  private String address4 = null;

  @SerializedName("administrativeArea")
  private String administrativeArea = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  public Riskv1addressverificationsOrderInformationShipTo address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * First line of the shipping address.  Required field for authorization if any shipping address information is included in the request; otherwise, optional.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. 
   * @return address1
  **/
  @ApiModelProperty(required = true, value = "First line of the shipping address.  Required field for authorization if any shipping address information is included in the request; otherwise, optional.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. ")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Riskv1addressverificationsOrderInformationShipTo address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Second line of the shipping address.  Optional field.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. 
   * @return address2
  **/
  @ApiModelProperty(value = "Second line of the shipping address.  Optional field.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. ")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Riskv1addressverificationsOrderInformationShipTo address3(String address3) {
    this.address3 = address3;
    return this;
  }

   /**
   * Third line of the shipping address.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. 
   * @return address3
  **/
  @ApiModelProperty(value = "Third line of the shipping address.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. ")
  public String getAddress3() {
    return address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public Riskv1addressverificationsOrderInformationShipTo address4(String address4) {
    this.address4 = address4;
    return this;
  }

   /**
   * Fourth line of the shipping address.
   * @return address4
  **/
  @ApiModelProperty(value = "Fourth line of the shipping address.")
  public String getAddress4() {
    return address4;
  }

  public void setAddress4(String address4) {
    this.address4 = address4;
  }

  public Riskv1addressverificationsOrderInformationShipTo administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * State or province of the shipping address. Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf)  Required field for authorization if any shipping address information is included in the request and shipping to the U.S. or Canada; otherwise, optional.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. 
   * @return administrativeArea
  **/
  @ApiModelProperty(value = "State or province of the shipping address. Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf)  Required field for authorization if any shipping address information is included in the request and shipping to the U.S. or Canada; otherwise, optional.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. ")
  public String getAdministrativeArea() {
    return administrativeArea;
  }

  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }

  public Riskv1addressverificationsOrderInformationShipTo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of the shipping address. Use the two-character [ISO Standard Country Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf)  Required field for authorization if any shipping address information is included in the request; otherwise, optional.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. 
   * @return country
  **/
  @ApiModelProperty(required = true, value = "Country of the shipping address. Use the two-character [ISO Standard Country Codes.](http://apps.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf)  Required field for authorization if any shipping address information is included in the request; otherwise, optional.  #### Tax Calculation Optional field for U.S., Canadian, international tax, and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Riskv1addressverificationsOrderInformationShipTo locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * City of the shipping address.  Required field for authorization if any shipping address information is included in the request and shipping to the U.S. or Canada; otherwise, optional.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. 
   * @return locality
  **/
  @ApiModelProperty(value = "City of the shipping address.  Required field for authorization if any shipping address information is included in the request and shipping to the U.S. or Canada; otherwise, optional.  #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. ")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Riskv1addressverificationsOrderInformationShipTo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code for the shipping address. The postal code must consist of 5 to 9 digits.  Required field for authorization if any shipping address information is included in the request and shipping to the U.S. or Canada; otherwise, optional.  When the billing country is the U.S., the 9-digit postal code must follow this format: [5 digits][dash][4 digits]  Example 12345-6789  When the billing country is Canada, the 6-digit postal code must follow this format: [alpha][numeric][alpha][space][numeric][alpha][numeric]  Example A1B 2C3  #### American Express Direct Before sending the postal code to the processor, all nonalphanumeric characters are removed and, if the remaining value is longer than nine characters, the value is truncated starting from the right side. #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. 
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code for the shipping address. The postal code must consist of 5 to 9 digits.  Required field for authorization if any shipping address information is included in the request and shipping to the U.S. or Canada; otherwise, optional.  When the billing country is the U.S., the 9-digit postal code must follow this format: [5 digits][dash][4 digits]  Example 12345-6789  When the billing country is Canada, the 6-digit postal code must follow this format: [alpha][numeric][alpha][space][numeric][alpha][numeric]  Example A1B 2C3  #### American Express Direct Before sending the postal code to the processor, all nonalphanumeric characters are removed and, if the remaining value is longer than nine characters, the value is truncated starting from the right side. #### Tax Calculation Optional field for U.S. and Canadian taxes. Not applicable to international and value added taxes. Billing address objects will be used to determine the cardholder’s location when shipTo objects are not present. ")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1addressverificationsOrderInformationShipTo riskv1addressverificationsOrderInformationShipTo = (Riskv1addressverificationsOrderInformationShipTo) o;
    return Objects.equals(this.address1, riskv1addressverificationsOrderInformationShipTo.address1) &&
        Objects.equals(this.address2, riskv1addressverificationsOrderInformationShipTo.address2) &&
        Objects.equals(this.address3, riskv1addressverificationsOrderInformationShipTo.address3) &&
        Objects.equals(this.address4, riskv1addressverificationsOrderInformationShipTo.address4) &&
        Objects.equals(this.administrativeArea, riskv1addressverificationsOrderInformationShipTo.administrativeArea) &&
        Objects.equals(this.country, riskv1addressverificationsOrderInformationShipTo.country) &&
        Objects.equals(this.locality, riskv1addressverificationsOrderInformationShipTo.locality) &&
        Objects.equals(this.postalCode, riskv1addressverificationsOrderInformationShipTo.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, address3, address4, administrativeArea, country, locality, postalCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1addressverificationsOrderInformationShipTo {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    address3: ").append(toIndentedString(address3)).append("\n");
    sb.append("    address4: ").append(toIndentedString(address4)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

