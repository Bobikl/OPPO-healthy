package com.lifesense.android.bluetooth.core.system;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import com.lifesense.android.bluetooth.core.bean.BleScanResults;
import com.lifesense.android.bluetooth.core.bean.HandlerMessage;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.bean.constant.BluetoothStatus;
import com.lifesense.android.bluetooth.core.business.log.d;
import com.lifesense.android.bluetooth.core.tools.h;
import com.lifesense.android.bluetooth.core.tools.k;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi"})
public final class b extends com.lifesense.android.bluetooth.core.business.log.a implements BluetoothAdapter.LeScanCallback {
    public static final String u = "b";
    public static b v;
    public Context a;
    public HandlerThread b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f8626c;
    public BluetoothManager d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BluetoothAdapter f8627e;
    public boolean f;
    public com.lifesense.android.bluetooth.core.system.a g;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8628j;
    public BluetoothStatus k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8629l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8630n;
    public boolean o;
    public com.lifesense.android.bluetooth.core.system.connect.b p;
    public BluetoothLeScanner q;
    public Object r;
    public List<String> s = new ArrayList();
    public Runnable t = new RunnableC0831b();
    public boolean h = false;

    public class a extends ScanCallback {
        public a() {
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(List<ScanResult> list) {
            super.onBatchScanResults(list);
            if (list == null || list.size() <= 0) {
                return;
            }
            Iterator<ScanResult> it = list.iterator();
            while (it.hasNext()) {
                onScanResult(1, it.next());
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i) {
            super.onScanFailed(i);
            b bVar = b.this;
            bVar.printLogMessage(bVar.getPrintLogInfo("Scan Error Code :" + i, 1));
            if (i == 2) {
                h.b(b.this.f8627e);
            }
            b.this.g.onScanFailure();
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i, ScanResult scanResult) {
            String deviceName;
            if (b.this.m()) {
                if (scanResult.getDevice().getAddress() != null) {
                    if (b.this.s.contains(scanResult.getDevice().getAddress())) {
                        return;
                    } else {
                        b.this.s.add(scanResult.getDevice().getAddress());
                    }
                }
                super.onScanResult(i, scanResult);
                if (b.this.g != null) {
                    BleScanResults bleScanResults = new BleScanResults();
                    bleScanResults.setDevice(scanResult.getDevice());
                    if (scanResult.getDevice().getName() == null) {
                        if (scanResult.getScanRecord().getDeviceName() != null) {
                            deviceName = scanResult.getScanRecord().getDeviceName();
                        }
                        bleScanResults.setRssi(scanResult.getRssi());
                        bleScanResults.setScanRecord(scanResult.getScanRecord().getBytes());
                        b.this.g.a(bleScanResults);
                    }
                    deviceName = scanResult.getDevice().getName();
                    bleScanResults.setName(deviceName);
                    bleScanResults.setRssi(scanResult.getRssi());
                    bleScanResults.setScanRecord(scanResult.getScanRecord().getBytes());
                    b.this.g.a(bleScanResults);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.lifesense.android.bluetooth.core.system.b$b, reason: collision with other inner class name */
    public class RunnableC0831b implements Runnable {
        public RunnableC0831b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.k == BluetoothStatus.BLUETOOTH_TURNING_OFF_WITH_CODE) {
                if (b.this.i()) {
                    b.this.a();
                }
                b.this.h();
            } else {
                if (b.this.k != BluetoothStatus.BLUETOOTH_TURNING_ON_WITH_CODE && b.this.k != BluetoothStatus.BLUETOOTH_STATE_OFF_WITH_CODE) {
                    return;
                }
                if (b.this.i()) {
                    d.d().a(null, com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, true, "failed to enable bluetooth again,no permission..", null);
                    return;
                }
            }
            b.this.c();
            b.this.h();
        }
    }

    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        public final void a(BluetoothGatt bluetoothGatt) {
            if (bluetoothGatt != null) {
                try {
                    if (bluetoothGatt.getDevice() != null) {
                        String address = bluetoothGatt.getDevice().getAddress();
                        b bVar = b.this;
                        bVar.printLogMessage(bVar.getAdvancedLogInfo(address, "close done device[" + address + "]", com.lifesense.android.bluetooth.core.business.log.report.a.Close_Gatt, null, true));
                        return;
                    }
                } catch (Exception e2) {
                    b bVar2 = b.this;
                    bVar2.printLogMessage(bVar2.getAdvancedLogInfo(null, "close gatt has exception...", com.lifesense.android.bluetooth.core.business.log.report.a.Close_Gatt, null, true));
                    e2.printStackTrace();
                    return;
                }
            }
            b bVar3 = b.this;
            bVar3.printLogMessage(bVar3.getAdvancedLogInfo(null, "close done device=null", com.lifesense.android.bluetooth.core.business.log.report.a.Close_Gatt, null, true));
        }

        public final void b(BluetoothGatt bluetoothGatt) {
            if (bluetoothGatt != null) {
                try {
                    if (bluetoothGatt.getDevice() != null) {
                        String address = bluetoothGatt.getDevice().getAddress();
                        b bVar = b.this;
                        bVar.printLogMessage(bVar.getAdvancedLogInfo(address, "disconnect done device=[" + address + "]", com.lifesense.android.bluetooth.core.business.log.report.a.Cancel_Connection, null, true));
                        return;
                    }
                } catch (Exception e2) {
                    b bVar2 = b.this;
                    bVar2.printLogMessage(bVar2.getAdvancedLogInfo(null, "cancel connection has exception...", com.lifesense.android.bluetooth.core.business.log.report.a.Cancel_Connection, null, true));
                    e2.printStackTrace();
                    return;
                }
            }
            b bVar3 = b.this;
            bVar3.printLogMessage(bVar3.getAdvancedLogInfo(null, "disconnect done", com.lifesense.android.bluetooth.core.business.log.report.a.Cancel_Connection, null, true));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj;
            if (message == null) {
                b bVar = b.this;
                bVar.printLogMessage(bVar.getGeneralLogInfo(null, "failed to handle gatt message,no message...", com.lifesense.android.bluetooth.core.business.log.report.a.Program_Exception, null, true));
                return;
            }
            try {
                int i = message.arg1;
                if (i == 1) {
                    b.this.a((com.lifesense.android.bluetooth.core.system.gatt.common.d) message.obj);
                    return;
                }
                if (i == 3) {
                    ((BluetoothGatt) message.obj).discoverServices();
                    return;
                }
                if (i == 4) {
                    BluetoothGatt bluetoothGatt = (BluetoothGatt) message.obj;
                    bluetoothGatt.disconnect();
                    b(bluetoothGatt);
                    return;
                }
                if (i == 5) {
                    HandlerMessage handlerMessage = (HandlerMessage) message.obj;
                    BluetoothGatt gatt = handlerMessage.getGatt();
                    String macAddress = handlerMessage.getMacAddress();
                    b.this.a(macAddress, gatt);
                    gatt.close();
                    a(gatt);
                    b.this.p.a(macAddress, true);
                    return;
                }
                if (i == 7 && (obj = message.obj) != null && (obj instanceof BluetoothGatt)) {
                    BluetoothGatt bluetoothGatt2 = (BluetoothGatt) obj;
                    String str = "init gatt reconnect: device=" + bluetoothGatt2.getDevice() + "; status=" + bluetoothGatt2.connect();
                    b bVar2 = b.this;
                    bVar2.printLogMessage(bVar2.getGeneralLogInfo(null, str, com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true));
                }
            } catch (Exception unused) {
                String str2 = "failed to handle gatt message,has exception:" + message.arg1 + "; obj=" + message.obj;
                b bVar3 = b.this;
                bVar3.printLogMessage(bVar3.getGeneralLogInfo(null, str2, com.lifesense.android.bluetooth.core.business.log.report.a.Program_Exception, null, true));
            }
        }
    }

    public static synchronized b getInstance() {
        if (v == null) {
            v = new b();
        }
        return v;
    }

    public final ScanCallback b() {
        return new a();
    }

    public BluetoothAdapter d() {
        BluetoothAdapter bluetoothAdapter = this.f8627e;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter;
        }
        if (this.a == null) {
            printLogMessage(getGeneralLogInfo(null, "failed to get bluetooth adapter,no context.", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
        } else {
            try {
                printLogMessage(getGeneralLogInfo(null, "get bluetooth adapter again,state=" + e(), com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
                BluetoothManager bluetoothManager = (BluetoothManager) this.a.getSystemService("bluetooth");
                this.d = bluetoothManager;
                BluetoothAdapter adapter = bluetoothManager.getAdapter();
                this.f8627e = adapter;
                return adapter;
            } catch (Exception e2) {
                printLogMessage(getGeneralLogInfo(null, "failed to get bluetooth adapter,has exception....", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
                e2.printStackTrace();
            }
        }
        return this.f8627e;
    }

    public synchronized void destoryInstance() {
        try {
            this.h = false;
            c cVar = this.f8626c;
            if (cVar != null) {
                cVar.removeCallbacksAndMessages(null);
                this.f8626c = null;
            }
            HandlerThread handlerThread = this.b;
            if (handlerThread != null) {
                if (handlerThread.isAlive()) {
                    this.b.quitSafely();
                }
                this.b = null;
            }
        } catch (Exception e2) {
            printLogMessage(getGeneralLogInfo(null, "faield to destoryInstance gatt handler thread,has exception ..." + e2.getMessage(), com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
        }
    }

    public BluetoothDevice e(String str) {
        BluetoothAdapter bluetoothAdapter;
        if (!TextUtils.isEmpty(str) && (bluetoothAdapter = this.f8627e) != null) {
            try {
                return bluetoothAdapter.getRemoteDevice(str);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public synchronized boolean k() {
        return this.m;
    }

    public boolean l() {
        com.lifesense.android.bluetooth.core.business.log.report.a aVar;
        String str;
        String str2;
        Context context = this.a;
        if (context == null) {
            aVar = com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message;
            str = null;
            str2 = "unsupported low energy,no context...";
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                try {
                    if (packageManager.hasSystemFeature("android.hardware.bluetooth_le")) {
                        return true;
                    }
                    printLogMessage(getGeneralLogInfo(null, "unsupported low energy,no system feature...", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
                    return false;
                } catch (Exception e2) {
                    printLogMessage(getGeneralLogInfo(null, e2.toString(), com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
                    return true;
                }
            }
            aVar = com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message;
            str = null;
            str2 = "unsupported low energy,failed to get package manager...";
        }
        printLogMessage(getGeneralLogInfo(str, str2, aVar, null, true));
        return false;
    }

    public synchronized boolean m() {
        return v.f;
    }

    public final boolean n() {
        ScanSettings scanSettingsBuild = new ScanSettings.Builder().setScanMode(2).build();
        if (this.q == null) {
            this.q = this.f8627e.getBluetoothLeScanner();
        }
        BluetoothLeScanner bluetoothLeScanner = this.q;
        if (bluetoothLeScanner != null) {
            bluetoothLeScanner.startScan(new ArrayList(), scanSettingsBuild, (ScanCallback) this.r);
            return true;
        }
        BluetoothAdapter bluetoothAdapter = this.f8627e;
        return bluetoothAdapter != null && bluetoothAdapter.startLeScan(this);
    }

    public final void o() {
        this.s.clear();
        BluetoothLeScanner bluetoothLeScanner = this.q;
        if (bluetoothLeScanner != null) {
            bluetoothLeScanner.stopScan((ScanCallback) this.r);
        } else {
            this.f8627e.stopLeScan(this);
        }
    }

    @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
    public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        if (!m() || this.g == null || bluetoothDevice == null || bArr == null) {
            return;
        }
        if (bluetoothDevice.getAddress() != null) {
            if (this.s.contains(bluetoothDevice.getAddress())) {
                return;
            } else {
                this.s.add(bluetoothDevice.getAddress());
            }
        }
        BleScanResults bleScanResults = new BleScanResults();
        bleScanResults.setDevice(bluetoothDevice);
        if (bluetoothDevice.getName() != null) {
            bleScanResults.setName(bluetoothDevice.getName());
        }
        bleScanResults.setRssi(i);
        bleScanResults.setScanRecord(bArr);
        this.g.a(bleScanResults);
    }

    @SuppressLint({"DefaultLocale"})
    public final String f(String str) {
        return str;
    }

    public final synchronized void h() {
        int i = this.i;
        int i2 = 10000;
        if (i == 2) {
            i2 = 10000 * (i + 1);
        } else if (i == 3) {
            i2 = 60000;
        } else if (i == 4) {
            i2 = 120000;
        } else if (i >= 5) {
            i2 = 300000;
        }
        this.f8630n = i2;
        this.f8626c.postDelayed(this.t, i2);
    }

    public synchronized boolean j() {
        return this.f8629l;
    }

    public BluetoothDevice d(String str) {
        if (str == null) {
            return null;
        }
        List<BluetoothDevice> listF = f();
        if (CollectionUtils.isEmpty(listF)) {
            return null;
        }
        for (BluetoothDevice bluetoothDevice : listF) {
            if (bluetoothDevice != null && str.equalsIgnoreCase(bluetoothDevice.getAddress())) {
                return bluetoothDevice;
            }
        }
        return null;
    }

    public List<BluetoothDevice> f() {
        try {
            Context context = this.a;
            if (context == null) {
                return null;
            }
            BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
            if (bluetoothManager != null) {
                return bluetoothManager.getConnectedDevices(7);
            }
        } catch (Exception unused) {
            printLogMessage(getGeneralLogInfo(null, "failed to getConnectedBleDevices,is null...", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, false));
        }
        return Collections.emptyList();
    }

    public synchronized boolean g() {
        return this.o;
    }

    public boolean i() {
        try {
            if (d() == null) {
                printLogMessage(getGeneralLogInfo(null, "bluetooth is unavailable,no context.", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
                return false;
            }
            int state = this.f8627e.getState();
            if (this.f8627e.isEnabled() && state == 12) {
                return true;
            }
            printLogMessage(getGeneralLogInfo(null, "bluetooth is unavailable,state=:" + state + "; isEnable=" + this.f8627e.isEnabled(), com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public synchronized void a() {
        try {
            if (!i()) {
                return;
            }
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                b(BluetoothStatus.BLUETOOTH_TURNING_OFF_WITH_CODE);
                this.f8629l = true;
                printLogMessage(getGeneralLogInfo(null, "try to close bluetooth,status =" + defaultAdapter.disable() + ", close time >> " + (this.f8630n / 1000) + " s", com.lifesense.android.bluetooth.core.business.log.report.a.Close_Bluetooth, null, true));
            }
        } catch (Exception e2) {
            printLogMessage(getGeneralLogInfo(null, "failed to close bluetooth,has exception......" + e2.getMessage(), com.lifesense.android.bluetooth.core.business.log.report.a.Close_Bluetooth, null, false));
        }
    }

    public void b(BluetoothGatt bluetoothGatt, String str) {
        if (bluetoothGatt == null) {
            printLogMessage(getGeneralLogInfo(str, "failed to send discover service request,is null...", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            return;
        }
        Message messageObtainMessage = this.f8626c.obtainMessage();
        messageObtainMessage.obj = bluetoothGatt;
        messageObtainMessage.arg1 = 3;
        this.f8626c.sendMessage(messageObtainMessage);
    }

    public synchronized boolean c() {
        boolean zEnable = false;
        try {
            if (i()) {
                return true;
            }
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                b(BluetoothStatus.BLUETOOTH_TURNING_ON_WITH_CODE);
                this.m = true;
                zEnable = defaultAdapter.enable();
                this.f8628j++;
                printLogMessage(getGeneralLogInfo(null, "try to enable bluetooth,status =" + zEnable + "; count=" + this.f8628j, com.lifesense.android.bluetooth.core.business.log.report.a.Enable_Bluetooth, null, true));
            }
        } catch (Exception e2) {
            printLogMessage(getGeneralLogInfo(null, "failed to enable bluetooth,has exception......" + e2.getMessage(), com.lifesense.android.bluetooth.core.business.log.report.a.Enable_Bluetooth, null, false));
        }
        return zEnable;
    }

    public String e() {
        BluetoothAdapter bluetoothAdapter = this.f8627e;
        if (bluetoothAdapter == null) {
            return "null";
        }
        try {
            return this.f8627e.getState() + "(" + (bluetoothAdapter.isEnabled() ? ExifInterface.GPS_DIRECTION_TRUE : UserInfo.SEX_FEMALE) + ")";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "exception";
        }
    }

    public synchronized boolean g(String str) {
        if (this.f8627e == null) {
            printLogMessage(getGeneralLogInfo(null, "failed to stop scanning,is null...", com.lifesense.android.bluetooth.core.business.log.report.a.Scan_Message, null, true));
            a(false);
            return false;
        }
        if (!i() || !l()) {
            a(false);
            return false;
        }
        try {
            if (m()) {
                o();
            }
        } catch (Exception e2) {
            d.d().a(null, com.lifesense.android.bluetooth.core.business.log.report.a.Scan_Message, true, "failed to calling stopLeScan,has exception....", null);
            e2.printStackTrace();
        }
        printLogMessage(getGeneralLogInfo(null, "stop scan now...." + str, com.lifesense.android.bluetooth.core.business.log.report.a.Stop_Scan, null, true));
        a(false);
        return true;
    }

    public void a(BluetoothGatt bluetoothGatt, String str, com.lifesense.android.bluetooth.core.system.connect.b bVar) {
        if (bluetoothGatt == null) {
            printLogMessage(getGeneralLogInfo(str, "faield to close gatt,is null....[" + str + "]", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            bVar.a(str, false);
            return;
        }
        this.p = bVar;
        printLogMessage(getGeneralLogInfo(str, "close gatt", com.lifesense.android.bluetooth.core.business.log.report.a.Close_Gatt_Request, null, true));
        HandlerMessage handlerMessage = new HandlerMessage();
        handlerMessage.setGatt(bluetoothGatt);
        handlerMessage.setMacAddress(str);
        Message messageObtainMessage = this.f8626c.obtainMessage();
        messageObtainMessage.obj = handlerMessage;
        messageObtainMessage.arg1 = 5;
        this.f8626c.sendMessage(messageObtainMessage);
    }

    public final synchronized void b(BluetoothStatus bluetoothStatus) {
        if (bluetoothStatus != null) {
            if (bluetoothStatus == this.k) {
                return;
            }
        }
        this.k = bluetoothStatus;
    }

    public synchronized void a(BluetoothStatus bluetoothStatus) {
        b(bluetoothStatus);
    }

    public synchronized void b(boolean z) {
        this.o = z;
    }

    public synchronized boolean b(com.lifesense.android.bluetooth.core.system.a aVar) {
        a(false);
        if (aVar != null && d() != null) {
            if (!i() || !l()) {
                printLogMessage(getGeneralLogInfo(null, "no permission to call start scan,ble status=" + i(), com.lifesense.android.bluetooth.core.business.log.report.a.Scan_Message, null, true));
                a(false);
                return m();
            }
            v.g = aVar;
            boolean zN = true;
            try {
                if (m()) {
                    g("stop before start......");
                }
                a(true);
                zN = n();
            } catch (Exception e2) {
                printLogMessage(getSupperLogInfo(null, "failed to calling startLeScan,has exception...." + e2.getMessage(), com.lifesense.android.bluetooth.core.business.log.report.a.Scan_Message, null, false));
                try {
                    BluetoothAdapter bluetoothAdapter = this.f8627e;
                    if (bluetoothAdapter == null || !bluetoothAdapter.startLeScan(this)) {
                        zN = false;
                    }
                } catch (Exception e3) {
                    printLogMessage(getSupperLogInfo(null, " e1 failed to calling startLeScan,has exception...." + e3.getMessage(), com.lifesense.android.bluetooth.core.business.log.report.a.Scan_Message, null, false));
                }
            }
            if (zN) {
                printLogMessage(getGeneralLogInfo(null, "success to start scanning;" + k.a(this.a), com.lifesense.android.bluetooth.core.business.log.report.a.Start_Scan, null, true));
            } else {
                g("stop before start......");
                a(false);
                printLogMessage(getGeneralLogInfo(null, "failed to start scan,status=false", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, false));
                aVar.onScanFailure();
                com.lifesense.android.bluetooth.core.business.detect.a.getInstance().a(com.lifesense.android.bluetooth.core.business.detect.common.b.SCAN_ERROR, (LsDeviceInfo) null);
            }
            return zN;
        }
        printLogMessage(getGeneralLogInfo(null, "failed to start scanning,is null=" + this.f8627e, com.lifesense.android.bluetooth.core.business.log.report.a.Scan_Message, null, true));
        return false;
    }

    public final void a(com.lifesense.android.bluetooth.core.system.gatt.common.d dVar) {
        try {
            BluetoothDevice bluetoothDeviceA = dVar.a();
            BluetoothGattCallback bluetoothGattCallbackB = dVar.b();
            BluetoothGatt bluetoothGattConnectGatt = bluetoothDeviceA.connectGatt(this.a, false, bluetoothGattCallbackB, 2);
            if (bluetoothGattConnectGatt == null) {
                com.lifesense.android.bluetooth.core.business.detect.a.getInstance().a(com.lifesense.android.bluetooth.core.business.detect.common.b.CREATE_GATT_ERROR, dVar.c());
                this.p.a(bluetoothDeviceA.getAddress(), null, false);
            } else {
                a(bluetoothDeviceA.getAddress(), bluetoothGattCallbackB, bluetoothGattConnectGatt, false);
                this.p.a(bluetoothDeviceA.getAddress(), bluetoothGattConnectGatt, true);
            }
        } catch (Exception e2) {
            d.d().a(null, com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, true, "connect device error! " + e2.getMessage(), null);
            this.p.a(dVar.a().getAddress(), null, false);
        }
    }

    public final void a(String str, BluetoothGattCallback bluetoothGattCallback, BluetoothGatt bluetoothGatt, boolean z) {
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
        d.d().a(f(str), com.lifesense.android.bluetooth.core.business.log.report.a.Connect_Device, z2, str3, null);
    }

    public final synchronized void a(boolean z) {
        this.f = z;
    }

    public boolean a(BluetoothGatt bluetoothGatt, String str) {
        c cVar;
        if (bluetoothGatt == null || (cVar = this.f8626c) == null) {
            printLogMessage(getGeneralLogInfo(str, "failed to cancel device's connection,no gattObj", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            return false;
        }
        Message messageObtainMessage = cVar.obtainMessage();
        messageObtainMessage.obj = bluetoothGatt;
        messageObtainMessage.arg1 = 4;
        this.f8626c.sendMessage(messageObtainMessage);
        return true;
    }

    public synchronized boolean a(Context context) {
        boolean z = this.h;
        if (z) {
            return z;
        }
        if (context == null) {
            return false;
        }
        this.o = false;
        this.k = BluetoothStatus.UNKNOWN;
        this.f8629l = false;
        this.m = false;
        this.i = 0;
        this.f8628j = 0;
        this.h = true;
        this.a = context;
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        this.d = bluetoothManager;
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.f8627e = adapter;
        if (adapter == null) {
            printLogMessage(getGeneralLogInfo(null, "failed get bluetooth adapter or not support bluetooth", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, false));
            return false;
        }
        this.q = adapter.getBluetoothLeScanner();
        this.r = b();
        HandlerThread handlerThread = new HandlerThread("GattHandlerThread");
        this.b = handlerThread;
        handlerThread.start();
        this.f8626c = new c(context.getMainLooper());
        this.b.setPriority(10);
        a(false);
        return true;
    }

    public boolean a(com.lifesense.android.bluetooth.core.system.a aVar) {
        boolean zB = false;
        if (d() != null && i() && l()) {
            if (this.q == null) {
                this.q = this.f8627e.getBluetoothLeScanner();
            }
            zB = this.q != null;
            if (!zB) {
                try {
                    zB = b(aVar);
                } catch (Exception unused) {
                } finally {
                    g("101");
                }
            }
        }
        return zB;
    }

    public boolean a(com.lifesense.android.bluetooth.core.system.gatt.common.d dVar, com.lifesense.android.bluetooth.core.system.connect.b bVar) {
        if (this.f8626c == null) {
            printLogMessage(getGeneralLogInfo(null, "failed to connect device,has exceptoin...", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            bVar.a(null, null, false);
            return false;
        }
        if (dVar == null || dVar.e()) {
            bVar.a(null, null, false);
            return false;
        }
        this.p = bVar;
        Message messageObtainMessage = this.f8626c.obtainMessage();
        messageObtainMessage.obj = dVar;
        messageObtainMessage.arg1 = 1;
        this.f8626c.sendMessage(messageObtainMessage);
        return true;
    }

    public final boolean a(String str, BluetoothGatt bluetoothGatt) {
        String str2;
        String strF = f(str);
        try {
            Method method = BluetoothGatt.class.getMethod("refresh", new Class[0]);
            if (method == null) {
                return false;
            }
            method.setAccessible(true);
            boolean zBooleanValue = ((Boolean) method.invoke(bluetoothGatt, new Object[0])).booleanValue();
            String str3 = "refresh service device=" + strF + "; status=" + zBooleanValue;
            try {
                d.d().a(strF, com.lifesense.android.bluetooth.core.business.log.report.a.Refresh_Service, zBooleanValue, str3, null);
                return zBooleanValue;
            } catch (Exception unused) {
                str2 = str3;
            }
        } catch (Exception unused2) {
            str2 = "faield to refresh gatt servie,has exception...";
        }
        Log.e(u, str2);
        d.d().a(strF, com.lifesense.android.bluetooth.core.business.log.report.a.Refresh_Service, false, str2, null);
        return false;
    }
}
