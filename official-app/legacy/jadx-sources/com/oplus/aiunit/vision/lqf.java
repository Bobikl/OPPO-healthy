package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 $*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\tB1\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u0003\u0012\u0006\u0010!\u001a\u00020\u001a¢\u0006\u0004\b\"\u0010#J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0002R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/oplus/aiunit/vision/lqf;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/aiunit/vision/kqf;", "Lkotlin/Function0;", "", "expireAction", "b", "", "key", "a", "", "c", "", ParserTag.TAG_GET, "d", "Lkotlin/jvm/functions/Function0;", "Ljava/lang/String;", "memCacheKey", "Lcom/oplus/aiunit/vision/bsb;", "Lcom/oplus/aiunit/vision/bsb;", "getCacheCore", "()Lcom/oplus/aiunit/vision/bsb;", "cacheCore", "getRequestAction", "()Lkotlin/jvm/functions/Function0;", "requestAction", "Ljava/util/concurrent/ExecutorService;", MapSchema.FIELD_NAME_ENTRY, "Ljava/util/concurrent/ExecutorService;", "getExecutor", "()Ljava/util/concurrent/ExecutorService;", "setExecutor", "(Ljava/util/concurrent/ExecutorService;)V", "executor", "<init>", "(Lcom/oplus/aiunit/vision/bsb;Lkotlin/jvm/functions/Function0;Ljava/util/concurrent/ExecutorService;)V", "Companion", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final class lqf<T> implements kqf<T> {
    public static final String f = "requestCache";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public Function0<Boolean> expireAction;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public String memCacheKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final bsb<T> cacheCore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Function0<List<T>> requestAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public ExecutorService executor;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "run"}, k = 3, mv = {1, 4, 0})
    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            lqf.this.get();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lqf(@NotNull bsb<T> cacheCore, @NotNull Function0<? extends List<? extends T>> requestAction, @NotNull ExecutorService executor) {
        Intrinsics.checkNotNullParameter(cacheCore, "cacheCore");
        Intrinsics.checkNotNullParameter(requestAction, "requestAction");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.cacheCore = cacheCore;
        this.requestAction = requestAction;
        this.executor = executor;
        this.memCacheKey = "";
    }

    @Override // com.oplus.aiunit.vision.kqf
    @NotNull
    public kqf<T> a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.memCacheKey = key;
        return this;
    }

    @Override // com.oplus.aiunit.vision.kqf
    @NotNull
    public kqf<T> b(@NotNull Function0<Boolean> expireAction) {
        Intrinsics.checkNotNullParameter(expireAction, "expireAction");
        this.expireAction = expireAction;
        return this;
    }

    @Override // com.oplus.aiunit.vision.r58
    public void c() {
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
        threadCurrentThread.setName("1HeyUnionCacheasync");
        this.executor.execute(new b());
    }

    public final boolean d() {
        return this.memCacheKey.length() > 0;
    }

    @Override // com.oplus.aiunit.vision.r58
    @NotNull
    public List<T> get() {
        Function0<Boolean> function0 = this.expireAction;
        if (function0 != null && function0.invoke().booleanValue()) {
            List<T> listInvoke = this.requestAction.invoke();
            if (d() && (!listInvoke.isEmpty())) {
                this.cacheCore.a(this.memCacheKey, listInvoke);
            }
            return this.cacheCore.get(this.memCacheKey);
        }
        if (d() && this.cacheCore.b(this.memCacheKey)) {
            return this.cacheCore.get(this.memCacheKey);
        }
        if (!d() || this.cacheCore.b(this.memCacheKey)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<T> listInvoke2 = this.requestAction.invoke();
        if (d() && (!listInvoke2.isEmpty())) {
            this.cacheCore.a(this.memCacheKey, listInvoke2);
        }
        return this.cacheCore.get(this.memCacheKey);
    }
}
