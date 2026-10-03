package com.oplus.aiunit.vision;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/b7h;", "", "", "name", "Lcom/oplus/aiunit/vision/z6h;", "a", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "idGenerator", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final class b7h {

    @NotNull
    public static final b7h INSTANCE = new b7h();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final AtomicLong idGenerator = new AtomicLong(0);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\u000e\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/b7h$a;", "Lcom/oplus/aiunit/vision/z6h;", "Ljava/lang/Runnable;", "task", "", "c", "", "a", "Ljava/lang/String;", "name", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "b", "Ljava/util/concurrent/ExecutorService;", "service", "<init>", "(Ljava/lang/String;)V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends z6h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final ExecutorService service;

        public a(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.service = zq8.e(name);
        }

        public static final void f(Runnable task) {
            Intrinsics.checkNotNullParameter(task, "$task");
            try {
                task.run();
            } catch (Throwable th) {
                k25.b("SingleThreadFactory", "execute " + th);
            }
        }

        @Override // com.oplus.aiunit.vision.z6h
        public void c(@NotNull final Runnable task) {
            Intrinsics.checkNotNullParameter(task, "task");
            try {
                this.service.execute(new Runnable() { // from class: com.oplus.aiunit.vision.a7h
                    @Override // java.lang.Runnable
                    public final void run() {
                        b7h.a.f(task);
                    }
                });
            } catch (Throwable th) {
                k25.b("SingleThreadFactory", "catch execute " + th);
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final z6h a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new a(name);
    }
}
