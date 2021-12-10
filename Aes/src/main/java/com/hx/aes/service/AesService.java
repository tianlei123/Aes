package com.hx.aes.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "AesService", targetNamespace = "http://server.webservice.example.com")
public interface AesService {
    @WebMethod
    String Encrypt(@WebParam String str,@WebParam String userkey);
}
