package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public abstract class f21 implements rq9 {
    public Set<d04> a = new CopyOnWriteArraySet();
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
                    f21.this.n(deviceInfo);
                    break;
                case 103:
                    f21.this.o(deviceInfo, i);
                    break;
                case 104:
                    f21.this.l(deviceInfo, i);
                    break;
                case 105:
                    f21.this.m(deviceInfo);
                    break;
                case 106:
                    f21.this.p(deviceInfo, i, message.arg2);
                    break;
            }
        }
    }

    @Override // com.oplus.aiunit.vision.rq9
    public void f(d04 d04Var) {
        this.a.add(d04Var);
    }

    public final void l(DeviceInfo deviceInfo, int i) {
        Iterator<d04> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b(deviceInfo, i);
        }
    }

    public final void m(DeviceInfo deviceInfo) {
        Iterator<d04> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(deviceInfo);
        }
    }

    public final void n(DeviceInfo deviceInfo) {
        Iterator<d04> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().c(deviceInfo);
        }
    }

    public final void o(DeviceInfo deviceInfo, int i) {
        Iterator<d04> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().d(deviceInfo, i);
        }
    }

    public final void p(DeviceInfo deviceInfo, int i, int i2) {
        for (d04 d04Var : this.a) {
            if (d04Var instanceof mh1) {
                ((mh1) d04Var).e(deviceInfo, i, i2);
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

    @Override // com.oplus.aiunit.vision.rq9
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
