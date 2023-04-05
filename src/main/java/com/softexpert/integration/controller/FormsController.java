package com.softexpert.integration.controller;

import com.softexpert.integration.client.FormsClient;
import com.softexpert.integration.wsdl.forms.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/forms")
public class FormsController {
    @Autowired
    FormsClient client;

    @PostMapping(
            value = "/new",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public ResponseEntity<NewTableRecordResponseType> newTableRecord(
            @RequestBody NewTableRecordRequestType newTableRecordRequestType
    ) {
        try {
            return new ResponseEntity<>(client.newTableRecord(newTableRecordRequestType), HttpStatus.CREATED);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }

    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public ResponseEntity<GetTableRecordResponseType> getTableRecords(
            @RequestBody GetTableRecordRequestType getTableRecordRequestType
    ) {
        try {
            return new ResponseEntity<>(client.getTableRecords(getTableRecordRequestType), HttpStatus.OK);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }

    @PutMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public ResponseEntity<EditTableRecordResponseType> editTableRecord(
            @RequestBody EditTableRecordRequestType editTableRecordRequestType
    ) {
        try {
            return new ResponseEntity<>(client.editTableRecord(editTableRecordRequestType), HttpStatus.OK);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }

    @DeleteMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public ResponseEntity<DeleteTableRecordResponseType> deleteTableRecord(
            @RequestBody DeleteTableRecordRequestType deleteTableRecordRequestType
    ) {
        try {
            return new ResponseEntity<>(client.deleteTableRecord(deleteTableRecordRequestType), HttpStatus.OK);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }

    @PostMapping(
            value = "/list",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public ResponseEntity<NewTableRecordListResponseType> createTableRecordList(
            @RequestBody NewTableRecordListRequestType newTableRecordListRequestType
    ) {
        try {
            return new ResponseEntity<>(client.newTableRecordList(newTableRecordListRequestType), HttpStatus.OK);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }

    @DeleteMapping(
            value = "/list",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public ResponseEntity<DeleteTableRecordListResponseType> deleteTableRecordList(
            @RequestBody DeleteTableRecordListRequestType deleteTableRecordListRequestType
    ) {
        try {
            return new ResponseEntity<>(client.deleteTableRecordList(deleteTableRecordListRequestType), HttpStatus.OK);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }
}
