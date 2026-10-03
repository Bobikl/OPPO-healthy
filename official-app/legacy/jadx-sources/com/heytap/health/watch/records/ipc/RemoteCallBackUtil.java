package com.heytap.health.watch.records.ipc;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import androidx.core.app.FrameMetricsAggregator;
import com.heytap.health.watch.records.IRecordFileSyncListener;
import com.heytap.health.watch.records.bean.RecordFileTaskInfo;
import com.heytap.log.consts.LogSenderConst;
import com.oplus.aiunit.vision.mc7;
import com.oplus.aiunit.vision.pwf;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u0007\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003J\u001c\u0010\b\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003J$\u0010\r\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ,\u0010\u0011\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tJ\u001c\u0010\u0012\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u000eJ2\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0014H\u0002R\u0014\u0010\u0017\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/watch/records/ipc/RemoteCallBackUtil;", "", "Landroid/os/RemoteCallbackList;", "Lcom/heytap/health/watch/records/IRecordFileSyncListener;", "statusListeners", "listener", "", MapSchema.FIELD_NAME_ENTRY, "f", "", "fileId", "Lcom/oplus/aiunit/vision/mc7;", "fileTaskInfo", "d", "", "nodeId", LogSenderConst.FILENAME, "b", "c", "tag", "Lkotlin/Function1;", "callback", "a", "TAG", "Ljava/lang/String;", "<init>", "()V", "recordfilemanager_impl_release"}, k = 1, mv = {1, 8, 0})
public final class RemoteCallBackUtil {

    @NotNull
    public static final RemoteCallBackUtil INSTANCE = new RemoteCallBackUtil();

    @NotNull
    public static final String TAG = "RemoteListener";

    public final void a(String tag, RemoteCallbackList<IRecordFileSyncListener> statusListeners, Function1<? super IRecordFileSyncListener, Unit> callback) {
        try {
            int iBeginBroadcast = statusListeners.beginBroadcast();
            pwf.d(TAG, tag + " listener count " + iBeginBroadcast + " ");
            for (int i = 0; i < iBeginBroadcast; i++) {
                IInterface broadcastItem = statusListeners.getBroadcastItem(i);
                Intrinsics.checkNotNullExpressionValue(broadcastItem, "statusListeners.getBroadcastItem(index)");
                callback.invoke(broadcastItem);
            }
            statusListeners.finishBroadcast();
        } catch (Exception e2) {
            pwf.b(TAG, tag + ":" + e2.getMessage());
        }
    }

    public final void b(@NotNull RemoteCallbackList<IRecordFileSyncListener> statusListeners, @NotNull final String nodeId, @NotNull final String fileName, final long fileId) {
        Intrinsics.checkNotNullParameter(statusListeners, "statusListeners");
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        a("notifyRecordDeleted", statusListeners, new Function1<IRecordFileSyncListener, Unit>() { // from class: com.heytap.health.watch.records.ipc.RemoteCallBackUtil$notifyRecordDeleted$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IRecordFileSyncListener iRecordFileSyncListener) throws RemoteException {
                invoke2(iRecordFileSyncListener);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IRecordFileSyncListener recordFileSyncListener) throws RemoteException {
                Intrinsics.checkNotNullParameter(recordFileSyncListener, "recordFileSyncListener");
                recordFileSyncListener.onRecordDeleted(nodeId, fileName, fileId);
            }
        });
    }

    public final void c(@NotNull RemoteCallbackList<IRecordFileSyncListener> statusListeners, @NotNull final String nodeId) {
        Intrinsics.checkNotNullParameter(statusListeners, "statusListeners");
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        a("notifyStartAutoSync", statusListeners, new Function1<IRecordFileSyncListener, Unit>() { // from class: com.heytap.health.watch.records.ipc.RemoteCallBackUtil$notifyStartAutoSync$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IRecordFileSyncListener iRecordFileSyncListener) throws RemoteException {
                invoke2(iRecordFileSyncListener);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IRecordFileSyncListener recordFileSyncListener) throws RemoteException {
                Intrinsics.checkNotNullParameter(recordFileSyncListener, "recordFileSyncListener");
                recordFileSyncListener.onStartAutoSync(nodeId);
            }
        });
    }

    public final void d(@NotNull RemoteCallbackList<IRecordFileSyncListener> statusListeners, final long fileId, @NotNull final mc7 fileTaskInfo) {
        Intrinsics.checkNotNullParameter(statusListeners, "statusListeners");
        Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
        a("notifyStatusChanged", statusListeners, new Function1<IRecordFileSyncListener, Unit>() { // from class: com.heytap.health.watch.records.ipc.RemoteCallBackUtil$notifyStatusChanged$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IRecordFileSyncListener iRecordFileSyncListener) throws RemoteException {
                invoke2(iRecordFileSyncListener);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IRecordFileSyncListener recordFileSyncListener) throws RemoteException {
                Intrinsics.checkNotNullParameter(recordFileSyncListener, "recordFileSyncListener");
                RecordFileTaskInfo recordFileTaskInfo = new RecordFileTaskInfo(null, 0, null, null, 0, 0, false, null, 0L, FrameMetricsAggregator.EVERY_DURATION, null);
                recordFileTaskInfo.setErrorCode(fileTaskInfo.a());
                recordFileTaskInfo.setFileName(fileTaskInfo.b());
                recordFileTaskInfo.setFileId(fileId);
                recordFileTaskInfo.setProgress(fileTaskInfo.f());
                recordFileTaskInfo.setFileSize(Math.toIntExact(fileTaskInfo.c()));
                recordFileTaskInfo.setTaskId(fileTaskInfo.h());
                recordFileTaskInfo.setNodeId(fileTaskInfo.e());
                recordFileTaskInfo.setReceiveTask(fileTaskInfo.j());
                recordFileSyncListener.onStatusChanged(recordFileTaskInfo);
            }
        });
    }

    public final void e(@NotNull RemoteCallbackList<IRecordFileSyncListener> statusListeners, @NotNull IRecordFileSyncListener listener) {
        Intrinsics.checkNotNullParameter(statusListeners, "statusListeners");
        Intrinsics.checkNotNullParameter(listener, "listener");
        pwf.a(TAG, "register listener " + listener);
        statusListeners.register(listener);
    }

    public final void f(@NotNull RemoteCallbackList<IRecordFileSyncListener> statusListeners, @NotNull IRecordFileSyncListener listener) {
        Intrinsics.checkNotNullParameter(statusListeners, "statusListeners");
        Intrinsics.checkNotNullParameter(listener, "listener");
        pwf.a(TAG, "unregister listener " + listener);
        statusListeners.unregister(listener);
    }
}
