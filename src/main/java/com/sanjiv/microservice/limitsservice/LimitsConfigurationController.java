package com.sanjiv.microservice.limitsservice;

import com.sanjiv.microservice.limitsservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController
{
    @Autowired
    private LimitConfiguration configuration;

    public LimitConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(LimitConfiguration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public LimitConfiguration retriveLimitsFromConfiguration(){

        return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }
}
