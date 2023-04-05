package com.softexpert.integration.controller;

import com.softexpert.integration.client.TableRecordClient;
import com.softexpert.integration.wsdl.form.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;

@RestController
@RequestMapping("/api/table")
public class TableRecordController {
    @Autowired
    TableRecordClient client;

    @PostMapping
    public ResponseEntity<Object> newTableRecord(
            @RequestBody NewTableRecordRequestType newTableRecordRequestType
    ) {
        try {
            return new ResponseEntity<>(client.newTableRecord(newTableRecordRequestType), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<Object> getTableRecords(
            @RequestBody GetTableRecordRequestType getTableRecordRequestType
    ) {
        try {
            return new ResponseEntity<>(client.getTableRecords(getTableRecordRequestType), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    @PutMapping
//    public ResponseEntity<Object> editTableRecord(
//            @RequestBody EditTableRecordRequestType editTableRecordRequestType
//            ) {
//
//    }
}
