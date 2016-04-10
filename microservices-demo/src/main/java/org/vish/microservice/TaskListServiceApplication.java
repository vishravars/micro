package org.vish.microservice;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class TaskListServiceApplication extends Application<TaskListConfiguration> {
    public static void main(String[] args) throws Exception {
        new TaskListServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "task-list-service";
    }

    @Override
    public void initialize(Bootstrap<TaskListConfiguration> bootstrap) {
        // nothing to do yet
    }

	@Override
	public void run(TaskListConfiguration configuration, Environment environment) throws Exception {
		 // register resource now
        final TaskListResource resource = new TaskListResource(
                configuration.getMaxLength()
        );
        environment.jersey().register(resource);
		
	}

}