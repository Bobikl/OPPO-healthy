package com.heytap.health.devicemanager.util;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import com.heytap.health.connect.rawapi.NodeApi;
import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.oplus.aiunit.vision.auc;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.bck;
import com.oplus.aiunit.vision.buc;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.u89;
import com.oplus.wearable.linkservice.sdk.Node;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J%\u0010\n\u001a\u00020\u00052\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u00020\u00052\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\u000bJ\"\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0007J\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\bR\u0014\u0010\u001a\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/heytap/health/devicemanager/util/DeviceManagerUtils;", "", "", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "deviceList", "", "a", "", "", "models", b2n.f, "([Ljava/lang/String;)Z", "f", "Landroid/bluetooth/BluetoothDevice;", "device", "", "scanRecord", "isBle", "", MapSchema.FIELD_NAME_ENTRY, "deviceType", "c", "mac", "model", "", "b", "TAG", "Ljava/lang/String;", "[Ljava/lang/String;", "d", "()[Ljava/lang/String;", "RX281MODELS_CN", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeviceManagerUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceManagerUtils.kt\ncom/heytap/health/devicemanager/util/DeviceManagerUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,167:1\n1855#2,2:168\n*S KotlinDebug\n*F\n+ 1 DeviceManagerUtils.kt\ncom/heytap/health/devicemanager/util/DeviceManagerUtils\n*L\n39#1:168,2\n*E\n"})
public final class DeviceManagerUtils {

    @NotNull
    public static final String TAG = "DeviceManagerAbilityImpl";

    @NotNull
    public static final DeviceManagerUtils INSTANCE = new DeviceManagerUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String[] RX281MODELS_CN = {"W301CN", "W301CN-Demo", "W501CN", "W501CN-Demo"};

    public final boolean a(@NotNull List<? extends UserDeviceInfo> deviceList) {
        Intrinsics.checkNotNullParameter(deviceList, "deviceList");
        while (true) {
            boolean z = false;
            for (UserDeviceInfo userDeviceInfo : deviceList) {
                if (z || userDeviceInfo.isCurrTerminal()) {
                    z = true;
                }
            }
            return z;
        }
    }

    public final void b(@Nullable String mac, @Nullable String model) {
        Node nodeA = buc.a(model, mac, "");
        if (nodeA != null) {
            if (!TextUtils.isEmpty(model)) {
                nodeA.setModel(model);
            }
            ml4.d(TAG, "unBond node:" + nodeA);
            NodeApi nodeApi = u89.NodeApi;
            nodeApi.disconnectNode(nodeA, "deleteDeviceInPhone");
            nodeApi.b("unBond", nodeA, auc.k.INSTANCE);
        } else {
            ml4.c(TAG, "deleteDeviceInPhone not find node " + model);
        }
        BluetoothUtil.INSTANCE.h(mac);
    }

    @NotNull
    public final List<List<String>> c(int deviceType) {
        for (Map.Entry<Integer, List<List<String>>> entry : DeviceConstants.INSTANCE.y().entrySet()) {
            if (entry.getKey().intValue() == deviceType) {
                return entry.getValue();
            }
        }
        return new ArrayList();
    }

    @NotNull
    public final String[] d() {
        return RX281MODELS_CN;
    }

    @SuppressLint({"MissingPermission"})
    public final int e(@NotNull BluetoothDevice device, @Nullable final byte[] scanRecord, final boolean isBle) {
        Intrinsics.checkNotNullParameter(device, "device");
        return ((Number) lc5.a(device.getName()).a(new Function1<DeviceModel, Integer>() { // from class: com.heytap.health.devicemanager.util.DeviceManagerUtils$getSupportDeviceType$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Integer invoke(@NotNull DeviceModel applyMode) {
                Intrinsics.checkNotNullParameter(applyMode, "$this$applyMode");
                int iS9 = applyMode.s9(isBle);
                if (isBle && iS9 == -1 && bck.c(scanRecord)) {
                    iS9 = 6;
                }
                return Integer.valueOf(iS9);
            }
        })).intValue();
    }

    public final boolean f(@NotNull String... models) {
        Intrinsics.checkNotNullParameter(models, "models");
        List<UserDeviceInfo> boundDeviceInfos = gl4.managerApi.getBoundDeviceInfos();
        Iterator<UserDeviceInfo> it = boundDeviceInfos.iterator();
        while (it.hasNext()) {
            if (!CollectionsKt__CollectionsKt.listOf(Arrays.copyOf(models, models.length)).contains(it.next().getModel())) {
                return false;
            }
        }
        boolean z = !boundDeviceInfos.isEmpty();
        StringBuilder sb = new StringBuilder();
        sb.append("hasModelBoundOnly: ");
        sb.append(z);
        return z;
    }

    public final boolean g(@NotNull String... models) {
        Intrinsics.checkNotNullParameter(models, "models");
        Iterator<UserDeviceInfo> it = gl4.managerApi.getBoundDeviceInfos().iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            UserDeviceInfo next = it.next();
            if (UserDeviceInfo.isConnected(next.getConnectionState())) {
                for (String str : models) {
                    if (TextUtils.equals(next.getModel(), str)) {
                        return true;
                    }
                }
            }
        }
    }
}
