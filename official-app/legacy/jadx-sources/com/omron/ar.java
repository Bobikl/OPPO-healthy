package com.omron;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import com.omron.lib.common.OMRONBLECallbackBase;
import com.omron.lib.common.OMRONBLEErrMsg;
import com.omron.lib.model.bg.BGData;
import com.omron.lib.model.bg.Meal;
import com.omron.lib.model.bg.Unit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class ar extends as {
    public static final UUID D = UUID.fromString("00001808-0000-1000-8000-00805f9b34fb");
    public static final UUID E = UUID.fromString("0000180F-0000-1000-8000-00805f9b34fb");
    private static final UUID F = UUID.fromString("00002A18-0000-1000-8000-00805f9b34fb");
    private static final UUID G = UUID.fromString("00002A34-0000-1000-8000-00805f9b34fb");
    private static final UUID H = UUID.fromString("00002A52-0000-1000-8000-00805f9b34fb");
    private static final UUID I = UUID.fromString("00002A19-0000-1000-8000-00805f9b34fb");
    private static final UUID J = UUID.fromString("0000FFF0-0000-1000-8000-00805f9b34fb");
    private static final UUID K = UUID.fromString("0000FFF1-0000-1000-8000-00805f9b34fb");
    private static final UUID L = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    private int A;
    private int B;
    private boolean C;
    private final SparseArray<BGData> t;
    private BluetoothGattCharacteristic u;
    private BluetoothGattCharacteristic v;
    private BluetoothGattCharacteristic w;
    private BluetoothGattCharacteristic x;
    private BluetoothGattCharacteristic y;
    private b z;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Unit.values().length];
            a = iArr;
            try {
                iArr[Unit.UNIT_MGPL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Unit.UNIT_MMOLPL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface b extends OMRONBLECallbackBase {
        void a(int i, int i2);

        void a(List<BGData> list);
    }

    public ar(BluetoothDevice bluetoothDevice, Context context, br brVar) {
        super(bluetoothDevice, context, brVar);
        this.t = new SparseArray<>();
        this.C = false;
    }

    private void b(BluetoothGatt bluetoothGatt) {
        Log.i(as.s, "enableGlucoseMeasurementNotification() begin");
        bluetoothGatt.setCharacteristicNotification(this.u, true);
        BluetoothGattDescriptor descriptor = this.u.getDescriptor(L);
        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        bluetoothGatt.writeDescriptor(descriptor);
    }

    private String c(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        StringBuilder sb = new StringBuilder();
        byte[] value = bluetoothGattCharacteristic.getValue();
        for (int i = 0; i < value.length; i++) {
            if (Integer.toHexString(bluetoothGattCharacteristic.getIntValue(17, i).intValue()).length() == 1) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(bluetoothGattCharacteristic.getIntValue(17, i).intValue()));
            sb.append(" ");
        }
        return sb.toString();
    }

    private void e(final int i) {
        Log.i(as.s, "fetchDataNum begin" + i);
        if (i < 0) {
            new Thread(new Runnable() { // from class: com.oplus.aiunit.vision.oem
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.i();
                }
            }).start();
        } else {
            new Thread(new Runnable() { // from class: com.oplus.aiunit.vision.pem
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.d(i);
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        try {
            Thread.sleep(500L);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.w;
        a(bluetoothGattCharacteristic, 4, 1, new Integer[0]);
        Log.e(as.s, "readDataNum1 631 读取指令 " + ek.a(bluetoothGattCharacteristic.getValue()));
        this.f8819e.writeCharacteristic(bluetoothGattCharacteristic);
    }

    private void j() {
        Log.i(as.s, "readData() fetchData begin 开始读取");
        this.C = true;
        final BluetoothGattCharacteristic bluetoothGattCharacteristic = this.w;
        int i = this.A;
        ((i == -1 || i < 0) ? new Thread(new Runnable() { // from class: com.oplus.aiunit.vision.nem
            @Override // java.lang.Runnable
            public final void run() {
                this.i.a(bluetoothGattCharacteristic);
            }
        }) : new Thread(new Runnable() { // from class: com.oplus.aiunit.vision.mem
            @Override // java.lang.Runnable
            public final void run() {
                this.i.b(bluetoothGattCharacteristic);
            }
        })).start();
    }

    public void a(int i, b bVar) {
        Log.i(as.s, "readData offset  : " + i);
        this.i = false;
        this.C = false;
        this.z = bVar;
        this.A = i;
        if (this.f != ap.STATE_CONNECTED) {
            if (bVar != null) {
                bVar.onFailure(OMRONBLEErrMsg.OMRON_BLE_ERROR_DEVICE_NOT_CONNECT);
            }
        } else if (this.f8819e != null && this.w != null) {
            this.t.clear();
            e(i);
        } else if (bVar != null) {
            bVar.onFailure(OMRONBLEErrMsg.OMRON_BLE_ERROR_DEVICE_NOT_SUPPORT);
        }
    }

    @Override // com.omron.as
    public void d() {
        try {
            Thread.sleep(1500L);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        this.f8819e.discoverServices();
    }

    public void h() {
        BluetoothGatt bluetoothGatt = this.f8819e;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
        }
        g();
        BluetoothGatt bluetoothGatt2 = this.f8819e;
        if (bluetoothGatt2 != null) {
            bluetoothGatt2.close();
            this.t.clear();
            this.u = null;
            this.v = null;
            this.w = null;
            this.x = null;
            this.f8819e = null;
        }
    }

    public boolean k() {
        String str = as.s;
        Log.i(str, "requestCustomTimeSync 请求时间同步 ");
        a(this.y, new GregorianCalendar());
        Log.e(str, "setCustomTimeSync 设置自定义时间同步 " + ek.a(this.y.getValue()));
        try {
            return this.f8819e.writeCharacteristic(this.y);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private void a(BluetoothGatt bluetoothGatt) {
        Log.i(as.s, "enableGlucoseMeasurementContextNotification() begin");
        bluetoothGatt.setCharacteristicNotification(this.v, true);
        BluetoothGattDescriptor descriptor = this.v.getDescriptor(L);
        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        bluetoothGatt.writeDescriptor(descriptor);
    }

    private void c(BluetoothGatt bluetoothGatt) {
        Log.i(as.s, "enableRecordAccessControlPointIndication() begin");
        bluetoothGatt.setCharacteristicNotification(this.w, true);
        BluetoothGattDescriptor descriptor = this.w.getDescriptor(L);
        descriptor.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
        bluetoothGatt.writeDescriptor(descriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i) {
        try {
            Thread.sleep(500L);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.w;
        if (bluetoothGattCharacteristic == null) {
            this.z.onFailure(OMRONBLEErrMsg.OMRON_BLE_ERROR_DEVICE_BOND_STATE_ERROR);
            return;
        }
        a(bluetoothGattCharacteristic, 4, 3, Integer.valueOf(i));
        Log.e(as.s, "readDataNum2 631 读取指令 " + ek.a(bluetoothGattCharacteristic.getValue()));
        this.f8819e.writeCharacteristic(bluetoothGattCharacteristic);
    }

    @Override // com.omron.as
    public void b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        String str = as.s;
        Log.i(str, "自定义 onMyCharacteristicWrite " + i);
        Log.i(str, "自定义 onMyCharacteristicWrite " + ek.a(bluetoothGattCharacteristic.getValue()));
    }

    public boolean l() {
        String str = as.s;
        Log.i(str, "requestTimeSyncForOldMeter 请求时间同步 ");
        d(this.w);
        Log.e(str, "setCustomTimeSync 设置自定义时间同步 " + ek.a(this.w.getValue()));
        try {
            return this.f8819e.writeCharacteristic(this.w);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        try {
            Thread.sleep(500L);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        a(bluetoothGattCharacteristic, 1, 3, Integer.valueOf(this.A));
        this.f8819e.writeCharacteristic(bluetoothGattCharacteristic);
        Log.e(as.s, " readData sksksksksk2 读取指令 racpCharacteristic " + ek.a(bluetoothGattCharacteristic.getValue()));
        this.f8819e.writeCharacteristic(bluetoothGattCharacteristic);
    }

    private void d(BluetoothGatt bluetoothGatt) {
        Log.i(as.s, "enableTimeSyncNotification() 开启时间同步通知");
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.y;
        if (bluetoothGattCharacteristic == null) {
            return;
        }
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
        BluetoothGattDescriptor descriptor = this.y.getDescriptor(L);
        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        bluetoothGatt.writeDescriptor(descriptor);
    }

    @Override // com.omron.as
    public void a(BluetoothGatt bluetoothGatt, int i) {
        as.g gVar;
        OMRONBLEErrMsg oMRONBLEErrMsg;
        if (i == 0) {
            Log.e(as.s, "onServicesDiscovered  ");
            for (BluetoothGattService bluetoothGattService : bluetoothGatt.getServices()) {
                Log.e(as.s, "onServicesDiscovered  uuid ： " + bluetoothGattService.getUuid());
                if (D.equals(bluetoothGattService.getUuid())) {
                    this.u = bluetoothGattService.getCharacteristic(F);
                    this.v = bluetoothGattService.getCharacteristic(G);
                    this.w = bluetoothGattService.getCharacteristic(H);
                } else if (E.equals(bluetoothGattService.getUuid())) {
                    this.x = bluetoothGattService.getCharacteristic(I);
                } else if (J.equals(bluetoothGattService.getUuid())) {
                    BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(K);
                    this.y = characteristic;
                    if (characteristic != null) {
                        bluetoothGatt.setCharacteristicNotification(characteristic, true);
                    }
                }
            }
            if (this.u == null || this.w == null) {
                a(this.d);
                return;
            }
            Log.e(as.s, "getBondState " + bluetoothGatt.getDevice().getBondState());
            if (bluetoothGatt.getDevice().getBondState() == 12) {
                b(bluetoothGatt);
                return;
            } else {
                a(this.d);
                gVar = this.d;
                oMRONBLEErrMsg = OMRONBLEErrMsg.OMRON_BLE_ERROR_DEVICE_CAN_NOT_CONNECT;
            }
        } else {
            Log.e(as.s, "onServicesDiscovered error " + i);
            gVar = this.d;
            oMRONBLEErrMsg = OMRONBLEErrMsg.OMRON_BLE_ERROR_DEVICE_DISCOVER_SERVICE;
        }
        gVar.onFailure(oMRONBLEErrMsg);
    }

    @Override // com.omron.as
    public void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        ArrayList arrayList;
        b bVar;
        String str;
        Meal meal;
        float fFloatValue;
        float f;
        UUID uuid = bluetoothGattCharacteristic.getUuid();
        String str2 = as.s;
        Log.i(str2, "onCharacteristicChanged GM_CHARACTERISTIC uuid is " + uuid);
        if (F.equals(uuid)) {
            Log.i(str2, "onCharacteristicChanged GM_CHARACTERISTIC");
            Log.i(str2, " GZR -- > " + c(bluetoothGattCharacteristic));
            int iIntValue = bluetoothGattCharacteristic.getIntValue(17, 0).intValue();
            boolean z = (iIntValue & 1) > 0;
            i = (iIntValue & 2) > 0 ? 1 : 0;
            Unit unit = (iIntValue & 4) > 0 ? Unit.UNIT_MMOLPL : Unit.UNIT_MGPL;
            BGData bGData = new BGData();
            bGData.setMeal(Meal.NOT_PRESENT);
            bGData.setSequenceNumber(bluetoothGattCharacteristic.getIntValue(18, 1).intValue());
            int iIntValue2 = bluetoothGattCharacteristic.getIntValue(18, 3).intValue();
            int iIntValue3 = bluetoothGattCharacteristic.getIntValue(17, 5).intValue();
            int iIntValue4 = bluetoothGattCharacteristic.getIntValue(17, 6).intValue();
            int iIntValue5 = bluetoothGattCharacteristic.getIntValue(17, 7).intValue();
            int iIntValue6 = bluetoothGattCharacteristic.getIntValue(17, 8).intValue();
            int iIntValue7 = bluetoothGattCharacteristic.getIntValue(17, 9).intValue();
            Calendar calendar = Calendar.getInstance();
            calendar.set(iIntValue2, iIntValue3 - 1, iIntValue4, iIntValue5, iIntValue6, iIntValue7);
            bGData.setTime(calendar);
            int i = z ? 12 : 10;
            if (i != 0) {
                int i2 = a.a[unit.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        fFloatValue = bluetoothGattCharacteristic.getFloatValue(50, i).floatValue();
                        f = 1000.0f;
                    }
                    bGData.setUnit(unit);
                    bluetoothGattCharacteristic.getIntValue(17, i + 2).intValue();
                } else {
                    fFloatValue = bluetoothGattCharacteristic.getFloatValue(50, i).floatValue();
                    f = 1000000.0f;
                }
                bGData.setGlucoseConcentration(fFloatValue * f);
                bGData.setUnit(unit);
                bluetoothGattCharacteristic.getIntValue(17, i + 2).intValue();
            }
            this.t.put(bGData.getSequenceNumber(), bGData);
            if (this.z != null) {
                Log.w(str2, "onMyCharacteristicChanged  GM_CHARACTERISTIC 血糖数据 mRecords.size() = " + this.t.size() + "；total = " + this.B);
                this.z.a(this.t.size(), this.B);
                return;
            }
            return;
        }
        if (!G.equals(uuid)) {
            if (H.equals(uuid)) {
                Log.i(str2, "RACP characteristic uuid is " + uuid);
                int iIntValue8 = bluetoothGattCharacteristic.getIntValue(17, 0).intValue();
                Log.i(str2, "RACP characteristic opCode is " + iIntValue8);
                if (iIntValue8 != 5) {
                    if (iIntValue8 == 6) {
                        int iIntValue9 = bluetoothGattCharacteristic.getIntValue(17, 2).intValue();
                        int iIntValue10 = bluetoothGattCharacteristic.getIntValue(17, 3).intValue();
                        Log.i(str2, "Response result for: opCode is  OP_CODE_RESPONSE_CODE  = " + iIntValue8);
                        Log.i(str2, "Response result for: requestedOpCode =" + iIntValue9 + " , responseCode = " + iIntValue10);
                        if (iIntValue10 == 1) {
                            Log.i(str2, "OP_CODE_RESPONSE_CODE: RESPONSE_SUCCESS == 1");
                            arrayList = new ArrayList();
                            for (int i3 = 0; i3 < this.t.size(); i3++) {
                                arrayList.add(this.t.valueAt(i3));
                            }
                            if (this.z == null) {
                                return;
                            }
                            this.i = true;
                            Log.i(as.s, "GZR -- > : D  1");
                            bVar = this.z;
                        } else if (iIntValue10 == 2) {
                            Log.i(str2, "OP_CODE_RESPONSE_CODE: RESPONSE_OP_CODE_NOT_SUPPORTED == 2");
                            if (this.i || this.z == null) {
                                return;
                            }
                            this.i = true;
                            Log.i(str2, "GZR -- > : D  3");
                            bVar = this.z;
                            arrayList = new ArrayList();
                        } else if (iIntValue10 != 6) {
                            if (iIntValue10 == 7) {
                                Log.i(str2, "OP_CODE_RESPONSE_CODE: RESPONSE_ABORT_UNSUCCESSFUL == 7");
                                if (!this.i && this.z != null) {
                                    this.i = true;
                                    Log.i(str2, "GZR -- > : D  5");
                                    this.z.a(new ArrayList());
                                }
                            } else if (iIntValue10 == 8) {
                                Log.i(str2, "OP_CODE_RESPONSE_CODE: RESPONSE_PROCEDURE_NOT_COMPLETED == 8");
                                if (!this.i && this.z != null) {
                                    this.i = true;
                                    Log.i(str2, "GZR -- > : D  4");
                                    this.z.a(new ArrayList());
                                }
                                Log.i(str2, "OP_CODE_RESPONSE_CODE: RESPONSE_ABORT_UNSUCCESSFUL == 7");
                                if (!this.i) {
                                    this.i = true;
                                    Log.i(str2, "GZR -- > : D  5");
                                    this.z.a(new ArrayList());
                                }
                            }
                            str = "OP_CODE_RESPONSE_CODE: default responseCode== " + iIntValue10;
                        } else {
                            Log.i(str2, "OP_CODE_RESPONSE_CODE: RESPONSE_NO_RECORDS_FOUND == 6");
                            if (this.i || this.z == null) {
                                return;
                            }
                            this.i = true;
                            Log.i(str2, "GZR -- > : D  2");
                            bVar = this.z;
                            arrayList = new ArrayList();
                        }
                        bVar.a(arrayList);
                        return;
                    }
                    return;
                }
                int iIntValue11 = bluetoothGattCharacteristic.getIntValue(18, 2).intValue();
                Log.i(str2, "onNumberOfRecordsRequested number:" + iIntValue11);
                this.B = iIntValue11;
            } else {
                Log.i(str2, "ELSE characteristic uuid is " + uuid);
            }
            j();
            return;
        }
        int iIntValue12 = bluetoothGattCharacteristic.getIntValue(17, 0).intValue();
        boolean z2 = (iIntValue12 & 1) > 0;
        boolean z3 = (iIntValue12 & 2) > 0;
        boolean z4 = (iIntValue12 & 4) > 0;
        i3 = (iIntValue12 & 128) > 0 ? 1 : 0;
        int iIntValue13 = bluetoothGattCharacteristic.getIntValue(18, 1).intValue();
        BGData bGData2 = this.t.get(iIntValue13);
        if (bGData2 == null) {
            Log.w(str2, "Context information with unknown sequence number: " + iIntValue13);
            return;
        }
        int i4 = i3 == 0 ? 3 : 4;
        if (z2) {
            i4 += 3;
            Log.i(str2, "carbohydratePresent....." + z2);
        }
        if (z3) {
            int iIntValue14 = bluetoothGattCharacteristic.getIntValue(17, i4).intValue();
            Log.i(str2, "meal....." + iIntValue14);
            i4++;
            if (iIntValue14 == 1) {
                meal = Meal.BEFORE_MEAL;
            } else if (iIntValue14 != 2) {
                meal = iIntValue14 != 3 ? Meal.NOT_PRESENT : Meal.EMPTY_MEAL;
            } else {
                meal = Meal.AFTER_MEAL;
            }
            bGData2.setMeal(meal);
        }
        if (z4) {
            bluetoothGattCharacteristic.getIntValue(17, i4).intValue();
        }
        str = "GM_CONTEXT_CHARACTERISTIC data change";
        Log.i(str2, str);
    }

    public void d(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        byte[] bArr = {4, 1, 1, 0, (byte) (gregorianCalendar.get(1) & 255), (byte) ((gregorianCalendar.get(1) >> 8) & 255), (byte) ((gregorianCalendar.get(2) + 1) & 255), (byte) (gregorianCalendar.get(5) & 255), (byte) (gregorianCalendar.get(11) & 255), (byte) (gregorianCalendar.get(12) & 255), (byte) (gregorianCalendar.get(13) & 255)};
        bluetoothGattCharacteristic.setValue(new byte[11]);
        for (int i = 0; i < 11; i++) {
            bluetoothGattCharacteristic.setValue(bArr);
        }
    }

    @Override // com.omron.as
    public void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        if (i != 0) {
            Log.e(as.s, "onCharacteristicRead error " + i);
            this.d.onFailure(OMRONBLEErrMsg.OMRON_BLE_ERROR_DEVICE_READ_ChARACTERISTIC);
            return;
        }
        if (I.equals(bluetoothGattCharacteristic.getUuid())) {
            int iIntValue = bluetoothGattCharacteristic.getIntValue(17, 0).intValue();
            Log.i(as.s, "onCharacteristicRead batteryValue:" + iIntValue);
            as.h hVar = this.g;
            if (hVar != null) {
                hVar.a(iIntValue);
            }
        }
    }

    @Override // com.omron.as
    public void a(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        as.g gVar;
        OMRONBLEErrMsg oMRONBLEErrMsg;
        String str = as.s;
        Log.i(str, "onGlucoseMeasurementNotificationEnabled status is " + i);
        if (i != 0) {
            if (i != 5) {
                Log.i(str, "onDescriptorWrite error " + i);
                gVar = this.d;
                oMRONBLEErrMsg = OMRONBLEErrMsg.OMRON_BLE_ERROR_DEVICE_WRITE_DESCRIPTOR;
            } else {
                if (bluetoothGatt.getDevice().getBondState() == 10) {
                    return;
                }
                Log.i(str, "GATT_INSUFFICIENT_AUTHENTICATION");
                gVar = this.d;
                oMRONBLEErrMsg = OMRONBLEErrMsg.OMRON_BLE_ERROR_DEVICE_BOND_FAILED;
            }
            gVar.onFailure(oMRONBLEErrMsg);
            return;
        }
        if (F.equals(bluetoothGattDescriptor.getCharacteristic().getUuid())) {
            Log.i(str, "onGlucoseMeasurementNotificationEnabled end");
            if (this.v != null) {
                a(bluetoothGatt);
            } else {
                c(bluetoothGatt);
            }
        }
        if (G.equals(bluetoothGattDescriptor.getCharacteristic().getUuid())) {
            Log.i(str, "onGlucoseMeasurementContextNotificationEnabled end");
            c(bluetoothGatt);
        }
        if (H.equals(bluetoothGattDescriptor.getCharacteristic().getUuid())) {
            Log.i(str, "onRecordAccessControlPointIndicationsEnabled end");
            if (this.y != null) {
                d(bluetoothGatt);
            }
            if (this.y == null) {
                Log.i(str, "mCustomTimeCharacteristic begin");
                l();
                Log.i(str, "mCustomTimeCharacteristic end");
            }
            try {
                Thread.sleep(1500L);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            ap apVar = ap.STATE_CONNECTED;
            this.f = apVar;
            this.d.a(apVar);
        }
        if (K.equals(bluetoothGattDescriptor.getCharacteristic().getUuid())) {
            k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        try {
            Thread.sleep(500L);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        a(bluetoothGattCharacteristic, 1, 1, new Integer[0]);
        Log.e(as.s, " readData sksksksksk1 读取指令 racpCharacteristic " + ek.a(bluetoothGattCharacteristic.getValue()));
        this.f8819e.writeCharacteristic(bluetoothGattCharacteristic);
    }

    private void a(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, int i2, Integer... numArr) {
        if (bluetoothGattCharacteristic != null) {
            bluetoothGattCharacteristic.setValue(new byte[(numArr.length > 0 ? 1 : 0) + 2 + (numArr.length * 2)]);
            bluetoothGattCharacteristic.setValue(i, 17, 0);
            bluetoothGattCharacteristic.setValue(i2, 17, 1);
            if (numArr.length > 0) {
                bluetoothGattCharacteristic.setValue(1, 17, 2);
                int i3 = 3;
                for (Integer num : numArr) {
                    bluetoothGattCharacteristic.setValue(num.intValue(), 18, i3);
                    i3 += 2;
                }
            }
        }
    }

    private void a(BluetoothGattCharacteristic bluetoothGattCharacteristic, Calendar calendar) {
        String str = as.s;
        Log.i(str, "setCustomTimeSync 设置自定义时间同步 ");
        if (bluetoothGattCharacteristic == null) {
            return;
        }
        Log.i(str, "setCustomTimeSync  is not null");
        byte[] bArr = {-64, 3, 1, 0, (byte) (calendar.get(1) & 255), (byte) ((calendar.get(1) >> 8) & 255), (byte) ((calendar.get(2) + 1) & 255), (byte) (calendar.get(5) & 255), (byte) (calendar.get(11) & 255), (byte) (calendar.get(12) & 255), (byte) (calendar.get(13) & 255)};
        bluetoothGattCharacteristic.setValue(new byte[11]);
        for (int i = 0; i < 11; i++) {
            bluetoothGattCharacteristic.setValue(bArr);
        }
    }

    @Override // com.omron.as
    public void a(as.g gVar) {
        super.a(gVar);
        ap apVar = ap.STATE_DISCONNECTED;
        this.f = apVar;
        gVar.a(apVar);
        BluetoothGatt bluetoothGatt = this.f8819e;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
        }
        g();
        BluetoothGatt bluetoothGatt2 = this.f8819e;
        if (bluetoothGatt2 != null) {
            bluetoothGatt2.close();
            this.t.clear();
            this.u = null;
            this.v = null;
            this.w = null;
            this.x = null;
            this.f8819e = null;
        }
    }
}
