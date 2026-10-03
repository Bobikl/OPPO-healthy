package com.alibaba.android.arouter.routes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.heytap.databaseengineservice.db.table.phycialmental.DBPhysicalMentalAchievement;
import com.heytap.health.sunshine.ui.detail.SunshineDescriptionActivity;
import com.heytap.health.sunshine.ui.detail.SunshineDetailActivity;
import com.heytap.health.sunshine.ui.detail.VitaminDActivity;
import com.heytap.health.sunshine.ui.detail.VitaminDescriptionActivity;
import com.heytap.health.sunshine.ui.detail.VitaminIntakeRecordActivity;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Group$$sunshine", "Lcom/alibaba/android/arouter/facade/template/IRouteGroup;", "()V", Consts.METHOD_LOAD_INTO, "", "atlas", "", "", "Lcom/alibaba/android/arouter/facade/model/RouteMeta;", "sunshine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Group$$sunshine implements IRouteGroup {
    public static final int $stable = 0;

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(@Nullable Map<String, RouteMeta> atlas) {
        if (atlas == null) {
            return;
        }
        RouteType routeType = RouteType.ACTIVITY;
        RouteMeta routeMetaBuild = RouteMeta.build(routeType, SunshineDetailActivity.class, "/sunshine/sunshinedetailactivity", DBPhysicalMentalAchievement.SUNSHINE, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/sunshine/SunshineDetailActivity", routeMetaBuild);
        RouteMeta routeMetaBuild2 = RouteMeta.build(routeType, SunshineDescriptionActivity.class, "/sunshine/sunshinedetaildescriptionactivity", DBPhysicalMentalAchievement.SUNSHINE, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild2, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/sunshine/SunshineDetailDescriptionActivity", routeMetaBuild2);
        RouteMeta routeMetaBuild3 = RouteMeta.build(routeType, VitaminDActivity.class, "/sunshine/vitamindactivity", DBPhysicalMentalAchievement.SUNSHINE, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild3, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/sunshine/VitaminDActivity", routeMetaBuild3);
        RouteMeta routeMetaBuild4 = RouteMeta.build(routeType, VitaminDescriptionActivity.class, "/sunshine/vitamindescriptionactivity", DBPhysicalMentalAchievement.SUNSHINE, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild4, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/sunshine/VitaminDescriptionActivity", routeMetaBuild4);
        RouteMeta routeMetaBuild5 = RouteMeta.build(routeType, VitaminIntakeRecordActivity.class, "/sunshine/vitaminintakerecordactivity", DBPhysicalMentalAchievement.SUNSHINE, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild5, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/sunshine/VitaminIntakeRecordActivity", routeMetaBuild5);
    }
}
