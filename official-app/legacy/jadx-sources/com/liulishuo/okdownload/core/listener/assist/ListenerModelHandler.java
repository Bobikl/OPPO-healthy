package com.liulishuo.okdownload.core.listener.assist;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.SparseArray;
import com.liulishuo.okdownload.DownloadTask;
import com.liulishuo.okdownload.core.breakpoint.BreakpointInfo;
import com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ListenerModel;

/* JADX INFO: loaded from: classes5.dex */
public class ListenerModelHandler<T extends ListenerModel> implements ListenerAssist {
    private Boolean alwaysRecoverModel;
    private final ModelCreator<T> creator;
    final SparseArray<T> modelList = new SparseArray<>();
    volatile T singleTaskModel;

    public interface ListenerModel {
        int getId();

        void onInfoValid(@NonNull BreakpointInfo breakpointInfo);
    }

    public interface ModelCreator<T extends ListenerModel> {
        T create(int i);
    }

    public ListenerModelHandler(ModelCreator<T> modelCreator) {
        this.creator = modelCreator;
    }

    @NonNull
    public T addAndGetModel(@NonNull DownloadTask downloadTask, @Nullable BreakpointInfo breakpointInfo) {
        T t = (T) this.creator.create(downloadTask.getId());
        synchronized (this) {
            if (this.singleTaskModel == null) {
                this.singleTaskModel = t;
            } else {
                this.modelList.put(downloadTask.getId(), t);
            }
            if (breakpointInfo != null) {
                t.onInfoValid(breakpointInfo);
            }
        }
        return t;
    }

    @Nullable
    public T getOrRecoverModel(@NonNull DownloadTask downloadTask, @Nullable BreakpointInfo breakpointInfo) {
        T t;
        int id = downloadTask.getId();
        synchronized (this) {
            t = (this.singleTaskModel == null || this.singleTaskModel.getId() != id) ? null : this.singleTaskModel;
        }
        if (t == null) {
            t = this.modelList.get(id);
        }
        return (t == null && isAlwaysRecoverAssistModel()) ? (T) addAndGetModel(downloadTask, breakpointInfo) : t;
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.ListenerAssist
    public boolean isAlwaysRecoverAssistModel() {
        Boolean bool = this.alwaysRecoverModel;
        return bool != null && bool.booleanValue();
    }

    @NonNull
    public T removeOrCreate(@NonNull DownloadTask downloadTask, @Nullable BreakpointInfo breakpointInfo) {
        T t;
        int id = downloadTask.getId();
        synchronized (this) {
            if (this.singleTaskModel == null || this.singleTaskModel.getId() != id) {
                t = this.modelList.get(id);
                this.modelList.remove(id);
            } else {
                t = this.singleTaskModel;
                this.singleTaskModel = null;
            }
        }
        if (t == null) {
            t = (T) this.creator.create(id);
            if (breakpointInfo != null) {
                t.onInfoValid(breakpointInfo);
            }
        }
        return t;
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.ListenerAssist
    public void setAlwaysRecoverAssistModel(boolean z) {
        this.alwaysRecoverModel = Boolean.valueOf(z);
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.ListenerAssist
    public void setAlwaysRecoverAssistModelIfNotSet(boolean z) {
        if (this.alwaysRecoverModel == null) {
            this.alwaysRecoverModel = Boolean.valueOf(z);
        }
    }
}
