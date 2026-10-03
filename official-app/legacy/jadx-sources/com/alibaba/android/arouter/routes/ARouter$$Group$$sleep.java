package com.alibaba.android.arouter.routes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.health.sleep.SleepHistoryActivity;
import com.heytap.health.sleep.day.SleepPhoneMeasureActivity;
import com.heytap.health.sleep.description.SleepBreathRateDescriptionActivity;
import com.heytap.health.sleep.description.SleepHeartRateDescriptionActivity;
import com.heytap.health.sleep.description.SleepScoreDescriptionActivity;
import com.heytap.health.sleep.description.SleepSnoreDescriptionActivity;
import com.heytap.health.sleep.description.SleepStageDescriptionActivity;
import com.heytap.health.sleep.disturb.ui.DisturbActivity;
import com.heytap.health.sleep.disturb.util.DisturbServiceImpl;
import com.heytap.health.sleep.disturb.util.SleepServiceImpl;
import com.heytap.health.sleep.service.homecard.SleepCardServiceImpl;
import com.heytap.health.sleep.snore.SnoreActivationActivity;
import com.heytap.health.sleep.snore.SnoreGuideActOne;
import com.heytap.health.sleep.snore.SnoreHistoryActivity;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Group$$sleep", "Lcom/alibaba/android/arouter/facade/template/IRouteGroup;", "()V", Consts.METHOD_LOAD_INTO, "", "atlas", "", "", "Lcom/alibaba/android/arouter/facade/model/RouteMeta;", "sleep_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Group$$sleep implements IRouteGroup {
    public static final int $stable = 0;

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(@Nullable Map<String, RouteMeta> atlas) {
        if (atlas == null) {
            return;
        }
        RouteType routeType = RouteType.ACTIVITY;
        RouteMeta routeMetaBuild = RouteMeta.build(routeType, DisturbActivity.class, "/sleep/disturbactivity", Element.ELEMENT_NAME_SLEEP, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/sleep/DisturbActivity", routeMetaBuild);
        RouteType routeType2 = RouteType.PROVIDER;
        RouteMeta routeMetaBuild2 = RouteMeta.build(routeType2, DisturbServiceImpl.class, "/sleep/disturbservice", Element.ELEMENT_NAME_SLEEP, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild2, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/sleep/DisturbService", routeMetaBuild2);
        RouteMeta routeMetaBuild3 = RouteMeta.build(routeType, SleepBreathRateDescriptionActivity.class, "/sleep/sleepbreathratedescriptionactivity", Element.ELEMENT_NAME_SLEEP, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild3, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/sleep/SleepBreathRateDescriptionActivity", routeMetaBuild3);
        RouteMeta routeMetaBuild4 = RouteMeta.build(routeType2, SleepCardServiceImpl.class, "/sleep/sleepcardserviceimpl", Element.ELEMENT_NAME_SLEEP, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild4, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/sleep/SleepCardServiceImpl", routeMetaBuild4);
        RouteMeta routeMetaBuild5 = RouteMeta.build(routeType, SleepHeartRateDescriptionActivity.class, "/sleep/sleepheartratedescriptionactivity", Element.ELEMENT_NAME_SLEEP, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild5, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/sleep/SleepHeartRateDescriptionActivity", routeMetaBuild5);
        RouteMeta routeMetaBuild6 = RouteMeta.build(routeType, SleepHistoryActivity.class, "/sleep/sleephistoryactivity", Element.ELEMENT_NAME_SLEEP, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild6, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/sleep/SleepHistoryActivity", routeMetaBuild6);
        RouteMeta routeMetaBuild7 = RouteMeta.build(routeType, SleepPhoneMeasureActivity.class, "/sleep/sleepphonemeasureactivity", Element.ELEMENT_NAME_SLEEP, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild7, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/sleep/SleepPhoneMeasureActivity", routeMetaBuild7);
        RouteMeta routeMetaBuild8 = RouteMeta.build(routeType, SleepScoreDescriptionActivity.class, "/sleep/sleepscoredescriptionactivity", Element.ELEMENT_NAME_SLEEP, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild8, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/sleep/SleepScoreDescriptionActivity", routeMetaBuild8);
        RouteMeta routeMetaBuild9 = RouteMeta.build(routeType2, SleepServiceImpl.class, "/sleep/sleepservice", Element.ELEMENT_NAME_SLEEP, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild9, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/sleep/SleepService", routeMetaBuild9);
        RouteMeta routeMetaBuild10 = RouteMeta.build(routeType, SleepSnoreDescriptionActivity.class, "/sleep/sleepsnoredescriptionactivity", Element.ELEMENT_NAME_SLEEP, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild10, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/sleep/SleepSnoreDescriptionActivity", routeMetaBuild10);
        RouteMeta routeMetaBuild11 = RouteMeta.build(routeType, SleepStageDescriptionActivity.class, "/sleep/sleepstagedescriptionactivity", Element.ELEMENT_NAME_SLEEP, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild11, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/sleep/SleepStageDescriptionActivity", routeMetaBuild11);
        RouteMeta routeMetaBuild12 = RouteMeta.build(routeType, SnoreActivationActivity.class, "/sleep/snoreactivationactivity", Element.ELEMENT_NAME_SLEEP, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild12, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/sleep/SnoreActivationActivity", routeMetaBuild12);
        RouteMeta routeMetaBuild13 = RouteMeta.build(routeType, SnoreGuideActOne.class, "/sleep/snoreguideactone", Element.ELEMENT_NAME_SLEEP, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild13, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/sleep/SnoreGuideActOne", routeMetaBuild13);
        RouteMeta routeMetaBuild14 = RouteMeta.build(routeType, SnoreHistoryActivity.class, "/sleep/snorehistoryactivity", Element.ELEMENT_NAME_SLEEP, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild14, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/sleep/SnoreHistoryActivity", routeMetaBuild14);
    }
}
