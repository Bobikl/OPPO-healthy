package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes13.dex */
public final class cv6 {
    public static final Executor a = new a();
    public static final Executor b = new b();

    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            uqk.w(runnable);
        }
    }

    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return b;
    }

    public static Executor b() {
        return a;
    }
}
