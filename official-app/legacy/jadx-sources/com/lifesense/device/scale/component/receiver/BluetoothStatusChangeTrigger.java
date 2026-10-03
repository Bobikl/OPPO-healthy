package com.lifesense.device.scale.component.receiver;

import android.content.Context;
import android.content.Intent;
import com.lifesense.android.bluetooth.core.LsBleManager;
import com.lifesense.device.scale.component.service.DeviceKeepAliveService;
import com.lifesense.device.scale.context.LDAppHolder;
import com.lifesense.device.scale.utils.c;

/* JADX INFO: loaded from: classes4.dex */
public class BluetoothStatusChangeTrigger {
    public LsBleManager bleManager = LsBleManager.getInstance();
    public boolean isRegisted = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.c();
            if (BluetoothStatusChangeTrigger.this.bleManager.isSupportLowEnergy()) {
                Context context = LDAppHolder.getContext();
                try {
                    try {
                        context.stopService(new Intent(context, (Class<?>) DeviceKeepAliveService.class));
                        context.startService(new Intent(context, (Class<?>) DeviceKeepAliveService.class));
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    context.startService(new Intent(context, (Class<?>) DeviceKeepAliveService.class));
                }
            }
        }
    }

    public static class b {
        public static BluetoothStatusChangeTrigger a = new BluetoothStatusChangeTrigger();

        public static BluetoothStatusChangeTrigger a() {
            return a;
        }
    }

    public static BluetoothStatusChangeTrigger getInstance() {
        return b.a();
    }

    public boolean isRegisted() {
        return this.isRegisted;
    }

    public void startBluetoothBroadcastReceiver() {
        this.isRegisted = true;
        com.lifesense.device.scale.utils.task.a.a(new a());
    }

    public void stopBluetoothBroadcastReceiver() {
        this.isRegisted = false;
        this.bleManager.unregisterBluetoothBroadcastReceiver();
    }
}
