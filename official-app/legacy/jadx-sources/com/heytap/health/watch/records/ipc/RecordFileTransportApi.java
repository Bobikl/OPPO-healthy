package com.heytap.health.watch.records.ipc;

import android.content.Context;
import android.os.RemoteException;
import com.heytap.accessory.file.model.Constant;
import com.heytap.health.watch.records.IRecordFileSync;
import com.heytap.health.watch.records.IRecordFileSyncListener;
import com.heytap.health.watch.records.manager.RecordFileSyncManager;
import com.heytap.log.consts.LogSenderConst;
import com.oplus.aiunit.vision.RecordFileDbBean;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.cm9;
import com.oplus.aiunit.vision.pwf;
import io.protostuff.MapSchema;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/watch/records/ipc/RecordFileTransportApi;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/health/watch/records/IRecordFileSync;", "Landroid/content/Context;", "context", "", "c", "f", "b", "Lcom/heytap/health/watch/records/IRecordFileSync$Stub;", "i", "Lkotlin/Lazy;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/heytap/health/watch/records/IRecordFileSync$Stub;", "mBinder", "<init>", "()V", "Companion", "recordfilemanager_impl_release"}, k = 1, mv = {1, 8, 0})
public final class RecordFileTransportApi implements cm9<IRecordFileSync> {

