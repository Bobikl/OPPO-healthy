package com.example.opponotificationrelay;
import android.util.Base64;
import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/** Network validation uses this app's own UID without Root or official runtime. */
final class HealthAccountClient {
    static final class Failure extends IOException {final int code;Failure(int code){super("ACCOUNT_SERVER_"+code);this.code=code;}}
    static JSONObject login(JSONObject session)throws Exception {
        HealthAccountStore.validate(session);
        String payload=new JSONObject().put("token",session.getString("token")).put("appPackage",session.getString("wirePackage")).toString();
        TreeMap<String,String> headers=new TreeMap<>();
        headers.put("appid",session.getString("appId"));headers.put("app-package",session.getString("wirePackage"));
        headers.put("nonce",UUID.randomUUID().toString().replace("-",""));headers.put("timestamp",Long.toString(System.currentTimeMillis()));
        headers.put("token",session.getString("token"));headers.put("token-auth-id",session.getString("deviceId"));
        headers.put("app-version",session.getString("appVersion"));headers.put("os-type","1");headers.put("lang","zh-CN");headers.put("risk-sign","2");
        StringBuilder canonical=new StringBuilder();
        for(Map.Entry<String,String> entry:headers.entrySet()){
            if(canonical.length()>0)canonical.append('&');canonical.append(entry.getKey()).append('=').append(entry.getValue());
        }
        canonical.append(payload.replaceAll("\\s*",""));
        Mac mac=Mac.getInstance("HmacSHA256");mac.init(new SecretKeySpec(session.getString("httpSecret").getBytes(StandardCharsets.UTF_8),"HmacSHA256"));
        headers.put("signature",Base64.encodeToString(mac.doFinal(canonical.toString().getBytes(StandardCharsets.UTF_8)),Base64.NO_WRAP));
        headers.put("versionName",session.getString("versionName"));
        HttpsURLConnection connection=(HttpsURLConnection)new URL("https://sport.health.heytapmobi.com/sporthealth/v1/c2s/account/login").openConnection();
        connection.setInstanceFollowRedirects(false);connection.setConnectTimeout(15000);connection.setReadTimeout(15000);
        connection.setRequestMethod("POST");connection.setDoOutput(true);connection.setRequestProperty("Content-Type","application/json; charset=utf-8");
        for(Map.Entry<String,String> entry:headers.entrySet())connection.setRequestProperty(entry.getKey(),entry.getValue());
        byte[] request=payload.getBytes(StandardCharsets.UTF_8);connection.setFixedLengthStreamingMode(request.length);
        try{
            try(OutputStream out=connection.getOutputStream()){out.write(request);}
            int http=connection.getResponseCode();if(http!=200)throw new IOException("ACCOUNT_HTTP_"+http);
            ByteArrayOutputStream response=new ByteArrayOutputStream();
            try(InputStream in=connection.getInputStream()){byte[] buffer=new byte[4096];int n;
                while((n=in.read(buffer))!=-1){if(response.size()+n>65536)throw new IOException("ACCOUNT_RESPONSE_LIMIT");response.write(buffer,0,n);}}
            JSONObject result=new JSONObject(new String(response.toByteArray(),StandardCharsets.UTF_8));
            int code=result.getInt("errorCode");if(code!=0)throw new Failure(code);
            if(!session.getString("account").equals(result.getJSONObject("body").getString("ssoid")))throw new IOException("ACCOUNT_ID_MISMATCH");
            return new JSONObject(session.toString()).put("verifiedAt",System.currentTimeMillis()).put("verification","server");
        }finally{Arrays.fill(request,(byte)0);connection.disconnect();}
    }
    static String message(Throwable e){
        if(e instanceof Failure){int code=((Failure)e).code;
            if(code==10101)return "登录凭据已失效，请重新登录。";
            if(code==10102||code==22300)return "手机时间与服务器不一致，请校准时间后重试。";
            return "服务器未接受登录（"+code+"）。";
        }
        if(e instanceof java.net.UnknownHostException)return "暂时无法连接账号服务器，请检查网络后重试。";
        if(e instanceof java.net.SocketTimeoutException||e instanceof java.util.concurrent.TimeoutException)return "登录验证超时，请稍后重试。";
        if(e instanceof android.content.pm.PackageManager.NameNotFoundException)return "未安装可供导入的官方健康应用。";
        if("ACCOUNT_OPERATION_CANCELLED".equals(e.getMessage()))return "登录操作已取消。";
        if("ACCOUNT_HISTORY_MISMATCH".equals(e.getMessage()))return "登录账号与本机健康资料不一致，未替换原账号。";
        String code=e.getMessage();if(code==null||!code.matches("[A-Z_0-9]{1,64}"))code="ACCOUNT_FAILED";
        return "未完成登录（"+code+"）。";
    }
}
