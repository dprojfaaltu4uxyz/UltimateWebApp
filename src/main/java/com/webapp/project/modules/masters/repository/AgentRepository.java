package com.webapp.project.modules.masters.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.webapp.project.modules.masters.model.Agent;
@Component
public interface AgentRepository extends MongoRepository<Agent, String> {

	 	/*@Query("{ 'classes' : ?0 }")
	    Agent getAgentByName(String name);
	    
	    @Query(fields="{ 'agentCode' : 'Ag000001', 'agentId' : 1, 'agentName' : 'Agent1'}")
	    List getAllAgents();
	    
	    @Query(value="{ 'agentId' : ?0}",fields="{ 'agentCode' : 'Ag000001', 'agentId' : 1, 'agentName' : 'Agent'}")
	    List getAgentById(Long agentId);*/
	
}
