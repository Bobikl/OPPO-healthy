package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import com.heytap.wearable.watch.emergency.EmergencyCallActivity;
import com.heytap.wearable.watch.emergency.IEmergencyImpl;
import com.heytap.wearable.watch.emergency.safeguard.SafeGuardAgreeActivity;
import com.heytap.wearable.watch.emergency.safeguard.SafeGuardMainActivity;
import com.heytap.wearable.watch.emergency.safeguard.SafeGuardStartActivity;
import com.heytap.wearable.watch.emergency.safeguard.SafeGuardTransceiver;
import com.heytap.wearable.watch.emergency.service.EmergencyMedicalCardServiceImpl;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Group$$emergency_impl", "Lcom/alibaba/android/arouter/facade/template/IRouteGroup;", "()V", Consts.METHOD_LOAD_INTO, "", "atlas", "", "", "Lcom/alibaba/android/arouter/facade/model/RouteMeta;", "emergency_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Group$$emergency_impl implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(@Nullable Map<String, RouteMeta> atlas) {
        if (atlas == null) {
            return;
        }
        RouteType routeType = RouteType.ACTIVITY;
        RouteMeta routeMetaBuild = RouteMeta.build(routeType, EmergencyCallActivity.class, "/emergency_impl/emergencycallactivity", "emergency_impl", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/emergency_impl/EmergencyCallActivity", routeMetaBuild);
        RouteType routeType2 = RouteType.PROVIDER;
        RouteMeta routeMetaBuild2 = RouteMeta.build(routeType2, EmergencyMedicalCardServiceImpl.class, "/emergency_impl/emergencymedicalcardservice", "emergency_impl", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild2, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/emergency_impl/EmergencyMedicalCardService", routeMetaBuild2);
        RouteMeta routeMetaBuild3 = RouteMeta.build(routeType, SafeGuardAgreeActivity.class, "/emergency_impl/safeguardagreeactivity", "emergency_impl", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild3, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/emergency_impl/SafeGuardAgreeActivity", routeMetaBuild3);
        RouteMeta routeMetaBuild4 = RouteMeta.build(routeType, SafeGuardMainActivity.class, "/emergency_impl/safeguardmainactivity", "emergency_impl", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild4, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/emergency_impl/SafeGuardMainActivity", routeMetaBuild4);
        RouteMeta routeMetaBuild5 = RouteMeta.build(routeType, SafeGuardStartActivity.class, "/emergency_impl/safeguardstartactivity", "emergency_impl", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild5, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/emergency_impl/SafeGuardStartActivity", routeMetaBuild5);
        RouteMeta routeMetaBuild6 = RouteMeta.build(routeType2, SafeGuardTransceiver.class, "/emergency_impl/safeguardtransceiver", "emergency_impl", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild6, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/emergency_impl/SafeGuardTransceiver", routeMetaBuild6);
        RouteMeta routeMetaBuild7 = RouteMeta.build(routeType2, IEmergencyImpl.class, "/emergency_impl/emergency", "emergency_impl", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild7, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/emergency_impl/emergency", routeMetaBuild7);
    }
}
