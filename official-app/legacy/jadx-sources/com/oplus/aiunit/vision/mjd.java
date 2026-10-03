package com.oplus.aiunit.vision;

import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public class mjd extends a8a {
    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return 8;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public String getTag() {
        return "OnceProcessInitializer";
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
        l72.a(this.mApplication);
        WebView.setDataDirectorySuffix(Objects.toString(gxe.c(), gxe.ONCE_PROCESS_NAME));
    }
}
