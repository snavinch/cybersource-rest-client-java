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
 * RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-30T13:05:11.653+05:30")
public class RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation {
  @SerializedName("acsRenderingType")
  private String acsRenderingType = null;

  @SerializedName("acsTransactionId")
  private String acsTransactionId = null;

  @SerializedName("authenticationResult")
  private String authenticationResult = null;

  @SerializedName("authenticationStatusMsg")
  private String authenticationStatusMsg = null;

  @SerializedName("authorizationPayload")
  private String authorizationPayload = null;

  @SerializedName("cavv")
  private String cavv = null;

  @SerializedName("cavvAlgorithm")
  private String cavvAlgorithm = null;

  @SerializedName("directoryServerErrorCode")
  private String directoryServerErrorCode = null;

  @SerializedName("directoryServerErrorDescription")
  private String directoryServerErrorDescription = null;

  @SerializedName("indicator")
  private String indicator = null;

  @SerializedName("interactionCounter")
  private String interactionCounter = null;

  @SerializedName("eci")
  private String eci = null;

  @SerializedName("eciRaw")
  private String eciRaw = null;

  @SerializedName("paresStatus")
  private String paresStatus = null;

  @SerializedName("sdkTransactionId")
  private String sdkTransactionId = null;

  @SerializedName("specificationVersion")
  private String specificationVersion = null;

  @SerializedName("threeDSServerTransactionId")
  private String threeDSServerTransactionId = null;

  @SerializedName("ucafAuthenticationData")
  private String ucafAuthenticationData = null;

  @SerializedName("ucafCollectionIndicator")
  private String ucafCollectionIndicator = null;

  @SerializedName("whiteListStatus")
  private String whiteListStatus = null;

  @SerializedName("whiteListStatusSource")
  private String whiteListStatusSource = null;

  @SerializedName("xid")
  private String xid = null;

  @SerializedName("directoryServerTransactionId")
  private String directoryServerTransactionId = null;

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation acsRenderingType(String acsRenderingType) {
    this.acsRenderingType = acsRenderingType;
    return this;
  }

   /**
   * Identifies the UI Type the ACS will use to complete the challenge. **NOTE**: Only available for App transactions using the Cardinal Mobile SDK. 
   * @return acsRenderingType
  **/
  @ApiModelProperty(value = "Identifies the UI Type the ACS will use to complete the challenge. **NOTE**: Only available for App transactions using the Cardinal Mobile SDK. ")
  public String getAcsRenderingType() {
    return acsRenderingType;
  }

  public void setAcsRenderingType(String acsRenderingType) {
    this.acsRenderingType = acsRenderingType;
  }

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation acsTransactionId(String acsTransactionId) {
    this.acsTransactionId = acsTransactionId;
    return this;
  }

   /**
   * Unique transaction identifier assigned by the ACS to identify a single transaction. 
   * @return acsTransactionId
  **/
  @ApiModelProperty(value = "Unique transaction identifier assigned by the ACS to identify a single transaction. ")
  public String getAcsTransactionId() {
    return acsTransactionId;
  }

  public void setAcsTransactionId(String acsTransactionId) {
    this.acsTransactionId = acsTransactionId;
  }

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation authenticationResult(String authenticationResult) {
    this.authenticationResult = authenticationResult;
    return this;
  }

   /**
   * Raw authentication data that comes from the cardissuing bank. Primary authentication field that indicates if authentication was successful and if liability shift occurred. You should examine first the result of this field. This field contains one of these values: - &#x60;-1&#x60;: Invalid PARes. - &#x60;0&#x60;: Successful validation. - &#x60;1&#x60;: Cardholder is not participating, but the attempt to authenticate was recorded. - &#x60;6&#x60;: Issuer unable to perform authentication. - &#x60;9&#x60;: Cardholder did not complete authentication. 
   * @return authenticationResult
  **/
  @ApiModelProperty(value = "Raw authentication data that comes from the cardissuing bank. Primary authentication field that indicates if authentication was successful and if liability shift occurred. You should examine first the result of this field. This field contains one of these values: - `-1`: Invalid PARes. - `0`: Successful validation. - `1`: Cardholder is not participating, but the attempt to authenticate was recorded. - `6`: Issuer unable to perform authentication. - `9`: Cardholder did not complete authentication. ")
  public String getAuthenticationResult() {
    return authenticationResult;
  }

