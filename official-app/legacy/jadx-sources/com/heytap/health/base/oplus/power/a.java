package com.heytap.health.base.oplus.power;

import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.v3d;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.TriggerEvent;
import com.oplus.osense.OsenseResEventClient;
import com.oplus.osense.eventinfo.EventConfig;
import com.oplus.osense.eventinfo.OsenseConfig;
import com.oplus.osense.eventinfo.OsenseEventCallback;
import com.oplus.osense.eventinfo.OsenseEventResult;
import io.protostuff.MapSchema;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u000f\u0003\rB\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/base/oplus/power/a;", "", "", "b", "Lcom/oplus/osense/eventinfo/OsenseEventCallback;", "callback", "Lcom/oplus/osense/eventinfo/EventConfig;", "eventConfig", "", "d", "", "message", "", "c", "Lcom/oplus/osense/OsenseResEventClient;", "a", "Lcom/oplus/osense/OsenseResEventClient;", "sClient", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class a {

    @NotNull
    public static final a INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static OsenseResEventClient sClient;

    /* JADX INFO: renamed from: com.heytap.health.base.oplus.power.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0014J\u001a\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/base/oplus/power/a$a;", "Lcom/oplus/osense/eventinfo/OsenseEventCallback;", "Lcom/oplus/osense/eventinfo/OsenseEventResult;", "eventResult", "", "onEventSceneChanged", "", "pid", TriggerEvent.EXTRA_UID, "", f04.KEY_IS_REGISTER, "onTerminateStateChanged", "", EngineConstant.REASON, "onRequestTerminate", "onProcessTerminate", "a", "d", "c", "b", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class AbstractC0289a extends OsenseEventCallback {
        public abstract void a(@NotNull OsenseEventResult eventResult);

        public void b(@Nullable String reason) {
        }

        public void c(int pid, @Nullable String reason) {
        }

        public void d(int pid, int uid, boolean isRegister) {
        }

        public void onEventSceneChanged(@Nullable OsenseEventResult eventResult) {
            if (eventResult != null) {
                a.INSTANCE.c("onEventSceneChanged: " + eventResult);
                a(eventResult);
            }
        }

        public void onProcessTerminate(@Nullable String reason) {
            a.INSTANCE.c("onProcessTerminate: reason=" + reason);
            b(reason);
        }

        public void onRequestTerminate(int pid, @Nullable String reason) {
            a.INSTANCE.c("onRequestTerminate: pid=" + pid + ", reason=" + reason);
            c(pid, reason);
        }

        public void onTerminateStateChanged(int pid, int uid, boolean isRegister) {
            a.INSTANCE.c("onTerminateStateChanged: pid=" + pid + ", uid=" + uid + ", isRegister=" + isRegister);
            d(pid, uid, isRegister);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007R$\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/base/oplus/power/a$b;", "", "", "firstNotify", "a", "b", "c", "Lcom/oplus/osense/eventinfo/EventConfig;", "d", "Ljava/util/HashSet;", "Lcom/oplus/osense/eventinfo/OsenseConfig;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "osenseConfigs", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOSystemLoad.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OSystemLoad.kt\ncom/heytap/health/base/oplus/power/OSystemLoad$EventConfigBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,728:1\n1#2:729\n*E\n"})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final HashSet<OsenseConfig> osenseConfigs = new HashSet<>();

        @NotNull
        public final b a(boolean firstNotify) {
            Bundle bundle;
            if (firstNotify) {
                bundle = new Bundle();
                bundle.putBoolean("firstNotifyFlag", true);
            } else {
                bundle = null;
            }
            this.osenseConfigs.add(new OsenseConfig(103, bundle));
            return this;
        }

        @NotNull
        public final b b(boolean firstNotify) {
            Bundle bundle;
            if (firstNotify) {
                bundle = new Bundle();
                bundle.putBoolean("firstNotifyFlag", true);
            } else {
                bundle = null;
            }
            this.osenseConfigs.add(new OsenseConfig(102, bundle));
            return this;
        }

        @NotNull
        public final b c(boolean firstNotify) {
            Bundle bundle;
            if (firstNotify) {
                bundle = new Bundle();
                bundle.putBoolean("firstNotifyFlag", true);
            } else {
                bundle = null;
            }
            this.osenseConfigs.add(new OsenseConfig(108, bundle));
            return this;
        }

        @NotNull
        public final EventConfig d() {
            EventConfig eventConfig = new EventConfig();
            eventConfig.setOsenseConfigSet(this.osenseConfigs);
            return eventConfig;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/heytap/health/base/oplus/power/a$c;", "", "Lcom/oplus/osense/eventinfo/OsenseEventResult;", "result", "", "b", "", "d", MapSchema.FIELD_NAME_ENTRY, "c", "a", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public static final class c {

        @NotNull
        public static final c INSTANCE = new c();

        public final int a(@NotNull OsenseEventResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            Bundle extraData = result.getExtraData();
            if (extraData != null) {
                return extraData.getInt("cpuLevel", -1);
            }
            return -1;
        }

        public final int b(@NotNull OsenseEventResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return result.getEventType();
        }

        public final int c(@NotNull OsenseEventResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            Bundle extraData = result.getExtraData();
            if (extraData != null) {
                return extraData.getInt("thermal", -1);
            }
            return -1;
        }

        public final boolean d(@NotNull OsenseEventResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return result.getEventStateType() == 0;
        }

        public final boolean e(@NotNull OsenseEventResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return result.getEventStateType() == 1;
        }
    }

    static {
        a aVar = new a();
        INSTANCE = aVar;
        if (Build.VERSION.SDK_INT <= 34) {
            aVar.c("init: SDK version too low, skip initialization");
            return;
        }
        if (!(v3d.j() || v3d.i() || v3d.k())) {
            aVar.c("init: not OPlus brand, skip initialization");
            return;
        }
        OsenseResEventClient osenseResEventClient = OsenseResEventClient.getInstance();
        Intrinsics.checkNotNullExpressionValue(osenseResEventClient, "getInstance()");
        sClient = osenseResEventClient;
        aVar.c("init: OsenseResEventClient initialized");
    }

    public final boolean b() {
        return sClient != null;
    }

    public final void c(String message) {
        a7b.f("OSystemLoad", message);
    }

    public final int d(@NotNull OsenseEventCallback callback, @NotNull EventConfig eventConfig) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(eventConfig, "eventConfig");
        if (!b()) {
            c("registerEventCallback: not enabled");
            return -1;
        }
        try {
            OsenseResEventClient osenseResEventClient = sClient;
            if (osenseResEventClient == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sClient");
                osenseResEventClient = null;
            }
            int iRegisterEventCallback = osenseResEventClient.registerEventCallback(callback, eventConfig);
            c("registerEventCallback ret: " + iRegisterEventCallback + ", eventConfig: " + eventConfig);
            return iRegisterEventCallback;
        } catch (RemoteException e2) {
            c("registerEventCallback exception: " + e2);
            return -1;
        }
    }
}
