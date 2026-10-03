package com.oplus.nearx.cloudconfig;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.ct9;
import com.oplus.aiunit.vision.gt5;
import com.oplus.aiunit.vision.v7b;
import io.protostuff.MapSchema;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u00012\u00020\u0001:\u0001\u0015J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001f\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\u00020\u000b*\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0006H\u0002J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\rH\u0016J%\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0002R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/oplus/nearx/cloudconfig/CloudConfigCtrl;", "", "", "retryState", b2n.f, "", "", "keyList", MapSchema.FIELD_NAME_ENTRY, "(Ljava/util/List;)Z", "tag", "", "b", "Lkotlin/Pair;", "", "i", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "clazz", "c", "(Ljava/lang/Class;)Ljava/lang/Object;", "a", "(Z)Z", b2n.g, "Lcom/oplus/aiunit/vision/gt5;", "Lcom/oplus/aiunit/vision/gt5;", "dirConfig", "", "J", "lastCheckUpdateTime", "Ljava/lang/String;", Fields.PRODUCT_ID, "Lcom/oplus/aiunit/vision/v7b;", "logger", "Lcom/oplus/aiunit/vision/v7b;", "d", "()Lcom/oplus/aiunit/vision/v7b;", "Companion", "com.oplus.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
public final class CloudConfigCtrl {
    public static final int MIN_REQUEST_INTERVAL_GATEWAY = 90000;
    public static final int MIN_UPDATE_INTERVAL = 120000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final gt5 dirConfig;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long lastCheckUpdateTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String productId;

    @NotNull
    public static final Lazy d = LazyKt__LazyJVMKt.lazy(new Function0<ConcurrentHashMap<Object, WeakReference<CloudConfigCtrl>>>() { // from class: com.oplus.nearx.cloudconfig.CloudConfigCtrl$Companion$ccMap$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final ConcurrentHashMap<Object, WeakReference<CloudConfigCtrl>> invoke() {
            return new ConcurrentHashMap<>();
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean f(CloudConfigCtrl cloudConfigCtrl, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new CopyOnWriteArrayList();
        }
        return cloudConfigCtrl.e(list);
    }

    public final boolean a(boolean retryState) {
        return h() && g(retryState) && f(this, null, 1, null);
    }

    public final void b(@NotNull Object obj, String str) {
        v7b.b(null, String.valueOf(str), String.valueOf(obj), null, null, 12, null);
    }

    @Nullable
    public <T> T c(@NotNull Class<T> clazz) {
        Intrinsics.checkParameterIsNotNull(clazz, "clazz");
        throw null;
    }

    @NotNull
    public final v7b d() {
        return null;
    }

    @JvmName(name = "innerForceUpdate")
    public final boolean e(List<String> keyList) {
        throw null;
    }

    public final boolean g(boolean retryState) {
        if (System.currentTimeMillis() - this.lastCheckUpdateTime > 120000 || retryState) {
            return true;
        }
        b("you has already requested in last 120 seconds [Gateway version checker] from CheckUpdate", "Update(" + this.productId + ')');
        return false;
    }

    public final boolean h() {
        ct9 ct9Var = (ct9) c(ct9.class);
        return ct9Var != null && ct9Var.isNetworkAvailable();
    }

    @NotNull
    public Pair<String, Integer> i() {
        return TuplesKt.to(this.productId, Integer.valueOf(this.dirConfig.m()));
    }
}
