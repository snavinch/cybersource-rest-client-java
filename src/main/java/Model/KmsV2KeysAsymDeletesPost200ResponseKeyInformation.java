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
import Model.KmsV2KeysSymPost201ResponseErrorInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * key information 
 */
@ApiModel(description = "key information ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-26T11:59:18.619+05:30")
public class KmsV2KeysAsymDeletesPost200ResponseKeyInformation {
  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("referenceNumber")
  private String referenceNumber = null;

  @SerializedName("keyId")
  private String keyId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("errorInformation")
  private KmsV2KeysSymPost201ResponseErrorInformation errorInformation = null;

  public KmsV2KeysAsymDeletesPost200ResponseKeyInformation organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Merchant Id 
   * @return organizationId
  **/
  @ApiModelProperty(value = "Merchant Id ")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public KmsV2KeysAsymDeletesPost200ResponseKeyInformation referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * Reference number is a unique identifier provided by the client along with the organization Id. This is an optional field provided solely for the client’s convenience. If client specifies value for this field in the request, it is expected to be available in the response. 
   * @return referenceNumber
  **/
  @ApiModelProperty(value = "Reference number is a unique identifier provided by the client along with the organization Id. This is an optional field provided solely for the client’s convenience. If client specifies value for this field in the request, it is expected to be available in the response. ")
  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public KmsV2KeysAsymDeletesPost200ResponseKeyInformation keyId(String keyId) {
    this.keyId = keyId;
    return this;
  }

   /**
   * Key Serial Number 
   * @return keyId
  **/
  @ApiModelProperty(value = "Key Serial Number ")
  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }

  public KmsV2KeysAsymDeletesPost200ResponseKeyInformation status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the key.  Possible values:  - FAILED  - ACTIVE  - INACTIVE  - EXPIRED 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the key.  Possible values:  - FAILED  - ACTIVE  - INACTIVE  - EXPIRED ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public KmsV2KeysAsymDeletesPost200ResponseKeyInformation message(String message) {
    this.message = message;
    return this;
  }

   /**
   * message in case of failed key
   * @return message
  **/
  @ApiModelProperty(value = "message in case of failed key")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public KmsV2KeysAsymDeletesPost200ResponseKeyInformation errorInformation(KmsV2KeysSymPost201ResponseErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
    return this;
  }

   /**
   * Get errorInformation
   * @return errorInformation
  **/
  @ApiModelProperty(value = "")
  public KmsV2KeysSymPost201ResponseErrorInformation getErrorInformation() {
    return errorInformation;
  }

  public void setErrorInformation(KmsV2KeysSymPost201ResponseErrorInformation errorInformation) {
    this.errorInformation = errorInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KmsV2KeysAsymDeletesPost200ResponseKeyInformation kmsV2KeysAsymDeletesPost200ResponseKeyInformation = (KmsV2KeysAsymDeletesPost200ResponseKeyInformation) o;
    return Objects.equals(this.organizationId, kmsV2KeysAsymDeletesPost200ResponseKeyInformation.organizationId) &&
        Objects.equals(this.referenceNumber, kmsV2KeysAsymDeletesPost200ResponseKeyInformation.referenceNumber) &&
        Objects.equals(this.keyId, kmsV2KeysAsymDeletesPost200ResponseKeyInformation.keyId) &&
        Objects.equals(this.status, kmsV2KeysAsymDeletesPost200ResponseKeyInformation.status) &&
        Objects.equals(this.message, kmsV2KeysAsymDeletesPost200ResponseKeyInformation.message) &&
        Objects.equals(this.errorInformation, kmsV2KeysAsymDeletesPost200ResponseKeyInformation.errorInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, referenceNumber, keyId, status, message, errorInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KmsV2KeysAsymDeletesPost200ResponseKeyInformation {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errorInformation: ").append(toIndentedString(errorInformation)).append("\n");
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

