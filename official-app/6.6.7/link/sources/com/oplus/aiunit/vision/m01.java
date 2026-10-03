package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import java.util.UUID;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public abstract class m01 extends sa5 {
    public static final UUID t = UUID.fromString("db764ac8-4b08-7f25-aafe-59d03c27bae3");
    public static final UUID u = UUID.fromString("db764ac8-4b08-7f25-aafe-59d03c27bae4");
    public kp9 s;

    public class a implements kp9 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.kp9
        public void a(j01 j01Var, BluetoothDevice bluetoothDevice) {
            m01.this.B(j01Var, bluetoothDevice);
        }

        @Override // com.oplus.aiunit.vision.kp9
        public void b(j01 j01Var, int i) {
            m01.this.C(j01Var, i);
        }
    }

    public m01(Context context, ModuleInfo moduleInfo) {
        super(context, moduleInfo);
        this.s = new a();
    }

    public abstract void B(j01 j01Var, BluetoothDevice bluetoothDevice);

    public abstract void C(j01 j01Var, int i);
}
