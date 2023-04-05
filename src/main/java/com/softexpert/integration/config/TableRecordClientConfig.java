package com.softexpert.integration.config;

import com.softexpert.integration.client.TableRecordClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.config.annotation.EnableWs;

@Configuration
@EnableWs
public class TableRecordClientConfig {
    @Bean
    public Jaxb2Marshaller marshallerClient() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        String[] packagesToScan = {"com.softexpert.integration.wsdl"};
        marshaller.setPackagesToScan(packagesToScan);
        return marshaller;
    }

    @Bean
    public TableRecordClient tableRecordClient(Jaxb2Marshaller marshaller) {
        TableRecordClient tableRecordClient = new TableRecordClient();
        tableRecordClient.setMarshaller(marshaller);
        tableRecordClient.setUnmarshaller(marshaller);
        return tableRecordClient;
    }
}