  public void setAuthenticationResult(String authenticationResult) {
    this.authenticationResult = authenticationResult;
  }

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation authenticationStatusMsg(String authenticationStatusMsg) {
    this.authenticationStatusMsg = authenticationStatusMsg;
    return this;
  }

   /**
   * Message that explains the authenticationResult reply field. 
   * @return authenticationStatusMsg
  **/
  @ApiModelProperty(value = "Message that explains the authenticationResult reply field. ")
  public String getAuthenticationStatusMsg() {
    return authenticationStatusMsg;
  }

  public void setAuthenticationStatusMsg(String authenticationStatusMsg) {
    this.authenticationStatusMsg = authenticationStatusMsg;
  }

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation authorizationPayload(String authorizationPayload) {
    this.authorizationPayload = authorizationPayload;
    return this;
  }

   /**
   * The Base64 encoded JSON Payload of CB specific Authorization Values returned in the challenge Flow 
   * @return authorizationPayload
  **/
  @ApiModelProperty(value = "The Base64 encoded JSON Payload of CB specific Authorization Values returned in the challenge Flow ")
  public String getAuthorizationPayload() {
    return authorizationPayload;
  }

  public void setAuthorizationPayload(String authorizationPayload) {
    this.authorizationPayload = authorizationPayload;
  }

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation cavv(String cavv) {
    this.cavv = cavv;
    return this;
  }

   /**
   * Unique identifier generated by the card-issuing bank for Visa, American Express, JCB, Diners Club, and Discover transactions after the customer is authenticated. The value is in base64. When you request the card authorization service, CyberSource automatically converts the value, not the field name, to the format required by your payment processor. 
   * @return cavv
  **/
  @ApiModelProperty(value = "Unique identifier generated by the card-issuing bank for Visa, American Express, JCB, Diners Club, and Discover transactions after the customer is authenticated. The value is in base64. When you request the card authorization service, CyberSource automatically converts the value, not the field name, to the format required by your payment processor. ")
  public String getCavv() {
    return cavv;
  }

  public void setCavv(String cavv) {
    this.cavv = cavv;
  }

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation cavvAlgorithm(String cavvAlgorithm) {
    this.cavvAlgorithm = cavvAlgorithm;
    return this;
  }

   /**
   * Field that is returned only when the CAVV is generated, which occurs when paresStatus contains the values Y (successful authentication) or A (attempted authentication). If you use the ATOS processor, send the value of this field in the &#x60;cavv_algorithm&#x60; request field of the authorization service. This field contains one of these values: - &#x60;2&#x60;: Visa, American Express, JCB, Diners Club, and Discover - &#x60;3&#x60;: Mastercard 
   * @return cavvAlgorithm
  **/
  @ApiModelProperty(value = "Field that is returned only when the CAVV is generated, which occurs when paresStatus contains the values Y (successful authentication) or A (attempted authentication). If you use the ATOS processor, send the value of this field in the `cavv_algorithm` request field of the authorization service. This field contains one of these values: - `2`: Visa, American Express, JCB, Diners Club, and Discover - `3`: Mastercard ")
  public String getCavvAlgorithm() {
    return cavvAlgorithm;
  }

  public void setCavvAlgorithm(String cavvAlgorithm) {
    this.cavvAlgorithm = cavvAlgorithm;
  }

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation directoryServerErrorCode(String directoryServerErrorCode) {
    this.directoryServerErrorCode = directoryServerErrorCode;
    return this;
  }

