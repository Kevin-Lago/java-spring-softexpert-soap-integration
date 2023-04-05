package com.softexpert.integration.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.softexpert.integration.config.SoftExpertSoapRequestCallback;
import com.softexpert.integration.config.TableRecordClientConfig;
import com.softexpert.integration.wsdl.form.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;
import java.math.BigInteger;

public class TableRecordClient extends WebServiceGatewaySupport {
    private static final Logger log = LoggerFactory.getLogger(TableRecordClientConfig.class.getName());
    private static final ObjectMapper mapper = new ObjectMapper();

    public JAXBElement<NewTableRecordResponseType> newTableRecord(NewTableRecordRequestType newTableRecordRequestType) {
        JAXBElement<NewTableRecordResponseType> response = (JAXBElement<NewTableRecordResponseType>) createSoapRequest(
                newTableRecordRequestType,
                "urn:form#newTableRecord"
        );

        logResponse("Created table record(s)", response);
        return response;
    }

    public JAXBElement<GetTableRecordResponseType> getTableRecords(GetTableRecordRequestType getTableRecordRequestType) {
        JAXBElement<GetTableRecordResponseType> response = (JAXBElement<GetTableRecordResponseType>) createSoapRequest(
                getTableRecordRequestType,
                "urn:form#getTableRecord"
        );

        logResponse("Fetched table record(s)", response);
        return response;
    }

    private void logResponse(String message, Object response) {
        try {
            log.debug(message + "\n" + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response));
        } catch (JsonProcessingException e) {
            log.warn("Failed to map JaxbElement to string");
        }
    }

    private Object createSoapRequest(Object schema, String soapAction) {
        return getWebServiceTemplate()
                .marshalSendAndReceive(
                        "https://nanolumens-test.softexpert.com/apigateway/se/ws/fm_ws.php",
                        schema,
                        new SoftExpertSoapRequestCallback(soapAction)
                );
    }
}
