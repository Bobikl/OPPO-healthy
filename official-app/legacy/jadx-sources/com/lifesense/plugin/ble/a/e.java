package com.lifesense.plugin.ble.a;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import com.lifesense.plugin.ble.LSBluetoothManager;
import com.lifesense.plugin.ble.data.LSManagerStatus;
import com.lifesense.plugin.ble.data.other.BleScanResults;
import com.lifesense.plugin.ble.data.other.HandlerMessage;
import com.lifesense.plugin.ble.data.other.PhoneBrand;
import com.lifesense.plugin.ble.device.a.a.u;
import com.lifesense.plugin.ble.device.proto.A5.o;
import com.lifesense.plugin.ble.device.proto.q;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"NewApi"})
public final class e extends com.lifesense.plugin.ble.b.a implements BluetoothAdapter.LeScanCallback {
    private static e f;
    private Context g;
    private HandlerThread h;
    private f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private BluetoothManager f8681j;
    private BluetoothAdapter k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f8682l;
    private d m;
    private boolean o;
    private com.lifesense.plugin.ble.a.a.g p;
    final int a = 1;
    final int b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f8679c = 4;
    final int d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f8680e = 7;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f8683n = false;

    private e() {
    }

    public BluetoothDevice a(String str) {
        List<BluetoothDevice> listF;
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        if (strA != null && (listF = f()) != null && listF.size() > 0) {
            for (BluetoothDevice bluetoothDevice : listF) {
                if (bluetoothDevice != null && strA.equalsIgnoreCase(bluetoothDevice.getAddress())) {
                    return bluetoothDevice;
                }
            }
        }
        return null;
    }

