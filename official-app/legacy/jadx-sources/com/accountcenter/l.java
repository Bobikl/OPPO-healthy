package com.accountcenter;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.platform.sdk.center.deprecated.AcRequestCallBack;
import com.platform.usercenter.tools.device.OpenIDHelper;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
@Deprecated
public final class l extends AsyncTask<String, Void, Object> {
    public final AcRequestCallBack a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f484c;
    public final Map<String, String> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f485e;

    public l(Context context, String str, String str2, AcRequestCallBack acRequestCallBack, Map map) {
        this.a = acRequestCallBack;
        this.b = str2;
        this.f484c = context;
        this.d = map;
        this.f485e = str;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(String[] strArr) {
        byte[] bArrB;
        HttpURLConnection httpURLConnectionA;
        String[] strArr2 = strArr;
        try {
            this.d.putAll(OpenIDHelper.getOpenIdHeader(this.f484c.getApplicationContext()));
            if ("GET".equalsIgnoreCase(this.f485e)) {
                String str = this.b;
                bArrB = (TextUtils.isEmpty(str) || (httpURLConnectionA = k.a("GET", str, this.d)) == null) ? null : k.a(httpURLConnectionA);
            } else {
                bArrB = k.b(this.b, strArr2[0], this.d);
            }
            AcRequestCallBack acRequestCallBack = this.a;
            if (acRequestCallBack != null) {
                return acRequestCallBack.onReqLoading(bArrB);
            }
            return null;
        } catch (IOException e2) {
            Log.e("HTTPTask", "UCHttpTask doInBackground exception: " + e2.getMessage());
            return null;
        } catch (IllegalStateException e3) {
            Log.e("HTTPTask", "UCHttpTask doInBackground exception: " + e3.getMessage());
            return null;
        } catch (Exception e4) {
            Log.e("HTTPTask", "UCHttpTask doInBackground exception: " + e4.getMessage());
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        super.onCancelled();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        super.onPostExecute(obj);
        AcRequestCallBack acRequestCallBack = this.a;
        if (acRequestCallBack != null) {
            acRequestCallBack.onReqFinish(obj);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        super.onPreExecute();
        AcRequestCallBack acRequestCallBack = this.a;
        if (acRequestCallBack != null) {
            acRequestCallBack.onReqStart();
        }
    }
}
