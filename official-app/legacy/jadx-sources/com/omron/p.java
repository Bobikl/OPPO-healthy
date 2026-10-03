package com.omron;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AndroidRuntimeException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes5.dex */
public abstract class p {

    @NonNull
    private final el a;

    @NonNull
    private final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final BluetoothDevice f9057c;

    @NonNull
    private final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f9058e;

    @NonNull
    private h f;

    @NonNull
    private g g;

    @NonNull
    private i h;

    @Nullable
    private BluetoothGatt i;

    public class a implements Runnable {
        final /* synthetic */ y.a a;

        public a(y.a aVar) {
            this.a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.b(this.a);
        }
    }

    public class b implements Runnable {
        final /* synthetic */ en a;

        public b(en enVar) {
            this.a = enVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(p.this.f);
            this.a.c();
        }
    }

    public class c implements Runnable {
        final /* synthetic */ h a;

        public c(h hVar) {
            this.a = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f = this.a;
            p pVar = p.this;
            pVar.a(pVar.f);
        }
    }

    public class d implements Runnable {
        final /* synthetic */ g a;

        public d(g gVar) {
            this.a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.g = this.a;
            p pVar = p.this;
            pVar.a(pVar.g);
        }
    }

    public class e implements Runnable {
        final /* synthetic */ en a;

        public e(en enVar) {
            this.a = enVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(p.this.h);
            this.a.c();
        }
    }

    public class f extends BluetoothGattCallback {

        public class a implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ int b;

            public a(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                p.this.a(this.a, this.b);
            }
        }

        public class b implements Runnable {
            final /* synthetic */ i a;
            final /* synthetic */ int b;

            public b(i iVar, int i) {
                this.a = iVar;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                p.this.h = this.a;
                p pVar = p.this;
                pVar.a(pVar.h, this.b);
            }
        }

        public class c implements Runnable {
            final /* synthetic */ int a;

            public c(int i) {
                this.a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                p.this.b(this.a);
            }
        }

        public class d implements Runnable {
            final /* synthetic */ BluetoothGattCharacteristic a;
            final /* synthetic */ int b;

            public d(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
                this.a = bluetoothGattCharacteristic;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                p.this.a(this.a, this.b);
            }
        }

        public class e implements Runnable {
            final /* synthetic */ BluetoothGattCharacteristic a;
            final /* synthetic */ int b;

            public e(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
                this.a = bluetoothGattCharacteristic;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                p.this.b(this.a, this.b);
            }
        }

        /* JADX INFO: renamed from: com.omron.p$f$f, reason: collision with other inner class name */
        public class RunnableC0857f implements Runnable {
            final /* synthetic */ BluetoothGattCharacteristic a;
            final /* synthetic */ byte[] b;

            public RunnableC0857f(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
                this.a = bluetoothGattCharacteristic;
                this.b = bArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                p.this.a(this.a, this.b);
            }
        }

        public class g implements Runnable {
            final /* synthetic */ BluetoothGattDescriptor a;
            final /* synthetic */ int b;

            public g(BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
                this.a = bluetoothGattDescriptor;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                p.this.a(this.a, this.b);
            }
        }

        public class h implements Runnable {
            final /* synthetic */ BluetoothGattDescriptor a;
            final /* synthetic */ int b;

            public h(BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
                this.a = bluetoothGattDescriptor;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                p.this.b(this.a, this.b);
            }
        }

        public class i implements Runnable {
            final /* synthetic */ int a;

            public i(int i) {
                this.a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                p.this.a(this.a);
            }
        }

        public class j implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ int b;

