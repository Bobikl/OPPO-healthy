package com.alibaba.android.arouter.routes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.heytap.health.family.detail.ECGFamilyRecordsActivity;
import com.heytap.health.family.detail.FamilyDetailDataActivity;
import com.heytap.health.family.detail.WarningListActivity;
import com.heytap.health.family.more.FamilyModeInfoActivity;
import com.heytap.health.family.qrcode.FamilyQRCodeActivity;
import com.heytap.health.family.qrcode.QRCodeScanActivity;
import com.heytap.health.family.qrcode.QrcodeSettingActivity;
import com.heytap.health.family.service.FamilyHealthServiceImpl;
import com.heytap.health.family.setting.EditFamilyInfoActivity;
import com.heytap.health.family.setting.FamilyBeforeSendInvitationActivity;
import com.heytap.health.family.setting.FamilyFinishInvitationActivity;
import com.heytap.health.family.setting.FamilyHealthSettingActivity;
import com.heytap.health.family.setting.FamilySendInvitationActivity;
import com.heytap.health.family.setting.FamilySettingActivity;
import com.heytap.health.family.setting.FamilyShareSettingActivity;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Group$$family", "Lcom/alibaba/android/arouter/facade/template/IRouteGroup;", "()V", Consts.METHOD_LOAD_INTO, "", "atlas", "", "", "Lcom/alibaba/android/arouter/facade/model/RouteMeta;", "family_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Group$$family implements IRouteGroup {
    public static final int $stable = 0;

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(@Nullable Map<String, RouteMeta> atlas) {
        if (atlas == null) {
            return;
        }
        RouteType routeType = RouteType.ACTIVITY;
        RouteMeta routeMetaBuild = RouteMeta.build(routeType, ECGFamilyRecordsActivity.class, "/family/ecglist", "family", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/family/EcgList", routeMetaBuild);
        RouteMeta routeMetaBuild2 = RouteMeta.build(routeType, EditFamilyInfoActivity.class, "/family/editfamilyinfoactivity", "family", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild2, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/family/EditFamilyInfoActivity", routeMetaBuild2);
        RouteMeta routeMetaBuild3 = RouteMeta.build(routeType, FamilyBeforeSendInvitationActivity.class, "/family/familybeforesendinvitationactivity", "family", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild3, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/family/FamilyBeforeSendInvitationActivity", routeMetaBuild3);
        RouteMeta routeMetaBuild4 = RouteMeta.build(routeType, FamilyFinishInvitationActivity.class, "/family/familyfinishinvitationactivity", "family", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild4, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/family/FamilyFinishInvitationActivity", routeMetaBuild4);
        RouteMeta routeMetaBuild5 = RouteMeta.build(RouteType.PROVIDER, FamilyHealthServiceImpl.class, "/family/familyhealthservice", "family", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild5, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/family/FamilyHealthService", routeMetaBuild5);
        RouteMeta routeMetaBuild6 = RouteMeta.build(routeType, FamilyHealthSettingActivity.class, "/family/familyhealthsetting2", "family", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild6, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/family/FamilyHealthSetting2", routeMetaBuild6);
        RouteMeta routeMetaBuild7 = RouteMeta.build(routeType, FamilyDetailDataActivity.class, "/family/familymemberdetaildataactivity", "family", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild7, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/family/FamilyMemberDetailDataActivity", routeMetaBuild7);
        RouteMeta routeMetaBuild8 = RouteMeta.build(routeType, FamilyModeInfoActivity.class, "/family/familymodeinfoactivity", "family", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild8, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/family/FamilyModeInfoActivity", routeMetaBuild8);
        RouteMeta routeMetaBuild9 = RouteMeta.build(routeType, FamilyQRCodeActivity.class, "/family/familyqrcodeactivity", "family", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild9, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/family/FamilyQRCodeActivity", routeMetaBuild9);
        RouteMeta routeMetaBuild10 = RouteMeta.build(routeType, FamilySendInvitationActivity.class, "/family/familysendinvitationactivity", "family", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild10, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/family/FamilySendInvitationActivity", routeMetaBuild10);
        RouteMeta routeMetaBuild11 = RouteMeta.build(routeType, FamilySettingActivity.class, "/family/familysettingactivity", "family", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild11, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/family/FamilySettingActivity", routeMetaBuild11);
        RouteMeta routeMetaBuild12 = RouteMeta.build(routeType, FamilyShareSettingActivity.class, "/family/familysharesettingactivity", "family", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild12, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/family/FamilyShareSettingActivity", routeMetaBuild12);
        RouteMeta routeMetaBuild13 = RouteMeta.build(routeType, QRCodeScanActivity.class, "/family/qrcodescanactivity", "family", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild13, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/family/QRCodeScanActivity", routeMetaBuild13);
        RouteMeta routeMetaBuild14 = RouteMeta.build(routeType, QrcodeSettingActivity.class, "/family/qrcodesettingactivity", "family", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild14, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/family/QrcodeSettingActivity", routeMetaBuild14);
        RouteMeta routeMetaBuild15 = RouteMeta.build(routeType, WarningListActivity.class, "/family/warninglistactivity", "family", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild15, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/family/WarningListActivity", routeMetaBuild15);
    }
}
