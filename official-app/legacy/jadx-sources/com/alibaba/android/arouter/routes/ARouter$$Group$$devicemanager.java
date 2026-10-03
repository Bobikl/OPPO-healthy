package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.heytap.health.devicemanager.api.DMLocalDeviceManagerApi;
import com.heytap.health.devicemanager.api.ICloudDeviceProcessorService;
import com.heytap.health.devicemanagerimpl.processor.apiimpl.AccountDeviceRequestServiceImpl;
import com.heytap.health.devicemanagerimpl.processor.apiimpl.AutoReportDeviceInfoServiceImpl;
import com.heytap.health.devicemanagerimpl.processor.apiimpl.CloudDeviceProcessorServiceImpl;
import com.heytap.health.devicemanagerimpl.processor.apiimpl.DMLocalDeviceManagerImpl;
import com.heytap.health.devicemanagerimpl.processor.apiimpl.DeviceBusinessManagerServiceImpl;
import com.heytap.health.devicemanagerimpl.processor.apiimpl.DeviceVersionUtilServiceImpl;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Group$$devicemanager", "Lcom/alibaba/android/arouter/facade/template/IRouteGroup;", "()V", Consts.METHOD_LOAD_INTO, "", "atlas", "", "", "Lcom/alibaba/android/arouter/facade/model/RouteMeta;", "device_manager_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Group$$devicemanager implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(@Nullable Map<String, RouteMeta> atlas) {
        if (atlas == null) {
            return;
        }
        RouteType routeType = RouteType.PROVIDER;
        RouteMeta routeMetaBuild = RouteMeta.build(routeType, DMLocalDeviceManagerImpl.class, "/devicemanager/dmlocaldevicemanagerapi", "devicemanager", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put(DMLocalDeviceManagerApi.SERVICE_DB_DEVICE, routeMetaBuild);
        RouteMeta routeMetaBuild2 = RouteMeta.build(routeType, AccountDeviceRequestServiceImpl.class, "/devicemanager/iaccountdevicerequestservice", "devicemanager", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild2, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/devicemanager/IAccountDeviceRequestService", routeMetaBuild2);
        RouteMeta routeMetaBuild3 = RouteMeta.build(routeType, AutoReportDeviceInfoServiceImpl.class, "/devicemanager/iautoreportdeviceinfoservice", "devicemanager", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild3, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/devicemanager/IAutoReportDeviceInfoService", routeMetaBuild3);
        RouteMeta routeMetaBuild4 = RouteMeta.build(routeType, CloudDeviceProcessorServiceImpl.class, "/devicemanager/iclouddeviceprocessorservice", "devicemanager", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild4, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put(ICloudDeviceProcessorService.SERVICE_PATH, routeMetaBuild4);
        RouteMeta routeMetaBuild5 = RouteMeta.build(routeType, DeviceBusinessManagerServiceImpl.class, "/devicemanager/idevicebusinessmanagerservice", "devicemanager", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild5, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/devicemanager/IDeviceBusinessManagerService", routeMetaBuild5);
        RouteMeta routeMetaBuild6 = RouteMeta.build(routeType, DeviceVersionUtilServiceImpl.class, "/devicemanager/ideviceversionutilservice", "devicemanager", null, -1, Integer.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(routeMetaBuild6, "build(RouteType.PROVIDER…\", null, -1, -2147483648)");
        atlas.put("/devicemanager/IDeviceVersionUtilService", routeMetaBuild6);
    }
}
