package com.oplusos.sau.common.client;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Log;
import com.oplus.aiunit.vision.e7b;
import com.oplus.aiunit.vision.hcm;
import com.oplus.aiunit.vision.pea;
import com.oplus.aiunit.vision.sea;
import com.oplusos.sau.aidl.AppUpdateInfo;
import com.oplusos.sau.aidl.DataresUpdateInfo;
import com.oplusos.sau.common.utils.SauAarConstants;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class SauUpdateAgent {
    public static volatile SauUpdateAgent q;
    public Context a;
    public com.oplusos.sau.aidl.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20178c;
    public pea d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public pea f20179e;
    public Handler f;
    public Map g;
    public Map h;
    public long i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f20181l;
    public int m;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20180j = 0;
    public int k = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20182n = -1;
    public ServiceConnection o = new a();
    public com.oplusos.sau.aidl.b p = new b();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            SauUpdateAgent.this.f20180j = 0;
            if (SauUpdateAgent.this.f20178c) {
                e7b.a("SauUpdateAgent", "has bound, only return");
                return;
            }
            SauUpdateAgent.this.f20178c = true;
            Message messageObtainMessage = SauUpdateAgent.this.f.obtainMessage(1005);
            messageObtainMessage.obj = iBinder;
            messageObtainMessage.sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            e7b.a("SauUpdateAgent", "on services disconnected will unbind service");
            SauUpdateAgent.this.f.removeMessages(1002);
            SauUpdateAgent.this.f.sendEmptyMessage(1006);
        }
    }

    public class c extends Handler {
        public /* synthetic */ c(SauUpdateAgent sauUpdateAgent, Looper looper, a aVar) {
            this(looper);
        }

        public final void a() {
            Intent intent = new Intent(SauAarConstants.a);
            Intent intent2 = new Intent(SauAarConstants.b);
            intent.setPackage(SauAarConstants.U);
            intent2.setPackage(SauAarConstants.V);
            List<ResolveInfo> listQueryIntentServices = SauUpdateAgent.this.a.getPackageManager().queryIntentServices(intent, 0);
            List<ResolveInfo> listQueryIntentServices2 = SauUpdateAgent.this.a.getPackageManager().queryIntentServices(intent2, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                Log.w("SauUpdateAgent", "is old sauBinderservice");
                SauUpdateAgent.this.a.bindService(intent, SauUpdateAgent.this.o, 1);
                return;
            }
            if (listQueryIntentServices2 == null || listQueryIntentServices2.size() <= 0) {
                SauUpdateAgent sauUpdateAgent = SauUpdateAgent.this;
                if (sauUpdateAgent.k(sauUpdateAgent.f20180j)) {
                    e7b.f("SauUpdateAgent", "maybe not support it.");
                    return;
                }
                return;
            }
            Log.w("SauUpdateAgent", "is new sauBinderservice ,reset description");
            com.oplusos.sau.aidl.a.AbstractBinderC0986a.b();
            com.oplusos.sau.aidl.b.a.b();
            SauUpdateAgent.this.a.bindService(intent2, SauUpdateAgent.this.o, 1);
        }

        public final void b(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                if (SauUpdateAgent.this.f20182n == 0) {
                    if (SauUpdateAgent.this.d != null) {
                        SauUpdateAgent.this.d.c(str, -1L, -1L, -1L, -32765);
                        return;
                    }
                    return;
                }
                try {
                    if (SauUpdateAgent.this.b != null) {
                        SauUpdateAgent.this.b.f(SauUpdateAgent.this.a.getPackageName(), str);
                        return;
                    }
                    if (SauUpdateAgent.this.d != null) {
                        SauUpdateAgent.this.d.c(str, -1L, -1L, -1L, -32764);
                    }
                    Log.i("SauUpdateAgent", "SauUpdateService is null");
                } catch (RemoteException e2) {
                    SauUpdateAgent.this.h(e2);
                    if (SauUpdateAgent.this.d != null) {
                        SauUpdateAgent.this.d.d(str);
                    }
                }
            }
        }

        public final void c() {
            if (SauUpdateAgent.this.b == null) {
                Log.w("SauUpdateAgent", "service is null, when unbind, only return");
                return;
            }
            try {
                SauUpdateAgent.this.b.a(SauUpdateAgent.this.a.getPackageName(), SauUpdateAgent.this.p);
            } catch (Exception e2) {
                StringBuilder sbA = hcm.a("some thing error--");
                sbA.append(e2.getMessage());
                e7b.f("SauUpdateAgent", sbA.toString());
            }
            try {
                SauUpdateAgent.this.a.unbindService(SauUpdateAgent.this.o);
            } catch (Exception e3) {
                StringBuilder sbA2 = hcm.a("unbind service error--");
                sbA2.append(e3.getMessage());
                e7b.f("SauUpdateAgent", sbA2.toString());
            }
            SauUpdateAgent.this.b = null;
            SauUpdateAgent.this.f20178c = false;
        }

        public final void d(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                int i = message.arg1;
                if (SauUpdateAgent.this.f20182n == 0) {
                    if (SauUpdateAgent.this.d != null) {
                        SauUpdateAgent.this.d.a(str, -32765);
                        return;
                    }
                    return;
                }
                try {
                    Log.i("SauUpdateAgent", "request pkg " + str + ", flag=" + i);
                    if (SauUpdateAgent.this.b != null) {
                        SauUpdateAgent.this.b.e(SauUpdateAgent.this.a.getPackageName(), str, i);
                        return;
                    }
                    if (SauUpdateAgent.this.d != null) {
                        SauUpdateAgent.this.d.a(str, -32764);
                    }
                    Log.i("SauUpdateAgent", "SauUpdateService is null");
                } catch (RemoteException e2) {
                    StringBuilder sbA = hcm.a("the errorInfo is ");
                    sbA.append(e2.getMessage());
                    Log.i("SauUpdateAgent", sbA.toString());
                    if (SauUpdateAgent.this.d != null) {
                        SauUpdateAgent.this.d.d(str);
                    }
                }
            }
        }

        public final void e(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                int i = message.arg1;
                if (SauUpdateAgent.this.f20182n == 0) {
                    if (SauUpdateAgent.this.d != null) {
                        SauUpdateAgent.this.d.b(str, -32765);
                        return;
                    }
                    return;
                }
                try {
                    if (SauUpdateAgent.this.b != null) {
                        SauUpdateAgent.this.b.f(SauUpdateAgent.this.a.getPackageName(), str, i);
                        return;
                    }
                    if (SauUpdateAgent.this.d != null) {
                        SauUpdateAgent.this.d.b(str, -32764);
                    }
                    Log.i("SauUpdateAgent", "SauUpdateService is null");
                } catch (RemoteException e2) {
                    SauUpdateAgent.this.h(e2);
                    if (SauUpdateAgent.this.d != null) {
                        SauUpdateAgent.this.d.d(str);
                    }
                }
            }
        }

        public final void f(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                if (SauUpdateAgent.this.f20182n == 0) {
                    if (SauUpdateAgent.this.d != null) {
                        SauUpdateAgent.this.d.c(str, -1L, -1L, -1L, -32765);
                        return;
                    }
                    return;
                }
                try {
                    if (SauUpdateAgent.this.b != null) {
                        SauUpdateAgent.this.b.c(SauUpdateAgent.this.a.getPackageName(), str);
                        return;
                    }
                    if (SauUpdateAgent.this.d != null) {
                        SauUpdateAgent.this.d.c(str, -1L, -1L, -1L, -32764);
                    }
                    Log.i("SauUpdateAgent", "SauUpdateService is null");
                } catch (RemoteException e2) {
                    SauUpdateAgent.this.h(e2);
                    if (SauUpdateAgent.this.d != null) {
                        SauUpdateAgent.this.d.d(str);
                    }
                }
            }
        }

        public final void g(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                if (SauUpdateAgent.this.f20182n == 0) {
                    if (SauUpdateAgent.this.d != null) {
                        SauUpdateAgent.this.d.c(str, -1L, -1L, -1L, -32765);
                        return;
                    }
                    return;
                }
                try {
                    if (SauUpdateAgent.this.b != null) {
                        SauUpdateAgent.this.b.e(SauUpdateAgent.this.a.getPackageName(), str);
                        return;
                    }
                    if (SauUpdateAgent.this.d != null) {
                        SauUpdateAgent.this.d.c(str, -1L, -1L, -1L, -32764);
                    }
                    Log.i("SauUpdateAgent", "SauUpdateService is null");
                } catch (RemoteException e2) {
                    SauUpdateAgent.this.h(e2);
                    if (SauUpdateAgent.this.d != null) {
                        SauUpdateAgent.this.d.d(str);
                    }
                }
            }
        }

        public final void h(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                int i = message.arg1 | Integer.MIN_VALUE;
                if (SauUpdateAgent.this.f20182n == 0) {
                    if (SauUpdateAgent.this.d != null) {
                        SauUpdateAgent.this.d.c(str, -1L, -1L, -1L, -32765);
                        return;
                    }
                    return;
                }
                try {
                    if (SauUpdateAgent.this.b != null) {
                        SauUpdateAgent.this.b.d(SauUpdateAgent.this.a.getPackageName(), str, i);
                        return;
                    }
                    if (SauUpdateAgent.this.d != null) {
                        SauUpdateAgent.this.d.c(str, -1L, -1L, -1L, -32764);
                    }
                    Log.i("SauUpdateAgent", "SauUpdateService is null");
                } catch (RemoteException e2) {
                    SauUpdateAgent.this.h(e2);
                    if (SauUpdateAgent.this.d != null) {
                        SauUpdateAgent.this.d.d(str);
                    }
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i;
            int i2;
            int i3;
            if (message == null) {
                e7b.f("SauUpdateAgent", "message is null");
            }
            StringBuilder sbA = hcm.a("msg=");
            sbA.append((String) SauAarConstants.Z.get(Integer.valueOf(message.what)));
            e7b.d("SauUpdateAgent", sbA.toString());
            int i4 = message.what;
            if (i4 != 1002 && i4 != 1006) {
                SauUpdateAgent.this.y();
            }
            if (SauUpdateAgent.this.b == null && 1002 != (i3 = message.what) && 1001 != i3 && 1005 != i3) {
                SauUpdateAgent sauUpdateAgent = SauUpdateAgent.this;
                if (sauUpdateAgent.k(sauUpdateAgent.f20180j)) {
                    StringBuilder sbA2 = hcm.a("service is null, will binder, retry times:");
                    sbA2.append(SauUpdateAgent.this.f20180j);
                    e7b.d("SauUpdateAgent", sbA2.toString());
                }
                if (SauUpdateAgent.this.f20180j >= 10) {
                    e7b.f("SauUpdateAgent", "request time out");
                    x(message);
                    SauUpdateAgent.this.f20180j = 0;
                    return;
                }
                SauUpdateAgent.s(SauUpdateAgent.this);
                sendEmptyMessage(1001);
                Message messageObtainMessage = obtainMessage();
                messageObtainMessage.what = message.what;
                messageObtainMessage.obj = message.obj;
                messageObtainMessage.arg1 = message.arg1;
                messageObtainMessage.arg2 = message.arg2;
                Bundle data = message.getData();
                if (data != null) {
                    messageObtainMessage.setData(data);
                }
                sendMessageDelayed(messageObtainMessage, 500L);
                return;
            }
            if (SauUpdateAgent.this.b == null && 1001 != (i2 = message.what) && 1005 != i2) {
                e7b.f("SauUpdateAgent", "service is null");
                return;
            }
            if (SauUpdateAgent.this.f20182n == -1 && (i = message.what) != 1006 && i != 1002 && i != 1001 && i != 1003 && i != 1005 && SauUpdateAgent.this.k < 6) {
                e7b.d("SauUpdateAgent", "permission check has not finish, try latter");
                SauUpdateAgent.X(SauUpdateAgent.this);
                Message messageObtainMessage2 = obtainMessage();
                messageObtainMessage2.what = message.what;
                messageObtainMessage2.obj = message.obj;
                messageObtainMessage2.arg1 = message.arg1;
                messageObtainMessage2.arg2 = message.arg2;
                Bundle data2 = message.getData();
                if (data2 != null) {
                    messageObtainMessage2.setData(data2);
                }
                sendMessageDelayed(messageObtainMessage2, 500L);
                return;
            }
            int i5 = message.what;
            switch (i5) {
                case 1001:
                    a();
                    break;
                case 1002:
                case 1006:
                    c();
                    break;
                case 1003:
                    w(message);
                    break;
                case 1004:
                    SauUpdateAgent.this.n();
                    break;
                case 1005:
                    SauUpdateAgent.this.e(message);
                    break;
                default:
                    switch (i5) {
                        case 2001:
                            d(message);
                            break;
                        case 2002:
                            h(message);
                            break;
                        case 2003:
                            f(message);
                            break;
                        case 2004:
                            g(message);
                            break;
                        case 2005:
                            e(message);
                            break;
                        case 2006:
                            b(message);
                            break;
                        default:
                            switch (i5) {
                                case 2011:
                                    j(message);
                                    break;
                                case 2012:
                                    n(message);
                                    break;
                                case 2013:
                                    l(message);
                                    break;
                                case 2014:
                                    m(message);
                                    break;
                                case 2015:
                                    k(message);
                                    break;
                                case 2016:
                                    i(message);
                                    break;
                                default:
                                    switch (i5) {
                                        case 3001:
                                            o(message);
                                            break;
                                        case 3002:
                                            p(message);
                                            break;
                                        case 3003:
                                            r(message);
                                            break;
                                        case 3004:
                                            q(message);
                                            break;
                                        default:
                                            switch (i5) {
                                                case 3011:
                                                    s(message);
                                                    break;
                                                case 3012:
                                                    t(message);
                                                    break;
                                                case SauAarConstants.G /* 3013 */:
                                                    v(message);
                                                    break;
                                                case 3014:
                                                    u(message);
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }

        public final void i(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                if (SauUpdateAgent.this.f20182n == 0) {
                    SauUpdateAgent.I(SauUpdateAgent.this);
                    return;
                }
                try {
                    if (SauUpdateAgent.this.b != null) {
                        SauUpdateAgent.this.b.b(SauUpdateAgent.this.a.getPackageName(), str);
                    } else {
                        SauUpdateAgent.I(SauUpdateAgent.this);
                        Log.i("SauUpdateAgent", "SauUpdateService is null");
                    }
                } catch (RemoteException e2) {
                    SauUpdateAgent.this.h(e2);
                    SauUpdateAgent.I(SauUpdateAgent.this);
                }
            }
        }

        public final void j(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                int i = message.arg1;
                if (SauUpdateAgent.this.f20182n == 0) {
                    SauUpdateAgent.I(SauUpdateAgent.this);
                    return;
                }
                try {
                    e7b.a("SauUpdateAgent", "request bucode  " + str + ", flag=" + i);
                    if (SauUpdateAgent.this.b != null) {
                        SauUpdateAgent.this.b.a(SauUpdateAgent.this.a.getPackageName(), str, i);
                    } else {
                        SauUpdateAgent.I(SauUpdateAgent.this);
                        Log.i("SauUpdateAgent", "SauUpdateService is null");
                    }
                } catch (RemoteException e2) {
                    SauUpdateAgent.this.h(e2);
                    SauUpdateAgent.I(SauUpdateAgent.this);
                }
            }
        }

        public final void k(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                int i = message.arg1;
                if (SauUpdateAgent.this.f20182n == 0) {
                    SauUpdateAgent.I(SauUpdateAgent.this);
                    return;
                }
                try {
                    if (SauUpdateAgent.this.b != null) {
                        SauUpdateAgent.this.b.g(SauUpdateAgent.this.a.getPackageName(), str, i);
                    } else {
                        SauUpdateAgent.I(SauUpdateAgent.this);
                        Log.i("SauUpdateAgent", "SauUpdateService is null");
                    }
                } catch (RemoteException e2) {
                    SauUpdateAgent.this.h(e2);
                    SauUpdateAgent.I(SauUpdateAgent.this);
                }
            }
        }

        public final void l(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                if (SauUpdateAgent.this.f20182n == 0) {
                    SauUpdateAgent.I(SauUpdateAgent.this);
                    return;
                }
                try {
                    if (SauUpdateAgent.this.b != null) {
                        SauUpdateAgent.this.b.d(SauUpdateAgent.this.a.getPackageName(), str);
                    } else {
                        SauUpdateAgent.I(SauUpdateAgent.this);
                        Log.i("SauUpdateAgent", "SauUpdateService is null");
                    }
                } catch (RemoteException e2) {
                    SauUpdateAgent.this.h(e2);
                    SauUpdateAgent.I(SauUpdateAgent.this);
                }
            }
        }

        public final void m(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                if (SauUpdateAgent.this.f20182n == 0) {
                    SauUpdateAgent.I(SauUpdateAgent.this);
                    return;
                }
                try {
                    if (SauUpdateAgent.this.b != null) {
                        SauUpdateAgent.this.b.a(SauUpdateAgent.this.a.getPackageName(), str);
                    } else {
                        SauUpdateAgent.I(SauUpdateAgent.this);
                        Log.i("SauUpdateAgent", "SauUpdateService is null");
                    }
                } catch (RemoteException e2) {
                    SauUpdateAgent.this.h(e2);
                    SauUpdateAgent.I(SauUpdateAgent.this);
                }
            }
        }

        public final void n(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                int i = message.arg1;
                if (SauUpdateAgent.this.f20182n == 0) {
                    SauUpdateAgent.I(SauUpdateAgent.this);
                    return;
                }
                try {
                    if (SauUpdateAgent.this.b != null) {
                        SauUpdateAgent.this.b.b(SauUpdateAgent.this.a.getPackageName(), str, i);
                    } else {
                        SauUpdateAgent.I(SauUpdateAgent.this);
                        Log.i("SauUpdateAgent", "SauUpdateService is null");
                    }
                } catch (RemoteException e2) {
                    SauUpdateAgent.this.h(e2);
                    SauUpdateAgent.I(SauUpdateAgent.this);
                }
            }
        }

        public final void o(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                int i = message.arg1;
                if (SauUpdateAgent.this.d != null) {
                    SauUpdateAgent.this.d.a(str, i);
                }
                if (SauUpdateAgent.this.f20179e != null) {
                    SauUpdateAgent.this.f20179e.a(str, i);
                }
            }
        }

        public final void p(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                Bundle data = message.getData();
                if (data != null) {
                    long j2 = data.getLong("currentSize");
                    long j3 = data.getLong("totalSize");
                    long j4 = data.getLong("speed");
                    int i = data.getInt("status");
                    AppUpdateInfo appUpdateInfo = (AppUpdateInfo) SauUpdateAgent.this.g.get(str);
                    if (appUpdateInfo != null) {
                        appUpdateInfo.h = j2;
                        appUpdateInfo.f20166j = j4;
                        appUpdateInfo.f20165e = i;
                    }
                    if (SauUpdateAgent.this.d != null) {
                        SauUpdateAgent.this.d.c(str, j2, j3, j4, i);
                    }
                    if (SauUpdateAgent.this.f20179e != null) {
                        SauUpdateAgent.this.f20179e.c(str, j2, j3, j4, i);
                    }
                }
            }
        }

        public final void q(Message message) {
            Object obj = message.obj;
            if (obj instanceof AppUpdateInfo) {
                AppUpdateInfo appUpdateInfo = new AppUpdateInfo((AppUpdateInfo) obj);
                SauUpdateAgent.this.g.put(appUpdateInfo.k, appUpdateInfo);
            }
        }

        public final void r(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                int i = message.arg1;
                SauUpdateAgent.this.g.remove(str);
                if (SauUpdateAgent.this.d != null) {
                    SauUpdateAgent.this.d.b(str, i);
                }
                if (SauUpdateAgent.this.f20179e != null) {
                    SauUpdateAgent.this.f20179e.b(str, i);
                }
            }
        }

        public final void s(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                SauUpdateAgent.I(SauUpdateAgent.this);
            }
        }

        public final void t(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                Bundle data = message.getData();
                if (data != null) {
                    long j2 = data.getLong("currentSize");
                    data.getLong("totalSize");
                    long j3 = data.getLong("speed");
                    data.getInt("status");
                    DataresUpdateInfo dataresUpdateInfo = (DataresUpdateInfo) SauUpdateAgent.this.h.get(str);
                    if (dataresUpdateInfo != null) {
                        dataresUpdateInfo.d = j2;
                        dataresUpdateInfo.f = j3;
                    }
                    SauUpdateAgent.I(SauUpdateAgent.this);
                }
            }
        }

        public final void u(Message message) {
            Object obj = message.obj;
            if (obj instanceof DataresUpdateInfo) {
                DataresUpdateInfo dataresUpdateInfo = new DataresUpdateInfo((DataresUpdateInfo) obj);
                StringBuilder sbA = hcm.a("busCod=");
                sbA.append(dataresUpdateInfo.a);
                sbA.append(", localInfo=");
                sbA.append(dataresUpdateInfo);
                e7b.a("SauUpdateAgent", sbA.toString());
                SauUpdateAgent.this.h.put(dataresUpdateInfo.a, dataresUpdateInfo);
            }
        }

        public final void v(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                SauUpdateAgent.this.g.remove((String) obj);
                SauUpdateAgent.I(SauUpdateAgent.this);
            }
        }

        public final void w(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                int i = message.arg1;
                int i2 = message.arg2;
                if (((String) obj).equals(SauUpdateAgent.this.a.getPackageName())) {
                    SauUpdateAgent.this.f20182n = i;
                    e7b.b((i2 & 2) != 0);
                }
            }
        }

        public final void x(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                int i = message.what;
                if (i != 2006) {
                    if (i == 3003) {
                        if (SauUpdateAgent.this.d != null) {
                            SauUpdateAgent.this.d.b(str, -32764);
                            return;
                        }
                        return;
                    }
                    switch (i) {
                        case 2001:
                            if (SauUpdateAgent.this.d != null) {
                                SauUpdateAgent.this.d.a(str, -32764);
                            }
                            break;
                        case 2002:
                        case 2003:
                        case 2004:
                            break;
                        default:
                            switch (i) {
                                case 2011:
                                    SauUpdateAgent.I(SauUpdateAgent.this);
                                    break;
                                case 2012:
                                case 2013:
                                case 2014:
                                case 2016:
                                    SauUpdateAgent.I(SauUpdateAgent.this);
                                    break;
                                case 2015:
                                    SauUpdateAgent.I(SauUpdateAgent.this);
                                    break;
                            }
                            break;
                    }
                }
                if (SauUpdateAgent.this.d != null) {
                    SauUpdateAgent.this.d.c(str, -1L, -1L, -1L, -32764);
                }
            }
        }

        public c(Looper looper) {
            super(looper);
        }
    }

    public SauUpdateAgent(Context context, pea peaVar, sea seaVar) {
        int i = 0;
        String string = "";
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            string = applicationInfo.metaData.getString("update_identifier");
            i = applicationInfo.metaData.getInt("sau_aar_version_code");
        } catch (PackageManager.NameNotFoundException e2) {
            StringBuilder sbA = hcm.a("not find error:");
            sbA.append(e2.getMessage());
            e7b.a("SauUpdateAgent", sbA.toString());
        }
        this.a = context.getApplicationContext();
        this.d = peaVar;
        this.f20181l = string;
        this.m = i;
        HandlerThread handlerThread = new HandlerThread("sauAar");
        handlerThread.start();
        if (handlerThread.getLooper() != null) {
            this.f = new c(this, handlerThread.getLooper(), null);
        }
        this.g = new ArrayMap();
        this.h = new ArrayMap();
    }

    public static SauUpdateAgent D(Context context, pea peaVar) {
        if (q == null) {
            synchronized (SauUpdateAgent.class) {
                if (q == null) {
                    q = new SauUpdateAgent(context, peaVar, null);
                }
            }
        }
        if (peaVar != null) {
            q.d = peaVar;
        }
        return q;
    }

    public static /* synthetic */ sea I(SauUpdateAgent sauUpdateAgent) {
        sauUpdateAgent.getClass();
        return null;
    }

    public static /* synthetic */ int X(SauUpdateAgent sauUpdateAgent) {
        int i = sauUpdateAgent.k;
        sauUpdateAgent.k = i + 1;
        return i;
    }

    public static /* synthetic */ int s(SauUpdateAgent sauUpdateAgent) {
        int i = sauUpdateAgent.f20180j;
        sauUpdateAgent.f20180j = i + 1;
        return i;
    }

    public String F(String str) {
        AppUpdateInfo appUpdateInfo = (AppUpdateInfo) this.g.get(str);
        if (appUpdateInfo != null) {
            return appUpdateInfo.m;
        }
        return null;
    }

    public int G(String str) {
        AppUpdateInfo appUpdateInfo = (AppUpdateInfo) this.g.get(str);
        if (appUpdateInfo != null) {
            return appUpdateInfo.f20165e;
        }
        return -1;
    }

    public boolean J(String str) {
        AppUpdateInfo appUpdateInfo = (AppUpdateInfo) this.g.get(str);
        return appUpdateInfo != null && appUpdateInfo.b == 2;
    }

    public boolean L(String str) {
        AppUpdateInfo appUpdateInfo = (AppUpdateInfo) this.g.get(str);
        return appUpdateInfo != null && appUpdateInfo.b == 1;
    }

    public boolean N(String str) {
        AppUpdateInfo appUpdateInfo = (AppUpdateInfo) this.g.get(str);
        return appUpdateInfo != null && appUpdateInfo.f20164c == 1;
    }

    public boolean P(String str) {
        AppUpdateInfo appUpdateInfo = (AppUpdateInfo) this.g.get(str);
        if (appUpdateInfo == null) {
            return false;
        }
        int i = appUpdateInfo.f20165e;
        return (i == 8 || i == 32) && appUpdateInfo.b();
    }

    public boolean R(String str) {
        AppUpdateInfo appUpdateInfo = (AppUpdateInfo) this.g.get(str);
        if (appUpdateInfo != null) {
            return appUpdateInfo.a();
        }
        return false;
    }

    public boolean T(String str) {
        AppUpdateInfo appUpdateInfo = (AppUpdateInfo) this.g.get(str);
        if (appUpdateInfo != null) {
            return appUpdateInfo.b();
        }
        return false;
    }

    public boolean V(String str) {
        AppUpdateInfo appUpdateInfo = (AppUpdateInfo) this.g.get(str);
        if (appUpdateInfo != null) {
            return appUpdateInfo.c();
        }
        return false;
    }

    public long c(String str) {
        AppUpdateInfo appUpdateInfo = (AppUpdateInfo) this.g.get(str);
        if (appUpdateInfo != null) {
            return appUpdateInfo.i;
        }
        return -1L;
    }

    public final void e(Message message) {
        try {
            this.b = com.oplusos.sau.aidl.a.AbstractBinderC0986a.a((IBinder) message.obj);
            e7b.a("SauUpdateAgent", this.a.getPackageName() + " observer stub " + this.p);
            this.b.b(this.a.getPackageName(), this.p);
            e7b.a("SauUpdateAgent", "request check permission tid:" + Thread.currentThread().getId());
            Log.i("SauUpdateAgent", this.a.getPackageName() + ", aarVersion=" + this.m);
            y();
            this.b.c(this.a.getPackageName(), this.f20181l, this.m);
        } catch (Exception e2) {
            StringBuilder sbA = hcm.a("register observer failed:");
            sbA.append(e2.getMessage());
            e7b.c("SauUpdateAgent", sbA.toString());
        }
    }

    public final void h(Exception exc) {
        StringBuilder sbA = hcm.a("the errorInfo is ");
        sbA.append(exc.getMessage());
        e7b.a("SauUpdateAgent", sbA.toString());
    }

    public void i(String str, int i) {
        Message messageObtainMessage = this.f.obtainMessage(2001);
        messageObtainMessage.obj = str;
        messageObtainMessage.arg1 = i;
        messageObtainMessage.sendToTarget();
    }

    public boolean j() {
        try {
            if (this.a.getPackageManager().getPackageInfo(SauAarConstants.V, 0) != null) {
                return true;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            StringBuilder sbA = hcm.a("not support oplus sau ");
            sbA.append(e2.getMessage());
            e7b.a("SauUpdateAgent", sbA.toString());
        }
        try {
            return this.a.getPackageManager().getPackageInfo(SauAarConstants.U, 0).getLongVersionCode() >= 20;
        } catch (PackageManager.NameNotFoundException e3) {
            StringBuilder sbA2 = hcm.a("not support old sau ");
            sbA2.append(e3.getMessage());
            e7b.a("SauUpdateAgent", sbA2.toString());
            e7b.f("SauUpdateAgent", "not support request.");
            return false;
        }
    }

    public final boolean k(int i) {
        return i % 5 == 0;
    }

    public int m(String str) {
        AppUpdateInfo appUpdateInfo = (AppUpdateInfo) this.g.get(str);
        if (appUpdateInfo != null) {
            return appUpdateInfo.a;
        }
        return -1;
    }

    public final void n() {
        com.oplusos.sau.aidl.a aVar = this.b;
        if (aVar == null) {
            e7b.a("SauUpdateAgent", "mSauUpdateService is null");
            return;
        }
        try {
            aVar.b(this.a.getPackageName(), this.p);
            e7b.a("SauUpdateAgent", "resetObserver : " + this.p);
        } catch (Exception e2) {
            StringBuilder sbA = hcm.a("The exception is ");
            sbA.append(e2.getMessage());
            e7b.a("SauUpdateAgent", sbA.toString());
        }
    }

    public void o(pea peaVar) {
        this.f20179e = peaVar;
    }

    public void q(String str, int i) {
        Message messageObtainMessage = this.f.obtainMessage(2005);
        messageObtainMessage.obj = str;
        messageObtainMessage.arg1 = i;
        messageObtainMessage.sendToTarget();
    }

    public String u(String str) {
        AppUpdateInfo appUpdateInfo = (AppUpdateInfo) this.g.get(str);
        if (appUpdateInfo != null) {
            return appUpdateInfo.f20167l;
        }
        return null;
    }

    public void v() {
        this.f.sendEmptyMessage(1004);
    }

    public void w(String str, int i) {
        Message messageObtainMessage = this.f.obtainMessage(2002);
        messageObtainMessage.obj = str;
        messageObtainMessage.arg1 = i;
        messageObtainMessage.sendToTarget();
    }

    public final void y() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - this.i;
        if (j2 < 0) {
            this.i = jCurrentTimeMillis;
        } else if (j2 > SauAarConstants.f) {
            this.i = jCurrentTimeMillis;
            e7b.a("SauUpdateAgent", "next unbind message excute after 300000 ms");
            this.f.removeMessages(1002);
            this.f.sendEmptyMessageDelayed(1002, 300000L);
        }
    }

    public boolean z(String str) {
        AppUpdateInfo appUpdateInfo = (AppUpdateInfo) this.g.get(str);
        return appUpdateInfo != null && appUpdateInfo.d == 1;
    }

    public class b extends com.oplusos.sau.aidl.b.a {
        public b() {
        }

        @Override // com.oplusos.sau.aidl.b
        public void a(String str, int i, String str2) throws RemoteException {
            if (i == 1) {
                e7b.a("SauUpdateAgent", "in aar: callerPkgName=" + str + ", permission result= " + i + ", controlString=" + str2);
            } else {
                e7b.f("SauUpdateAgent", "onPermissionCheckResult permission deni:" + i);
            }
            Message messageObtainMessage = SauUpdateAgent.this.f.obtainMessage(1003);
            messageObtainMessage.obj = str;
            messageObtainMessage.arg1 = i;
            try {
                messageObtainMessage.arg2 = Integer.parseInt(str2);
            } catch (Exception e2) {
                messageObtainMessage.arg2 = 0;
                e7b.f("SauUpdateAgent", e2.getMessage() + ", " + str2);
            }
            messageObtainMessage.sendToTarget();
        }

        @Override // com.oplusos.sau.aidl.b.a, android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // com.oplusos.sau.aidl.b
        public void b(String str, long j2, long j3, long j4, int i) throws RemoteException {
            e7b.a("SauUpdateAgent", "in aar: update download pkg=" + str + ",curentSize=" + j2 + ", totalSize=" + j3 + ", speed=" + j4 + ", status=" + i);
            Message messageObtainMessage = SauUpdateAgent.this.f.obtainMessage(3002);
            messageObtainMessage.obj = str;
            Bundle bundle = new Bundle();
            bundle.putLong("currentSize", j2);
            bundle.putLong("totalSize", j3);
            bundle.putLong("speed", j4);
            bundle.putInt("status", i);
            messageObtainMessage.setData(bundle);
            messageObtainMessage.sendToTarget();
        }

        @Override // com.oplusos.sau.aidl.b
        public void c(String str, int i) throws RemoteException {
            e7b.a("SauUpdateAgent", "in aar: busCode=" + str + ", result = " + i);
            Message messageObtainMessage = SauUpdateAgent.this.f.obtainMessage(3011);
            messageObtainMessage.obj = str;
            messageObtainMessage.arg1 = i;
            messageObtainMessage.sendToTarget();
        }

        @Override // com.oplusos.sau.aidl.b
        public void d(String str, int i) throws RemoteException {
            e7b.a("SauUpdateAgent", "in aar: install pkg=" + str + ", result=" + i);
            Message messageObtainMessage = SauUpdateAgent.this.f.obtainMessage(3003);
            messageObtainMessage.obj = str;
            messageObtainMessage.arg1 = i;
            messageObtainMessage.sendToTarget();
        }

        @Override // com.oplusos.sau.aidl.b
        public void a(String str, int i) throws RemoteException {
            e7b.a("SauUpdateAgent", "in aar: packageName=" + str + ", result = " + i);
            Message messageObtainMessage = SauUpdateAgent.this.f.obtainMessage(3001);
            messageObtainMessage.obj = str;
            messageObtainMessage.arg1 = i;
            messageObtainMessage.sendToTarget();
        }

        @Override // com.oplusos.sau.aidl.b
        public void b(String str, int i) throws RemoteException {
            e7b.a("SauUpdateAgent", "in aar: install busCode=" + str + ", result=" + i);
            Message messageObtainMessage = SauUpdateAgent.this.f.obtainMessage(SauAarConstants.G);
            messageObtainMessage.obj = str;
            messageObtainMessage.arg1 = i;
            messageObtainMessage.sendToTarget();
        }

        @Override // com.oplusos.sau.aidl.b
        public void a(String str, AppUpdateInfo appUpdateInfo) throws RemoteException {
            Message messageObtainMessage = SauUpdateAgent.this.f.obtainMessage(3004);
            messageObtainMessage.obj = appUpdateInfo;
            messageObtainMessage.sendToTarget();
        }

        @Override // com.oplusos.sau.aidl.b
        public void a(String str, DataresUpdateInfo dataresUpdateInfo) throws RemoteException {
            e7b.a("SauUpdateAgent", "in aar: busCode=" + str + ", info=" + dataresUpdateInfo + ", info_flag=" + dataresUpdateInfo.h);
            Message messageObtainMessage = SauUpdateAgent.this.f.obtainMessage(3014);
            messageObtainMessage.obj = dataresUpdateInfo;
            messageObtainMessage.sendToTarget();
        }

        @Override // com.oplusos.sau.aidl.b
        public void a(String str, long j2, long j3, long j4, int i) throws RemoteException {
            e7b.a("SauUpdateAgent", "in aar: update download busCode=" + str + ",curentSize=" + j2 + ", totalSize=" + j3 + ", speed=" + j4 + ", status=" + i);
            Message messageObtainMessage = SauUpdateAgent.this.f.obtainMessage(3012);
            messageObtainMessage.obj = str;
            Bundle bundle = new Bundle();
            bundle.putLong("currentSize", j2);
            bundle.putLong("totalSize", j3);
            bundle.putLong("speed", j4);
            bundle.putInt("status", i);
            messageObtainMessage.setData(bundle);
            messageObtainMessage.sendToTarget();
        }
    }
}
