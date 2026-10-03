package com.autonavi.aps.amapapi.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.oplus.aiunit.vision.n6n;
import com.oplus.aiunit.vision.q0n;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class h {
    private static h f;
    private static long i;
    private File d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f1175e;
    private Context g;
    private boolean h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedHashMap<String, Long> f1174c = new LinkedHashMap<>();
    String a = "";
    String b = null;

    private h(Context context) {
        this.f1175e = null;
        Context applicationContext = context.getApplicationContext();
        this.g = applicationContext;
        String path = applicationContext.getFilesDir().getPath();
        if (this.f1175e == null) {
            this.f1175e = k.l(this.g);
        }
        try {
            this.d = new File(path, "reportRecorder");
        } catch (Throwable th) {
            n6n.a(th);
        }
        c();
    }

    public static synchronized h a(Context context) {
        if (f == null) {
            f = new h(context);
        }
        return f;
    }

    private synchronized void c() {
        LinkedHashMap<String, Long> linkedHashMap = this.f1174c;
        if (linkedHashMap == null || linkedHashMap.size() <= 0) {
            try {
                this.a = new SimpleDateFormat("yyyyMMdd").format(new Date(System.currentTimeMillis()));
                Iterator<String> it = k.a(this.d).iterator();
                while (it.hasNext()) {
                    try {
                        try {
                            String[] strArrSplit = new String(com.autonavi.aps.amapapi.security.a.b(q0n.g(it.next()), this.f1175e), "UTF-8").split(",");
                            if (strArrSplit != null && strArrSplit.length > 1) {
                                this.f1174c.put(strArrSplit[0], Long.valueOf(Long.parseLong(strArrSplit[1])));
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    } catch (UnsupportedEncodingException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    private void d() {
        try {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, Long> entry : this.f1174c.entrySet()) {
                try {
                    sb.append(q0n.f(com.autonavi.aps.amapapi.security.a.a((entry.getKey() + "," + entry.getValue()).getBytes("UTF-8"), this.f1175e)) + Weather.SEPARATOR);
                } catch (UnsupportedEncodingException e2) {
                    e2.printStackTrace();
                }
            }
            String string = sb.toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            k.a(this.d, string);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final synchronized void b() {
        try {
            if (b(this.g)) {
                for (Map.Entry<String, Long> entry : this.f1174c.entrySet()) {
                    try {
                        if (!this.a.equals(entry.getKey())) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("param_long_first", entry.getKey());
                            jSONObject.put("param_long_second", entry.getValue());
                            i.a(this.g, "O023", jSONObject);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public final synchronized void a() {
        if (this.h) {
            d();
            this.h = false;
        }
    }

    public final synchronized void a(AMapLocation aMapLocation) {
        try {
            if ((!this.f1174c.containsKey(this.a) && this.f1174c.size() >= 8) || (this.f1174c.containsKey(this.a) && this.f1174c.size() >= 9)) {
                ArrayList arrayList = new ArrayList();
                Iterator<Map.Entry<String, Long>> it = this.f1174c.entrySet().iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(it.next().getKey());
                        if (arrayList.size() == this.f1174c.size() - 7) {
                            break;
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    this.f1174c.remove((String) it2.next());
                }
            }
            if (aMapLocation.getErrorCode() != 0) {
                return;
            }
            if (aMapLocation.getLocationType() != 6 && aMapLocation.getLocationType() != 5) {
                if (this.f1174c.containsKey(this.a)) {
                    long jLongValue = this.f1174c.get(this.a).longValue() + 1;
                    i = jLongValue;
                    this.f1174c.put(this.a, Long.valueOf(jLongValue));
                } else {
                    this.f1174c.put(this.a, 1L);
                    i = 1L;
                }
                long j2 = i;
                if (j2 != 0 && j2 % 100 == 0) {
                    a();
                }
                this.h = true;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private boolean b(Context context) {
        if (this.b == null) {
            this.b = j.a(context, "pref", "lastavedate", "0");
        }
        if (this.b.equals(this.a)) {
            return false;
        }
        SharedPreferences.Editor editorA = j.a(context, "pref");
        j.a(editorA, "lastavedate", this.a);
        j.a(editorA);
        this.b = this.a;
        return true;
    }
}
