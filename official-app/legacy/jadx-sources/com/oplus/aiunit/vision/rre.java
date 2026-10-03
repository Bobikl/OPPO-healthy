package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.smartenginehelper.ParserTag;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B1\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\bH\u0002R\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/rre;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/aiunit/vision/qre;", "", "key", "a", "", ParserTag.TAG_GET, "", "b", "Ljava/lang/String;", "memCacheKey", "Lcom/oplus/aiunit/vision/bsb;", "Lcom/oplus/aiunit/vision/bsb;", "cacheCore", "Lkotlin/Function0;", "c", "Lkotlin/jvm/functions/Function0;", "requestAction", "Ljava/util/concurrent/ExecutorService;", "d", "Ljava/util/concurrent/ExecutorService;", "getExecutor", "()Ljava/util/concurrent/ExecutorService;", "setExecutor", "(Ljava/util/concurrent/ExecutorService;)V", "executor", "<init>", "(Lcom/oplus/aiunit/vision/bsb;Lkotlin/jvm/functions/Function0;Ljava/util/concurrent/ExecutorService;)V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final class rre<T> implements qre<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public String memCacheKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final bsb<T> cacheCore;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Function0<List<T>> requestAction;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public ExecutorService executor;

    /* JADX WARN: Multi-variable type inference failed */
    public rre(@NotNull bsb<T> cacheCore, @NotNull Function0<? extends List<? extends T>> requestAction, @NotNull ExecutorService executor) {
        Intrinsics.checkNotNullParameter(cacheCore, "cacheCore");
        Intrinsics.checkNotNullParameter(requestAction, "requestAction");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.cacheCore = cacheCore;
        this.requestAction = requestAction;
        this.executor = executor;
        this.memCacheKey = "";
    }

    @Override // com.oplus.aiunit.vision.qre
    @NotNull
    public qre<T> a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.memCacheKey = key;
        return this;
    }

    public final boolean b() {
        return this.memCacheKey.length() > 0;
    }

    @Override // com.oplus.aiunit.vision.qre
    @NotNull
    public List<T> get(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (b() && this.cacheCore.b(this.memCacheKey)) {
            return this.cacheCore.get(this.memCacheKey);
        }
        if (!b() || this.cacheCore.b(this.memCacheKey)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<T> listInvoke = this.requestAction.invoke();
        List<T> list = listInvoke;
        if (!(list == null || list.isEmpty())) {
            this.cacheCore.a(this.memCacheKey, listInvoke);
        }
        return this.cacheCore.get(this.memCacheKey);
    }
}
