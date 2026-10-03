package com.heytap.health.watch.records.viewmodel;

import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.MutableLiveData;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.watch.records.bean.RecordFileTaskInfo;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\"\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\f\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR*\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR*\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u000fR*\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/heytap/health/watch/records/viewmodel/RecordChangedViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "nodeId", LogSenderConst.FILENAME, "", "fileId", "", "z", "Lcom/heytap/health/watch/records/bean/RecordFileTaskInfo;", "taskInfo", "A", "y", "Landroidx/lifecycle/MutableLiveData;", "j", "Landroidx/lifecycle/MutableLiveData;", "_fileTaskInfoData", MapSchema.FIELD_NAME_KEY, "x", "()Landroidx/lifecycle/MutableLiveData;", "setFileTaskInfoData", "(Landroidx/lifecycle/MutableLiveData;)V", "fileTaskInfoData", LogFieldKey.LEVEL_KEY, "_fileDeletedInfoData", LogFieldKey.MESSAGE_KEY, "w", "setFileDeletedInfoData", "fileDeletedInfoData", "n", "_autoSyncData", "o", "v", "setAutoSyncData", "autoSyncData", "<init>", "()V", "recordfilemanager_impl_release"}, k = 1, mv = {1, 8, 0})
public final class RecordChangedViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<RecordFileTaskInfo> _fileTaskInfoData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public MutableLiveData<RecordFileTaskInfo> fileTaskInfoData;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<RecordFileTaskInfo> _fileDeletedInfoData;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public MutableLiveData<RecordFileTaskInfo> fileDeletedInfoData;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<String> _autoSyncData;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public MutableLiveData<String> autoSyncData;

    public RecordChangedViewModel() {
        MutableLiveData<RecordFileTaskInfo> mutableLiveData = new MutableLiveData<>();
        this._fileTaskInfoData = mutableLiveData;
        this.fileTaskInfoData = mutableLiveData;
        MutableLiveData<RecordFileTaskInfo> mutableLiveData2 = new MutableLiveData<>();
        this._fileDeletedInfoData = mutableLiveData2;
        this.fileDeletedInfoData = mutableLiveData2;
        MutableLiveData<String> mutableLiveData3 = new MutableLiveData<>();
        this._autoSyncData = mutableLiveData3;
        this.autoSyncData = mutableLiveData3;
    }

    public final void A(@Nullable RecordFileTaskInfo taskInfo) {
        this.fileTaskInfoData.postValue(taskInfo);
    }

    @NotNull
    public final MutableLiveData<String> v() {
        return this.autoSyncData;
    }

    @NotNull
    public final MutableLiveData<RecordFileTaskInfo> w() {
        return this.fileDeletedInfoData;
    }

    @NotNull
    public final MutableLiveData<RecordFileTaskInfo> x() {
        return this.fileTaskInfoData;
    }

    public final void y(@Nullable String nodeId) {
        this.autoSyncData.postValue(nodeId);
    }

    public final void z(@Nullable String nodeId, @Nullable String fileName, long fileId) {
        RecordFileTaskInfo recordFileTaskInfo = new RecordFileTaskInfo(null, 0, null, null, 0, 0, false, null, 0L, FrameMetricsAggregator.EVERY_DURATION, null);
        recordFileTaskInfo.setNodeId(nodeId);
        recordFileTaskInfo.setFileName(fileName);
        recordFileTaskInfo.setFileId(fileId);
        this.fileDeletedInfoData.postValue(recordFileTaskInfo);
    }
}
