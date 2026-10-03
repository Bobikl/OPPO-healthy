package com.liulishuo.okdownload.core.listener.assist;

import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.liulishuo.okdownload.DownloadTask;
import com.liulishuo.okdownload.core.breakpoint.BreakpointInfo;
import com.liulishuo.okdownload.core.cause.EndCause;
import com.liulishuo.okdownload.core.cause.ResumeFailedCause;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public class Listener1Assist implements ListenerAssist, ListenerModelHandler.ModelCreator<Listener1Model> {
    private Listener1Callback callback;
    private final ListenerModelHandler<Listener1Model> modelHandler;

    public interface Listener1Callback {
        void connected(@NonNull DownloadTask downloadTask, @IntRange(from = 0) int i, @IntRange(from = 0) long j2, @IntRange(from = 0) long j3);

        void progress(@NonNull DownloadTask downloadTask, @IntRange(from = 0) long j2, @IntRange(from = 0) long j3);

        void retry(@NonNull DownloadTask downloadTask, @NonNull ResumeFailedCause resumeFailedCause);

        void taskEnd(@NonNull DownloadTask downloadTask, @NonNull EndCause endCause, @Nullable Exception exc, @NonNull Listener1Model listener1Model);

        void taskStart(@NonNull DownloadTask downloadTask, @NonNull Listener1Model listener1Model);
    }

    public static class Listener1Model implements ListenerModelHandler.ListenerModel {
        int blockCount;
        final AtomicLong currentOffset = new AtomicLong();
        final int id;
        volatile Boolean isFirstConnect;
        Boolean isFromResumed;
        Boolean isStarted;
        long totalLength;

        public Listener1Model(int i) {
            this.id = i;
        }

        @Override // com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ListenerModel
        public int getId() {
            return this.id;
        }

        public long getTotalLength() {
            return this.totalLength;
        }

        @Override // com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ListenerModel
        public void onInfoValid(@NonNull BreakpointInfo breakpointInfo) {
            this.blockCount = breakpointInfo.getBlockCount();
            this.totalLength = breakpointInfo.getTotalLength();
            this.currentOffset.set(breakpointInfo.getTotalOffset());
            if (this.isStarted == null) {
                this.isStarted = Boolean.FALSE;
            }
            if (this.isFromResumed == null) {
                this.isFromResumed = Boolean.valueOf(this.currentOffset.get() > 0);
            }
            if (this.isFirstConnect == null) {
                this.isFirstConnect = Boolean.TRUE;
            }
        }
    }

    public Listener1Assist() {
        this.modelHandler = new ListenerModelHandler<>(this);
    }

    public void connectEnd(DownloadTask downloadTask) {
        Listener1Model listener1Model = (Listener1Model) this.modelHandler.getOrRecoverModel(downloadTask, downloadTask.getInfo());
        if (listener1Model == null) {
            return;
        }
        if (listener1Model.isFromResumed.booleanValue() && listener1Model.isFirstConnect.booleanValue()) {
            listener1Model.isFirstConnect = Boolean.FALSE;
        }
        Listener1Callback listener1Callback = this.callback;
        if (listener1Callback != null) {
            listener1Callback.connected(downloadTask, listener1Model.blockCount, listener1Model.currentOffset.get(), listener1Model.totalLength);
        }
    }

    public void downloadFromBeginning(DownloadTask downloadTask, @NonNull BreakpointInfo breakpointInfo, ResumeFailedCause resumeFailedCause) {
        Listener1Callback listener1Callback;
        Listener1Model listener1Model = (Listener1Model) this.modelHandler.getOrRecoverModel(downloadTask, breakpointInfo);
        if (listener1Model == null) {
            return;
        }
        listener1Model.onInfoValid(breakpointInfo);
        if (listener1Model.isStarted.booleanValue() && (listener1Callback = this.callback) != null) {
            listener1Callback.retry(downloadTask, resumeFailedCause);
        }
        Boolean bool = Boolean.TRUE;
        listener1Model.isStarted = bool;
        listener1Model.isFromResumed = Boolean.FALSE;
        listener1Model.isFirstConnect = bool;
    }

    public void downloadFromBreakpoint(DownloadTask downloadTask, @NonNull BreakpointInfo breakpointInfo) {
        Listener1Model listener1Model = (Listener1Model) this.modelHandler.getOrRecoverModel(downloadTask, breakpointInfo);
        if (listener1Model == null) {
            return;
        }
        listener1Model.onInfoValid(breakpointInfo);
        Boolean bool = Boolean.TRUE;
        listener1Model.isStarted = bool;
        listener1Model.isFromResumed = bool;
        listener1Model.isFirstConnect = bool;
    }

    public void fetchProgress(DownloadTask downloadTask, long j2) {
        Listener1Model listener1Model = (Listener1Model) this.modelHandler.getOrRecoverModel(downloadTask, downloadTask.getInfo());
        if (listener1Model == null) {
            return;
        }
        listener1Model.currentOffset.addAndGet(j2);
        Listener1Callback listener1Callback = this.callback;
        if (listener1Callback != null) {
            listener1Callback.progress(downloadTask, listener1Model.currentOffset.get(), listener1Model.totalLength);
        }
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.ListenerAssist
    public boolean isAlwaysRecoverAssistModel() {
        return this.modelHandler.isAlwaysRecoverAssistModel();
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.ListenerAssist
    public void setAlwaysRecoverAssistModel(boolean z) {
        this.modelHandler.setAlwaysRecoverAssistModel(z);
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.ListenerAssist
    public void setAlwaysRecoverAssistModelIfNotSet(boolean z) {
        this.modelHandler.setAlwaysRecoverAssistModelIfNotSet(z);
    }

    public void setCallback(@NonNull Listener1Callback listener1Callback) {
        this.callback = listener1Callback;
    }

    public void taskEnd(DownloadTask downloadTask, EndCause endCause, @Nullable Exception exc) {
        Listener1Model listener1Model = (Listener1Model) this.modelHandler.removeOrCreate(downloadTask, downloadTask.getInfo());
        Listener1Callback listener1Callback = this.callback;
        if (listener1Callback != null) {
            listener1Callback.taskEnd(downloadTask, endCause, exc, listener1Model);
        }
    }

    public void taskStart(DownloadTask downloadTask) {
        Listener1Model listener1Model = (Listener1Model) this.modelHandler.addAndGetModel(downloadTask, null);
        Listener1Callback listener1Callback = this.callback;
        if (listener1Callback != null) {
            listener1Callback.taskStart(downloadTask, listener1Model);
        }
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.ListenerModelHandler.ModelCreator
    public Listener1Model create(int i) {
        return new Listener1Model(i);
    }

    public Listener1Assist(ListenerModelHandler<Listener1Model> listenerModelHandler) {
        this.modelHandler = listenerModelHandler;
    }
}
