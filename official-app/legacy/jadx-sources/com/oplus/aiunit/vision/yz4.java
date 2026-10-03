package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 !*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0006B1\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\r\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0002R\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R*\u0010\u0015\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/yz4;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/oplus/aiunit/vision/xz4;", "", "key", "a", "", ParserTag.TAG_GET, "", "d", "Ljava/lang/String;", "memCacheKey", "Lkotlin/Function0;", "", "b", "Lkotlin/jvm/functions/Function0;", "dropAction", "Lkotlin/Function1;", "c", "Lkotlin/jvm/functions/Function1;", "expireAction", "Lcom/oplus/aiunit/vision/bsb;", "Lcom/oplus/aiunit/vision/bsb;", "cacheCore", MapSchema.FIELD_NAME_ENTRY, "queryAction", "Ljava/util/concurrent/ExecutorService;", "f", "Ljava/util/concurrent/ExecutorService;", "executor", "<init>", "(Lcom/oplus/aiunit/vision/bsb;Lkotlin/jvm/functions/Function0;Ljava/util/concurrent/ExecutorService;)V", "Companion", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final class yz4<T> implements xz4<T> {
    public static final String g = "DatabaseCacheLoaderImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public String memCacheKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public Function0<Unit> dropAction;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Function1<? super List<? extends T>, Boolean> expireAction;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final bsb<T> cacheCore;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final Function0<List<T>> queryAction;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final ExecutorService executor;

    /* JADX WARN: Multi-variable type inference failed */
    public yz4(@NotNull bsb<T> cacheCore, @NotNull Function0<? extends List<? extends T>> queryAction, @NotNull ExecutorService executor) {
        Intrinsics.checkNotNullParameter(cacheCore, "cacheCore");
        Intrinsics.checkNotNullParameter(queryAction, "queryAction");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.cacheCore = cacheCore;
        this.queryAction = queryAction;
        this.executor = executor;
        this.memCacheKey = "";
    }

    @Override // com.oplus.aiunit.vision.xz4
    @NotNull
    public xz4<T> a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.memCacheKey = key;
        return this;
    }

    public final boolean d() {
        return this.memCacheKey.length() > 0;
    }

    @Override // com.oplus.aiunit.vision.r58
    @NotNull
    public List<T> get() {
        Function1<? super List<? extends T>, Boolean> function1 = this.expireAction;
        if (function1 != null && function1.invoke(this.cacheCore.get(this.memCacheKey)).booleanValue()) {
            Function0<Unit> function0 = this.dropAction;
            if (function0 != null) {
                function0.invoke();
            }
            if (d()) {
                this.cacheCore.remove(this.memCacheKey);
            }
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (d() && this.cacheCore.b(this.memCacheKey)) {
            return this.cacheCore.get(this.memCacheKey);
        }
        List<T> listInvoke = this.queryAction.invoke();
        if (d() && (!listInvoke.isEmpty())) {
            this.cacheCore.a(this.memCacheKey, listInvoke);
        }
        return listInvoke;
    }
}
