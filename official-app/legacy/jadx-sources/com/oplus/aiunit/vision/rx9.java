package com.oplus.aiunit.vision;

import com.oplus.ocs.wearengine.bean.BatteryInfoParcelable;
import com.oplus.ocs.wearengine.bean.DeviceListParcelable;
import com.oplus.ocs.wearengine.bean.DeviceModuleParcelable;
import com.oplus.ocs.wearengine.bean.PermissionResultParcelable;
import com.oplus.ocs.wearengine.bean.SendFileInfoParcelable;
import com.oplus.ocs.wearengine.common.Status;
import com.oplus.ocs.wearengine.p2pclient.file.SendFileRequest;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H&J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH&J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0002H&J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002H&J%\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH&¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH&¢\u0006\u0004\b \u0010!J5\u0010%\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010$\u001a\u00020\u0002H&¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/rx9;", "", "", "packageName", "nodeId", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "messageEvent", "Lcom/heytap/wearable/oms/common/Status;", "sendMessage", "taskId", "filePath", "", "receiveFile", "rejectFile", "Lcom/oplus/ocs/wearengine/p2pclient/file/SendFileRequest;", "sendFileRequest", "Lcom/oplus/ocs/wearengine/bean/SendFileInfoParcelable;", "sendFile", "Lcom/oplus/ocs/wearengine/common/Status;", "cancelFile", "Lcom/oplus/ocs/wearengine/bean/BatteryInfoParcelable;", "getBatteryInfo", "Lcom/oplus/ocs/wearengine/bean/DeviceListParcelable;", "getBindDeviceList", "Lcom/oplus/ocs/wearengine/bean/DeviceModuleParcelable;", "getDeviceModule", "", "permissions", "", "isPermissionGranted", "(Ljava/lang/String;[Ljava/lang/String;)Z", "Lcom/oplus/ocs/wearengine/bean/PermissionResultParcelable;", "checkPermission", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/oplus/ocs/wearengine/bean/PermissionResultParcelable;", "", "requestId", "permissionTip", "requestPermission", "(Ljava/lang/String;I[Ljava/lang/String;Ljava/lang/String;)Lcom/oplus/ocs/wearengine/common/Status;", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public interface rx9 {
    @NotNull
    Status cancelFile(@NotNull String taskId);

    @NotNull
    PermissionResultParcelable checkPermission(@NotNull String packageName, @NotNull String[] permissions);

    @NotNull
    BatteryInfoParcelable getBatteryInfo(@NotNull String packageName);

    @NotNull
    DeviceListParcelable getBindDeviceList(@NotNull String packageName);

    @NotNull
    DeviceModuleParcelable getDeviceModule(@NotNull String packageName);

    boolean isPermissionGranted(@NotNull String packageName, @NotNull String[] permissions);

    void receiveFile(@NotNull String taskId, @Nullable String filePath);

    void rejectFile(@NotNull String taskId);

    @NotNull
    Status requestPermission(@NotNull String packageName, int requestId, @NotNull String[] permissions, @NotNull String permissionTip);

    @NotNull
    SendFileInfoParcelable sendFile(@NotNull SendFileRequest sendFileRequest);

    @NotNull
    com.heytap.wearable.oms.common.Status sendMessage(@NotNull String packageName, @NotNull String nodeId, @NotNull MessageEvent messageEvent);
}
