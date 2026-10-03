package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.heytap.device.data.DataSyncServiceImpl;
import com.heytap.device.data.DeviceAccountServiceImpl;
import com.heytap.device.data.DeviceWearingStatusImpl;
import com.heytap.device.sleep.DoNotDisturbServiceImpl;
import com.heytap.device.sleep.SleepDataServiceImpl;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import com.heytap.wsport.DeviceSportServiceImpl;
import com.heytap.wsport.DispatchMessage;
import com.heytap.wsport.WsportServiceImpl;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Group$$device_data_sync", "Lcom/alibaba/android/arouter/facade/template/IRouteGroup;", "()V", Consts.METHOD_LOAD_INTO, "", "atlas", "", "", "Lcom/alibaba/android/arouter/facade/model/RouteMeta;", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Group$$device_data_sync implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(@Nullable Map<String, RouteMeta> atlas) {
        if (atlas == null) {
            return;
        }
        RouteType routeType = RouteType.PROVIDER;
        RouteMeta routeMetaBuild = RouteMeta.build(routeType, DeviceAccountServiceImpl.class, "/device_data_sync/deviceaccountserviceimpl", "device_data_sync", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/device_data_sync/DeviceAccountServiceImpl", routeMetaBuild);
        RouteMeta routeMetaBuild2 = RouteMeta.build(routeType, DeviceSportServiceImpl.class, "/device_data_sync/devicesportserviceimpl", "device_data_sync", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild2, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/device_data_sync/DeviceSportServiceImpl", routeMetaBuild2);
        RouteMeta routeMetaBuild3 = RouteMeta.build(routeType, DoNotDisturbServiceImpl.class, "/device_data_sync/donotdisturbserviceimpl", "device_data_sync", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild3, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/device_data_sync/DoNotDisturbServiceImpl", routeMetaBuild3);
        RouteMeta routeMetaBuild4 = RouteMeta.build(routeType, WsportServiceImpl.class, "/device_data_sync/iwsportservice", "device_data_sync", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild4, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/device_data_sync/IWsportService", routeMetaBuild4);
        RouteMeta routeMetaBuild5 = RouteMeta.build(routeType, DispatchMessage.class, "/device_data_sync/messagedispatch", "device_data_sync", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild5, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/device_data_sync/MessageDispatch", routeMetaBuild5);
        RouteMeta routeMetaBuild6 = RouteMeta.build(routeType, SleepDataServiceImpl.class, "/device_data_sync/sleepdataserviceimpl", "device_data_sync", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild6, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/device_data_sync/SleepDataServiceImpl", routeMetaBuild6);
        RouteMeta routeMetaBuild7 = RouteMeta.build(routeType, DeviceWearingStatusImpl.class, "/device_data_sync/data_sync/devicewearstatusservice", "device_data_sync", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild7, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/device_data_sync/data_sync/DeviceWearStatusService", routeMetaBuild7);
        RouteMeta routeMetaBuild8 = RouteMeta.build(routeType, DataSyncServiceImpl.class, "/device_data_sync/sporthealth/datasyncserviceimpl", "device_data_sync", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild8, "build(RouteType.PROVIDER…   null, -1, -2147483648)");
        atlas.put("/device_data_sync/sporthealth/DataSyncServiceImpl", routeMetaBuild8);
    }
}