   /**
   * The directory server error code indicating a problem with this transaction. Note - Max Length of this field is typically 3 characters. 
   * @return directoryServerErrorCode
  **/
  @ApiModelProperty(value = "The directory server error code indicating a problem with this transaction. Note - Max Length of this field is typically 3 characters. ")
  public String getDirectoryServerErrorCode() {
    return directoryServerErrorCode;
  }

  public void setDirectoryServerErrorCode(String directoryServerErrorCode) {
    this.directoryServerErrorCode = directoryServerErrorCode;
  }

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation directoryServerErrorDescription(String directoryServerErrorDescription) {
    this.directoryServerErrorDescription = directoryServerErrorDescription;
    return this;
  }

   /**
   * Directory server text and additional detail about the error for this transaction. 
   * @return directoryServerErrorDescription
  **/
  @ApiModelProperty(value = "Directory server text and additional detail about the error for this transaction. ")
  public String getDirectoryServerErrorDescription() {
    return directoryServerErrorDescription;
  }

  public void setDirectoryServerErrorDescription(String directoryServerErrorDescription) {
    this.directoryServerErrorDescription = directoryServerErrorDescription;
  }

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation indicator(String indicator) {
    this.indicator = indicator;
    return this;
  }

   /**
   * Indicator used to differentiate Internet transactions from other types. The authentication failed if this field is not returned. For Visa, if your payment processor is Streamline, Barclays, AIBMS, or FDC Germany, you receive the value vbv_failure instead of internet when eci is 07. The value of this field is passed automatically to the authorization service if you request the services together. This field contains one of these values: - &#x60;aesk&#x60;: American Express SafeKey authentication verified successfully. - &#x60;aesk_attempted&#x60;: Card not enrolled in American Express SafeKey, but the attempt to authenticate was recorded. - &#x60;dipb&#x60;: Discover ProtectBuy authentication verified successfully. - &#x60;dipb_attempted&#x60;: Card not enrolled in Discover ProtectBuy, but the attempt to authenticate was recorded. - &#x60;internet&#x60;: Authentication was not verified successfully. - &#x60;js&#x60;: J/Secure authentication verified successfully. - &#x60;js_attempted&#x60;: Card not enrolled in J/Secure, but the attempt to authenticate was recorded. - &#x60;moto&#x60;: Mail or telephone order. - &#x60;pb_attempted&#x60;: Card not enrolled in Diners Club ProtectBuy, but the attempt to authenticate was recorded. - &#x60;recurring&#x60;: Recurring transaction. - &#x60;spa&#x60;: Mastercard Identity Check authentication verified successfully. - &#x60;spa_failure&#x60;: Mastercard Identity Check failed authentication. - &#x60;vbv&#x60;: Visa Secure authentication verified successfully. - &#x60;vbv_attempted&#x60;: Card not enrolled in Visa Secure, but the attempt to authenticate was recorded. - &#x60;vbv_failure&#x60;: Visa Secure authentication unavailable. 
   * @return indicator
  **/
  @ApiModelProperty(value = "Indicator used to differentiate Internet transactions from other types. The authentication failed if this field is not returned. For Visa, if your payment processor is Streamline, Barclays, AIBMS, or FDC Germany, you receive the value vbv_failure instead of internet when eci is 07. The value of this field is passed automatically to the authorization service if you request the services together. This field contains one of these values: - `aesk`: American Express SafeKey authentication verified successfully. - `aesk_attempted`: Card not enrolled in American Express SafeKey, but the attempt to authenticate was recorded. - `dipb`: Discover ProtectBuy authentication verified successfully. - `dipb_attempted`: Card not enrolled in Discover ProtectBuy, but the attempt to authenticate was recorded. - `internet`: Authentication was not verified successfully. - `js`: J/Secure authentication verified successfully. - `js_attempted`: Card not enrolled in J/Secure, but the attempt to authenticate was recorded. - `moto`: Mail or telephone order. - `pb_attempted`: Card not enrolled in Diners Club ProtectBuy, but the attempt to authenticate was recorded. - `recurring`: Recurring transaction. - `spa`: Mastercard Identity Check authentication verified successfully. - `spa_failure`: Mastercard Identity Check failed authentication. - `vbv`: Visa Secure authentication verified successfully. - `vbv_attempted`: Card not enrolled in Visa Secure, but the attempt to authenticate was recorded. - `vbv_failure`: Visa Secure authentication unavailable. ")
  public String getIndicator() {
    return indicator;
  }

