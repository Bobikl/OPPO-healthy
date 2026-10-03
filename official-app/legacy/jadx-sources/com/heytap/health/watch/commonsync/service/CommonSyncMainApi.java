package com.heytap.health.watch.commonsync.service;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.heytap.health.watch.commonsync.aidl.ICommonSyncMain;
import com.heytap.health.watch.commonsync.messagehandler.timehandler.TimeSyncWorker;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.cm9;
import com.oplus.aiunit.vision.wq8;
import io.protostuff.MapSchema;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/watch/commonsync/service/CommonSyncMainApi;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/health/watch/commonsync/aidl/ICommonSyncMain;", "f", "Landroid/content/Context;", "context", "", "c", "b", "Lcom/heytap/health/watch/commonsync/aidl/ICommonSyncMain$Stub;", "i", "Lkotlin/Lazy;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/heytap/health/watch/commonsync/aidl/ICommonSyncMain$Stub;", "mBinder", "<init>", "()V", "Companion", "commonsync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class CommonSyncMainApi implements cm9<ICommonSyncMain> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy mBinder = LazyKt__LazyJVMKt.lazy(new Function0<CommonSyncMainApi$mBinder$2.AnonymousClass1>() { // from class: com.heytap.health.watch.commonsync.service.CommonSyncMainApi$mBinder$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Type inference failed for: r0v1, types: [com.heytap.health.watch.commonsync.service.CommonSyncMainApi$mBinder$2$1] */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final AnonymousClass1 invoke() {
            return new ICommonSyncMain.Stub() { // from class: com.heytap.health.watch.commonsync.service.CommonSyncMainApi$mBinder$2.1
                @Override // com.heytap.health.watch.commonsync.aidl.ICommonSyncMain
                public void oobeSyncFinish(int cid, boolean result) {
                    a7b.f("CommonSyncMainApi", "oobeSyncFinish cid " + cid + " result " + result);
                    Intent intent = new Intent("com.op.smartwear.public.wearable.RECEIVER");
                    if (5 == cid) {
                        intent.putExtra("native_sync_action", "com.op.smartwear.native.time.RECEIVER");
                    }
                    intent.putExtra("native_sync_result", result);
                    LocalBroadcastManager.getInstance(b78.a()).sendBroadcast(intent);
                }

                @Override // com.heytap.health.watch.commonsync.aidl.ICommonSyncMain
                public void startTimeSyncWorker(boolean hasDevices) {
                    TimeSyncWorker.INSTANCE.b(hasDevices);
                }
            };
        }
    });

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/watch/commonsync/service/CommonSyncMainApi$Companion;", "", "", "cid", "", "result", "", "a", "hasDevices", "b", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "commonsync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void a(int cid, boolean result) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new CommonSyncMainApi$Companion$oobeSyncFinish$1(cid, result, null), 3, null);
        }

        @JvmStatic
        public final void b(boolean hasDevices) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new CommonSyncMainApi$Companion$startTimeSyncWorker$1(hasDevices, null), 3, null);
        }
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final ICommonSyncMain.Stub e() {
        return (ICommonSyncMain.Stub) this.mBinder.getValue();
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ICommonSyncMain d() {
        return e();
    }
}
