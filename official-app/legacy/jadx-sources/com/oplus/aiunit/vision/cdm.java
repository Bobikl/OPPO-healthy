package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.xingin.xhssharesdk.core.XhsShareSdk;
import java.io.File;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes10.dex */
public final class cdm implements dqm {
    public Method a;

    @Override // com.oplus.aiunit.vision.dqm
    public final Uri a(@NonNull Context context, @NonNull String str, @NonNull File file) {
        Method method = this.a;
        if (method == null) {
            return null;
        }
        try {
            return (Uri) method.invoke(null, context, str, file);
        } catch (Throwable th) {
            XhsShareSdk.d("XhsShare_AndroidSupportFileProvider", "getUriForFile error.", th);
            return null;
        }
    }
}
