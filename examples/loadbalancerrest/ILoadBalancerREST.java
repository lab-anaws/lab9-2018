package net.floodlightcontroller.unipi.loadbalancerrest;

import java.util.Map;

import net.floodlightcontroller.core.module.IFloodlightService;
import net.floodlightcontroller.core.types.SwitchMessagePair;
import net.floodlightcontroller.util.ConcurrentCircularBuffer;

// Service interface for the module
// This interface will be use to interact with other modules
// Export here all the methods of the class that are likely used by other modules

public interface ILoadBalancerREST extends IFloodlightService {
	public Map<String, Object> getServersInfo();
	
	public void setHardTimeout(int newValue);
}
