package synapticloop.getcookie.api.model;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"groups"
})
public class GroupData extends ModelBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(GroupData.class);

	@JsonProperty("groups")  private List<Group> groups = new ArrayList<Group>();

	public List<Group> getGroups() { return groups; }

	@Override
	public Logger getLogger() { return(LOGGER); }

}
