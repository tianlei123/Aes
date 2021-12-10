package com.hx.aes;

import com.hx.aes.until.AesTools;
import org.bouncycastle.jce.provider.symmetric.AES;
import org.bouncycastle.util.encoders.Hex;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AesApplicationTests {

    @Test
    void contextLoads() {
        AesTools aesTools=new AesTools();
        String str="{'name':'张三','phone':'13895489634','qq':'15462884'}";
        String key="21103cc1e399a8e8";
        byte[] enc = aesTools.encrypt(str, key);
        System.out.println(new String(Hex.encode(enc)));
    }

}
