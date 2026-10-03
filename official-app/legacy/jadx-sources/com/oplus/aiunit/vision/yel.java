package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import com.heytap.health.watch.watchface.api.IWatchFaceAidl;
import com.heytap.health.watchface.provider.ipc.WatchFaceTransferApiImpl;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes19.dex */
public class yel implements cm9<IWatchFaceAidl> {
    @Override // com.oplus.aiunit.vision.cm9
    public void a(@NonNull PrintWriter printWriter, String[] strArr) {
        WatchFaceTransferApiImpl.c().a(printWriter, strArr);
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NonNull Context context) {
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NonNull Context context) {
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public IWatchFaceAidl d() {
        return WatchFaceTransferApiImpl.c().b();
    }
}
