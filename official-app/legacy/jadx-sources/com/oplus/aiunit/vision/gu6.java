package com.oplus.aiunit.vision;

import android.net.ParseException;
import com.heytap.health.base.R$string;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes17.dex */
public class gu6 {
    public static String a(HttpException httpException) {
        String strMessage = httpException.message();
        cuf cufVarE = httpException.response().e();
        if (cufVarE == null) {
            return strMessage;
        }
        try {
            JSONObject jSONObject = new JSONObject(cufVarE.getSource().readUtf8());
            return jSONObject.optInt("errorCode") + ":" + jSONObject.optString("message");
        } catch (IOException | JSONException unused) {
            a7b.b("ExceptionUtil", "convert status code occur exception");
            return strMessage;
        }
    }

    public static String b(Throwable th) {
        String string = b78.a().getString(R$string.lib_base_http_exception_unknown_error);
        if (th instanceof UnknownHostException) {
            return b78.a().getString(R$string.lib_base_http_exception_network_unavailable);
        }
        if (th instanceof SocketTimeoutException) {
            return b78.a().getString(R$string.lib_base_http_exception_network_timeout);
        }
        if (th instanceof HttpException) {
            return a((HttpException) th);
        }
        if ((th instanceof ParseException) || (th instanceof JSONException)) {
            return b78.a().getString(R$string.lib_base_http_exception_data_parse_error);
        }
        a7b.m("ExceptionUtil", "exceptionHandler:" + th);
        z7b.j("ExceptionUtil", "exceptionHandler:" + th.getStackTrace());
        return string;
    }
}
