package me.dags.plotsweb.service;

import java.net.URL;
import java.nio.file.Path;
import java.util.Optional;

/**
 * @author dags <dags@dags.me>
 */
public interface PlotsWebService {

    Optional<URL> getDataStoreURL(DataStore dataStore);

    DataStore newMemoryDataStore(String name, byte[] rawData);

    DataStore newFileDataStore(Path path);

    boolean running();
}
