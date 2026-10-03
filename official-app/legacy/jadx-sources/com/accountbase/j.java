package com.accountbase;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.heytap.usercenter.accountsdk.http.UCBaseResult;
import com.heytap.usercenter.accountsdk.http.UCRequestCallBack;
import com.platform.usercenter.tools.device.OpenIDHelper;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
@Deprecated
public class j extends AsyncTask<String, Void, UCBaseResult> {
    private final UCRequestCallBack a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f470c;
    private Map<String, String> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f471e;

    public j(Context context, String str, UCRequestCallBack uCRequestCallBack, String str2, Map<String, String> map) {
        this.a = uCRequestCallBack;
        this.b = str2;
        this.f470c = context;
        this.d = map;
        this.f471e = str;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(UCBaseResult uCBaseResult) {
        super.onPostExecute(uCBaseResult);
        UCRequestCallBack uCRequestCallBack = this.a;
        if (uCRequestCallBack != null) {
            uCRequestCallBack.onReqFinish(uCBaseResult);
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        super.onCancelled();
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
        UCRequestCallBack uCRequestCallBack = this.a;
        if (uCRequestCallBack != null) {
            uCRequestCallBack.onReqStart();
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public UCBaseResult doInBackground(String... strArr) {
        byte[] bArrB;
        try {
            this.d.putAll(OpenIDHelper.getOpenIdHeader(this.f470c.getApplicationContext()));
            if ("GET".equalsIgnoreCase(this.f471e)) {
                bArrB = i.a(this.b, this.d);
            } else {
                bArrB = i.b(this.b, strArr[0], this.d);
            }
            UCRequestCallBack uCRequestCallBack = this.a;
            if (uCRequestCallBack != null) {
                return (UCBaseResult) uCRequestCallBack.onReqLoading(bArrB);
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
}
