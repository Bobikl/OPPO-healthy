package com.oplus.aiunit.vision;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.speech.engine.constant.EngineConstant;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.hapjs.features.channel.ChannelMessage;
import org.hapjs.features.channel.appinfo.AndroidApplication;
import org.hapjs.features.channel.appinfo.HapApplication;
import org.hapjs.features.channel.listener.EventCallBack;

/* JADX INFO: loaded from: classes.dex */
public abstract class g9m implements vsm {
    public static final AtomicLong m = new AtomicLong(0);
    public String a;
    public final AndroidApplication b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HapApplication f11680c;
    public HandlerThread d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f11681e;
    public int f;
    public int g;
    public String h;
    public Messenger i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ConcurrentHashMap<pam, String> f11682j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f11683l;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                dum dumVar = (dum) g9m.this;
                int i2 = dumVar.f;
                if (i2 != 0) {
                    dumVar.c(2, "Fail to open channel, invalid status:" + i2);
                    return;
                }
                dumVar.b(1);
                dumVar.i = (Messenger) message.obj;
                dumVar.b(2);
                return;
            }
            if (i == 1) {
                e eVar = (e) message.obj;
                EventCallBack eventCallBack = eVar.b;
                if (g9m.h(g9m.this, eVar.a)) {
                    if (eventCallBack != null) {
                        eventCallBack.onSuccess();
                        return;
                    }
                    return;
                } else {
                    if (eventCallBack != null) {
                        eventCallBack.onFail();
                        return;
                    }
                    return;
                }
            }
            if (i == 2) {
                b bVar = (b) message.obj;
                EventCallBack eventCallBack2 = bVar.d;
                if (g9m.this.f(bVar.a, bVar.f11684c, bVar.b)) {
                    if (eventCallBack2 != null) {
                        eventCallBack2.onSuccess();
                        return;
                    }
                    return;
                } else {
                    if (eventCallBack2 != null) {
                        eventCallBack2.onFail();
                        return;
                    }
                    return;
                }
            }
            if (i != 3) {
                if (i == 4) {
                    g9m.this.f(1, (String) message.obj, false);
                    return;
                } else {
                    if (i != 5) {
                        return;
                    }
                    c cVar = (c) message.obj;
                    g9m g9mVar = g9m.this;
                    cVar.getClass();
                    g9mVar.c(0, null);
                    return;
                }
            }
            g9m g9mVar2 = g9m.this;
            Bundle bundle = (Bundle) message.obj;
            g9mVar2.getClass();
            ChannelMessage channelMessage = ChannelMessage.parse(bundle);
            for (pam pamVar : new HashSet(g9mVar2.f11682j.keySet())) {
                if (pamVar != null) {
                    pamVar.b(g9mVar2, channelMessage);
                }
            }
        }
    }

    public static class b {
        public int a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f11684c;
        public EventCallBack d;
    }

    public static class c {
    }

    public static class d {
        public static HandlerThread a;

        static {
            HandlerThread handlerThread = new HandlerThread("ChannelBase");
            a = handlerThread;
            handlerThread.start();
        }
    }

    public static class e {
        public ChannelMessage a;
        public EventCallBack b;
    }

    public g9m(AndroidApplication androidApplication, HapApplication hapApplication, HandlerThread handlerThread, String str) {
        this.b = androidApplication;
        this.f11680c = hapApplication;
        if (TextUtils.isEmpty(str)) {
            this.a = "default";
        } else {
            this.a = str;
        }
        b(0);
        this.f11682j = new ConcurrentHashMap<>();
        if (handlerThread != null) {
            this.d = handlerThread;
        } else {
            this.d = d.a;
        }
        this.f11681e = new a(this.d.getLooper());
    }

    public static String a() {
        return String.valueOf(m.incrementAndGet());
    }

    public static boolean h(g9m g9mVar, ChannelMessage channelMessage) {
        if (g9mVar.f != 2) {
            g9mVar.c(2, "Fail to send message, invalid status:" + g9mVar.f);
            return false;
        }
        int iDataSize = channelMessage.dataSize();
        if (iDataSize > 524288) {
            g9mVar.c(5, "Data size must less than 524288 but " + iDataSize);
            return false;
        }
        List<ParcelFileDescriptor> list = channelMessage.streams;
        int size = list != null ? list.size() : 0;
        if (size > 64) {
            g9mVar.c(5, "File count must less than 64 but " + size);
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("content", channelMessage.toBundle());
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.setData(bundle);
        return g9mVar.g(messageObtain);
    }

    public void b(int i) {
        int i2 = this.f;
        this.f = i;
        if (i2 == 1 && i == 2) {
            for (pam pamVar : new HashSet(this.f11682j.keySet())) {
                if (pamVar != null) {
                    pamVar.c(this);
                }
            }
        }
        if (i2 == 2 && i == 3) {
            int i3 = this.g;
            String str = this.h;
            for (pam pamVar2 : new HashSet(this.f11682j.keySet())) {
                if (pamVar2 != null) {
                    pamVar2.a(this, i3, str);
                }
            }
        }
    }

    public void c(int i, String str) {
        for (pam pamVar : new HashSet(this.f11682j.keySet())) {
            if (pamVar != null) {
                pamVar.d(this, i, str);
            }
        }
    }

    public void d(int i, String str, boolean z, EventCallBack eventCallBack) {
        b bVar = new b();
        bVar.a = i;
        bVar.f11684c = str;
        bVar.b = z;
        bVar.d = eventCallBack;
        this.f11681e.obtainMessage(2, bVar).sendToTarget();
    }

    public void e(String str) {
        this.k = str;
    }

    public boolean f(int i, String str, boolean z) {
        int i2 = this.f;
        if (i2 != 2 && i2 != 1) {
            c(2, "Fail to close channel, invalid status " + this.f);
            return false;
        }
        if (z) {
            Bundle bundle = new Bundle();
            bundle.putString(EngineConstant.REASON, str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 3;
            messageObtain.setData(bundle);
            g(messageObtain);
        }
        this.i = null;
        this.g = i;
        this.h = str;
        b(3);
        Log.v("ChannelBase", "Channel closed, code:" + i + ", reason:" + str);
        return true;
    }

    public final boolean g(Message message) {
        try {
            if (this.i != null) {
                message.getData().putString("idAtReceiver", ((dum) this).k);
                this.i.send(message);
            }
            if (!((dum) this).f10697n) {
                message.recycle();
            }
            c(6, "Fail to send message, messenger is null.");
            return false;
        } catch (RemoteException e2) {
            c(4, "Remote app died.");
            Log.e("ChannelBase", "Remote app died.", e2);
            return false;
        } finally {
            if (!((dum) this).f10697n) {
                message.recycle();
            }
        }
    }

    public HapApplication getHapApplication() {
        return this.f11680c;
    }

    public int getStatus() {
        return this.f;
    }

    public boolean i(pam pamVar) {
        return this.f11682j.putIfAbsent(pamVar, "") == null;
    }

    public void j(String str) {
        this.f11683l = str;
    }

    public void send(ChannelMessage channelMessage, EventCallBack eventCallBack) {
        e eVar = new e();
        eVar.a = channelMessage;
        eVar.b = eventCallBack;
        this.f11681e.obtainMessage(1, eVar).sendToTarget();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Channel[type=" + getClass().getSimpleName());
        AndroidApplication androidApplication = this.b;
        if (androidApplication != null && !TextUtils.isEmpty(androidApplication.mPkgName)) {
            sb.append(", androidPkgName=" + this.b.mPkgName);
        }
        HapApplication hapApplication = this.f11680c;
        if (hapApplication != null && !TextUtils.isEmpty(hapApplication.mPkgName)) {
            sb.append(", hapPkgName=" + this.f11680c.mPkgName);
        }
        sb.append(", serverId=" + this.f11683l);
        sb.append(", clientId=" + this.k + "]");
        return sb.toString();
    }
}
