package com.heytap.health.base.track;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.heytap.health.safety.safetycheck.SafetyCheckManager;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.gpj;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.qmm;
import com.oplus.aiunit.vision.rze;
import com.oplus.aiunit.vision.uw8;
import com.oplus.aiunit.vision.wfa;
import com.oplus.utrace.lib.ConstValuesKt;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public class a {
    public static String channelValue = "office";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f4300e;
    public static String f;
    public static String g;
    public static final String a = rze.i();
    public static int d = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f4299c = -1;
    public static final String TRACK_PROXY_PATH = "/track/track_proxy_path";

    @Nullable
    public static final InterfaceC0296a b = (InterfaceC0296a) e1.d().b(TRACK_PROXY_PATH).navigation();

    /* JADX INFO: renamed from: com.heytap.health.base.track.a$a, reason: collision with other inner class name */
    public interface InterfaceC0296a {
        void setCustomClientId(String str);

        void track(String str, String str2, Map<String, ? extends Object> map);
    }

    public static class b {
        public HashMap<String, Object> a = new HashMap<>();
        public Object b;

        public b(Object obj) {
            this.b = obj;
        }

        public b a(String str, Object obj) {
            this.a.put(str, obj);
            return this;
        }

        public void b() {
            a.G(this.b, this.a);
        }

        public void c(String str, Object obj) {
            this.a.put(str, obj);
            b();
        }
    }

    static {
        new uw8(new Runnable() { // from class: com.oplus.aiunit.vision.aoc
            @Override // java.lang.Runnable
            public final void run() {
                com.heytap.health.base.track.a.f();
            }
        }).start();
    }

    public static b A() {
        return new b(2015);
    }

    public static void B(int i, int i2) {
        new b(3000).a("function_id", Integer.valueOf(i)).c("status", Integer.valueOf(i2));
    }

    public static b C() {
        return new b(2033);
    }

    public static b D() {
        return new b(2025);
    }

    public static void E() {
        String strH = gpj.h();
        StringBuilder sb = new StringBuilder();
        sb.append("reportProcessStart otaVersion = ");
        sb.append(strH);
        new b(1005).a("process", rze.i()).a(ConstValuesKt.OTA_VERSION, strH).a("version_code", Integer.valueOf(if0.m())).b();
    }

    public static synchronized void F(String str, String str2, Map<String, Object> map) {
        NxTrackHelper.r(map);
        InterfaceC0296a interfaceC0296a = b;
        if (interfaceC0296a == null) {
            m8b.b("NearxTrackUtil", "Track api proxy is null");
        } else {
            interfaceC0296a.track(str, str2, map);
        }
    }

    public static void G(Object obj, Map<String, Object> map) {
        H("20187", Objects.toString(obj), map);
    }

    public static void H(String str, String str2, Map<String, Object> map) {
        NxTrackHelper.s(map);
        F(str, str2, map);
    }

    public static void I(String str) {
        InterfaceC0296a interfaceC0296a = b;
        if (interfaceC0296a != null) {
            interfaceC0296a.setCustomClientId(str);
        }
    }

    public static void J(int i, String str, String str2, String str3) {
        m8b.f("NearxTrackUtil", "setStartUpOrigin: visitFrom = " + i + ",vfm = " + str + ",vfc = " + str2);
        f4299c = i;
        f4300e = str;
        f = str2;
        g = str3;
    }

    public static void b(b bVar) {
        int i = f4299c;
        if (i != d) {
            bVar.a("visitFrom", Integer.valueOf(i));
        }
        if (!TextUtils.isEmpty(f4300e)) {
            bVar.a("vfm", f4300e);
        }
        if (!TextUtils.isEmpty(f)) {
            bVar.a("vfc", f);
        }
        if (TextUtils.isEmpty(g)) {
            return;
        }
        bVar.a("vfs", g);
    }

    public static void c(Map<String, Object> map) {
        int i = f4299c;
        if (i != d) {
            map.put("visitFrom", Integer.valueOf(i));
        }
        if (!TextUtils.isEmpty(f4300e)) {
            map.put("vfm", f4300e);
        }
        if (!TextUtils.isEmpty(f)) {
            map.put("vfc", f);
        }
        if (TextUtils.isEmpty(g)) {
            return;
        }
        map.put("vfs", g);
    }

    public static void d() {
        f4299c = d;
        f4300e = null;
        f = null;
        g = null;
    }

    public static void e(String str, int i, String str2, String str3) {
        String strE = if0.e(i);
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        HashMap map = new HashMap();
        map.put(wfa.FEATURE_API_REQUEST, str);
        map.put("app_name", if0.d(strE));
        map.put(qmm.a.b, strE);
        map.put(Constants.EXTRA_KEY_APP_VERSION, if0.f(strE));
        map.put("status_code", str2);
        map.put("sdk_version", str3);
        G(2018, map);
    }

    public static /* synthetic */ void f() {
        String str = if0.CHANNEL;
        channelValue = str;
        if (TextUtils.isEmpty(str)) {
            channelValue = SafetyCheckManager.CHANNEL_OFFICE;
        }
    }

    public static void g(String str) {
    }

    public static Map<String, Object> h(String str, Object obj) {
        HashMap map = new HashMap();
        map.put(str, obj);
        return map;
    }

    public static b i(int i) {
        return new b(Integer.valueOf(i));
    }

    public static b j() {
        return new b(4001);
    }

    public static b k() {
        b bVar = new b(2002);
        b(bVar);
        return bVar;
    }

    public static void l(String str, Long l2) {
        b bVar = new b(2026);
        bVar.a(SpeechConstant.TTS_PLAY_MARK, str);
        bVar.a("time", l2);
        bVar.b();
    }

    public static b m() {
        return new b(2003);
    }

    public static b n() {
        return new b(2001);
    }

    public static b o() {
        return new b(2007);
    }

    public static b p() {
        return new b(4000);
    }

    public static b q() {
        return new b(2028);
    }

    public static b r() {
        return new b(2014);
    }

    public static b s() {
        return new b(2027);
    }

    public static b t() {
        return new b(2020);
    }

    public static b u() {
        return new b(2021);
    }

    public static b v() {
        return new b(2024);
    }

    public static b w() {
        return new b(2023);
    }

    public static b x() {
        b bVar = new b(2000);
        b(bVar);
        return bVar;
    }

    public static b y() {
        return new b(2004);
    }

    public static b z() {
        return new b(2016);
    }
}