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
import Model.PtsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2IncrementalAuthorizationPatch201ResponseProcessorInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-30T13:05:11.653+05:30")
public class PtsV2IncrementalAuthorizationPatch201ResponseProcessorInformation {
  @SerializedName("approvalCode")
  private String approvalCode = null;

  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("responseCode")
  private String responseCode = null;

  @SerializedName("systemTraceAuditNumber")
  private String systemTraceAuditNumber = null;

  @SerializedName("responseDetails")
  private String responseDetails = null;

  @SerializedName("merchantAdvice")
  private PtsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice merchantAdvice = null;

  public PtsV2IncrementalAuthorizationPatch201ResponseProcessorInformation approvalCode(String approvalCode) {
    this.approvalCode = approvalCode;
    return this;
  }

   /**
   * Authorization code. Returned only when the processor returns this value.  The length of this value depends on your processor.  Returned by authorization service.  #### PIN debit Authorization code that is returned by the processor.  Returned by PIN debit credit.  #### Elavon Encrypted Account Number Program The returned value is OFFLINE.  #### TSYS Acquiring Solutions The returned value for a successful zero amount authorization is 000000. 
   * @return approvalCode
  **/
  @ApiModelProperty(value = "Authorization code. Returned only when the processor returns this value.  The length of this value depends on your processor.  Returned by authorization service.  #### PIN debit Authorization code that is returned by the processor.  Returned by PIN debit credit.  #### Elavon Encrypted Account Number Program The returned value is OFFLINE.  #### TSYS Acquiring Solutions The returned value for a successful zero amount authorization is 000000. ")
  public String getApprovalCode() {
    return approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }

  public PtsV2IncrementalAuthorizationPatch201ResponseProcessorInformation transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Network transaction identifier (TID). You can use this value to identify a specific transaction when you are discussing the transaction with your processor. Not all processors provide this value.  Returned by the authorization service.  #### PIN debit Transaction identifier generated by the processor.  Returned by PIN debit credit.  #### GPX Processor transaction ID.  #### Cielo For Cielo, this value is the non-sequential unit (NSU) and is supported for all transactions. The value is generated by Cielo or the issuing bank.  #### Comercio Latino For Comercio Latino, this value is the proof of sale or non-sequential unit (NSU) number generated by the acquirers Cielo and Rede, or the issuing bank.  #### CyberSource through VisaNet and GPN For details about this value for CyberSource through VisaNet and GPN, see \&quot;Network Transaction Identifiers\&quot; in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### Moneris This value identifies the transaction on a host system. It contains the following information: - Terminal used to process the transaction - Shift during which the transaction took place - Batch number - Transaction number within the batch You must store this value. If you give the customer a receipt, display this value on the receipt.  **Example** For the value 66012345001069003: - Terminal ID &#x3D; 66012345 - Shift number &#x3D; 001 - Batch number &#x3D; 069 - Transaction number &#x3D; 003 
   * @return transactionId
  **/
  @ApiModelProperty(value = "Network transaction identifier (TID). You can use this value to identify a specific transaction when you are discussing the transaction with your processor. Not all processors provide this value.  Returned by the authorization service.  #### PIN debit Transaction identifier generated by the processor.  Returned by PIN debit credit.  #### GPX Processor transaction ID.  #### Cielo For Cielo, this value is the non-sequential unit (NSU) and is supported for all transactions. The value is generated by Cielo or the issuing bank.  #### Comercio Latino For Comercio Latino, this value is the proof of sale or non-sequential unit (NSU) number generated by the acquirers Cielo and Rede, or the issuing bank.  #### CyberSource through VisaNet and GPN For details about this value for CyberSource through VisaNet and GPN, see \"Network Transaction Identifiers\" in [Credit Card Services Using the SCMP API.](https://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html/)  #### Moneris This value identifies the transaction on a host system. It contains the following information: - Terminal used to process the transaction - Shift during which the transaction took place - Batch number - Transaction number within the batch You must store this value. If you give the customer a receipt, display this value on the receipt.  **Example** For the value 66012345001069003: - Terminal ID = 66012345 - Shift number = 001 - Batch number = 069 - Transaction number = 003 ")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public PtsV2IncrementalAuthorizationPatch201ResponseProcessorInformation responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * For most processors, this is the error message sent directly from the bank. Returned only when the processor returns this value.  **Important** Do not use this field to evaluate the result of the authorization.  #### PIN debit Response value that is returned by the processor or bank. **Important** Do not use this field to evaluate the results of the transaction request.  Returned by PIN debit credit, PIN debit purchase, and PIN debit reversal.  #### AIBMS If this value is &#x60;08&#x60;, you can accept the transaction if the customer provides you with identification.  #### Atos This value is the response code sent from Atos and it might also include the response code from the bank. Format: &#x60;aa,bb&#x60; with the two values separated by a comma and where: - &#x60;aa&#x60; is the two-digit error message from Atos. - &#x60;bb&#x60; is the optional two-digit error message from the bank.  #### Comercio Latino This value is the status code and the error or response code received from the processor separated by a colon. Format: [status code]:E[error code] or [status code]:R[response code] Example &#x60;2:R06&#x60;  #### JCN Gateway Processor-defined detail error code. The associated response category code is in the &#x60;processorInformation.responseCategoryCode&#x60; field. String (3) 
   * @return responseCode
  **/
  @ApiModelProperty(value = "For most processors, this is the error message sent directly from the bank. Returned only when the processor returns this value.  **Important** Do not use this field to evaluate the result of the authorization.  #### PIN debit Response value that is returned by the processor or bank. **Important** Do not use this field to evaluate the results of the transaction request.  Returned by PIN debit credit, PIN debit purchase, and PIN debit reversal.  #### AIBMS If this value is `08`, you can accept the transaction if the customer provides you with identification.  #### Atos This value is the response code sent from Atos and it might also include the response code from the bank. Format: `aa,bb` with the two values separated by a comma and where: - `aa` is the two-digit error message from Atos. - `bb` is the optional two-digit error message from the bank.  #### Comercio Latino This value is the status code and the error or response code received from the processor separated by a colon. Format: [status code]:E[error code] or [status code]:R[response code] Example `2:R06`  #### JCN Gateway Processor-defined detail error code. The associated response category code is in the `processorInformation.responseCategoryCode` field. String (3) ")
  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public PtsV2IncrementalAuthorizationPatch201ResponseProcessorInformation systemTraceAuditNumber(String systemTraceAuditNumber) {
    this.systemTraceAuditNumber = systemTraceAuditNumber;
    return this;
  }

