package com.lifesense.android.bluetooth.core.business.sync;

import android.os.Handler;
import android.os.Message;
import com.lifesense.android.bluetooth.core.bean.BleScanResults;
import com.lifesense.android.bluetooth.core.bean.HandlerMessage;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceConnectState;
import com.lifesense.android.bluetooth.core.bean.constant.OperationCommand;
import com.lifesense.android.bluetooth.core.business.e;
import com.lifesense.android.bluetooth.core.business.f;
import com.lifesense.android.bluetooth.core.business.h;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.collections4.MapUtils;

/* JADX INFO: loaded from: classes4.dex */
public class a implements h, e, f {
    public Handler a;
    public Map<String, LsDeviceInfo> b;

    public Handler a() {
        return this.a;
    }

    public Map<String, LsDeviceInfo> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!aVar.a(this)) {
            return false;
        }
        Handler handlerA = a();
        Handler handlerA2 = aVar.a();
        if (handlerA != null ? !handlerA.equals(handlerA2) : handlerA2 != null) {
            return false;
        }
        Map<String, LsDeviceInfo> mapB = b();
        Map<String, LsDeviceInfo> mapB2 = aVar.b();
        return mapB != null ? mapB.equals(mapB2) : mapB2 == null;
    }

    public int hashCode() {
        Handler handlerA = a();
        int iHashCode = handlerA == null ? 43 : handlerA.hashCode();
        Map<String, LsDeviceInfo> mapB = b();
        return ((iHashCode + 59) * 59) + (mapB != null ? mapB.hashCode() : 43);
    }

    @Override // com.lifesense.android.bluetooth.core.business.h
    public void onBleScanResults(BleScanResults bleScanResults) {
    }

    @Override // com.lifesense.android.bluetooth.core.business.h
    public synchronized void onDeviceScanResults(String str, LsDeviceInfo lsDeviceInfo) {
        if (lsDeviceInfo == null || str == null) {
            return;
        }
        Message messageObtainMessage = this.a.obtainMessage();
        messageObtainMessage.arg1 = 1;
        messageObtainMessage.obj = lsDeviceInfo;
        this.a.sendMessage(messageObtainMessage);
    }

    @Override // com.lifesense.android.bluetooth.core.business.h
    public synchronized void onScanFailure() {
        if (MapUtils.isEmpty(this.b)) {
            Objects.toString(this.b);
            com.lifesense.android.bluetooth.core.business.scan.a.getInstance().f("12");
        }
    }

    @Override // com.lifesense.android.bluetooth.core.business.h
    public void onScanTimeout() {
    }

    public String toString() {
        return "DeviceBusinessListener(deviceCentreHandler=" + a() + ", measuredDeviceMap=" + b() + ")";
    }

    public void a(Handler handler) {
        this.a = handler;
    }

    @Override // com.lifesense.android.bluetooth.core.business.f
    public void b(LsDeviceInfo lsDeviceInfo, int i) {
    }

    public synchronized void a(LsDeviceInfo lsDeviceInfo) {
        if (lsDeviceInfo == null) {
            return;
        }
        Message messageObtainMessage = this.a.obtainMessage();
        messageObtainMessage.obj = lsDeviceInfo;
        messageObtainMessage.arg1 = 7;
        this.a.sendMessage(messageObtainMessage);
    }

    @Override // com.lifesense.android.bluetooth.core.business.f
    public void b(String str) {
    }

    @Override // com.lifesense.android.bluetooth.core.business.f
    public void a(LsDeviceInfo lsDeviceInfo, int i) {
    }

    @Override // com.lifesense.android.bluetooth.core.business.f
    public void a(String str) {
    }

    public synchronized void a(String str, DeviceConnectState deviceConnectState, com.lifesense.android.bluetooth.core.protocol.worker.a aVar) {
        HandlerMessage handlerMessage = new HandlerMessage();
        handlerMessage.setConnectState(deviceConnectState);
        handlerMessage.setMacAddress(str);
        handlerMessage.setProtocolHandler(aVar);
        Message messageObtainMessage = this.a.obtainMessage();
        messageObtainMessage.arg1 = 5;
        messageObtainMessage.obj = handlerMessage;
        this.a.sendMessage(messageObtainMessage);
    }

    @Override // com.lifesense.android.bluetooth.core.business.f
    public void a(String str, OperationCommand operationCommand) {
    }

    public void a(Map<String, LsDeviceInfo> map) {
        this.b = map;
    }

    public boolean a(Object obj) {
        return obj instanceof a;
    }
}
