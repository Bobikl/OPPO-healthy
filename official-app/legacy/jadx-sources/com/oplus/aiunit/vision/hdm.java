package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.xingin.xhssharesdk.XhsShareSdkTools;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public final class hdm extends Thread {

    @NonNull
    public final File i;

    public hdm(@NonNull File file) {
        this.i = file;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        super.run();
        XhsShareSdkTools.deleteFile(this.i, false);
    }
}
