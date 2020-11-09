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
 * Riskv1authenticationsetupsPaymentInformationCustomer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-30T13:05:11.653+05:30")
public class Riskv1authenticationsetupsPaymentInformationCustomer {
  @SerializedName("customerId")
  private String customerId = null;

  public Riskv1authenticationsetupsPaymentInformationCustomer customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Unique identifier for the legacy Secure Storage token used in the transaction. When you include this value in your request, many of the fields that are normally required for an authorization or credit become optional. 
   * @return customerId
  **/
  @ApiModelProperty(value = "Unique identifier for the legacy Secure Storage token used in the transaction. When you include this value in your request, many of the fields that are normally required for an authorization or credit become optional. ")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1authenticationsetupsPaymentInformationCustomer riskv1authenticationsetupsPaymentInformationCustomer = (Riskv1authenticationsetupsPaymentInformationCustomer) o;
    return Objects.equals(this.customerId, riskv1authenticationsetupsPaymentInformationCustomer.customerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1authenticationsetupsPaymentInformationCustomer {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
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

