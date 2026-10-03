package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.heytap.health.wallet.bus.impl.BusOperaterServiceImp;
import com.heytap.health.wallet.bus.ui.activities.BusCityListActivity;
import com.heytap.health.wallet.bus.ui.activities.BusDeleteSuccessActivity;
import com.heytap.health.wallet.bus.ui.activities.BusDeleteZFBAuthActivity;
import com.heytap.health.wallet.bus.ui.activities.BusDetailActivity;
import com.heytap.health.wallet.bus.ui.activities.BusRefundBackupChannelActivity;
import com.heytap.health.wallet.bus.ui.activities.BusSearchCityActivity;
import com.heytap.health.wallet.bus.ui.activities.MigrateInPendingActivity;
import com.heytap.health.wallet.bus.ui.activities.MigrateOutGuideActivity;
import com.heytap.health.wallet.bus.ui.activities.NfcOpenCardActivity;
import com.heytap.health.wallet.bus.ui.activities.NfcOpenWaittingActivity;
import com.heytap.health.wallet.bus.ui.activities.NfcTransactionRecordActivity;
import com.heytap.health.wallet.bus.ui.activities.TransitBatchMigrateInActivity;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import com.oplus.deepthinker.sdk.app.userprofile.labels.CommuteWayLabel;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Group$$bus", "Lcom/alibaba/android/arouter/facade/template/IRouteGroup;", "()V", Consts.METHOD_LOAD_INTO, "", "atlas", "", "", "Lcom/alibaba/android/arouter/facade/model/RouteMeta;", "bus_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Group$$bus implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(@Nullable Map<String, RouteMeta> atlas) {
        if (atlas == null) {
            return;
        }
        RouteType routeType = RouteType.ACTIVITY;
        RouteMeta routeMetaBuild = RouteMeta.build(routeType, TransitBatchMigrateInActivity.class, "/bus/batchmigrate/in", CommuteWayLabel.BUS_TAG, MapsKt__MapsKt.mutableMapOf(TuplesKt.to("voucherExtra", 8), TuplesKt.to("cardType", 1), TuplesKt.to("select_phone", 8), TuplesKt.to("select_card_list", 11)), -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild, "build(RouteType.ACTIVITY…o 11, ), -1, -2147483648)");
        atlas.put("/bus/batchMigrate/In", routeMetaBuild);
        RouteMeta routeMetaBuild2 = RouteMeta.build(routeType, BusRefundBackupChannelActivity.class, "/bus/carddelete/refund/backup", CommuteWayLabel.BUS_TAG, MapsKt__MapsKt.mutableMapOf(TuplesKt.to("webUrl", 8), TuplesKt.to("booleanKey", 0), TuplesKt.to("channel", 8)), -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild2, "build(RouteType.ACTIVITY…to 8, ), -1, -2147483648)");
        atlas.put("/bus/carddelete/refund/backup", routeMetaBuild2);
        RouteMeta routeMetaBuild3 = RouteMeta.build(routeType, BusCityListActivity.class, "/bus/choosecard", CommuteWayLabel.BUS_TAG, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild3, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/bus/chooseCard", routeMetaBuild3);
        RouteMeta routeMetaBuild4 = RouteMeta.build(routeType, BusSearchCityActivity.class, "/bus/citysearch", CommuteWayLabel.BUS_TAG, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild4, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/bus/citySearch", routeMetaBuild4);
        RouteMeta routeMetaBuild5 = RouteMeta.build(routeType, BusDeleteSuccessActivity.class, "/bus/delete/success", CommuteWayLabel.BUS_TAG, MapsKt__MapsKt.mutableMapOf(TuplesKt.to("appCode", 8)), -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild5, "build(RouteType.ACTIVITY…to 8, ), -1, -2147483648)");
        atlas.put("/bus/delete/Success", routeMetaBuild5);
        RouteMeta routeMetaBuild6 = RouteMeta.build(routeType, BusDeleteZFBAuthActivity.class, "/bus/delete/authzfb", CommuteWayLabel.BUS_TAG, MapsKt__MapsKt.mutableMapOf(TuplesKt.to("booleanKey", 0), TuplesKt.to("appCode", 8)), -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild6, "build(RouteType.ACTIVITY…to 8, ), -1, -2147483648)");
        atlas.put("/bus/delete/authZFB", routeMetaBuild6);
        RouteMeta routeMetaBuild7 = RouteMeta.build(routeType, NfcOpenCardActivity.class, "/bus/issue", CommuteWayLabel.BUS_TAG, MapsKt__MapsKt.mutableMapOf(TuplesKt.to("appCode", 8)), -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild7, "build(RouteType.ACTIVITY…to 8, ), -1, -2147483648)");
        atlas.put("/bus/issue", routeMetaBuild7);
        RouteMeta routeMetaBuild8 = RouteMeta.build(routeType, MigrateInPendingActivity.class, "/bus/migrateinpending", CommuteWayLabel.BUS_TAG, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild8, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/bus/migrateInPending", routeMetaBuild8);
        RouteMeta routeMetaBuild9 = RouteMeta.build(routeType, MigrateOutGuideActivity.class, "/bus/migrateoutguide", CommuteWayLabel.BUS_TAG, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild9, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/bus/migrateOutGuide", routeMetaBuild9);
        RouteMeta routeMetaBuild10 = RouteMeta.build(routeType, NfcOpenWaittingActivity.class, "/bus/openwait", CommuteWayLabel.BUS_TAG, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild10, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/bus/openWait", routeMetaBuild10);
        RouteMeta routeMetaBuild11 = RouteMeta.build(routeType, BusDetailActivity.class, "/bus/recharge", CommuteWayLabel.BUS_TAG, MapsKt__MapsKt.mutableMapOf(TuplesKt.to("appCode", 8)), -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild11, "build(RouteType.ACTIVITY…to 8, ), -1, -2147483648)");
        atlas.put("/bus/recharge", routeMetaBuild11);
        RouteMeta routeMetaBuild12 = RouteMeta.build(RouteType.PROVIDER, BusOperaterServiceImp.class, "/bus/traffic/operateservice", CommuteWayLabel.BUS_TAG, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild12, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/bus/traffic/operateService", routeMetaBuild12);
        RouteMeta routeMetaBuild13 = RouteMeta.build(routeType, NfcTransactionRecordActivity.class, "/bus/transrecord", CommuteWayLabel.BUS_TAG, MapsKt__MapsKt.mutableMapOf(TuplesKt.to("tab", 8), TuplesKt.to("appCode", 8), TuplesKt.to("aid", 8)), -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild13, "build(RouteType.ACTIVITY…to 8, ), -1, -2147483648)");
        atlas.put("/bus/transRecord", routeMetaBuild13);
    }
}
