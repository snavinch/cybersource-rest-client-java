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
 * TssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-26T11:59:18.619+05:30")
public class TssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType {
  @SerializedName("type")
  private String type = null;

  @SerializedName("method")
  private String method = null;

  public TssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Indicates the payment type used in this payment transaction. Example: credit card, check
   * @return type
  **/
  @ApiModelProperty(value = "Indicates the payment type used in this payment transaction. Example: credit card, check")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Indicates the payment method used in this payment transaction.
   * @return method
  **/
  @ApiModelProperty(value = "Indicates the payment method used in this payment transaction.")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType tssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType = (TssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType) o;
    return Objects.equals(this.type, tssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType.type) &&
        Objects.equals(this.method, tssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, method);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedPaymentInformationPaymentType {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

