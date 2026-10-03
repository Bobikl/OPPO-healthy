package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import com.heytap.wearable.watch.bandclock.AlarmClockActivity;
import com.heytap.wearable.watch.clock.alarmnotify.AlarmNotifyActivity;
import com.heytap.wearable.watch.clock.alarmnotify.AlarmSwitchProvider;
import com.heytap.wearable.watch.export.ClockMessageHandler;
import com.heytap.wearable.watch.export.ClockSyncHandler;
import com.heytap.wearable.watch.findwatch.FindWatchActivity;
import com.heytap.wearable.watch.game.GameMessageHandler;
import com.heytap.wearable.watch.game.GameMessageSender;
import com.heytap.wearable.watch.game.GameModeActivity;
import com.heytap.wearable.watch.game.GameModeGuideActivity;
import com.heytap.wearable.watch.game.GameModeQuestionActivity;
import com.heytap.wearable.watch.game.GameModeUtil;
import com.heytap.weather.module.WeatherInstallHandler;
import com.heytap.weather.module.WeatherMessageHandler;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Group$$ic", "Lcom/alibaba/android/arouter/facade/template/IRouteGroup;", "()V", Consts.METHOD_LOAD_INTO, "", "atlas", "", "", "Lcom/alibaba/android/arouter/facade/model/RouteMeta;", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Group$$ic implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(@Nullable Map<String, RouteMeta> atlas) {
        if (atlas == null) {
            return;
        }
        RouteType routeType = RouteType.ACTIVITY;
        RouteMeta routeMetaBuild = RouteMeta.build(routeType, AlarmClockActivity.class, "/ic/alarmclockactivity", "ic", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/ic/AlarmClockActivity", routeMetaBuild);
        RouteMeta routeMetaBuild2 = RouteMeta.build(routeType, AlarmNotifyActivity.class, "/ic/alarmnotify", "ic", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild2, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/ic/AlarmNotify", routeMetaBuild2);
        RouteType routeType2 = RouteType.PROVIDER;
        RouteMeta routeMetaBuild3 = RouteMeta.build(routeType2, ClockMessageHandler.class, "/ic/clockmessagehandler", "ic", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild3, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/ic/ClockMessageHandler", routeMetaBuild3);
        RouteMeta routeMetaBuild4 = RouteMeta.build(routeType2, ClockSyncHandler.class, "/ic/clocksynchandler", "ic", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild4, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/ic/ClockSyncHandler", routeMetaBuild4);
        RouteMeta routeMetaBuild5 = RouteMeta.build(routeType, FindWatchActivity.class, "/ic/findwatchactivity", "ic", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild5, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/ic/FindWatchActivity", routeMetaBuild5);
        RouteMeta routeMetaBuild6 = RouteMeta.build(routeType2, GameMessageHandler.class, "/ic/gamemessagehandler", "ic", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild6, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/ic/GameMessageHandler", routeMetaBuild6);
        RouteMeta routeMetaBuild7 = RouteMeta.build(routeType2, GameMessageSender.class, "/ic/gamemessagesender", "ic", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild7, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/ic/GameMessageSender", routeMetaBuild7);
        RouteMeta routeMetaBuild8 = RouteMeta.build(routeType, GameModeGuideActivity.class, "/ic/gamemodeguideactivity", "ic", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild8, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/ic/GameModeGuideActivity", routeMetaBuild8);
        RouteMeta routeMetaBuild9 = RouteMeta.build(routeType, GameModeQuestionActivity.class, "/ic/gamemodequestionactivity", "ic", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild9, "build(RouteType.ACTIVITY…   null, -1, -2147483648)");
        atlas.put("/ic/GameModeQuestionActivity", routeMetaBuild9);
        RouteMeta routeMetaBuild10 = RouteMeta.build(routeType2, GameModeUtil.class, "/ic/gamemodeutil", "ic", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild10, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/ic/GameModeUtil", routeMetaBuild10);
        RouteMeta routeMetaBuild11 = RouteMeta.build(routeType, GameModeActivity.class, "/ic/gamemodelactivity", "ic", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild11, "build(RouteType.ACTIVITY…\", null, -1, -2147483648)");
        atlas.put("/ic/GameModelActivity", routeMetaBuild11);
        RouteMeta routeMetaBuild12 = RouteMeta.build(routeType2, AlarmSwitchProvider.class, "/ic/ialarmswitchprovider", "ic", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild12, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/ic/IAlarmSwitchProvider", routeMetaBuild12);
        RouteMeta routeMetaBuild13 = RouteMeta.build(routeType2, WeatherInstallHandler.class, "/ic/weatherinstallhandler", "ic", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild13, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/ic/WeatherInstallHandler", routeMetaBuild13);
        RouteMeta routeMetaBuild14 = RouteMeta.build(routeType2, WeatherMessageHandler.class, "/ic/weathermessagehandler", "ic", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild14, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/ic/WeatherMessageHandler", routeMetaBuild14);
    }
}
