package com.oplus.aiunit.vision;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class xc7 {
    public static volatile xc7 b;
    public Map<String, Map<String, mc7>> a = new ConcurrentHashMap();

    public static xc7 a() {
        if (b == null) {
            synchronized (xc7.class) {
                if (b == null) {
                    b = new xc7();
                }
            }
        }
        return b;
    }

    public void b(String str, mc7 mc7Var) {
        if (mc7Var == null) {
            return;
        }
        wil.a("FTTaskManager", "put: taskInfo taskId=" + mc7Var.h());
        Map<String, mc7> concurrentHashMap = this.a.get(str);
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
            this.a.put(str, concurrentHashMap);
        }
        concurrentHashMap.put(mc7Var.h(), mc7Var);
    }

    public void c(String str, String str2) {
        wil.a("FTTaskManager", "put: taskInfo taskId=" + str2);
        Map<String, mc7> map = this.a.get(str);
        if (map != null) {
            map.remove(str2);
            if (map.size() == 0) {
                this.a.remove(str);
            }
        }
    }

    public void d(String str, mc7 mc7Var) {
        if (mc7Var == null) {
            return;
        }
        wil.a("FTTaskManager", "update: taskInfo taskId=" + mc7Var.h());
        b(str, mc7Var);
    }
}
