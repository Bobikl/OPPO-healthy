package com.heytap.accessory.file.receiver;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.heytap.accessory.BaseSocket;
import com.heytap.accessory.bean.TrafficReport;
import com.heytap.accessory.file.model.CtrlResponse;

/* JADX INFO: loaded from: classes14.dex */
public class FTConsumerConnection extends BaseSocket {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f2571c = "FTConsumerConnection";
    public CtrlResponse a;
    public c.HandlerC0246c b;

    public FTConsumerConnection() {
        super(FTConsumerConnection.class.getName());
    }

    public void a(CtrlResponse ctrlResponse) {
        this.a = ctrlResponse;
    }

    @Override // com.heytap.accessory.BaseSocket
    @Nullable
    public TrafficReport getTrafficReport(String str, int i) {
        return super.getTrafficReport(str, i);
    }

    @Override // com.heytap.accessory.BaseSocket
    public void onError(int i, String str, int i2) {
        com.heytap.accessory.base.logging.a.b(f2571c, "Channel error channelId:" + i + " Message:" + str + " code:" + i2);
    }

    @Override // com.heytap.accessory.BaseSocket
    public void onReceive(long j2, int i, byte[] bArr) {
        com.heytap.accessory.base.logging.a.a(f2571c, "onReceive " + j2 + " , " + i);
        Bundle bundle = new Bundle();
        bundle.putLong("EXTRA_KEY_CONNECTION_ID", j2);
        bundle.putLong("accId", getConnectedPeerAgent().getAccessoryId());
        bundle.putByteArray("EXTRA_KEY_DATA", bArr);
        c.HandlerC0246c handlerC0246c = this.b;
        handlerC0246c.sendMessage(handlerC0246c.obtainMessage(404, i, 0, bundle));
    }

    @Override // com.heytap.accessory.BaseSocket
    public void onServiceConnectionLost(long j2, int i) {
        c.HandlerC0246c handlerC0246c = this.b;
        handlerC0246c.sendMessage(handlerC0246c.obtainMessage(403, i, 0, this.a));
    }

    public void a(c.HandlerC0246c handlerC0246c) {
        this.b = handlerC0246c;
    }
}
