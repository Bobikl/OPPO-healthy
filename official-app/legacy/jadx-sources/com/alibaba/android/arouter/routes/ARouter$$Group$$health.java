package com.alibaba.android.arouter.routes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.heytap.health.export.HealthServiceImpl;
import com.heytap.health.homecard.HomeCardEditActivity;
import com.heytap.health.insight.ui.activity.InsightIntroductionActivity;
import com.heytap.health.insight.ui.activity.InsightNotificationSettingsActivity;
import com.heytap.health.insight.ui.activity.InsightTrendActivity;
import com.heytap.health.miniapp.MiniAppHealthActivity;
import com.heytap.health.p003switch.FunctionSwitchImpl;
import com.heytap.health.third.DownloadResourceServiceImpl;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Group$$health", "Lcom/alibaba/android/arouter/facade/template/IRouteGroup;", "()V", Consts.METHOD_LOAD_INTO, "", "atlas", "", "", "Lcom/alibaba/android/arouter/facade/model/RouteMeta;", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Group$$health implements IRouteGroup {
    public static final int $stable = 0;

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(@Nullable Map<String, RouteMeta> atlas) {
        if (atlas == null) {
            return;
        }
        RouteType routeType = RouteType.PROVIDER;
        RouteMeta routeMetaBuild = RouteMeta.build(routeType, DownloadResourceServiceImpl.class, "/health/downloadresearchservice", "health", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/health/DownloadResearchService", routeMetaBuild);
        RouteMeta routeMetaBuild2 = RouteMeta.build(routeType, FunctionSwitchImpl.class, "/health/functionswitch", "health", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild2, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/health/FunctionSwitch", routeMetaBuild2);
        RouteMeta routeMetaBuild3 = RouteMeta.build(routeType, HealthServiceImpl.class, "/health/healthservice", "health", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild3, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/health/HealthService", routeMetaBuild3);
        RouteType routeType2 = RouteType.ACTIVITY;
        RouteMeta routeMetaBuild4 = RouteMeta.build(routeType2, HomeCardEditActivity.class, "/health/homecardeditactivity", "health", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild4, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/health/HomeCardEditActivity", routeMetaBuild4);
        RouteMeta routeMetaBuild5 = RouteMeta.build(routeType2, InsightIntroductionActivity.class, "/health/insightintroductionactivity", "health", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild5, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/health/InsightIntroductionActivity", routeMetaBuild5);
        RouteMeta routeMetaBuild6 = RouteMeta.build(routeType2, InsightNotificationSettingsActivity.class, "/health/insightnotificationsettingsactivity", "health", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild6, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/health/InsightNotificationSettingsActivity", routeMetaBuild6);
        RouteMeta routeMetaBuild7 = RouteMeta.build(routeType2, InsightTrendActivity.class, "/health/insighttrendactivity", "health", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild7, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/health/InsightTrendActivity", routeMetaBuild7);
        RouteMeta routeMetaBuild8 = RouteMeta.build(routeType2, MiniAppHealthActivity.class, "/health/miniapphealthactivity", "health", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild8, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/health/MiniAppHealthActivity", routeMetaBuild8);
    }
}
