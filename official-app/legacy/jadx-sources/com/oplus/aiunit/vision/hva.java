package com.oplus.aiunit.vision;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class hva {
    public final iva a;

    public hva(iva ivaVar) {
        this.a = ivaVar;
    }

    public int a(long j2) {
        return this.a.b(j2 - 604800000);
    }

    public int b(List<Long> list) {
        return this.a.c("event_hash_all_net", list);
    }

    public int c(List<Long> list) {
        return this.a.c("event_hash_wifi", list);
    }

    public int d(List<Long> list) {
        return this.a.c("event_real_time", list);
    }

    public int e(List<Long> list) {
        return this.a.c("event_all_net", list);
    }

    public int f(List<Long> list) {
        return this.a.c("event_wifi", list);
    }

    public boolean g() {
        try {
            return h("event_real_time") || h("event_all_net") || h("event_wifi") || h("event_hash_all_net") || h("event_hash_wifi");
        } catch (Throwable unused) {
            return true;
        }
    }

    public final boolean h(String str) {
        List<Object> listA = this.a.a(str, 1);
        return (listA == null || listA.isEmpty()) ? false : true;
    }

    public List<Object> i(int i) {
        return this.a.a("event_hash_all_net", i);
    }

    public List<Object> j(int i) {
        return this.a.a("event_hash_wifi", i);
    }

    public List<Object> k(int i) {
        return this.a.a("event_real_time", i);
    }

    public List<Object> l(int i) {
        return this.a.a("event_all_net", i);
    }

    public List<Object> m(int i) {
        return this.a.a("event_wifi", i);
    }
}
