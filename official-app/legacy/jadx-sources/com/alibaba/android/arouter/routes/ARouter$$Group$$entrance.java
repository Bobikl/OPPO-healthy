package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.heytap.health.wallet.carkey.view.KeyCarBrandListActivity;
import com.heytap.health.wallet.entrance.ui.activities.AccessCardEntryActivity;
import com.heytap.health.wallet.entrance.ui.activities.AddWhiteCardActivity;
import com.heytap.health.wallet.entrance.ui.activities.CardBoundListActivity;
import com.heytap.health.wallet.entrance.ui.activities.CardDetailActivity;
import com.heytap.health.wallet.entrance.ui.activities.CardThemeActivity;
import com.heytap.health.wallet.entrance.ui.activities.DoorIdentifyActivity;
import com.heytap.health.wallet.entrance.ui.activities.EntranceActiveActivity;
import com.heytap.health.wallet.entrance.ui.activities.EntranceTunningParamActivity;
import com.heytap.health.wallet.entrance.ui.activities.EntranceTunningResultActivity;
import com.heytap.health.wallet.entrance.ui.activities.FindOutMoreActivity;
import com.heytap.health.wallet.entrance.ui.activities.IdentiCardActivity;
import com.heytap.health.wallet.entrance.ui.activities.OpenSucActivity;
import com.heytap.health.wallet.entrance.ui.activities.OtherDeviceCardManageActivity;
import com.heytap.health.wallet.entrance.ui.activities.OtherDeviceDoorListActivity;
import com.heytap.health.wallet.entrance.ui.activities.UseTipsActivity;
import com.heytap.health.wallet.entrance.ui.activities.WriteDataToCardActivity;
import com.heytap.health.wallet.entrance.util.EntranceOperateUtils;
import com.heytap.speech.engine.EngineConfig;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import com.oplus.seedling.sdk.statistics.StatisticsTrackUtil;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Group$$entrance", "Lcom/alibaba/android/arouter/facade/template/IRouteGroup;", "()V", Consts.METHOD_LOAD_INTO, "", "atlas", "", "", "Lcom/alibaba/android/arouter/facade/model/RouteMeta;", "entrance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Group$$entrance implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(@Nullable Map<String, RouteMeta> atlas) {
        if (atlas == null) {
            return;
        }
        RouteType routeType = RouteType.ACTIVITY;
        RouteMeta routeMetaBuild = RouteMeta.build(routeType, EntranceActiveActivity.class, "/entrance/active", StatisticsTrackUtil.KEY_ENTRANCE, MapsKt__MapsKt.mutableMapOf(TuplesKt.to("KEY_APP_CODE", 8), TuplesKt.to("KEY_CARD_AID", 8), TuplesKt.to("KEY_ACTION", 8), TuplesKt.to("CARD_TYPE", 8)), -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild, "build(RouteType.ACTIVITY…      ), -1, -2147483648)");
        atlas.put("/entrance/active", routeMetaBuild);
        RouteMeta routeMetaBuild2 = RouteMeta.build(routeType, AddWhiteCardActivity.class, "/entrance/addwhitecard", StatisticsTrackUtil.KEY_ENTRANCE, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild2, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/entrance/addWhiteCard", routeMetaBuild2);
        RouteMeta routeMetaBuild3 = RouteMeta.build(routeType, CardBoundListActivity.class, "/entrance/bound/list", StatisticsTrackUtil.KEY_ENTRANCE, MapsKt__MapsKt.mutableMapOf(TuplesKt.to("KEY_CARD_LIST", 9)), -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild3, "build(RouteType.ACTIVITY…to 9, ), -1, -2147483648)");
        atlas.put("/entrance/bound/list", routeMetaBuild3);
        RouteMeta routeMetaBuild4 = RouteMeta.build(routeType, KeyCarBrandListActivity.class, "/entrance/carbrandlist", StatisticsTrackUtil.KEY_ENTRANCE, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild4, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/entrance/carBrandList", routeMetaBuild4);
        RouteMeta routeMetaBuild5 = RouteMeta.build(routeType, CardDetailActivity.class, "/entrance/detail", StatisticsTrackUtil.KEY_ENTRANCE, MapsKt__MapsKt.mutableMapOf(TuplesKt.to("KEY_APP_CODE", 8), TuplesKt.to("KEY_CARD_AID", 8), TuplesKt.to("KEY_ACTION", 8), TuplesKt.to("KEY_CAR_ID", 8), TuplesKt.to("CARD_TYPE", 8), TuplesKt.to("nfcCardStatus", 8), TuplesKt.to("iccoaKeyId", 8), TuplesKt.to("from", 8)), -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild5, "build(RouteType.ACTIVITY…to 8, ), -1, -2147483648)");
        atlas.put("/entrance/detail", routeMetaBuild5);
        RouteMeta routeMetaBuild6 = RouteMeta.build(routeType, OpenSucActivity.class, "/entrance/entranceopensuc", StatisticsTrackUtil.KEY_ENTRANCE, MapsKt__MapsKt.mutableMapOf(TuplesKt.to("cardImg", 8), TuplesKt.to("CARD_NAME", 8), TuplesKt.to("CARD_TYPE", 8), TuplesKt.to("appCode", 8), TuplesKt.to("aid", 8)), -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild6, "build(RouteType.ACTIVITY…to 8, ), -1, -2147483648)");
        atlas.put("/entrance/entranceOpenSuc", routeMetaBuild6);
        RouteMeta routeMetaBuild7 = RouteMeta.build(routeType, FindOutMoreActivity.class, "/entrance/findoutmore", StatisticsTrackUtil.KEY_ENTRANCE, MapsKt__MapsKt.mutableMapOf(TuplesKt.to("appCode", 8), TuplesKt.to("USER_RIGHT", 8), TuplesKt.to("TYPE", 8), TuplesKt.to("url", 8)), -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild7, "build(RouteType.ACTIVITY…to 8, ), -1, -2147483648)");
        atlas.put("/entrance/findOutMore", routeMetaBuild7);
        RouteMeta routeMetaBuild8 = RouteMeta.build(routeType, AccessCardEntryActivity.class, "/entrance/index", StatisticsTrackUtil.KEY_ENTRANCE, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild8, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/entrance/index", routeMetaBuild8);
        RouteMeta routeMetaBuild9 = RouteMeta.build(RouteType.PROVIDER, EntranceOperateUtils.class, "/entrance/operateservice", StatisticsTrackUtil.KEY_ENTRANCE, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild9, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/entrance/operateService", routeMetaBuild9);
        RouteMeta routeMetaBuild10 = RouteMeta.build(routeType, OtherDeviceCardManageActivity.class, "/entrance/otherdevicecardmanage", StatisticsTrackUtil.KEY_ENTRANCE, MapsKt__MapsKt.mutableMapOf(TuplesKt.to("KEY_DATA_SOURCE", 8)), -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild10, "build(RouteType.ACTIVITY…to 8, ), -1, -2147483648)");
        atlas.put("/entrance/otherDeviceCardManage", routeMetaBuild10);
        RouteMeta routeMetaBuild11 = RouteMeta.build(routeType, OtherDeviceDoorListActivity.class, "/entrance/otherdevicedoorlist", StatisticsTrackUtil.KEY_ENTRANCE, MapsKt__MapsKt.mutableMapOf(TuplesKt.to("KEY_DATA_SOURCE", 8), TuplesKt.to("USER_RIGHT", 8), TuplesKt.to("url", 8)), -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild11, "build(RouteType.ACTIVITY…to 8, ), -1, -2147483648)");
        atlas.put("/entrance/otherDeviceDoorList", routeMetaBuild11);
        RouteMeta routeMetaBuild12 = RouteMeta.build(routeType, IdentiCardActivity.class, "/entrance/suckcard", StatisticsTrackUtil.KEY_ENTRANCE, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild12, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/entrance/suckCard", routeMetaBuild12);
        RouteMeta routeMetaBuild13 = RouteMeta.build(routeType, DoorIdentifyActivity.class, "/entrance/suckcardenc", StatisticsTrackUtil.KEY_ENTRANCE, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild13, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/entrance/suckCardEnc", routeMetaBuild13);
        RouteMeta routeMetaBuild14 = RouteMeta.build(routeType, CardThemeActivity.class, "/entrance/theme", StatisticsTrackUtil.KEY_ENTRANCE, MapsKt__MapsKt.mutableMapOf(TuplesKt.to("CARD_NAME", 8), TuplesKt.to(EngineConfig.K_SOURCE, 3), TuplesKt.to("CARD_TYPE", 8), TuplesKt.to("appCode", 8), TuplesKt.to("aid", 8)), -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild14, "build(RouteType.ACTIVITY…to 8, ), -1, -2147483648)");
        atlas.put("/entrance/theme", routeMetaBuild14);
        RouteMeta routeMetaBuild15 = RouteMeta.build(routeType, EntranceTunningParamActivity.class, "/entrance/tunningparam", StatisticsTrackUtil.KEY_ENTRANCE, MapsKt__MapsKt.mutableMapOf(TuplesKt.to("cardName", 8), TuplesKt.to("appCode", 8), TuplesKt.to("aid", 8)), -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild15, "build(RouteType.ACTIVITY…to 8, ), -1, -2147483648)");
        atlas.put("/entrance/tunningParam", routeMetaBuild15);
        RouteMeta routeMetaBuild16 = RouteMeta.build(routeType, EntranceTunningResultActivity.class, "/entrance/tunningparamresult", StatisticsTrackUtil.KEY_ENTRANCE, MapsKt__MapsKt.mutableMapOf(TuplesKt.to("from", 8), TuplesKt.to("appCode", 8), TuplesKt.to("TYPE", 3)), -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild16, "build(RouteType.ACTIVITY…to 3, ), -1, -2147483648)");
        atlas.put("/entrance/tunningParamResult", routeMetaBuild16);
        RouteMeta routeMetaBuild17 = RouteMeta.build(routeType, UseTipsActivity.class, "/entrance/usetips", StatisticsTrackUtil.KEY_ENTRANCE, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild17, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/entrance/useTips", routeMetaBuild17);
        RouteMeta routeMetaBuild18 = RouteMeta.build(routeType, WriteDataToCardActivity.class, "/entrance/writedata", StatisticsTrackUtil.KEY_ENTRANCE, null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild18, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/entrance/writeData", routeMetaBuild18);
    }
}
