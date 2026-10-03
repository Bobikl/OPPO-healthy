package com.oplus.aiunit.vision;

import com.heytap.health.base.download.resource.ResourceBean;
import com.heytap.health.network.core.BaseResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J3\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u00062\u0019\b\u0003\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00040\u0002H'¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/wje;", "", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "params", "Lcom/oplus/aiunit/vision/ls2;", "Lcom/heytap/health/network/core/BaseResponse;", "Lcom/heytap/health/base/download/resource/ResourceBean;", "a", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
public interface wje {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ls2 a(wje wjeVar, Map map, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getResourceUrlByCall");
            }
            if ((i & 1) != 0) {
                map = MapsKt.mapOf(TuplesKt.to("resourceType", 13));
            }
            return wjeVar.a(map);
        }
    }

    @j3e("v1/c2s/file/queryResource")
    @NotNull
    ls2<BaseResponse<ResourceBean>> a(@ov1 @NotNull Map<String, Object> params);
}
