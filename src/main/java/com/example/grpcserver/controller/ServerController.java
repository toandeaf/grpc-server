package com.example.grpcserver.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class ServerController
{
    @RequestMapping("/ping")
    @ResponseBody
    public ResponseEntity returnData()
    {
        return new ResponseEntity("Server is running!", null, HttpStatus.ACCEPTED);
    }
}
