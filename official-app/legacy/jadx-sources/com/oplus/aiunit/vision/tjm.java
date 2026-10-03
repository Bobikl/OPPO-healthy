package com.oplus.aiunit.vision;

import android.content.Context;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.webview.extension.protocol.Const;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
@u2n(a = "update_item", b = true)
public class tjm extends wjm {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f17048n = "";
    public Context o;

    public tjm() {
    }

    public static String l(JSONObject jSONObject, String str) throws JSONException {
        return (jSONObject == null || !jSONObject.has(str) || "[]".equals(jSONObject.getString(str))) ? "" : jSONObject.optString(str).trim();
    }

    public final String k() {
        return this.f17048n;
    }

    public final void m(String str) {
        this.f17048n = str;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.io.OutputStreamWriter] */
    public final void n() {
        Throwable th;
        OutputStreamWriter outputStreamWriter;
        IOException e2;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("title", this.a);
            jSONObject2.put("code", this.f18303c);
            jSONObject2.put("url", this.b);
            jSONObject2.put(LogSenderConst.FILENAME, this.d);
            jSONObject2.put("lLocalLength", this.f);
            jSONObject2.put("lRemoteLength", this.g);
            jSONObject2.put("mState", this.f18306l);
            jSONObject2.put("version", this.f18304e);
            jSONObject2.put("localPath", this.h);
            String str = this.f17048n;
            if (str != null) {
                jSONObject2.put("vMapFileNames", str);
            }
            jSONObject2.put("isSheng", this.i);
            jSONObject2.put("mCompleteCode", this.f18305j);
            jSONObject2.put("mCityCode", this.k);
            jSONObject2.put("pinyin", this.m);
            jSONObject.put(Const.Scheme.SCHEME_FILE, jSONObject2);
            ?? sb = new StringBuilder();
            sb.append(this.d);
            sb.append(".dt");
            File file = new File(sb.toString());
            file.delete();
            try {
                try {
                    outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file, true), "utf-8");
                    try {
                        outputStreamWriter.write(jSONObject.toString());
                        try {
                            outputStreamWriter.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    } catch (IOException e4) {
                        e2 = e4;
                        c2n.r(e2, "UpdateItem", "saveJSONObjectToFile");
                        e2.printStackTrace();
                        if (outputStreamWriter != null) {
                            try {
                                outputStreamWriter.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (sb != 0) {
                        try {
                            sb.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e7) {
                outputStreamWriter = null;
                e2 = e7;
            } catch (Throwable th3) {
                sb = 0;
                th = th3;
                if (sb != 0) {
                    sb.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            c2n.r(th4, "UpdateItem", "saveJSONObjectToFile parseJson");
            th4.printStackTrace();
        }
    }

    public final void o(String str) {
        JSONObject jSONObject;
        if (str != null) {
            try {
                if ("".equals(str) || (jSONObject = new JSONObject(str).getJSONObject(Const.Scheme.SCHEME_FILE)) == null) {
                    return;
                }
                this.a = jSONObject.optString("title");
                this.f18303c = jSONObject.optString("code");
                this.b = jSONObject.optString("url");
                this.d = jSONObject.optString(LogSenderConst.FILENAME);
                this.f = jSONObject.optLong("lLocalLength");
                this.g = jSONObject.optLong("lRemoteLength");
                this.f18306l = jSONObject.optInt("mState");
                this.f18304e = jSONObject.optString("version");
                this.h = jSONObject.optString("localPath");
                this.f17048n = jSONObject.optString("vMapFileNames");
                this.i = jSONObject.optInt("isSheng");
                this.f18305j = jSONObject.optInt("mCompleteCode");
                this.k = jSONObject.optString("mCityCode");
                String strL = l(jSONObject, "pinyin");
                this.m = strL;
                if ("".equals(strL)) {
                    String str2 = this.b;
                    String strSubstring = str2.substring(str2.lastIndexOf("/") + 1);
                    this.m = strSubstring.substring(0, strSubstring.lastIndexOf("."));
                }
            } catch (Throwable th) {
                c2n.r(th, "UpdateItem", "readFileToJSONObject");
                th.printStackTrace();
            }
        }
    }

    public final void p() {
        this.d = xsm.h0(this.o) + this.m + ".zip.tmp";
    }

    public tjm(OfflineMapCity offlineMapCity, Context context) {
        this.o = context;
        this.a = offlineMapCity.getCity();
        this.f18303c = offlineMapCity.getAdcode();
        this.b = offlineMapCity.getUrl();
        this.g = offlineMapCity.getSize();
        this.f18304e = offlineMapCity.getVersion();
        this.k = offlineMapCity.getCode();
        this.i = 0;
        this.f18306l = offlineMapCity.getState();
        this.f18305j = offlineMapCity.getcompleteCode();
        this.m = offlineMapCity.getPinyin();
        p();
    }

    public tjm(OfflineMapProvince offlineMapProvince, Context context) {
        this.o = context;
        this.a = offlineMapProvince.getProvinceName();
        this.f18303c = offlineMapProvince.getProvinceCode();
        this.b = offlineMapProvince.getUrl();
        this.g = offlineMapProvince.getSize();
        this.f18304e = offlineMapProvince.getVersion();
        this.i = 1;
        this.f18306l = offlineMapProvince.getState();
        this.f18305j = offlineMapProvince.getcompleteCode();
        this.m = offlineMapProvince.getPinyin();
        p();
    }
}
