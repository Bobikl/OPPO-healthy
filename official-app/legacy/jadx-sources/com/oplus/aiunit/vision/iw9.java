package com.oplus.aiunit.vision;

import com.tencent.open.utils.HttpUtils;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public interface iw9 {
    void a(IOException iOException);

    void b(SocketTimeoutException socketTimeoutException);

    void c(Exception exc);

    void d(JSONException jSONException);

    void e(JSONObject jSONObject);

    void f(MalformedURLException malformedURLException);

    void g(HttpUtils.HttpStatusException httpStatusException);

    void h(ConnectTimeoutException connectTimeoutException);

    void i(HttpUtils.NetworkUnavailableException networkUnavailableException);
}
