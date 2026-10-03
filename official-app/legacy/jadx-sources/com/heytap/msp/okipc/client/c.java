package com.heytap.msp.okipc.client;

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.database.Cursor;
import android.os.IBinder;
import android.os.RemoteException;
import com.heytap.msp.okipc.IErrorHandler;
import com.heytap.msp.okipc.IPCMethod;
import com.heytap.msp.okipc.IPCRawCall;
import com.heytap.msp.okipc.aidl.IChannel;
import com.heytap.msp.okipc.client.exception.ProviderNotFoundException;
import com.heytap.msp.okipc.client.exception.ServiceNotFoundException;
import com.heytap.msp.okipc.exception.IPCUnknownException;
import com.heytap.msp.okipc.interceptor.Chain;
import com.heytap.msp.okipc.interceptor.Interceptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class c implements IIPCClient, IPCRawCall.Factory<IPCClientCall> {
    public static volatile IErrorHandler i;
    public final String a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7329c;
    public Context d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f7330e;
    public final Executor f;
    public EventListener.Factory g = new a();
    public final List<IPCClientInterceptor> h;

    public class a implements EventListener.Factory {
        public a() {
        }

        @Override // com.heytap.msp.okipc.client.EventListener.Factory
        public EventListener create(IPCRawCall iPCRawCall) {
            return EventListener.NONE;
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ com.heytap.msp.okipc.c i;

        public b(com.heytap.msp.okipc.c cVar) {
            this.i = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.h(this.i);
        }
    }

    /* JADX INFO: renamed from: com.heytap.msp.okipc.client.c$c, reason: collision with other inner class name */
    public class ServiceConnectionC0719c implements ServiceConnection {
        public final /* synthetic */ Intent i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ com.heytap.msp.okipc.c f7332j;
        public final /* synthetic */ CountDownLatch k;

        public ServiceConnectionC0719c(Intent intent, com.heytap.msp.okipc.c cVar, CountDownLatch countDownLatch) {
            this.i = intent;
            this.f7332j = cVar;
            this.k = countDownLatch;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            this.k.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.heytap.msp.okipc.client.a.e().b(this.i, this, iBinder);
            c.this.l(this.f7332j).d(this.f7332j);
            this.k.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            c.this.l(this.f7332j).h(this.f7332j);
            this.k.countDown();
            this.f7332j.a();
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IPCMethod.values().length];
            a = iArr;
            try {
                iArr[IPCMethod.Service.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IPCMethod.Provider.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class e implements Interceptor<com.heytap.msp.okipc.d, Void, com.heytap.msp.okipc.c> {
        public final c a;

        public e(c cVar) {
            this.a = cVar;
        }

        public final IChannel a(com.heytap.msp.okipc.c cVar, com.heytap.msp.okipc.d dVar, EventListener eventListener) {
            IChannel iChannelF;
            IChannel iChannelD = com.heytap.msp.okipc.client.a.e().d();
            if (!c.g(iChannelD)) {
                synchronized (c.class) {
                    iChannelD = com.heytap.msp.okipc.client.a.e().d();
                    if (!c.g(iChannelD)) {
                        int i = d.a[dVar.f().ordinal()];
                        if (i == 1) {
                            iChannelF = c.this.f(cVar);
                        } else if (i != 2) {
                            IErrorHandler iErrorHandlerI = c.i();
                            if (iErrorHandlerI != null) {
                                iErrorHandlerI.handleError(new IllegalArgumentException("client ipc unknown type = " + dVar.f()));
                            }
                        } else {
                            IBinder iBinderQ = c.this.q(cVar);
                            if (iBinderQ != null) {
                                iChannelF = com.heytap.msp.okipc.client.a.e().c(iBinderQ);
                            }
                        }
                        iChannelD = iChannelF;
                    }
                }
            }
            return iChannelD;
        }

        public final void b(com.heytap.msp.okipc.c cVar, com.heytap.msp.okipc.d dVar) {
            int i = d.a[dVar.f().ordinal()];
            if (i == 1) {
                cVar.d(new ServiceNotFoundException("service not found, request =" + dVar));
                return;
            }
            if (i != 2) {
                cVar.d(new IPCUnknownException("error ipc type, request =" + dVar));
                return;
            }
            cVar.d(new ProviderNotFoundException("provider not found, request =" + dVar));
        }

        @Override // com.heytap.msp.okipc.interceptor.Interceptor
        public Void intercept(Chain<com.heytap.msp.okipc.d, Void, com.heytap.msp.okipc.c> chain) {
            com.heytap.msp.okipc.c cVarCall = chain.call();
            com.heytap.msp.okipc.d dVarRequest = chain.request();
            EventListener eventListenerL = this.a.l(cVarCall);
            IChannel iChannelA = a(cVarCall, dVarRequest, eventListenerL);
            if (iChannelA == null) {
                b(cVarCall, dVarRequest);
                return null;
            }
            eventListenerL.g(cVarCall);
            try {
                eventListenerL.k(cVarCall);
                iChannelA.call(cVarCall.b());
                eventListenerL.i(cVarCall);
                return null;
            } catch (RemoteException e2) {
                eventListenerL.j(cVarCall, e2);
                cVarCall.d(e2);
                return null;
            } catch (Throwable th) {
                eventListenerL.j(cVarCall, th);
                cVarCall.d(th);
                return null;
            }
        }
    }

    public c(Context context, String str, String str2, String str3, int i2, Executor executor, Executor executor2, List<IPCClientInterceptor> list) {
        this.d = context;
        this.f7330e = executor;
        this.f = executor2;
        this.a = str2;
        this.b = str3;
        this.f7329c = str;
        this.h = list != null ? Collections.unmodifiableList(new ArrayList(list)) : Collections.emptyList();
    }

    public static boolean g(IChannel iChannel) {
        return iChannel != null && iChannel.asBinder().isBinderAlive();
    }

    public static IErrorHandler i() {
        return i;
    }

    public static void k(Throwable th) {
        IErrorHandler iErrorHandler = i;
        if (iErrorHandler != null) {
            iErrorHandler.handleError(th);
        }
    }

    @Override // com.heytap.msp.okipc.client.IIPCClient
    public void enqueue(com.heytap.msp.okipc.c cVar) {
        try {
            this.f7330e.execute(new b(cVar));
        } catch (RejectedExecutionException e2) {
            cVar.d(e2);
        }
    }

    public final IChannel f(com.heytap.msp.okipc.c cVar) {
        l(cVar).f(cVar);
        boolean z = true;
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Intent intent = new Intent(cVar.request().d());
            intent.setPackage(this.f7329c);
            this.d.bindService(intent, new ServiceConnectionC0719c(intent, cVar, countDownLatch), 1);
            countDownLatch.await(5L, TimeUnit.SECONDS);
            z = false;
        } catch (Throwable th) {
            l(cVar).e(cVar, th);
            cVar.d(new ServiceNotFoundException("service not found, request = " + cVar.request(), th));
        }
        IChannel iChannelD = com.heytap.msp.okipc.client.a.e().d();
        if (!z && iChannelD == null) {
            l(cVar).e(cVar, new ServiceNotFoundException("Bind failed"));
        }
        return iChannelD;
    }

    public final void h(com.heytap.msp.okipc.c cVar) {
        l(cVar).c(cVar);
        ArrayList arrayList = new ArrayList(this.h.size() + 1);
        arrayList.addAll(this.h);
        arrayList.add(new e(this));
        try {
            new com.heytap.msp.okipc.interceptor.a(arrayList, 0, cVar.request(), cVar).proceed(cVar.request());
        } catch (Throwable th) {
            l(cVar).b(cVar, th);
            cVar.d(th);
        }
    }

    public Executor j() {
        return this.f;
    }

    public final EventListener l(com.heytap.msp.okipc.c cVar) {
        return cVar instanceof IPCClientCall ? ((IPCClientCall) cVar).f() : EventListener.NONE;
    }

    @Override // com.heytap.msp.okipc.IPCRawCall.Factory
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public IPCClientCall newCall(com.heytap.msp.okipc.d dVar) {
        dVar.j(this.d.getPackageName());
        dVar.g(this.b, this.a);
        IPCClientCall iPCClientCall = new IPCClientCall(this, dVar);
        iPCClientCall.g(this.g.create(iPCClientCall));
        return iPCClientCall;
    }

    public void n(EventListener.Factory factory) {
        this.g = factory;
    }

    public String o() {
        return this.f7329c;
    }

    public int p() {
        return com.heytap.msp.okipc.client.a.e().g(this.d);
    }

    public final IBinder q(com.heytap.msp.okipc.c cVar) {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        Cursor cursorQuery;
        boolean z;
        IBinder iBinder;
        l(cVar).f(cVar);
        IBinder binder = null;
        IBinder iBinder2 = null;
        Cursor cursor = null;
        try {
            contentProviderClientAcquireUnstableContentProviderClient = this.d.getContentResolver().acquireUnstableContentProviderClient(cVar.request().h());
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                try {
                    cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(cVar.request().h(), null, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            binder = cursorQuery.getExtras().getBinder("ipc");
                        } catch (Throwable th) {
                            th = th;
                            try {
                                l(cVar).e(cVar, th);
                                cVar.d(th);
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                                z = true;
                            } catch (Throwable th2) {
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                                throw th2;
                            }
                        }
                    }
                    iBinder = binder;
                    cursor = cursorQuery;
                } catch (Throwable th3) {
                    th = th3;
                    cursorQuery = null;
                }
            } else {
                iBinder = null;
            }
            if (cursor != null) {
                cursor.close();
            }
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            }
            z = false;
            iBinder2 = iBinder;
        } catch (Throwable th4) {
            th = th4;
            contentProviderClientAcquireUnstableContentProviderClient = null;
            cursorQuery = null;
        }
        if (iBinder2 != null) {
            l(cVar).d(cVar);
        } else if (!z) {
            l(cVar).e(cVar, new ProviderNotFoundException("Provider not found"));
        }
        return iBinder2;
    }
}
