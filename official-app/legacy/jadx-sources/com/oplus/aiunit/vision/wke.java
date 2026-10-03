package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.heytap.speechassist.engine.agent.IPlatformAgentService;

/* JADX INFO: loaded from: classes2.dex */
public class wke {
    public static final String CLASS_NAME = "com.heytap.speechassist.engine.agent.PlatformAgentEngine";
    public static volatile wke g;
    public IPlatformAgentService b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f18309c;
    public volatile boolean d;
    public final Object a = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IBinder.DeathRecipient f18310e = new a();
    public ServiceConnection f = new b();

    public class a implements IBinder.DeathRecipient {
        public a() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            if (wke.this.b == null) {
                return;
            }
            yq.a("SpeechPlatformAgent", "binderDied");
            wke.this.b.asBinder().unlinkToDeath(wke.this.f18310e, 0);
            wke.this.b = null;
        }
    }

    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            yq.a("SpeechPlatformAgent", "onServiceConnected");
            wke.this.d = false;
            try {
                if (iBinder != null) {
                    wke.this.b = IPlatformAgentService.Stub.asInterface(iBinder);
                    if (wke.this.b != null) {
                        String packageName = wke.this.f18309c.getPackageName();
                        yq.a("SpeechPlatformAgent", "onServiceConnected, packageName = " + packageName + ", className = " + wke.CLASS_NAME);
                        wke.this.b.setRemotePackageAndClass(packageName, wke.CLASS_NAME);
                        wke.this.b.asBinder().linkToDeath(wke.this.f18310e, 0);
                    } else {
                        yq.b("SpeechPlatformAgent", "onServiceConnected error !!!  mPlatformAgentService is null");
                    }
                } else {
                    yq.b("SpeechPlatformAgent", "onServiceConnected error !!!  binder is null");
                }
                synchronized (wke.this.a) {
                    wke.this.a.notifyAll();
                }
            } catch (Exception e2) {
                yq.c("SpeechPlatformAgent", "onServiceConnected, error !!! ", e2);
            } finally {
                synchronized (wke.this.a) {
                    wke.this.a.notifyAll();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            wke.this.b = null;
            wke.this.d = false;
        }
    }

    public wke(Context context) {
        this.f18309c = context.getApplicationContext();
    }

    public static wke h(Context context) {
        if (g == null) {
            synchronized (wke.class) {
                if (g == null) {
                    g = new wke(context);
                }
            }
        }
        return g;
    }

    public static IPlatformAgentService i(Context context) {
        wke wkeVarH = h(context);
        if (wkeVarH.b == null) {
            synchronized (wke.class) {
                if (wkeVarH.b == null) {
                    yq.a("SpeechPlatformAgent", "getPlatformAgentService, bind service");
                    if (!wkeVarH.d) {
                        wkeVarH.g();
                    }
                    wkeVarH.j();
                    yq.a("SpeechPlatformAgent", "getPlatformAgentService, bind service test");
                }
            }
        }
        return wkeVarH.b;
    }

    public void g() {
        yq.a("SpeechPlatformAgent", "bindPlatformAgentService");
        if (this.b == null) {
            this.d = true;
            try {
                Intent intent = new Intent("heytap.intent.action.PLATFORM_AGENT_SERVICE");
                intent.setPackage("com.heytap.speechassist.engine");
                this.f18309c.bindService(intent, this.f, 1);
            } catch (Exception e2) {
                yq.b("SpeechPlatformAgent", "bindPlatformAgentService, e=" + e2);
                this.d = false;
            }
        }
    }

    public final void j() {
        synchronized (this.a) {
            try {
                this.a.wait(1000L);
            } catch (InterruptedException e2) {
                yq.b("SpeechPlatformAgent", "setLock, InterruptedException=" + e2);
            }
        }
    }

    public void k() {
        yq.a("SpeechPlatformAgent", "unbindPlatformAgentService");
        if (this.b != null) {
            try {
                this.f18309c.unbindService(this.f);
                this.b = null;
            } catch (Exception e2) {
                yq.b("SpeechPlatformAgent", e2.getMessage());
            }
        }
    }
}
