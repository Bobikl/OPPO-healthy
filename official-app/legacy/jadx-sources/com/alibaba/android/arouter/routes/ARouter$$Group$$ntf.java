package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import com.heytap.health.watch.notification.impl.transceiver.NotificationTransceiverManager;
import com.heytap.health.watch.notification.impl.ui.CloudNotificationActivity;
import com.heytap.health.watch.notification.impl.ui.NTFSwitchSettingActivity;
import com.heytap.health.watch.notification.impl.ui.NotificationFluidActivity;
import com.heytap.health.watch.notification.impl.ui.NotificationGuideActivity;
import com.heytap.health.watch.notification.impl.ui.NotificationSyncActivity;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Group$$ntf", "Lcom/alibaba/android/arouter/facade/template/IRouteGroup;", "()V", Consts.METHOD_LOAD_INTO, "", "atlas", "", "", "Lcom/alibaba/android/arouter/facade/model/RouteMeta;", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Group$$ntf implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(@Nullable Map<String, RouteMeta> atlas) {
        if (atlas == null) {
            return;
        }
        RouteType routeType = RouteType.ACTIVITY;
        RouteMeta routeMetaBuild = RouteMeta.build(routeType, CloudNotificationActivity.class, "/ntf/cloudnotificationactivity", "ntf", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/ntf/CloudNotificationActivity", routeMetaBuild);
        RouteMeta routeMetaBuild2 = RouteMeta.build(routeType, NotificationFluidActivity.class, "/ntf/fluidactivity", "ntf", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild2, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/ntf/FluidActivity", routeMetaBuild2);
        RouteMeta routeMetaBuild3 = RouteMeta.build(routeType, NTFSwitchSettingActivity.class, "/ntf/ntfswitchsettingactivity", "ntf", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild3, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/ntf/NTFSwitchSettingActivity", routeMetaBuild3);
        RouteMeta routeMetaBuild4 = RouteMeta.build(routeType, NotificationGuideActivity.class, "/ntf/notificationguideactivity", "ntf", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild4, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/ntf/NotificationGuideActivity", routeMetaBuild4);
        RouteMeta routeMetaBuild5 = RouteMeta.build(routeType, NotificationSyncActivity.class, "/ntf/notificationsyncactivity", "ntf", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild5, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/ntf/NotificationSyncActivity", routeMetaBuild5);
        RouteType routeType2 = RouteType.PROVIDER;
        RouteMeta routeMetaBuild6 = RouteMeta.build(routeType2, NotificationTransceiverManager.class, "/ntf/transceivermanager", "ntf", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild6, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/ntf/TransceiverManager", routeMetaBuild6);
        RouteMeta routeMetaBuild7 = RouteMeta.build(routeType2, NotificationApiService.class, "/ntf/notification_api", "ntf", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild7, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/ntf/notification_api", routeMetaBuild7);
    }
}
