package com.alibaba.android.arouter.routes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.heytap.health.device.deviceinfo.OperationDeviceInfoServiceImpl;
import com.heytap.health.device.tab.connect.ConnectAndShareSettingActivity;
import com.heytap.health.device.tab.notify.NotifySettingsActivity;
import com.heytap.health.device_settings.iwatch.IWatchCallActivity;
import com.heytap.health.device_settings.iwatch.IWatchUnbindActivity;
import com.heytap.health.settings.band.BandReConnectServiceImpl;
import com.heytap.health.settings.band.BandServiceImpl;
import com.heytap.health.settings.band.settings.MoreSettingsActivity;
import com.heytap.health.settings.band.settings.skill.BandSkillActivity;
import com.heytap.health.settings.band.settings.update.DeviceUpdateActivity;
import com.heytap.health.settings.watch.DeviceSettingServiceImpl;
import com.heytap.health.settings.watch.aboutwatch.law.LawInfoActivity;
import com.heytap.health.settings.watch.moresettings.p2p.P2PSwitchActivity;
import com.heytap.health.settings.watch.notify.OpenNotifyServiceImpl;
import com.heytap.health.settings.watch.permission.FeaturePermissionService;
import com.heytap.health.settings.watch.preferences.quickcenter.QuickCenterReceiver;
import com.heytap.health.settings.watch.schoolmode.SchoolModeSettingService;
import com.heytap.health.settings.watch.sporthealthsettings2.autorecognizesport.AutoRecognizeSportActivity;
import com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAndRemindSettingActivity;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.ECGSettingActivity;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.FallDownSettingActivity;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.HeartRateSettingActivity2;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.PhysicalMentalHealthGoalSettingActivity;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainUI;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated.IPPacketUpdateCheckerImpl;
import com.heytap.health.settings.watch.unbindclause.DeleteEsimServiceImplEx;
import com.heytap.health.settings.watch.unbindclause.NfcCardServiceImplEx;
import com.heytap.health.settings.watch.unpair.UnPairServiceImpl;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Group$$device_settings", "Lcom/alibaba/android/arouter/facade/template/IRouteGroup;", "()V", Consts.METHOD_LOAD_INTO, "", "atlas", "", "", "Lcom/alibaba/android/arouter/facade/model/RouteMeta;", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Group$$device_settings implements IRouteGroup {
    public static final int $stable = 0;

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(@Nullable Map<String, RouteMeta> atlas) {
        if (atlas == null) {
            return;
        }
        RouteType routeType = RouteType.PROVIDER;
        RouteMeta routeMetaBuild = RouteMeta.build(routeType, DeleteEsimServiceImplEx.class, "/device_settings/deleteesimserviceimplex", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/device_settings/DeleteEsimServiceImplEx", routeMetaBuild);
        RouteMeta routeMetaBuild2 = RouteMeta.build(routeType, DeviceSettingServiceImpl.class, "/device_settings/devicesettingserviceimpl", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild2, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/device_settings/DeviceSettingServiceImpl", routeMetaBuild2);
        RouteMeta routeMetaBuild3 = RouteMeta.build(routeType, IPPacketUpdateCheckerImpl.class, "/device_settings/ippacketupdatecheckerimpl", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild3, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/device_settings/IPPacketUpdateCheckerImpl", routeMetaBuild3);
        RouteMeta routeMetaBuild4 = RouteMeta.build(routeType, NfcCardServiceImplEx.class, "/device_settings/nfccardserviceimplex", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild4, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/device_settings/NfcCardServiceImplEx", routeMetaBuild4);
        RouteMeta routeMetaBuild5 = RouteMeta.build(routeType, OpenNotifyServiceImpl.class, "/device_settings/opennotifyservice", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild5, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/device_settings/OpenNotifyService", routeMetaBuild5);
        RouteType routeType2 = RouteType.ACTIVITY;
        RouteMeta routeMetaBuild6 = RouteMeta.build(routeType2, LawInfoActivity.class, "/device_settings/aboutwatch/law", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild6, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/device_settings/aboutwatch/law", routeMetaBuild6);
        RouteMeta routeMetaBuild7 = RouteMeta.build(routeType, BandReConnectServiceImpl.class, "/device_settings/band/bandreconnectserviceimpl", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild7, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/device_settings/band/BandReConnectServiceImpl", routeMetaBuild7);
        RouteMeta routeMetaBuild8 = RouteMeta.build(routeType, BandServiceImpl.class, "/device_settings/band/bandserviceimpl", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild8, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/device_settings/band/BandServiceImpl", routeMetaBuild8);
        RouteMeta routeMetaBuild9 = RouteMeta.build(routeType2, DeviceUpdateActivity.class, "/device_settings/band/deviceupdateactivity", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild9, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/device_settings/band/DeviceUpdateActivity", routeMetaBuild9);
        RouteMeta routeMetaBuild10 = RouteMeta.build(routeType2, MoreSettingsActivity.class, "/device_settings/band/settings", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild10, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/device_settings/band/settings", routeMetaBuild10);
        RouteMeta routeMetaBuild11 = RouteMeta.build(routeType2, BandSkillActivity.class, "/device_settings/band/settings/skill/bandskillactivity", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild11, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/device_settings/band/settings/skill/BandSkillActivity", routeMetaBuild11);
        RouteMeta routeMetaBuild12 = RouteMeta.build(routeType2, ConnectAndShareSettingActivity.class, "/device_settings/connect/connectandsharesettingactivity", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild12, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/device_settings/connect/ConnectAndShareSettingActivity", routeMetaBuild12);
        RouteMeta routeMetaBuild13 = RouteMeta.build(routeType, OperationDeviceInfoServiceImpl.class, "/device_settings/connect/operation", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild13, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/device_settings/connect/operation", routeMetaBuild13);
        RouteMeta routeMetaBuild14 = RouteMeta.build(routeType, UnPairServiceImpl.class, "/device_settings/device/unpairserviceimpl", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild14, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/device_settings/device/UnPairServiceImpl", routeMetaBuild14);
        RouteMeta routeMetaBuild15 = RouteMeta.build(routeType2, NotifySettingsActivity.class, "/device_settings/notify/notifysettingsactivity", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild15, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/device_settings/notify/NotifySettingsActivity", routeMetaBuild15);
        RouteMeta routeMetaBuild16 = RouteMeta.build(routeType, SchoolModeSettingService.class, "/device_settings/schoolmode/schoolmodesettingservice", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild16, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/device_settings/schoolmode/SchoolModeSettingService", routeMetaBuild16);
        RouteMeta routeMetaBuild17 = RouteMeta.build(routeType2, AutoRecognizeSportActivity.class, "/device_settings/sporthealth/autorecognizesportactivity", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild17, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/device_settings/sporthealth/AutoRecognizeSportActivity", routeMetaBuild17);
        RouteMeta routeMetaBuild18 = RouteMeta.build(routeType2, FallDownSettingActivity.class, "/device_settings/sporthealth/falldownsettingactivity", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild18, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/device_settings/sporthealth/FallDownSettingActivity", routeMetaBuild18);
        RouteMeta routeMetaBuild19 = RouteMeta.build(routeType2, HeartRateSettingActivity2.class, "/device_settings/sporthealth/heartratesettingactivity2", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild19, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/device_settings/sporthealth/HeartRateSettingActivity2", routeMetaBuild19);
        RouteMeta routeMetaBuild20 = RouteMeta.build(routeType2, PhysicalMentalHealthGoalSettingActivity.class, "/device_settings/sporthealth/physicalmentalhealthgoalsettingactivity", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild20, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/device_settings/sporthealth/PhysicalMentalHealthGoalSettingActivity", routeMetaBuild20);
        RouteMeta routeMetaBuild21 = RouteMeta.build(routeType2, SHSettingMainUI.class, "/device_settings/sporthealth/shsettingmainactivity", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild21, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/device_settings/sporthealth/SHSettingMainActivity", routeMetaBuild21);
        RouteMeta routeMetaBuild22 = RouteMeta.build(routeType2, ECGSettingActivity.class, "/device_settings/watch/ecgsettingactivity", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild22, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/device_settings/watch/ECGSettingActivity", routeMetaBuild22);
        RouteMeta routeMetaBuild23 = RouteMeta.build(routeType, FeaturePermissionService.class, "/device_settings/watch/featurepermissionservice", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild23, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/device_settings/watch/FeaturePermissionService", routeMetaBuild23);
        RouteMeta routeMetaBuild24 = RouteMeta.build(routeType2, IWatchCallActivity.class, "/device_settings/watch/iwatchcallactivity", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild24, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/device_settings/watch/IWatchCallActivity", routeMetaBuild24);
        RouteMeta routeMetaBuild25 = RouteMeta.build(routeType2, IWatchUnbindActivity.class, "/device_settings/watch/iwatchunbindactivity", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild25, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/device_settings/watch/IWatchUnbindActivity", routeMetaBuild25);
        RouteMeta routeMetaBuild26 = RouteMeta.build(routeType2, P2PSwitchActivity.class, "/device_settings/watch/p2pswitchactivity", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild26, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/device_settings/watch/P2PSwitchActivity", routeMetaBuild26);
        RouteMeta routeMetaBuild27 = RouteMeta.build(routeType2, SleepAndRemindSettingActivity.class, "/device_settings/watch/sleepmodelsettingactivity", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild27, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/device_settings/watch/SleepModelSettingActivity", routeMetaBuild27);
        RouteMeta routeMetaBuild28 = RouteMeta.build(routeType, QuickCenterReceiver.class, "/device_settings/watch/preferences/quickcenter", "device_settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild28, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/device_settings/watch/preferences/quickcenter", routeMetaBuild28);
    }
}
