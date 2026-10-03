package com.lifesense.weidong.lzsimplenetlibs.net.invoker;

import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes5.dex */
public class HttpInvoker extends BaseApiInvoker {
    public final String TAG = HttpInvoker.class.getSimpleName();

    @Override // com.lifesense.weidong.lzsimplenetlibs.net.invoker.BaseApiInvoker
    public URLConnection getURLConnection(String str, String str2) throws ProtocolException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        return httpURLConnection;
    }
}
