package com.lifesense.plugin.ble.device.a.a;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.lifesense.plugin.ble.data.LSErrorCode;

/* JADX INFO: loaded from: classes5.dex */
class n extends Handler {
    final /* synthetic */ g a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(g gVar, Looper looper) {
        super(looper);
        this.a = gVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message == null) {
            return;
        }
        int i = message.arg1;
        if (i == 1) {
            Object obj = message.obj;
            if (obj == null || !(obj instanceof com.lifesense.plugin.ble.device.ancs.a)) {
                return;
            }
            com.lifesense.plugin.ble.device.ancs.a aVar = (com.lifesense.plugin.ble.device.ancs.a) obj;
            if (aVar.a() < 1) {
                aVar.a(aVar.a() + 1);
                this.a.a(aVar);
                return;
            }
            String strB = aVar.b();
            String hexString = Integer.toHexString(3);
            String str = "failed to send msg,timeout=" + aVar.toString();
            g gVar = this.a;
            gVar.printLogMessage(gVar.getGeneralLogInfo(strB, str, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            this.a.a(strB, hexString, LSErrorCode.ScanTimeout.getCode(), false);
            return;
        }
        if (i == 8) {
            Object obj2 = message.obj;
            if (obj2 == null || !(obj2 instanceof com.lifesense.plugin.ble.device.ancs.a)) {
                return;
            }
            com.lifesense.plugin.ble.device.ancs.a aVar2 = (com.lifesense.plugin.ble.device.ancs.a) obj2;
            String strB2 = aVar2.b();
            String hexString2 = Integer.toHexString(2);
            String str2 = "failed to send call msg,timeout=" + aVar2.toString();
            g gVar2 = this.a;
            gVar2.printLogMessage(gVar2.getGeneralLogInfo(strB2, str2, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            this.a.a(strB2, hexString2, LSErrorCode.ScanTimeout.getCode(), false);
            return;
        }
        if (i == 2) {
            Bundle data = message.getData();
            this.a.a(data.getString("mac"), data.getByteArray("data"), data.getString("cmdVersion"));
            return;
        }
        if (i == 4) {
            Bundle data2 = message.getData();
            this.a.a(data2.getString("mac"), data2.getString("pushCmd"), data2.getInt("errorCode"), false);
            return;
        }
        if (i == 3) {
            Bundle data3 = message.getData();
            this.a.a(data3.getString("mac"), data3.getString("pushCmd"), 0, true);
            return;
        }
        if (i == 5) {
            Bundle data4 = message.getData();
            this.a.a(data4.getString("mac"), data4.getString("pushCmd"), message.obj);
            return;
        }
        if (i != 6) {
            if (i == 7) {
                Object obj3 = message.obj;
                if (obj3 instanceof com.lifesense.plugin.ble.device.ancs.a) {
                    this.a.c((com.lifesense.plugin.ble.device.ancs.a) obj3);
                    return;
                }
                return;
            }
            return;
        }
        try {
            Object obj4 = message.obj;
            if (obj4 != null) {
                this.a.a(message.arg2, (String) obj4);
            } else {
                this.a.a(message.arg2, (String) null);
            }
        } catch (Exception e2) {
            String str3 = "faield to parsing phone state message,has exception >> {" + e2.toString() + "}";
            g gVar3 = this.a;
            gVar3.printLogMessage(gVar3.getAdvancedLogInfo(null, str3, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, false));
            e2.printStackTrace();
        }
    }
}
