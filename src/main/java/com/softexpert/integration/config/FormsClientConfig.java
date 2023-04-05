package com.softexpert.integration.config;

import com.softexpert.integration.client.FormsClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.config.annotation.EnableWs;

@Configuration
@EnableWs
public class FormsClientConfig {
    @Bean
    public Jaxb2Marshaller marshallerClient() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        String[] packagesToScan = {"com.softexpert.integration.wsdl.forms"};
        marshaller.setPackagesToScan(packagesToScan);
        return marshaller;
    }

    @Bean
    public FormsClient formsClient(Jaxb2Marshaller marshaller) {
        FormsClient formsClient = new FormsClient();
        formsClient.setMarshaller(marshaller);
        formsClient.setUnmarshaller(marshaller);
        return formsClient;
    }
}