  public void setIndicator(String indicator) {
    this.indicator = indicator;
  }

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation interactionCounter(String interactionCounter) {
    this.interactionCounter = interactionCounter;
    return this;
  }

   /**
   * Indicates the number of authentication cycles attempted by the cardholder and is tracked by the Issuing Banks ACS.Example: if customer gets the challenge window and enter in their one time password and hit submit then that interaction counter should just be 1. When customer gets the challenge window and the bank asks if they want to have the one time password  sent to their phone or their email and they have to choose before going to the next screen to enter in their one time password then this interaction count would be 2. One for the selection of how they want the one time password delivered and another with them actually entering in the one time password and hitting the submit button. 
   * @return interactionCounter
  **/
  @ApiModelProperty(value = "Indicates the number of authentication cycles attempted by the cardholder and is tracked by the Issuing Banks ACS.Example: if customer gets the challenge window and enter in their one time password and hit submit then that interaction counter should just be 1. When customer gets the challenge window and the bank asks if they want to have the one time password  sent to their phone or their email and they have to choose before going to the next screen to enter in their one time password then this interaction count would be 2. One for the selection of how they want the one time password delivered and another with them actually entering in the one time password and hitting the submit button. ")
  public String getInteractionCounter() {
    return interactionCounter;
  }

  public void setInteractionCounter(String interactionCounter) {
    this.interactionCounter = interactionCounter;
  }

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation eci(String eci) {
    this.eci = eci;
    return this;
  }

   /**
   * Note This field applies only to non-U.S-issued cards.  For enroll, Numeric electronic commerce indicator (ECI) returned only for Visa, American Express, JCB, Diners Club, and Discover transactions when the card is not enrolled. For more information, see \&quot;Interpreting the Reply,\&quot; page 22.  If you are not using the CyberSource payment services, you must send this value to your payment processor in the subsequent request for card authorization. This field contains one of these values: - &#x60;06&#x60;: The card can be enrolled. Liability shift. - &#x60;07&#x60;: The card cannot be enrolled. No liability shift.  For validate, Numeric electronic commerce indicator (ECI) returned only for Visa, American Express, JCB, Diners Club, and Discover transactions. The field is absent when authentication fails. You must send this value to your payment processor in the subsequent request for card authorization. This field contains one of these values: - &#x60;05&#x60;: Successful authentication - &#x60;06&#x60;: Authentication attempted - &#x60;07&#x60;: Failed authentication (No response from the merchant because of a problem.) 
   * @return eci
  **/
  @ApiModelProperty(value = "Note This field applies only to non-U.S-issued cards.  For enroll, Numeric electronic commerce indicator (ECI) returned only for Visa, American Express, JCB, Diners Club, and Discover transactions when the card is not enrolled. For more information, see \"Interpreting the Reply,\" page 22.  If you are not using the CyberSource payment services, you must send this value to your payment processor in the subsequent request for card authorization. This field contains one of these values: - `06`: The card can be enrolled. Liability shift. - `07`: The card cannot be enrolled. No liability shift.  For validate, Numeric electronic commerce indicator (ECI) returned only for Visa, American Express, JCB, Diners Club, and Discover transactions. The field is absent when authentication fails. You must send this value to your payment processor in the subsequent request for card authorization. This field contains one of these values: - `05`: Successful authentication - `06`: Authentication attempted - `07`: Failed authentication (No response from the merchant because of a problem.) ")
  public String getEci() {
    return eci;
  }

