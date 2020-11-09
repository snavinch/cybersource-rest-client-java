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
import Model.InvoicingV2InvoicesAllGet200ResponseInvoices;
import Model.InvoicingV2InvoicesAllGet200ResponseLinks;
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
 * InvoicingV2InvoicesAllGet200Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-30T13:05:11.653+05:30")
public class InvoicingV2InvoicesAllGet200Response {
  @SerializedName("_links")
  private InvoicingV2InvoicesAllGet200ResponseLinks links = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("totalInvoices")
  private Integer totalInvoices = null;

  @SerializedName("invoices")
  private List<InvoicingV2InvoicesAllGet200ResponseInvoices> invoices = null;

  public InvoicingV2InvoicesAllGet200Response links(InvoicingV2InvoicesAllGet200ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public InvoicingV2InvoicesAllGet200ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(InvoicingV2InvoicesAllGet200ResponseLinks links) {
    this.links = links;
  }

  public InvoicingV2InvoicesAllGet200Response submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  Returned by authorization service.  #### PIN debit Time when the PIN debit credit, PIN debit purchase or PIN debit reversal was requested.  Returned by PIN debit credit, PIN debit purchase or PIN debit reversal. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ` **Example** `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC.  Returned by authorization service.  #### PIN debit Time when the PIN debit credit, PIN debit purchase or PIN debit reversal was requested.  Returned by PIN debit credit, PIN debit purchase or PIN debit reversal. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public InvoicingV2InvoicesAllGet200Response totalInvoices(Integer totalInvoices) {
    this.totalInvoices = totalInvoices;
    return this;
  }

   /**
   * Get totalInvoices
   * @return totalInvoices
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalInvoices() {
    return totalInvoices;
  }

  public void setTotalInvoices(Integer totalInvoices) {
    this.totalInvoices = totalInvoices;
  }

  public InvoicingV2InvoicesAllGet200Response invoices(List<InvoicingV2InvoicesAllGet200ResponseInvoices> invoices) {
    this.invoices = invoices;
    return this;
  }

  public InvoicingV2InvoicesAllGet200Response addInvoicesItem(InvoicingV2InvoicesAllGet200ResponseInvoices invoicesItem) {
    if (this.invoices == null) {
      this.invoices = new ArrayList<InvoicingV2InvoicesAllGet200ResponseInvoices>();
    }
    this.invoices.add(invoicesItem);
    return this;
  }

   /**
   * Get invoices
   * @return invoices
  **/
  @ApiModelProperty(value = "")
  public List<InvoicingV2InvoicesAllGet200ResponseInvoices> getInvoices() {
    return invoices;
  }

  public void setInvoices(List<InvoicingV2InvoicesAllGet200ResponseInvoices> invoices) {
    this.invoices = invoices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicingV2InvoicesAllGet200Response invoicingV2InvoicesAllGet200Response = (InvoicingV2InvoicesAllGet200Response) o;
    return Objects.equals(this.links, invoicingV2InvoicesAllGet200Response.links) &&
        Objects.equals(this.submitTimeUtc, invoicingV2InvoicesAllGet200Response.submitTimeUtc) &&
        Objects.equals(this.totalInvoices, invoicingV2InvoicesAllGet200Response.totalInvoices) &&
        Objects.equals(this.invoices, invoicingV2InvoicesAllGet200Response.invoices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, submitTimeUtc, totalInvoices, invoices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicingV2InvoicesAllGet200Response {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    sb.append("    totalInvoices: ").append(toIndentedString(totalInvoices)).append("\n");
    sb.append("    invoices: ").append(toIndentedString(invoices)).append("\n");
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

