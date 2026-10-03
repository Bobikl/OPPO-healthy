package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;
import com.xingin.xhssharesdk.core.XhsShareSdk;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public final class vim implements dqm {
    @Override // com.oplus.aiunit.vision.dqm
    public final Uri a(@NonNull Context context, @NonNull String str, @NonNull File file) {
        try {
            return FileProvider.getUriForFile(context, str, file);
        } catch (Throwable th) {
            XhsShareSdk.d("XhsShare_AndroidXFileProvider", "getUriForFile error.", th);
            return null;
        }
    }
}