  public void setEci(String eci) {
    this.eci = eci;
  }

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation eciRaw(String eciRaw) {
    this.eciRaw = eciRaw;
    return this;
  }

   /**
   * ECI value that can be returned for Visa, Mastercard, American Express, JCB, Diners Club, and Discover. The field is absent when authentication fails. If your payment processor is Streamline, you must pass the value of this field instead of the value of &#x60;eci&#x60; or &#x60;ucafCollectionIndicator&#x60;.  This field can contain one of these values: - &#x60;01&#x60;: Authentication attempted (Mastercard) - &#x60;02&#x60;: Successful authentication (Mastercard) - &#x60;05&#x60;: Successful authentication (Visa, American Express, JCB, Diners Club, and Discover) - &#x60;06&#x60;: Authentication attempted (Visa, American Express, JCB, Diners Club, and Discover) 
   * @return eciRaw
  **/
  @ApiModelProperty(value = "ECI value that can be returned for Visa, Mastercard, American Express, JCB, Diners Club, and Discover. The field is absent when authentication fails. If your payment processor is Streamline, you must pass the value of this field instead of the value of `eci` or `ucafCollectionIndicator`.  This field can contain one of these values: - `01`: Authentication attempted (Mastercard) - `02`: Successful authentication (Mastercard) - `05`: Successful authentication (Visa, American Express, JCB, Diners Club, and Discover) - `06`: Authentication attempted (Visa, American Express, JCB, Diners Club, and Discover) ")
  public String getEciRaw() {
    return eciRaw;
  }

  public void setEciRaw(String eciRaw) {
    this.eciRaw = eciRaw;
  }

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation paresStatus(String paresStatus) {
    this.paresStatus = paresStatus;
    return this;
  }

   /**
   * Raw result of the authentication check. If you are configured for Asia, Middle East, and Africa Gateway Processing, you need to send the value of this field in your authorization request. This field can contain one of these values: - &#x60;A&#x60;: Proof of authentication attempt was generated. - &#x60;N&#x60;: Customer failed or canceled authentication. Transaction denied. - &#x60;U&#x60;: Authentication not completed regardless of the reason. - &#x60;Y&#x60;: Customer was successfully authenticated. 
   * @return paresStatus
  **/
  @ApiModelProperty(value = "Raw result of the authentication check. If you are configured for Asia, Middle East, and Africa Gateway Processing, you need to send the value of this field in your authorization request. This field can contain one of these values: - `A`: Proof of authentication attempt was generated. - `N`: Customer failed or canceled authentication. Transaction denied. - `U`: Authentication not completed regardless of the reason. - `Y`: Customer was successfully authenticated. ")
  public String getParesStatus() {
    return paresStatus;
  }

  public void setParesStatus(String paresStatus) {
    this.paresStatus = paresStatus;
  }

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation sdkTransactionId(String sdkTransactionId) {
    this.sdkTransactionId = sdkTransactionId;
    return this;
  }

   /**
   * SDK unique transaction identifier that is generated on each new transaction. 
   * @return sdkTransactionId
  **/
  @ApiModelProperty(value = "SDK unique transaction identifier that is generated on each new transaction. ")
  public String getSdkTransactionId() {
    return sdkTransactionId;
  }

  public void setSdkTransactionId(String sdkTransactionId) {
    this.sdkTransactionId = sdkTransactionId;
  }

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation specificationVersion(String specificationVersion) {
    this.specificationVersion = specificationVersion;
    return this;
  }

   /**
   * This field contains the 3D Secure version that was used to process the transaction. For example, 1.0.2 or 2.0.0. 
   * @return specificationVersion
  **/
  @ApiModelProperty(value = "This field contains the 3D Secure version that was used to process the transaction. For example, 1.0.2 or 2.0.0. ")
  public String getSpecificationVersion() {
    return specificationVersion;
  }

