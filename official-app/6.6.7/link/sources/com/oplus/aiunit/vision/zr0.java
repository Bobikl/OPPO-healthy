package com.oplus.aiunit.vision;

import com.heytap.wearable.btnet.proto.HBProxyConfig;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/zr0;", "", "", "a", "", "serviceId", "Lcom/heytap/wearable/btnet/proto/HBProxyConfig;", "config", "b", "", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/oplus/aiunit/vision/as0;", "Ljava/util/concurrent/ConcurrentHashMap;", "proxyServiceMap", "<init>", "()V", "device_btnet_impl_release"}, k = 1, mv = {1, 8, 0})
public final class zr0 {

    @NotNull
    public static final zr0 INSTANCE = new zr0();

    @NotNull
    public static final String TAG = "HttpProxyServerManager";

    @NotNull
    public static final ConcurrentHashMap<Integer, as0> a;

    static {
        ConcurrentHashMap<Integer, as0> concurrentHashMap = new ConcurrentHashMap<>();
        a = concurrentHashMap;
        concurrentHashMap.put(100, new as0(e88.b(), 100));
    }

    @JvmStatic
    public static final void a() {
        o5f.c(TAG, "Init bt network");
    }

    public final void b(int serviceId, @NotNull HBProxyConfig config) {
        cyg cygVar;
        Intrinsics.checkNotNullParameter(config, "config");
        as0 as0Var = a.get(Integer.valueOf(serviceId));
        if (as0Var == null || (cygVar = as0Var.i) == null) {
            return;
        }
        cygVar.A(config);
    }
}
