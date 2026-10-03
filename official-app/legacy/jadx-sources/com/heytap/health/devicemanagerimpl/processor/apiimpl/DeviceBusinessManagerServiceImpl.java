package com.heytap.health.devicemanagerimpl.processor.apiimpl;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.devicemanager.api.IDeviceBusinessManagerService;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.aiunit.vision.hb5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Route(path = "/devicemanager/IDeviceBusinessManagerService")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Lcom/heytap/health/devicemanagerimpl/processor/apiimpl/DeviceBusinessManagerServiceImpl;", "Lcom/heytap/health/devicemanager/api/IDeviceBusinessManagerService;", "Landroid/content/Context;", "context", "", "init", "", EngineConstant.REASON, "", "fromCache", "y3", "<init>", "()V", "device_manager_impl_release"}, k = 1, mv = {1, 8, 0})
public final class DeviceBusinessManagerServiceImpl implements IDeviceBusinessManagerService {
    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }

    @Override // com.heytap.health.devicemanager.api.IDeviceBusinessManagerService
    public void y3(@NotNull String reason, boolean fromCache) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        hb5.INSTANCE.g(reason, fromCache);
    }
}
