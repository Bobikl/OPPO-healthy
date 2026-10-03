package com.oplus.aiunit.vision;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class fgf {
    public static volatile xv9 a;

    public static class a implements xv9 {
        public static final a a = new a();

        @Override // com.oplus.aiunit.vision.xv9
        public void a(String str, Map<Long, Integer> map, String str2) {
        }

        @Override // com.oplus.aiunit.vision.xv9
        public void b(String str, int i, long j2, String str2) {
        }

        @Override // com.oplus.aiunit.vision.xv9
        public void c(String str, Map<Long, Integer> map) {
        }

        @Override // com.oplus.aiunit.vision.xv9
        public void d(String str, int i, long j2, String str2) {
        }

        @Override // com.oplus.aiunit.vision.xv9
        public void e(List<String> list) {
        }

        @Override // com.oplus.aiunit.vision.xv9
        public void f(String str, List<Long> list, int i) {
        }

        @Override // com.oplus.aiunit.vision.xv9
        public void g(String str, Map<Long, Integer> map) {
        }

        @Override // com.oplus.aiunit.vision.xv9
        public void h(String str, int i, long j2) {
        }

        @Override // com.oplus.aiunit.vision.xv9
        public void i(String str, int i, long j2, String str2) {
        }

        @Override // com.oplus.aiunit.vision.xv9
        public void j(String str, long j2, agf.b bVar) {
        }

        @Override // com.oplus.aiunit.vision.xv9
        public void k(String str, Map<Long, Integer> map, String str2, int i) {
        }

        @Override // com.oplus.aiunit.vision.xv9
        public void l(String str, Map<Long, Integer> map, int i) {
        }

        @Override // com.oplus.aiunit.vision.xv9
        public void m(String str, int i, long j2, String str2) {
        }

        @Override // com.oplus.aiunit.vision.xv9
        public boolean n(String str) {
            return false;
        }
    }

    public static xv9 a() {
        return a == null ? a.a : a;
    }

    public static void b(xv9 xv9Var) {
        if (a != null) {
            z6b.u("ReconciliationRegistry", "ReconciliationService already registered, overwriting...");
        }
        a = xv9Var;
        StringBuilder sb = new StringBuilder();
        sb.append("ReconciliationService registered: ");
        sb.append(xv9Var != null ? xv9Var.getClass().getSimpleName() : "null");
        z6b.q("ReconciliationRegistry", sb.toString());
    }
}
