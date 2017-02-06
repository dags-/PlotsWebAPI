package me.dags.plotsweb.service;

import java.io.IOException;

/**
 * @author dags <dags@dags.me>
 */
public interface DataStore {

    String getPath();

    Details getDetails() throws IOException;

    boolean exists() throws IOException;

    byte[] getData() throws IOException;

    void delete() throws IOException;

    default int getHashCode() {
        return getPath().hashCode();
    }

    default boolean checkEquals(Object other) {
        return other != null && other.getClass() == this.getClass() && ((DataStore) other).getPath().equals(getPath());
    }

    public interface Details {

        String getName();

        String getDate();

        long getLength();
    }
}
