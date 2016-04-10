package org.vish.microservice;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskListConfiguration extends Configuration {
	private int maxLength;

    @JsonProperty
    public int getMaxLength() {
        return maxLength;
    }

    @JsonProperty
    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }
}
