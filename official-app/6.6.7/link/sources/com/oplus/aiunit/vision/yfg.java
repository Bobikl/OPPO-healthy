package com.oplus.aiunit.vision;

import com.platform.usercenter.trace.rumtime.ITraceInterceptor;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R(\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/yfg;", "Lcom/platform/usercenter/trace/rumtime/ITraceInterceptor;", "", "", "rawMap", "intercept", "Ljava/lang/ref/SoftReference;", "a", "Ljava/lang/ref/SoftReference;", "weakBaseMap", "baseMap", "<init>", "(Ljava/util/Map;)V", "paysdk_statistic_release"}, k = 1, mv = {1, 8, 0})
public final class yfg implements ITraceInterceptor {

    @NotNull
    public final SoftReference<Map<String, String>> a;

    public yfg(@Nullable Map<String, String> map) {
        this.a = new SoftReference<>(map);
    }

    @NotNull
    public Map<String, String> intercept(@NotNull Map<String, String> rawMap) {
        Intrinsics.checkNotNullParameter(rawMap, "rawMap");
        HashMap map = new HashMap();
        Map<String, String> map2 = this.a.get();
        if (map2 != null && (!new HashMap(map2).isEmpty())) {
            map.putAll(map2);
        }
        return map;
    }
}
