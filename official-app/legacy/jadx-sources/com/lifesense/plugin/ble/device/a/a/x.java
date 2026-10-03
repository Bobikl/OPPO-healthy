package com.lifesense.plugin.ble.device.a.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.lifesense.plugin.ble.data.LSDeviceInfo;
import com.lifesense.plugin.ble.data.other.HandlerMessage;

/* JADX INFO: loaded from: classes5.dex */
class x extends Handler {
    final /* synthetic */ u a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(u uVar, Looper looper) {
        super(looper);
        this.a = uVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Object obj;
        if (message == null || (obj = message.obj) == null) {
            String str = "faield to callback measure data,obj is null...; msg=" + message + "; data callback=" + this.a.u;
            u uVar = this.a;
            uVar.printLogMessage(uVar.getGeneralLogInfo(null, str, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, false));
            return;
        }
        int i = message.arg1;
        if (1 == i) {
            this.a.d((LSDeviceInfo) obj);
            return;
        }
        if (2 == i) {
            this.a.a((HandlerMessage) obj);
            return;
        }
        if (5 == i) {
            HandlerMessage handlerMessage = (HandlerMessage) obj;
            if (handlerMessage.getProtocolHandler() == null) {
                return;
            }
            handlerMessage.getProtocolHandler();
            this.a.a(false);
            return;
        }
        if (7 == i && this.a.u != null) {
            LSDeviceInfo lSDeviceInfo = (LSDeviceInfo) message.obj;
            this.a.u.onDeviceInformationUpdate(lSDeviceInfo.getBroadcastID(), lSDeviceInfo);
            return;
        }
        if (12 == message.arg1 && this.a.u != null) {
            HandlerMessage handlerMessage2 = (HandlerMessage) message.obj;
            if (handlerMessage2.getLsDevice() != null) {
                handlerMessage2.getLsDevice();
                return;
            }
            return;
        }
        if (4 == message.arg1 && this.a.u != null) {
        } else if (17 == message.arg1) {
            this.a.a(message.obj);
        }
    }
}
