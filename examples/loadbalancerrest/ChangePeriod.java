package net.floodlightcontroller.unipi.loadbalancerrest;

import java.io.IOException;
import java.util.Map;

import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ChangePeriod extends ServerResource {
	@Post("json")
	public String store(String fmJson) {
	    
        // Check if the payload is provided
        if(fmJson == null){
            return new String("No attributes");
        }
		
		// Parse the JSON input
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			
			JsonNode root = mapper.readTree(fmJson);
			
			// Get the field hardtimeout
			int newValue = Integer.parseInt(root.get("hardtimeout").asText());
			
			ILoadBalancerREST lb = (ILoadBalancerREST) getContext().getAttributes().get(ILoadBalancerREST.class.getCanonicalName());
			
			lb.setHardTimeout(newValue);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    return new String("OK");

	}
}
