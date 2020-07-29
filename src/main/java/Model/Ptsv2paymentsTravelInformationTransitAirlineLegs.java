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
 * Ptsv2paymentsTravelInformationTransitAirlineLegs
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-27T16:17:50.788+05:30")
public class Ptsv2paymentsTravelInformationTransitAirlineLegs {
  @SerializedName("carrierCode")
  private String carrierCode = null;

  @SerializedName("flightNumber")
  private String flightNumber = null;

  @SerializedName("originatingAirportCode")
  private String originatingAirportCode = null;

  @SerializedName("class")
  private String propertyClass = null;

  @SerializedName("stopoverIndicator")
  private Integer stopoverIndicator = null;

  @SerializedName("departureDate")
  private Integer departureDate = null;

  @SerializedName("destinationAirportCode")
  private String destinationAirportCode = null;

  @SerializedName("fareBasis")
  private String fareBasis = null;

  @SerializedName("departTaxAmount")
  private String departTaxAmount = null;

  @SerializedName("conjunctionTicket")
  private String conjunctionTicket = null;

  @SerializedName("exchangeTicketNumber")
  private String exchangeTicketNumber = null;

  @SerializedName("couponNumber")
  private String couponNumber = null;

  @SerializedName("departureTime")
  private Integer departureTime = null;

  @SerializedName("departureTimeMeridian")
  private String departureTimeMeridian = null;

  @SerializedName("arrivalTime")
  private Integer arrivalTime = null;

  @SerializedName("arrivalTimeMeridian")
  private String arrivalTimeMeridian = null;

  @SerializedName("endorsementsRestrictions")
  private String endorsementsRestrictions = null;

  @SerializedName("totalFareAmount")
  private String totalFareAmount = null;

  @SerializedName("feeAmount")
  private String feeAmount = null;

  @SerializedName("taxAmount")
  private String taxAmount = null;

