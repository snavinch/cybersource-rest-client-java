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
import Model.Reportingv3reportsReportPreferences;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CreateReportSubscriptionRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-30T13:05:11.653+05:30")
public class CreateReportSubscriptionRequest {
  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("reportDefinitionName")
  private String reportDefinitionName = null;

  @SerializedName("reportFields")
  private List<String> reportFields = new ArrayList<String>();

  @SerializedName("reportMimeType")
  private String reportMimeType = null;

  @SerializedName("reportFrequency")
  private String reportFrequency = null;

  @SerializedName("reportInterval")
  private String reportInterval = null;

  @SerializedName("reportName")
  private String reportName = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("startTime")
  private String startTime = null;

  @SerializedName("startDay")
  private Integer startDay = null;

  @SerializedName("reportFilters")
  private Map<String, List<String>> reportFilters = null;

  @SerializedName("reportPreferences")
  private Reportingv3reportsReportPreferences reportPreferences = null;

  @SerializedName("groupName")
  private String groupName = null;

  public CreateReportSubscriptionRequest organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Valid CyberSource organizationId
   * @return organizationId
  **/
  @ApiModelProperty(example = "Merchant 1", value = "Valid CyberSource organizationId")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public CreateReportSubscriptionRequest reportDefinitionName(String reportDefinitionName) {
    this.reportDefinitionName = reportDefinitionName;
    return this;
  }

   /**
   * Valid Report Definition Name
   * @return reportDefinitionName
  **/
  @ApiModelProperty(example = "TransactionDetailReportClass", required = true, value = "Valid Report Definition Name")
  public String getReportDefinitionName() {
    return reportDefinitionName;
  }

  public void setReportDefinitionName(String reportDefinitionName) {
    this.reportDefinitionName = reportDefinitionName;
  }

  public CreateReportSubscriptionRequest reportFields(List<String> reportFields) {
    this.reportFields = reportFields;
    return this;
  }

  public CreateReportSubscriptionRequest addReportFieldsItem(String reportFieldsItem) {
    this.reportFields.add(reportFieldsItem);
    return this;
  }

   /**
   * Get reportFields
   * @return reportFields
  **/
  @ApiModelProperty(example = "[\"Request.RequestID\",\"Request.TransactionDate\",\"Request.MerchantID\"]", required = true, value = "")
  public List<String> getReportFields() {
    return reportFields;
  }

  public void setReportFields(List<String> reportFields) {
    this.reportFields = reportFields;
  }

  public CreateReportSubscriptionRequest reportMimeType(String reportMimeType) {
    this.reportMimeType = reportMimeType;
    return this;
  }

   /**
   * Valid values: - application/xml - text/csv 
   * @return reportMimeType
  **/
  @ApiModelProperty(example = "application/xml", required = true, value = "Valid values: - application/xml - text/csv ")
  public String getReportMimeType() {
    return reportMimeType;
  }

  public void setReportMimeType(String reportMimeType) {
    this.reportMimeType = reportMimeType;
  }

  public CreateReportSubscriptionRequest reportFrequency(String reportFrequency) {
    this.reportFrequency = reportFrequency;
    return this;
  }

   /**
   * &#39;The frequency for which subscription is created.&#39; **NOTE: Do not document USER_DEFINED Frequency field in developer center** Valid Values:   - &#39;DAILY&#39;   - &#39;WEEKLY&#39;   - &#39;MONTHLY&#39;   - &#39;USER_DEFINED&#39; 
   * @return reportFrequency
  **/
  @ApiModelProperty(example = "DAILY", required = true, value = "'The frequency for which subscription is created.' **NOTE: Do not document USER_DEFINED Frequency field in developer center** Valid Values:   - 'DAILY'   - 'WEEKLY'   - 'MONTHLY'   - 'USER_DEFINED' ")
  public String getReportFrequency() {
    return reportFrequency;
  }

  public void setReportFrequency(String reportFrequency) {
    this.reportFrequency = reportFrequency;
  }

  public CreateReportSubscriptionRequest reportInterval(String reportInterval) {
    this.reportInterval = reportInterval;
    return this;
  }

   /**
   * If the reportFrequency is User-defined, reportInterval should be in **ISO 8601 time format** Please refer the following link to know more about ISO 8601 format.[Rfc Time Format](https://en.wikipedia.org/wiki/ISO_8601#Durations)  **Example time format for 2 hours and 30 Mins:**   - PT2H30M **NOTE: Do not document reportInterval field in developer center** 
   * @return reportInterval
  **/
  @ApiModelProperty(value = "If the reportFrequency is User-defined, reportInterval should be in **ISO 8601 time format** Please refer the following link to know more about ISO 8601 format.[Rfc Time Format](https://en.wikipedia.org/wiki/ISO_8601#Durations)  **Example time format for 2 hours and 30 Mins:**   - PT2H30M **NOTE: Do not document reportInterval field in developer center** ")
  public String getReportInterval() {
    return reportInterval;
  }

  public void setReportInterval(String reportInterval) {
    this.reportInterval = reportInterval;
  }

  public CreateReportSubscriptionRequest reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

