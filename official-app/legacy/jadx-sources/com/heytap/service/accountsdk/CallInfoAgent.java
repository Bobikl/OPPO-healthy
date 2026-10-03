package com.heytap.service.accountsdk;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.nearme.aidl.IAskToken;
import com.nearme.aidl.IAskTokenByAppCode;
import com.nearme.aidl.ICallBack;
import com.nearme.aidl.UserEntity;
import com.oplus.aiunit.vision.mek;
import com.oplus.aiunit.vision.uvg;

/* JADX INFO: loaded from: classes19.dex */
public class CallInfoAgent {
    public static Handler h;
    public static IAskToken i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static IAskTokenByAppCode f7669j;
    public Context a;
    public d d;
    public c f;
    public Integer b = 99999;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ICallBack.Stub f7670c = new ICallBack.Stub() { // from class: com.heytap.service.accountsdk.CallInfoAgent.1
        @Override // com.nearme.aidl.ICallBack
        public void myStartActivity(String str, String str2) throws RemoteException {
            Intent intent = new Intent(str2);
            intent.setPackage(str);
            intent.setFlags(536870912);
            if (!(CallInfoAgent.this.a instanceof Activity)) {
                intent.addFlags(268435456);
            }
            CallInfoAgent.this.a.startActivity(intent);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ServiceConnection f7671e = new a();
    public ServiceConnection g = new b();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (CallInfoAgent.this.b) {
                IAskToken unused = CallInfoAgent.i = IAskToken.Stub.asInterface(iBinder);
                CallInfoAgent.this.b.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (CallInfoAgent.this.b) {
                IAskTokenByAppCode unused = CallInfoAgent.f7669j = IAskTokenByAppCode.Stub.asInterface(iBinder);
                CallInfoAgent.this.b.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public class c extends Thread {
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f7672j;

        public c(int i, String str) {
            this.i = i;
            this.f7672j = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (CallInfoAgent.this.b) {
                if (CallInfoAgent.f7669j == null) {
                    try {
                        CallInfoAgent.this.b.wait();
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            UserEntity userEntity = new UserEntity();
            int i = this.i;
            if (i == 1) {
                userEntity = CallInfoAgent.this.o(this.f7672j);
            } else if (i == 2) {
                userEntity = CallInfoAgent.this.l(this.f7672j);
            } else if (i == 3) {
                userEntity = CallInfoAgent.this.m(this.f7672j);
            }
            CallInfoAgent.this.s();
            if (userEntity != null && CallInfoAgent.h != null) {
                Message message = new Message();
                message.obj = userEntity;
                Handler handler = CallInfoAgent.h;
                if (handler != null && CallInfoAgent.h != null) {
                    handler.sendMessage(message);
                }
            }
            IAskTokenByAppCode unused = CallInfoAgent.f7669j = null;
            Handler unused2 = CallInfoAgent.h = null;
        }
    }

    public class d extends Thread {
        public int i;

        public d(int i) {
            this.i = i;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (CallInfoAgent.this.b) {
                if (CallInfoAgent.i == null) {
                    try {
                        CallInfoAgent.this.b.wait();
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            UserEntity userEntity = new UserEntity();
            int i = this.i;
            if (i == 1) {
                userEntity = CallInfoAgent.this.n();
            } else if (i == 2) {
                userEntity = CallInfoAgent.this.k();
            } else if (i == 3) {
                userEntity = CallInfoAgent.this.j();
            }
            CallInfoAgent.this.C();
            if (userEntity != null && CallInfoAgent.h != null) {
                Message message = new Message();
                message.obj = userEntity;
                Handler handler = CallInfoAgent.h;
                if (handler != null && CallInfoAgent.h != null) {
                    handler.sendMessage(message);
                }
            }
            IAskToken unused = CallInfoAgent.i = null;
            Handler unused2 = CallInfoAgent.h = null;
        }
    }

    public CallInfoAgent(Context context) {
        this.a = null;
        this.a = context;
        q();
    }

    public final void A() {
        Message message = new Message();
        message.obj = new UserEntity(30001006, "Exception error!", "", "");
        Handler handler = h;
        if (handler != null && handler != null) {
            handler.sendMessage(message);
        }
        h = null;
    }

    public final void B(Handler handler) {
        Message message = new Message();
        message.obj = new UserEntity(30001005, "Occupied error!", "", "");
        Handler handler2 = h;
        if (handler2 != null && handler2 != null) {
            handler2.sendMessage(message);
        }
        h = null;
    }

    public void C() {
        IAskToken iAskToken = i;
        if (iAskToken != null) {
            try {
                iAskToken.unregisterCallback(this.f7670c);
                this.a.unbindService(this.f7671e);
                this.d.interrupt();
                this.d = null;
            } catch (Exception unused) {
                A();
            }
        }
    }

    public final void i() {
        Intent intent = new Intent(mek.b());
        intent.setPackage(uvg.k());
        try {
            try {
                this.a.bindService(intent, this.f7671e, 1);
            } catch (Exception unused) {
                C();
                this.a.bindService(intent, this.f7671e, 1);
            }
        } catch (Exception unused2) {
            C();
            A();
        }
    }

    public UserEntity j() {
        try {
            i.registerCallback(this.f7670c);
            return i.reqCheckPwd(p(this.a));
        } catch (Exception unused) {
            A();
            return null;
        }
    }

    public UserEntity k() {
        try {
            i.registerCallback(this.f7670c);
            return i.reqReSignin(p(this.a));
        } catch (Exception unused) {
            A();
            return null;
        }
    }

    public UserEntity l(String str) {
        try {
            f7669j.registerCallback(this.f7670c);
            return f7669j.reqReSignin(p(this.a), str);
        } catch (Exception unused) {
            A();
            return null;
        }
    }

    public UserEntity m(String str) {
        try {
            f7669j.registerCallback(this.f7670c);
            return f7669j.reqSwitchAccount(p(this.a), str);
        } catch (Exception unused) {
            A();
            return null;
        }
    }

    public UserEntity n() {
        try {
            i.registerCallback(this.f7670c);
            return i.reqToken(p(this.a));
        } catch (Exception unused) {
            A();
            return null;
        }
    }

    public UserEntity o(String str) {
        try {
            try {
                f7669j.registerCallback(this.f7670c);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return f7669j.reqToken(p(this.a), str);
        } catch (Exception unused) {
            A();
            return null;
        }
    }

    public final String p(Context context) {
        try {
            String packageName = context.getPackageName();
            return (packageName == null || packageName.equals("null")) ? "" : packageName;
        } catch (Exception unused) {
            return "";
        }
    }

    public void q() {
        z();
        h = null;
    }

    public final void r() {
        Intent intent = new Intent(mek.a());
        intent.setPackage(uvg.k());
        try {
            try {
                this.a.bindService(intent, this.g, 1);
            } catch (Exception unused) {
                s();
                this.a.bindService(intent, this.g, 1);
            }
        } catch (Exception unused2) {
            s();
            A();
        }
    }

    public void s() {
        IAskTokenByAppCode iAskTokenByAppCode = f7669j;
        if (iAskTokenByAppCode != null) {
            try {
                iAskTokenByAppCode.unregisterCallback(this.f7670c);
                this.a.unbindService(this.g);
                this.f.interrupt();
                this.f = null;
            } catch (Exception unused) {
                A();
            }
        }
    }

    public void t(Handler handler) {
        if (h != null) {
            B(handler);
            return;
        }
        h = handler;
        i();
        d dVar = new d(3);
        this.d = dVar;
        dVar.start();
    }

    public void u(Handler handler) {
        if (h != null) {
            B(handler);
            return;
        }
        h = handler;
        i();
        d dVar = new d(2);
        this.d = dVar;
        dVar.start();
    }

    public void v(Handler handler, String str) {
        if (h != null) {
            B(handler);
            return;
        }
        h = handler;
        r();
        c cVar = new c(2, str);
        this.f = cVar;
        cVar.start();
    }

    public void w(Handler handler, String str) {
        if (h != null) {
            B(handler);
            return;
        }
        h = handler;
        r();
        c cVar = new c(3, str);
        this.f = cVar;
        cVar.start();
    }

    public void x(Handler handler) {
        Log.e("reqToken", "currentHandler=" + h);
        if (h != null) {
            B(handler);
            return;
        }
        h = handler;
        i();
        d dVar = new d(1);
        this.d = dVar;
        dVar.start();
    }

    public void y(Handler handler, String str) {
        if (h != null) {
            B(handler);
            return;
        }
        h = handler;
        r();
        c cVar = new c(1, str);
        this.f = cVar;
        cVar.start();
    }

    public final void z() {
        Message message = new Message();
        message.obj = new UserEntity(30001004, "Already canceled!", "", "");
        Handler handler = h;
        if (handler != null && handler != null) {
            handler.sendMessage(message);
        }
        h = null;
    }
}
