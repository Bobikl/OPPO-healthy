package com.lifesense.plugin.ble.device.a.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.lifesense.plugin.ble.OnPairingListener;
import com.lifesense.plugin.ble.data.LSDeviceInfo;
import com.lifesense.plugin.ble.data.LSDevicePairSetting;
import com.lifesense.plugin.ble.data.LSManagerStatus;
import com.lifesense.plugin.ble.data.LSPairCommand;
import com.lifesense.plugin.ble.data.other.HandlerMessage;

/* JADX INFO: loaded from: classes5.dex */
class f extends Handler {
    final /* synthetic */ d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, Looper looper) {
        super(looper);
        this.a = dVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        String str;
        OnPairingListener onPairingListenerC;
        LSDevicePairSetting lSDevicePairSetting;
        LSPairCommand lSPairCommand;
        if (message == null) {
            d dVar = this.a;
            dVar.printLogMessage(dVar.getGeneralLogInfo(null, "faield to callback pairing message,obj is null...; msg=" + message, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, false));
            return;
        }
        int i = message.arg1;
        if (8 == i) {
            LSDeviceInfo lSDeviceInfo = (LSDeviceInfo) message.obj;
            int i2 = message.arg2;
            OnPairingListener onPairingListenerC2 = this.a.c(lSDeviceInfo.getMacAddress());
            if (onPairingListenerC2 != null) {
                this.a.d(lSDeviceInfo.getMacAddress());
                com.lifesense.plugin.ble.device.proto.q qVarB = this.a.b(lSDeviceInfo.getMacAddress());
                if (qVarB != null) {
                    qVarB.k();
                    this.a.s.remove(lSDeviceInfo.getMacAddress());
                }
                if (this.a.s == null || this.a.s.size() == 0) {
                    this.a.a(LSManagerStatus.Free, "on paired results");
                }
                onPairingListenerC2.onStateChanged(lSDeviceInfo, i2);
                return;
            }
            if (this.a.s != null && this.a.s.size() != 0) {
                return;
            }
        } else {
            if (22 != i) {
                if (12 == i) {
                    HandlerMessage handlerMessage = (HandlerMessage) message.obj;
                    if (handlerMessage.getLsDevice() != null) {
                        this.a.c(handlerMessage.getLsDevice().getMacAddress());
                        return;
                    }
                    return;
                }
                if (20 == i) {
                    String string = message.getData().getString("deviceMac");
                    Object obj = message.obj;
                    LSDevicePairSetting lSDevicePairSetting2 = obj != null ? (LSDevicePairSetting) obj : null;
                    OnPairingListener onPairingListenerC3 = this.a.c(string);
                    if (onPairingListenerC3 != null) {
                        onPairingListenerC3.onMessageUpdate(string, lSDevicePairSetting2);
                        return;
                    }
                    d dVar2 = this.a;
                    dVar2.printLogMessage(dVar2.getGeneralLogInfo(string, "failed to callback device's operation cmd,no callback...." + lSDevicePairSetting2, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                    return;
                }
                if (21 == i) {
                    str = (String) message.obj;
                    onPairingListenerC = this.a.c(str);
                    if (onPairingListenerC == null) {
                        String str2 = "failed to callback device's operation cmd,no callback...." + LSPairCommand.PairConfirm;
                        d dVar3 = this.a;
                        dVar3.printLogMessage(dVar3.getGeneralLogInfo(null, str2, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                        return;
                    }
                    lSDevicePairSetting = new LSDevicePairSetting();
                    lSDevicePairSetting.setObj(null);
                    lSPairCommand = LSPairCommand.PairConfirm;
                } else {
                    if (23 != i) {
                        return;
                    }
                    str = (String) message.obj;
                    onPairingListenerC = this.a.c(str);
                    if (onPairingListenerC == null) {
                        String str3 = "failed to callback device's operation cmd,no callback...." + LSPairCommand.UnbindConfirm;
                        d dVar4 = this.a;
                        dVar4.printLogMessage(dVar4.getGeneralLogInfo(null, str3, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                        return;
                    }
                    lSDevicePairSetting = new LSDevicePairSetting();
                    lSDevicePairSetting.setObj(null);
                    lSPairCommand = LSPairCommand.UnbindConfirm;
                }
                lSDevicePairSetting.setPairCmd(lSPairCommand);
                onPairingListenerC.onMessageUpdate(str, lSDevicePairSetting);
                return;
            }
            LSDeviceInfo lSDeviceInfo2 = (LSDeviceInfo) message.obj;
            if (this.a.c(lSDeviceInfo2.getMacAddress()) != null) {
                this.a.d(lSDeviceInfo2.getMacAddress());
                com.lifesense.plugin.ble.device.proto.q qVarB2 = this.a.b(lSDeviceInfo2.getMacAddress());
                if (qVarB2 != null) {
                    qVarB2.k();
                    this.a.s.remove(lSDeviceInfo2.getMacAddress());
                }
            } else {
                d dVar5 = this.a;
                dVar5.printLogMessage(dVar5.getPrintLogInfo("failed to return paired results,is null...", 1));
            }
            if (this.a.s != null && this.a.s.size() != 0) {
                return;
            }
        }
        this.a.a(LSManagerStatus.Free, "on paired results");
    }
}
