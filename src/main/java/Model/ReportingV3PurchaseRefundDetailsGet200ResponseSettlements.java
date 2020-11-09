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
import org.joda.time.DateTime;

/**
 * ReportingV3PurchaseRefundDetailsGet200ResponseSettlements
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-30T13:05:11.653+05:30")
public class ReportingV3PurchaseRefundDetailsGet200ResponseSettlements {
  @SerializedName("requestId")
  private String requestId = null;

  @SerializedName("transactionType")
  private String transactionType = null;

  @SerializedName("submissionTime")
  private DateTime submissionTime = null;

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("currencyCode")
  private String currencyCode = null;

  @SerializedName("paymentMethod")
  private String paymentMethod = null;

  @SerializedName("walletType")
  private String walletType = null;

  @SerializedName("paymentType")
  private String paymentType = null;

  @SerializedName("accountSuffix")
  private String accountSuffix = null;

  @SerializedName("cybersourceBatchTime")
  private DateTime cybersourceBatchTime = null;

  @SerializedName("cybersourceBatchId")
  private String cybersourceBatchId = null;

  @SerializedName("cardType")
  private String cardType = null;

  @SerializedName("debitNetwork")
  private String debitNetwork = null;

  public ReportingV3PurchaseRefundDetailsGet200ResponseSettlements requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * An unique identification number assigned by CyberSource to identify the submitted request.
   * @return requestId
  **/
  @ApiModelProperty(example = "12345678901234567890123456", value = "An unique identification number assigned by CyberSource to identify the submitted request.")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseSettlements transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Transaction Type
   * @return transactionType
  **/
  @ApiModelProperty(example = "Purchases", value = "Transaction Type")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseSettlements submissionTime(DateTime submissionTime) {
    this.submissionTime = submissionTime;
    return this;
  }

   /**
   * Submission Date
   * @return submissionTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Submission Date")
  public DateTime getSubmissionTime() {
    return submissionTime;
  }

  public void setSubmissionTime(DateTime submissionTime) {
    this.submissionTime = submissionTime;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseSettlements amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount
   * @return amount
  **/
  @ApiModelProperty(example = "23.00", value = "Amount")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseSettlements currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Valid ISO 4217 ALPHA-3 currency code
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", value = "Valid ISO 4217 ALPHA-3 currency code")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseSettlements paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * payment method
   * @return paymentMethod
  **/
  @ApiModelProperty(example = "VISA", value = "payment method")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseSettlements walletType(String walletType) {
    this.walletType = walletType;
    return this;
  }

   /**
   * Solution Type (Wallet)
   * @return walletType
  **/
  @ApiModelProperty(example = "V.me", value = "Solution Type (Wallet)")
  public String getWalletType() {
    return walletType;
  }

  public void setWalletType(String walletType) {
    this.walletType = walletType;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseSettlements paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Payment Type
   * @return paymentType
  **/
  @ApiModelProperty(example = "credit card", value = "Payment Type")
  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseSettlements accountSuffix(String accountSuffix) {
    this.accountSuffix = accountSuffix;
    return this;
  }

   /**
   * Account Suffix
   * @return accountSuffix
  **/
  @ApiModelProperty(example = "0004", value = "Account Suffix")
  public String getAccountSuffix() {
    return accountSuffix;
  }

  public void setAccountSuffix(String accountSuffix) {
    this.accountSuffix = accountSuffix;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseSettlements cybersourceBatchTime(DateTime cybersourceBatchTime) {
    this.cybersourceBatchTime = cybersourceBatchTime;
    return this;
  }

   /**
   * Cybersource Batch Time
   * @return cybersourceBatchTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Cybersource Batch Time")
  public DateTime getCybersourceBatchTime() {
    return cybersourceBatchTime;
  }

  public void setCybersourceBatchTime(DateTime cybersourceBatchTime) {
    this.cybersourceBatchTime = cybersourceBatchTime;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseSettlements cybersourceBatchId(String cybersourceBatchId) {
    this.cybersourceBatchId = cybersourceBatchId;
    return this;
  }

   /**
   * Cybersource Batch Id
   * @return cybersourceBatchId
  **/
  @ApiModelProperty(example = "123123123123123", value = "Cybersource Batch Id")
  public String getCybersourceBatchId() {
    return cybersourceBatchId;
  }

  public void setCybersourceBatchId(String cybersourceBatchId) {
    this.cybersourceBatchId = cybersourceBatchId;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseSettlements cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Card Type
   * @return cardType
  **/
  @ApiModelProperty(value = "Card Type")
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public ReportingV3PurchaseRefundDetailsGet200ResponseSettlements debitNetwork(String debitNetwork) {
    this.debitNetwork = debitNetwork;
    return this;
  }

   /**
   * Debit Network
   * @return debitNetwork
  **/
  @ApiModelProperty(example = "", value = "Debit Network")
  public String getDebitNetwork() {
    return debitNetwork;
  }

  public void setDebitNetwork(String debitNetwork) {
    this.debitNetwork = debitNetwork;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3PurchaseRefundDetailsGet200ResponseSettlements reportingV3PurchaseRefundDetailsGet200ResponseSettlements = (ReportingV3PurchaseRefundDetailsGet200ResponseSettlements) o;
    return Objects.equals(this.requestId, reportingV3PurchaseRefundDetailsGet200ResponseSettlements.requestId) &&
        Objects.equals(this.transactionType, reportingV3PurchaseRefundDetailsGet200ResponseSettlements.transactionType) &&
        Objects.equals(this.submissionTime, reportingV3PurchaseRefundDetailsGet200ResponseSettlements.submissionTime) &&
        Objects.equals(this.amount, reportingV3PurchaseRefundDetailsGet200ResponseSettlements.amount) &&
        Objects.equals(this.currencyCode, reportingV3PurchaseRefundDetailsGet200ResponseSettlements.currencyCode) &&
        Objects.equals(this.paymentMethod, reportingV3PurchaseRefundDetailsGet200ResponseSettlements.paymentMethod) &&
        Objects.equals(this.walletType, reportingV3PurchaseRefundDetailsGet200ResponseSettlements.walletType) &&
        Objects.equals(this.paymentType, reportingV3PurchaseRefundDetailsGet200ResponseSettlements.paymentType) &&
        Objects.equals(this.accountSuffix, reportingV3PurchaseRefundDetailsGet200ResponseSettlements.accountSuffix) &&
        Objects.equals(this.cybersourceBatchTime, reportingV3PurchaseRefundDetailsGet200ResponseSettlements.cybersourceBatchTime) &&
        Objects.equals(this.cybersourceBatchId, reportingV3PurchaseRefundDetailsGet200ResponseSettlements.cybersourceBatchId) &&
        Objects.equals(this.cardType, reportingV3PurchaseRefundDetailsGet200ResponseSettlements.cardType) &&
        Objects.equals(this.debitNetwork, reportingV3PurchaseRefundDetailsGet200ResponseSettlements.debitNetwork);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, transactionType, submissionTime, amount, currencyCode, paymentMethod, walletType, paymentType, accountSuffix, cybersourceBatchTime, cybersourceBatchId, cardType, debitNetwork);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3PurchaseRefundDetailsGet200ResponseSettlements {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    submissionTime: ").append(toIndentedString(submissionTime)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    walletType: ").append(toIndentedString(walletType)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    accountSuffix: ").append(toIndentedString(accountSuffix)).append("\n");
    sb.append("    cybersourceBatchTime: ").append(toIndentedString(cybersourceBatchTime)).append("\n");
    sb.append("    cybersourceBatchId: ").append(toIndentedString(cybersourceBatchId)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    debitNetwork: ").append(toIndentedString(debitNetwork)).append("\n");
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

