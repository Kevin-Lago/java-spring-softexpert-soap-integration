package com.softexpert.integration.config;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

import javax.xml.soap.MimeHeaders;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class SoftExpertSoapRequestCallback implements WebServiceMessageCallback {
    private String soapAction;

    public SoftExpertSoapRequestCallback(String soapAction) {
        this.soapAction = soapAction;
    }

    @Override
    public void doWithMessage(WebServiceMessage webServiceMessage) throws IOException, TransformerException {
        MimeHeaders headers = ((SaajSoapMessage) webServiceMessage).getSaajMessage().getMimeHeaders();
        headers.addHeader("SOAPAction", soapAction);
        headers.addHeader("Authorization", Settings.JWT);
    }
}
