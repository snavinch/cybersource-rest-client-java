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
import java.util.ArrayList;
import java.util.List;

/**
 * Vasv2taxTaxInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-26T11:59:18.619+05:30")
public class Vasv2taxTaxInformation {
  @SerializedName("reportingDate")
  private String reportingDate = null;

  @SerializedName("dateOverrideReason")
  private String dateOverrideReason = null;

  @SerializedName("nexus")
  private List<String> nexus = null;

  @SerializedName("noNexus")
  private List<String> noNexus = null;

  @SerializedName("showTaxPerLineItem")
  private String showTaxPerLineItem = null;

  @SerializedName("commitIndicator")
  private Boolean commitIndicator = null;

  @SerializedName("refundIndicator")
  private Boolean refundIndicator = null;

  public Vasv2taxTaxInformation reportingDate(String reportingDate) {
    this.reportingDate = reportingDate;
    return this;
  }

   /**
   * Reporting date of transaction. Format: YYYYMMDD. Defaults to current date if not specified. Also the default tax calculation date unless a different date is specified in &#x60;orderInformation.invoiceDetails.invoiceDate&#x60;.  Optional for U.S., Canadian, international tax, and value added taxes. 
   * @return reportingDate
  **/
  @ApiModelProperty(value = "Reporting date of transaction. Format: YYYYMMDD. Defaults to current date if not specified. Also the default tax calculation date unless a different date is specified in `orderInformation.invoiceDetails.invoiceDate`.  Optional for U.S., Canadian, international tax, and value added taxes. ")
  public String getReportingDate() {
    return reportingDate;
  }

  public void setReportingDate(String reportingDate) {
    this.reportingDate = reportingDate;
  }

  public Vasv2taxTaxInformation dateOverrideReason(String dateOverrideReason) {
    this.dateOverrideReason = dateOverrideReason;
    return this;
  }

   /**
   * If a past or future date is specified in &#x60;orderInformation.invoiceDetails.invoiceDate&#x60;, then provide the reason for that for audit purposes. Typical reasons include: &#39;Return&#39;, &#39;Layaway&#39;, &#39;Imported&#39;.  Optional for U.S., Canadian, international tax, and value added taxes. 
   * @return dateOverrideReason
  **/
  @ApiModelProperty(value = "If a past or future date is specified in `orderInformation.invoiceDetails.invoiceDate`, then provide the reason for that for audit purposes. Typical reasons include: 'Return', 'Layaway', 'Imported'.  Optional for U.S., Canadian, international tax, and value added taxes. ")
  public String getDateOverrideReason() {
    return dateOverrideReason;
  }

  public void setDateOverrideReason(String dateOverrideReason) {
    this.dateOverrideReason = dateOverrideReason;
  }

  public Vasv2taxTaxInformation nexus(List<String> nexus) {
    this.nexus = nexus;
    return this;
  }

  public Vasv2taxTaxInformation addNexusItem(String nexusItem) {
    if (this.nexus == null) {
      this.nexus = new ArrayList<String>();
    }
    this.nexus.add(nexusItem);
    return this;
  }

   /**
   * Comma-separated list of states or provinces in which merchandise is taxable. Note merchandise may be still be non-taxable or tax exempt depending on the product taxability. Indicate the type of product you are selling in the product code field for product-level taxability rules to be applied. Do not use both the &#x60;taxInformation.nexus&#x60; and &#x60;taxInformation.noNexus&#x60; fields in your request. If you do not include this field in a tax calculation service request, the tax system makes its calculations as if you have nexus in every US state or Canadian province. Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf).  If you indicate you do not have nexus in the destination state, jurisdiction level fields are left blank in the Tax Detail Report.  Optional field for U.S. and Canadian taxes only. Either this field or &#x60;taxInformation.noNexus&#x60; is required if you do not have nexus in every state or province.  Not applicable for international and value added taxes. 
   * @return nexus
  **/
  @ApiModelProperty(value = "Comma-separated list of states or provinces in which merchandise is taxable. Note merchandise may be still be non-taxable or tax exempt depending on the product taxability. Indicate the type of product you are selling in the product code field for product-level taxability rules to be applied. Do not use both the `taxInformation.nexus` and `taxInformation.noNexus` fields in your request. If you do not include this field in a tax calculation service request, the tax system makes its calculations as if you have nexus in every US state or Canadian province. Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf).  If you indicate you do not have nexus in the destination state, jurisdiction level fields are left blank in the Tax Detail Report.  Optional field for U.S. and Canadian taxes only. Either this field or `taxInformation.noNexus` is required if you do not have nexus in every state or province.  Not applicable for international and value added taxes. ")
  public List<String> getNexus() {
    return nexus;
  }

  public void setNexus(List<String> nexus) {
    this.nexus = nexus;
  }

  public Vasv2taxTaxInformation noNexus(List<String> noNexus) {
    this.noNexus = noNexus;
    return this;
  }

  public Vasv2taxTaxInformation addNoNexusItem(String noNexusItem) {
    if (this.noNexus == null) {
      this.noNexus = new ArrayList<String>();
    }
    this.noNexus.add(noNexusItem);
    return this;
  }

   /**
   * Comma-separated list of states or provinces where you do not have nexus. Check with a tax advisor to determine where your business has nexus. Do not use both the &#x60;taxInformation.nexus&#x60; and &#x60;taxInformation.noNexus&#x60; fields in your request. If you do not include this field in a tax calculation service request, the tax system makes its calculations as if you have nexus in every US state or Canadian province. Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf).  If you indicate you do not have nexus in the destination state, jurisdiction level fields are left blank in the Tax Detail Report.  Optional field for U.S. and Canadian taxes only. Either this field or &#x60;taxInformation.nexus&#x60; is required if you do not have nexus in every state or province.  Not applicable for international and value added taxes. 
   * @return noNexus
  **/
  @ApiModelProperty(value = "Comma-separated list of states or provinces where you do not have nexus. Check with a tax advisor to determine where your business has nexus. Do not use both the `taxInformation.nexus` and `taxInformation.noNexus` fields in your request. If you do not include this field in a tax calculation service request, the tax system makes its calculations as if you have nexus in every US state or Canadian province. Use the [State, Province, and Territory Codes for the United States and Canada](https://developer.cybersource.com/library/documentation/sbc/quickref/states_and_provinces.pdf).  If you indicate you do not have nexus in the destination state, jurisdiction level fields are left blank in the Tax Detail Report.  Optional field for U.S. and Canadian taxes only. Either this field or `taxInformation.nexus` is required if you do not have nexus in every state or province.  Not applicable for international and value added taxes. ")
  public List<String> getNoNexus() {
    return noNexus;
  }

  public void setNoNexus(List<String> noNexus) {
    this.noNexus = noNexus;
  }

  public Vasv2taxTaxInformation showTaxPerLineItem(String showTaxPerLineItem) {
    this.showTaxPerLineItem = showTaxPerLineItem;
    return this;
  }

   /**
   * Whether or not to display tax amounts for each line item. This field can contain one of the following values: - &#x60;Yes&#x60; - Display tax amounts for each line item - &#x60;No&#x60; (default) - Do not display tax amounts for each line item  Optional for U.S., Canadian, international tax, and value added taxes. 
   * @return showTaxPerLineItem
  **/
  @ApiModelProperty(value = "Whether or not to display tax amounts for each line item. This field can contain one of the following values: - `Yes` - Display tax amounts for each line item - `No` (default) - Do not display tax amounts for each line item  Optional for U.S., Canadian, international tax, and value added taxes. ")
  public String getShowTaxPerLineItem() {
    return showTaxPerLineItem;
  }

  public void setShowTaxPerLineItem(String showTaxPerLineItem) {
    this.showTaxPerLineItem = showTaxPerLineItem;
  }

  public Vasv2taxTaxInformation commitIndicator(Boolean commitIndicator) {
    this.commitIndicator = commitIndicator;
    return this;
  }

   /**
   * Indicates whether this is a committed tax transaction. For a committed tax transaction, the status in the Tax Detail Report is “Committed.” For an uncommitted tax transaction, the status in the Tax Detail Report is “Uncommitted.” Possible values: - &#x60;true&#x60;: This is a committed tax transaction. - &#x60;false&#x60; (default): This is not a committed tax transaction.  A committed tax request is a tax service request that sets the status field in the Tax Detail Report to committed. The committed status indicates that the amount calculated by the tax service is included in the amount of a capture or credit.  Use a void service request to cancels a committed tax request or a committed refund tax request. The void transaction is included as a separate entry in the Tax Detail Report. The value of the status field is cancelled. The value of the link ID is the request ID of the committed tax request or refund tax request that was voided. You can use the value of the link ID to reconcile your orders.  Optional for U.S., Canadian, international tax, and value added taxes. 
   * @return commitIndicator
  **/
  @ApiModelProperty(value = "Indicates whether this is a committed tax transaction. For a committed tax transaction, the status in the Tax Detail Report is “Committed.” For an uncommitted tax transaction, the status in the Tax Detail Report is “Uncommitted.” Possible values: - `true`: This is a committed tax transaction. - `false` (default): This is not a committed tax transaction.  A committed tax request is a tax service request that sets the status field in the Tax Detail Report to committed. The committed status indicates that the amount calculated by the tax service is included in the amount of a capture or credit.  Use a void service request to cancels a committed tax request or a committed refund tax request. The void transaction is included as a separate entry in the Tax Detail Report. The value of the status field is cancelled. The value of the link ID is the request ID of the committed tax request or refund tax request that was voided. You can use the value of the link ID to reconcile your orders.  Optional for U.S., Canadian, international tax, and value added taxes. ")
  public Boolean getCommitIndicator() {
    return commitIndicator;
  }

  public void setCommitIndicator(Boolean commitIndicator) {
    this.commitIndicator = commitIndicator;
  }

  public Vasv2taxTaxInformation refundIndicator(Boolean refundIndicator) {
    this.refundIndicator = refundIndicator;
    return this;
  }

   /**
   * Indicates whether this is a refund tax transaction. For a refund tax transaction, amounts in the Tax Detail Report will be negative. Possible values: - &#x60;true&#x60;: This is a refund tax transaction. - &#x60;false&#x60; (default): This is not a refund tax transaction.  A refund tax request is a tax service request that sets the transaction type field in the Tax Detail Report to refunded and makes the reported amount negative. Tax amounts are returned as positive amounts in reply messages, but they are saved in reports as negative amounts which enables the reporting software to accurately calculate the aggregate amounts.  Optional for U.S., Canadian, international tax, and value added taxes. 
   * @return refundIndicator
  **/
  @ApiModelProperty(value = "Indicates whether this is a refund tax transaction. For a refund tax transaction, amounts in the Tax Detail Report will be negative. Possible values: - `true`: This is a refund tax transaction. - `false` (default): This is not a refund tax transaction.  A refund tax request is a tax service request that sets the transaction type field in the Tax Detail Report to refunded and makes the reported amount negative. Tax amounts are returned as positive amounts in reply messages, but they are saved in reports as negative amounts which enables the reporting software to accurately calculate the aggregate amounts.  Optional for U.S., Canadian, international tax, and value added taxes. ")
  public Boolean getRefundIndicator() {
    return refundIndicator;
  }

  public void setRefundIndicator(Boolean refundIndicator) {
    this.refundIndicator = refundIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vasv2taxTaxInformation vasv2taxTaxInformation = (Vasv2taxTaxInformation) o;
    return Objects.equals(this.reportingDate, vasv2taxTaxInformation.reportingDate) &&
        Objects.equals(this.dateOverrideReason, vasv2taxTaxInformation.dateOverrideReason) &&
        Objects.equals(this.nexus, vasv2taxTaxInformation.nexus) &&
        Objects.equals(this.noNexus, vasv2taxTaxInformation.noNexus) &&
        Objects.equals(this.showTaxPerLineItem, vasv2taxTaxInformation.showTaxPerLineItem) &&
        Objects.equals(this.commitIndicator, vasv2taxTaxInformation.commitIndicator) &&
        Objects.equals(this.refundIndicator, vasv2taxTaxInformation.refundIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportingDate, dateOverrideReason, nexus, noNexus, showTaxPerLineItem, commitIndicator, refundIndicator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vasv2taxTaxInformation {\n");
    
    sb.append("    reportingDate: ").append(toIndentedString(reportingDate)).append("\n");
    sb.append("    dateOverrideReason: ").append(toIndentedString(dateOverrideReason)).append("\n");
    sb.append("    nexus: ").append(toIndentedString(nexus)).append("\n");
    sb.append("    noNexus: ").append(toIndentedString(noNexus)).append("\n");
    sb.append("    showTaxPerLineItem: ").append(toIndentedString(showTaxPerLineItem)).append("\n");
    sb.append("    commitIndicator: ").append(toIndentedString(commitIndicator)).append("\n");
    sb.append("    refundIndicator: ").append(toIndentedString(refundIndicator)).append("\n");
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

