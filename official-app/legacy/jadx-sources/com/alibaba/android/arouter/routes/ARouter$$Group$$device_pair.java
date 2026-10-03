package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.heytap.health.device_pair.PairStateControl;
import com.heytap.health.devicepair.manager.test.PairTestActivity;
import com.heytap.health.devicepair.migrate.MigrateGuideActivity;
import com.heytap.health.oobe.OOBEUI;
import com.heytap.health.watchpair.PairStateController;
import com.heytap.health.watchpair.account.WatchAccountServiceImpl;
import com.heytap.health.watchpair.clause.PrivacyActivity;
import com.heytap.health.watchpair.family.FamilyAccountManagerImpl;
import com.heytap.health.watchpair.family.FamilyUseGuideActivity;
import com.heytap.health.watchpair.keepalivesettings.DeviceCardTipManagerApiImpl;
import com.heytap.health.watchpair.keepalivesettings.KeepAliveSettingActivity;
import com.heytap.health.watchpair.keepalivesettings.KeepAliveSettingEntranceActivity;
import com.heytap.health.watchpair.manager.DeviceResDownloadManagerImpl;
import com.heytap.health.watchpair.marketmode.MarketModeMessageHandler;
import com.heytap.health.watchpair.service.DevicePairExtServiceImpl;
import com.heytap.health.watchpair.view.WatchViewServiceImpl;
import com.heytap.health.watchpair.watchconnect.pair.producttype.ProductCategorNewActivity;
import com.heytap.health.zxinglite.CaptureActivity;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Group$$device_pair", "Lcom/alibaba/android/arouter/facade/template/IRouteGroup;", "()V", Consts.METHOD_LOAD_INTO, "", "atlas", "", "", "Lcom/alibaba/android/arouter/facade/model/RouteMeta;", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Group$$device_pair implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(@Nullable Map<String, RouteMeta> atlas) {
        if (atlas == null) {
            return;
        }
        RouteType routeType = RouteType.ACTIVITY;
        RouteMeta routeMetaBuild = RouteMeta.build(routeType, CaptureActivity.class, "/device_pair/captureactivity", "device_pair", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/device_pair/CaptureActivity", routeMetaBuild);
        RouteType routeType2 = RouteType.PROVIDER;
        RouteMeta routeMetaBuild2 = RouteMeta.build(routeType2, DeviceCardTipManagerApiImpl.class, "/device_pair/devicecardtipmanagerapi", "device_pair", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild2, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/device_pair/DeviceCardTipManagerApi", routeMetaBuild2);
        RouteMeta routeMetaBuild3 = RouteMeta.build(routeType2, DevicePairExtServiceImpl.class, "/device_pair/devicepairextserviceimpl", "device_pair", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild3, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/device_pair/DevicePairExtServiceImpl", routeMetaBuild3);
        RouteMeta routeMetaBuild4 = RouteMeta.build(routeType2, DeviceResDownloadManagerImpl.class, "/device_pair/deviceresdownloadmanagerimpl", "device_pair", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild4, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/device_pair/DeviceResDownloadManagerImpl", routeMetaBuild4);
        RouteMeta routeMetaBuild5 = RouteMeta.build(routeType2, FamilyAccountManagerImpl.class, "/device_pair/familyaccoutmanager", "device_pair", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild5, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/device_pair/FamilyAccoutManager", routeMetaBuild5);
        RouteMeta routeMetaBuild6 = RouteMeta.build(routeType, FamilyUseGuideActivity.class, "/device_pair/familyuseguideactivity", "device_pair", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild6, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/device_pair/FamilyUseGuideActivity", routeMetaBuild6);
        RouteMeta routeMetaBuild7 = RouteMeta.build(routeType2, WatchViewServiceImpl.class, "/device_pair/iwatchviewservice", "device_pair", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild7, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/device_pair/IWatchViewService", routeMetaBuild7);
        RouteMeta routeMetaBuild8 = RouteMeta.build(routeType, KeepAliveSettingActivity.class, "/device_pair/keepalivesettingactivity", "device_pair", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild8, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/device_pair/KeepAliveSettingActivity", routeMetaBuild8);
        RouteMeta routeMetaBuild9 = RouteMeta.build(routeType, KeepAliveSettingEntranceActivity.class, "/device_pair/keepalivesettingentranceactivity", "device_pair", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild9, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/device_pair/KeepAliveSettingEntranceActivity", routeMetaBuild9);
        RouteMeta routeMetaBuild10 = RouteMeta.build(routeType2, MarketModeMessageHandler.class, "/device_pair/marketmodeservice", "device_pair", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild10, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/device_pair/MarketModeService", routeMetaBuild10);
        RouteMeta routeMetaBuild11 = RouteMeta.build(routeType, MigrateGuideActivity.class, "/device_pair/migrateguideactivity", "device_pair", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild11, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/device_pair/MigrateGuideActivity", routeMetaBuild11);
        RouteMeta routeMetaBuild12 = RouteMeta.build(routeType, OOBEUI.class, "/device_pair/oobeui", "device_pair", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild12, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/device_pair/OOBEUI", routeMetaBuild12);
        RouteMeta routeMetaBuild13 = RouteMeta.build(routeType2, PairStateController.class, "/device_pair/pairstatecontrol", "device_pair", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild13, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put(PairStateControl.PAIR_STATE_CONTROL, routeMetaBuild13);
        RouteMeta routeMetaBuild14 = RouteMeta.build(routeType, PairTestActivity.class, "/device_pair/pairtestactivity", "device_pair", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild14, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/device_pair/PairTestActivity", routeMetaBuild14);
        RouteMeta routeMetaBuild15 = RouteMeta.build(routeType, PrivacyActivity.class, "/device_pair/privacyactivity", "device_pair", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild15, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/device_pair/PrivacyActivity", routeMetaBuild15);
        RouteMeta routeMetaBuild16 = RouteMeta.build(routeType, ProductCategorNewActivity.class, "/device_pair/productcategoryactivity", "device_pair", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild16, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/device_pair/ProductCategoryActivity", routeMetaBuild16);
        RouteMeta routeMetaBuild17 = RouteMeta.build(routeType2, WatchAccountServiceImpl.class, "/device_pair/watchaccountserviceimpl", "device_pair", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild17, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/device_pair/WatchAccountServiceImpl", routeMetaBuild17);
    }
}