   /**
   * Get reportName
   * @return reportName
  **/
  @ApiModelProperty(example = "My Daily Subscription", required = true, value = "")
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public CreateReportSubscriptionRequest timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @ApiModelProperty(example = "America/Chicago", required = true, value = "")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public CreateReportSubscriptionRequest startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The hour at which the report generation should start. It should be in hhmm format.
   * @return startTime
  **/
  @ApiModelProperty(example = "0900", required = true, value = "The hour at which the report generation should start. It should be in hhmm format.")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public CreateReportSubscriptionRequest startDay(Integer startDay) {
    this.startDay = startDay;
    return this;
  }

   /**
   * This is the start day if the frequency is WEEKLY or MONTHLY. The value varies from 1-7 for WEEKLY and 1-31 for MONTHLY. For WEEKLY 1 means Sunday and 7 means Saturday. By default the value is 1.
   * minimum: 1
   * maximum: 31
   * @return startDay
  **/
  @ApiModelProperty(value = "This is the start day if the frequency is WEEKLY or MONTHLY. The value varies from 1-7 for WEEKLY and 1-31 for MONTHLY. For WEEKLY 1 means Sunday and 7 means Saturday. By default the value is 1.")
  public Integer getStartDay() {
    return startDay;
  }

  public void setStartDay(Integer startDay) {
    this.startDay = startDay;
  }

  public CreateReportSubscriptionRequest reportFilters(Map<String, List<String>> reportFilters) {
    this.reportFilters = reportFilters;
    return this;
  }

  public CreateReportSubscriptionRequest putReportFiltersItem(String key, List<String> reportFiltersItem) {
    if (this.reportFilters == null) {
      this.reportFilters = new HashMap<String, List<String>>();
    }
    this.reportFilters.put(key, reportFiltersItem);
    return this;
  }

   /**
   * List of filters to apply
   * @return reportFilters
  **/
  @ApiModelProperty(example = "{\"Application.Name\":[\"ics_auth\",\"ics_bill\"]}", value = "List of filters to apply")
  public Map<String, List<String>> getReportFilters() {
    return reportFilters;
  }

  public void setReportFilters(Map<String, List<String>> reportFilters) {
    this.reportFilters = reportFilters;
  }

  public CreateReportSubscriptionRequest reportPreferences(Reportingv3reportsReportPreferences reportPreferences) {
    this.reportPreferences = reportPreferences;
    return this;
  }

   /**
   * Get reportPreferences
   * @return reportPreferences
  **/
  @ApiModelProperty(value = "")
  public Reportingv3reportsReportPreferences getReportPreferences() {
    return reportPreferences;
  }

  public void setReportPreferences(Reportingv3reportsReportPreferences reportPreferences) {
    this.reportPreferences = reportPreferences;
  }

  public CreateReportSubscriptionRequest groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Valid GroupName
   * @return groupName
  **/
  @ApiModelProperty(example = "CEMEA Group", value = "Valid GroupName")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateReportSubscriptionRequest createReportSubscriptionRequest = (CreateReportSubscriptionRequest) o;
    return Objects.equals(this.organizationId, createReportSubscriptionRequest.organizationId) &&
        Objects.equals(this.reportDefinitionName, createReportSubscriptionRequest.reportDefinitionName) &&
        Objects.equals(this.reportFields, createReportSubscriptionRequest.reportFields) &&
        Objects.equals(this.reportMimeType, createReportSubscriptionRequest.reportMimeType) &&
        Objects.equals(this.reportFrequency, createReportSubscriptionRequest.reportFrequency) &&
        Objects.equals(this.reportInterval, createReportSubscriptionRequest.reportInterval) &&
        Objects.equals(this.reportName, createReportSubscriptionRequest.reportName) &&
        Objects.equals(this.timezone, createReportSubscriptionRequest.timezone) &&
        Objects.equals(this.startTime, createReportSubscriptionRequest.startTime) &&
        Objects.equals(this.startDay, createReportSubscriptionRequest.startDay) &&
        Objects.equals(this.reportFilters, createReportSubscriptionRequest.reportFilters) &&
        Objects.equals(this.reportPreferences, createReportSubscriptionRequest.reportPreferences) &&
        Objects.equals(this.groupName, createReportSubscriptionRequest.groupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, reportDefinitionName, reportFields, reportMimeType, reportFrequency, reportInterval, reportName, timezone, startTime, startDay, reportFilters, reportPreferences, groupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReportSubscriptionRequest {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    reportDefinitionName: ").append(toIndentedString(reportDefinitionName)).append("\n");
    sb.append("    reportFields: ").append(toIndentedString(reportFields)).append("\n");
    sb.append("    reportMimeType: ").append(toIndentedString(reportMimeType)).append("\n");
    sb.append("    reportFrequency: ").append(toIndentedString(reportFrequency)).append("\n");
    sb.append("    reportInterval: ").append(toIndentedString(reportInterval)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    startDay: ").append(toIndentedString(startDay)).append("\n");
    sb.append("    reportFilters: ").append(toIndentedString(reportFilters)).append("\n");
    sb.append("    reportPreferences: ").append(toIndentedString(reportPreferences)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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

