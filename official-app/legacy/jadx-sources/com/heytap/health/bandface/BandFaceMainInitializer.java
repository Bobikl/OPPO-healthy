package com.heytap.health.bandface;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.x0;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class BandFaceMainInitializer extends a8a {
    @Override // com.oplus.aiunit.vision.a8a
    public int configPriority() {
        return 30;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return 1;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
        x0.d().b("/bandfaceapi/api_provider").navigation();
    }
}
