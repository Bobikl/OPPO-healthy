package com.heytap.accessory.stream.receiver;

import android.os.Bundle;
import com.heytap.accessory.BaseSocket;
import com.heytap.accessory.stream.model.CtrlResponse;

/* JADX INFO: loaded from: classes14.dex */
public class StreamConsumerConnection extends BaseSocket {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f2734c = "StreamConsumerConnection";
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
        com.heytap.accessory.base.logging.a.b(f2734c, "Channel error channelId:" + i + " Message:" + str + " code:" + i2);
    }

    @Override // com.heytap.accessory.BaseSocket
    public void onReceive(long j2, int i, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putLong("EXTRA_KEY_CONNECTION_ID", j2);
        bundle.putByteArray("EXTRA_KEY_DATA", bArr);
        bundle.putLong("accId", getConnectedPeerAgent().getAccessoryId());
        a.c cVar = this.b;
        boolean zSendMessage = cVar.sendMessage(cVar.obtainMessage(404, i, 0, bundle));
        com.heytap.accessory.base.logging.a.a(f2734c, "consumer onReceive " + j2 + " , " + i + " , " + zSendMessage);
    }

    @Override // com.heytap.accessory.BaseSocket
    public void onServiceConnectionLost(long j2, int i) {
        a.c cVar = this.b;
        cVar.sendMessage(cVar.obtainMessage(403, i, 0, this.a));
    }

    public void a(a.c cVar) {
        this.b = cVar;
    }
}