  public void setSpecificationVersion(String specificationVersion) {
    this.specificationVersion = specificationVersion;
  }

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation threeDSServerTransactionId(String threeDSServerTransactionId) {
    this.threeDSServerTransactionId = threeDSServerTransactionId;
    return this;
  }

   /**
   * Unique transaction identifier assigned by the 3DS Server to identify a single transaction. 
   * @return threeDSServerTransactionId
  **/
  @ApiModelProperty(value = "Unique transaction identifier assigned by the 3DS Server to identify a single transaction. ")
  public String getThreeDSServerTransactionId() {
    return threeDSServerTransactionId;
  }

  public void setThreeDSServerTransactionId(String threeDSServerTransactionId) {
    this.threeDSServerTransactionId = threeDSServerTransactionId;
  }

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation ucafAuthenticationData(String ucafAuthenticationData) {
    this.ucafAuthenticationData = ucafAuthenticationData;
    return this;
  }

   /**
   * AAV is a unique identifier generated by the card-issuing bank for Mastercard Identity Check transactions after the customer is authenticated. The value is in base64. Include the data in the card authorization request. 
   * @return ucafAuthenticationData
  **/
  @ApiModelProperty(value = "AAV is a unique identifier generated by the card-issuing bank for Mastercard Identity Check transactions after the customer is authenticated. The value is in base64. Include the data in the card authorization request. ")
  public String getUcafAuthenticationData() {
    return ucafAuthenticationData;
  }

  public void setUcafAuthenticationData(String ucafAuthenticationData) {
    this.ucafAuthenticationData = ucafAuthenticationData;
  }

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation ucafCollectionIndicator(String ucafCollectionIndicator) {
    this.ucafCollectionIndicator = ucafCollectionIndicator;
    return this;
  }

   /**
   * For enroll, Returned only for Mastercard transactions. Indicates that authentication is not required because the customer is not enrolled. Add the value of this field to the authorization field ucaf_collection_indicator. This field can contain these values: 0, 1.  For validate, Numeric electronic commerce indicator (ECI) returned only for Mastercard Identity Check transactions. The field is absent when authentication fails. You must send this value to your payment processor in the request for card authorization. This field contain one of these values: - &#x60;0&#x60;: Authentication data not collected, and customer authentication was not completed. - &#x60;1&#x60;: Authentication data not collected because customer authentication was not completed. - &#x60;2&#x60;: Authentication data collected because customer completed authentication. 
   * @return ucafCollectionIndicator
  **/
  @ApiModelProperty(value = "For enroll, Returned only for Mastercard transactions. Indicates that authentication is not required because the customer is not enrolled. Add the value of this field to the authorization field ucaf_collection_indicator. This field can contain these values: 0, 1.  For validate, Numeric electronic commerce indicator (ECI) returned only for Mastercard Identity Check transactions. The field is absent when authentication fails. You must send this value to your payment processor in the request for card authorization. This field contain one of these values: - `0`: Authentication data not collected, and customer authentication was not completed. - `1`: Authentication data not collected because customer authentication was not completed. - `2`: Authentication data collected because customer completed authentication. ")
  public String getUcafCollectionIndicator() {
    return ucafCollectionIndicator;
  }

  public void setUcafCollectionIndicator(String ucafCollectionIndicator) {
    this.ucafCollectionIndicator = ucafCollectionIndicator;
  }

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation whiteListStatus(String whiteListStatus) {
    this.whiteListStatus = whiteListStatus;
    return this;
  }

   /**
   * Enables the communication of trusted beneficiary/whitelist status between the ACS, the DS and the 3DS Requestor.  Possible Values:  Y - 3DS Requestor is whitelisted by cardholder  N - 3DS Requestor is not whitelisted by cardholder 
   * @return whiteListStatus
  **/
  @ApiModelProperty(value = "Enables the communication of trusted beneficiary/whitelist status between the ACS, the DS and the 3DS Requestor.  Possible Values:  Y - 3DS Requestor is whitelisted by cardholder  N - 3DS Requestor is not whitelisted by cardholder ")
  public String getWhiteListStatus() {
    return whiteListStatus;
  }

