package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteCallbackList;
import com.heytap.health.connect.rawapi.IHRunModeListener;
import com.oplus.wearable.linkservice.sdk.Node;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/upa;", "Lcom/oplus/aiunit/vision/spa;", "Lcom/heytap/health/connect/rawapi/IHRunModeListener;", "listener", "", "d", b2n.f, "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "", "preMode", "currentMode", MapSchema.FIELD_NAME_ENTRY, "Landroid/os/RemoteCallbackList;", "Landroid/os/RemoteCallbackList;", "mRunModeCbHolder", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "lib_heytapconnect_impl_release"}, k = 1, mv = {1, 8, 0})
public class upa extends spa {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final RemoteCallbackList<IHRunModeListener> mRunModeCbHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upa(@NotNull Context mContext) {
        super(mContext);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mRunModeCbHolder = new RemoteCallbackList<>();
    }

    public static final void f(upa this$0, Node node, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(node, "$node");
        int iBeginBroadcast = this$0.mRunModeCbHolder.beginBroadcast();
        for (int i3 = 0; i3 < iBeginBroadcast; i3++) {
            try {
                ((IHRunModeListener) this$0.mRunModeCbHolder.getBroadcastItem(i3)).onRunModeChanged(node, i, i2);
            } catch (Exception e2) {
                wil.k(q43.INSTANCE.getTAG(), "notifyRunModeChanged: ex " + e2);
            }
        }
        this$0.mRunModeCbHolder.finishBroadcast();
    }

    public final void d(@NotNull IHRunModeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        wil.d(getTAG(), "addRunModeListener: " + Binder.getCallingPid() + " " + listener.asBinder());
        this.mRunModeCbHolder.register(listener);
    }

    public final void e(@NotNull final Node node, final int preMode, final int currentMode) {
        Intrinsics.checkNotNullParameter(node, "node");
        getMDispatch().submit(new Runnable() { // from class: com.oplus.aiunit.vision.tpa
            @Override // java.lang.Runnable
            public final void run() {
                upa.f(this.i, node, preMode, currentMode);
            }
        });
    }

    public final void g(@NotNull IHRunModeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        wil.d(getTAG(), "removeRunModeListener: " + Binder.getCallingPid() + " " + listener.asBinder());
        this.mRunModeCbHolder.unregister(listener);
    }
}
