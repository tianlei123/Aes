package com.hx.aes.service;

import com.hx.aes.until.AesTools;
import org.bouncycastle.util.encoders.Hex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

@Component
@WebService(name = "AesService", targetNamespace = "http://server.webservice.example.com",
        endpointInterface = "com.hx.aes.service.AesService")
public class AesServiceImp implements AesService{
    @Autowired
    private AesTools aes;
    @Override
    public String Encrypt(String str, String userkey) {
      return new String(Hex.encode(aes.encrypt(str,userkey)));
    }
}
