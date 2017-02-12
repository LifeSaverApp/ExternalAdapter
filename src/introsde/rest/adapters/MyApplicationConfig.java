package introsde.rest.adapters;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("introsde")
public class MyApplicationConfig extends ResourceConfig {
    public MyApplicationConfig () {
        packages("introsde.rest.adapters");
//        register(ExceptionListener.class);
    }
}
