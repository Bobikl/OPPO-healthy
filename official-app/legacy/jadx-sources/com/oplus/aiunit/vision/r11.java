package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes5.dex */
public abstract class r11 implements lp9 {
    public Set<qz3> a = new CopyOnWriteArraySet();
    public Handler b = new a(Looper.getMainLooper());

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            DeviceInfo deviceInfo = (DeviceInfo) message.obj;
            if (deviceInfo == null) {
            }
            int i = message.arg1;
            switch (message.what) {
                case 102:
                    r11.this.n(deviceInfo);
                    break;
                case 103:
                    r11.this.o(deviceInfo, i);
                    break;
                case 104:
                    r11.this.l(deviceInfo, i);
                    break;
                case 105:
                    r11.this.m(deviceInfo);
                    break;
                case 106:
                    r11.this.p(deviceInfo, i, message.arg2);
                    break;
            }
        }
    }

    @Override // com.oplus.aiunit.vision.lp9
    public void f(qz3 qz3Var) {
        this.a.add(qz3Var);
    }

    public final void l(DeviceInfo deviceInfo, int i) {
        Iterator<qz3> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b(deviceInfo, i);
        }
    }

    public final void m(DeviceInfo deviceInfo) {
        Iterator<qz3> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(deviceInfo);
        }
    }

    public final void n(DeviceInfo deviceInfo) {
        Iterator<qz3> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().c(deviceInfo);
        }
    }

    public final void o(DeviceInfo deviceInfo, int i) {
        Iterator<qz3> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().d(deviceInfo, i);
        }
    }

    public final void p(DeviceInfo deviceInfo, int i, int i2) {
        for (qz3 qz3Var : this.a) {
            if (qz3Var instanceof wg1) {
                ((wg1) qz3Var).e(deviceInfo, i, i2);
            }
        }
    }

    public void q(DeviceInfo deviceInfo) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 105;
        messageObtain.obj = deviceInfo;
        this.b.sendMessage(messageObtain);
    }

    public void r(DeviceInfo deviceInfo) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 102;
        messageObtain.obj = deviceInfo;
        this.b.sendMessage(messageObtain);
    }

    @Override // com.oplus.aiunit.vision.lp9
    public void release() {
    }

    public void s(DeviceInfo deviceInfo, int i) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 103;
        messageObtain.obj = deviceInfo;
        messageObtain.arg1 = i;
        this.b.sendMessage(messageObtain);
    }
}