            public j(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                p.this.b(this.a, this.b);
            }
        }

        public f() {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            aa.d(bluetoothGattCharacteristic.getUuid().toString());
            byte[] value = bluetoothGattCharacteristic.getValue();
            aa.d("raw data : " + p.this.a(value));
            p.this.a.post(new RunnableC0857f(bluetoothGattCharacteristic, value));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
            aa.d(bluetoothGattCharacteristic.getUuid().toString() + " " + String.format(Locale.US, "status=%d(0x%02x)", Integer.valueOf(i2), Integer.valueOf(i2)));
            if (i2 == 0 && bluetoothGattCharacteristic.getValue() != null) {
                aa.d("raw data : " + p.this.a(bluetoothGattCharacteristic.getValue()));
            }
            p.this.a.post(new d(bluetoothGattCharacteristic, i2));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
            aa.d(bluetoothGattCharacteristic.getUuid().toString() + " " + String.format(Locale.US, "status=%d(0x%02x)", Integer.valueOf(i2), Integer.valueOf(i2)));
            p.this.a.post(new e(bluetoothGattCharacteristic, i2));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i2, int i3) {
            Locale locale = Locale.US;
            aa.c(String.format(locale, "newState=%d status=%d(0x%02x)", Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(i2)));
            i iVarA = i.a(i3);
            aa.d("Received " + p.this.d + " of " + iVarA.name() + ". status:" + String.format(locale, "status=%d(0x%02x)", Integer.valueOf(i2), Integer.valueOf(i2)));
            p.this.a.post(new b(iVarA, i2));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i2) {
            aa.d(bluetoothGattDescriptor.getCharacteristic().getUuid().toString() + " " + bluetoothGattDescriptor.getUuid().toString() + " " + String.format(Locale.US, "status=%d(0x%02x)", Integer.valueOf(i2), Integer.valueOf(i2)));
            p.this.a.post(new g(bluetoothGattDescriptor, i2));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i2) {
            aa.d(bluetoothGattDescriptor.getCharacteristic().getUuid().toString() + " " + bluetoothGattDescriptor.getUuid().toString() + " " + String.format(Locale.US, "status=%d(0x%02x)", Integer.valueOf(i2), Integer.valueOf(i2)));
            p.this.a.post(new h(bluetoothGattDescriptor, i2));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i2, int i3) {
            aa.d("mtu=" + i2 + " " + String.format(Locale.US, "status=%d(0x%02x) ", Integer.valueOf(i3), Integer.valueOf(i3)));
            p.this.a.post(new a(i2, i3));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i2, int i3) {
            aa.d("rssi=" + i2 + " " + String.format(Locale.US, "status=%d(0x%02x) ", Integer.valueOf(i3), Integer.valueOf(i3)));
            p.this.a.post(new j(i2, i3));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i2) {
            aa.d(String.format(Locale.US, "status=%d(0x%02x)", Integer.valueOf(i2), Integer.valueOf(i2)));
            p.this.a.post(new i(i2));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i2) {
            aa.d(String.format(Locale.US, "status=%d(0x%02x)", Integer.valueOf(i2), Integer.valueOf(i2)));
            p.this.a.post(new c(i2));
        }
    }

    public enum g {
        Disconnected,
        Connected,
        Unknown
    }

    public enum h {
        None(10),
        Bonding(11),
        Bonded(12);

        private int a;

        h(int i) {
            this.a = i;
        }

        public int a() {
            return this.a;
        }

        public static h a(int i) {
            for (h hVar : values()) {
                if (hVar.a() == i) {
                    return hVar;
                }
            }
            return None;
        }
    }

    public enum i {
        Disconnected(0),
        Connected(2);

        private int a;

        i(int i) {
            this.a = i;
        }

        public int a() {
            return this.a;
        }

        public static i a(int i) {
            for (i iVar : values()) {
                if (iVar.a() == i) {
                    return iVar;
                }
            }
            return Disconnected;
        }
    }

    public p(@NonNull Context context, @NonNull BluetoothDevice bluetoothDevice, @Nullable Looper looper) {
        if (looper == null) {
            HandlerThread handlerThread = new HandlerThread("Peripheral-" + bluetoothDevice.getAddress());
            handlerThread.start();
            looper = handlerThread.getLooper();
        }
        this.a = new el(looper);
        this.b = context;
        this.f9057c = bluetoothDevice;
        this.d = bluetoothDevice.getAddress();
        this.f9058e = bluetoothDevice.getName();
        this.f = h.a(bluetoothDevice.getBondState());
        this.g = g.Unknown;
        this.h = i.Disconnected;
        this.i = null;
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        if (bluetoothManager == null) {
            throw new AndroidRuntimeException("null == bluetoothManager");
        }
        if (bluetoothManager.getConnectionState(bluetoothDevice, 7) != 0) {
            aa.f("Illegal onGattConnectionStateChanged state is BluetoothProfile.STATE_DISCONNECTED != gattConnectionState");
        }
    }

    public abstract void a(int i2);

    public abstract void a(int i2, int i3);

    public abstract void a(@NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2);

    public abstract void a(@NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, @NonNull byte[] bArr);

    public abstract void a(@NonNull BluetoothGattDescriptor bluetoothGattDescriptor, int i2);

    public abstract void a(@NonNull g gVar);

    public abstract void a(@NonNull h hVar);

    public abstract void a(@NonNull i iVar, int i2);

    public abstract void b(int i2);

    public abstract void b(int i2, int i3);

    public abstract void b(@NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2);

    public abstract void b(@NonNull BluetoothGattDescriptor bluetoothGattDescriptor, int i2);

    public abstract void b(@NonNull y.a aVar);

    public boolean f() {
        if (this.i == null) {
            aa.b("null == mBluetoothGatt");
            return false;
        }
        aa.d("discoverServices() exec.");
        boolean zDiscoverServices = this.i.discoverServices();
        if (zDiscoverServices) {
            aa.a("discoverServices() called. ret=true");
        } else {
            aa.b("discoverServices() called. ret=false");
        }
        return zDiscoverServices;
    }

    @NonNull
    public String g() {
        return this.d;
    }

    public h h() {
        if (this.a.a()) {
            return this.f;
        }
        en enVar = new en();
        this.a.post(new b(enVar));
        enVar.b();
        return (h) enVar.a();
    }

    @NonNull
    public Context i() {
        return this.b;
    }

    @NonNull
    public i j() {
        if (this.a.a()) {
            return this.h;
        }
        en enVar = new en();
        this.a.post(new e(enVar));
        enVar.b();
        return (i) enVar.a();
    }

    @NonNull
    public el k() {
        return this.a;
    }

    @Nullable
    public String l() {
        return this.f9058e;
    }

    @NonNull
    public List<BluetoothGattService> m() {
        if (this.i == null) {
            aa.b("null == mBluetoothGatt");
            return new ArrayList();
        }
        aa.d("getServices() exec.");
        List<BluetoothGattService> services = this.i.getServices();
        if (services == null) {
            aa.b("getServices() called. ret=Null");
            return new ArrayList();
        }
        aa.a(services.size() == 0 ? "getServices() called. ret.size=0" : "getServices() called. ret=Not Null");
        return services;
    }

    public boolean n() {
        return this.i != null;
    }

    public boolean o() {
        return h.Bonded == h();
    }

    public boolean p() {
        return i.Connected == j();
    }

    public boolean q() {
        boolean zBooleanValue = false;
        if (this.i == null) {
            aa.b("null == mBluetoothGatt");
            return false;
        }
        aa.d("refresh() exec.");
        try {
            zBooleanValue = ((Boolean) a(this.i, "refresh", null, null)).booleanValue();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (zBooleanValue) {
            aa.a("refresh() called. ret=true");
        } else {
            aa.b("refresh() called. ret=false");
        }
        return zBooleanValue;
    }

    public boolean r() {
        boolean zBooleanValue;
        aa.d("removeBond() exec.");
        try {
            zBooleanValue = ((Boolean) a(this.f9057c, "removeBond", null, null)).booleanValue();
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e2) {
            e2.printStackTrace();
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            aa.a("removeBond() called. ret=true");
        } else {
            aa.b("removeBond() called. ret=false");
        }
        return zBooleanValue;
    }

    public void b(@NonNull g gVar) {
        if (!this.a.a()) {
            this.a.post(new d(gVar));
        } else {
            this.g = gVar;
            a(gVar);
        }
    }

    public boolean c() {
        if (this.i != null) {
            aa.b("null != mBluetoothGatt");
            return false;
        }
        f fVar = new f();
        aa.d("connectGatt() exec.");
        BluetoothGatt bluetoothGattConnectGatt = this.f9057c.connectGatt(this.b, false, fVar);
        this.i = bluetoothGattConnectGatt;
        if (bluetoothGattConnectGatt != null) {
            aa.a("connectGatt() called. ret=Not Null");
        } else {
            aa.b("connectGatt() called. ret=Null");
        }
        return this.i != null;
    }

    @SuppressLint({"NewApi"})
    public boolean d() {
        aa.d("createBond() exec.");
        boolean zCreateBond = this.f9057c.createBond();
        if (zCreateBond) {
            aa.a("createBond() called. ret=true");
        } else {
            aa.b("createBond() called. ret=false");
        }
        return zCreateBond;
    }

    public boolean e() {
        if (this.i == null) {
            aa.b("null == mBluetoothGatt");
            return false;
        }
        aa.d("disconnect() exec.");
        this.i.disconnect();
        aa.a("disconnect() called.");
        return true;
    }

    public void b(@NonNull h hVar) {
        if (!this.a.a()) {
            this.a.post(new c(hVar));
        } else {
            this.f = hVar;
            a(hVar);
        }
    }

    @SuppressLint({"NewApi"})
    public boolean c(String str) {
        byte[] bArrA = a(str);
        if (bArrA == null) {
            aa.b("null == pin");
            return false;
        }
        aa.d("setPin(" + str + ") exec.");
        boolean pin = this.f9057c.setPin(bArrA);
        if (pin) {
            aa.a("setPin() called. ret=true");
        } else {
            aa.b("setPin() called. ret=false");
        }
        return pin;
    }

    public boolean b() {
        if (this.i == null) {
            aa.b("null == mBluetoothGatt");
            return false;
        }
        aa.d("close() exec.");
        this.i.close();
        aa.a("close() called.");
        this.i = null;
        return true;
    }

    @NonNull
    private Object a(@NonNull Object obj, @NonNull String str, @Nullable Class<?>[] clsArr, @Nullable Object[] objArr) throws IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        return obj.getClass().getDeclaredMethod(str, clsArr).invoke(obj, objArr);
    }

    public boolean b(@NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.i == null) {
            aa.b("null == mBluetoothGatt");
            return false;
        }
        aa.d("writeCharacteristic(" + bluetoothGattCharacteristic.getUuid().toString() + ") exec.");
        StringBuilder sb = new StringBuilder();
        sb.append("raw data : ");
        sb.append(a(bluetoothGattCharacteristic.getValue()));
        aa.d(sb.toString());
        boolean zWriteCharacteristic = this.i.writeCharacteristic(bluetoothGattCharacteristic);
        if (zWriteCharacteristic) {
            aa.a("writeCharacteristic() called. ret=true");
        } else {
            aa.b("writeCharacteristic() called. ret=false");
        }
        return zWriteCharacteristic;
    }

    public boolean b(@NonNull BluetoothGattDescriptor bluetoothGattDescriptor) {
        if (this.i == null) {
            aa.b("null == mBluetoothGatt");
            return false;
        }
        aa.d("writeDescriptor(" + bluetoothGattDescriptor.getCharacteristic().getUuid().toString() + ", " + bluetoothGattDescriptor.getUuid().toString() + ") exec.");
        boolean zWriteDescriptor = this.i.writeDescriptor(bluetoothGattDescriptor);
        if (zWriteDescriptor) {
            aa.a("writeDescriptor() called. ret=true");
        } else {
            aa.b("writeDescriptor() called. ret=false");
        }
        return zWriteDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(@NonNull byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        for (byte b2 : bArr) {
            sb.append(String.format(Locale.US, "%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    public boolean b(String str) {
        aa.d("setPasskey(" + str + ") exec.");
        boolean zBooleanValue = false;
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.nativeOrder());
            byteBufferAllocate.putInt(Integer.parseInt(str));
            byte[] bArrArray = byteBufferAllocate.array();
            zBooleanValue = ((Boolean) a(a(BluetoothDevice.class, "setPasskey", null, null), "setPasskey", new Class[]{BluetoothDevice.class, Boolean.TYPE, Integer.TYPE, byte[].class}, new Object[]{this.f9057c, Boolean.TRUE, Integer.valueOf(bArrArray.length), bArrArray})).booleanValue();
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e2) {
            e2.printStackTrace();
        }
        if (zBooleanValue) {
            aa.a("setPasskey() called. ret=true");
        } else {
            aa.b("setPasskey() called. ret=false");
        }
        return zBooleanValue;
    }

    public void a(@NonNull y.a aVar) {
        if (this.a.a()) {
            b(aVar);
        } else {
            this.a.post(new a(aVar));
        }
    }

    public boolean a() {
        boolean zBooleanValue;
        aa.d("cancelBondProcess() exec.");
        try {
            zBooleanValue = ((Boolean) a(this.f9057c, "cancelBondProcess", null, null)).booleanValue();
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e2) {
            e2.printStackTrace();
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            aa.a("cancelBondProcess() called. ret=true");
        } else {
            aa.b("cancelBondProcess() called. ret=false");
        }
        return zBooleanValue;
    }

    public boolean a(@NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.i == null) {
            aa.b("null == mBluetoothGatt");
            return false;
        }
        aa.d("readCharacteristic(" + bluetoothGattCharacteristic.getUuid().toString() + ") exec.");
        boolean characteristic = this.i.readCharacteristic(bluetoothGattCharacteristic);
        if (characteristic) {
            aa.a("readCharacteristic() called. ret=true");
        } else {
            aa.b("readCharacteristic() called. ret=false");
        }
        return characteristic;
    }

    public boolean a(@NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        if (this.i == null) {
            aa.b("null == mBluetoothGatt");
            return false;
        }
        aa.d("setCharacteristicNotification(" + bluetoothGattCharacteristic.getUuid().toString() + ", " + z + ") exec.");
        boolean characteristicNotification = this.i.setCharacteristicNotification(bluetoothGattCharacteristic, z);
        if (characteristicNotification) {
            aa.a("setCharacteristicNotification() called. ret=true");
        } else {
            aa.b("setCharacteristicNotification() called. ret=false");
        }
        return characteristicNotification;
    }

    public boolean a(@NonNull BluetoothGattDescriptor bluetoothGattDescriptor) {
        if (this.i == null) {
            aa.b("null == mBluetoothGatt");
            return false;
        }
        aa.d("readDescriptor(" + bluetoothGattDescriptor.getCharacteristic().getUuid().toString() + ", " + bluetoothGattDescriptor.getUuid().toString() + ") exec.");
        boolean descriptor = this.i.readDescriptor(bluetoothGattDescriptor);
        if (descriptor) {
            aa.a("readDescriptor() called. ret=true");
        } else {
            aa.b("readDescriptor() called. ret=false");
        }
        return descriptor;
    }

    @SuppressLint({"NewApi"})
    public boolean a(boolean z) {
        boolean pairingConfirmation;
        aa.d("setPairingConfirmation(" + z + ") exec.");
        try {
            pairingConfirmation = this.f9057c.setPairingConfirmation(z);
        } catch (SecurityException e2) {
            e2.printStackTrace();
            pairingConfirmation = false;
        }
        if (pairingConfirmation) {
            aa.a("setPairingConfirmation() called. ret=true");
        } else {
            aa.b("setPairingConfirmation() called. ret=false");
        }
        return pairingConfirmation;
    }

    private byte[] a(String str) {
        try {
            return (byte[]) a(this.f9057c, "convertPinToBytes", new Class[]{String.class}, new Object[]{str});
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
