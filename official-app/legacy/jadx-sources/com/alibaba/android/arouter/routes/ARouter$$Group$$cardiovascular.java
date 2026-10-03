package com.alibaba.android.arouter.routes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.heytap.health.cardiovascular.service.CardiovascularServiceImpl;
import com.heytap.health.cardiovascular.ui.CardiovascularDescriptionActivity;
import com.heytap.health.cardiovascular.ui.CardiovascularDetailActivity;
import com.heytap.health.cardiovascular.ui.CardiovascularPrepareActivity;
import com.heytap.health.cardiovascular.ui.CardiovascularRecordsActivity;
import com.heytap.health.cardiovascular.ui.CardiovascularVascularDescriptionActivity;
import com.heytap.health.cardiovascular.ui.QuicklyCheckupDescriptionActivity;
import com.heytap.health.cardiovascular.ui.QuicklyCheckupDescriptionV2Activity;
import com.heytap.health.cardiovascular.ui.QuicklyCheckupDetailActivity;
import com.heytap.health.cardiovascular.ui.QuicklyCheckupDetailV2Activity;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Group$$cardiovascular", "Lcom/alibaba/android/arouter/facade/template/IRouteGroup;", "()V", Consts.METHOD_LOAD_INTO, "", "atlas", "", "", "Lcom/alibaba/android/arouter/facade/model/RouteMeta;", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Group$$cardiovascular implements IRouteGroup {
    public static final int $stable = 0;

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(@Nullable Map<String, RouteMeta> atlas) {
        if (atlas == null) {
            return;
        }
        RouteType routeType = RouteType.ACTIVITY;
        RouteMeta routeMetaBuild = RouteMeta.build(routeType, CardiovascularDescriptionActivity.class, "/cardiovascular/cardiovasculardescriptionactivity", "cardiovascular", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/cardiovascular/CardiovascularDescriptionActivity", routeMetaBuild);
        RouteMeta routeMetaBuild2 = RouteMeta.build(routeType, CardiovascularDetailActivity.class, "/cardiovascular/cardiovasculardetailactivity", "cardiovascular", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild2, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/cardiovascular/CardiovascularDetailActivity", routeMetaBuild2);
        RouteMeta routeMetaBuild3 = RouteMeta.build(routeType, CardiovascularPrepareActivity.class, "/cardiovascular/cardiovascularprepareactivity", "cardiovascular", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild3, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/cardiovascular/CardiovascularPrepareActivity", routeMetaBuild3);
        RouteMeta routeMetaBuild4 = RouteMeta.build(routeType, CardiovascularRecordsActivity.class, "/cardiovascular/cardiovascularrecordsactivity", "cardiovascular", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild4, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/cardiovascular/CardiovascularRecordsActivity", routeMetaBuild4);
        RouteMeta routeMetaBuild5 = RouteMeta.build(RouteType.PROVIDER, CardiovascularServiceImpl.class, "/cardiovascular/cardiovascularservice", "cardiovascular", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild5, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/cardiovascular/CardiovascularService", routeMetaBuild5);
        RouteMeta routeMetaBuild6 = RouteMeta.build(routeType, QuicklyCheckupDescriptionActivity.class, "/cardiovascular/quicklycheckupdescriptionactivity", "cardiovascular", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild6, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/cardiovascular/QuicklyCheckupDescriptionActivity", routeMetaBuild6);
        RouteMeta routeMetaBuild7 = RouteMeta.build(routeType, QuicklyCheckupDescriptionV2Activity.class, "/cardiovascular/quicklycheckupdescriptionv2activity", "cardiovascular", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild7, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/cardiovascular/QuicklyCheckupDescriptionV2Activity", routeMetaBuild7);
        RouteMeta routeMetaBuild8 = RouteMeta.build(routeType, QuicklyCheckupDetailActivity.class, "/cardiovascular/quicklycheckupdetailactivity", "cardiovascular", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild8, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/cardiovascular/QuicklyCheckupDetailActivity", routeMetaBuild8);
        RouteMeta routeMetaBuild9 = RouteMeta.build(routeType, QuicklyCheckupDetailV2Activity.class, "/cardiovascular/quicklycheckupdetailv2activity", "cardiovascular", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild9, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/cardiovascular/QuicklyCheckupDetailV2Activity", routeMetaBuild9);
        RouteMeta routeMetaBuild10 = RouteMeta.build(routeType, CardiovascularVascularDescriptionActivity.class, "/cardiovascular/vasculardescriptionactivity", "cardiovascular", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild10, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/cardiovascular/VascularDescriptionActivity", routeMetaBuild10);
    }
}
