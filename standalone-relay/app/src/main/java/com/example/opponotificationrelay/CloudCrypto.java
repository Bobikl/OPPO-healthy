package com.example.opponotificationrelay;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.X509EncodedKeySpec;
import java.util.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import android.util.Base64;
import org.json.JSONObject;
final class CloudCrypto {
    private final String symmetric;
    private CloudCrypto(String symmetric)throws IOException {if(symmetric==null||!(symmetric.length()==16||symmetric.length()==24||symmetric.length()==32))throw new IOException("CLOUD_KEY_FORMAT");this.symmetric=symmetric;}
    static CloudCrypto exchange(CloudHttp http,JSONObject publicConfig,String mobileId)throws Exception {
        String temporary=UUID.randomUUID().toString().replace("-","");
        JSONObject request=new JSONObject().put("encryptionAlgorithm",4).put("symmetricKey",temporary).put("firstExchangeKey",1).put("mobileUniqueId",mobileId);
        PublicKey key=KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(publicConfig.getString("publicKey"),Base64.DEFAULT)));
        Cipher rsa=Cipher.getInstance("RSA/ECB/PKCS1Padding");rsa.init(Cipher.ENCRYPT_MODE,key);
        String cipher=Base64.encodeToString(rsa.doFinal(request.toString().getBytes(StandardCharsets.UTF_8)),Base64.NO_WRAP);
        http.keyVersion=publicConfig.getString("version");
        JSONObject envelope=http.post("v1/c2s/encrypt/exchangeSymmetricKey",cipher);
        String body=envelope.getString("body");byte[] bytes=Base64.decode(body,Base64.DEFAULT);
        if(bytes.length<33)throw new IOException("CLOUD_KEY_RESPONSE");
        Cipher aes=Cipher.getInstance("AES/GCM/NoPadding");
        aes.init(Cipher.DECRYPT_MODE,new SecretKeySpec(temporary.getBytes(StandardCharsets.UTF_8),"AES"),new GCMParameterSpec(128,Arrays.copyOf(bytes,16)));
        byte[] plain=aes.doFinal(bytes,16,bytes.length-16);
        try{return new CloudCrypto(new JSONObject(new String(plain,StandardCharsets.UTF_8)).getString("symmetricKey"));}
        finally{Arrays.fill(plain,(byte)0);}
    }
    String body(String value,boolean encrypt)throws Exception {
        byte[] iv=new byte[16],data;
        if(encrypt){new SecureRandom().nextBytes(iv);data=value.getBytes(StandardCharsets.UTF_8);}
        else {byte[] bytes=Base64.decode(value,Base64.DEFAULT);if(bytes.length<32)throw new IOException("CLOUD_BODY_FORMAT");System.arraycopy(bytes,0,iv,0,16);data=Arrays.copyOfRange(bytes,16,bytes.length);}
        Cipher aes=Cipher.getInstance("AES/GCM/NoPadding");
        aes.init(encrypt?Cipher.ENCRYPT_MODE:Cipher.DECRYPT_MODE,new SecretKeySpec(symmetric.getBytes(StandardCharsets.UTF_8),"AES"),new GCMParameterSpec(128,iv));
        byte[] result=aes.doFinal(data);
        if(!encrypt)return StandardCharsets.UTF_8.newDecoder().onMalformedInput(java.nio.charset.CodingErrorAction.REPORT).decode(java.nio.ByteBuffer.wrap(result)).toString();
        byte[] combined=new byte[16+result.length];System.arraycopy(iv,0,combined,0,16);System.arraycopy(result,0,combined,16,result.length);
        return Base64.encodeToString(combined,Base64.NO_WRAP);
    }
    String client(String value,boolean encrypt)throws Exception {
        if(value==null||value.isEmpty())return "";
        if(encrypt&&value.length()>32||!encrypt&&value.length()<=32)return value;
        Cipher aes=Cipher.getInstance("AES/CTR/NoPadding");
        byte[] iv=new byte[16],data;
        if(encrypt){new SecureRandom().nextBytes(iv);data=value.getBytes(StandardCharsets.UTF_8);}
        else {byte[] bytes=Base64.decode(value,Base64.DEFAULT);if(bytes.length<=16)throw new IOException("CLOUD_CLIENT_FORMAT");System.arraycopy(bytes,0,iv,0,16);data=Arrays.copyOfRange(bytes,16,bytes.length);}
        aes.init(encrypt?Cipher.ENCRYPT_MODE:Cipher.DECRYPT_MODE,new SecretKeySpec(symmetric.getBytes(StandardCharsets.UTF_8),"AES"),new IvParameterSpec(iv));
        byte[] result=aes.doFinal(data);
        if(!encrypt){
            String plain=StandardCharsets.UTF_8.newDecoder().onMalformedInput(java.nio.charset.CodingErrorAction.REPORT)
                .onUnmappableCharacter(java.nio.charset.CodingErrorAction.REPORT).decode(java.nio.ByteBuffer.wrap(result)).toString();
            if(plain.isEmpty()||plain.length()>256)throw new IOException("CLOUD_CLIENT_LENGTH");
            for(int i=0;i<plain.length();i++)if(Character.isISOControl(plain.charAt(i))||plain.charAt(i)=='\uFFFD')throw new IOException("CLOUD_CLIENT_FORMAT");
            return plain;
        }
        byte[] combined=new byte[16+result.length];System.arraycopy(iv,0,combined,0,16);System.arraycopy(result,0,combined,16,result.length);
        return Base64.encodeToString(combined,Base64.NO_WRAP);
    }
}
