package com.lifesense.android.bluetooth.core.business.detect;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.lifesense.android.bluetooth.core.OnConnectExceptionListener;
import com.lifesense.android.bluetooth.core.bean.ExcepetionRecord;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.bean.constant.ConnectionStableStatus;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi"})
public final class a extends com.lifesense.android.bluetooth.core.business.log.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a f8577e;
    public HandlerThread a;
    public Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OnConnectExceptionListener f8578c;
    public boolean d;

    /* JADX INFO: renamed from: com.lifesense.android.bluetooth.core.business.detect.a$a, reason: collision with other inner class name */
    public class C0824a {
        public C0824a(a aVar) {
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null || message.obj == null || !a.this.d || a.this.f8578c == null) {
                return;
            }
            try {
                int i = message.arg1;
                if (1 == i) {
                    Object obj = message.obj;
                    if (obj instanceof ExcepetionRecord) {
                        a.this.f8578c.onExceptionRecordNotify((ExcepetionRecord) obj);
                        return;
                    }
                }
                if (3 == i) {
                    Object obj2 = message.obj;
                    if (obj2 instanceof ConnectionStableStatus) {
                        a.this.f8578c.onConnectionStableStatusChange((ConnectionStableStatus) obj2);
                    }
                }
            } catch (Exception e2) {
                String str = "failed to handle error record,typ =" + message.arg1 + "; obj=" + message.obj;
                a aVar = a.this;
                aVar.printLogMessage(aVar.getGeneralLogInfo(null, str, com.lifesense.android.bluetooth.core.business.log.report.a.Program_Exception, null, true));
                e2.printStackTrace();
            }
        }
    }

    public a() {
        new C0824a(this);
        this.f8578c = null;
        this.d = false;
        HandlerThread handlerThread = new HandlerThread("BluetoothExceptionHandler");
        this.a = handlerThread;
        handlerThread.start();
        this.b = new b(this.a.getLooper());
        this.a.setPriority(10);
    }

    public static synchronized a getInstance() {
        a aVar = f8577e;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        f8577e = aVar2;
        return aVar2;
    }

    @SuppressLint({"NewApi"})
    public void destoryInstance() {
        try {
            HandlerThread handlerThread = this.a;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.a = null;
                this.b = null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(OnConnectExceptionListener onConnectExceptionListener) {
        this.f8578c = onConnectExceptionListener;
        this.d = onConnectExceptionListener != null;
    }

    public void a(ConnectionStableStatus connectionStableStatus) {
        Message messageObtainMessage = this.b.obtainMessage();
        messageObtainMessage.arg1 = 3;
        messageObtainMessage.obj = connectionStableStatus;
        this.b.sendMessage(messageObtainMessage);
    }

    public void a(com.lifesense.android.bluetooth.core.business.detect.common.b bVar, LsDeviceInfo lsDeviceInfo) {
        String firmwareVersion;
        String modelNumber;
        if (a() && bVar != null) {
            if (lsDeviceInfo != null) {
                firmwareVersion = lsDeviceInfo.getFirmwareVersion();
                modelNumber = lsDeviceInfo.getModelNumber();
            } else {
                firmwareVersion = null;
                modelNumber = null;
            }
            ExcepetionRecord excepetionRecord = new ExcepetionRecord(bVar.a(), firmwareVersion, modelNumber);
            Message messageObtainMessage = this.b.obtainMessage();
            messageObtainMessage.arg1 = 1;
            messageObtainMessage.obj = excepetionRecord;
            this.b.sendMessage(messageObtainMessage);
        }
    }

    public final boolean a() {
        return (!this.d || this.f8578c == null || this.b == null) ? false : true;
    }
}
