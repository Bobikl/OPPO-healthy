package com.oplus.aiunit.vision;

import com.heytap.connect.TapConst;
import com.heytap.log.config.LogMemoryConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class gz5 {
    public static volatile gz5 b;
    public final Map<String, Long> a = new ConcurrentHashMap();

    public static gz5 a() {
        if (b == null) {
            synchronized (gz5.class) {
                if (b == null) {
                    b = new gz5();
                }
            }
        }
        return b;
    }

    public boolean b(String str) {
        if (str != null && !str.isEmpty()) {
            Long l2 = this.a.get(str);
            if (l2 == null) {
                return true;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis >= l2.longValue()) {
                this.a.remove(str);
                z6b.q("DomainHealth", "Domain cooldown expired, restored: " + e(str));
                return true;
            }
            z6b.k("DomainHealth", "Domain still in cooldown: " + e(str) + ", remaining=" + ((l2.longValue() - jCurrentTimeMillis) / 1000) + "s");
        }
        return false;
    }

    public void c(String str) {
        if (str == null || str.isEmpty() || this.a.remove(str) == null) {
            return;
        }
        z6b.q("DomainHealth", "Domain manually restored: " + e(str));
    }

    public void d(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        this.a.put(str, Long.valueOf(System.currentTimeMillis() + 3600000));
        z6b.u("DomainHealth", "Domain marked unavailable: " + e(str) + ", cooldown=" + TapConst.IP_TTL_DEFAULT + "s");
    }

    public final String e(String str) {
        if (str == null) {
            return "null";
        }
        if (str.length() <= 20) {
            return str;
        }
        return str.substring(0, 20) + LogMemoryConfig.LOG_ELLIPSIS;
    }

    public void f() {
        int size = this.a.size();
        this.a.clear();
        if (size > 0) {
            z6b.q("DomainHealth", "Config updated, reset all domain health status, count=" + size);
        }
    }
}
