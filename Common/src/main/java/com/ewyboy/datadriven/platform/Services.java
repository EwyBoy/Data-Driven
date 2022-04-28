package com.ewyboy.datadriven.platform;

import com.ewyboy.datadriven.platform.services.IPlatformHelper;
import com.ewyboy.datadriven.Constants;
import com.ewyboy.datadriven.util.ModLogger;

import java.util.ServiceLoader;

public class Services {

    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);

    public static <T> T load(Class<T> clazz) {

        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        ModLogger.debug("Loaded {} for service {}", loadedService, clazz);

        return loadedService;
    }
}
