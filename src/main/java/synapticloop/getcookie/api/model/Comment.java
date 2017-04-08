package synapticloop.getcookie.api.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"op_client_id",
	"op_signature"
})
public class Comment extends ModelBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Comment.class);

	@JsonProperty("op_client_id")  private Integer opClientId;
	@JsonProperty("op_signature")  private String opSignature;

	public Integer getOpClientId() { return opClientId; }

	public String getOpSignature() { return opSignature; }

	@Override
	public Logger getLogger() { return(LOGGER); }

}
