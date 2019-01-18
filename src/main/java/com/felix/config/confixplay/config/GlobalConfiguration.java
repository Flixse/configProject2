package com.felix.config.confixplay.config;

import org.springframework.context.annotation.Configuration;

/**
 * Created by Felix Porres on 14/01/2019.
 */
public class GlobalConfiguration {
    private int connectionTimeout;

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }
}
