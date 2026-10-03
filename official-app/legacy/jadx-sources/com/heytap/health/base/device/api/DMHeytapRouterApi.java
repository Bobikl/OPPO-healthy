package com.heytap.health.base.device.api;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.oplus.aiunit.vision.sj5;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/heytap/health/base/device/api/DMHeytapRouterApi;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "Lcom/oplus/aiunit/vision/sj5;", "callback", "", "u", "Companion", "a", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public interface DMHeytapRouterApi extends IProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String DEVICE_MANAGER_API = "/dmheytap/DBAccountDeviceProcessorApi";

    /* JADX INFO: renamed from: com.heytap.health.base.device.api.DMHeytapRouterApi$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/heytap/health/base/device/api/DMHeytapRouterApi$a;", "", "", "DEVICE_MANAGER_API", "Ljava/lang/String;", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @NotNull
        public static final String DEVICE_MANAGER_API = "/dmheytap/DBAccountDeviceProcessorApi";
        public static final /* synthetic */ Companion a = new Companion();
    }

    void u(@NotNull sj5 callback);
}
