package com.heytap.nearx.tangramconfig.kit.client;

import com.heytap.nearx.tangramconfig.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/heytap/nearx/tangramconfig/kit/client/MspKitConstants;", "", "()V", "BRIDGE_CALLBACK_SUCCESS", "", "KIT_MODE", "KIT_SERVICE_ACTION", "", "SDK_MODE", "TARGET_SERVICE_CLASS", "TARGET_SERVICE_MODULE_CLASS", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MspKitConstants {
    public static final int BRIDGE_CALLBACK_SUCCESS = 0;

    @NotNull
    public static final MspKitConstants INSTANCE = new MspKitConstants();
    public static final int KIT_MODE = 1;

    @NotNull
    public static final String KIT_SERVICE_ACTION = "com.heytap.htms.action.CLOUD_CTRL_SERVICE";
    public static final int SDK_MODE = 0;

    @NotNull
    public static final String TARGET_SERVICE_CLASS = "com.heytap.msp.cloudctrl.ipc.CloudCtrlService";

    @NotNull
    public static final String TARGET_SERVICE_MODULE_CLASS = "com.heytap.msp.cloudctrl.ipc.CloudCtrlServiceModule";

    private MspKitConstants() {
    }
}
