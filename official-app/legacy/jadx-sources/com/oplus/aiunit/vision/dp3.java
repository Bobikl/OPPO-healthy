package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.ArraySet;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.watch.commonsync.messagehandler.timehandler.TimeSyncWorker;
import com.heytap.health.watch.commonsync.receiver.OOBEReceiver;
import com.heytap.health.watch.commonsync.service.CommonSyncMainApi;
import com.oplus.wearable.linkservice.sdk.Node;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/dp3;", "", "Landroid/content/Context;", "context", "", "b", "d", "<init>", "()V", "commonsync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class dp3 {

    @NotNull
    public static final dp3 INSTANCE = new dp3();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "result", "", "a", "(Z)V"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements o14 {
        public static final a<T> INSTANCE = new a<>();

        public final void a(boolean z) {
            TimeSyncWorker.INSTANCE.b(z);
        }

        @Override // com.oplus.aiunit.vision.o14
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            a(((Boolean) obj).booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b<T> implements o14 {
        public static final b<T> INSTANCE = new b<>();

        @Override // com.oplus.aiunit.vision.o14
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            a7b.b("CommonSyncApp", "[initInMain] --> " + error.getMessage());
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/oplus/aiunit/vision/dp3$c", "Lcom/oplus/aiunit/vision/vi5;", "", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "list", "Lcom/oplus/aiunit/vision/sjk;", "updateType", "", "H2", "commonsync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements vi5 {
        @Override // com.oplus.aiunit.vision.vi5
        public void H2(@NotNull List<? extends UserDeviceInfo> list, @NotNull sjk updateType) {
            Intrinsics.checkNotNullParameter(list, "list");
            Intrinsics.checkNotNullParameter(updateType, "updateType");
            a7b.f("CommonSyncApp", "initInTransport: " + list.size());
            CommonSyncMainApi.INSTANCE.b(list.isEmpty() ^ true);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016¨\u0006\u000b"}, d2 = {"com/oplus/aiunit/vision/dp3$d", "Lcom/oplus/aiunit/vision/ul4$b;", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "Lcom/oplus/aiunit/vision/auc;", "nodeStatus", "", "d", "Landroid/util/ArraySet;", "interests", "getInterestingStatus", "commonsync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class d implements ul4.b {
        @Override // com.oplus.aiunit.vision.ul4.b
        public void d(@NotNull Node node, @NotNull auc nodeStatus) {
            Intrinsics.checkNotNullParameter(node, "node");
            Intrinsics.checkNotNullParameter(nodeStatus, "nodeStatus");
            a7b.f("CommonSyncApp", "onNodeStatusChanged: " + nodeStatus);
            if (nodeStatus == auc.a.INSTANCE) {
                CommonSyncMainApi.INSTANCE.b(true);
            }
        }

        @Override // com.oplus.aiunit.vision.ul4.b
        public void getInterestingStatus(@NotNull ArraySet<auc> interests) {
            Intrinsics.checkNotNullParameter(interests, "interests");
            interests.add(auc.a.INSTANCE);
        }
    }

    @JvmStatic
    @SuppressLint({"CheckResult"})
    public static final void b(@Nullable final Context context) {
        lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.cp3
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) {
                dp3.c(context, ccdVar);
            }
        }).A(300L, TimeUnit.SECONDS).L0(su8.c()).n0(su8.c()).b(a.INSTANCE, b.INSTANCE);
    }

    public static final void c(Context context, ccd emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        OOBEReceiver.a(context);
        List<UserDeviceInfo> boundDeviceInfos = gl4.managerApi.getBoundDeviceInfos();
        a7b.m("CommonSyncApp", "[initInMain] --> " + boundDeviceInfos.size());
        emitter.onNext(Boolean.valueOf(boundDeviceInfos.isEmpty() ^ true));
        emitter.onComplete();
    }

    @JvmStatic
    public static final void d() {
        tx3.b();
        gl4.managerApi.h(new c());
        gl4.devicePrimary.nodeApi.l(new d());
    }
}