  public Ptsv2paymentsTravelInformationTransitAirlineLegs carrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
    return this;
  }

   /**
   * IATA code for the carrier for this leg of the trip. Format: English characters only. Restricted string data type that indicates a sequence of letters, numbers, and spaces; special characters are not included. Optional request field for travel legs. 
   * @return carrierCode
  **/
  @ApiModelProperty(value = "IATA code for the carrier for this leg of the trip. Format: English characters only. Restricted string data type that indicates a sequence of letters, numbers, and spaces; special characters are not included. Optional request field for travel legs. ")
  public String getCarrierCode() {
    return carrierCode;
  }

  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineLegs flightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
    return this;
  }

   /**
   * Flight number for this leg of the trip. Restrictions are limitations for the ticket based on the type of fare, such as a nonrefundable ticket or a 3-day minimum stay. Format: English characters only. Optional request field for travel legs. 
   * @return flightNumber
  **/
  @ApiModelProperty(value = "Flight number for this leg of the trip. Restrictions are limitations for the ticket based on the type of fare, such as a nonrefundable ticket or a 3-day minimum stay. Format: English characters only. Optional request field for travel legs. ")
  public String getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineLegs originatingAirportCode(String originatingAirportCode) {
    this.originatingAirportCode = originatingAirportCode;
    return this;
  }

   /**
   * IATA code for the originating airport for this leg of the trip. Format: English characters only. Restricted string data type that indicates a sequence of letters, numbers, and spaces; special characters are not included. Optional request field for travel legs. 
   * @return originatingAirportCode
  **/
  @ApiModelProperty(value = "IATA code for the originating airport for this leg of the trip. Format: English characters only. Restricted string data type that indicates a sequence of letters, numbers, and spaces; special characters are not included. Optional request field for travel legs. ")
  public String getOriginatingAirportCode() {
    return originatingAirportCode;
  }

  public void setOriginatingAirportCode(String originatingAirportCode) {
    this.originatingAirportCode = originatingAirportCode;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineLegs propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * IATA code for the class of service for this leg of the trip. Format: English characters only. Restricted string data type that indicates a sequence of letters, numbers, and spaces; special characters are not included. Optional request field for travel legs. 
   * @return propertyClass
  **/
  @ApiModelProperty(value = "IATA code for the class of service for this leg of the trip. Format: English characters only. Restricted string data type that indicates a sequence of letters, numbers, and spaces; special characters are not included. Optional request field for travel legs. ")
  public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineLegs stopoverIndicator(Integer stopoverIndicator) {
    this.stopoverIndicator = stopoverIndicator;
    return this;
  }

   /**
   * Code that indicates whether a stopover is allowed on this leg of the trip. Possible values: - &#x60;O&#x60; (capital letter “O”) (default): Stopover allowed - &#x60;X&#x60; (capital letter “X”): Stopover not allowed Format: English characters only. Restricted string data type that indicates a sequence of letters, numbers, and spaces; special characters are not included. Optional request field for travel legs. 
   * @return stopoverIndicator
  **/
  @ApiModelProperty(value = "Code that indicates whether a stopover is allowed on this leg of the trip. Possible values: - `O` (capital letter “O”) (default): Stopover allowed - `X` (capital letter “X”): Stopover not allowed Format: English characters only. Restricted string data type that indicates a sequence of letters, numbers, and spaces; special characters are not included. Optional request field for travel legs. ")
  public Integer getStopoverIndicator() {
    return stopoverIndicator;
  }

  public void setStopoverIndicator(Integer stopoverIndicator) {
    this.stopoverIndicator = stopoverIndicator;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineLegs departureDate(Integer departureDate) {
    this.departureDate = departureDate;
    return this;
  }

   /**
   * Departure date for the first leg of the trip. Format: &#x60;YYYYMMDD&#x60;. Format: English characters only. Optional request field for travel legs. 
   * @return departureDate
  **/
  @ApiModelProperty(value = "Departure date for the first leg of the trip. Format: `YYYYMMDD`. Format: English characters only. Optional request field for travel legs. ")
  public Integer getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(Integer departureDate) {
    this.departureDate = departureDate;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineLegs destinationAirportCode(String destinationAirportCode) {
    this.destinationAirportCode = destinationAirportCode;
    return this;
  }

   /**
   * IATA code for the destination airport for this leg of the trip. Format: English characters only. Restricted string data type that indicates a sequence of letters, numbers, and spaces; special characters are not included. Optional request field for travel legs. 
   * @return destinationAirportCode
  **/
  @ApiModelProperty(value = "IATA code for the destination airport for this leg of the trip. Format: English characters only. Restricted string data type that indicates a sequence of letters, numbers, and spaces; special characters are not included. Optional request field for travel legs. ")
  public String getDestinationAirportCode() {
    return destinationAirportCode;
  }

  public void setDestinationAirportCode(String destinationAirportCode) {
    this.destinationAirportCode = destinationAirportCode;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineLegs fareBasis(String fareBasis) {
    this.fareBasis = fareBasis;
    return this;
  }

   /**
   * Code for the fare basis for this leg of the trip. The fare basis is assigned by the carriers and indicates a particular ticket type, such as business class or discounted/nonrefundable. Restricted string data type that indicates a sequence of letters, numbers, and spaces; special characters are not included. Format: English characters only. Optional request field for travel legs.auto_rental_regular_mileage_cost 
   * @return fareBasis
  **/
  @ApiModelProperty(value = "Code for the fare basis for this leg of the trip. The fare basis is assigned by the carriers and indicates a particular ticket type, such as business class or discounted/nonrefundable. Restricted string data type that indicates a sequence of letters, numbers, and spaces; special characters are not included. Format: English characters only. Optional request field for travel legs.auto_rental_regular_mileage_cost ")
  public String getFareBasis() {
    return fareBasis;
  }

  public void setFareBasis(String fareBasis) {
    this.fareBasis = fareBasis;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineLegs departTaxAmount(String departTaxAmount) {
    this.departTaxAmount = departTaxAmount;
    return this;
  }

   /**
   * Amount of departure tax for this leg of the trip. 
   * @return departTaxAmount
  **/
  @ApiModelProperty(value = "Amount of departure tax for this leg of the trip. ")
  public String getDepartTaxAmount() {
    return departTaxAmount;
  }

  public void setDepartTaxAmount(String departTaxAmount) {
    this.departTaxAmount = departTaxAmount;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineLegs conjunctionTicket(String conjunctionTicket) {
    this.conjunctionTicket = conjunctionTicket;
    return this;
  }

   /**
   * Ticket that contains additional coupons for this leg of the trip on an itinerary that has more than four segments. Format: English characters only. Restricted string data type that indicates a sequence of letters, numbers, and spaces; special characters are not included. Optional request field for travel legs. 
   * @return conjunctionTicket
  **/
  @ApiModelProperty(value = "Ticket that contains additional coupons for this leg of the trip on an itinerary that has more than four segments. Format: English characters only. Restricted string data type that indicates a sequence of letters, numbers, and spaces; special characters are not included. Optional request field for travel legs. ")
  public String getConjunctionTicket() {
    return conjunctionTicket;
  }

  public void setConjunctionTicket(String conjunctionTicket) {
    this.conjunctionTicket = conjunctionTicket;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineLegs exchangeTicketNumber(String exchangeTicketNumber) {
    this.exchangeTicketNumber = exchangeTicketNumber;
    return this;
  }

   /**
   * New ticket number that is issued when the ticket is exchanged for this leg of the trip. Restrictions are limitations for the ticket based on the type of fare, such as a nonrefundable ticket or a 3-day minimum stay. Format: English characters only. Optional request field for travel legs. 
   * @return exchangeTicketNumber
  **/
  @ApiModelProperty(value = "New ticket number that is issued when the ticket is exchanged for this leg of the trip. Restrictions are limitations for the ticket based on the type of fare, such as a nonrefundable ticket or a 3-day minimum stay. Format: English characters only. Optional request field for travel legs. ")
  public String getExchangeTicketNumber() {
    return exchangeTicketNumber;
  }

  public void setExchangeTicketNumber(String exchangeTicketNumber) {
    this.exchangeTicketNumber = exchangeTicketNumber;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineLegs couponNumber(String couponNumber) {
    this.couponNumber = couponNumber;
    return this;
  }

   /**
   * Coupon number. Each leg on the ticket requires a separate coupon, and each coupon is identified by the coupon number. Format: English characters only. Restricted string data type that indicates a sequence of letters, numbers, and spaces; special characters are not included. Optional request field for travel legs. 
   * @return couponNumber
  **/
  @ApiModelProperty(value = "Coupon number. Each leg on the ticket requires a separate coupon, and each coupon is identified by the coupon number. Format: English characters only. Restricted string data type that indicates a sequence of letters, numbers, and spaces; special characters are not included. Optional request field for travel legs. ")
  public String getCouponNumber() {
    return couponNumber;
  }

  public void setCouponNumber(String couponNumber) {
    this.couponNumber = couponNumber;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineLegs departureTime(Integer departureTime) {
    this.departureTime = departureTime;
    return this;
  }

   /**
   * Time of departure for this leg of the trip. The format is military time and HHMM: If not all zeros, then the hours must be &#x60;00-23&#x60; and the minutes must be &#x60;00-59&#x60;. Format: English characters only. Optional request field for travel legs. 
   * @return departureTime
  **/
  @ApiModelProperty(value = "Time of departure for this leg of the trip. The format is military time and HHMM: If not all zeros, then the hours must be `00-23` and the minutes must be `00-59`. Format: English characters only. Optional request field for travel legs. ")
  public Integer getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(Integer departureTime) {
    this.departureTime = departureTime;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineLegs departureTimeMeridian(String departureTimeMeridian) {
    this.departureTimeMeridian = departureTimeMeridian;
    return this;
  }

   /**
   * AM or PM for the departure time. Possible values: - A: 12:00 midnight to 11:59 a.m. - P: 12:00 noon to 11:59 p.m Format: English characters only. Restricted string data type that indicates a sequence of letters, numbers, and spaces; special characters are not included. Optional request field for travel legs. 
   * @return departureTimeMeridian
  **/
  @ApiModelProperty(value = "AM or PM for the departure time. Possible values: - A: 12:00 midnight to 11:59 a.m. - P: 12:00 noon to 11:59 p.m Format: English characters only. Restricted string data type that indicates a sequence of letters, numbers, and spaces; special characters are not included. Optional request field for travel legs. ")
  public String getDepartureTimeMeridian() {
    return departureTimeMeridian;
  }

  public void setDepartureTimeMeridian(String departureTimeMeridian) {
    this.departureTimeMeridian = departureTimeMeridian;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineLegs arrivalTime(Integer arrivalTime) {
    this.arrivalTime = arrivalTime;
    return this;
  }

   /**
   * Time of arrival for this leg of the trip. The format is military time and HHMM: If not all zeros, then the hours must be &#x60;00-23&#x60; and the minutes must be &#x60;00-59&#x60; Format: English characters only. Optional request field for travel legs. 
   * @return arrivalTime
  **/
  @ApiModelProperty(value = "Time of arrival for this leg of the trip. The format is military time and HHMM: If not all zeros, then the hours must be `00-23` and the minutes must be `00-59` Format: English characters only. Optional request field for travel legs. ")
  public Integer getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(Integer arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineLegs arrivalTimeMeridian(String arrivalTimeMeridian) {
    this.arrivalTimeMeridian = arrivalTimeMeridian;
    return this;
  }

   /**
   * AM or PM for the arrival time for this leg of the trip. Possible values: - &#x60;A&#x60;: 12:00 midnight to 11:59 a.m. - &#x60;P&#x60;: 12:00 noon to 11:59 p.m. Format: English characters only. Restricted string data type that indicates a sequence of letters, numbers, and spaces; special characters are not included. Optional request field for travel legs. 
   * @return arrivalTimeMeridian
  **/
  @ApiModelProperty(value = "AM or PM for the arrival time for this leg of the trip. Possible values: - `A`: 12:00 midnight to 11:59 a.m. - `P`: 12:00 noon to 11:59 p.m. Format: English characters only. Restricted string data type that indicates a sequence of letters, numbers, and spaces; special characters are not included. Optional request field for travel legs. ")
  public String getArrivalTimeMeridian() {
    return arrivalTimeMeridian;
  }

  public void setArrivalTimeMeridian(String arrivalTimeMeridian) {
    this.arrivalTimeMeridian = arrivalTimeMeridian;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineLegs endorsementsRestrictions(String endorsementsRestrictions) {
    this.endorsementsRestrictions = endorsementsRestrictions;
    return this;
  }

   /**
   * Notes or notations about endorsements and restrictions for this leg of the trip. Endorsements can be notations added by the travel agency, including mandatory government-required notations such as value added tax. Restrictions are limitations for the ticket based on the type of fare, such as a nonrefundable ticket or a 3-day minimum stay. Format: English characters only. Optional request field for travel legs. 
   * @return endorsementsRestrictions
  **/
  @ApiModelProperty(value = "Notes or notations about endorsements and restrictions for this leg of the trip. Endorsements can be notations added by the travel agency, including mandatory government-required notations such as value added tax. Restrictions are limitations for the ticket based on the type of fare, such as a nonrefundable ticket or a 3-day minimum stay. Format: English characters only. Optional request field for travel legs. ")
  public String getEndorsementsRestrictions() {
    return endorsementsRestrictions;
  }

  public void setEndorsementsRestrictions(String endorsementsRestrictions) {
    this.endorsementsRestrictions = endorsementsRestrictions;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineLegs totalFareAmount(String totalFareAmount) {
    this.totalFareAmount = totalFareAmount;
    return this;
  }

   /**
   * Total fare for this leg of the trip. Format: English characters only. Optional request field for travel legs. 
   * @return totalFareAmount
  **/
  @ApiModelProperty(value = "Total fare for this leg of the trip. Format: English characters only. Optional request field for travel legs. ")
  public String getTotalFareAmount() {
    return totalFareAmount;
  }

  public void setTotalFareAmount(String totalFareAmount) {
    this.totalFareAmount = totalFareAmount;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineLegs feeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

   /**
   * Fee for this leg of the trip, such as an airport fee or country fee. Format: English characters only. Optional request field for travel legs. 
   * @return feeAmount
  **/
  @ApiModelProperty(value = "Fee for this leg of the trip, such as an airport fee or country fee. Format: English characters only. Optional request field for travel legs. ")
  public String getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }

  public Ptsv2paymentsTravelInformationTransitAirlineLegs taxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Tax for this leg of the trip. Format: English characters only. Optional request field for travel legs. 
   * @return taxAmount
  **/
  @ApiModelProperty(value = "Tax for this leg of the trip. Format: English characters only. Optional request field for travel legs. ")
  public String getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsTravelInformationTransitAirlineLegs ptsv2paymentsTravelInformationTransitAirlineLegs = (Ptsv2paymentsTravelInformationTransitAirlineLegs) o;
    return Objects.equals(this.carrierCode, ptsv2paymentsTravelInformationTransitAirlineLegs.carrierCode) &&
        Objects.equals(this.flightNumber, ptsv2paymentsTravelInformationTransitAirlineLegs.flightNumber) &&
        Objects.equals(this.originatingAirportCode, ptsv2paymentsTravelInformationTransitAirlineLegs.originatingAirportCode) &&
        Objects.equals(this.propertyClass, ptsv2paymentsTravelInformationTransitAirlineLegs.propertyClass) &&
        Objects.equals(this.stopoverIndicator, ptsv2paymentsTravelInformationTransitAirlineLegs.stopoverIndicator) &&
        Objects.equals(this.departureDate, ptsv2paymentsTravelInformationTransitAirlineLegs.departureDate) &&
        Objects.equals(this.destinationAirportCode, ptsv2paymentsTravelInformationTransitAirlineLegs.destinationAirportCode) &&
        Objects.equals(this.fareBasis, ptsv2paymentsTravelInformationTransitAirlineLegs.fareBasis) &&
        Objects.equals(this.departTaxAmount, ptsv2paymentsTravelInformationTransitAirlineLegs.departTaxAmount) &&
        Objects.equals(this.conjunctionTicket, ptsv2paymentsTravelInformationTransitAirlineLegs.conjunctionTicket) &&
        Objects.equals(this.exchangeTicketNumber, ptsv2paymentsTravelInformationTransitAirlineLegs.exchangeTicketNumber) &&
        Objects.equals(this.couponNumber, ptsv2paymentsTravelInformationTransitAirlineLegs.couponNumber) &&
        Objects.equals(this.departureTime, ptsv2paymentsTravelInformationTransitAirlineLegs.departureTime) &&
        Objects.equals(this.departureTimeMeridian, ptsv2paymentsTravelInformationTransitAirlineLegs.departureTimeMeridian) &&
        Objects.equals(this.arrivalTime, ptsv2paymentsTravelInformationTransitAirlineLegs.arrivalTime) &&
        Objects.equals(this.arrivalTimeMeridian, ptsv2paymentsTravelInformationTransitAirlineLegs.arrivalTimeMeridian) &&
        Objects.equals(this.endorsementsRestrictions, ptsv2paymentsTravelInformationTransitAirlineLegs.endorsementsRestrictions) &&
        Objects.equals(this.totalFareAmount, ptsv2paymentsTravelInformationTransitAirlineLegs.totalFareAmount) &&
        Objects.equals(this.feeAmount, ptsv2paymentsTravelInformationTransitAirlineLegs.feeAmount) &&
        Objects.equals(this.taxAmount, ptsv2paymentsTravelInformationTransitAirlineLegs.taxAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierCode, flightNumber, originatingAirportCode, propertyClass, stopoverIndicator, departureDate, destinationAirportCode, fareBasis, departTaxAmount, conjunctionTicket, exchangeTicketNumber, couponNumber, departureTime, departureTimeMeridian, arrivalTime, arrivalTimeMeridian, endorsementsRestrictions, totalFareAmount, feeAmount, taxAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsTravelInformationTransitAirlineLegs {\n");
    
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    flightNumber: ").append(toIndentedString(flightNumber)).append("\n");
    sb.append("    originatingAirportCode: ").append(toIndentedString(originatingAirportCode)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    stopoverIndicator: ").append(toIndentedString(stopoverIndicator)).append("\n");
    sb.append("    departureDate: ").append(toIndentedString(departureDate)).append("\n");
    sb.append("    destinationAirportCode: ").append(toIndentedString(destinationAirportCode)).append("\n");
    sb.append("    fareBasis: ").append(toIndentedString(fareBasis)).append("\n");
    sb.append("    departTaxAmount: ").append(toIndentedString(departTaxAmount)).append("\n");
    sb.append("    conjunctionTicket: ").append(toIndentedString(conjunctionTicket)).append("\n");
    sb.append("    exchangeTicketNumber: ").append(toIndentedString(exchangeTicketNumber)).append("\n");
    sb.append("    couponNumber: ").append(toIndentedString(couponNumber)).append("\n");
    sb.append("    departureTime: ").append(toIndentedString(departureTime)).append("\n");
    sb.append("    departureTimeMeridian: ").append(toIndentedString(departureTimeMeridian)).append("\n");
    sb.append("    arrivalTime: ").append(toIndentedString(arrivalTime)).append("\n");
    sb.append("    arrivalTimeMeridian: ").append(toIndentedString(arrivalTimeMeridian)).append("\n");
    sb.append("    endorsementsRestrictions: ").append(toIndentedString(endorsementsRestrictions)).append("\n");
    sb.append("    totalFareAmount: ").append(toIndentedString(totalFareAmount)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
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
