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
 * PtsV1TransactionBatchesGet400ResponseErrorInformationDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-21T20:24:19.795+05:30")
public class PtsV1TransactionBatchesGet400ResponseErrorInformationDetails {
  @SerializedName("field")
  private String field = null;

  @SerializedName("message")
  private String message = null;

  public PtsV1TransactionBatchesGet400ResponseErrorInformationDetails field(String field) {
    this.field = field;
    return this;
  }

   /**
   * This is the flattened JSON object field name/path that is either missing or invalid. 
   * @return field
  **/
  @ApiModelProperty(value = "This is the flattened JSON object field name/path that is either missing or invalid. ")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public PtsV1TransactionBatchesGet400ResponseErrorInformationDetails message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The detailed message related to the status and reason listed above. 
   * @return message
  **/
  @ApiModelProperty(value = "The detailed message related to the status and reason listed above. ")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV1TransactionBatchesGet400ResponseErrorInformationDetails ptsV1TransactionBatchesGet400ResponseErrorInformationDetails = (PtsV1TransactionBatchesGet400ResponseErrorInformationDetails) o;
    return Objects.equals(this.field, ptsV1TransactionBatchesGet400ResponseErrorInformationDetails.field) &&
        Objects.equals(this.message, ptsV1TransactionBatchesGet400ResponseErrorInformationDetails.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV1TransactionBatchesGet400ResponseErrorInformationDetails {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

