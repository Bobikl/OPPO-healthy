package com.oplus.oms.split.full.core.splitinstall;

import android.app.PendingIntent;
import android.content.Intent;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class OplusSplitInstallSessionState {
    protected long mBytesDownloaded;
    protected int mErrorCode;
    protected List<String> mModuleNames;
    protected int mSessionId;
    protected List<Intent> mSplitFileIntents;
    protected int mStatus;
    protected long mTotalBytesToDownload;
    protected PendingIntent mUserConfirmationIntent;

    public OplusSplitInstallSessionState(int i, int i2, int i3, List<String> list, PendingIntent pendingIntent, List<Intent> list2) {
        this.mSessionId = i;
        this.mStatus = i2;
        this.mErrorCode = i3;
        this.mModuleNames = list;
        this.mUserConfirmationIntent = pendingIntent;
        this.mSplitFileIntents = list2;
    }

    public long bytesDownloaded() {
        return this.mBytesDownloaded;
    }

    public int errorCode() {
        return this.mErrorCode;
    }

    public List<String> languages() {
        return Collections.EMPTY_LIST;
    }

    public List<String> moduleNames() {
        return this.mModuleNames;
    }

    public PendingIntent resolutionIntent() {
        return this.mUserConfirmationIntent;
    }

    public int sessionId() {
        return this.mSessionId;
    }

    public void setDownloadedBytes(long j2) {
        this.mBytesDownloaded = j2;
    }

    public void setTotalBytesToDownload(long j2) {
        this.mTotalBytesToDownload = j2;
    }

    public int status() {
        return this.mStatus;
    }

    public long totalBytesToDownload() {
        return this.mTotalBytesToDownload;
    }
}
