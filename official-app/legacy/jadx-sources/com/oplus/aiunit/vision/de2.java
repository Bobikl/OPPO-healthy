package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.annotation.ProcessName;
import com.heytap.health.devicemanager.manager.IDeviceManager;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.store.business.rn.service.RnConstant;
import com.oplus.health.apiprovider.ClientManager;
import io.protostuff.MapSchema;
import java.io.PrintWriter;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b%\u0010&J7\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\n\u0010\u000bJA\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0011\u001a\u00020\u0010H\u0017J\b\u0010\u0012\u001a\u00020\u0010H\u0017J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u001e\u0010\u001a\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J+\u0010\u001f\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0010\u0010\u001e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J+\u0010!\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0010\u0010\u001e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u001dH\u0015¢\u0006\u0004\b!\u0010 R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/de2;", "Lcom/oplus/health/apiprovider/ClientManager$d;", "Lcom/oplus/health/apiprovider/ClientManager$b;", ExifInterface.GPS_DIRECTION_TRUE, "", "method", "defRtn", "Lkotlin/Function1;", "Lcom/heytap/health/devicemanager/manager/IDeviceManager;", oea.CALLBACK, MapSchema.FIELD_NAME_ENTRY, "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "autoCreate", "f", "(Ljava/lang/String;ZLjava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", b2n.f, b2n.g, "name", "Lcom/heytap/health/annotation/ProcessName;", Fields.PROCESS_NAME_FIELD, "a", "c", "", "diedService", "b", "Ljava/io/PrintWriter;", "writer", "", RnConstant.KEY_INIT_OPTIONS, "dumpWithParam", "(Ljava/io/PrintWriter;[Ljava/lang/String;)V", "d", "i", "Ljava/lang/String;", "TAG", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public class de2 implements ClientManager.d, ClientManager.b {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "CDM0Heytap";

    public de2() {
        ClientManager.getInstance().addDumpables(this);
        ClientManager.getInstance().addServiceStatusListener(this);
    }

    @Override // com.oplus.health.apiprovider.ClientManager.d
    public void a(@NotNull String name, @NotNull ProcessName processName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(processName, "processName");
        if (TextUtils.equals(name, "DeviceManager")) {
            g();
        }
    }

    @Override // com.oplus.health.apiprovider.ClientManager.d
    public void b(@NotNull List<String> diedService, @NotNull ProcessName processName) {
        Intrinsics.checkNotNullParameter(diedService, "diedService");
        Intrinsics.checkNotNullParameter(processName, "processName");
        if (diedService.contains("DeviceManager")) {
            h();
        }
    }

    @Override // com.oplus.health.apiprovider.ClientManager.d
    public void c(@NotNull String name, @NotNull ProcessName processName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(processName, "processName");
        if (TextUtils.equals(name, "DeviceManager")) {
            h();
        }
    }

    @CallSuper
    public void d(@Nullable PrintWriter writer, @Nullable String[] param) {
    }

    @Override // com.oplus.health.apiprovider.ClientManager.b
    public void dumpWithParam(@Nullable PrintWriter writer, @Nullable String[] param) {
        if (qe0.w()) {
            try {
                d(writer, param);
            } catch (Exception unused) {
            }
        }
    }

    public final <T> T e(@NotNull String method, T defRtn, @NotNull Function1<? super IDeviceManager, ? extends T> cb) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(cb, "cb");
        return (T) f(method, false, defRtn, cb);
    }

    @SuppressLint({"HealthLint_ExceptionPrintDetector"})
    public final <T> T f(@NotNull String method, boolean autoCreate, T defRtn, @NotNull Function1<? super IDeviceManager, ? extends T> cb) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(cb, "cb");
        IDeviceManager iDeviceManager = (IDeviceManager) ClientManager.getInstance().getBuildService("DeviceManager", autoCreate, new ClientManager.a() { // from class: com.oplus.aiunit.vision.ce2
            @Override // com.oplus.health.apiprovider.ClientManager.a
            public final Object a(IBinder iBinder) {
                return IDeviceManager.Stub.asInterface(iBinder);
            }
        });
        if (iDeviceManager == null) {
            ml4.e(this.TAG, method + ": api is null");
            return defRtn;
        }
        try {
            return cb.invoke(iDeviceManager);
        } catch (Exception e2) {
            ml4.c(this.TAG, "invokeIDM " + method + ": ex " + e2);
            if (!qe0.w()) {
                return defRtn;
            }
            e2.printStackTrace();
            return defRtn;
        }
    }

    @CallSuper
    public void g() {
        ml4.d(this.TAG, "onServiceConnect");
    }

    @CallSuper
    public void h() {
        ml4.d(this.TAG, "onServiceDisconnect");
    }
}
