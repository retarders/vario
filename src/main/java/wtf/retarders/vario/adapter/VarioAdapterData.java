package wtf.retarders.vario.adapter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface VarioAdapterData {

    /**
     * Gets the aliases of the command
     *
     *
     * @return the aliases array
     */
    String[] aliases();

    /**
     * Gets the permission of the command
     * default = "" (no permission needed)
     *
     * @return the permission
     */
    String permission() default "";

}
