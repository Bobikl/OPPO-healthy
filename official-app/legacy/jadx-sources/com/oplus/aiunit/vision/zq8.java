package com.oplus.aiunit.vision;

import androidx.annotation.Size;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes15.dex */
public class zq8 {

    public static class a extends yq8.a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f19521j;
        public final String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f19522l;

        public a(String str, String str2, ExecutorService executorService, boolean z) {
            super(executorService);
            this.f19521j = str2;
            this.k = apj.c(str, str2);
            this.f19522l = z;
        }

        @Override // com.oplus.aiunit.vision.yq8.a, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            super.execute(new pu8(this.k, runnable));
        }

        @Override // com.oplus.aiunit.vision.yq8.a, java.util.concurrent.ExecutorService
        public void shutdown() {
            if (this.f19522l) {
                super.shutdown();
            } else {
                a7b.f(this.f19521j, "call shutdown(), ignore!!");
            }
        }

        @Override // com.oplus.aiunit.vision.yq8.a, java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            if (this.f19522l) {
                return super.shutdownNow();
            }
            a7b.f(this.f19521j, " call shutdown(), ignore!!");
            return null;
        }
    }

    public static ExecutorService a(@Size(max = apj.MAX_CALLER_LENGTH) String str) {
        return new a(apj.Thread_Type_Executor_Cached, str, yq8.a(), false);
    }

    public static ExecutorService b(@Size(max = apj.MAX_CALLER_LENGTH) String str) {
        return new a(apj.Thread_Type_Executor_Fixed, str, yq8.b(), false);
    }

    public static Executor c(@Size(max = apj.MAX_CALLER_LENGTH) String str, int i) {
        return new a(apj.Thread_Type_Executor_Fixed, str, yq8.d(i), true);
    }

    public static ExecutorService d(@Size(max = apj.MAX_CALLER_LENGTH) String str) {
        return new a(apj.Thread_Type_Executor_Single, str, yq8.e(), true);
    }

    public static ExecutorService e(@Size(max = apj.MAX_CALLER_LENGTH) String str) {
        return new a(apj.Thread_Type_Executor_Single, str, yq8.f(), true);
    }

    public static ScheduledExecutorService f() {
        return Executors.newSingleThreadScheduledExecutor(new rv8(apj.Thread_Type_ScheduledExecutor_Single));
    }
}
