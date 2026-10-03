package com.heytap.accessory.connectivity.ble;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.heytap.accessory.logging.SensitiveLogUtils;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.utils.HexUtils;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* JADX INFO: loaded from: classes14.dex */
@SuppressLint({"MissingPermission"})
public class b implements com.heytap.accessory.connectivity.ble.interfaces.a, com.heytap.accessory.connectivity.ble.interfaces.c {
    public static final String q = "b";
    public static Handler r;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.heytap.accessory.connectivity.ble.bean.a f2472c;
    public volatile BluetoothGatt d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BluetoothAdapter f2473e;
    public HandlerC0231b f;
    public Context g;
    public com.heytap.accessory.connectivity.ble.callback.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.heytap.accessory.connectivity.ble.interfaces.b f2474j;
    public com.heytap.accessory.connectivity.params.a k;
    public volatile boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f2476n;
    public final Object a = new Object();
    public final c b = new c(this, null);
    public int o = 0;
    public long p = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2475l = 0;
    public int h = 0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.d.discoverServices();
            b.this.a(2);
        }
    }

    /* JADX INFO: renamed from: com.heytap.accessory.connectivity.ble.b$b, reason: collision with other inner class name */
    public static final class HandlerC0231b extends Handler {
        public final WeakReference<b> a;

        public HandlerC0231b(Looper looper, b bVar) {
            super(looper);
            this.a = new WeakReference<>(bVar);
        }

        public static /* synthetic */ void a(b bVar, String str) {
            Integer numA = bVar.a(str);
            com.heytap.accessory.base.logging.a.d(b.q, "reconnect code=" + numA);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            b bVar = this.a.get();
            if (bVar == null) {
                com.heytap.accessory.base.logging.a.b(b.q, "MessageHandler() : reference to AFBleClientDevice is null! returning...");
                return;
            }
            int i = message.what;
            if (i == 1) {
                BluetoothGatt bluetoothGatt = (BluetoothGatt) message.obj;
                if (!bVar.j()) {
                    com.heytap.accessory.base.logging.a.b(b.q, "EVT_SERVICES_FOUND Failed");
                    bVar.h = -1106;
                    if (bVar.f2474j != null) {
                        bVar.f2474j.a(bVar.f2475l, bVar.h);
                    }
                }
                bVar.d = bluetoothGatt;
                return;
            }
            if (i == 2) {
                bVar.f2475l = 1;
                bVar.b(1);
                com.heytap.accessory.base.logging.a.d(b.q, "BLE Connection OPEN");
                if (bVar.f2474j != null) {
                    bVar.f2474j.a(bVar.f2475l, bVar.h);
                    return;
                }
                return;
            }
            if (i != 3) {
                if (i == 4) {
                    bVar.f2474j.a();
                    return;
                }
                if (i == 6) {
                    bVar.f2474j.a(message.arg1);
                    return;
                }
                if (i == 7) {
                    BluetoothGatt bluetoothGatt2 = (BluetoothGatt) message.obj;
                    bVar.a(bluetoothGatt2, 243);
                    bVar.d = bluetoothGatt2;
                    return;
                } else {
                    com.heytap.accessory.base.logging.a.b(b.q, "unknown event received in mClient gatt callback handler" + message);
                    return;
                }
            }
            int i2 = message.arg1;
            int i3 = message.arg2;
            final b bVar2 = this.a.get();
            if (bVar2 != null && bVar2.f2472c != null) {
                final String address = bVar2.f2472c.a().getAddress();
                if (bVar2.b(i3, i2)) {
                    if (bVar2.d != null) {
                        bVar2.d.close();
                    }
                    bVar2.f.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.jgm
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.heytap.accessory.connectivity.ble.b.HandlerC0231b.a(bVar2, address);
                        }
                    }, 300L);
                    return;
                }
            }
            if (i2 != 2) {
                if (i2 == 0) {
                    if (!bVar.f2473e.isEnabled()) {
                        com.heytap.accessory.base.logging.a.e(b.q, "BT is off so device disconnected ");
                    }
                    bVar.f2475l = 3;
                    bVar.f2474j.a(bVar.f2475l, -1106);
                    return;
                }
                return;
            }
            bVar.b(1);
            if (bVar.f2475l == 5 || bVar.f2475l == 1) {
                com.heytap.accessory.base.logging.a.e(b.q, "Gatt connection has connected already,ignore this event");
                return;
            }
            bVar.f2475l = 5;
            if (i3 != 0) {
                com.heytap.accessory.base.logging.a.e(b.q, "Gatt connection doesnot exist.");
                return;
            }
            if (bVar.d == null || bVar.d.getDevice() == null) {
                com.heytap.accessory.base.logging.a.e(b.q, "bleClient.mBluetoothGatt is null, ignore this event!");
                bVar.f2475l = 3;
                bVar.f2474j.a(bVar.f2475l, -1106);
                return;
            }
            com.heytap.accessory.base.logging.a.c(b.q, "BluetoothProfile.STATE_CONNECTED, device = " + bVar.d.getDevice().getName() + ", status =" + i3 + " newState=" + i2);
            bVar.h();
        }
    }

    public final class c implements Runnable {
        public int a;

        public /* synthetic */ c(b bVar, a aVar) {
            this();
        }

        public void a(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.a;
            if (1 == i) {
                com.heytap.accessory.base.logging.a.e(b.q, "ble connect timeout");
            } else if (2 == i) {
                com.heytap.accessory.base.logging.a.e(b.q, "ble discover services timeout");
            }
            try {
                com.heytap.accessory.base.logging.a.d(b.q, "gattSocket cleanup");
                if (b.this.d != null) {
                    b.this.d.disconnect();
                    b.this.d.close();
                }
                if (b.this.i != null) {
                    b.this.i.a();
                }
                b.this.h = -1106;
                b.this.f2475l = 0;
                b.this.f2474j.a(b.this.f2475l, b.this.h);
            } catch (Exception e2) {
                b.this.f2475l = 3;
                b.this.h = 1;
                com.heytap.accessory.base.logging.a.b(b.q, "Exception when closing stream: " + e2.toString());
            }
        }

        public c() {
        }
    }

    static {
        Looper looperB = com.heytap.accessory.base.thread.a.b().b("daemon");
        if (looperB != null) {
            r = new Handler(looperB);
        }
    }

    public b(com.heytap.accessory.connectivity.ble.interfaces.b bVar, com.heytap.accessory.connectivity.params.a aVar) {
        this.f2474j = bVar;
        this.k = aVar;
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.c
    public void a(BluetoothGattDescriptor bluetoothGattDescriptor) {
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.c
    public void b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.a
    public String e() {
        com.heytap.accessory.connectivity.ble.bean.a aVar = this.f2472c;
        if (aVar == null || aVar.a() == null) {
            return null;
        }
        return this.f2472c.a().getName();
    }

    public final void g() {
        if (this.f2472c == null) {
            com.heytap.accessory.base.logging.a.e(q, "Cannot handle event, mBleDevice is null. returning...");
            return;
        }
        String str = q;
        com.heytap.accessory.base.logging.a.c(str, "disableNotification");
        BluetoothGattDescriptor bluetoothGattDescriptorI = i();
        if (bluetoothGattDescriptorI == null) {
            com.heytap.accessory.base.logging.a.e(str, "desc == null, disableNotification failed");
            return;
        }
        bluetoothGattDescriptorI.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
        if (this.d != null) {
            com.heytap.accessory.base.logging.a.c(str, "writeDescriptor result:" + this.d.writeDescriptor(bluetoothGattDescriptorI));
        }
    }

    public final void h() {
        this.f.postDelayed(new a(), 50L);
    }

    @Nullable
    public final BluetoothGattDescriptor i() {
        BluetoothGattCharacteristic bluetoothGattCharacteristicB = this.f2472c.b();
        com.heytap.accessory.connectivity.ble.bean.d dVar = this.k.b().a().get(0);
        if (bluetoothGattCharacteristicB != null && dVar != null) {
            return bluetoothGattCharacteristicB.getDescriptor(UUID.fromString(dVar.a()));
        }
        com.heytap.accessory.base.logging.a.e(q, "Cannot disable Notification, readChart or uuidServiceCharacDesc is null. returning...");
        return null;
    }

    public final boolean j() {
        BluetoothGatt bluetoothGatt = this.d;
        if (this.f2475l != 5) {
            com.heytap.accessory.base.logging.a.e(q, "Cannot handle event! Connection state is not open. returning...");
            return false;
        }
        com.heytap.accessory.connectivity.ble.bean.a aVar = this.f2472c;
        if (aVar == null) {
            com.heytap.accessory.base.logging.a.e(q, "Cannot handle event! ble device not initialized. returning...");
            return false;
        }
        if (aVar.a() == null) {
            com.heytap.accessory.base.logging.a.e(q, "Cannot handle event! device is null. returning...");
            return false;
        }
        if (bluetoothGatt == null) {
            com.heytap.accessory.base.logging.a.e(q, "Cannot handle event! BluetoothGatt is null. returning...");
            return false;
        }
        String str = q;
        com.heytap.accessory.base.logging.a.c(str, "service uuid:" + this.k.b.b());
        BluetoothGattService service = bluetoothGatt.getService(UUID.fromString(this.k.b.b()));
        if (service == null && (service = bluetoothGatt.getService(UUID.fromString(this.k.b.b()))) == null) {
            com.heytap.accessory.base.logging.a.e(str, "Cannot handle event! BluetoothGattService is null. returning...");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(UUID.fromString(this.k.b().b()));
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(UUID.fromString(this.k.c().b()));
        com.heytap.accessory.base.logging.a.d(str, "Set Char=>ReadChar=" + characteristic);
        com.heytap.accessory.base.logging.a.d(str, "Set Char=>WriteChar=" + characteristic2);
        if (characteristic != null && characteristic2 != null) {
            this.f2472c.a(characteristic);
            this.f2472c.b(characteristic2);
            if (a(false)) {
                return true;
            }
            com.heytap.accessory.base.logging.a.b(str, "enableNotifyIndication failed!!");
            return false;
        }
        com.heytap.accessory.base.logging.a.e(str, "Cannot handle event! BluetoothGattService characteristics is null[" + characteristic + " " + characteristic2 + "]. returning...");
        return false;
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.a
    public void c() {
        g();
        synchronized (this.a) {
            try {
                this.a.wait(2000L);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
        a(true);
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.c
    public void d() {
        synchronized (this.a) {
            com.heytap.accessory.base.logging.a.a(q, "onDescriptorWrite notifyAll");
            this.a.notify();
        }
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.a
    public void b() {
        if (this.f2475l == 2) {
            com.heytap.accessory.base.logging.a.d(q, "Already Connection closed return");
            return;
        }
        if (this.d != null) {
            com.heytap.accessory.base.logging.a.c(q, "close gattSocket cleanup");
            g();
            this.d.disconnect();
            this.d.close();
        }
        if (this.i != null) {
            com.heytap.accessory.base.logging.a.c(q, "Deregister the Gatt Callback");
            this.i.a();
        }
        HandlerC0231b handlerC0231b = this.f;
        if (handlerC0231b != null) {
            handlerC0231b.removeCallbacksAndMessages(null);
            com.heytap.accessory.base.thread.a.b().e(this.f2476n);
        }
        this.f2475l = 2;
        this.h = 0;
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.a
    public int a(com.heytap.accessory.base.bean.b bVar) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.f2473e = defaultAdapter;
        if (defaultAdapter == null) {
            com.heytap.accessory.base.logging.a.b(q, "Connect device failed! BTAdapter is null, returing...");
            this.h = -1107;
            return -1107;
        }
        if (!defaultAdapter.isEnabled()) {
            com.heytap.accessory.base.logging.a.e(q, "BT is off so no need to connect!");
            this.h = -1106;
            return -1106;
        }
        String str = q;
        com.heytap.accessory.base.logging.a.a(str, "Ble client start connect");
        this.f2475l = 0;
        this.h = 0;
        this.f2472c = new com.heytap.accessory.connectivity.ble.bean.a();
        this.g = PlatformUtils.getContext();
        com.heytap.accessory.connectivity.ble.callback.b bVar2 = new com.heytap.accessory.connectivity.ble.callback.b();
        this.i = bVar2;
        bVar2.a(this);
        this.f2476n = com.heytap.accessory.base.thread.a.b().a(4, "C", "MESSAGE_HANDLER", 1);
        Looper looperB = com.heytap.accessory.base.thread.a.b().b(this.f2476n);
        if (looperB != null) {
            this.f = new HandlerC0231b(looperB, this);
        } else {
            com.heytap.accessory.base.logging.a.b(str, "connect: ClientMessageHandler == null ");
        }
        String strD = bVar.d();
        this.p = System.currentTimeMillis();
        Integer numA = a(strD);
        if (numA != null) {
            return numA.intValue();
        }
        return 0;
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.c
    public void b(byte[] bArr) {
        com.heytap.accessory.connectivity.ble.interfaces.b bVar = this.f2474j;
        if (bVar != null) {
            bVar.a(bArr);
        }
    }

    public final void b(int i) {
        if (r != null) {
            if (1 == i) {
                com.heytap.accessory.base.logging.a.a(q, "stop connect timeout timer");
            } else if (2 == i) {
                com.heytap.accessory.base.logging.a.a(q, "stop discover service timeout timer");
            }
            r.removeCallbacks(this.b);
        }
    }

    public boolean b(int i, int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.p;
        boolean z = false;
        boolean z2 = i2 == 0 && (i == 133 || i == 62);
        if (z2) {
            this.o++;
        }
        if (z2 && this.o <= 3 && jCurrentTimeMillis < 10000) {
            z = true;
        }
        com.heytap.accessory.base.logging.a.c(q, "checkRetry: status=" + i + " newState=" + i2 + " errorCount=" + this.o + " delay=" + jCurrentTimeMillis + " needRetry=" + z);
        return z;
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.a
    public boolean a(byte[] bArr) {
        if (this.f2472c == null) {
            return false;
        }
        String str = q;
        com.heytap.accessory.base.logging.a.c(str, "Client: write length = " + bArr.length);
        this.f2472c.c().setValue(bArr);
        this.f2472c.c().setWriteType(1);
        if (this.d != null) {
            return this.d.writeCharacteristic(this.f2472c.c());
        }
        com.heytap.accessory.base.logging.a.e(str, "mBluetoothGatt is null!");
        return false;
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.a
    public boolean a() {
        if (this.d == null) {
            com.heytap.accessory.base.logging.a.b(q, "Device is disconnected");
            return false;
        }
        if (1 == this.f2475l) {
            return true;
        }
        com.heytap.accessory.base.logging.a.b(q, "Invalid connection state");
        return false;
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.c
    public void a(int i, int i2) {
        HandlerC0231b handlerC0231b = this.f;
        if (handlerC0231b != null) {
            Message messageObtainMessage = handlerC0231b.obtainMessage();
            messageObtainMessage.what = 3;
            messageObtainMessage.arg1 = i;
            messageObtainMessage.arg2 = i2;
            this.f.sendMessage(messageObtainMessage);
            return;
        }
        com.heytap.accessory.base.logging.a.b(q, "onConnectionStateChanged: ClientMessageHandler == null ");
        this.f2475l = 0;
        this.f2474j.a(0, this.h);
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.c
    public void a(BluetoothGatt bluetoothGatt) {
        b(2);
        HandlerC0231b handlerC0231b = this.f;
        if (handlerC0231b != null) {
            Message messageObtainMessage = handlerC0231b.obtainMessage();
            messageObtainMessage.what = 7;
            messageObtainMessage.obj = bluetoothGatt;
            this.f.sendMessage(messageObtainMessage);
        }
    }

    @Nullable
    public final Integer a(String str) {
        String str2 = q;
        com.heytap.accessory.base.logging.a.a(str2, "Received BLE address is " + SensitiveLogUtils.toHiddenIfNeed(str));
        try {
            BluetoothDevice remoteDevice = this.f2473e.getRemoteDevice(str);
            if (remoteDevice == null) {
                com.heytap.accessory.base.logging.a.b(str2, "Connect device failed! Remote Device not exist");
                this.h = -1125;
                return -1125;
            }
            this.f2472c.a(remoteDevice);
            a(1);
            if (!a(remoteDevice)) {
                com.heytap.accessory.base.logging.a.b(str2, "connectGatt failed");
                this.h = -1106;
                b(1);
            }
            return Integer.valueOf(this.h);
        } catch (IllegalArgumentException e2) {
            com.heytap.accessory.base.logging.a.b(q, "Connect failed! Exception in gatt connection.." + e2.getMessage());
            this.f2475l = 3;
            this.h = -1111;
            return null;
        } catch (Throwable th) {
            if (this.h == 0) {
                b(1);
            }
            throw th;
        }
    }

    public final void a(BluetoothGatt bluetoothGatt, int i) {
        if (bluetoothGatt != null) {
            com.heytap.accessory.base.logging.a.d(q, "requestMtu");
            bluetoothGatt.requestMtu(i + 3);
            this.m = true;
        }
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.c
    public void a(BluetoothGatt bluetoothGatt, int i, int i2) {
        HandlerC0231b handlerC0231b;
        com.heytap.accessory.base.logging.a.a(q, "onMtuChanged: mtu = " + i + " status = " + i2 + " mHasRequestMtu = " + this.m);
        if (this.m) {
            if (i2 == 0 && (handlerC0231b = this.f) != null) {
                Message messageObtainMessage = handlerC0231b.obtainMessage();
                messageObtainMessage.what = 6;
                messageObtainMessage.arg1 = i - 3;
                this.f.sendMessage(messageObtainMessage);
            }
            HandlerC0231b handlerC0231b2 = this.f;
            if (handlerC0231b2 != null) {
                Message messageObtainMessage2 = handlerC0231b2.obtainMessage();
                messageObtainMessage2.obj = bluetoothGatt;
                messageObtainMessage2.what = 1;
                this.f.sendMessage(messageObtainMessage2);
            }
        }
    }

    @Override // com.heytap.accessory.connectivity.ble.interfaces.c
    public void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        com.heytap.accessory.base.logging.a.d(q, "onCharacteristicWrite,current status:" + Integer.toHexString(i));
        HandlerC0231b handlerC0231b = this.f;
        if (handlerC0231b != null) {
            Message messageObtainMessage = handlerC0231b.obtainMessage();
            messageObtainMessage.what = 4;
            messageObtainMessage.arg1 = i;
            this.f.sendMessage(messageObtainMessage);
        }
    }

    public final void a(int i) {
        if (r != null) {
            if (1 == i) {
                this.b.a(1);
                com.heytap.accessory.base.logging.a.a(q, "start connect timeout timer");
            } else if (2 == i) {
                this.b.a(2);
                com.heytap.accessory.base.logging.a.a(q, "start discover services timeout timer");
            }
            r.postDelayed(this.b, 30000L);
        }
    }

    public final boolean a(boolean z) {
        boolean z2;
        boolean z3;
        BluetoothGatt bluetoothGatt = this.d;
        if (bluetoothGatt == null) {
            com.heytap.accessory.base.logging.a.e(q, "Cannot handle event! BluetoothGatt is null. returning...");
            return false;
        }
        com.heytap.accessory.connectivity.ble.bean.a aVar = this.f2472c;
        if (aVar == null) {
            com.heytap.accessory.base.logging.a.e(q, "bleDeviceInfo has been clear!");
            return false;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristicB = aVar.b();
        int properties = bluetoothGattCharacteristicB.getProperties();
        if ((properties & 16) != 0) {
            com.heytap.accessory.base.logging.a.d(q, "Set isNoti true");
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || (properties & 32) == 0) {
            z3 = false;
        } else {
            com.heytap.accessory.base.logging.a.d(q, "Set isIndicate true");
            z3 = true;
        }
        if (!bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristicB, true)) {
            com.heytap.accessory.base.logging.a.b(q, "setCharacteristicNotification failed");
            return false;
        }
        BluetoothGattDescriptor bluetoothGattDescriptorI = i();
        if (bluetoothGattDescriptorI == null) {
            com.heytap.accessory.base.logging.a.b(q, "onDescriptorRead  clientConfig == null");
            return false;
        }
        if (z3) {
            String str = q;
            com.heytap.accessory.base.logging.a.d(str, "ENABLE_INDICATION_VALUE  ret=" + bluetoothGattDescriptorI.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE));
            if (!bluetoothGatt.writeDescriptor(bluetoothGattDescriptorI)) {
                com.heytap.accessory.base.logging.a.e(str, "write desc failed");
            }
            com.heytap.accessory.base.logging.a.d(str, "onDescriptorRead  mBTGatt.writeDescriptor ENABLE_INDICATION_VALUE");
        } else if (z2) {
            String str2 = q;
            com.heytap.accessory.base.logging.a.d(str2, "ENABLE_NOTIFICATION_VALUE  ret=" + bluetoothGattDescriptorI.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE));
            if (!bluetoothGatt.writeDescriptor(bluetoothGattDescriptorI)) {
                com.heytap.accessory.base.logging.a.e(str2, " write desc failed");
            } else {
                HandlerC0231b handlerC0231b = this.f;
                if (handlerC0231b != null && !z) {
                    Message messageObtainMessage = handlerC0231b.obtainMessage();
                    messageObtainMessage.what = 2;
                    this.f.sendMessage(messageObtainMessage);
                }
            }
        } else {
            com.heytap.accessory.base.logging.a.b(q, "Indicate or Noti is not set. So just return");
            return false;
        }
        com.heytap.accessory.base.logging.a.d(q, "enableNotifyIndication Done..");
        return true;
    }

    public final boolean a(BluetoothDevice bluetoothDevice) {
        com.heytap.accessory.base.logging.a.d(q, "start connectGatt:" + HexUtils.hideAddress(bluetoothDevice.getAddress()));
        try {
            this.d = bluetoothDevice.connectGatt(this.g, false, this.i, 2);
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.d(q, "connectGatt error:" + e2);
        }
        if (this.d != null) {
            return true;
        }
        com.heytap.accessory.base.logging.a.b(q, "connectGatt failed! returning...");
        return false;
    }
}
