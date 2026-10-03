package com.alibaba.android.arouter.routes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.heytap.health.wallet.autoswitch.CombinationCardActivity;
import com.heytap.health.wallet.impl.WatchCardsUpdateServiceImpl;
import com.heytap.health.wallet.nfc.ui.CardPackageActivity;
import com.heytap.health.wallet.nfc.ui.NfcRepairActivity;
import com.heytap.health.wallet.nfc.ui.WalletSettingActivity;
import com.heytap.health.wallet.web.FixedToolbarWebActivity;
import com.heytap.health.wallet.web.FullScreenWebActivity;
import com.heytap.health.wallet.web.NormalToolbarWebActivity;
import com.heytap.health.wallet.web.ProWebActivity;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Group$$main", "Lcom/alibaba/android/arouter/facade/template/IRouteGroup;", "()V", Consts.METHOD_LOAD_INTO, "", "atlas", "", "", "Lcom/alibaba/android/arouter/facade/model/RouteMeta;", "walletmain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Group$$main implements IRouteGroup {
    public static final int $stable = 0;

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(@Nullable Map<String, RouteMeta> atlas) {
        if (atlas == null) {
            return;
        }
        RouteType routeType = RouteType.ACTIVITY;
        RouteMeta routeMetaBuild = RouteMeta.build(routeType, FixedToolbarWebActivity.class, "/main/fixedtoolbarscreenweb", "main", MapsKt__MapsKt.mutableMapOf(TuplesKt.to("webUrl", 8), TuplesKt.to("webTitle", 8)), -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild, "build(RouteType.ACTIVITY…to 8, ), -1, -2147483648)");
        atlas.put("/main/FixedToolbarScreenWeb", routeMetaBuild);
        RouteMeta routeMetaBuild2 = RouteMeta.build(routeType, FullScreenWebActivity.class, "/main/fullscreenweb", "main", MapsKt__MapsKt.mutableMapOf(TuplesKt.to("webUrl", 8)), -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild2, "build(RouteType.ACTIVITY…   8, ), -1, -2147483648)");
        atlas.put("/main/FullScreenWeb", routeMetaBuild2);
        RouteMeta routeMetaBuild3 = RouteMeta.build(routeType, NormalToolbarWebActivity.class, "/main/toolbarscreenweb", "main", MapsKt__MapsKt.mutableMapOf(TuplesKt.to("webUrl", 8), TuplesKt.to("webTitle", 8)), -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild3, "build(RouteType.ACTIVITY…to 8, ), -1, -2147483648)");
        atlas.put("/main/ToolbarScreenWeb", routeMetaBuild3);
        RouteMeta routeMetaBuild4 = RouteMeta.build(routeType, NfcRepairActivity.class, "/main/autorepair", "main", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild4, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/main/autoRepair", routeMetaBuild4);
        RouteMeta routeMetaBuild5 = RouteMeta.build(routeType, CardPackageActivity.class, "/main/cardpackagelist", "main", MapsKt__MapsKt.mutableMapOf(TuplesKt.to("currentMac", 8), TuplesKt.to("isConnected", 0)), -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild5, "build(RouteType.ACTIVITY…to 0, ), -1, -2147483648)");
        atlas.put("/main/cardPackageList", routeMetaBuild5);
        RouteMeta routeMetaBuild6 = RouteMeta.build(routeType, CombinationCardActivity.class, "/main/combinationcard/main", "main", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild6, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/main/combinationCard/main", routeMetaBuild6);
        RouteMeta routeMetaBuild7 = RouteMeta.build(routeType, WalletSettingActivity.class, "/main/mine", "main", MapsKt__MapsKt.mutableMapOf(TuplesKt.to("from", 8)), -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild7, "build(RouteType.ACTIVITY…to 8, ), -1, -2147483648)");
        atlas.put("/main/mine", routeMetaBuild7);
        RouteMeta routeMetaBuild8 = RouteMeta.build(RouteType.PROVIDER, WatchCardsUpdateServiceImpl.class, "/main/watchcardsupdate", "main", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild8, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/main/watchCardsUpdate", routeMetaBuild8);
        RouteMeta routeMetaBuild9 = RouteMeta.build(routeType, ProWebActivity.class, "/main/web", "main", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild9, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/main/web", routeMetaBuild9);
    }
}
