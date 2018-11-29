package net.floodlightcontroller.unipi.loadbalancerrest;

import java.util.HashMap;
import java.util.Map;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class GetServerInfo extends ServerResource {
	
    @Get("json")
    public Map<String, Object> Test() {
    	
    	ILoadBalancerREST lb = (ILoadBalancerREST) getContext().getAttributes().get(ILoadBalancerREST.class.getCanonicalName());
    	return lb.getServersInfo();
    	
    }
	
}
