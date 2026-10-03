package com.heytap.sports.step.stepdaemon;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.step.stepdaemon.sensor.SportService;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.aqi;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ep4;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0007*\u0001\u0010\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/heytap/sports/step/stepdaemon/a;", "", "Landroid/content/Context;", "context", "", MapSchema.FIELD_NAME_ENTRY, "Lcom/oplus/aiunit/vision/ep4;", "a", "Lcom/oplus/aiunit/vision/ep4;", "c", "()Lcom/oplus/aiunit/vision/ep4;", "daemonStore", "Lcom/oplus/aiunit/vision/aqi;", "b", "Lcom/oplus/aiunit/vision/aqi;", "cloudSyncTrigger", "com/heytap/sports/step/stepdaemon/a$b", "Lcom/heytap/sports/step/stepdaemon/a$b;", "sportServiceConnection", "<init>", "()V", "Companion", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class a {

    @Nullable
    public static volatile a d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ep4 daemonStore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final aqi cloudSyncTrigger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b sportServiceConnection;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.heytap.sports.step.stepdaemon.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/heytap/sports/step/stepdaemon/a$a;", "", "Lcom/heytap/sports/step/stepdaemon/a;", "a", "INSTANCE", "Lcom/heytap/sports/step/stepdaemon/a;", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nStepManagerDaemon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepManagerDaemon.kt\ncom/heytap/sports/step/stepdaemon/StepManagerDaemon$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final a a() {
            a aVar;
            a aVar2 = a.d;
            if (aVar2 != null) {
                return aVar2;
            }
            synchronized (a.class) {
                aVar = a.d;
                if (aVar == null) {
                    aVar = new a(null);
                    a.d = aVar;
                }
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/heytap/sports/step/stepdaemon/a$b", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "service", "", "onServiceConnected", "onServiceDisconnected", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(@Nullable ComponentName name, @Nullable IBinder service) {
            a7b.f("StepManagerDaemon", "SportService onServiceConnected");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@Nullable ComponentName name) {
            a7b.m("StepManagerDaemon", "SportService onServiceDisconnected (unexpected in same-process bind)");
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public static final a d() {
        return INSTANCE.a();
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ep4 getDaemonStore() {
        return this.daemonStore;
    }

    public final void e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a7b.f("StepManagerDaemon", "init: daemon side");
        this.cloudSyncTrigger.d();
        a7b.f("StepManagerDaemon", "bindService SportService bound=" + context.bindService(new Intent(context, (Class<?>) SportService.class), this.sportServiceConnection, 1));
    }

    public a() {
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        this.daemonStore = new ep4(contextA);
        this.cloudSyncTrigger = new aqi();
        this.sportServiceConnection = new b();
    }
}
