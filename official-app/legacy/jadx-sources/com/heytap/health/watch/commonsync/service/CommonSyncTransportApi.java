package com.heytap.health.watch.commonsync.service;

import android.content.Context;
import android.os.IBinder;
import com.heytap.health.watch.commonsync.aidl.ICommonSyncTransport;
import com.heytap.health.watch.commonsync.messagemanager.TransportSyncMessageManager;
import com.heytap.health.watch.commonsync.service.CommonSyncTransportApi;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.cm9;
import com.oplus.aiunit.vision.wq8;
import com.oplus.health.apiprovider.ClientManager;
import io.protostuff.MapSchema;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0002R\u001b\u0010\u000f\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/watch/commonsync/service/CommonSyncTransportApi;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/health/watch/commonsync/aidl/ICommonSyncTransport;", "Lcom/heytap/health/watch/commonsync/aidl/ICommonSyncTransport$Stub;", b2n.f, "Landroid/content/Context;", "context", "", "c", "b", LogFieldKey.LEVEL_KEY, "i", "Lkotlin/Lazy;", "f", "()Lcom/heytap/health/watch/commonsync/aidl/ICommonSyncTransport$Stub;", "mBinder", "<init>", "()V", "Companion", "commonsync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class CommonSyncTransportApi implements cm9<ICommonSyncTransport> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy mBinder = LazyKt__LazyJVMKt.lazy(new Function0<CommonSyncTransportApi$mBinder$2.AnonymousClass1>() { // from class: com.heytap.health.watch.commonsync.service.CommonSyncTransportApi$mBinder$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.heytap.health.watch.commonsync.service.CommonSyncTransportApi$mBinder$2$1] */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final AnonymousClass1 invoke() {
            final CommonSyncTransportApi commonSyncTransportApi = this.this$0;
            return new ICommonSyncTransport.Stub() { // from class: com.heytap.health.watch.commonsync.service.CommonSyncTransportApi$mBinder$2.1
                @Override // com.heytap.health.watch.commonsync.aidl.ICommonSyncTransport
                public void onActionTimeChanged() {
                    a7b.f("CommonSyncTransportApi", "onActionTimeChanged");
                    commonSyncTransportApi.l();
                    TransportSyncMessageManager.INSTANCE.f(1);
                }

                @Override // com.heytap.health.watch.commonsync.aidl.ICommonSyncTransport
                public void onActionTimeZoneChanged() {
                    a7b.f("CommonSyncTransportApi", "onActionTimeZoneChanged");
                    commonSyncTransportApi.l();
                    TransportSyncMessageManager.INSTANCE.f(1);
                }

                @Override // com.heytap.health.watch.commonsync.aidl.ICommonSyncTransport
                public void onLocaleChanged() {
                    TransportSyncMessageManager.INSTANCE.e();
                }

                @Override // com.heytap.health.watch.commonsync.aidl.ICommonSyncTransport
                public void onTimeChangedFromOOBE(boolean isTimeZoneChange, int syncType) {
                    a7b.f("CommonSyncTransportApi", "onTimeChangedFromOOBE --> oobe time sync start,  timezone=" + isTimeZoneChange + ", syncType=" + syncType);
                    TransportSyncMessageManager.INSTANCE.f(syncType);
                }
            };
        }
    });

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\b\u0010\f\u001a\u00020\u0004H\u0007R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/watch/commonsync/service/CommonSyncTransportApi$Companion;", "", "Lcom/heytap/health/watch/commonsync/aidl/ICommonSyncTransport;", "b", "", "d", MapSchema.FIELD_NAME_ENTRY, "", "isTimeZoneChange", "", "syncType", b2n.f, "f", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "commonsync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final ICommonSyncTransport c(IBinder iBinder) {
            return ICommonSyncTransport.Stub.asInterface(iBinder);
        }

        @JvmStatic
        @Nullable
        public final ICommonSyncTransport b() {
            return (ICommonSyncTransport) ClientManager.getInstance().getBuildService("api_provider_common_sync", new ClientManager.a() { // from class: com.oplus.aiunit.vision.ep3
                @Override // com.oplus.health.apiprovider.ClientManager.a
                public final Object a(IBinder iBinder) {
                    return CommonSyncTransportApi.Companion.c(iBinder);
                }
            });
        }

        @JvmStatic
        public final void d() {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new CommonSyncTransportApi$Companion$onActionTimeChanged$1(null), 3, null);
        }

        @JvmStatic
        public final void e() {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new CommonSyncTransportApi$Companion$onActionTimeZoneChanged$1(null), 3, null);
        }

        @JvmStatic
        public final void f() {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new CommonSyncTransportApi$Companion$onLocaleChanged$1(null), 3, null);
        }

        @JvmStatic
        public final void g(boolean isTimeZoneChange, int syncType) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new CommonSyncTransportApi$Companion$onTimeChangedFromOOBE$1(isTimeZoneChange, syncType, null), 3, null);
        }
    }

    @JvmStatic
    public static final void h() {
        INSTANCE.d();
    }

    @JvmStatic
    public static final void i() {
        INSTANCE.e();
    }

    @JvmStatic
    public static final void j() {
        INSTANCE.f();
    }

    @JvmStatic
    public static final void k(boolean z, int i) {
        INSTANCE.g(z, i);
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final ICommonSyncTransport.Stub f() {
        return (ICommonSyncTransport.Stub) this.mBinder.getValue();
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ICommonSyncTransport.Stub d() {
        return f();
    }

    public final void l() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e2) {
            a7b.b("CommonSyncTransportApi", "[sleep] --> " + e2.getMessage());
        }
    }
}
