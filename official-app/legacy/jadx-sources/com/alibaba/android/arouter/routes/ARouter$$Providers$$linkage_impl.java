package com.alibaba.android.arouter.routes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IProviderGroup;
import com.heytap.health.linkage.LinkageMessageHandler;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Providers$$linkage_impl", "Lcom/alibaba/android/arouter/facade/template/IProviderGroup;", "()V", Consts.METHOD_LOAD_INTO, "", "providers", "", "", "Lcom/alibaba/android/arouter/facade/model/RouteMeta;", "linkage_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Providers$$linkage_impl implements IProviderGroup {
    public static final int $stable = 0;

    @Override // com.alibaba.android.arouter.facade.template.IProviderGroup
    public void loadInto(@Nullable Map<String, RouteMeta> providers) {
        if (providers == null) {
            return;
        }
        RouteMeta routeMetaBuild = RouteMeta.build(RouteType.PROVIDER, LinkageMessageHandler.class, "/linkage/sync", "linkage", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        providers.put("com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler", routeMetaBuild);
    }
}
