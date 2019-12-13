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
 * PtsV2PaymentsPost201ResponseProcessorInformationCustomer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-09T15:49:19.042+05:30")
public class PtsV2PaymentsPost201ResponseProcessorInformationCustomer {
  @SerializedName("personalIdResult")
  private String personalIdResult = null;

  public PtsV2PaymentsPost201ResponseProcessorInformationCustomer personalIdResult(String personalIdResult) {
    this.personalIdResult = personalIdResult;
    return this;
  }

   /**
   * Personal identifier result. This field is supported only for Redecard in Brazil for CyberSource Latin American Processing. If you included &#x60;buyerInformation.personalIdentification[].ID&#x60; in the request, this value indicates whether or not &#x60;buyerInformation.personalIdentification[].ID&#x60; matched a value in a record on file. Returned only when the personal ID result is returned by the processor.  Possible values:   - **Y**: Match  - **N**: No match  - **K**: Not supported  - **U**: Unknown  - **Z**: No response returned **Note** CyberSource Latin American Processing is the name of a specific processing connection that CyberSource supports. In the CyberSource API documentation, CyberSource Latin American Processing does not refer to the general topic of processing in Latin America.The information in this field description is for the specific processing connection called CyberSource Latin American Processing. It is not for any other Latin American processors that CyberSource supports. 
   * @return personalIdResult
  **/
  @ApiModelProperty(value = "Personal identifier result. This field is supported only for Redecard in Brazil for CyberSource Latin American Processing. If you included `buyerInformation.personalIdentification[].ID` in the request, this value indicates whether or not `buyerInformation.personalIdentification[].ID` matched a value in a record on file. Returned only when the personal ID result is returned by the processor.  Possible values:   - **Y**: Match  - **N**: No match  - **K**: Not supported  - **U**: Unknown  - **Z**: No response returned **Note** CyberSource Latin American Processing is the name of a specific processing connection that CyberSource supports. In the CyberSource API documentation, CyberSource Latin American Processing does not refer to the general topic of processing in Latin America.The information in this field description is for the specific processing connection called CyberSource Latin American Processing. It is not for any other Latin American processors that CyberSource supports. ")
  public String getPersonalIdResult() {
    return personalIdResult;
  }

  public void setPersonalIdResult(String personalIdResult) {
    this.personalIdResult = personalIdResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PaymentsPost201ResponseProcessorInformationCustomer ptsV2PaymentsPost201ResponseProcessorInformationCustomer = (PtsV2PaymentsPost201ResponseProcessorInformationCustomer) o;
    return Objects.equals(this.personalIdResult, ptsV2PaymentsPost201ResponseProcessorInformationCustomer.personalIdResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personalIdResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PaymentsPost201ResponseProcessorInformationCustomer {\n");
    
    sb.append("    personalIdResult: ").append(toIndentedString(personalIdResult)).append("\n");
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

