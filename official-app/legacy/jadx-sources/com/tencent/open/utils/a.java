package com.tencent.open.utils;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.oplus.aiunit.vision.q8g;
import com.oplus.aiunit.vision.s04;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a {
    public static Map<String, a> g = Collections.synchronizedMap(new HashMap());
    public static String h = null;
    public Context a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONObject f20315c = null;
    public long d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20316e = 0;
    public boolean f = true;

    /* JADX INFO: renamed from: com.tencent.open.utils.a$a, reason: collision with other inner class name */
    public class C1014a extends Thread {
        public final /* synthetic */ Bundle i;

        public C1014a(Bundle bundle) {
            this.i = bundle;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                a.this.h(b.C(HttpUtils.j(a.this.a, "https://cgi.connect.qq.com/qqconnectopen/openapi/policy_conf", "GET", this.i).a));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            a.this.f20316e = 0;
        }
    }

    public a(Context context, String str) {
        this.a = null;
        this.b = null;
        this.a = context.getApplicationContext();
        this.b = str;
        e();
        i();
    }

    public static a d(Context context, String str) {
        a aVar;
        synchronized (g) {
            q8g.j("openSDK_LOG.OpenConfig", "getInstance begin");
            if (str != null) {
                h = str;
            }
            if (str == null && (str = h) == null) {
                str = "0";
            }
            aVar = g.get(str);
            if (aVar == null) {
                aVar = new a(context, str);
                g.put(str, aVar);
            }
            q8g.j("openSDK_LOG.OpenConfig", "getInstance end");
        }
        return aVar;
    }

    public int b(String str) {
        m("get " + str);
        l();
        return this.f20315c.optInt(str);
    }

    public final void e() {
        try {
            this.f20315c = new JSONObject(k("com.tencent.open.config.json"));
        } catch (JSONException unused) {
            this.f20315c = new JSONObject();
        }
    }

    public final void g(String str, String str2) {
        try {
            if (this.b != null) {
                str = str + "." + this.b;
            }
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.a.openFileOutput(str, 0), Charset.forName("UTF-8"));
            outputStreamWriter.write(str2);
            outputStreamWriter.flush();
            outputStreamWriter.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public final void h(JSONObject jSONObject) {
        m("cgi back, do update");
        this.f20315c = jSONObject;
        g("com.tencent.open.config.json", jSONObject.toString());
        this.d = SystemClock.elapsedRealtime();
    }

    public final void i() {
        if (this.f20316e != 0) {
            m("update thread is running, return");
            return;
        }
        this.f20316e = 1;
        Bundle bundle = new Bundle();
        bundle.putString("appid", this.b);
        bundle.putString("appid_for_getting_config", this.b);
        bundle.putString("status_os", Build.VERSION.RELEASE);
        bundle.putString("status_machine", Build.MODEL);
        bundle.putString("status_version", Build.VERSION.SDK);
        bundle.putString("sdkv", s04.SDK_VERSION);
        bundle.putString("sdkp", "a");
        new C1014a(bundle).start();
    }

    public boolean j(String str) {
        m("get " + str);
        l();
        Object objOpt = this.f20315c.opt(str);
        if (objOpt == null) {
            return false;
        }
        if (objOpt instanceof Integer) {
            return !objOpt.equals(0);
        }
        if (objOpt instanceof Boolean) {
            return ((Boolean) objOpt).booleanValue();
        }
        return false;
    }

    public final String k(String str) {
        InputStream inputStreamOpen;
        BufferedReader bufferedReader;
        StringBuffer stringBuffer;
        String str2;
        String string = "";
        try {
            try {
                if (this.b != null) {
                    str2 = str + "." + this.b;
                } else {
                    str2 = str;
                }
                inputStreamOpen = this.a.openFileInput(str2);
                while (true) {
                    try {
                        try {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                stringBuffer.append(line);
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        } catch (IOException e3) {
                            e3.printStackTrace();
                            inputStreamOpen.close();
                            bufferedReader.close();
                        }
                    } catch (Throwable th) {
                        try {
                            inputStreamOpen.close();
                            bufferedReader.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                        throw th;
                    }
                }
            } catch (IOException e5) {
                e5.printStackTrace();
                return "";
            }
        } catch (FileNotFoundException unused) {
            inputStreamOpen = this.a.getAssets().open(str);
        }
        bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charset.forName("UTF-8")));
        stringBuffer = new StringBuffer();
        string = stringBuffer.toString();
        inputStreamOpen.close();
        bufferedReader.close();
        return string;
    }

    public final void l() {
        int iOptInt = this.f20315c.optInt("Common_frequency");
        if (iOptInt == 0) {
            iOptInt = 1;
        }
        if (SystemClock.elapsedRealtime() - this.d >= iOptInt * 3600000) {
            i();
        }
    }

    public final void m(String str) {
        if (this.f) {
            q8g.j("openSDK_LOG.OpenConfig", str + "; appid: " + this.b);
        }
    }
}
