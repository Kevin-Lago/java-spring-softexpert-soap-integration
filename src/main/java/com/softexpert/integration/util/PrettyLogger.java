package com.softexpert.integration.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;

public class PrettyLogger {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static void logObject(Logger log, String message, Object object) {
        try {
            log.debug(message + "\n" + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object));
        } catch (JsonProcessingException e) {
            log.warn("Failed to map JaxbElement to string");
        }
    }
}
