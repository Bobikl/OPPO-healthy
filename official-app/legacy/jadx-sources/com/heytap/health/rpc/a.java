package com.heytap.health.rpc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.xx0;
import io.protostuff.MapSchema;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 K*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003\u0010\u0014\u0017B9\u0012\u0006\u0010D\u001a\u00020#\u0012\u0006\u0010E\u001a\u00020\u001f\u0012\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000'\u0012\b\b\u0002\u0010G\u001a\u00020\u0004\u0012\b\b\u0002\u0010H\u001a\u00020\u0004¢\u0006\u0004\bI\u0010JJ\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0017\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u00102\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010,R\u0016\u00106\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010,R\u0016\u00109\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010?R\u0014\u0010C\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010B¨\u0006L"}, d2 = {"Lcom/heytap/health/rpc/a;", "Landroid/os/IInterface;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "apiReleaseTime", "", "u", "bindFlag", "q", "(I)Landroid/os/IInterface;", "v", "", "o", LogFieldKey.PROCESS_NAME_KEY, "Ljava/util/concurrent/ExecutorService;", "a", "Ljava/util/concurrent/ExecutorService;", "mExecutor", "Ljava/util/concurrent/CountDownLatch;", "b", "Ljava/util/concurrent/CountDownLatch;", "mLock", "c", "Landroid/os/IInterface;", "mInterface", "", "Lcom/heytap/health/rpc/a$a;", "d", "Ljava/util/Set;", "mDeadListener", "Landroid/content/Intent;", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Intent;", "mIntent", "Landroid/content/Context;", "f", "Landroid/content/Context;", "mContext", "Lcom/heytap/health/rpc/a$c;", b2n.f, "Lcom/heytap/health/rpc/a$c;", "mTConvert", b2n.g, "I", "mMaxRetry", "i", "mTimeOut", "j", "Ljava/lang/Object;", "mModifyLock", MapSchema.FIELD_NAME_KEY, "mApiReleaseTime", LogFieldKey.LEVEL_KEY, "mBindFlag", LogFieldKey.MESSAGE_KEY, "Z", "mBound", "Landroid/os/IBinder$DeathRecipient;", "n", "Landroid/os/IBinder$DeathRecipient;", "mRecipient", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "mApiTimeout", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "mConn", "context", "intent", "convert", "maxRetry", "timeOut", "<init>", "(Landroid/content/Context;Landroid/content/Intent;Lcom/heytap/health/rpc/a$c;II)V", "Companion", "lib_rpc_base_release"}, k = 1, mv = {1, 8, 0})
public final class a<T extends IInterface> {

    @NotNull
    public static final Handler q = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ExecutorService mExecutor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public CountDownLatch mLock;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public T mInterface;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Set<InterfaceC0539a> mDeadListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Intent mIntent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Context mContext;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final c<T> mTConvert;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int mMaxRetry;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int mTimeOut;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object mModifyLock;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int mApiReleaseTime;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int mBindFlag;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public volatile boolean mBound;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final IBinder.DeathRecipient mRecipient;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Runnable mApiTimeout;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final ServiceConnection mConn;

    /* JADX INFO: renamed from: com.heytap.health.rpc.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/rpc/a$a;", "", "", "onDead", "lib_rpc_base_release"}, k = 1, mv = {1, 8, 0})
    public interface InterfaceC0539a {
        void onDead();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0019\u0010\u0005\u001a\u00028\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/health/rpc/a$c;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroid/os/IBinder;", "binder", "a", "(Landroid/os/IBinder;)Ljava/lang/Object;", "lib_rpc_base_release"}, k = 1, mv = {1, 8, 0})
    public interface c<T> {
        T a(@Nullable IBinder binder);
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/heytap/health/rpc/a$d", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "service", "", "onServiceConnected", "onServiceDisconnected", "lib_rpc_base_release"}, k = 1, mv = {1, 8, 0})
    public static final class d implements ServiceConnection {
        public final /* synthetic */ a<T> i;

