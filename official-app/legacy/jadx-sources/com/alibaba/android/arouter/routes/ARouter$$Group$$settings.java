package com.alibaba.android.arouter.routes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.heytap.health.settings.me.datapermission.DataPermissionManagerActivity;
import com.heytap.health.settings.me.datapermission.ThirdAuthWebViewActivity;
import com.heytap.health.settings.me.export.UserExpSettingServiceImpl;
import com.heytap.health.settings.me.export.UserInfoServiceImpl;
import com.heytap.health.settings.me.healthrecords.HealthRecordsServiceImpl;
import com.heytap.health.settings.me.healthrecords.PersonalInfoServiceImpl;
import com.heytap.health.settings.me.healthrecords.PersonalProfileActivity;
import com.heytap.health.settings.me.personalinfo.PersonalInfoSyncServiceImpl;
import com.heytap.health.settings.me.privacycenter.PrivacyProtectedCenter;
import com.heytap.health.settings.me.setting.AgreementActivity;
import com.heytap.health.settings.me.setting.ChildStatementActivity;
import com.heytap.health.settings.me.setting.NetWorkOfficeWebViewActivity;
import com.heytap.health.settings.me.setting.PersonalizedServiceImpl;
import com.heytap.health.settings.me.setting.PrivacyDataSettingActivity;
import com.heytap.health.settings.me.setting.PrivacyStatementActivity;
import com.heytap.health.settings.me.settings2.PersonalInformationDetailsPage;
import com.heytap.health.settings.me.settings2.PrivacyProtectionCenterActivity;
import com.heytap.health.settings.me.settings2.permission.FeaturePermissionDataServiceImpl;
import com.heytap.health.settings.me.settings2.permission.FeaturePermissionDetailActivity;
import com.heytap.health.settings.me.sportpermission.SportPermissionActivity;
import com.heytap.health.settings.me.thirdpartbinding.alipaybinding.AlipayBindingActivity;
import com.heytap.health.settings.me.thirdpartbinding.model.ThirdBindingServiceImpl;
import com.heytap.health.settings.me.thirdpartbinding.wechat.MMStepSyncServiceImpl;
import com.heytap.health.settings.me.thirdpartbinding.wechat.MMStepSyncSetActivity;
import com.heytap.health.settings.me.upgrade.AppUpgradeServiceImpl;
import com.heytap.health.settings.me.upgrade.SpaceUpgradeActivity;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Group$$settings", "Lcom/alibaba/android/arouter/facade/template/IRouteGroup;", "()V", Consts.METHOD_LOAD_INTO, "", "atlas", "", "", "Lcom/alibaba/android/arouter/facade/model/RouteMeta;", "settings_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Group$$settings implements IRouteGroup {
    public static final int $stable = 0;

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(@Nullable Map<String, RouteMeta> atlas) {
        if (atlas == null) {
            return;
        }
        RouteType routeType = RouteType.ACTIVITY;
        RouteMeta routeMetaBuild = RouteMeta.build(routeType, AgreementActivity.class, "/settings/agreementactivity", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/settings/AgreementActivity", routeMetaBuild);
        RouteMeta routeMetaBuild2 = RouteMeta.build(routeType, ChildStatementActivity.class, "/settings/childstatementactivity", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild2, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/settings/ChildStatementActivity", routeMetaBuild2);
        RouteMeta routeMetaBuild3 = RouteMeta.build(routeType, DataPermissionManagerActivity.class, "/settings/datapermissionmanageractivity", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild3, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/settings/DataPermissionManagerActivity", routeMetaBuild3);
        RouteMeta routeMetaBuild4 = RouteMeta.build(routeType, FeaturePermissionDetailActivity.class, "/settings/featurepermissiondetailactivity", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild4, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/settings/FeaturePermissionDetailActivity", routeMetaBuild4);
        RouteType routeType2 = RouteType.PROVIDER;
        RouteMeta routeMetaBuild5 = RouteMeta.build(routeType2, FeaturePermissionDataServiceImpl.class, "/settings/ifeaturepermissiondataservice", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild5, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/settings/IFeaturePermissionDataService", routeMetaBuild5);
        RouteMeta routeMetaBuild6 = RouteMeta.build(routeType2, HealthRecordsServiceImpl.class, "/settings/ihealthrecordsservice", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild6, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/settings/IHealthRecordsService", routeMetaBuild6);
        RouteMeta routeMetaBuild7 = RouteMeta.build(routeType2, PersonalInfoSyncServiceImpl.class, "/settings/ipersonalinfosyncservice", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild7, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/settings/IPersonalInfoSyncService", routeMetaBuild7);
        RouteMeta routeMetaBuild8 = RouteMeta.build(routeType, NetWorkOfficeWebViewActivity.class, "/settings/networkofficewebviewactivity", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild8, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/settings/NetWorkOfficeWebViewActivity", routeMetaBuild8);
        RouteMeta routeMetaBuild9 = RouteMeta.build(routeType2, PersonalInfoServiceImpl.class, "/settings/personalprofiledialogservice", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild9, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/settings/PersonalProfileDialogService", routeMetaBuild9);
        RouteMeta routeMetaBuild10 = RouteMeta.build(routeType2, PersonalizedServiceImpl.class, "/settings/personalizedservice", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild10, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/settings/PersonalizedService", routeMetaBuild10);
        RouteMeta routeMetaBuild11 = RouteMeta.build(routeType, PrivacyDataSettingActivity.class, "/settings/privacydatasettingactivity", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild11, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/settings/PrivacyDataSettingActivity", routeMetaBuild11);
        RouteMeta routeMetaBuild12 = RouteMeta.build(routeType, PrivacyProtectedCenter.class, "/settings/privacyprotectedcenter", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild12, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/settings/PrivacyProtectedCenter", routeMetaBuild12);
        RouteMeta routeMetaBuild13 = RouteMeta.build(routeType, PrivacyProtectionCenterActivity.class, "/settings/privacyprotectioncenteractivity", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild13, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/settings/PrivacyProtectionCenterActivity", routeMetaBuild13);
        RouteMeta routeMetaBuild14 = RouteMeta.build(routeType, PrivacyStatementActivity.class, "/settings/privacystatementactivity", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild14, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/settings/PrivacyStatementActivity", routeMetaBuild14);
        RouteMeta routeMetaBuild15 = RouteMeta.build(routeType, PersonalInformationDetailsPage.class, "/settings/settingactivity", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild15, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/settings/SettingActivity", routeMetaBuild15);
        RouteMeta routeMetaBuild16 = RouteMeta.build(routeType, SportPermissionActivity.class, "/settings/sportpermissionactivity", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild16, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/settings/SportPermissionActivity", routeMetaBuild16);
        RouteMeta routeMetaBuild17 = RouteMeta.build(routeType, ThirdAuthWebViewActivity.class, "/settings/thirdauthwebviewactivity", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild17, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/settings/ThirdAuthWebViewActivity", routeMetaBuild17);
        RouteMeta routeMetaBuild18 = RouteMeta.build(routeType2, UserExpSettingServiceImpl.class, "/settings/userexpsettingservice", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild18, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/settings/UserExpSettingService", routeMetaBuild18);
        RouteMeta routeMetaBuild19 = RouteMeta.build(routeType2, UserInfoServiceImpl.class, "/settings/userinfoserviceimpl", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild19, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/settings/UserInfoServiceImpl", routeMetaBuild19);
        RouteMeta routeMetaBuild20 = RouteMeta.build(routeType2, AppUpgradeServiceImpl.class, "/settings/appupgrade", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild20, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/settings/appUpgrade", routeMetaBuild20);
        RouteMeta routeMetaBuild21 = RouteMeta.build(routeType, AlipayBindingActivity.class, "/settings/me/alipaybindingactivity", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild21, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/settings/me/AlipayBindingActivity", routeMetaBuild21);
        RouteMeta routeMetaBuild22 = RouteMeta.build(routeType, MMStepSyncSetActivity.class, "/settings/me/mmstepsyncsetactivity", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild22, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/settings/me/MMStepSyncSetActivity", routeMetaBuild22);
        RouteMeta routeMetaBuild23 = RouteMeta.build(routeType, PersonalProfileActivity.class, "/settings/me/personalprofileactivity", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild23, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/settings/me/PersonalProfileActivity", routeMetaBuild23);
        RouteMeta routeMetaBuild24 = RouteMeta.build(routeType, SpaceUpgradeActivity.class, "/settings/me/spaceupgradeactivity", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild24, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/settings/me/SpaceUpgradeActivity", routeMetaBuild24);
        RouteMeta routeMetaBuild25 = RouteMeta.build(routeType2, MMStepSyncServiceImpl.class, "/settings/me/thirdpartbinding/wechat", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild25, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/settings/me/thirdpartbinding/wechat", routeMetaBuild25);
        RouteMeta routeMetaBuild26 = RouteMeta.build(routeType2, ThirdBindingServiceImpl.class, "/settings/third", "settings", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild26, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/settings/third", routeMetaBuild26);
    }
}