   /**
   * This field is returned only for **American Express Direct** and **CyberSource through VisaNet**. Returned by authorization and incremental authorization services.  #### American Express Direct  System trace audit number (STAN). This value identifies the transaction and is useful when investigating a chargeback dispute.  #### CyberSource through VisaNet  System trace number that must be printed on the customer’s receipt. 
   * @return systemTraceAuditNumber
  **/
  @ApiModelProperty(value = "This field is returned only for **American Express Direct** and **CyberSource through VisaNet**. Returned by authorization and incremental authorization services.  #### American Express Direct  System trace audit number (STAN). This value identifies the transaction and is useful when investigating a chargeback dispute.  #### CyberSource through VisaNet  System trace number that must be printed on the customer’s receipt. ")
  public String getSystemTraceAuditNumber() {
    return systemTraceAuditNumber;
  }

  public void setSystemTraceAuditNumber(String systemTraceAuditNumber) {
    this.systemTraceAuditNumber = systemTraceAuditNumber;
  }

  public PtsV2IncrementalAuthorizationPatch201ResponseProcessorInformation responseDetails(String responseDetails) {
    this.responseDetails = responseDetails;
    return this;
  }

   /**
   * This field might contain information about a decline. This field is supported only for **CyberSource through VisaNet**. 
   * @return responseDetails
  **/
  @ApiModelProperty(value = "This field might contain information about a decline. This field is supported only for **CyberSource through VisaNet**. ")
  public String getResponseDetails() {
    return responseDetails;
  }

  public void setResponseDetails(String responseDetails) {
    this.responseDetails = responseDetails;
  }

  public PtsV2IncrementalAuthorizationPatch201ResponseProcessorInformation merchantAdvice(PtsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice merchantAdvice) {
    this.merchantAdvice = merchantAdvice;
    return this;
  }

   /**
   * Get merchantAdvice
   * @return merchantAdvice
  **/
  @ApiModelProperty(value = "")
  public PtsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice getMerchantAdvice() {
    return merchantAdvice;
  }

  public void setMerchantAdvice(PtsV2PaymentsPost201ResponseProcessorInformationMerchantAdvice merchantAdvice) {
    this.merchantAdvice = merchantAdvice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2IncrementalAuthorizationPatch201ResponseProcessorInformation ptsV2IncrementalAuthorizationPatch201ResponseProcessorInformation = (PtsV2IncrementalAuthorizationPatch201ResponseProcessorInformation) o;
    return Objects.equals(this.approvalCode, ptsV2IncrementalAuthorizationPatch201ResponseProcessorInformation.approvalCode) &&
        Objects.equals(this.transactionId, ptsV2IncrementalAuthorizationPatch201ResponseProcessorInformation.transactionId) &&
        Objects.equals(this.responseCode, ptsV2IncrementalAuthorizationPatch201ResponseProcessorInformation.responseCode) &&
        Objects.equals(this.systemTraceAuditNumber, ptsV2IncrementalAuthorizationPatch201ResponseProcessorInformation.systemTraceAuditNumber) &&
        Objects.equals(this.responseDetails, ptsV2IncrementalAuthorizationPatch201ResponseProcessorInformation.responseDetails) &&
        Objects.equals(this.merchantAdvice, ptsV2IncrementalAuthorizationPatch201ResponseProcessorInformation.merchantAdvice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalCode, transactionId, responseCode, systemTraceAuditNumber, responseDetails, merchantAdvice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2IncrementalAuthorizationPatch201ResponseProcessorInformation {\n");
    
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    systemTraceAuditNumber: ").append(toIndentedString(systemTraceAuditNumber)).append("\n");
    sb.append("    responseDetails: ").append(toIndentedString(responseDetails)).append("\n");
    sb.append("    merchantAdvice: ").append(toIndentedString(merchantAdvice)).append("\n");
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

