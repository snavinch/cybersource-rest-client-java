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
import Model.PtsV2PayoutsPost201ResponseRecipientInformationCard;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PayoutsPost201ResponseRecipientInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-26T11:59:18.619+05:30")
public class PtsV2PayoutsPost201ResponseRecipientInformation {
  @SerializedName("card")
  private PtsV2PayoutsPost201ResponseRecipientInformationCard card = null;

  public PtsV2PayoutsPost201ResponseRecipientInformation card(PtsV2PayoutsPost201ResponseRecipientInformationCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public PtsV2PayoutsPost201ResponseRecipientInformationCard getCard() {
    return card;
  }

  public void setCard(PtsV2PayoutsPost201ResponseRecipientInformationCard card) {
    this.card = card;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtsV2PayoutsPost201ResponseRecipientInformation ptsV2PayoutsPost201ResponseRecipientInformation = (PtsV2PayoutsPost201ResponseRecipientInformation) o;
    return Objects.equals(this.card, ptsV2PayoutsPost201ResponseRecipientInformation.card);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PayoutsPost201ResponseRecipientInformation {\n");
    
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
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

