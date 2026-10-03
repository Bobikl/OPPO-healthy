package com.heytap.health.base.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.oplus.aiunit.vision.a7b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u001a\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/base/bluetooth/OplusBTCloseBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "state", "", "getState", "()I", "setState", "(I)V", "onRealReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "onReceive", "reCheckBluetoothState", "key", "", "lib_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class OplusBTCloseBroadcastReceiver extends BroadcastReceiver {
    private int state = BluetoothAdapter.getDefaultAdapter().getState();

    private final int reCheckBluetoothState(Intent intent, String key) {
        int intExtra = intent.getIntExtra(key, 10);
        if (10 != intExtra && 13 != intExtra && 11 != intExtra) {
            return intExtra;
        }
        int state = BluetoothAdapter.getDefaultAdapter().getState();
        if (state != intExtra) {
            a7b.f("OplusBTCloseBroadcastReceiver", "current is half close, bluetooth is open for health " + state);
        }
        return state;
    }

    public final int getState() {
        return this.state;
    }

    public abstract void onRealReceive(@NotNull Context context, @Nullable Intent intent);

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @Nullable Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (intent != null) {
            if (!Intrinsics.areEqual(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
                onRealReceive(context, intent);
                return;
            }
            int iReCheckBluetoothState = reCheckBluetoothState(intent, "android.bluetooth.adapter.extra.STATE");
            intent.putExtra("android.bluetooth.profile.extra.STATE", iReCheckBluetoothState);
            intent.putExtra("android.bluetooth.adapter.extra.STATE", iReCheckBluetoothState);
            if (this.state == iReCheckBluetoothState) {
                return;
            }
            this.state = iReCheckBluetoothState;
            onRealReceive(context, intent);
        }
    }

    public final void setState(int i) {
        this.state = i;
    }
}
