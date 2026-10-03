package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public abstract class yz0 extends x95 {
    public static final UUID t = UUID.fromString("db764ac8-4b08-7f25-aafe-59d03c27bae3");
    public static final UUID u = UUID.fromString("db764ac8-4b08-7f25-aafe-59d03c27bae4");
    public eo9 s;

    public class a implements eo9 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.eo9
        public void a(vz0 vz0Var, BluetoothDevice bluetoothDevice) {
            yz0.this.B(vz0Var, bluetoothDevice);
        }

        @Override // com.oplus.aiunit.vision.eo9
        public void b(vz0 vz0Var, int i) {
            yz0.this.C(vz0Var, i);
        }
    }

    public yz0(Context context, ModuleInfo moduleInfo) {
        super(context, moduleInfo);
        this.s = new a();
    }

    public abstract void B(vz0 vz0Var, BluetoothDevice bluetoothDevice);

    public abstract void C(vz0 vz0Var, int i);
}
