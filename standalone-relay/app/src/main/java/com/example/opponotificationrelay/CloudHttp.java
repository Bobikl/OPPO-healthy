package com.example.opponotificationrelay;
import android.util.Base64;
import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.BooleanSupplier;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HttpsURLConnection;
import org.json.*;

/** Signed requests run under our own UID; credentials never enter logs. */
final class CloudHttp implements AutoCloseable {
    static final class Failure extends IOException { final int code; Failure(int code){super("CLOUD_SERVER_"+code);this.code=code;} }
    private final JSONObject session; private final BooleanSupplier allowed;
    private volatile HttpsURLConnection active;
    String keyVersion="1732499446015";
    CloudHttp(JSONObject session,BooleanSupplier allowed)throws Exception {this.session=HealthAccountStore.validate(session);this.allowed=allowed;}
    void check()throws IOException {if(Thread.currentThread().isInterrupted()||!allowed.getAsBoolean())throw new IOException("CLOUD_CANCELLED");}
    JSONObject post(String path,Object body)throws Exception {
        check();
        if(!path.matches("v[1-5]/c2s/[A-Za-z0-9/_]+"))throw new IOException("CLOUD_PATH");
        String payload=body.toString();
        byte[] request=payload.getBytes(StandardCharsets.UTF_8);if(request.length>8*1024*1024)throw new IOException("CLOUD_REQUEST_LIMIT");
        TreeMap<String,String> headers=new TreeMap<>();
        headers.put("appid",session.getString("appId"));headers.put("app-package",session.getString("wirePackage"));
        headers.put("nonce",UUID.randomUUID().toString().replace("-",""));headers.put("timestamp",Long.toString(System.currentTimeMillis()));
        headers.put("token",session.getString("token"));headers.put("token-auth-id",session.getString("deviceId"));
        headers.put("app-version",session.getString("appVersion"));headers.put("os-type","1");headers.put("lang","zh-CN");headers.put("risk-sign","2");
        StringBuilder canonical=new StringBuilder();
        for(Map.Entry<String,String> entry:headers.entrySet()){if(canonical.length()>0)canonical.append('&');canonical.append(entry.getKey()).append('=').append(entry.getValue());}
        canonical.append(payload.replaceAll("\\s*",""));
        Mac mac=Mac.getInstance("HmacSHA256");mac.init(new SecretKeySpec(session.getString("httpSecret").getBytes(StandardCharsets.UTF_8),"HmacSHA256"));
        headers.put("signature",Base64.encodeToString(mac.doFinal(canonical.toString().getBytes(StandardCharsets.UTF_8)),Base64.NO_WRAP));
        headers.put("versionName",session.getString("versionName"));headers.put("app-key-version",keyVersion);
        HttpsURLConnection connection=(HttpsURLConnection)new URL((path.startsWith("v1/c2s/ai_health/")?"https://aihealth-api-cn.heytapmobi.com/sporthealth/":"https://sport.health.heytapmobi.com/sporthealth/")+path).openConnection();
        active=connection;connection.setInstanceFollowRedirects(false);connection.setConnectTimeout(20000);connection.setReadTimeout(30000);
        connection.setRequestMethod("POST");connection.setDoOutput(true);connection.setRequestProperty("Content-Type","application/json; charset=utf-8");
        for(Map.Entry<String,String> entry:headers.entrySet())connection.setRequestProperty(entry.getKey(),entry.getValue());
        connection.setFixedLengthStreamingMode(request.length);
        try {
            check();try(OutputStream out=connection.getOutputStream()){out.write(request);}
            check();int status=connection.getResponseCode();if(status!=200)throw new IOException("CLOUD_HTTP_"+status);
            ByteArrayOutputStream response=new ByteArrayOutputStream();
            try(InputStream in=connection.getInputStream()){byte[] buffer=new byte[16384];int n;
                while((n=in.read(buffer))!=-1){check();if(response.size()+n>32*1024*1024)throw new IOException("CLOUD_RESPONSE_LIMIT");response.write(buffer,0,n);}}
            JSONObject result=new JSONObject(new String(response.toByteArray(),StandardCharsets.UTF_8));
            int code=result.getInt("errorCode");if(code!=0)throw new Failure(code);check();return result;
        }finally{Arrays.fill(request,(byte)0);active=null;connection.disconnect();}
    }
    public void close(){HttpsURLConnection connection=active;if(connection!=null)connection.disconnect();}
}
