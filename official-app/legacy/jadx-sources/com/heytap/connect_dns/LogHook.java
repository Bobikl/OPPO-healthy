package com.heytap.connect_dns;

import com.heytap.connect.api.logger.Logger;
import com.oplus.aiunit.vision.op9;

/* JADX INFO: loaded from: classes13.dex */
public class LogHook implements op9 {
    @Override // com.oplus.aiunit.vision.op9
    public boolean d(String str, String str2, Throwable th) {
        Logger.INSTANCE.d(str, str2, th, "");
        return false;
    }

    @Override // com.oplus.aiunit.vision.op9
    public boolean e(String str, String str2, Throwable th) {
        Logger.INSTANCE.e(str, str2, th, "");
        return false;
    }

    @Override // com.oplus.aiunit.vision.op9
    public boolean i(String str, String str2, Throwable th) {
        Logger.INSTANCE.i(str, str2, th, "");
        return false;
    }

    @Override // com.oplus.aiunit.vision.op9
    public boolean v(String str, String str2, Throwable th) {
        Logger.INSTANCE.v(str, str2, th, "");
        return false;
    }

    @Override // com.oplus.aiunit.vision.op9
    public boolean w(String str, String str2, Throwable th) {
        Logger.INSTANCE.w(str, str2, th, "");
        return false;
    }
}
