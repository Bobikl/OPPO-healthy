package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class y56 {

    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            s56.k(c90.a().getPackageName());
        }
    }

    public static void a() {
        owj.a(new a());
    }

    public static boolean b() {
        try {
            return s56.g();
        } finally {
            a();
        }
    }
}
