package com.lifesense.plugin.ble.a;

import android.bluetooth.BluetoothGatt;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.lifesense.plugin.ble.data.other.HandlerMessage;

/* JADX INFO: loaded from: classes5.dex */
class f extends Handler {
    final /* synthetic */ e a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, Looper looper) {
        super(looper);
        this.a = eVar;
    }

    private void a(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt != null) {
            try {
                if (bluetoothGatt.getDevice() != null) {
                    String address = bluetoothGatt.getDevice().getAddress();
                    String str = "disconnect done,obj=" + com.lifesense.plugin.ble.c.b.a(bluetoothGatt) + "; device=[" + address + "]";
                    e eVar = this.a;
                    eVar.printLogMessage(eVar.getAdvancedLogInfo(address, str, com.lifesense.plugin.ble.b.a.a.Cancel_Connection, null, true));
                    return;
                }
            } catch (Exception e2) {
                e eVar2 = this.a;
                eVar2.printLogMessage(eVar2.getAdvancedLogInfo(null, "cancel connection has exception...", com.lifesense.plugin.ble.b.a.a.Cancel_Connection, null, true));
                e2.printStackTrace();
                return;
            }
        }
        String str2 = "disconnect done,obj=" + com.lifesense.plugin.ble.c.b.a(bluetoothGatt);
        e eVar3 = this.a;
        eVar3.printLogMessage(eVar3.getAdvancedLogInfo(null, str2, com.lifesense.plugin.ble.b.a.a.Cancel_Connection, null, true));
    }

    private void b(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt != null) {
            try {
                if (bluetoothGatt.getDevice() != null) {
                    String address = bluetoothGatt.getDevice().getAddress();
                    String str = "close done,obj=" + com.lifesense.plugin.ble.c.b.a(bluetoothGatt) + "; device[" + address + "]";
                    e eVar = this.a;
                    eVar.printLogMessage(eVar.getAdvancedLogInfo(address, str, com.lifesense.plugin.ble.b.a.a.Close_Gatt, null, true));
                    return;
                }
            } catch (Exception e2) {
                e eVar2 = this.a;
                eVar2.printLogMessage(eVar2.getAdvancedLogInfo(null, "close gatt has exception...", com.lifesense.plugin.ble.b.a.a.Close_Gatt, null, true));
                e2.printStackTrace();
                return;
            }
        }
        String str2 = "close done,obj=" + com.lifesense.plugin.ble.c.b.a(bluetoothGatt) + "; device=null";
        e eVar3 = this.a;
        eVar3.printLogMessage(eVar3.getAdvancedLogInfo(null, str2, com.lifesense.plugin.ble.b.a.a.Close_Gatt, null, true));
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Object obj;
        if (message == null) {
            e eVar = this.a;
            eVar.printLogMessage(eVar.getGeneralLogInfo(null, "failed to handle gatt message,no message...", com.lifesense.plugin.ble.b.a.a.Program_Exception, null, true));
            return;
        }
        try {
            int i = message.arg1;
            if (i == 1) {
                this.a.a((com.lifesense.plugin.ble.a.a.b) message.obj);
                return;
            }
            if (i == 3) {
                ((BluetoothGatt) message.obj).discoverServices();
                return;
            }
            if (i == 4) {
                BluetoothGatt bluetoothGatt = (BluetoothGatt) message.obj;
                bluetoothGatt.disconnect();
                a(bluetoothGatt);
                return;
            }
            if (i == 5) {
                HandlerMessage handlerMessage = (HandlerMessage) message.obj;
                BluetoothGatt gatt = handlerMessage.getGatt();
                String macAddress = handlerMessage.getMacAddress();
                gatt.close();
                b(gatt);
                this.a.p.a(macAddress, true);
                return;
            }
            if (i == 7 && (obj = message.obj) != null && (obj instanceof BluetoothGatt)) {
                BluetoothGatt bluetoothGatt2 = (BluetoothGatt) obj;
                String str = "init gatt reconnect:" + com.lifesense.plugin.ble.c.b.a(bluetoothGatt2) + "; device=" + bluetoothGatt2.getDevice() + "; status=" + bluetoothGatt2.connect();
                e eVar2 = this.a;
                eVar2.printLogMessage(eVar2.getGeneralLogInfo(null, str, com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            String str2 = "failed to handle gatt message,has exception:" + message.arg1 + "; obj=" + message.obj;
            e eVar3 = this.a;
            eVar3.printLogMessage(eVar3.getGeneralLogInfo(null, str2, com.lifesense.plugin.ble.b.a.a.Program_Exception, null, true));
        }
    }
}
