package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/sq7;", "", "", "mac", "", "nodeConnectionType", "", "b", "cod", "a", "TAG", "Ljava/lang/String;", "<init>", "()V", "oafhost_release"}, k = 1, mv = {1, 8, 0})
public final class sq7 {

    @NotNull
    public static final sq7 INSTANCE = new sq7();

    @NotNull
    public static final String TAG = "FixWatchCod";

    @SuppressLint({"MissingPermission", "PrivateApi"})
    public final void a(@NotNull String mac, int cod) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        try {
            BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(mac);
            int iHashCode = remoteDevice.getBluetoothClass().hashCode();
            if (iHashCode != cod) {
                Class<?> cls = Class.forName("android.bluetooth.OplusBluetoothDevice");
                cls.getMethod("setBluetoothDeviceCod", Integer.TYPE).invoke(cls.getConstructor(BluetoothDevice.class).newInstance(remoteDevice), Integer.valueOf(cod));
                wil.d(TAG, "tryFixWatchIcon setBluetoothDeviceCod success, from " + iHashCode);
            }
        } catch (Exception e2) {
            wil.b(TAG, "fixCod error: " + e2.getMessage());
        }
    }

    public final void b(@NotNull String mac, int nodeConnectionType) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        try {
            int iL = ilj.l();
            if (iL < 34) {
                wil.a(TAG, "tryFixWatchIcon ignore because system not support ,os is " + iL);
            }
            switch (nodeConnectionType) {
                case 2:
                case 4:
                case 5:
                case 6:
                    a(mac, 7997188);
                    break;
                case 3:
                case 7:
                    a(mac, 7997189);
                    break;
                default:
                    wil.a(TAG, "tryFixWatchIcon ignore because device is not support");
                    break;
            }
        } catch (Exception e2) {
            wil.b(TAG, "tryFixWatchIcon error: " + e2.getMessage());
        }
    }
}
