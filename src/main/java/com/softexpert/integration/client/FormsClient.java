package com.softexpert.integration.client;

import com.softexpert.integration.config.Settings;
import com.softexpert.integration.config.SoftExpertSoapRequestCallback;
import com.softexpert.integration.config.FormsClientConfig;
import com.softexpert.integration.wsdl.forms.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;

import static com.softexpert.integration.util.PrettyLogger.logObject;

public class FormsClient extends WebServiceGatewaySupport {
    private static final Logger log = LoggerFactory.getLogger(FormsClientConfig.class.getName());

    public NewTableRecordResponseType newTableRecord(NewTableRecordRequestType newTableRecordRequestType) {
        JAXBElement<NewTableRecordResponseType> response = (JAXBElement<NewTableRecordResponseType>) createSoapRequest(
                newTableRecordRequestType,
                "urn:form#newTableRecord"
        );

        logObject(log, "Created table record(s)", response);
        return response.getValue();
    }

    public GetTableRecordResponseType getTableRecords(GetTableRecordRequestType getTableRecordRequestType) {
        JAXBElement<GetTableRecordResponseType> response = (JAXBElement<GetTableRecordResponseType>) createSoapRequest(
                getTableRecordRequestType,
                "urn:form#getTableRecord"
        );

        logObject(log, "Fetched table record(s)", response);
        return response.getValue();
    }

    public EditTableRecordResponseType editTableRecord(EditTableRecordRequestType editTableRecordRequestType) {
        JAXBElement<EditTableRecordResponseType> response = (JAXBElement<EditTableRecordResponseType>) createSoapRequest(
                editTableRecordRequestType,
                "urn:form#editTableRecord"
        );

        logObject(log, "Modified table record(s)", response);
        return response.getValue();
    }

    public DeleteTableRecordResponseType deleteTableRecord(DeleteTableRecordRequestType deleteTableRecordRequestType) {
        JAXBElement<DeleteTableRecordResponseType> response = (JAXBElement<DeleteTableRecordResponseType>) createSoapRequest(
                deleteTableRecordRequestType,
                "urn:form#deleteTableRecord"
        );

        logObject(log, "Deleted table record(s)", response);
        return response.getValue();
    }

    public NewTableRecordListResponseType newTableRecordList(NewTableRecordListRequestType newTableRecordListRequestType) {
        JAXBElement<NewTableRecordListResponseType> response = (JAXBElement<NewTableRecordListResponseType>) createSoapRequest(
                newTableRecordListRequestType,
                "urn:form#newTableRecordList"
        );

        logObject(log, "Created table record list(s)", response);
        return response.getValue();
    }

    public DeleteTableRecordListResponseType deleteTableRecordList(DeleteTableRecordListRequestType deleteTableRecordListRequestType) {
        JAXBElement<DeleteTableRecordListResponseType> response = (JAXBElement<DeleteTableRecordListResponseType>) createSoapRequest(
                deleteTableRecordListRequestType,
                "urn:form#deleteTableRecordList"
        );

        logObject(log, "Deleted table record list(s)", response);
        return response.getValue();
    }

    private Object createSoapRequest(Object schema, String soapAction) {
        return getWebServiceTemplate()
                .marshalSendAndReceive(
                        Settings.DOMAIN + Settings.FORMS_ENDPOINT,
                        schema,
                        new SoftExpertSoapRequestCallback(soapAction)
                );
    }
}
