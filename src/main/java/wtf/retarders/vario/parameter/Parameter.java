package wtf.retarders.vario.parameter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface Parameter {

    /**
     * Gets the name of the parameter
     *
     *
     * @return the name
     */
    String name();

    /**
     * Gets the description of the parameter
     * default = ""
     *
     *
     * @return the description
     */
    String description() default "";

}
