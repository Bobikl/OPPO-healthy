package com.lifesense.plugin.ble.device.a.a;

import android.os.Message;
import com.lifesense.plugin.ble.data.other.BleScanResults;

/* JADX INFO: loaded from: classes5.dex */
class p extends com.lifesense.plugin.ble.a.d {
    final /* synthetic */ o a;

    public p(o oVar) {
        this.a = oVar;
    }

    @Override // com.lifesense.plugin.ble.a.d
    public void a() {
        if (this.a.v != null) {
            Message messageObtainMessage = this.a.v.obtainMessage();
            messageObtainMessage.arg1 = 4;
            this.a.v.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.lifesense.plugin.ble.a.d
    public void a(BleScanResults bleScanResults) {
        if (bleScanResults == null) {
            return;
        }
        Message messageObtainMessage = this.a.v.obtainMessage();
        messageObtainMessage.arg1 = 3;
        messageObtainMessage.obj = bleScanResults;
        this.a.v.sendMessage(messageObtainMessage);
    }
}
