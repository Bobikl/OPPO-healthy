package com.heytap.health.telecom;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.ArraySet;
import com.heytap.health.devicemanager.util.BluetoothUtil;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.auc;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.eqj;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.iqj;
import com.oplus.aiunit.vision.l9d;
import com.oplus.aiunit.vision.of5;
import com.oplus.aiunit.vision.ra5;
import com.oplus.aiunit.vision.rdf;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.vda;
import com.oplus.aiunit.vision.wl4;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import com.oplus.wearable.linkservice.sdk.Node;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J \u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\tH\u0002J \u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J(\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/heytap/health/telecom/PhoneTelecomManager;", "Lcom/oplus/aiunit/vision/wl4$b;", "Landroid/util/ArraySet;", "Lcom/oplus/aiunit/vision/auc;", "interests", "Lcom/oplus/aiunit/vision/ra5;", "getInterestingStatus", "Lcom/oplus/aiunit/vision/ra5$c;", "role", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "nodeStatus", "", "onNodeStatusChanged", "b", "c", "Landroid/content/Context;", "context", "", DeviceInfoCompat.DeviceState.CONNECTED, "", "macAddress", "d", "action", MapSchema.FIELD_NAME_ENTRY, "f", "Landroid/content/IntentFilter;", "i", "Landroid/content/IntentFilter;", "mHFIntentFilter", "Landroid/content/BroadcastReceiver;", "j", "Landroid/content/BroadcastReceiver;", "mBFReceiver", "<init>", "()V", "telecom_impl_release"}, k = 1, mv = {1, 8, 0})
public final class PhoneTelecomManager implements wl4.b {

    @NotNull
    public static final PhoneTelecomManager INSTANCE = new PhoneTelecomManager();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final IntentFilter mHFIntentFilter = new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final BroadcastReceiver mBFReceiver = new BroadcastReceiver() { // from class: com.heytap.health.telecom.PhoneTelecomManager$mBFReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @Nullable Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (intent == null || !Intrinsics.areEqual("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED", intent.getAction())) {
                return;
            }
            int iF = vda.f(intent, "android.bluetooth.profile.extra.STATE", 0);
            BluetoothDevice bluetoothDevice = (BluetoothDevice) vda.h(intent, "android.bluetooth.device.extra.DEVICE");
            StringBuilder sb = new StringBuilder();
            sb.append("mBFReceiver.onReceive() called with: state = [");
            sb.append(iF);
            sb.append("], device = [");
            sb.append(bluetoothDevice);
            sb.append("]");
            String currentConnectId = gl4.managerApi.getCurrentConnectId();
            if (iF == 0) {
                if (currentConnectId == null || bluetoothDevice == null) {
                    a7b.b("TelHealth.PhoneTelecomManager", "mBFReceiver.onReceive: STATE_DISCONNECTED failed!!");
                    return;
                } else {
                    if (Intrinsics.areEqual(currentConnectId, bluetoothDevice.getAddress())) {
                        PhoneTelecomManager phoneTelecomManager = PhoneTelecomManager.INSTANCE;
                        Context contextA = b78.a();
                        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
                        phoneTelecomManager.d(contextA, false, currentConnectId);
                        return;
                    }
                    return;
                }
            }
            if (iF != 2) {
                return;
            }
            if (currentConnectId == null || bluetoothDevice == null) {
                a7b.b("TelHealth.PhoneTelecomManager", "mBFReceiver.onReceive: STATE_CONNECTED failed!!");
            } else if (Intrinsics.areEqual(currentConnectId, bluetoothDevice.getAddress())) {
                PhoneTelecomManager phoneTelecomManager2 = PhoneTelecomManager.INSTANCE;
                Context contextA2 = b78.a();
                Intrinsics.checkNotNullExpressionValue(contextA2, "getAppContext()");
                phoneTelecomManager2.d(contextA2, true, currentConnectId);
            }
        }
    };

    public final void b(Node node) {
        int i = BluetoothUtil.INSTANCE.i(1);
        if (!eqj.a(gl4.managerApi.getCurrentConnectId()).X3() || i == 2) {
            Context contextA = b78.a();
            Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
            String nodeId = node.getNodeId();
            Intrinsics.checkNotNullExpressionValue(nodeId, "node.nodeId");
            d(contextA, true, nodeId);
        }
        rdf.a(b78.a(), mBFReceiver, mHFIntentFilter, 2);
        Context contextA2 = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA2, "getAppContext()");
        String nodeId2 = node.getNodeId();
        Intrinsics.checkNotNullExpressionValue(nodeId2, "node.nodeId");
        f(contextA2, nodeId2);
    }

    public final void c(Node node) {
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        String nodeId = node.getNodeId();
        Intrinsics.checkNotNullExpressionValue(nodeId, "node.nodeId");
        d(contextA, false, nodeId);
        try {
            b78.a().unregisterReceiver(mBFReceiver);
            a7b.f("TelHealth.PhoneTelecomManager", "onDisconnect.unregisterReceiver:");
        } catch (Exception e2) {
            a7b.f("TelHealth.PhoneTelecomManager", "onDisconnect: unregisterReceiver:" + e2.getMessage());
        }
    }

    public final void d(Context context, boolean connected, String macAddress) {
        a7b.f("TelHealth.PhoneTelecomManager", "onWearableConnectChange() called with: context = [" + context + "], connected = [" + connected + "]");
        e(context, "coloros.intent.action.health.DEVICE_CONNECTION_STATE_CHANGED", connected, macAddress);
        e(context, iqj.BROADCAST_ACTION_CONNECTION_CHANGE, connected, macAddress);
        if (connected) {
            PhoneTelecomUtils.INSTANCE.m();
        } else {
            PhoneTelecomUtils phoneTelecomUtils = PhoneTelecomUtils.INSTANCE;
            phoneTelecomUtils.s();
            phoneTelecomUtils.n(context);
        }
        if (connected) {
            TelecomOnceApiProvider.INSTANCE.c(gl4.managerApi.isStubModule());
            PhoneTelecomUtils.INSTANCE.i(context);
        }
    }

    public final void e(Context context, String action, boolean connected, String macAddress) {
        Intent intent = new Intent(action);
        intent.setPackage(iqj.CLIENT_PACKAGE);
        intent.putExtra(iqj.CONNECT_STATUS, connected ? 1 : 0);
        intent.putExtra("connect_type", 1);
        intent.putExtra(iqj.CONNECT_MAC_ADDRESS, macAddress);
        context.sendBroadcast(intent, ilj.z() ? AbsCallInterceptionHandlerKt.OPLUS_COMPONENT_SAFE : "oppo.permission.OPPO_COMPONENT_SAFE");
    }

    public final void f(Context context, String macAddress) {
        if (!eqj.a(macAddress).P5()) {
            a7b.f("TelHealth.PhoneTelecomManager", "sendPhoneAudioListInquire() The watch does not support audio switching");
            return;
        }
        PhoneTelecomUtils phoneTelecomUtils = PhoneTelecomUtils.INSTANCE;
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        phoneTelecomUtils.q(contextA);
        Bundle bundle = new Bundle();
        bundle.putInt(of5.ARG_EVENT_ID, 108);
        a7b.f("TelHealth.PhoneTelecomManager", "sendPhoneAudioListInquire()");
        Intent intent = new Intent(context, (Class<?>) PhoneTelecomService.class);
        intent.putExtra(PhoneTelecomUtils.EXTRA_DATA_BUNDLE, bundle);
        context.startService(intent);
    }

    @Override // com.oplus.aiunit.vision.wl4.b
    @NotNull
    public ra5 getInterestingStatus(@NotNull ArraySet<auc> interests) {
        Intrinsics.checkNotNullParameter(interests, "interests");
        interests.add(auc.f.INSTANCE);
        interests.add(auc.a.INSTANCE);
        interests.add(auc.k.INSTANCE);
        return ra5.a.INSTANCE;
    }

    @Override // com.oplus.aiunit.vision.wl4.b
    public void onNodeStatusChanged(@NotNull ra5.c role, @NotNull Node node, @NotNull auc nodeStatus) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(nodeStatus, "nodeStatus");
        if (Intrinsics.areEqual(role, gl4.managerApi.n())) {
            if (nodeStatus == auc.f.INSTANCE) {
                c(node);
                return;
            }
            if (nodeStatus == auc.a.INSTANCE) {
                b(node);
            } else if (nodeStatus == auc.k.INSTANCE) {
                PhoneTelecomUtils phoneTelecomUtils = PhoneTelecomUtils.INSTANCE;
                String nodeId = node.getNodeId();
                Intrinsics.checkNotNullExpressionValue(nodeId, "node.nodeId");
                v9g.x(phoneTelecomUtils.e(nodeId)).k();
            }
        }
    }
}
