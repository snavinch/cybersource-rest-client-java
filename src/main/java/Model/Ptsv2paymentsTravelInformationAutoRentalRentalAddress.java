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
 * Ptsv2paymentsTravelInformationAutoRentalRentalAddress
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-27T16:17:50.788+05:30")
public class Ptsv2paymentsTravelInformationAutoRentalRentalAddress {
  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("locationId")
  private String locationId = null;

  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("location")
  private String location = null;

  public Ptsv2paymentsTravelInformationAutoRentalRentalAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City in which the auto was rented.  For authorizations, this field is supported for Visa, MasterCard, and American Express.  For captures, this field is supported only for American Express.  For all other card types, this field is ignored. 
   * @return city
  **/
  @ApiModelProperty(value = "City in which the auto was rented.  For authorizations, this field is supported for Visa, MasterCard, and American Express.  For captures, this field is supported only for American Express.  For all other card types, this field is ignored. ")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Ptsv2paymentsTravelInformationAutoRentalRentalAddress state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State in which the auto was rented. Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf). 
   * @return state
  **/
  @ApiModelProperty(value = "State in which the auto was rented. Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf). ")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Ptsv2paymentsTravelInformationAutoRentalRentalAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country where the auto was rented. Use the [ISO Standard Country Codes.](https://developer.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf) This field is supported only for American Express. 
   * @return country
  **/
  @ApiModelProperty(value = "Country where the auto was rented. Use the [ISO Standard Country Codes.](https://developer.cybersource.com/library/documentation/sbc/quickref/countries_alpha_list.pdf) This field is supported only for American Express. ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Ptsv2paymentsTravelInformationAutoRentalRentalAddress locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * The agency code, address, phone number, etc., used to identify the location where the vehicle was rented. 
   * @return locationId
  **/
  @ApiModelProperty(value = "The agency code, address, phone number, etc., used to identify the location where the vehicle was rented. ")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public Ptsv2paymentsTravelInformationAutoRentalRentalAddress address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Address from where the vehicle was rented. 
   * @return address1
  **/
  @ApiModelProperty(value = "Address from where the vehicle was rented. ")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Ptsv2paymentsTravelInformationAutoRentalRentalAddress address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Address from where the vehicle was rented. 
   * @return address2
  **/
  @ApiModelProperty(value = "Address from where the vehicle was rented. ")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Ptsv2paymentsTravelInformationAutoRentalRentalAddress location(String location) {
    this.location = location;
    return this;
  }

   /**
   * This field contains the location where a taxi passenger was picked up or where an auto rental vehicle was picked up. In most cases, this is the rental agency&#39;s business name that appears on the storefront and/or customer receipts, commonly referred to as the DBA (Doing Business As) name. However, if the vehicle was picked up at another location (e.g., a hotel,auto dealership, repair shop, etc.), the name of that location should be used. This entry must be easily recognized by the Cardmember to avoid unnecessary inquiries. If the name is more than 38  characters, use proper and meaningful abbreviation, when possible. 
   * @return location
  **/
  @ApiModelProperty(value = "This field contains the location where a taxi passenger was picked up or where an auto rental vehicle was picked up. In most cases, this is the rental agency's business name that appears on the storefront and/or customer receipts, commonly referred to as the DBA (Doing Business As) name. However, if the vehicle was picked up at another location (e.g., a hotel,auto dealership, repair shop, etc.), the name of that location should be used. This entry must be easily recognized by the Cardmember to avoid unnecessary inquiries. If the name is more than 38  characters, use proper and meaningful abbreviation, when possible. ")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsTravelInformationAutoRentalRentalAddress ptsv2paymentsTravelInformationAutoRentalRentalAddress = (Ptsv2paymentsTravelInformationAutoRentalRentalAddress) o;
    return Objects.equals(this.city, ptsv2paymentsTravelInformationAutoRentalRentalAddress.city) &&
        Objects.equals(this.state, ptsv2paymentsTravelInformationAutoRentalRentalAddress.state) &&
        Objects.equals(this.country, ptsv2paymentsTravelInformationAutoRentalRentalAddress.country) &&
        Objects.equals(this.locationId, ptsv2paymentsTravelInformationAutoRentalRentalAddress.locationId) &&
        Objects.equals(this.address1, ptsv2paymentsTravelInformationAutoRentalRentalAddress.address1) &&
        Objects.equals(this.address2, ptsv2paymentsTravelInformationAutoRentalRentalAddress.address2) &&
        Objects.equals(this.location, ptsv2paymentsTravelInformationAutoRentalRentalAddress.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, state, country, locationId, address1, address2, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsTravelInformationAutoRentalRentalAddress {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