        public d(a<T> aVar) {
            this.i = aVar;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            com.heytap.health.rpc.c.INSTANCE.d("onServiceConnected: " + name + ", binder=" + service.hashCode());
            Object obj = this.i.mModifyLock;
            a<T> aVar = this.i;
            synchronized (obj) {
                try {
                    aVar.mInterface = (IInterface) aVar.mTConvert.a(service);
                    IInterface iInterface = aVar.mInterface;
                    Intrinsics.checkNotNull(iInterface);
                    iInterface.asBinder().linkToDeath(aVar.mRecipient, 0);
                } catch (RemoteException e2) {
                    com.heytap.health.rpc.c.INSTANCE.b("onServiceConnected: linkToDeath exception " + e2);
                }
                if (aVar.mApiReleaseTime > 0) {
                    a.q.removeCallbacks(aVar.mApiTimeout);
                    a.q.postDelayed(aVar.mApiTimeout, aVar.mApiReleaseTime);
                }
                if (aVar.mLock != null) {
                    CountDownLatch countDownLatch = aVar.mLock;
                    Intrinsics.checkNotNull(countDownLatch);
                    countDownLatch.countDown();
                }
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@NotNull ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            com.heytap.health.rpc.c.INSTANCE.h("onServiceDisconnected: " + name);
            Object obj = this.i.mModifyLock;
            a<T> aVar = this.i;
            synchronized (obj) {
                if (aVar.mInterface != null) {
                    try {
                        IInterface iInterface = aVar.mInterface;
                        Intrinsics.checkNotNull(iInterface);
                        iInterface.asBinder().unlinkToDeath(aVar.mRecipient, 0);
                    } catch (Exception unused) {
                    }
                    aVar.mInterface = null;
                }
                if (aVar.mLock != null) {
                    CountDownLatch countDownLatch = aVar.mLock;
                    Intrinsics.checkNotNull(countDownLatch);
                    countDownLatch.countDown();
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/heytap/health/rpc/a$e", "Landroid/os/IBinder$DeathRecipient;", "", "binderDied", "lib_rpc_base_release"}, k = 1, mv = {1, 8, 0})
    public static final class e implements IBinder.DeathRecipient {
        public final /* synthetic */ a<T> a;

        public e(a<T> aVar) {
            this.a = aVar;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            Object obj = this.a.mModifyLock;
            a<T> aVar = this.a;
            synchronized (obj) {
                if (aVar.mInterface != null) {
                    IInterface iInterface = aVar.mInterface;
                    Intrinsics.checkNotNull(iInterface);
                    iInterface.asBinder().unlinkToDeath(this, 0);
                    aVar.mInterface = null;
                    aVar.v();
                    if (aVar.mLock != null) {
                        CountDownLatch countDownLatch = aVar.mLock;
                        Intrinsics.checkNotNull(countDownLatch);
                        countDownLatch.countDown();
                    }
                    Iterator it = aVar.mDeadListener.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0539a) it.next()).onDead();
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public a(@NotNull Context context, @NotNull Intent intent, @NotNull c<T> convert, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(convert, "convert");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.oplus.aiunit.vision.me1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return com.heytap.health.rpc.a.t(runnable);
            }
        });
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor …(r, \"BinderHolder\")\n    }");
        this.mExecutor = executorServiceNewSingleThreadExecutor;
        this.mDeadListener = new HashSet();
        this.mModifyLock = new Object();
        this.mBindFlag = 1;
        this.mRecipient = new e(this);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.mContext = applicationContext;
        this.mIntent = intent;
        this.mTConvert = convert;
        this.mMaxRetry = i;
        this.mTimeOut = i2;
        this.mApiTimeout = new Runnable() { // from class: com.oplus.aiunit.vision.ne1
            @Override // java.lang.Runnable
            public final void run() {
                com.heytap.health.rpc.a.s(this.i);
            }
        };
        this.mConn = new d(this);
    }

    public static final IInterface r(a this$0, long j2) {
        T t;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = 0;
        while (true) {
            t = this$0.mInterface;
            if (t != null || i >= this$0.mMaxRetry) {
                break;
            }
            this$0.p();
            i++;
            long jUptimeMillis = SystemClock.uptimeMillis() - j2;
            com.heytap.health.rpc.c.INSTANCE.d("getApiSync: retryTime=" + i + " delay=" + jUptimeMillis + " mApi=" + (this$0.mInterface != null));
        }
        return t;
    }

    public static final void s(a this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.heytap.health.rpc.c.Companion companion = com.heytap.health.rpc.c.INSTANCE;
        companion.a("release api holder");
        synchronized (this$0.mModifyLock) {
            companion.d("mApiTimeout: timeout unbind");
            this$0.mInterface = null;
            this$0.v();
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final Thread t(Runnable runnable) {
        return new Thread(runnable, "BinderHolder");
    }

    public final boolean o() {
        try {
            boolean zBindService = this.mContext.bindService(this.mIntent, this.mConn, this.mBindFlag);
            if (!zBindService) {
                return zBindService;
            }
            this.mBound = true;
            return zBindService;
        } catch (Exception e2) {
            com.heytap.health.rpc.c.INSTANCE.h("bind: " + e2);
            return false;
        }
    }

    public final void p() {
        this.mLock = new CountDownLatch(1);
        if (!o()) {
            CountDownLatch countDownLatch = this.mLock;
            Intrinsics.checkNotNull(countDownLatch);
            countDownLatch.countDown();
        }
        try {
            CountDownLatch countDownLatch2 = this.mLock;
            Intrinsics.checkNotNull(countDownLatch2);
            countDownLatch2.await(this.mTimeOut, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            com.heytap.health.rpc.c.INSTANCE.b("bindPartnerApiSync: await exception " + e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0153 A[Catch: all -> 0x01a2, TryCatch #0 {, blocks: (B:26:0x004e, B:30:0x0054, B:32:0x0062, B:35:0x006e, B:38:0x008d, B:40:0x0096, B:42:0x00ae, B:46:0x00b6, B:47:0x00e3, B:67:0x014a, B:69:0x0153, B:70:0x0169, B:74:0x0171, B:75:0x01a1, B:53:0x00ed, B:55:0x00f6, B:56:0x010c, B:60:0x0114, B:37:0x0088), top: B:79:0x004e, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0170  */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x0153, please report this as an issue */
    @Nullable
    public final T q(int bindFlag) {
        Exception exc;
        long jUptimeMillis;
        com.heytap.health.rpc.c.Companion companion;
        String str;
        Throwable th;
        Throwable th2 = null;
        if (bindFlag != this.mBindFlag) {
            synchronized (this.mModifyLock) {
                this.mInterface = null;
                v();
                Unit unit = Unit.INSTANCE;
            }
            this.mBindFlag = bindFlag;
        }
        if (this.mInterface != null) {
            if (this.mApiReleaseTime > 0) {
                Handler handler = q;
                handler.removeCallbacks(this.mApiTimeout);
                handler.postDelayed(this.mApiTimeout, this.mApiReleaseTime);
            }
            return this.mInterface;
        }
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper()) && this.mInterface == null) {
            o();
            com.heytap.health.rpc.c.INSTANCE.b("getApiSync: called main thread and api is null");
            return null;
        }
        synchronized (this) {
            T t = this.mInterface;
            if (t != null) {
                return t;
            }
            if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
                com.heytap.health.rpc.c.INSTANCE.b("getApiSync: can not run in main thread");
                o();
                return null;
            }
            final long jUptimeMillis2 = SystemClock.uptimeMillis();
            boolean z = true;
            try {
                this.mExecutor.submit(new Callable() { // from class: com.oplus.aiunit.vision.oe1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return com.heytap.health.rpc.a.r(this.i, jUptimeMillis2);
                    }
                }).get((this.mMaxRetry + 1) * this.mTimeOut, TimeUnit.MILLISECONDS);
                long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis2;
                if (jUptimeMillis3 > xx0.SCROLL_DELAYED) {
                    th = new Throwable("called in main thread time out" + jUptimeMillis3);
                } else {
                    th = null;
                }
                companion = com.heytap.health.rpc.c.INSTANCE;
                if (this.mInterface == null) {
                    z = false;
                }
                str = "getApiSync: delay=" + jUptimeMillis3 + " mApi=" + z + " e=" + ((Object) null) + " caller=" + companion.c(th);
            } catch (Exception e2) {
                try {
                    Unit unit2 = Unit.INSTANCE;
                    long jUptimeMillis4 = SystemClock.uptimeMillis() - jUptimeMillis2;
                    if (jUptimeMillis4 > xx0.SCROLL_DELAYED) {
                        th2 = new Throwable("called in main thread time out" + jUptimeMillis4);
                    }
                    companion = com.heytap.health.rpc.c.INSTANCE;
                    if (this.mInterface == null) {
                        z = false;
                    }
                    str = "getApiSync: delay=" + jUptimeMillis4 + " mApi=" + z + " e=" + e2 + " caller=" + companion.c(th2);
                } catch (Throwable th3) {
                    exc = e2;
                    th = th3;
                    jUptimeMillis = SystemClock.uptimeMillis() - jUptimeMillis2;
                    if (jUptimeMillis > xx0.SCROLL_DELAYED) {
                        th2 = new Throwable("called in main thread time out" + jUptimeMillis);
                    }
                    com.heytap.health.rpc.c.Companion companion2 = com.heytap.health.rpc.c.INSTANCE;
                    if (this.mInterface != null) {
                        z = false;
                    }
                    companion2.d("getApiSync: delay=" + jUptimeMillis + " mApi=" + z + " e=" + exc + " caller=" + companion2.c(th2));
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                exc = null;
                jUptimeMillis = SystemClock.uptimeMillis() - jUptimeMillis2;
                if (jUptimeMillis > xx0.SCROLL_DELAYED) {
                    th2 = new Throwable("called in main thread time out" + jUptimeMillis);
                }
                com.heytap.health.rpc.c.Companion companion3 = com.heytap.health.rpc.c.INSTANCE;
                if (this.mInterface != null) {
                    z = false;
                }
                companion3.d("getApiSync: delay=" + jUptimeMillis + " mApi=" + z + " e=" + exc + " caller=" + companion3.c(th2));
                throw th;
            }
            companion.d(str);
            return this.mInterface;
        }
    }

    public final void u(int apiReleaseTime) {
        this.mApiReleaseTime = apiReleaseTime;
        if (apiReleaseTime == 0) {
            q.removeCallbacks(this.mApiTimeout);
            return;
        }
        Handler handler = q;
        handler.removeCallbacks(this.mApiTimeout);
        com.heytap.health.rpc.c.INSTANCE.a("set release time=" + apiReleaseTime);
        handler.postDelayed(this.mApiTimeout, (long) this.mApiReleaseTime);
    }

    public final void v() {
        if (this.mBound) {
            this.mBound = false;
            q.removeCallbacks(this.mApiTimeout);
            try {
                this.mContext.unbindService(this.mConn);
            } catch (Exception e2) {
                com.heytap.health.rpc.c.INSTANCE.d("unbindLocked: failed " + e2);
            }
        }
    }

    public /* synthetic */ a(Context context, Intent intent, c cVar, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, intent, cVar, (i3 & 8) != 0 ? 4 : i, (i3 & 16) != 0 ? 500 : i2);
    }
}