  public void setWhiteListStatus(String whiteListStatus) {
    this.whiteListStatus = whiteListStatus;
  }

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation whiteListStatusSource(String whiteListStatusSource) {
    this.whiteListStatusSource = whiteListStatusSource;
    return this;
  }

   /**
   * This data element will be populated by the system setting Whitelist Status. Possible Values: 01 - 3DS/ Server/ 02 – DS/03 - ACS 
   * @return whiteListStatusSource
  **/
  @ApiModelProperty(value = "This data element will be populated by the system setting Whitelist Status. Possible Values: 01 - 3DS/ Server/ 02 – DS/03 - ACS ")
  public String getWhiteListStatusSource() {
    return whiteListStatusSource;
  }

  public void setWhiteListStatusSource(String whiteListStatusSource) {
    this.whiteListStatusSource = whiteListStatusSource;
  }

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation xid(String xid) {
    this.xid = xid;
    return this;
  }

   /**
   * Transaction identifier generated by CyberSource for successful enrollment or validation checks. Use this value, which is in base64, to match an outgoing PAReq with an incoming PARes. CyberSource forwards the XID with the card authorization service to these payment processors in these cases: - Barclays - Streamline (when the **ecommerceIndicator**&#x60;&#x3D;spa&#x60;) 
   * @return xid
  **/
  @ApiModelProperty(value = "Transaction identifier generated by CyberSource for successful enrollment or validation checks. Use this value, which is in base64, to match an outgoing PAReq with an incoming PARes. CyberSource forwards the XID with the card authorization service to these payment processors in these cases: - Barclays - Streamline (when the **ecommerceIndicator**`=spa`) ")
  public String getXid() {
    return xid;
  }

  public void setXid(String xid) {
    this.xid = xid;
  }

  public RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation directoryServerTransactionId(String directoryServerTransactionId) {
    this.directoryServerTransactionId = directoryServerTransactionId;
    return this;
  }

   /**
   * The Directory Server Transaction ID is generated by the Mastercard Directory Server during the authentication transaction and passed back to the merchant with the authentication results. For Cybersource Through Visanet Gateway: The value for this field corresponds to the following data in the TC 33 capture file3: Record: CP01 TCR7, Position: 114-149, Field: MC AVV Verification—Directory Server Transaction ID 
   * @return directoryServerTransactionId
  **/
  @ApiModelProperty(value = "The Directory Server Transaction ID is generated by the Mastercard Directory Server during the authentication transaction and passed back to the merchant with the authentication results. For Cybersource Through Visanet Gateway: The value for this field corresponds to the following data in the TC 33 capture file3: Record: CP01 TCR7, Position: 114-149, Field: MC AVV Verification—Directory Server Transaction ID ")
  public String getDirectoryServerTransactionId() {
    return directoryServerTransactionId;
  }

