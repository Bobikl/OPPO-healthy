package com.heytap.health.devicemanager.api;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.speech.engine.constant.EngineConstant;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lcom/heytap/health/devicemanager/api/IDeviceBusinessManagerService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "", EngineConstant.REASON, "", "fromCache", "", "y3", "Companion", "a", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public interface IDeviceBusinessManagerService extends IProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String SERVICE_PATH = "/devicemanager/IDeviceBusinessManagerService";

    /* JADX INFO: renamed from: com.heytap.health.devicemanager.api.IDeviceBusinessManagerService$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/heytap/health/devicemanager/api/IDeviceBusinessManagerService$a;", "", "", "SERVICE_PATH", "Ljava/lang/String;", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @NotNull
        public static final String SERVICE_PATH = "/devicemanager/IDeviceBusinessManagerService";
        public static final /* synthetic */ Companion a = new Companion();
    }

    void y3(@NotNull String reason, boolean fromCache);
}
