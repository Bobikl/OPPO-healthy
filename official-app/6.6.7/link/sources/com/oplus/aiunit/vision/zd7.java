package com.oplus.aiunit.vision;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class zd7 {
    public static volatile zd7 b;
    public Map<String, Map<String, od7>> a = new ConcurrentHashMap();

    public static zd7 a() {
        if (b == null) {
            synchronized (zd7.class) {
                if (b == null) {
                    b = new zd7();
                }
            }
        }
        return b;
    }

    public void b(String str, od7 od7Var) {
        if (od7Var == null) {
            return;
        }
        uml.a("FTTaskManager", "put: taskInfo taskId=" + od7Var.h());
        Map<String, od7> concurrentHashMap = this.a.get(str);
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
            this.a.put(str, concurrentHashMap);
        }
        concurrentHashMap.put(od7Var.h(), od7Var);
    }

    public void c(String str, String str2) {
        uml.a("FTTaskManager", "put: taskInfo taskId=" + str2);
        Map<String, od7> map = this.a.get(str);
        if (map != null) {
            map.remove(str2);
            if (map.size() == 0) {
                this.a.remove(str);
            }
        }
    }

    public void d(String str, od7 od7Var) {
        if (od7Var == null) {
            return;
        }
        uml.a("FTTaskManager", "update: taskInfo taskId=" + od7Var.h());
        b(str, od7Var);
    }
}
