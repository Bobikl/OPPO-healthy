package com.heytap.health.devicemanagerimpl.processor.apiimpl;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.devicemanager.api.IAutoReportDeviceInfoService;
import com.heytap.health.devicemanagerimpl.processor.AutoReportDeviceInfoManager;
import com.oplus.aiunit.vision.d93;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Route(path = "/devicemanager/IAutoReportDeviceInfoService")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/devicemanagerimpl/processor/apiimpl/AutoReportDeviceInfoServiceImpl;", "Lcom/heytap/health/devicemanager/api/IAutoReportDeviceInfoService;", "Landroid/content/Context;", "context", "", "init", "Lcom/oplus/aiunit/vision/d93;", "event", "z", "", ClickApiEntity.TIME, "g7", "<init>", "()V", "device_manager_impl_release"}, k = 1, mv = {1, 8, 0})
public final class AutoReportDeviceInfoServiceImpl implements IAutoReportDeviceInfoService {
    @Override // com.heytap.health.devicemanager.api.IAutoReportDeviceInfoService
    public void g7(long time) {
        AutoReportDeviceInfoManager.INSTANCE.l(time);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }

    @Override // com.heytap.health.devicemanager.api.IAutoReportDeviceInfoService
    public void z(@NotNull d93 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        AutoReportDeviceInfoManager.INSTANCE.n(event);
    }
}
