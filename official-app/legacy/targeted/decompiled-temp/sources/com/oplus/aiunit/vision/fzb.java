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

/* JADX INFO: loaded from: classes5.dex */
public class fzb {
    public Handler a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qt1 f11574c;
    public String d;

    public class a extends qt1 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.qt1
        public void b(ModuleInfo moduleInfo, br0 br0Var) {
            if (moduleInfo == null) {
                wil.b("MessageTransferManager", "onMessageReceived: moduleInfo is null");
                return;
            }
            if (br0Var == null) {
                wil.b("MessageTransferManager", "onMessageReceived: btCommand is null");
                return;
            }
            if (br0Var.c() == null) {
                wil.b("MessageTransferManager", "onMessageReceived: receiveData is null");
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            wil.a("MessageTransferManager", "onMessageReceived: from " + gdb.a(moduleInfo.getMacAddress()) + " dataLen=" + br0Var.c().length + " interval=" + (jCurrentTimeMillis - fzb.this.b));
            fzb.this.b = jCurrentTimeMillis;
            if (fzb.this.a != null) {
                Message messageObtainMessage = fzb.this.a.obtainMessage(100);
                Bundle bundle = new Bundle();
                byte[] bArrC = br0Var.c();
                if (bArrC == null) {
                    wil.b("MessageTransferManager", "onMessageReceived: data == null");
                    return;
                }
                bundle.putParcelable("device", moduleInfo);
                bundle.putByteArray("content", bArrC);
                messageObtainMessage.setData(bundle);
                fzb.this.a.sendMessage(messageObtainMessage);
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
                    wil.b("MessageTransferManager", "handleMessage: deviceInfo or messageByte is null!");
                } else {
                    fzb.this.e(moduleInfo, byteArray);
                }
            }
        }
    }

    public static class c {
        public static final fzb a = new fzb();
    }

    public static fzb d() {
        return c.a;
    }

    public void e(ModuleInfo moduleInfo, byte[] bArr) {
        if (bArr.length < 2) {
            wil.b("MessageTransferManager", "handleMessage: param is invalid");
            return;
        }
        int length = bArr.length - 2;
        byte[] bArr2 = new byte[length];
        int i = bArr[0] & 255;
        int i2 = bArr[1] & 255;
        System.arraycopy(bArr, 2, bArr2, 0, length);
        yil.h().l(moduleInfo.getMacAddress(), new MessageEvent(i, i2, bArr2));
    }

    public void f(Context context) {
        wil.a("MessageTransferManager", "initialize");
        this.d = context.getPackageName();
        if (this.a == null) {
            this.a = new b(context.getMainLooper());
        }
        pc5.v().n(this.f11574c);
    }

    public final boolean g(MessageEvent messageEvent) {
        return messageEvent != null && messageEvent.getServiceId() >= 0 && messageEvent.getCommandId() >= 0;
    }

    public void h() {
        pc5.v().g(this.f11574c);
    }

    public boolean i(ModuleInfo moduleInfo, String str, MessageEvent messageEvent, IWearableCallback iWearableCallback, int i) {
        byte[] data = messageEvent.getData();
        int connectionType = moduleInfo.getConnectionType();
        if (jx3.c(connectionType) && data != null && data.length > 102400) {
            wil.b("MessageTransferManager", "br data too large len=" + data.length + " sid=" + messageEvent.getServiceId() + " cid=" + messageEvent.getCommandId());
            try {
                iWearableCallback.onResult(Status.LENGTH_OUT_OF_RANGE);
            } catch (RemoteException e2) {
                wil.b("MessageTransferManager", "call BR error " + e2.getMessage());
            }
            return false;
        }
        if (jx3.b(connectionType) && data != null && data.length > 2048) {
            wil.b("MessageTransferManager", "ble data too large len=" + data.length + " sid=" + messageEvent.getServiceId() + " cid=" + messageEvent.getCommandId());
            try {
                iWearableCallback.onResult(Status.LENGTH_OUT_OF_RANGE);
            } catch (RemoteException e3) {
                wil.b("MessageTransferManager", "call BLE error " + e3.getMessage());
            }
            return false;
        }
        izb.INSTANCE.e(messageEvent.getServiceId(), messageEvent.getCommandId(), data);
        if (TextUtils.isEmpty(str) || !g(messageEvent)) {
            wil.b("MessageTransferManager", "sendMessage: caller=" + str + " check error " + messageEvent);
        } else {
            ril rilVarG = yil.h().g(str);
            if (rilVarG == null) {
                wil.b("MessageTransferManager", "sendMessage: caller=" + str + " not has permission");
                return false;
            }
            int commandId = messageEvent.getCommandId() & 255;
            int serviceId = messageEvent.getServiceId() & 255;
            byte[] data2 = messageEvent.getData();
            if (rilVarG.m(serviceId)) {
                if (TextUtils.equals(this.d, str)) {
                    wil.d("MessageTransferManager", "sendMessage caller:this " + messageEvent + " to " + gdb.a(moduleInfo.getMacAddress()));
                } else {
                    wil.d("MessageTransferManager", "sendMessage caller:" + str + " " + messageEvent + " to " + gdb.a(moduleInfo.getMacAddress()));
                }
                byte[] bArr = new byte[data2 != null ? data2.length + 2 : 2];
                bArr[0] = (byte) serviceId;
                bArr[1] = (byte) commandId;
                if (data2 != null) {
                    System.arraycopy(data2, 0, bArr, 2, data2.length);
                }
                boolean z = !moduleInfo.isMainModule();
                br0 br0Var = new br0(bArr);
                br0Var.g(new pil(iWearableCallback));
                br0Var.i(i);
                br0Var.h(z);
                return pc5.v().e(moduleInfo, br0Var);
            }
            wil.b("MessageTransferManager", "sendMessage: caller=" + str + " not registry sid=" + serviceId);
        }
        return false;
    }

    public fzb() {
        this.b = 0L;
        this.f11574c = new a();
    }
}
