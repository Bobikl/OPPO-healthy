package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionStateFactory;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
class SplitInstallSessionStateFactoryImpl implements OplusSplitInstallSessionStateFactory<SplitInstallSessionState> {
    @NonNull
    public SplitInstallSessionState create(@NonNull Bundle bundle) {
        return new SplitInstallSessionState(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    @NonNull
    public SplitInstallSessionState newState(@NonNull SplitInstallSessionState splitInstallSessionState, int i, int i2) {
        return new SplitInstallSessionState(splitInstallSessionState.sessionId(), i, i2, splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.moduleNames(), splitInstallSessionState.resolutionIntent(), splitInstallSessionState.a());
    }

    @NonNull
    public SplitInstallSessionState newState(@NonNull SplitInstallSessionState splitInstallSessionState, int i) {
        return new SplitInstallSessionState(splitInstallSessionState.sessionId(), i, splitInstallSessionState.errorCode(), splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.moduleNames(), splitInstallSessionState.resolutionIntent(), splitInstallSessionState.a());
    }
}