  public void setDirectoryServerTransactionId(String directoryServerTransactionId) {
    this.directoryServerTransactionId = directoryServerTransactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation = (RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation) o;
    return Objects.equals(this.acsRenderingType, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.acsRenderingType) &&
        Objects.equals(this.acsTransactionId, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.acsTransactionId) &&
        Objects.equals(this.authenticationResult, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.authenticationResult) &&
        Objects.equals(this.authenticationStatusMsg, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.authenticationStatusMsg) &&
        Objects.equals(this.authorizationPayload, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.authorizationPayload) &&
        Objects.equals(this.cavv, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.cavv) &&
        Objects.equals(this.cavvAlgorithm, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.cavvAlgorithm) &&
        Objects.equals(this.directoryServerErrorCode, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.directoryServerErrorCode) &&
        Objects.equals(this.directoryServerErrorDescription, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.directoryServerErrorDescription) &&
        Objects.equals(this.indicator, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.indicator) &&
        Objects.equals(this.interactionCounter, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.interactionCounter) &&
        Objects.equals(this.eci, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.eci) &&
        Objects.equals(this.eciRaw, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.eciRaw) &&
        Objects.equals(this.paresStatus, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.paresStatus) &&
        Objects.equals(this.sdkTransactionId, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.sdkTransactionId) &&
        Objects.equals(this.specificationVersion, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.specificationVersion) &&
        Objects.equals(this.threeDSServerTransactionId, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.threeDSServerTransactionId) &&
        Objects.equals(this.ucafAuthenticationData, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.ucafAuthenticationData) &&
        Objects.equals(this.ucafCollectionIndicator, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.ucafCollectionIndicator) &&
        Objects.equals(this.whiteListStatus, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.whiteListStatus) &&
        Objects.equals(this.whiteListStatusSource, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.whiteListStatusSource) &&
        Objects.equals(this.xid, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.xid) &&
        Objects.equals(this.directoryServerTransactionId, riskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation.directoryServerTransactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acsRenderingType, acsTransactionId, authenticationResult, authenticationStatusMsg, authorizationPayload, cavv, cavvAlgorithm, directoryServerErrorCode, directoryServerErrorDescription, indicator, interactionCounter, eci, eciRaw, paresStatus, sdkTransactionId, specificationVersion, threeDSServerTransactionId, ucafAuthenticationData, ucafCollectionIndicator, whiteListStatus, whiteListStatusSource, xid, directoryServerTransactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskV1AuthenticationResultsPost201ResponseConsumerAuthenticationInformation {\n");
    
    sb.append("    acsRenderingType: ").append(toIndentedString(acsRenderingType)).append("\n");
    sb.append("    acsTransactionId: ").append(toIndentedString(acsTransactionId)).append("\n");
    sb.append("    authenticationResult: ").append(toIndentedString(authenticationResult)).append("\n");
    sb.append("    authenticationStatusMsg: ").append(toIndentedString(authenticationStatusMsg)).append("\n");
    sb.append("    authorizationPayload: ").append(toIndentedString(authorizationPayload)).append("\n");
    sb.append("    cavv: ").append(toIndentedString(cavv)).append("\n");
    sb.append("    cavvAlgorithm: ").append(toIndentedString(cavvAlgorithm)).append("\n");
    sb.append("    directoryServerErrorCode: ").append(toIndentedString(directoryServerErrorCode)).append("\n");
    sb.append("    directoryServerErrorDescription: ").append(toIndentedString(directoryServerErrorDescription)).append("\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    interactionCounter: ").append(toIndentedString(interactionCounter)).append("\n");
    sb.append("    eci: ").append(toIndentedString(eci)).append("\n");
    sb.append("    eciRaw: ").append(toIndentedString(eciRaw)).append("\n");
    sb.append("    paresStatus: ").append(toIndentedString(paresStatus)).append("\n");
    sb.append("    sdkTransactionId: ").append(toIndentedString(sdkTransactionId)).append("\n");
    sb.append("    specificationVersion: ").append(toIndentedString(specificationVersion)).append("\n");
    sb.append("    threeDSServerTransactionId: ").append(toIndentedString(threeDSServerTransactionId)).append("\n");
    sb.append("    ucafAuthenticationData: ").append(toIndentedString(ucafAuthenticationData)).append("\n");
    sb.append("    ucafCollectionIndicator: ").append(toIndentedString(ucafCollectionIndicator)).append("\n");
    sb.append("    whiteListStatus: ").append(toIndentedString(whiteListStatus)).append("\n");
    sb.append("    whiteListStatusSource: ").append(toIndentedString(whiteListStatusSource)).append("\n");
    sb.append("    xid: ").append(toIndentedString(xid)).append("\n");
    sb.append("    directoryServerTransactionId: ").append(toIndentedString(directoryServerTransactionId)).append("\n");
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

