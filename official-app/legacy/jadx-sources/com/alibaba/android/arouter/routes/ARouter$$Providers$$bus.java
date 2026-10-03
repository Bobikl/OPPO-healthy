package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IProviderGroup;
import com.heytap.health.wallet.bus.impl.BusOperaterServiceImp;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import com.oplus.deepthinker.sdk.app.userprofile.labels.CommuteWayLabel;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Providers$$bus", "Lcom/alibaba/android/arouter/facade/template/IProviderGroup;", "()V", Consts.METHOD_LOAD_INTO, "", "providers", "", "", "Lcom/alibaba/android/arouter/facade/model/RouteMeta;", "bus_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Providers$$bus implements IProviderGroup {
    @Override // com.alibaba.android.arouter.facade.template.IProviderGroup
    public void loadInto(@Nullable Map<String, RouteMeta> providers) {
        if (providers == null) {
            return;
        }
        RouteMeta routeMetaBuild = RouteMeta.build(RouteType.PROVIDER, BusOperaterServiceImp.class, "/bus/traffic/operateService", CommuteWayLabel.BUS_TAG, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        providers.put("com.heytap.wallet.business.bus.router.BusOperaterService", routeMetaBuild);
    }
}
