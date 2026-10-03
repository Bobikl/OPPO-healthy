package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.play.core.splitinstall.model.SplitInstallSessionStatus;
import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionState;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class SplitInstallSessionState extends OplusSplitInstallSessionState {
    public SplitInstallSessionState(int i, int i2, int i3, long j, long j2, List<String> list, PendingIntent pendingIntent, List<Intent> list2) {
        super(i, i2, i3, list, pendingIntent, list2);
        setDownloadedBytes(j);
        setTotalBytesToDownload(j2);
    }

    public List<Intent> a() {
        return ((OplusSplitInstallSessionState) this).mSplitFileIntents;
    }

    public long bytesDownloaded() {
        return super.bytesDownloaded();
    }

    @SplitInstallErrorCode
    public int errorCode() {
        return super.errorCode();
    }

    public boolean hasTerminalStatus() {
        return status() == 0 || status() == 5 || status() == 6 || status() == 7;
    }

    @NonNull
    public List<String> languages() {
        return super.languages();
    }

    @NonNull
    public List<String> moduleNames() {
        return super.moduleNames();
    }

    @Nullable
    public PendingIntent resolutionIntent() {
        return super.resolutionIntent();
    }

    public int sessionId() {
        return super.sessionId();
    }

    @SplitInstallSessionStatus
    public int status() {
        return super.status();
    }

    @NonNull
    public String toString() {
        return "SplitInstallSessionState{sessionId=" + sessionId() + ", status=" + status() + ", errorCode=" + errorCode() + ", bytesDownloaded=" + bytesDownloaded() + ",totalBytesToDownload=" + totalBytesToDownload() + ",moduleNames=" + moduleNames() + "}";
    }

    public long totalBytesToDownload() {
        return super.totalBytesToDownload();
    }
}
