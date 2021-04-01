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
import Model.Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifier;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Additional resources for the Payment Instrument token. 
 */
@ApiModel(description = "Additional resources for the Payment Instrument token. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-26T11:59:18.619+05:30")
public class Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbedded {
  @SerializedName("instrumentIdentifier")
  private Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifier instrumentIdentifier = null;

  public Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbedded instrumentIdentifier(Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifier instrumentIdentifier) {
    this.instrumentIdentifier = instrumentIdentifier;
    return this;
  }

   /**
   * Get instrumentIdentifier
   * @return instrumentIdentifier
  **/
  @ApiModelProperty(value = "")
  public Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifier getInstrumentIdentifier() {
    return instrumentIdentifier;
  }

  public void setInstrumentIdentifier(Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbeddedInstrumentIdentifier instrumentIdentifier) {
    this.instrumentIdentifier = instrumentIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbedded tmsv2customersEmbeddedDefaultPaymentInstrumentEmbedded = (Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbedded) o;
    return Objects.equals(this.instrumentIdentifier, tmsv2customersEmbeddedDefaultPaymentInstrumentEmbedded.instrumentIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv2customersEmbeddedDefaultPaymentInstrumentEmbedded {\n");
    
    sb.append("    instrumentIdentifier: ").append(toIndentedString(instrumentIdentifier)).append("\n");
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

