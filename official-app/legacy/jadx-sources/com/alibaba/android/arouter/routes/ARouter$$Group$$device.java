package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.heytap.device.bpg.BpgRouteActivity;
import com.heytap.device.bpg.BpgUseActivity;
import com.heytap.device.manager.BodyFatScaleServiceImpl;
import com.heytap.device.manager.BpgServiceImpl;
import com.heytap.device.manager.WeightScaleServiceImpl;
import com.heytap.device.ui.weight.BodyFatMeasureActivity;
import com.heytap.device.ui.weight.BodyFatScaleBindActivity;
import com.heytap.device.ui.weight.BodyFatScaleGuideActivity;
import com.heytap.device.ui.weight.BodyFatScaleSettingActivity;
import com.heytap.device.ui.weight.BodyFatScaleWifiSettingActivity;
import com.heytap.device.ui.weight.about.BodyFatScaleAboutActivity;
import com.heytap.device.ui.weight.bpg.BpgDeviceInfoActivity;
import com.heytap.device.ui.weight.bpg.BpgManagerActivity;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Group$$device", "Lcom/alibaba/android/arouter/facade/template/IRouteGroup;", "()V", Consts.METHOD_LOAD_INTO, "", "atlas", "", "", "Lcom/alibaba/android/arouter/facade/model/RouteMeta;", "device_third_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Group$$device implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(@Nullable Map<String, RouteMeta> atlas) {
        if (atlas == null) {
            return;
        }
        RouteType routeType = RouteType.ACTIVITY;
        RouteMeta routeMetaBuild = RouteMeta.build(routeType, BodyFatMeasureActivity.class, "/device/bodyfatmeasureactivity", "device", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/device/BodyFatMeasureActivity", routeMetaBuild);
        RouteMeta routeMetaBuild2 = RouteMeta.build(routeType, BodyFatScaleAboutActivity.class, "/device/bodyfatscaleaboutactivity", "device", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild2, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/device/BodyFatScaleAboutActivity", routeMetaBuild2);
        RouteMeta routeMetaBuild3 = RouteMeta.build(routeType, BodyFatScaleBindActivity.class, "/device/bodyfatscalebindactivity", "device", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild3, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/device/BodyFatScaleBindActivity", routeMetaBuild3);
        RouteMeta routeMetaBuild4 = RouteMeta.build(routeType, BodyFatScaleGuideActivity.class, "/device/bodyfatscaleguideactivity", "device", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild4, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/device/BodyFatScaleGuideActivity", routeMetaBuild4);
        RouteType routeType2 = RouteType.PROVIDER;
        RouteMeta routeMetaBuild5 = RouteMeta.build(routeType2, BodyFatScaleServiceImpl.class, "/device/bodyfatscaleserviceimpl", "device", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild5, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/device/BodyFatScaleServiceImpl", routeMetaBuild5);
        RouteMeta routeMetaBuild6 = RouteMeta.build(routeType, BodyFatScaleSettingActivity.class, "/device/bodyfatscalesettingactivity", "device", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild6, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/device/BodyFatScaleSettingActivity", routeMetaBuild6);
        RouteMeta routeMetaBuild7 = RouteMeta.build(routeType, BodyFatScaleWifiSettingActivity.class, "/device/bodyfatscalewifisettingactivity", "device", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild7, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/device/BodyFatScaleWifiSettingActivity", routeMetaBuild7);
        RouteMeta routeMetaBuild8 = RouteMeta.build(routeType, BpgDeviceInfoActivity.class, "/device/bpgdeviceinfoactivity", "device", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild8, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/device/BpgDeviceInfoActivity", routeMetaBuild8);
        RouteMeta routeMetaBuild9 = RouteMeta.build(routeType, BpgManagerActivity.class, "/device/bpgmanageractivity", "device", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild9, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/device/BpgManagerActivity", routeMetaBuild9);
        RouteMeta routeMetaBuild10 = RouteMeta.build(routeType, BpgRouteActivity.class, "/device/bpgrouteactivity", "device", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild10, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/device/BpgRouteActivity", routeMetaBuild10);
        RouteMeta routeMetaBuild11 = RouteMeta.build(routeType2, BpgServiceImpl.class, "/device/bpgserviceimpl", "device", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild11, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/device/BpgServiceImpl", routeMetaBuild11);
        RouteMeta routeMetaBuild12 = RouteMeta.build(routeType, BpgUseActivity.class, "/device/bpguseactivity", "device", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild12, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/device/BpgUseActivity", routeMetaBuild12);
        RouteMeta routeMetaBuild13 = RouteMeta.build(routeType2, WeightScaleServiceImpl.class, "/device/weightscaleserviceimpl", "device", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild13, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/device/WeightScaleServiceImpl", routeMetaBuild13);
    }
}
