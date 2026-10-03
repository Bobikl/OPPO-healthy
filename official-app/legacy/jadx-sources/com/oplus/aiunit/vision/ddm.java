package com.oplus.aiunit.vision;

import android.util.Log;
import androidx.annotation.Nullable;
import com.xingin.xhssharesdk.log.IShareLogger;

/* JADX INFO: loaded from: classes10.dex */
public final class ddm implements IShareLogger {
    @Override // com.xingin.xhssharesdk.log.IShareLogger
    public final void d(String str, String str2) {
        Log.d(str, str2);
    }

    @Override // com.xingin.xhssharesdk.log.IShareLogger
    public final void e(String str, String str2, @Nullable Throwable th) {
        Log.w(str, str2, th);
    }

    @Override // com.xingin.xhssharesdk.log.IShareLogger
    public final void i(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // com.xingin.xhssharesdk.log.IShareLogger
    public final void v(String str, String str2) {
        Log.v(str, str2);
    }

    @Override // com.xingin.xhssharesdk.log.IShareLogger
    public final void w(String str, String str2, @Nullable Throwable th) {
        Log.w(str, str2, th);
    }
}
