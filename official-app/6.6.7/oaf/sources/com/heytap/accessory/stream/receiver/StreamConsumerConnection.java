package com.heytap.accessory.stream.receiver;

import android.os.Bundle;
import com.google.security.cryptauth.lib.securegcm.SecureGcmProto;
import com.heytap.accessory.BaseSocket;
import com.heytap.accessory.stream.model.CtrlResponse;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class StreamConsumerConnection extends BaseSocket {
    public static final String c = "StreamConsumerConnection";
    public CtrlResponse a;
    public a.c b;

    public StreamConsumerConnection() {
        super(StreamConsumerConnection.class.getName());
    }

    public void a(CtrlResponse ctrlResponse) {
        this.a = ctrlResponse;
    }

    @Override // com.heytap.accessory.BaseSocket
    public void onError(int i, String str, int i2) {
        com.heytap.accessory.base.logging.a.b(c, "Channel error channelId:" + i + " Message:" + str + " code:" + i2);
    }

    @Override // com.heytap.accessory.BaseSocket
    public void onReceive(long j, int i, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putLong("EXTRA_KEY_CONNECTION_ID", j);
        bundle.putByteArray("EXTRA_KEY_DATA", bArr);
        bundle.putLong("accId", getConnectedPeerAgent().getAccessoryId());
        a.c cVar = this.b;
        boolean zSendMessage = cVar.sendMessage(cVar.obtainMessage(SecureGcmProto.GcmDeviceInfo.BLUETOOTH_RADIO_ENABLED_FIELD_NUMBER, i, 0, bundle));
        com.heytap.accessory.base.logging.a.a(c, "consumer onReceive " + j + " , " + i + " , " + zSendMessage);
    }

    @Override // com.heytap.accessory.BaseSocket
    public void onServiceConnectionLost(long j, int i) {
        a.c cVar = this.b;
        cVar.sendMessage(cVar.obtainMessage(SecureGcmProto.GcmDeviceInfo.BLUETOOTH_RADIO_SUPPORTED_FIELD_NUMBER, i, 0, this.a));
    }

    public void a(a.c cVar) {
        this.b = cVar;
    }
}