    @NotNull
    public static final String API_PROVIDER_RECORD_TRANSPORT = "api_record_file_transport_provider";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "RecordFileTransportApi";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy mBinder = LazyKt__LazyJVMKt.lazy(new Function0<RecordFileTransportApi$mBinder$2.AnonymousClass1>() { // from class: com.heytap.health.watch.records.ipc.RecordFileTransportApi$mBinder$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Type inference failed for: r0v1, types: [com.heytap.health.watch.records.ipc.RecordFileTransportApi$mBinder$2$1] */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final AnonymousClass1 invoke() {
            return new IRecordFileSync.Stub() { // from class: com.heytap.health.watch.records.ipc.RecordFileTransportApi$mBinder$2.1
                @Override // com.heytap.health.watch.records.IRecordFileSync
                public void addSyncListener(@Nullable IRecordFileSyncListener listener) {
                    if (listener != null) {
                        RecordFileSyncManager.INSTANCE.l(listener);
                    }
                }

                @Override // com.heytap.health.watch.records.IRecordFileSync
                public void cancelAllTask() {
                    RecordFileSyncManager.INSTANCE.n();
                }

                @Override // com.heytap.health.watch.records.IRecordFileSync
                public void cancelTaskAndContinueNext(@Nullable String nodeId, @Nullable String taskId, long fileId, boolean isNext) {
                    RecordFileSyncManager.INSTANCE.o(nodeId, taskId, fileId, isNext);
                }

                @Override // com.heytap.health.watch.records.IRecordFileSync
                @Nullable
                public boolean[] isPendingInTask(@Nullable long[] fileIds) {
                    List<Boolean> listT;
                    if (fileIds == null || (listT = RecordFileSyncManager.INSTANCE.t(ArraysKt___ArraysKt.toList(fileIds))) == null) {
                        return null;
                    }
                    return CollectionsKt___CollectionsKt.toBooleanArray(listT);
                }

                @Override // com.heytap.health.watch.records.IRecordFileSync
                public boolean isTaskIdle() {
                    return RecordFileSyncManager.INSTANCE.v();
                }

                @Override // com.heytap.health.watch.records.IRecordFileSync
                public void removeSyncListener(@Nullable IRecordFileSyncListener listener) {
                    if (listener != null) {
                        RecordFileSyncManager.INSTANCE.D(listener);
                    }
                }

                @Override // com.heytap.health.watch.records.IRecordFileSync
                public void requestRecordFileInfo(@Nullable String fileName, long fileId, long timestamp, int fileSize, @NotNull String fileMd5) {
                    Intrinsics.checkNotNullParameter(fileMd5, "fileMd5");
                    RecordFileSyncManager recordFileSyncManager = RecordFileSyncManager.INSTANCE;
                    RecordFileDbBean.Companion companion = RecordFileDbBean.INSTANCE;
                    Intrinsics.checkNotNull(fileName);
                    recordFileSyncManager.i(companion.b(fileName, fileId, fileSize, timestamp, fileMd5), false);
                }
            };
        }
    });

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J0\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0007J,\u0010\u0015\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00040\u0012H\u0007J\u001e\u0010\u0017\u001a\u00020\u00042\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00040\u0012H\u0007J\"\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u001b\u001a\u00020\u0004H\u0007J\u0018\u0010\u001e\u001a\u00020\u00042\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001cH\u0002R\u0014\u0010\u001f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006$"}, d2 = {"Lcom/heytap/health/watch/records/ipc/RecordFileTransportApi$Companion;", "", "Lcom/heytap/health/watch/records/IRecordFileSyncListener;", "listener", "", "b", b2n.f, "", LogSenderConst.FILENAME, "", "fileId", "timestamp", "", Constant.FILE_SIZE, "fileMd5", b2n.g, "", "fileIds", "Lkotlin/Function1;", "", "callback", MapSchema.FIELD_NAME_ENTRY, "", "f", "nodeId", "taskId", "d", "c", "Lkotlin/Function0;", "block", "i", "API_PROVIDER_RECORD_TRANSPORT", "Ljava/lang/String;", "TAG", "<init>", "()V", "recordfilemanager_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void b(@NotNull IRecordFileSyncListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            pwf.d(RecordFileTransportApi.TAG, "addSyncListener  " + listener);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new RecordFileTransportApi$Companion$addSyncListener$1(listener, null), 3, null);
        }

        @JvmStatic
        public final void c() {
            pwf.d(RecordFileTransportApi.TAG, "cancelAllTask");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new RecordFileTransportApi$Companion$cancelAllTask$1(null), 3, null);
        }

        @JvmStatic
        public final void d(@NotNull String nodeId, @Nullable String taskId, long fileId) {
            Intrinsics.checkNotNullParameter(nodeId, "nodeId");
            pwf.d(RecordFileTransportApi.TAG, "cancelTaskAndContinueNext taskId " + taskId + " fileId " + fileId);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new RecordFileTransportApi$Companion$cancelTaskAndContinueNext$1(nodeId, taskId, fileId, null), 3, null);
        }

        @JvmStatic
        public final void e(@NotNull List<Long> fileIds, @NotNull Function1<? super boolean[], Unit> callback) {
            Intrinsics.checkNotNullParameter(fileIds, "fileIds");
            Intrinsics.checkNotNullParameter(callback, "callback");
            pwf.d(RecordFileTransportApi.TAG, "isPendingTask fileIds " + fileIds);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new RecordFileTransportApi$Companion$isPendingTask$1(callback, fileIds, null), 3, null);
        }

        @JvmStatic
        public final void f(@NotNull Function1<? super Boolean, Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new RecordFileTransportApi$Companion$isTaskIdle$1(callback, null), 3, null);
        }

        @JvmStatic
        public final void g(@NotNull IRecordFileSyncListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            pwf.d(RecordFileTransportApi.TAG, "removeSyncListener " + listener);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new RecordFileTransportApi$Companion$removeSyncListener$1(listener, null), 3, null);
        }

        @JvmStatic
        public final void h(@NotNull String fileName, long fileId, long timestamp, int fileSize, @NotNull String fileMd5) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(fileMd5, "fileMd5");
            pwf.d(RecordFileTransportApi.TAG, "requestRecordFileInfo fileName " + fileName + " fileId " + fileId);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new RecordFileTransportApi$Companion$requestRecordFileInfo$1(fileName, fileId, timestamp, fileSize, fileMd5, null), 3, null);
        }

        public final void i(Function0<? extends Object> block) {
            try {
                block.invoke();
            } catch (RemoteException e2) {
                pwf.b(RecordFileTransportApi.TAG, "tryRemoteException " + e2.getMessage());
            }
        }
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        pwf.d(TAG, "onDestroy");
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        pwf.d(TAG, "onCreate");
    }

    public final IRecordFileSync.Stub e() {
        return (IRecordFileSync.Stub) this.mBinder.getValue();
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public IRecordFileSync d() {
        return e();
    }
}
