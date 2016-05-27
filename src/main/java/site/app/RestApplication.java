package site.app;


import site.services.*;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Application definition class for a JAX-RS application.
 * <p>
 * Defines the classes containing JAX-RS annotations which will be exposed as REST web services by the JAX-RS implementation.
 * <p>
 * This class must be referenced by the WEB-INF/web.xml descriptor to be used.
 * <p>
 */
public class RestApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(UserService.class);

        return classes;
    }
}
