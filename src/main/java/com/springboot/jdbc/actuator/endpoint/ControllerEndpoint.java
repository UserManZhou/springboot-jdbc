package com.springboot.jdbc.actuator.endpoint;

import org.apache.logging.log4j.util.Strings;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;

@Component
@Endpoint(id = "container")
public class ControllerEndpoint {

    @ReadOperation
    public Map getEndpoint(){
        return Collections.singletonMap("Contoller", "controller Endpoint");
    }

    @WriteOperation
    public void StopControllerEndpoint(){
        System.out.println("\"Stop Controller EndPoint\" = " + "Stop Controller EndPoint");
    }
}
