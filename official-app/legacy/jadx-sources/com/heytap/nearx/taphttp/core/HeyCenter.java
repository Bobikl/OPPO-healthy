package com.heytap.nearx.taphttp.core;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.DnsIndex;
import com.oplus.aiunit.vision.DnsRequest;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.c89;
import com.oplus.aiunit.vision.dt9;
import com.oplus.aiunit.vision.fw9;
import com.oplus.aiunit.vision.hcf;
import com.oplus.aiunit.vision.icf;
import com.oplus.aiunit.vision.j35;
import com.oplus.aiunit.vision.k2m;
import com.oplus.aiunit.vision.pu5;
import com.oplus.aiunit.vision.r7b;
import com.oplus.aiunit.vision.tw9;
import com.oplus.aiunit.vision.zn9;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.httpdns.IpInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__MutableCollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 F2\u00020\u0001:\u0001&B\u0019\u0012\u0006\u0010>\u001a\u00020:\u0012\b\b\u0002\u0010C\u001a\u00020?¢\u0006\u0004\bD\u0010EJ)\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0010J?\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016¢\u0006\u0004\b\u001a\u0010\u001bJQ\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00122\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!J\u0006\u0010$\u001a\u00020!R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00100R\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020\u000e038\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106R\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\u0010038\u0006¢\u0006\f\n\u0004\b$\u00104\u001a\u0004\b8\u00106R\u0017\u0010>\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010C\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b<\u0010@\u001a\u0004\bA\u0010B¨\u0006G"}, d2 = {"Lcom/heytap/nearx/taphttp/core/HeyCenter;", "", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "clazz", "impl", "", "o", "(Ljava/lang/Class;Ljava/lang/Object;)V", b2n.f, "(Ljava/lang/Class;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/zn9;", "interceptor", "c", "Lcom/oplus/aiunit/vision/fw9;", "d", "Lcom/oplus/aiunit/vision/tw9;", MapSchema.FIELD_NAME_ENTRY, "", "hostName", "", "port", "Lkotlin/Function1;", "", "Lokhttp3/httpdns/IpInfo;", "localDns", LogFieldKey.MESSAGE_KEY, "(Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "isRetryRequest", "originalUrl", "n", "(Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "Lcom/oplus/aiunit/vision/dt9;", "dispatcher", LogFieldKey.PROCESS_NAME_KEY, "f", "Lcom/oplus/aiunit/vision/c89;", "a", "Lkotlin/Lazy;", LogFieldKey.LEVEL_KEY, "()Lcom/oplus/aiunit/vision/c89;", "runtimeComponents", "Lcom/oplus/aiunit/vision/pu5;", "b", "Lcom/oplus/aiunit/vision/pu5;", "eventDispatcher", "", "Ljava/util/List;", "commonInterceptors", "lookupInterceptors", "", "Ljava/util/Set;", "j", "()Ljava/util/Set;", "reqHeaderInterceptors", MapSchema.FIELD_NAME_KEY, "rspHeaderInterceptors", "Landroid/content/Context;", "Landroid/content/Context;", b2n.g, "()Landroid/content/Context;", "context", "Lcom/oplus/aiunit/vision/r7b;", "Lcom/oplus/aiunit/vision/r7b;", "i", "()Lcom/oplus/aiunit/vision/r7b;", "logger", "<init>", "(Landroid/content/Context;Lcom/oplus/aiunit/vision/r7b;)V", "Companion", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final class HeyCenter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Lazy i = LazyKt__LazyJVMKt.lazy(new Function0<ThreadPoolExecutor>() { // from class: com.heytap.nearx.taphttp.core.HeyCenter$Companion$IOExcPool$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final ThreadPoolExecutor invoke() {
            return new ThreadPoolExecutor(2, 10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Lazy f7419j = LazyKt__LazyJVMKt.lazy(new Function0<c89>() { // from class: com.heytap.nearx.taphttp.core.HeyCenter$Companion$serviceCenter$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final c89 invoke() {
            return new c89();
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Lazy runtimeComponents;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final pu5 eventDispatcher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final List<zn9> commonInterceptors;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final List<zn9> lookupInterceptors;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<fw9> reqHeaderInterceptors;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Set<tw9> rspHeaderInterceptors;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final r7b logger;

    /* JADX INFO: renamed from: com.heytap.nearx.taphttp.core.HeyCenter$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/heytap/nearx/taphttp/core/HeyCenter$a;", "", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "clazz", "impl", "", "a", "(Ljava/lang/Class;Ljava/lang/Object;)V", "c", "(Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/util/concurrent/ThreadPoolExecutor;", "IOExcPool$delegate", "Lkotlin/Lazy;", "b", "()Ljava/util/concurrent/ThreadPoolExecutor;", "IOExcPool", "Lcom/oplus/aiunit/vision/c89;", "serviceCenter$delegate", "d", "()Lcom/oplus/aiunit/vision/c89;", "serviceCenter", "<init>", "()V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> void a(@NotNull Class<T> clazz, T impl) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            d().b(clazz, impl);
        }

        @NotNull
        public final ThreadPoolExecutor b() {
            return (ThreadPoolExecutor) HeyCenter.i.getValue();
        }

        @Nullable
        public final <T> T c(@NotNull Class<T> clazz) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            return (T) d().a(clazz);
        }

        public final c89 d() {
            return (c89) HeyCenter.f7419j.getValue();
        }
    }

    public HeyCenter(@NotNull Context context, @NotNull r7b logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.context = context;
        this.logger = logger;
        this.runtimeComponents = LazyKt__LazyJVMKt.lazy(new Function0<c89>() { // from class: com.heytap.nearx.taphttp.core.HeyCenter$runtimeComponents$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final c89 invoke() {
                return new c89();
            }
        });
        pu5 pu5Var = new pu5(logger);
        this.eventDispatcher = pu5Var;
        this.commonInterceptors = new ArrayList();
        this.lookupInterceptors = new ArrayList();
        this.reqHeaderInterceptors = new LinkedHashSet();
        this.rspHeaderInterceptors = new LinkedHashSet();
        o(dt9.class, pu5Var);
    }

    public final void c(@NotNull zn9 interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        if (this.lookupInterceptors.contains(interceptor)) {
            return;
        }
        this.lookupInterceptors.add(interceptor);
    }

    public final void d(@NotNull fw9 interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.reqHeaderInterceptors.add(interceptor);
    }

    public final void e(@NotNull tw9 interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.rspHeaderInterceptors.add(interceptor);
    }

    @NotNull
    public final dt9 f() {
        return this.eventDispatcher;
    }

    @Nullable
    public final <T> T g(@NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) l().a(clazz);
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final r7b getLogger() {
        return this.logger;
    }

    @NotNull
    public final Set<fw9> j() {
        return this.reqHeaderInterceptors;
    }

    @NotNull
    public final Set<tw9> k() {
        return this.rspHeaderInterceptors;
    }

    public final c89 l() {
        return (c89) this.runtimeComponents.getValue();
    }

    @NotNull
    public final List<IpInfo> m(@NotNull String hostName, @Nullable Integer port, @NotNull Function1<? super String, ? extends List<IpInfo>> localDns) {
        Intrinsics.checkNotNullParameter(hostName, "hostName");
        Intrinsics.checkNotNullParameter(localDns, "localDns");
        return n(hostName, port, false, null, localDns);
    }

    @NotNull
    public final List<IpInfo> n(@NotNull String hostName, @Nullable Integer port, boolean isRetryRequest, @Nullable String originalUrl, @NotNull Function1<? super String, ? extends List<IpInfo>> localDns) {
        Intrinsics.checkNotNullParameter(hostName, "hostName");
        Intrinsics.checkNotNullParameter(localDns, "localDns");
        ArrayList arrayList = new ArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, this.commonInterceptors);
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, this.eventDispatcher.c());
        arrayList.add(new k2m(this.logger));
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, this.lookupInterceptors);
        arrayList.add(new icf(localDns, this.logger));
        DefaultConstructorMarker defaultConstructorMarker = null;
        DnsRequest wx5Var = new DnsRequest(null, new DnsIndex(hostName, port, null, null, null, 28, defaultConstructorMarker), j35.c(originalUrl), false, 9, defaultConstructorMarker);
        wx5Var.g(isRetryRequest);
        return new hcf(arrayList, wx5Var, 0).a(wx5Var).i();
    }

    public final <T> void o(@NotNull Class<T> clazz, T impl) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        l().b(clazz, impl);
    }

    public final void p(@NotNull dt9 dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.eventDispatcher.d(dispatcher);
    }
}
