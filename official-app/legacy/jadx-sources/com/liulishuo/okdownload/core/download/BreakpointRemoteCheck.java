package com.liulishuo.okdownload.core.download;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.liulishuo.okdownload.DownloadTask;
import com.liulishuo.okdownload.OkDownload;
import com.liulishuo.okdownload.core.breakpoint.BreakpointInfo;
import com.liulishuo.okdownload.core.cause.ResumeFailedCause;
import com.liulishuo.okdownload.core.exception.FileBusyAfterRunException;
import com.liulishuo.okdownload.core.exception.ServerCanceledException;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class BreakpointRemoteCheck {
    private boolean acceptRange;
    ResumeFailedCause failedCause;

    @NonNull
    private final BreakpointInfo info;
    private long instanceLength;
    private boolean resumable;

    @NonNull
    private final DownloadTask task;

    public BreakpointRemoteCheck(@NonNull DownloadTask downloadTask, @NonNull BreakpointInfo breakpointInfo) {
        this.task = downloadTask;
        this.info = breakpointInfo;
    }

    public void check() throws IOException {
        DownloadStrategy downloadStrategy = OkDownload.with().downloadStrategy();
        ConnectTrial connectTrialCreateConnectTrial = createConnectTrial();
        connectTrialCreateConnectTrial.executeTrial();
        boolean zIsAcceptRange = connectTrialCreateConnectTrial.isAcceptRange();
        boolean zIsChunked = connectTrialCreateConnectTrial.isChunked();
        long instanceLength = connectTrialCreateConnectTrial.getInstanceLength();
        String responseEtag = connectTrialCreateConnectTrial.getResponseEtag();
        String responseFilename = connectTrialCreateConnectTrial.getResponseFilename();
        int responseCode = connectTrialCreateConnectTrial.getResponseCode();
        downloadStrategy.validFilenameFromResponse(responseFilename, this.task, this.info);
        this.info.setChunked(zIsChunked);
        this.info.setEtag(responseEtag);
        if (OkDownload.with().downloadDispatcher().isFileConflictAfterRun(this.task)) {
            throw FileBusyAfterRunException.SIGNAL;
        }
        ResumeFailedCause preconditionFailedCause = downloadStrategy.getPreconditionFailedCause(responseCode, this.info.getTotalOffset() != 0, this.info, responseEtag);
        boolean z = preconditionFailedCause == null;
        this.resumable = z;
        this.failedCause = preconditionFailedCause;
        this.instanceLength = instanceLength;
        this.acceptRange = zIsAcceptRange;
        if (isTrialSpecialPass(responseCode, instanceLength, z)) {
            return;
        }
        if (downloadStrategy.isServerCanceled(responseCode, this.info.getTotalOffset() != 0)) {
            throw new ServerCanceledException(responseCode, this.info.getTotalOffset());
        }
    }

    public ConnectTrial createConnectTrial() {
        return new ConnectTrial(this.task, this.info);
    }

    @Nullable
    public ResumeFailedCause getCause() {
        return this.failedCause;
    }

    @NonNull
    public ResumeFailedCause getCauseOrThrow() {
        ResumeFailedCause resumeFailedCause = this.failedCause;
        if (resumeFailedCause != null) {
            return resumeFailedCause;
        }
        throw new IllegalStateException("No cause find with resumable: " + this.resumable);
    }

    public long getInstanceLength() {
        return this.instanceLength;
    }

    public boolean isAcceptRange() {
        return this.acceptRange;
    }

    public boolean isResumable() {
        return this.resumable;
    }

    public boolean isTrialSpecialPass(int i, long j2, boolean z) {
        return i == 416 && j2 >= 0 && z;
    }

    public String toString() {
        return "acceptRange[" + this.acceptRange + "] resumable[" + this.resumable + "] failedCause[" + this.failedCause + "] instanceLength[" + this.instanceLength + "] " + super.toString();
    }
}
