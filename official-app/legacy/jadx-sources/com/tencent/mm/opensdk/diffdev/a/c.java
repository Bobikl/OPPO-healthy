package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
class c extends AsyncTask<Void, Void, a> {
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OAuthListener f20296c;
    private int d;

    public static class a {
        public OAuthErrCode a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20297c;
    }

    public c(String str, OAuthListener oAuthListener) {
        this.a = str;
        this.f20296c = oAuthListener;
        this.b = String.format("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=%s", str);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00cf A[Catch: Exception -> 0x00d4, TryCatch #0 {Exception -> 0x00d4, blocks: (B:20:0x008b, B:22:0x009b, B:26:0x00b5, B:28:0x00b9, B:29:0x00c6, B:33:0x00d1, B:30:0x00c9, B:31:0x00cc, B:32:0x00cf), top: B:63:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0126  */
    /* JADX WARN: Code duplicated, block: B:68:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0132 A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    public a doInBackground(Void[] voidArr) throws Throwable {
        a aVar;
        OAuthErrCode oAuthErrCode;
        String str;
        OAuthErrCode oAuthErrCode2;
        OAuthErrCode oAuthErrCode3;
        int i;
        String str2;
        String str3;
        OAuthErrCode oAuthErrCode4;
        Thread.currentThread().setName("OpenSdkNoopingTask");
        String str4 = this.a;
        if (str4 != null && str4.length() != 0) {
            Log.i("MicroMsg.SDK.NoopingTask", "doInBackground start " + isCancelled());
            while (true) {
                if (isCancelled()) {
                    Log.i("MicroMsg.SDK.NoopingTask", "IDiffDevOAuth.stopAuth / detach invoked");
                    aVar = new a();
                    oAuthErrCode = OAuthErrCode.WechatAuth_Err_Auth_Stopped;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.b);
                    if (this.d == 0) {
                        str = "";
                    } else {
                        str = "&last=" + this.d;
                    }
                    sb.append(str);
                    String string = sb.toString();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    byte[] bArrA = com.tencent.mm.opensdk.channel.a.a.a(string, 60000);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    aVar = new a();
                    Log.d("MicroMsg.SDK.NoopingResult", "star parse NoopingResult");
                    if (bArrA == null || bArrA.length == 0) {
                        Log.e("MicroMsg.SDK.NoopingResult", "parse fail, buf is null");
                        oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NetworkErr;
                    } else {
                        try {
                            try {
                                JSONObject jSONObject = new JSONObject(new String(bArrA, "utf-8"));
                                int i2 = jSONObject.getInt("wx_errcode");
                                aVar.f20297c = i2;
                                Log.d("MicroMsg.SDK.NoopingResult", String.format("nooping uuidStatusCode = %d", Integer.valueOf(i2)));
                                int i3 = aVar.f20297c;
                                if (i3 == 408) {
                                    oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_OK;
                                    aVar.a = oAuthErrCode4;
                                } else if (i3 != 500) {
                                    switch (i3) {
                                        case 402:
                                            oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_Timeout;
                                            aVar.a = oAuthErrCode4;
                                            break;
                                        case 403:
                                            oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_Cancel;
                                            aVar.a = oAuthErrCode4;
                                            break;
                                        case 404:
                                            oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_OK;
                                            aVar.a = oAuthErrCode4;
                                            break;
                                        case 405:
                                            aVar.a = OAuthErrCode.WechatAuth_Err_OK;
                                            aVar.b = jSONObject.getString("wx_code");
                                            break;
                                        default:
                                            oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_NormalErr;
                                            aVar.a = oAuthErrCode4;
                                            break;
                                    }
                                } else {
                                    oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_NormalErr;
                                    aVar.a = oAuthErrCode4;
                                }
                            } catch (Exception e2) {
                                str3 = String.format("parse json fail, ex = %s", e2.getMessage());
                                Log.e("MicroMsg.SDK.NoopingResult", str3);
                                oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NormalErr;
                                aVar.a = oAuthErrCode2;
                            }
                        } catch (Exception e3) {
                            str3 = String.format("parse fail, build String fail, ex = %s", e3.getMessage());
                        }
                        Log.d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", string, aVar.a.toString(), Integer.valueOf(aVar.f20297c), Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis)));
                        oAuthErrCode3 = aVar.a;
                        if (oAuthErrCode3 == OAuthErrCode.WechatAuth_Err_OK) {
                            i = aVar.f20297c;
                            this.d = i;
                            if (i == d.UUID_SCANED.a()) {
                                this.f20296c.onQrcodeScanned();
                            } else if (aVar.f20297c == d.UUID_KEEP_CONNECT.a() && aVar.f20297c == d.UUID_CONFIRM.a()) {
                                str2 = aVar.b;
                                if (str2 != null || str2.length() == 0) {
                                    Log.e("MicroMsg.SDK.NoopingTask", "nooping fail, confirm with an empty code!!!");
                                }
                            }
                        } else {
                            Log.e("MicroMsg.SDK.NoopingTask", String.format("nooping fail, errCode = %s, uuidStatusCode = %d", oAuthErrCode3.toString(), Integer.valueOf(aVar.f20297c)));
                        }
                    }
                    aVar.a = oAuthErrCode2;
                    Log.d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", string, aVar.a.toString(), Integer.valueOf(aVar.f20297c), Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis)));
                    oAuthErrCode3 = aVar.a;
                    if (oAuthErrCode3 == OAuthErrCode.WechatAuth_Err_OK) {
                        i = aVar.f20297c;
                        this.d = i;
                        if (i == d.UUID_SCANED.a()) {
                            this.f20296c.onQrcodeScanned();
                        } else if (aVar.f20297c == d.UUID_KEEP_CONNECT.a()) {
                            continue;
                        } else {
                            str2 = aVar.b;
                            if (str2 != null) {
                            }
                            Log.e("MicroMsg.SDK.NoopingTask", "nooping fail, confirm with an empty code!!!");
                        }
                    } else {
                        Log.e("MicroMsg.SDK.NoopingTask", String.format("nooping fail, errCode = %s, uuidStatusCode = %d", oAuthErrCode3.toString(), Integer.valueOf(aVar.f20297c)));
                    }
                }
                return aVar;
            }
            aVar.a = oAuthErrCode;
            return aVar;
        }
        Log.e("MicroMsg.SDK.NoopingTask", "run fail, uuid is null");
        aVar = new a();
        oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
        aVar.a = oAuthErrCode;
        return aVar;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(a aVar) {
        a aVar2 = aVar;
        this.f20296c.onAuthFinish(aVar2.a, aVar2.b);
    }
}
