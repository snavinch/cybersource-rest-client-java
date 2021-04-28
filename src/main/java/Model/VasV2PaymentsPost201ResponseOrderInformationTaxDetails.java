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
 * VasV2PaymentsPost201ResponseOrderInformationTaxDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-21T20:24:19.795+05:30")
public class VasV2PaymentsPost201ResponseOrderInformationTaxDetails {
  @SerializedName("type")
  private String type = null;

  @SerializedName("amount")
  private String amount = null;

  public VasV2PaymentsPost201ResponseOrderInformationTaxDetails type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Allowed tax types: - city - county - state - national - special 
   * @return type
  **/
  @ApiModelProperty(value = "Allowed tax types: - city - county - state - national - special ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public VasV2PaymentsPost201ResponseOrderInformationTaxDetails amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount corresponding to different types of taxes applied. 
   * @return amount
  **/
  @ApiModelProperty(value = "Amount corresponding to different types of taxes applied. ")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VasV2PaymentsPost201ResponseOrderInformationTaxDetails vasV2PaymentsPost201ResponseOrderInformationTaxDetails = (VasV2PaymentsPost201ResponseOrderInformationTaxDetails) o;
    return Objects.equals(this.type, vasV2PaymentsPost201ResponseOrderInformationTaxDetails.type) &&
        Objects.equals(this.amount, vasV2PaymentsPost201ResponseOrderInformationTaxDetails.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VasV2PaymentsPost201ResponseOrderInformationTaxDetails {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

