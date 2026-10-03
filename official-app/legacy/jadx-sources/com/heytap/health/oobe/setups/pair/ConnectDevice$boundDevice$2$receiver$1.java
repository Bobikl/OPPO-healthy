package com.heytap.health.oobe.setups.pair;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.rdf;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/heytap/health/oobe/setups/pair/ConnectDevice$boundDevice$2$receiver$1", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ConnectDevice$boundDevice$2$receiver$1 extends BroadcastReceiver {
    public final /* synthetic */ ConnectDevice a;
    public final /* synthetic */ BluetoothDevice b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<Boolean> f5130c;

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual(intent.getAction(), "android.bluetooth.device.action.BOND_STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1);
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            String address = bluetoothDevice != null ? bluetoothDevice.getAddress() : null;
            if (address == null) {
                address = "null";
            }
            this.a.c("BroadcastReceiver ->onReceive-> " + (bluetoothDevice != null ? bluetoothDevice.getName() : null) + " => newState:" + intExtra);
            if (Intrinsics.areEqual(address, this.b.getAddress())) {
                if (intExtra == 10) {
                    rdf.c(b78.a(), this);
                    CancellableContinuation<Boolean> cancellableContinuation = this.f5130c;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(new IllegalStateException("user cancel bond"))));
                    return;
                }
                if (intExtra != 12) {
                    return;
                }
                rdf.c(b78.a(), this);
                CancellableContinuation<Boolean> cancellableContinuation2 = this.f5130c;
                Result.Companion companion2 = Result.INSTANCE;
                cancellableContinuation2.resumeWith(Result.m5287constructorimpl(Boolean.TRUE));
            }
        }
    }
}
