package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.os.BundleCompat;
import com.oplus.wearable.linkservice.sdk.IWearableCallback;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import com.oplus.wearable.linkservice.sdk.common.Status;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class u0c {
    public Handler a;
    public long b;
    public eu1 c;
    public String d;

    public class a extends eu1 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.eu1
        public void b(ModuleInfo moduleInfo, sr0 sr0Var) {
            if (moduleInfo == null) {
                uml.b("MessageTransferManager", "onMessageReceived: moduleInfo is null");
                return;
            }
            if (sr0Var == null) {
                uml.b("MessageTransferManager", "onMessageReceived: btCommand is null");
                return;
            }
            if (sr0Var.c() == null) {
                uml.b("MessageTransferManager", "onMessageReceived: receiveData is null");
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            uml.a("MessageTransferManager", "onMessageReceived: from " + veb.a(moduleInfo.getMacAddress()) + " dataLen=" + sr0Var.c().length + " interval=" + (jCurrentTimeMillis - u0c.this.b));
            u0c.this.b = jCurrentTimeMillis;
            if (u0c.this.a != null) {
                Message messageObtainMessage = u0c.this.a.obtainMessage(100);
                Bundle bundle = new Bundle();
                byte[] bArrC = sr0Var.c();
                if (bArrC == null) {
                    uml.b("MessageTransferManager", "onMessageReceived: data == null");
                    return;
                }
                bundle.putParcelable("device", moduleInfo);
                bundle.putByteArray("content", bArrC);
                messageObtainMessage.setData(bundle);
                u0c.this.a.sendMessage(messageObtainMessage);
            }
        }
    }

    public final class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 100) {
                Bundle data = message.getData();
                ModuleInfo moduleInfo = (ModuleInfo) BundleCompat.getParcelable(data, "device", ModuleInfo.class);
                byte[] byteArray = data.getByteArray("content");
                if (moduleInfo == null || byteArray == null) {
                    uml.b("MessageTransferManager", "handleMessage: deviceInfo or messageByte is null!");
                } else {
                    u0c.this.e(moduleInfo, byteArray);
                }
            }
        }
    }

    public static class c {
        public static final u0c a = new u0c();
    }

    public static u0c d() {
        return c.a;
    }

    public void e(ModuleInfo moduleInfo, byte[] bArr) {
        if (bArr.length < 2) {
            uml.b("MessageTransferManager", "handleMessage: param is invalid");
            return;
        }
        int length = bArr.length - 2;
        byte[] bArr2 = new byte[length];
        int i = bArr[0] & 255;
        int i2 = bArr[1] & 255;
        System.arraycopy(bArr, 2, bArr2, 0, length);
        wml.h().l(moduleInfo.getMacAddress(), new MessageEvent(i, i2, bArr2));
    }

    public void f(Context context) {
        uml.a("MessageTransferManager", "initialize");
        this.d = context.getPackageName();
        if (this.a == null) {
            this.a = new b(context.getMainLooper());
        }
        kd5.v().n(this.c);
    }

    public final boolean g(MessageEvent messageEvent) {
        return messageEvent != null && messageEvent.getServiceId() >= 0 && messageEvent.getCommandId() >= 0;
    }

    public void h() {
        kd5.v().g(this.c);
    }

    public boolean i(ModuleInfo moduleInfo, String str, MessageEvent messageEvent, IWearableCallback iWearableCallback, int i) {
        byte[] data = messageEvent.getData();
        int connectionType = moduleInfo.getConnectionType();
        if (xx3.c(connectionType) && data != null && data.length > 102400) {
            uml.b("MessageTransferManager", "br data too large len=" + data.length + " sid=" + messageEvent.getServiceId() + " cid=" + messageEvent.getCommandId());
            try {
                iWearableCallback.onResult(Status.LENGTH_OUT_OF_RANGE);
            } catch (RemoteException e) {
                uml.b("MessageTransferManager", "call BR error " + e.getMessage());
            }
            return false;
        }
        if (xx3.b(connectionType) && data != null && data.length > 2048) {
            uml.b("MessageTransferManager", "ble data too large len=" + data.length + " sid=" + messageEvent.getServiceId() + " cid=" + messageEvent.getCommandId());
            try {
                iWearableCallback.onResult(Status.LENGTH_OUT_OF_RANGE);
            } catch (RemoteException e2) {
                uml.b("MessageTransferManager", "call BLE error " + e2.getMessage());
            }
            return false;
        }
        x0c.INSTANCE.e(messageEvent.getServiceId(), messageEvent.getCommandId(), data);
        if (TextUtils.isEmpty(str) || !g(messageEvent)) {
            uml.b("MessageTransferManager", "sendMessage: caller=" + str + " check error " + messageEvent);
        } else {
            pml pmlVarG = wml.h().g(str);
            if (pmlVarG == null) {
                uml.b("MessageTransferManager", "sendMessage: caller=" + str + " not has permission");
                return false;
            }
            int commandId = messageEvent.getCommandId() & 255;
            int serviceId = messageEvent.getServiceId() & 255;
            byte[] data2 = messageEvent.getData();
            if (pmlVarG.m(serviceId)) {
                if (TextUtils.equals(this.d, str)) {
                    uml.d("MessageTransferManager", "sendMessage caller:this " + messageEvent + " to " + veb.a(moduleInfo.getMacAddress()));
                } else {
                    uml.d("MessageTransferManager", "sendMessage caller:" + str + " " + messageEvent + " to " + veb.a(moduleInfo.getMacAddress()));
                }
                byte[] bArr = new byte[data2 != null ? data2.length + 2 : 2];
                bArr[0] = (byte) serviceId;
                bArr[1] = (byte) commandId;
                if (data2 != null) {
                    System.arraycopy(data2, 0, bArr, 2, data2.length);
                }
                boolean z = !moduleInfo.isMainModule();
                sr0 sr0Var = new sr0(bArr);
                sr0Var.g(new nml(iWearableCallback));
                sr0Var.i(i);
                sr0Var.h(z);
                return kd5.v().e(moduleInfo, sr0Var);
            }
            uml.b("MessageTransferManager", "sendMessage: caller=" + str + " not registry sid=" + serviceId);
        }
        return false;
    }

    public u0c() {
        this.b = 0L;
        this.c = new a();
    }
}
