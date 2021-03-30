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
 * Ptsv2paymentsProcessingInformationPurchaseOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-26T11:59:18.619+05:30")
public class Ptsv2paymentsProcessingInformationPurchaseOptions {
  @SerializedName("isElectronicBenefitsTransfer")
  private Boolean isElectronicBenefitsTransfer = null;

  @SerializedName("type")
  private String type = null;

  public Ptsv2paymentsProcessingInformationPurchaseOptions isElectronicBenefitsTransfer(Boolean isElectronicBenefitsTransfer) {
    this.isElectronicBenefitsTransfer = isElectronicBenefitsTransfer;
    return this;
  }

   /**
   * Flag that indicates whether this transaction is an EBT transaction. Possible values: - &#x60;true&#x60; - &#x60;false&#x60;  #### PIN debit Required field for EBT and EBT voucher transactions that use PIN debit credit or PIN debit purchase; otherwise, not used. 
   * @return isElectronicBenefitsTransfer
  **/
  @ApiModelProperty(value = "Flag that indicates whether this transaction is an EBT transaction. Possible values: - `true` - `false`  #### PIN debit Required field for EBT and EBT voucher transactions that use PIN debit credit or PIN debit purchase; otherwise, not used. ")
  public Boolean getIsElectronicBenefitsTransfer() {
    return isElectronicBenefitsTransfer;
  }

  public void setIsElectronicBenefitsTransfer(Boolean isElectronicBenefitsTransfer) {
    this.isElectronicBenefitsTransfer = isElectronicBenefitsTransfer;
  }

  public Ptsv2paymentsProcessingInformationPurchaseOptions type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Flag that indicates an EBT voucher transaction. Possible value: - &#x60;EBT_VOUCHER&#x60;: Indicates the PIN debit transaction is an EBT voucher.  #### PIN debit Required field for EBT voucher transactions that use PIN debit purchase; otherwise, not used. 
   * @return type
  **/
  @ApiModelProperty(value = "Flag that indicates an EBT voucher transaction. Possible value: - `EBT_VOUCHER`: Indicates the PIN debit transaction is an EBT voucher.  #### PIN debit Required field for EBT voucher transactions that use PIN debit purchase; otherwise, not used. ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsProcessingInformationPurchaseOptions ptsv2paymentsProcessingInformationPurchaseOptions = (Ptsv2paymentsProcessingInformationPurchaseOptions) o;
    return Objects.equals(this.isElectronicBenefitsTransfer, ptsv2paymentsProcessingInformationPurchaseOptions.isElectronicBenefitsTransfer) &&
        Objects.equals(this.type, ptsv2paymentsProcessingInformationPurchaseOptions.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isElectronicBenefitsTransfer, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsProcessingInformationPurchaseOptions {\n");
    
    sb.append("    isElectronicBenefitsTransfer: ").append(toIndentedString(isElectronicBenefitsTransfer)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

