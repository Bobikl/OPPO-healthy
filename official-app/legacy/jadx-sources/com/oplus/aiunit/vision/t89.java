package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000f*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000eJ\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003H&J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003H&J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003H&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH&¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/t89;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Function0;", "", "queryAction", "Lcom/oplus/aiunit/vision/xz4;", "d", "requestAction", "Lcom/oplus/aiunit/vision/kqf;", "c", "Lcom/oplus/aiunit/vision/qre;", "b", "Lcom/oplus/aiunit/vision/bsb;", "a", "Companion", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public interface t89<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.t89$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0001\u0010\u0002J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/t89$a;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/aiunit/vision/t89;", "a", "Ljava/util/concurrent/ExecutorService;", "executor", "b", "<init>", "()V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        @NotNull
        public final <T> t89<T> a() {
            return mik.Companion.b(mik.INSTANCE, null, 1, null);
        }

        @NotNull
        public final <T> t89<T> b(@NotNull ExecutorService executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            return mik.INSTANCE.a(executor);
        }
    }

    @NotNull
    bsb<T> a();

    @NotNull
    qre<T> b(@NotNull Function0<? extends List<? extends T>> queryAction);

    @NotNull
    kqf<T> c(@NotNull Function0<? extends List<? extends T>> requestAction);

    @NotNull
    xz4<T> d(@NotNull Function0<? extends List<? extends T>> queryAction);
}
