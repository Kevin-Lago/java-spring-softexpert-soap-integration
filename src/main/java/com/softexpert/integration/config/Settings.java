package com.softexpert.integration.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Settings {
    public static String JWT;
    public static String DOMAIN;
    public static String FORMS_ENDPOINT;

    public Settings(
            @Value("${env.soft-expert.jwt}") String jwt,
            @Value("${env.soft-expert.domain}") String domain,
            @Value("${env.soft-expert.forms-endpoint}") String formsEndpoint
    ) {
        Settings.JWT = jwt;
        Settings.DOMAIN = domain;
        Settings.FORMS_ENDPOINT = formsEndpoint;
    }
}
