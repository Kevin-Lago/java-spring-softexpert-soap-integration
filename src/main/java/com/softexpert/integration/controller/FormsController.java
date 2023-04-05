package com.softexpert.integration.controller;

import com.softexpert.integration.client.FormsClient;
import com.softexpert.integration.wsdl.forms.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/forms")
public class FormsController {
    @Autowired
    FormsClient client;

    @PostMapping
    public ResponseEntity<Object> newTableRecord(
            @RequestBody NewTableRecordRequestType newTableRecordRequestType
    ) {
        try {
            return new ResponseEntity<>(client.newTableRecord(newTableRecordRequestType), HttpStatus.CREATED);
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

    @PutMapping
    public ResponseEntity<Object> editTableRecord(
            @RequestBody EditTableRecordRequestType editTableRecordRequestType
    ) {
        try {
            return new ResponseEntity<>(client.editTableRecord(editTableRecordRequestType), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping
    public ResponseEntity<Object> deleteTableRecord(
            @RequestBody DeleteTableRecordRequestType deleteTableRecordRequestType
    ) {
        try {
            return new ResponseEntity<>(client.deleteTableRecord(deleteTableRecordRequestType), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/list")
    public ResponseEntity<Object> createTableRecordList(
            @RequestBody NewTableRecordListRequestType newTableRecordListRequestType
    ) {
        try {
            return new ResponseEntity<>(client.newTableRecordList(newTableRecordListRequestType), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/list")
    public ResponseEntity<Object> deleteTableRecordList(
            @RequestBody DeleteTableRecordListRequestType deleteTableRecordListRequestType
    ) {
        try {
            return new ResponseEntity<>(client.deleteTableRecordList(deleteTableRecordListRequestType), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
