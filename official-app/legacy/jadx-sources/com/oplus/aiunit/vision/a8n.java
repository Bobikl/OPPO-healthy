package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.platform.usercenter.tools.device.OpenIDHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a8n {
    public x7n f;
    public HandlerThread g;
    public Context h;
    public volatile IInterface a = null;
    public String b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9247c = null;
    public final Object d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ServiceConnection f9248e = null;
    public boolean i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9249j = false;
    public final u7n k = new u7n(this);

    public static void d(a8n a8nVar) {
        ServiceConnection serviceConnection;
        synchronized (a8nVar) {
            try {
                if (a8nVar.a != null) {
                    k8n.a("2019");
                    Context context = a8nVar.h;
                    if (context != null && (serviceConnection = a8nVar.f9248e) != null) {
                        context.unbindService(serviceConnection);
                    }
                    a8nVar.a = null;
                }
            } catch (Exception e2) {
                k8n.b("1010", e2);
            }
        }
    }

    public static boolean g(ProviderInfo[] providerInfoArr) {
        if (providerInfoArr == null || providerInfoArr.length == 0) {
            Log.e("IDHelper", "1089");
            return false;
        }
        for (ProviderInfo providerInfo : providerInfoArr) {
            if (providerInfo.authority.equals("com.oplus.omes.oaid_status_provider")) {
                return true;
            }
        }
        return false;
    }

    public abstract Intent a();

    public abstract void b(Context context, String str, String str2);

    public final synchronized void c(Context context, ArrayList arrayList, boolean z) {
        if (this.f == null) {
            HandlerThread handlerThread = new HandlerThread("GetIDWorkThread");
            this.g = handlerThread;
            handlerThread.start();
            this.f = new x7n(this, this.g.getLooper());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!(z ? h(str) : f(str))) {
                arrayList2.add(str);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        k8n.a("2010");
        if (TextUtils.isEmpty(this.b)) {
            this.b = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.f9247c)) {
            this.f9247c = o7n.k(context, this.b);
            k8n.a(this.b + "'s target sign: " + this.f9247c);
        }
        e(arrayList2);
    }

    public final void e(ArrayList arrayList) {
        k8n.a("2048");
        if (this.a == null) {
            k8n.a("2009");
            try {
                if (this.h.bindService(a(), this.f9248e, 1)) {
                    k8n.a("2013");
                    if (this.a == null) {
                        synchronized (this.d) {
                            try {
                                try {
                                    if (this.a == null) {
                                        this.d.wait(10000L);
                                    }
                                } catch (InterruptedException e2) {
                                    k8n.b("1006", e2);
                                }
                            } catch (Exception e3) {
                                k8n.b("1057", e3);
                            }
                        }
                    }
                } else {
                    Log.e("IDHelper", "1007");
                }
            } catch (Exception e4) {
                k8n.b("1008", e4);
            }
        }
        if (this.a == null) {
            Log.e("IDHelper", "1004");
            return;
        }
        x7n x7nVar = this.f;
        if (x7nVar != null) {
            x7nVar.removeMessages(2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j((String) it.next());
        }
        x7n x7nVar2 = this.f;
        if (x7nVar2 == null) {
            return;
        }
        Message messageObtainMessage = x7nVar2.obtainMessage();
        messageObtainMessage.what = 2;
        this.f.sendMessageDelayed(messageObtainMessage, 300000L);
    }

    public abstract boolean f(String str);

    public abstract boolean h(String str);

    public abstract String i(String str);

    public final void j(String str) {
        synchronized (this.d) {
            k8n.a(str + " 2023");
            x7n x7nVar = this.f;
            if (x7nVar != null) {
                Message messageObtainMessage = x7nVar.obtainMessage();
                if (str.equals("RESET_OUID")) {
                    messageObtainMessage.what = 3;
                } else {
                    messageObtainMessage.what = 1;
                }
                Bundle bundle = new Bundle();
                bundle.putString("IdType", str);
                messageObtainMessage.setData(bundle);
                this.f.sendMessage(messageObtainMessage);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            int i = str.equals(OpenIDHelper.DUID) ? 5000 : 2000;
            try {
                try {
                    this.d.wait(i);
                } catch (InterruptedException e2) {
                    k8n.b("1022", e2);
                }
            } catch (Exception e3) {
                k8n.b("1058", e3);
            }
            if (SystemClock.uptimeMillis() - jUptimeMillis > i) {
                Log.e("IDHelper", "1023");
            }
            k8n.a(str.concat(" 2024"));
        }
    }
}
