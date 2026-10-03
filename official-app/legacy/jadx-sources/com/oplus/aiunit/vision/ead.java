package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import com.heytap.health.adaptersdk.IOAFAdapterService;
import com.heytap.health.oaf.OafHost;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes17.dex */
public class ead implements cm9<IOAFAdapterService> {
    @Override // com.oplus.aiunit.vision.cm9
    public void a(@NonNull PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NonNull Context context) {
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NonNull Context context) {
        com.heytap.health.adaptersdk.a.f().g(context);
        OafHost.i().q();
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public IOAFAdapterService d() {
        return OafHost.i().j();
    }
}
