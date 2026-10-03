package com.glyphix.mas.flover;

import android.os.RemoteException;
import com.autonavi.minimap.wearable.AMapWearableConnector;
import com.autonavi.minimap.wearable.IWearableConnectProvider;
import com.autonavi.minimap.wearable.contract.ConnectResult;
import com.autonavi.minimap.wearable.contract.SendResult;
import com.autonavi.minimap.wearable.inter.IProviderConnectCallback;
import com.autonavi.minimap.wearable.inter.IProviderSendCallback;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class XfaithAmapWearableConnectProvider implements IWearableConnectProvider {
    public static c debugLog;
    private static com.glyphix.mas.b masExecutor;
    private String receiver = "com.xfaith.autonavi.minimap";

    public class a extends com.glyphix.mas.c.b {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ IProviderConnectCallback f2329n;

        public a(IProviderConnectCallback iProviderConnectCallback) {
            this.f2329n = iProviderConnectCallback;
        }

        @Override // com.glyphix.mas.c
        public int a(String str) {
            com.glyphix.mas.utils.b.c().c("amap launch success", str.toString());
            IProviderConnectCallback iProviderConnectCallback = this.f2329n;
            if (iProviderConnectCallback == null) {
                return 1;
            }
            ConnectResult connectResult = ConnectResult.SUCCESS;
            iProviderConnectCallback.onConnect(connectResult.code, connectResult.message);
            return 1;
        }

        @Override // com.glyphix.mas.c
        public int b(String str) {
            com.glyphix.mas.utils.b.c().e("start app failed", str);
            IProviderConnectCallback iProviderConnectCallback = this.f2329n;
            if (iProviderConnectCallback == null) {
                return 0;
            }
            ConnectResult connectResult = ConnectResult.FAILED_OTHER;
            iProviderConnectCallback.onConnect(connectResult.code, connectResult.message);
            return 0;
        }

        @Override // com.glyphix.mas.c
        public int d(String str) {
            return 1;
        }

        @Override // com.glyphix.mas.c
        public int retry() {
            return 2;
        }

        @Override // com.glyphix.mas.c
        public int timeout() {
            return 3000;
        }
    }

    public class b extends com.glyphix.mas.c.b {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ IProviderSendCallback f2330n;

        public b(IProviderSendCallback iProviderSendCallback) {
            this.f2330n = iProviderSendCallback;
        }

        @Override // com.glyphix.mas.c
        public int a(String str) {
            IProviderSendCallback iProviderSendCallback = this.f2330n;
            if (iProviderSendCallback == null) {
                return 1;
            }
            SendResult sendResult = SendResult.SUCCESS;
            iProviderSendCallback.onSendCallback(sendResult.code, sendResult.message);
            return 1;
        }

        @Override // com.glyphix.mas.c
        public int b(String str) {
            IProviderSendCallback iProviderSendCallback = this.f2330n;
            if (iProviderSendCallback == null) {
                return 1;
            }
            SendResult sendResult = SendResult.FAILED;
            iProviderSendCallback.onSendCallback(sendResult.code, sendResult.message);
            return 1;
        }

        @Override // com.glyphix.mas.c
        public int d(String str) {
            return 0;
        }

        @Override // com.glyphix.mas.c
        public int retry() {
            return 2;
        }

        @Override // com.glyphix.mas.c
        public int timeout() {
            return 3000;
        }
    }

    public interface c {
        void a(String str);
    }

    public static void init(com.glyphix.mas.b bVar) {
        masExecutor = bVar;
        com.glyphix.mas.utils.b.c().c("init amap provider, set conenct provider");
        AMapWearableConnector.getInstance().setConnectProvider(new XfaithAmapWearableConnectProvider());
    }

    private void reportLog(String str) {
        c cVar = debugLog;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    private void sendMessage(String str, String str2, IProviderSendCallback iProviderSendCallback) {
        try {
            com.glyphix.mas.b bVar = masExecutor;
            if (bVar != null) {
                bVar.b(str, str2, "", new b(iProviderSendCallback));
            } else if (iProviderSendCallback != null) {
                SendResult sendResult = SendResult.FAILED;
                iProviderSendCallback.onSendCallback(sendResult.code, sendResult.message);
            }
        } catch (RemoteException e2) {
            e2.printStackTrace();
            if (iProviderSendCallback != null) {
                SendResult sendResult2 = SendResult.FAILED;
                iProviderSendCallback.onSendCallback(sendResult2.code, sendResult2.message);
            }
        }
    }

    private void startApp(IProviderConnectCallback iProviderConnectCallback) {
        com.glyphix.mas.utils.b.c().c("start app", this.receiver);
        masExecutor.c(this.receiver, new a(iProviderConnectCallback));
    }

    @Override // com.autonavi.minimap.wearable.IWearableConnectProvider
    public void connect(String str, IProviderConnectCallback iProviderConnectCallback) {
        com.glyphix.mas.utils.b.c().c("amap connect to", this.receiver);
        reportLog("amap connect" + this.receiver);
        try {
            if (masExecutor != null) {
                startApp(iProviderConnectCallback);
            } else if (iProviderConnectCallback != null) {
                ConnectResult connectResult = ConnectResult.FAILED_OTHER;
                iProviderConnectCallback.onConnect(connectResult.code, connectResult.message);
            }
        } catch (RemoteException e2) {
            e2.printStackTrace();
            if (iProviderConnectCallback != null) {
                ConnectResult connectResult2 = ConnectResult.FAILED_OTHER;
                iProviderConnectCallback.onConnect(connectResult2.code, connectResult2.message);
            }
        }
    }

    @Override // com.autonavi.minimap.wearable.IWearableConnectProvider
    public void onServiceDisconnect() {
        reportLog("amap disconnect");
        com.glyphix.mas.utils.b.c().c("amap service disconnect");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", -999);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("message", jSONObject);
            sendMessage(this.receiver, jSONObject2.toString(), null);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.autonavi.minimap.wearable.IWearableConnectProvider
    public void send(String str, String str2, IProviderSendCallback iProviderSendCallback) {
        reportLog("amap send" + this.receiver + " " + str2);
        com.glyphix.mas.utils.b.c().c("amap send message", this.receiver, str2);
        sendMessage(this.receiver, str2, iProviderSendCallback);
    }

    @Override // com.autonavi.minimap.wearable.IWearableConnectProvider
    public void sendNotify(String str, String str2) {
        reportLog("amap send notify" + str + " " + str2);
        com.glyphix.mas.utils.b.c().c("amap send notify", str, str2);
    }
}
