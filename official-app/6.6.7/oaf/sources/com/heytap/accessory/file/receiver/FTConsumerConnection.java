package com.heytap.accessory.file.receiver;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.security.cryptauth.lib.securegcm.SecureGcmProto;
import com.heytap.accessory.BaseSocket;
import com.heytap.accessory.bean.TrafficReport;
import com.heytap.accessory.file.model.CtrlResponse;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class FTConsumerConnection extends BaseSocket {
    public static final String c = "FTConsumerConnection";
    public CtrlResponse a;
    public c.c b;

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
        com.heytap.accessory.base.logging.a.b(c, "Channel error channelId:" + i + " Message:" + str + " code:" + i2);
    }

    @Override // com.heytap.accessory.BaseSocket
    public void onReceive(long j, int i, byte[] bArr) {
        com.heytap.accessory.base.logging.a.a(c, "onReceive " + j + " , " + i);
        Bundle bundle = new Bundle();
        bundle.putLong("EXTRA_KEY_CONNECTION_ID", j);
        bundle.putLong("accId", getConnectedPeerAgent().getAccessoryId());
        bundle.putByteArray("EXTRA_KEY_DATA", bArr);
        c.c cVar = this.b;
        cVar.sendMessage(cVar.obtainMessage(SecureGcmProto.GcmDeviceInfo.BLUETOOTH_RADIO_ENABLED_FIELD_NUMBER, i, 0, bundle));
    }

    @Override // com.heytap.accessory.BaseSocket
    public void onServiceConnectionLost(long j, int i) {
        c.c cVar = this.b;
        cVar.sendMessage(cVar.obtainMessage(SecureGcmProto.GcmDeviceInfo.BLUETOOTH_RADIO_SUPPORTED_FIELD_NUMBER, i, 0, this.a));
    }

    public void a(c.c cVar) {
        this.b = cVar;
    }
}
