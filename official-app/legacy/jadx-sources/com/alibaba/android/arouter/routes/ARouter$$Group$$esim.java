package com.alibaba.android.arouter.routes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.heytap.health.esim.EsimChoicesActivity;
import com.heytap.health.esim.EsimListActivity;
import com.heytap.health.esim.OperatorGuideWebViewActivity;
import com.heytap.health.esim.delete.DeleteEsimServiceImpl;
import com.heytap.health.esim.mgr.EsimSubHandler;
import com.heytap.health.esim.nsc.NetWorkServiceActivity;
import com.heytap.health.esim.nsc.UserComboManagerActivity;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Group$$esim", "Lcom/alibaba/android/arouter/facade/template/IRouteGroup;", "()V", Consts.METHOD_LOAD_INTO, "", "atlas", "", "", "Lcom/alibaba/android/arouter/facade/model/RouteMeta;", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Group$$esim implements IRouteGroup {
    public static final int $stable = 0;

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(@Nullable Map<String, RouteMeta> atlas) {
        if (atlas == null) {
            return;
        }
        RouteType routeType = RouteType.ACTIVITY;
        RouteMeta routeMetaBuild = RouteMeta.build(routeType, EsimChoicesActivity.class, "/esim/esimchoicesactivity", "esim", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/esim/EsimChoicesActivity", routeMetaBuild);
        RouteMeta routeMetaBuild2 = RouteMeta.build(routeType, NetWorkServiceActivity.class, "/esim/networkserviceactivity", "esim", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild2, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/esim/NetWorkServiceActivity", routeMetaBuild2);
        RouteMeta routeMetaBuild3 = RouteMeta.build(routeType, UserComboManagerActivity.class, "/esim/usercombomanageractivity", "esim", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild3, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/esim/UserComboManagerActivity", routeMetaBuild3);
        RouteType routeType2 = RouteType.PROVIDER;
        RouteMeta routeMetaBuild4 = RouteMeta.build(routeType2, DeleteEsimServiceImpl.class, "/esim/delete/deleteesimserviceimpl", "esim", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild4, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/esim/delete/DeleteEsimServiceImpl", routeMetaBuild4);
        RouteMeta routeMetaBuild5 = RouteMeta.build(routeType, EsimListActivity.class, "/esim/main/esimlistactivity", "esim", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild5, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/esim/main/EsimListActivity", routeMetaBuild5);
        RouteMeta routeMetaBuild6 = RouteMeta.build(routeType, OperatorGuideWebViewActivity.class, "/esim/main/operatorguidewebviewactivity", "esim", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild6, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/esim/main/OperatorGuideWebViewActivity", routeMetaBuild6);
        RouteMeta routeMetaBuild7 = RouteMeta.build(routeType2, EsimSubHandler.class, "/esim/messagehandler", "esim", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild7, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/esim/messageHandler", routeMetaBuild7);
    }
}
