package com.alibaba.android.arouter.routes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.heytap.health.home.HomeMovingServiceImpl;
import com.heytap.health.home.HomeResultServiceImpl;
import com.heytap.health.home.PrivacyStateSyncServiceImpl;
import com.heytap.health.home.StepResourceDialogServiceImpl;
import com.heytap.health.home.TodoCardServiceImpl;
import com.heytap.health.home.behavior.HomeToolbarMenuServiceImpl;
import com.heytap.health.home.healthcard.HomeDeviceFilterServiceImpl;
import com.heytap.health.home.rankpage.RankPageActivity;
import com.heytap.health.home.rankpage.RankServiceImpl;
import com.heytap.health.home.tipcard.HomeCloudSwitchTipsService;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Group$$home", "Lcom/alibaba/android/arouter/facade/template/IRouteGroup;", "()V", Consts.METHOD_LOAD_INTO, "", "atlas", "", "", "Lcom/alibaba/android/arouter/facade/model/RouteMeta;", "home_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Group$$home implements IRouteGroup {
    public static final int $stable = 0;

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(@Nullable Map<String, RouteMeta> atlas) {
        if (atlas == null) {
            return;
        }
        RouteType routeType = RouteType.PROVIDER;
        RouteMeta routeMetaBuild = RouteMeta.build(routeType, HomeCloudSwitchTipsService.class, "/home/homecloudswitchtipscardservice", "home", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/home/HomeCloudSwitchTipsCardService", routeMetaBuild);
        RouteMeta routeMetaBuild2 = RouteMeta.build(routeType, HomeDeviceFilterServiceImpl.class, "/home/homedevicefilterservice", "home", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild2, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/home/HomeDeviceFilterService", routeMetaBuild2);
        RouteMeta routeMetaBuild3 = RouteMeta.build(routeType, HomeMovingServiceImpl.class, "/home/homemovingservice", "home", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild3, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/home/HomeMovingService", routeMetaBuild3);
        RouteMeta routeMetaBuild4 = RouteMeta.build(routeType, HomeResultServiceImpl.class, "/home/homeresultservice", "home", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild4, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/home/HomeResultService", routeMetaBuild4);
        RouteMeta routeMetaBuild5 = RouteMeta.build(routeType, HomeToolbarMenuServiceImpl.class, "/home/hometoolbarmenuservice", "home", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild5, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/home/HomeToolbarMenuService", routeMetaBuild5);
        RouteMeta routeMetaBuild6 = RouteMeta.build(RouteType.ACTIVITY, RankPageActivity.class, "/home/rankpagev2", "home", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild6, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/home/RankPageV2", routeMetaBuild6);
        RouteMeta routeMetaBuild7 = RouteMeta.build(routeType, RankServiceImpl.class, "/home/rankservice", "home", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild7, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/home/RankService", routeMetaBuild7);
        RouteMeta routeMetaBuild8 = RouteMeta.build(routeType, TodoCardServiceImpl.class, "/home/todocardservice", "home", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild8, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/home/TodoCardService", routeMetaBuild8);
        RouteMeta routeMetaBuild9 = RouteMeta.build(routeType, PrivacyStateSyncServiceImpl.class, "/home/privacystatesync", "home", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild9, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/home/privacyStateSync", routeMetaBuild9);
        RouteMeta routeMetaBuild10 = RouteMeta.build(routeType, StepResourceDialogServiceImpl.class, "/home/stepresourcedialog", "home", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild10, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/home/stepResourceDialog", routeMetaBuild10);
    }
}