    public BluetoothDevice b(String str) {
        if (this.k != null && BluetoothAdapter.checkBluetoothAddress(str)) {
            try {
                Set<BluetoothDevice> bondedDevices = this.k.getBondedDevices();
                if (bondedDevices != null && bondedDevices.size() != 0) {
                    for (BluetoothDevice bluetoothDevice : bondedDevices) {
                        if (str.equalsIgnoreCase(bluetoothDevice.getAddress())) {
                            return bluetoothDevice;
                        }
                    }
                }
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public BluetoothDevice c(String str) {
        BluetoothAdapter bluetoothAdapter;
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        if (!TextUtils.isEmpty(strA) && (bluetoothAdapter = this.k) != null) {
            try {
                return bluetoothAdapter.getRemoteDevice(strA);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public synchronized Set j() {
        BluetoothAdapter bluetoothAdapter = this.k;
        if (bluetoothAdapter == null) {
            return null;
        }
        try {
            return bluetoothAdapter.getBondedDevices();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void k() {
        BluetoothAdapter bluetoothAdapter = this.k;
        if (bluetoothAdapter == null) {
            return;
        }
        try {
            bluetoothAdapter.cancelDiscovery();
        } catch (Exception e2) {
            printLogMessage(getGeneralLogInfo(null, "failed to cancel bluetooth discovery,has exception....", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            e2.printStackTrace();
        }
    }

    public BluetoothAdapter l() {
        BluetoothAdapter bluetoothAdapter = this.k;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter;
        }
        if (this.g == null) {
            printLogMessage(getGeneralLogInfo(null, "failed to get bluetooth adapter,no context.", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        } else {
            try {
                printLogMessage(getGeneralLogInfo(null, "get bluetooth adapter again,state=" + i(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                BluetoothManager bluetoothManager = (BluetoothManager) this.g.getSystemService("bluetooth");
                this.f8681j = bluetoothManager;
                BluetoothAdapter adapter = bluetoothManager.getAdapter();
                this.k = adapter;
                return adapter;
            } catch (Exception e2) {
                printLogMessage(getGeneralLogInfo(null, "failed to get bluetooth adapter,has exception....", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                e2.printStackTrace();
            }
        }
        return this.k;
    }

    @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
    public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        if (this.m == null || bluetoothDevice == null || bArr == null) {
            return;
        }
        BleScanResults bleScanResults = new BleScanResults();
        bleScanResults.setDevice(bluetoothDevice);
        bleScanResults.setRssi(i);
        bleScanResults.setScanRecord(bArr);
        this.m.a(bleScanResults);
    }

    public List f() {
        BluetoothManager bluetoothManager;
        try {
            Context context = this.g;
            if (context == null || (bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth")) == null) {
                return null;
            }
            return bluetoothManager.getConnectedDevices(7);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public synchronized void h() {
        try {
            this.f8683n = false;
            f fVar = this.i;
            if (fVar != null) {
                fVar.removeCallbacksAndMessages(null);
                this.i = null;
            }
            HandlerThread handlerThread = this.h;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.h = null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public String i() {
        BluetoothAdapter bluetoothAdapter = this.k;
        if (bluetoothAdapter == null) {
            return "null";
        }
        try {
            return this.k.getState() + "(" + (bluetoothAdapter.isEnabled() ? ExifInterface.GPS_DIRECTION_TRUE : UserInfo.SEX_FEMALE) + ")";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "exception";
        }
    }

    public static synchronized e a() {
        e eVar = f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        f = eVar2;
        return eVar2;
    }

    public synchronized boolean d() {
        return this.f8682l;
    }

    public synchronized boolean e() {
        if (this.k == null) {
            printLogMessage(getGeneralLogInfo(null, "failed to stop scanning,is null...", com.lifesense.plugin.ble.b.a.a.Scan_Message, null, true));
            this.f8682l = false;
            return false;
        }
        if (!c() || !b()) {
            b(false);
            return d();
        }
        try {
            this.k.stopLeScan(this);
        } catch (Exception e2) {
            com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Scan_Message, true, "failed to calling stopLeScan,has exception....", null);
            e2.printStackTrace();
        }
        printLogMessage(getGeneralLogInfo(null, "stop scan now....", com.lifesense.plugin.ble.b.a.a.Stop_Scan, null, true));
        b(false);
        return true;
    }

    public synchronized boolean g() {
        return this.o;
    }

    private synchronized void b(boolean z) {
        this.f8682l = z;
    }

    public boolean c() {
        com.lifesense.plugin.ble.b.b generalLogInfo;
        if (l() == null) {
            generalLogInfo = getGeneralLogInfo(null, "bluetooth is unavailable,no context.", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true);
        } else {
            int state = this.k.getState();
            if (this.k.isEnabled() && state == 12) {
                return true;
            }
            generalLogInfo = getGeneralLogInfo(null, "bluetooth is unavailable,state=:" + state + "; isEnable=" + this.k.isEnabled(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true);
        }
        printLogMessage(generalLogInfo);
        return false;
    }

    public void a(BluetoothGatt bluetoothGatt, String str) {
        if (bluetoothGatt == null) {
            printLogMessage(getGeneralLogInfo(str, "failed to send discover service request,is null...", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            return;
        }
        Message messageObtainMessage = this.i.obtainMessage();
        messageObtainMessage.obj = bluetoothGatt;
        messageObtainMessage.arg1 = 3;
        this.i.sendMessage(messageObtainMessage);
    }

    public boolean b() {
        String str;
        Context context = this.g;
        if (context == null) {
            str = "unsupported low energy,no context...";
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                try {
                    if (packageManager.hasSystemFeature("android.hardware.bluetooth_le")) {
                        return true;
                    }
                    printLogMessage(getGeneralLogInfo(null, "unsupported low energy,no system feature...", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                    return false;
                } catch (Exception e2) {
                    printLogMessage(getGeneralLogInfo(null, e2.toString(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                    return true;
                }
            }
            str = "unsupported low energy,failed to get package manager...";
        }
        printLogMessage(getGeneralLogInfo(null, str, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        return false;
    }

    public void a(BluetoothGatt bluetoothGatt, String str, com.lifesense.plugin.ble.a.a.g gVar) {
        if (bluetoothGatt == null) {
            printLogMessage(getGeneralLogInfo(str, "faield to close gatt,is null....[" + str + "]", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            gVar.a(str, false);
            return;
        }
        this.p = gVar;
        printLogMessage(getGeneralLogInfo(str, "close gatt:" + com.lifesense.plugin.ble.c.b.a(bluetoothGatt), com.lifesense.plugin.ble.b.a.a.Close_Gatt_Request, null, true));
        HandlerMessage handlerMessage = new HandlerMessage();
        handlerMessage.setGatt(bluetoothGatt);
        handlerMessage.setMacAddress(str);
        Message messageObtainMessage = this.i.obtainMessage();
        messageObtainMessage.obj = handlerMessage;
        messageObtainMessage.arg1 = 5;
        this.i.sendMessage(messageObtainMessage);
    }

    public boolean b(BluetoothGatt bluetoothGatt, String str) {
        f fVar;
        if (bluetoothGatt == null || (fVar = this.i) == null) {
            printLogMessage(getGeneralLogInfo(str, "failed to cancel device's connection,no gattObj", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            return false;
        }
        Message messageObtainMessage = fVar.obtainMessage();
        messageObtainMessage.obj = bluetoothGatt;
        messageObtainMessage.arg1 = 4;
        this.i.sendMessage(messageObtainMessage);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.lifesense.plugin.ble.a.a.b bVar) {
        String strA;
        try {
            BluetoothDevice bluetoothDeviceB = bVar.b();
            BluetoothGattCallback bluetoothGattCallbackC = bVar.c();
            strA = com.lifesense.plugin.ble.c.b.a(bluetoothDeviceB.getAddress());
            try {
                BluetoothGatt bluetoothGattConnectGatt = bluetoothDeviceB.connectGatt(this.g, false, bluetoothGattCallbackC);
                if (bluetoothGattConnectGatt == null) {
                    this.p.a(strA, null, false);
                    return;
                }
                a(bluetoothDeviceB.getAddress(), bluetoothGattCallbackC, bluetoothGattConnectGatt, PhoneBrand.MEIZU == com.lifesense.plugin.ble.c.b.a() ? bluetoothGattConnectGatt.connect() : false);
                b(strA, bluetoothGattConnectGatt);
                this.p.a(strA, bluetoothGattConnectGatt, true);
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                this.p.a(strA, null, false);
            }
        } catch (Exception e3) {
            e = e3;
            strA = null;
        }
    }

    private boolean b(String str, BluetoothGatt bluetoothGatt) {
        if (!a(str, bluetoothGatt)) {
            return false;
        }
        String str2 = "faield to refresh gatt servie,has exception...";
        try {
            Method method = bluetoothGatt.getClass().getMethod("refresh", new Class[0]);
            if (method == null) {
                return false;
            }
            boolean zBooleanValue = ((Boolean) method.invoke(bluetoothGatt, new Object[0])).booleanValue();
            str2 = "refresh service=" + com.lifesense.plugin.ble.c.b.a(bluetoothGatt) + "; device=" + str + "; status=" + zBooleanValue;
            com.lifesense.plugin.ble.b.d.a().a(str, com.lifesense.plugin.ble.b.a.a.Refresh_Service, zBooleanValue, str2, null);
            return zBooleanValue;
        } catch (Exception e2) {
            e2.printStackTrace();
            com.lifesense.plugin.ble.b.d.a().a(str, com.lifesense.plugin.ble.b.a.a.Refresh_Service, false, str2, null);
            return false;
        }
    }

    private void a(String str, BluetoothGattCallback bluetoothGattCallback, BluetoothGatt bluetoothGatt, boolean z) {
        String str2;
        boolean z2;
        if (bluetoothGatt != null) {
            str2 = bluetoothGatt.toString() + "; reconnectStatus=" + z;
            z2 = true;
        } else {
            str2 = "gattObj=null";
            z2 = false;
        }
        String str3 = str2;
        StringBuilder sb = new StringBuilder();
        sb.append("try to connect bluetooth device[");
        sb.append(str);
        sb.append("] ; ");
        sb.append(str3);
        com.lifesense.plugin.ble.b.d.a().a(str, com.lifesense.plugin.ble.b.a.a.Connect_Device, z2, str3, null);
    }

    public synchronized void a(boolean z) {
        this.o = z;
    }

    public synchronized boolean a(Context context) {
        boolean z = this.f8683n;
        if (z) {
            return z;
        }
        if (context == null) {
            return false;
        }
        this.o = false;
        this.f8683n = true;
        this.g = context;
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        this.f8681j = bluetoothManager;
        this.k = bluetoothManager.getAdapter();
        HandlerThread handlerThread = new HandlerThread("GattHandlerThread");
        this.h = handlerThread;
        handlerThread.start();
        this.i = new f(this, context.getMainLooper());
        this.h.setPriority(10);
        b(false);
        return true;
    }

    public boolean a(com.lifesense.plugin.ble.a.a.b bVar, com.lifesense.plugin.ble.a.a.g gVar) {
        if (this.i == null) {
            printLogMessage(getGeneralLogInfo(null, "failed to connect device,has exceptoin...", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            gVar.a(null, null, false);
            return false;
        }
        if (bVar == null || bVar.a()) {
            gVar.a(null, null, false);
            return false;
        }
        this.p = gVar;
        Message messageObtainMessage = this.i.obtainMessage();
        messageObtainMessage.obj = bVar;
        messageObtainMessage.arg1 = 1;
        this.i.sendMessage(messageObtainMessage);
        return true;
    }

    public synchronized boolean a(d dVar) {
        boolean zStartLeScan = false;
        if (dVar != null) {
            if (l() != null) {
                if (!c() || !b()) {
                    printLogMessage(getGeneralLogInfo(null, "no permission to call start scan,ble status=" + c(), com.lifesense.plugin.ble.b.a.a.Scan_Message, null, true));
                    b(false);
                    return d();
                }
                b(true);
                this.m = dVar;
                try {
                    this.k.cancelDiscovery();
                    zStartLeScan = this.k.startLeScan(this);
                } catch (Exception e2) {
                    printLogMessage(getSupperLogInfo(null, "failed to calling startLeScan,has exception....", com.lifesense.plugin.ble.b.a.a.Scan_Message, null, false));
                    e2.printStackTrace();
                }
                if (zStartLeScan) {
                    printLogMessage(getGeneralLogInfo(null, "success to start scanning;" + com.lifesense.plugin.ble.c.f.g(this.g), com.lifesense.plugin.ble.b.a.a.Start_Scan, null, zStartLeScan));
                } else {
                    printLogMessage(getGeneralLogInfo(null, "failed to start scan,status=" + zStartLeScan, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, zStartLeScan));
                    dVar.a();
                }
                return zStartLeScan;
            }
        }
        printLogMessage(getGeneralLogInfo(null, "failed to start scanning,is null=" + this.k, com.lifesense.plugin.ble.b.a.a.Scan_Message, null, true));
        return false;
    }

    private boolean a(String str, BluetoothGatt bluetoothGatt) {
        q qVarD;
        if (bluetoothGatt != null && bluetoothGatt.getDevice() != null && str != null) {
            LSManagerStatus managerStatus = LSBluetoothManager.getInstance().getManagerStatus();
            if (LSManagerStatus.Upgrading == managerStatus) {
                return com.lifesense.plugin.ble.device.a.a.a.a().b(str) != null;
            }
            if (LSManagerStatus.Syncing == managerStatus && (qVarD = u.a().d(str)) != null && (qVarD instanceof o) && qVarD.c() < 2) {
                return true;
            }
        }
        return false;
    }
}
