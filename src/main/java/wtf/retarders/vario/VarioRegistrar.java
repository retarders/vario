package wtf.retarders.vario;

import wtf.retarders.vario.adapter.VarioAdapter;
import wtf.retarders.vario.parameter.converter.ParameterConverter;

public interface VarioRegistrar {

    /**
     * Registers a command to the registrar
     *
     *
     * @param adapter the adapter instance
     */
    void register(VarioAdapter adapter);

    /**
     * Registers a parameter converter to the registrar
     *
     *
     * @param converter the converted
     */
    void registerConverter(ParameterConverter converter);

}
