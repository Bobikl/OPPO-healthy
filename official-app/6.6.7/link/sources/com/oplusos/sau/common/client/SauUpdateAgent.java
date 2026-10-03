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
import com.oplus.aiunit.vision.aga;
import com.oplus.aiunit.vision.pgm;
import com.oplus.aiunit.vision.q8b;
import com.oplus.aiunit.vision.xfa;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplusos.sau.aidl.AppUpdateInfo;
import com.oplusos.sau.aidl.DataresUpdateInfo;
import com.oplusos.sau.common.utils.SauAarConstants;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class SauUpdateAgent {
    public static volatile SauUpdateAgent q;
    public Context a;
    public com.oplusos.sau.aidl.a b;
    public boolean c;
    public xfa d;
    public xfa e;
    public Handler f;
    public Map g;
    public Map h;
    public long i;
    public String l;
    public int m;
    public int j = 0;
    public int k = 0;
    public int n = -1;
    public ServiceConnection o = new a();
    public com.oplusos.sau.aidl.b p = new b();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            SauUpdateAgent.this.j = 0;
            if (SauUpdateAgent.this.c) {
                q8b.a("SauUpdateAgent", "has bound, only return");
                return;
            }
            SauUpdateAgent.this.c = true;
            Message messageObtainMessage = SauUpdateAgent.this.f.obtainMessage(1005);
            messageObtainMessage.obj = iBinder;
            messageObtainMessage.sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            q8b.a("SauUpdateAgent", "on services disconnected will unbind service");
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
                if (sauUpdateAgent.k(sauUpdateAgent.j)) {
                    q8b.f("SauUpdateAgent", "maybe not support it.");
                    return;
                }
                return;
            }
            Log.w("SauUpdateAgent", "is new sauBinderservice ,reset description");
            com.oplusos.sau.aidl.a.a.b();
            com.oplusos.sau.aidl.b.a.b();
            SauUpdateAgent.this.a.bindService(intent2, SauUpdateAgent.this.o, 1);
        }

        public final void b(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                if (SauUpdateAgent.this.n == 0) {
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
                } catch (RemoteException e) {
                    SauUpdateAgent.this.h(e);
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
            } catch (Exception e) {
                StringBuilder sbA = pgm.a("some thing error--");
                sbA.append(e.getMessage());
                q8b.f("SauUpdateAgent", sbA.toString());
            }
            try {
                SauUpdateAgent.this.a.unbindService(SauUpdateAgent.this.o);
            } catch (Exception e2) {
                StringBuilder sbA2 = pgm.a("unbind service error--");
                sbA2.append(e2.getMessage());
                q8b.f("SauUpdateAgent", sbA2.toString());
            }
            SauUpdateAgent.this.b = null;
            SauUpdateAgent.this.c = false;
        }

        public final void d(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                int i = message.arg1;
                if (SauUpdateAgent.this.n == 0) {
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
                } catch (RemoteException e) {
                    StringBuilder sbA = pgm.a("the errorInfo is ");
                    sbA.append(e.getMessage());
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
                if (SauUpdateAgent.this.n == 0) {
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
                } catch (RemoteException e) {
                    SauUpdateAgent.this.h(e);
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
                if (SauUpdateAgent.this.n == 0) {
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
                } catch (RemoteException e) {
                    SauUpdateAgent.this.h(e);
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
                if (SauUpdateAgent.this.n == 0) {
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
                } catch (RemoteException e) {
                    SauUpdateAgent.this.h(e);
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
                int i = message.arg1 | SauAarConstants.I;
                if (SauUpdateAgent.this.n == 0) {
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
                } catch (RemoteException e) {
                    SauUpdateAgent.this.h(e);
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
                q8b.f("SauUpdateAgent", "message is null");
            }
            StringBuilder sbA = pgm.a("msg=");
            sbA.append((String) SauAarConstants.Z.get(Integer.valueOf(message.what)));
            q8b.d("SauUpdateAgent", sbA.toString());
            int i4 = message.what;
            if (i4 != 1002 && i4 != 1006) {
                SauUpdateAgent.this.y();
            }
            if (SauUpdateAgent.this.b == null && 1002 != (i3 = message.what) && 1001 != i3 && 1005 != i3) {
                SauUpdateAgent sauUpdateAgent = SauUpdateAgent.this;
                if (sauUpdateAgent.k(sauUpdateAgent.j)) {
                    StringBuilder sbA2 = pgm.a("service is null, will binder, retry times:");
                    sbA2.append(SauUpdateAgent.this.j);
                    q8b.d("SauUpdateAgent", sbA2.toString());
                }
                if (SauUpdateAgent.this.j >= 10) {
                    q8b.f("SauUpdateAgent", "request time out");
                    x(message);
                    SauUpdateAgent.this.j = 0;
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
                q8b.f("SauUpdateAgent", "service is null");
                return;
            }
            if (SauUpdateAgent.this.n == -1 && (i = message.what) != 1006 && i != 1002 && i != 1001 && i != 1003 && i != 1005 && SauUpdateAgent.this.k < 6) {
                q8b.d("SauUpdateAgent", "permission check has not finish, try latter");
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
                                case SauAarConstants.u /* 2011 */:
                                    j(message);
                                    break;
                                case SauAarConstants.v /* 2012 */:
                                    n(message);
                                    break;
                                case SauAarConstants.w /* 2013 */:
                                    l(message);
                                    break;
                                case SauAarConstants.x /* 2014 */:
                                    m(message);
                                    break;
                                case SauAarConstants.y /* 2015 */:
                                    k(message);
                                    break;
                                case SauAarConstants.z /* 2016 */:
                                    i(message);
                                    break;
                                default:
                                    switch (i5) {
                                        case SauAarConstants.A /* 3001 */:
                                            o(message);
                                            break;
                                        case SauAarConstants.B /* 3002 */:
                                            p(message);
                                            break;
                                        case SauAarConstants.C /* 3003 */:
                                            r(message);
                                            break;
                                        case SauAarConstants.D /* 3004 */:
                                            q(message);
                                            break;
                                        default:
                                            switch (i5) {
                                                case SauAarConstants.E /* 3011 */:
                                                    s(message);
                                                    break;
                                                case SauAarConstants.F /* 3012 */:
                                                    t(message);
                                                    break;
                                                case SauAarConstants.G /* 3013 */:
                                                    v(message);
                                                    break;
                                                case SauAarConstants.H /* 3014 */:
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
                if (SauUpdateAgent.this.n == 0) {
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
                } catch (RemoteException e) {
                    SauUpdateAgent.this.h(e);
                    SauUpdateAgent.I(SauUpdateAgent.this);
                }
            }
        }

        public final void j(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                int i = message.arg1;
                if (SauUpdateAgent.this.n == 0) {
                    SauUpdateAgent.I(SauUpdateAgent.this);
                    return;
                }
                try {
                    q8b.a("SauUpdateAgent", "request bucode  " + str + ", flag=" + i);
                    if (SauUpdateAgent.this.b != null) {
                        SauUpdateAgent.this.b.a(SauUpdateAgent.this.a.getPackageName(), str, i);
                    } else {
                        SauUpdateAgent.I(SauUpdateAgent.this);
                        Log.i("SauUpdateAgent", "SauUpdateService is null");
                    }
                } catch (RemoteException e) {
                    SauUpdateAgent.this.h(e);
                    SauUpdateAgent.I(SauUpdateAgent.this);
                }
            }
        }

        public final void k(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                int i = message.arg1;
                if (SauUpdateAgent.this.n == 0) {
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
                } catch (RemoteException e) {
                    SauUpdateAgent.this.h(e);
                    SauUpdateAgent.I(SauUpdateAgent.this);
                }
            }
        }

        public final void l(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                if (SauUpdateAgent.this.n == 0) {
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
                } catch (RemoteException e) {
                    SauUpdateAgent.this.h(e);
                    SauUpdateAgent.I(SauUpdateAgent.this);
                }
            }
        }

        public final void m(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                if (SauUpdateAgent.this.n == 0) {
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
                } catch (RemoteException e) {
                    SauUpdateAgent.this.h(e);
                    SauUpdateAgent.I(SauUpdateAgent.this);
                }
            }
        }

        public final void n(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                int i = message.arg1;
                if (SauUpdateAgent.this.n == 0) {
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
                } catch (RemoteException e) {
                    SauUpdateAgent.this.h(e);
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
                if (SauUpdateAgent.this.e != null) {
                    SauUpdateAgent.this.e.a(str, i);
                }
            }
        }

        public final void p(Message message) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                Bundle data = message.getData();
                if (data != null) {
                    long j = data.getLong("currentSize");
                    long j2 = data.getLong("totalSize");
                    long j3 = data.getLong(ClickApiEntity.SPEED);
                    int i = data.getInt("status");
                    AppUpdateInfo appUpdateInfo = (AppUpdateInfo) SauUpdateAgent.this.g.get(str);
                    if (appUpdateInfo != null) {
                        appUpdateInfo.h = j;
                        appUpdateInfo.j = j3;
                        appUpdateInfo.e = i;
                    }
                    if (SauUpdateAgent.this.d != null) {
                        SauUpdateAgent.this.d.c(str, j, j2, j3, i);
                    }
                    if (SauUpdateAgent.this.e != null) {
                        SauUpdateAgent.this.e.c(str, j, j2, j3, i);
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
                if (SauUpdateAgent.this.e != null) {
                    SauUpdateAgent.this.e.b(str, i);
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
                    long j = data.getLong("currentSize");
                    data.getLong("totalSize");
                    long j2 = data.getLong(ClickApiEntity.SPEED);
                    data.getInt("status");
                    DataresUpdateInfo dataresUpdateInfo = (DataresUpdateInfo) SauUpdateAgent.this.h.get(str);
                    if (dataresUpdateInfo != null) {
                        dataresUpdateInfo.d = j;
                        dataresUpdateInfo.f = j2;
                    }
                    SauUpdateAgent.I(SauUpdateAgent.this);
                }
            }
        }

        public final void u(Message message) {
            Object obj = message.obj;
            if (obj instanceof DataresUpdateInfo) {
                DataresUpdateInfo dataresUpdateInfo = new DataresUpdateInfo((DataresUpdateInfo) obj);
                StringBuilder sbA = pgm.a("busCod=");
                sbA.append(dataresUpdateInfo.a);
                sbA.append(", localInfo=");
                sbA.append(dataresUpdateInfo);
                q8b.a("SauUpdateAgent", sbA.toString());
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
                    SauUpdateAgent.this.n = i;
                    q8b.b((i2 & 2) != 0);
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
                                case SauAarConstants.u /* 2011 */:
                                    SauUpdateAgent.I(SauUpdateAgent.this);
                                    break;
                                case SauAarConstants.v /* 2012 */:
                                case SauAarConstants.w /* 2013 */:
                                case SauAarConstants.x /* 2014 */:
                                case SauAarConstants.z /* 2016 */:
                                    SauUpdateAgent.I(SauUpdateAgent.this);
                                    break;
                                case SauAarConstants.y /* 2015 */:
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

    public SauUpdateAgent(Context context, xfa xfaVar, aga agaVar) {
        int i = 0;
        String string = "";
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            string = applicationInfo.metaData.getString("update_identifier");
            i = applicationInfo.metaData.getInt("sau_aar_version_code");
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sbA = pgm.a("not find error:");
            sbA.append(e.getMessage());
            q8b.a("SauUpdateAgent", sbA.toString());
        }
        this.a = context.getApplicationContext();
        this.d = xfaVar;
        this.l = string;
        this.m = i;
        HandlerThread handlerThread = new HandlerThread("sauAar");
        handlerThread.start();
        if (handlerThread.getLooper() != null) {
            this.f = new c(this, handlerThread.getLooper(), null);
        }
        this.g = new ArrayMap();
        this.h = new ArrayMap();
    }

    public static SauUpdateAgent D(Context context, xfa xfaVar) {
        if (q == null) {
            synchronized (SauUpdateAgent.class) {
                if (q == null) {
                    q = new SauUpdateAgent(context, xfaVar, null);
                }
            }
        }
        if (xfaVar != null) {
            q.d = xfaVar;
        }
        return q;
    }

    public static /* synthetic */ aga I(SauUpdateAgent sauUpdateAgent) {
        sauUpdateAgent.getClass();
        return null;
    }

    public static /* synthetic */ int X(SauUpdateAgent sauUpdateAgent) {
        int i = sauUpdateAgent.k;
        sauUpdateAgent.k = i + 1;
        return i;
    }

    public static /* synthetic */ int s(SauUpdateAgent sauUpdateAgent) {
        int i = sauUpdateAgent.j;
        sauUpdateAgent.j = i + 1;
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
            return appUpdateInfo.e;
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
        return appUpdateInfo != null && appUpdateInfo.c == 1;
    }

    public boolean P(String str) {
        AppUpdateInfo appUpdateInfo = (AppUpdateInfo) this.g.get(str);
        if (appUpdateInfo == null) {
            return false;
        }
        int i = appUpdateInfo.e;
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
            this.b = com.oplusos.sau.aidl.a.a.a((IBinder) message.obj);
            q8b.a("SauUpdateAgent", this.a.getPackageName() + " observer stub " + this.p);
            this.b.b(this.a.getPackageName(), this.p);
            q8b.a("SauUpdateAgent", "request check permission tid:" + Thread.currentThread().getId());
            Log.i("SauUpdateAgent", this.a.getPackageName() + ", aarVersion=" + this.m);
            y();
            this.b.c(this.a.getPackageName(), this.l, this.m);
        } catch (Exception e) {
            StringBuilder sbA = pgm.a("register observer failed:");
            sbA.append(e.getMessage());
            q8b.c("SauUpdateAgent", sbA.toString());
        }
    }

    public final void h(Exception exc) {
        StringBuilder sbA = pgm.a("the errorInfo is ");
        sbA.append(exc.getMessage());
        q8b.a("SauUpdateAgent", sbA.toString());
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
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sbA = pgm.a("not support oplus sau ");
            sbA.append(e.getMessage());
            q8b.a("SauUpdateAgent", sbA.toString());
        }
        try {
            return this.a.getPackageManager().getPackageInfo(SauAarConstants.U, 0).getLongVersionCode() >= 20;
        } catch (PackageManager.NameNotFoundException e2) {
            StringBuilder sbA2 = pgm.a("not support old sau ");
            sbA2.append(e2.getMessage());
            q8b.a("SauUpdateAgent", sbA2.toString());
            q8b.f("SauUpdateAgent", "not support request.");
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
            q8b.a("SauUpdateAgent", "mSauUpdateService is null");
            return;
        }
        try {
            aVar.b(this.a.getPackageName(), this.p);
            q8b.a("SauUpdateAgent", "resetObserver : " + this.p);
        } catch (Exception e) {
            StringBuilder sbA = pgm.a("The exception is ");
            sbA.append(e.getMessage());
            q8b.a("SauUpdateAgent", sbA.toString());
        }
    }

    public void o(xfa xfaVar) {
        this.e = xfaVar;
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
            return appUpdateInfo.l;
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
        long j = jCurrentTimeMillis - this.i;
        if (j < 0) {
            this.i = jCurrentTimeMillis;
        } else if (j > SauAarConstants.f) {
            this.i = jCurrentTimeMillis;
            q8b.a("SauUpdateAgent", "next unbind message excute after 300000 ms");
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
                q8b.a("SauUpdateAgent", "in aar: callerPkgName=" + str + ", permission result= " + i + ", controlString=" + str2);
            } else {
                q8b.f("SauUpdateAgent", "onPermissionCheckResult permission deni:" + i);
            }
            Message messageObtainMessage = SauUpdateAgent.this.f.obtainMessage(1003);
            messageObtainMessage.obj = str;
            messageObtainMessage.arg1 = i;
            try {
                messageObtainMessage.arg2 = Integer.parseInt(str2);
            } catch (Exception e) {
                messageObtainMessage.arg2 = 0;
                q8b.f("SauUpdateAgent", e.getMessage() + ", " + str2);
            }
            messageObtainMessage.sendToTarget();
        }

        @Override // com.oplusos.sau.aidl.b.a, android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // com.oplusos.sau.aidl.b
        public void b(String str, long j, long j2, long j3, int i) throws RemoteException {
            q8b.a("SauUpdateAgent", "in aar: update download pkg=" + str + ",curentSize=" + j + ", totalSize=" + j2 + ", speed=" + j3 + ", status=" + i);
            Message messageObtainMessage = SauUpdateAgent.this.f.obtainMessage(SauAarConstants.B);
            messageObtainMessage.obj = str;
            Bundle bundle = new Bundle();
            bundle.putLong("currentSize", j);
            bundle.putLong("totalSize", j2);
            bundle.putLong(ClickApiEntity.SPEED, j3);
            bundle.putInt("status", i);
            messageObtainMessage.setData(bundle);
            messageObtainMessage.sendToTarget();
        }

        @Override // com.oplusos.sau.aidl.b
        public void c(String str, int i) throws RemoteException {
            q8b.a("SauUpdateAgent", "in aar: busCode=" + str + ", result = " + i);
            Message messageObtainMessage = SauUpdateAgent.this.f.obtainMessage(SauAarConstants.E);
            messageObtainMessage.obj = str;
            messageObtainMessage.arg1 = i;
            messageObtainMessage.sendToTarget();
        }

        @Override // com.oplusos.sau.aidl.b
        public void d(String str, int i) throws RemoteException {
            q8b.a("SauUpdateAgent", "in aar: install pkg=" + str + ", result=" + i);
            Message messageObtainMessage = SauUpdateAgent.this.f.obtainMessage(SauAarConstants.C);
            messageObtainMessage.obj = str;
            messageObtainMessage.arg1 = i;
            messageObtainMessage.sendToTarget();
        }

        @Override // com.oplusos.sau.aidl.b
        public void a(String str, int i) throws RemoteException {
            q8b.a("SauUpdateAgent", "in aar: packageName=" + str + ", result = " + i);
            Message messageObtainMessage = SauUpdateAgent.this.f.obtainMessage(SauAarConstants.A);
            messageObtainMessage.obj = str;
            messageObtainMessage.arg1 = i;
            messageObtainMessage.sendToTarget();
        }

        @Override // com.oplusos.sau.aidl.b
        public void b(String str, int i) throws RemoteException {
            q8b.a("SauUpdateAgent", "in aar: install busCode=" + str + ", result=" + i);
            Message messageObtainMessage = SauUpdateAgent.this.f.obtainMessage(SauAarConstants.G);
            messageObtainMessage.obj = str;
            messageObtainMessage.arg1 = i;
            messageObtainMessage.sendToTarget();
        }

        @Override // com.oplusos.sau.aidl.b
        public void a(String str, AppUpdateInfo appUpdateInfo) throws RemoteException {
            Message messageObtainMessage = SauUpdateAgent.this.f.obtainMessage(SauAarConstants.D);
            messageObtainMessage.obj = appUpdateInfo;
            messageObtainMessage.sendToTarget();
        }

        @Override // com.oplusos.sau.aidl.b
        public void a(String str, DataresUpdateInfo dataresUpdateInfo) throws RemoteException {
            q8b.a("SauUpdateAgent", "in aar: busCode=" + str + ", info=" + dataresUpdateInfo + ", info_flag=" + dataresUpdateInfo.h);
            Message messageObtainMessage = SauUpdateAgent.this.f.obtainMessage(SauAarConstants.H);
            messageObtainMessage.obj = dataresUpdateInfo;
            messageObtainMessage.sendToTarget();
        }

        @Override // com.oplusos.sau.aidl.b
        public void a(String str, long j, long j2, long j3, int i) throws RemoteException {
            q8b.a("SauUpdateAgent", "in aar: update download busCode=" + str + ",curentSize=" + j + ", totalSize=" + j2 + ", speed=" + j3 + ", status=" + i);
            Message messageObtainMessage = SauUpdateAgent.this.f.obtainMessage(SauAarConstants.F);
            messageObtainMessage.obj = str;
            Bundle bundle = new Bundle();
            bundle.putLong("currentSize", j);
            bundle.putLong("totalSize", j2);
            bundle.putLong(ClickApiEntity.SPEED, j3);
            bundle.putInt("status", i);
            messageObtainMessage.setData(bundle);
            messageObtainMessage.sendToTarget();
        }
    }
}
