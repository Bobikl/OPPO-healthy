package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class yjf {
    public static final String MAC_DIVIDER = "/";
    public static final String SETTING_DEVICE_OTA_RED_DOT = "settingsOTARedDot";
    public final List<b> a;
    public final Map<String, r81> b;

    public static class a {
        public static final yjf a = new yjf();
    }

    public interface b {
        void e(String str, String str2, boolean z);
    }

    public static yjf c() {
        return a.a;
    }

    public void a(b bVar) {
        if (bVar == null || this.a.contains(bVar)) {
            return;
        }
        this.a.add(bVar);
    }

    public void b(String str) {
        if (d(str).d(SETTING_DEVICE_OTA_RED_DOT, true)) {
            i(str, SETTING_DEVICE_OTA_RED_DOT, true);
        }
    }

    public final r81 d(String str) {
        if (!this.b.containsKey(str)) {
            this.b.put(str, new opf(str, SETTING_DEVICE_OTA_RED_DOT));
        }
        return this.b.get(str);
    }

    public boolean e(String str) {
        return d(str).a(SETTING_DEVICE_OTA_RED_DOT);
    }

    public void f(b bVar) {
        this.a.remove(bVar);
    }

    public void g(String str) {
        if (d(str).d(SETTING_DEVICE_OTA_RED_DOT, false)) {
            i(str, SETTING_DEVICE_OTA_RED_DOT, false);
        }
    }

    public void h(String str) {
        d(str).b();
        this.b.remove(str);
    }

    public void i(String str, String str2, boolean z) {
        Iterator<b> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().e(str, str2, z);
        }
    }

    public yjf() {
        this.a = new ArrayList();
        this.b = new HashMap();
    }
}
