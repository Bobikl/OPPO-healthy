package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteCallbackList;
import com.heytap.health.connect.rawapi.IHFileListener;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/fqa;", "Lcom/oplus/aiunit/vision/bqa;", "Lcom/heytap/health/connect/rawapi/IHFileListener;", "listener", "", "H", "O", "Lcom/oplus/wearable/linkservice/sdk/internal/file/FileTransferTask;", "task", "M", "K", "I", "Landroid/os/RemoteCallbackList;", MapSchema.FIELD_NAME_KEY, "Landroid/os/RemoteCallbackList;", "mFileCbHolder", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "lib_heytapconnect_impl_release"}, k = 1, mv = {1, 8, 0})
public class fqa extends bqa {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final RemoteCallbackList<IHFileListener> mFileCbHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqa(@NotNull Context mContext) {
        super(mContext);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mFileCbHolder = new RemoteCallbackList<>();
    }

    public static final void J(fqa this$0, FileTransferTask task) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(task, "$task");
        int iBeginBroadcast = this$0.mFileCbHolder.beginBroadcast();
        for (int i = 0; i < iBeginBroadcast; i++) {
            try {
                ((IHFileListener) this$0.mFileCbHolder.getBroadcastItem(i)).onTransferComplete(task);
            } catch (Exception e2) {
                wil.k(q43.INSTANCE.getTAG(), "notifyTransferComplete: ex " + e2);
            }
        }
        this$0.mFileCbHolder.finishBroadcast();
    }

    public static final void L(fqa this$0, FileTransferTask task) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(task, "$task");
        int iBeginBroadcast = this$0.mFileCbHolder.beginBroadcast();
        for (int i = 0; i < iBeginBroadcast; i++) {
            try {
                ((IHFileListener) this$0.mFileCbHolder.getBroadcastItem(i)).onTransferProgress(task);
            } catch (Exception e2) {
                wil.k(q43.INSTANCE.getTAG(), "notifyTransferProgress: ex " + e2);
            }
        }
        this$0.mFileCbHolder.finishBroadcast();
    }

    public static final void N(fqa this$0, FileTransferTask task) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(task, "$task");
        int iBeginBroadcast = this$0.mFileCbHolder.beginBroadcast();
        for (int i = 0; i < iBeginBroadcast; i++) {
            try {
                ((IHFileListener) this$0.mFileCbHolder.getBroadcastItem(i)).onTransferRequested(task);
            } catch (Exception e2) {
                wil.k(q43.INSTANCE.getTAG(), "notifyTransferRequested: ex " + e2);
            }
        }
        this$0.mFileCbHolder.finishBroadcast();
    }

    public final void H(@NotNull IHFileListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        wil.d(getTAG(), "addFileListener: " + Binder.getCallingPid() + " " + listener.asBinder());
        this.mFileCbHolder.register(listener);
    }

    public final void I(@NotNull final FileTransferTask task) {
        Intrinsics.checkNotNullParameter(task, "task");
        getMDispatch().submit(new Runnable() { // from class: com.oplus.aiunit.vision.eqa
            @Override // java.lang.Runnable
            public final void run() {
                fqa.J(this.i, task);
            }
        });
    }

    public final void K(@NotNull final FileTransferTask task) {
        Intrinsics.checkNotNullParameter(task, "task");
        getMDispatch().submit(new Runnable() { // from class: com.oplus.aiunit.vision.dqa
            @Override // java.lang.Runnable
            public final void run() {
                fqa.L(this.i, task);
            }
        });
    }

    public final void M(@NotNull final FileTransferTask task) {
        Intrinsics.checkNotNullParameter(task, "task");
        getMDispatch().submit(new Runnable() { // from class: com.oplus.aiunit.vision.cqa
            @Override // java.lang.Runnable
            public final void run() {
                fqa.N(this.i, task);
            }
        });
    }

    public final void O(@NotNull IHFileListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        wil.d(getTAG(), "removeFileListener: " + Binder.getCallingPid() + " " + listener.asBinder());
        this.mFileCbHolder.unregister(listener);
    }
}
