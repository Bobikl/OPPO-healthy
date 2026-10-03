package com.omron;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.NonNull;
import com.omron.lib.common.OMRONBLECallbackBase;
import com.omron.lib.common.OMRONBLEErrMsg;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes5.dex */
public abstract class as {
    public static final String s = "b";
    protected BluetoothDevice a;
    protected Context b;
    protected g d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected BluetoothGatt f8819e;
    protected h g;
    public br h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f8818c = f.UNREGISTED;
    protected ap f = ap.STATE_DISCONNECTED;
    public boolean i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8820j = false;
    private boolean k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Timer f8821l = null;
    private Timer m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Timer f8822n = null;
    private int o = 1;
    private int p = 1;
    private final BroadcastReceiver q = new a();
    private final BluetoothGattCallback r = new b();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice == null) {
                ay.a(as.s, "mBondingBroadcastReceiver device == null");
                return;
            }
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1);
            int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", -1);
            String str = as.s;
            ay.a(str, bluetoothDevice.getName() + "Bond state changed for: " + bluetoothDevice.getAddress() + " new state: " + intExtra + " previous: " + intExtra2);
            if (as.this.f8819e == null) {
                ay.a(str, "mBondingBroadcastReceiver mBluetoothGatt == null");
                return;
            }
            if (bluetoothDevice.getAddress().equals(as.this.f8819e.getDevice().getAddress())) {
                if (intExtra == 11) {
                    ay.a(str, "BluetoothDevice.BOND_BONDING");
                    return;
                }
                if (intExtra != 12) {
                    if (intExtra == 10) {
                        ay.a(str, "BluetoothDevice.BOND_NONE");
                        as asVar = as.this;
                        if (asVar.f8820j) {
                            return;
                        }
                        asVar.g();
                        as asVar2 = as.this;
                        asVar2.a(asVar2.d);
                        return;
                    }
                    return;
                }
                ay.a(str, "BluetoothDevice.BOND_BONDED");
                if (as.this.m != null) {
                    as.this.a(1);
                }
                if (as.this.k) {
                    as.this.k = false;
                    as.this.d();
                    as.this.a();
                    if (as.this.f8822n != null) {
                        as.this.b(1);
                    }
                }
            }
        }
    }

    public class b extends BluetoothGattCallback {
        public b() {
        }

        private void a() {
            if (as.this.f8821l != null) {
                as.this.c(2);
            }
            if (as.this.m != null) {
                as.this.a(3);
            }
            if (as.this.f8822n != null) {
                as.this.b(3);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            as.this.a(bluetoothGatt, bluetoothGattCharacteristic);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            as.this.a(bluetoothGatt, bluetoothGattCharacteristic, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            as.this.b(bluetoothGatt, bluetoothGattCharacteristic, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            as asVar;
            ay.a("onConnectionStateChange调用了：status:" + i + "newState:" + i2);
            if (as.this.m != null) {
                as.this.a(2);
            }
            if (i != 0) {
                as asVar2 = as.this;
                g gVar = asVar2.d;
                if (gVar != null && !asVar2.i) {
                    gVar.onFailure(OMRONBLEErrMsg.OMRON_BLE_ERROR_DEVICE_CAN_NOT_CONNECT);
                }
                ay.c(as.s, "onConnectionStateChange error " + i);
                a();
                asVar = as.this;
                if (asVar.f8820j) {
                    return;
                }
            } else {
                if (i2 == 2) {
                    ay.a(as.s, "onConnectionStateChange BluetoothProfile.STATE_CONNECTED");
                    if (as.this.k || as.this.f8820j) {
                        if (bluetoothGatt.getDevice().getBondState() == 12) {
                            try {
                                Thread.sleep(1500L);
                            } catch (InterruptedException e2) {
                                e2.printStackTrace();
                            }
                            String str = as.s;
                            ay.a(str, "onConnectionStateChange BluetoothDevice.BOND_BONDED");
                            as.this.k = false;
                            bluetoothGatt.discoverServices();
                            as.this.a();
                            ay.a(str, "onConnectionStateChange gatt.discoverServices()");
                        } else {
                            as.this.e();
                        }
                    }
                    ay.a(as.s, "血糖仪:ConnectGattCallback    gatt.discoverServices()", new Object[0]);
                    return;
                }
                if (i2 != 0) {
                    return;
                }
                as asVar3 = as.this;
                ap apVar = ap.STATE_DISCONNECTED;
                asVar3.f = apVar;
                g gVar2 = asVar3.d;
                if (gVar2 != null) {
                    gVar2.a(apVar);
                }
                ay.a("onConnectionStateChange BluetoothProfile.STATE_DISCONNECTED");
                as asVar4 = as.this;
                g gVar3 = asVar4.d;
                if (gVar3 != null && !asVar4.i) {
                    gVar3.onFailure(OMRONBLEErrMsg.OMRON_BLE_ERROR_DEVICE_BOND_STATE_ERROR);
                }
                a();
                asVar = as.this;
                if (asVar.f8820j) {
                    return;
                }
            }
            asVar.g();
            as asVar5 = as.this;
            asVar5.a(asVar5.d);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            as.this.a(bluetoothGatt, bluetoothGattDescriptor, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            if (as.this.f8821l != null) {
                as.this.c(4);
            }
            as.this.a(bluetoothGatt, i);
        }
    }

    public class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (as.this.f8821l != null) {
                if (as.this.o == 3) {
                    ay.a("没有收到服务，OMRON_SDK_ConnectFail。", new Object[0]);
                    as.this.d.onFailure(OMRONBLEErrMsg.OMRON_SDK_ConnectFail);
                    as asVar = as.this;
                    asVar.a(asVar.d);
                    as.this.c(3);
                } else {
                    BluetoothGatt bluetoothGatt = as.this.f8819e;
                    if (bluetoothGatt != null) {
                        bluetoothGatt.discoverServices();
                    }
                    ay.a(as.s, "timer:" + as.this.o, new Object[0]);
                }
                as.k(as.this);
            }
        }
    }

    public class d extends TimerTask {
        public d() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (as.this.m != null && as.this.p == 2) {
                as.this.a(4);
                as.this.d.onFailure(OMRONBLEErrMsg.OMRON_SDK_ConnectFail);
                as asVar = as.this;
                asVar.a(asVar.d);
                return;
            }
            as.c(as.this);
            try {
                as.this.f8819e.disconnect();
                as.this.f8819e.close();
                as.this.f8819e = null;
                Thread.sleep(1000L);
                as asVar2 = as.this;
                asVar2.f8819e = asVar2.a.connectGatt(asVar2.b, asVar2.f8820j, asVar2.r);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public class e extends TimerTask {
        public e() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (as.this.f8822n != null) {
                as.this.b(4);
                as.this.d.onFailure(OMRONBLEErrMsg.OMRON_SDK_ConnectFail);
                as asVar = as.this;
                asVar.a(asVar.d);
            }
        }
    }

    public enum f {
        REGISTED,
        UNREGISTED
    }

    public interface g extends OMRONBLECallbackBase {
        void a(ap apVar);
    }

    public interface h extends OMRONBLECallbackBase {
        void a(int i);
    }

    public as(@NonNull BluetoothDevice bluetoothDevice, Context context, br brVar) {
        this.a = bluetoothDevice;
        this.b = context;
        this.h = brVar;
    }

    public static /* synthetic */ int c(as asVar) {
        int i = asVar.p;
        asVar.p = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f8822n == null) {
            this.f8822n = new Timer();
            this.f8822n.schedule(new e(), 15000L, 5000L);
        }
    }

    private void f() {
        if (this.f8818c == f.UNREGISTED) {
            IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED");
            this.f8818c = f.REGISTED;
            this.b.registerReceiver(this.q, intentFilter);
        }
    }

    public static /* synthetic */ int k(as asVar) {
        int i = asVar.o;
        asVar.o = i + 1;
        return i;
    }

    public abstract void a(BluetoothGatt bluetoothGatt, int i);

    public abstract void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic);

    public abstract void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i);

    public abstract void a(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i);

    public abstract void b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i);

    public abstract void d();

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f8821l == null) {
            this.f8821l = new Timer();
            this.f8821l.schedule(new c(), 5000L, 5000L);
        }
    }

    private void b() {
        if (this.m == null) {
            this.m = new Timer();
            this.m.schedule(new d(), 15000L, 5000L);
        }
    }

    public BluetoothDevice c() {
        return this.a;
    }

    public void g() {
        if (this.f8818c == f.REGISTED) {
            try {
                this.f8818c = f.UNREGISTED;
                this.b.unregisterReceiver(this.q);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.m.cancel();
        this.m.purge();
        this.m = null;
        ay.a(s, "connecttimer = null  " + i, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        this.f8822n.cancel();
        this.f8822n.purge();
        this.f8822n = null;
        BluetoothDevice bluetoothDevice = this.a;
        if (bluetoothDevice != null) {
            try {
                com.omron.g.a(bluetoothDevice.getClass(), this.a);
                com.omron.g.b(this.a.getClass(), this.a);
            } catch (Exception e2) {
                ay.b("closePinTimer error:" + e2.getMessage());
            }
        }
        ay.a(s, "pintimer = null  " + i, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        this.f8821l.cancel();
        this.f8821l.purge();
        this.f8821l = null;
        ay.a(s, "discovertimer = null  " + i, new Object[0]);
    }

    public void a(g gVar) {
    }

    public void a(g gVar, boolean z) {
        this.p = 1;
        this.f8820j = z;
        this.k = true;
        this.d = gVar;
        this.f = ap.STATE_DISCONNECTING;
        if (gVar != null) {
            gVar.a(ap.STATE_CONNECTING);
        }
        if (!z) {
            f();
        }
        this.i = false;
        this.f8819e = this.a.connectGatt(this.b, z, this.r);
        if (z) {
            return;
        }
        b();
    }
}
