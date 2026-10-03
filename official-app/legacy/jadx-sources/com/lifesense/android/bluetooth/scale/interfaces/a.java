package com.lifesense.android.bluetooth.scale.interfaces;

import android.os.Message;
import com.lifesense.android.bluetooth.core.bean.BaseDeviceProperty;
import com.lifesense.android.bluetooth.core.bean.BleScanResults;
import com.lifesense.android.bluetooth.core.bean.HandlerMessage;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;

/* JADX INFO: loaded from: classes4.dex */
public class a extends com.lifesense.android.bluetooth.core.business.sync.a implements b {
    public void a(LsDeviceInfo lsDeviceInfo, BaseDeviceProperty baseDeviceProperty, PacketProfile packetProfile) {
        HandlerMessage handlerMessage = new HandlerMessage();
        handlerMessage.setLsDevice(lsDeviceInfo);
        handlerMessage.setData(baseDeviceProperty);
        handlerMessage.setPacketType(packetProfile);
        Message messageObtainMessage = this.a.obtainMessage();
        messageObtainMessage.arg1 = 16;
        messageObtainMessage.obj = handlerMessage;
        this.a.sendMessage(messageObtainMessage);
    }

    @Override // com.lifesense.android.bluetooth.core.business.sync.a, com.lifesense.android.bluetooth.core.business.h
    public void onBleScanResults(BleScanResults bleScanResults) {
    }

    @Override // com.lifesense.android.bluetooth.core.business.sync.a, com.lifesense.android.bluetooth.core.business.h
    public void onScanTimeout() {
    }
}
