package com.heytap.health.connect.rawapi.impl.listener;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.os.IBinder;
import androidx.annotation.CallSuper;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.annotation.ProcessName;
import com.heytap.health.connect.rawapi.IHeytap;
import com.heytap.health.connect.rawapi.impl.listener.LM0Heytap;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.store.base.core.http.HttpConst;
import com.heytap.store.business.rn.service.RnConstant;
import com.heytap.webview.extension.activity.FragmentStyle;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.gxe;
import com.oplus.aiunit.vision.oea;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.rdf;
import com.oplus.aiunit.vision.u89;
import com.oplus.aiunit.vision.wil;
import com.oplus.aiunit.vision.xaf;
import com.oplus.aiunit.vision.zza;
import com.oplus.health.apiprovider.ClientManager;
import io.protostuff.MapSchema;
import java.io.PrintWriter;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0007*\u0001.\b&\u0018\u0000 32\u00020\u00012\u00020\u0002:\u0001\u0012B\u0007¢\u0006\u0004\b1\u00102J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J)\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0010\u0010\u000b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0005H\u0017J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u001e\u0010\u0016\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0017J7\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00028\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00028\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b!\u0010\"R\u001f\u0010(\u001a\n $*\u0004\u0018\u00010#0#8\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010-\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b\u001e\u0010*\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010/¨\u00064"}, d2 = {"Lcom/heytap/health/connect/rawapi/impl/listener/LM0Heytap;", "Lcom/oplus/health/apiprovider/ClientManager$b;", "Lcom/oplus/health/apiprovider/ClientManager$d;", "", FragmentStyle.DEBUG, "", "i", "Ljava/io/PrintWriter;", "writer", "", "", RnConstant.KEY_INIT_OPTIONS, "dumpWithParam", "(Ljava/io/PrintWriter;[Ljava/lang/String;)V", LogFieldKey.MESSAGE_KEY, "name", "Lcom/heytap/health/annotation/ProcessName;", Fields.PROCESS_NAME_FIELD, "a", "c", "", "diedService", "b", LogFieldKey.LEVEL_KEY, ExifInterface.GPS_DIRECTION_TRUE, "method", "defRtn", "Lkotlin/Function1;", "Lcom/heytap/health/connect/rawapi/IHeytap;", oea.CALLBACK, "j", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "autoCreate", MapSchema.FIELD_NAME_KEY, "(Ljava/lang/String;ZLjava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", b2n.g, "()Landroid/content/Context;", "mContext", "Lcom/oplus/aiunit/vision/zza;", "Lcom/oplus/aiunit/vision/zza;", b2n.f, "()Lcom/oplus/aiunit/vision/zza;", "mClientExecutor", "com/heytap/health/connect/rawapi/impl/listener/LM0Heytap$mReAdd$1", "Lcom/heytap/health/connect/rawapi/impl/listener/LM0Heytap$mReAdd$1;", "mReAdd", "<init>", "()V", "Companion", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
public abstract class LM0Heytap implements ClientManager.b, ClientManager.d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int LISTENER_LIMIT = 100;

    @NotNull
    public static final String TAG = "ListenerManager";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final Context mContext;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zza mClientExecutor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final LM0Heytap$mReAdd$1 mReAdd;

    /* JADX INFO: renamed from: com.heytap.health.connect.rawapi.impl.listener.LM0Heytap$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0005R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/connect/rawapi/impl/listener/LM0Heytap$a;", "", "", "tag", HttpConst.COOKIE, "Lkotlin/Function0;", "", "run", "a", "", "LISTENER_LIMIT", "I", "TAG", "Ljava/lang/String;", "<init>", "()V", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @SuppressLint({"HealthLint_ExceptionPrintDetector"})
        public final void a(@NotNull String tag, @Nullable Object cookie, @NotNull Function0<Unit> run) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(run, "run");
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                run.invoke();
            } catch (Exception e2) {
                wil.b(LM0Heytap.TAG, tag + ": failed " + cookie + " e=" + e2);
                if (qe0.w()) {
                    e2.printStackTrace();
                }
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (jCurrentTimeMillis2 > 100) {
                wil.k(LM0Heytap.TAG, tag + ": timeout " + jCurrentTimeMillis2 + "  " + cookie);
            }
        }
    }

    public LM0Heytap() {
        Context contextA = b78.a();
        this.mContext = contextA;
        this.mClientExecutor = zza.INSTANCE;
        LM0Heytap$mReAdd$1 lM0Heytap$mReAdd$1 = new LM0Heytap$mReAdd$1(this);
        this.mReAdd = lM0Heytap$mReAdd$1;
        ClientManager.getInstance().addDumpables(this);
        ClientManager.getInstance().addServiceStatusListener(this);
        ClientManager.getInstance().addOnBinderFirstGetListener(new ClientManager.c() { // from class: com.oplus.aiunit.vision.jqa
            @Override // com.oplus.health.apiprovider.ClientManager.c
            public final void a(String str, ProcessName processName) {
                LM0Heytap.f(this.a, str, processName);
            }
        });
        rdf.a(contextA, lM0Heytap$mReAdd$1, new IntentFilter(xaf.RECONNECT_ACTION), 4);
    }

    public static final void f(LM0Heytap this$0, String str, ProcessName processName) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(str, a.NAME)) {
            this$0.l();
        }
    }

    public static final void n(LM0Heytap this$0, final String name) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(name, "$name");
        this$0.k("tryGetBinderOnServiceAdd", true, Unit.INSTANCE, new Function1<IHeytap, Unit>() { // from class: com.heytap.health.connect.rawapi.impl.listener.LM0Heytap$onServiceAdd$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IHeytap iHeytap) {
                invoke2(iHeytap);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IHeytap iHeytap) {
                Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                wil.d(LM0Heytap.TAG, "on onServiceAdd " + name + ", got binder " + iHeytap);
            }
        });
    }

    @JvmStatic
    @SuppressLint({"HealthLint_ExceptionPrintDetector"})
    public static final void o(@NotNull String str, @Nullable Object obj, @NotNull Function0<Unit> function0) {
        INSTANCE.a(str, obj, function0);
    }

    @Override // com.oplus.health.apiprovider.ClientManager.d
    public void a(@NotNull final String name, @NotNull ProcessName processName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(processName, "processName");
        if (Intrinsics.areEqual(name, a.NAME)) {
            wil.d(TAG, "onServiceAdd onConnect ");
            this.mClientExecutor.e(new Runnable() { // from class: com.oplus.aiunit.vision.kqa
                @Override // java.lang.Runnable
                public final void run() {
                    LM0Heytap.n(this.i, name);
                }
            });
        }
    }

    @Override // com.oplus.health.apiprovider.ClientManager.d
    public void b(@NotNull List<String> diedService, @NotNull ProcessName processName) {
        Intrinsics.checkNotNullParameter(diedService, "diedService");
        Intrinsics.checkNotNullParameter(processName, "processName");
        if (diedService.contains(a.NAME)) {
            m();
        }
    }

    @Override // com.oplus.health.apiprovider.ClientManager.d
    public void c(@NotNull String name, @NotNull ProcessName processName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(processName, "processName");
        if (Intrinsics.areEqual(name, a.NAME)) {
            m();
        }
    }

    @Override // com.oplus.health.apiprovider.ClientManager.b
    @CallSuper
    public void dumpWithParam(@NotNull PrintWriter writer, @Nullable String[] param) {
        Intrinsics.checkNotNullParameter(writer, "writer");
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final zza getMClientExecutor() {
        return this.mClientExecutor;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Context getMContext() {
        return this.mContext;
    }

    public final void i(boolean debug) {
    }

    public final <T> T j(@NotNull String method, T defRtn, @NotNull Function1<? super IHeytap, ? extends T> cb) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(cb, "cb");
        return (T) k(method, false, defRtn, cb);
    }

    public final <T> T k(@NotNull String method, boolean autoCreate, T defRtn, @NotNull Function1<? super IHeytap, ? extends T> cb) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(cb, "cb");
        IHeytap iHeytap = (IHeytap) ClientManager.getInstance().getBuildService(a.NAME, autoCreate, new ClientManager.a() { // from class: com.oplus.aiunit.vision.iqa
            @Override // com.oplus.health.apiprovider.ClientManager.a
            public final Object a(IBinder iBinder) {
                return IHeytap.Stub.asInterface(iBinder);
            }
        });
        if (iHeytap == null) {
            wil.k(TAG, method + ": api is null");
            return defRtn;
        }
        try {
            return cb.invoke(iHeytap);
        } catch (Exception e2) {
            if (u89.InitApi.isDebug()) {
                wil.l(TAG, method + ": ex " + e2, e2);
                return defRtn;
            }
            wil.k(TAG, method + ": ex " + e2);
            return defRtn;
        }
    }

    @CallSuper
    public void l() {
        wil.d(TAG, "onConnect: " + this + "  process:" + gxe.c());
    }

    @CallSuper
    public void m() {
        wil.d(TAG, "onRemoteDied: ");
    }
}
