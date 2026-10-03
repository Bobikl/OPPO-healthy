package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.play.core.splitinstall.model.SplitInstallSessionStatus;
import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionState;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class SplitInstallSessionState extends OplusSplitInstallSessionState {
    public SplitInstallSessionState(int i, int i2, int i3, long j2, long j3, List<String> list, PendingIntent pendingIntent, List<Intent> list2) {
        super(i, i2, i3, list, pendingIntent, list2);
        setDownloadedBytes(j2);
        setTotalBytesToDownload(j3);
    }

    public List<Intent> a() {
        return this.mSplitFileIntents;
    }

    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionState
    public long bytesDownloaded() {
        return super.bytesDownloaded();
    }

    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionState
    @SplitInstallErrorCode
    public int errorCode() {
        return super.errorCode();
    }

    public boolean hasTerminalStatus() {
        return status() == 0 || status() == 5 || status() == 6 || status() == 7;
    }

    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionState
    @NonNull
    public List<String> languages() {
        return super.languages();
    }

    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionState
    @NonNull
    public List<String> moduleNames() {
        return super.moduleNames();
    }

    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionState
    @Nullable
    public PendingIntent resolutionIntent() {
        return super.resolutionIntent();
    }

    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionState
    public int sessionId() {
        return super.sessionId();
    }

    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionState
    @SplitInstallSessionStatus
    public int status() {
        return super.status();
    }

    @NonNull
    public String toString() {
        return "SplitInstallSessionState{sessionId=" + sessionId() + ", status=" + status() + ", errorCode=" + errorCode() + ", bytesDownloaded=" + bytesDownloaded() + ",totalBytesToDownload=" + totalBytesToDownload() + ",moduleNames=" + moduleNames() + "}";
    }

    @Override // com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionState
    public long totalBytesToDownload() {
        return super.totalBytesToDownload();
    }
}
