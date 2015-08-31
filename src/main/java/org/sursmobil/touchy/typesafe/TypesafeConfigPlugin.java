package org.sursmobil.touchy.typesafe;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.sursmobil.touchy.api.plugin.TouchyPlugin;
import org.sursmobil.touchy.api.plugin.ValueSourceSupplier;

/**
 * Created by CJ on 31/08/2015.
 */
@TouchyPlugin
public class TypesafeConfigPlugin {
    private final Config config;

    @ValueSourceSupplier
    public final TypesafeConfig source;

    public TypesafeConfigPlugin() {
        config = ConfigFactory.load();
        source = new TypesafeConfig(config);
    }
}
