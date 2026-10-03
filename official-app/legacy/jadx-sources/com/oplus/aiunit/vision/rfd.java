package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.WearableApiManager;
import com.oplus.wearable.linkservice.sdk.IWearableService;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes5.dex */
public class rfd implements cm9<IWearableService> {
    public final Context i;

    public rfd(Context context) {
        this.i = context;
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void a(@NonNull PrintWriter printWriter, String[] strArr) {
        WearableApiManager.v(this.i).q(printWriter, strArr);
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NonNull Context context) {
        WearableApiManager.v(this.i).y();
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NonNull Context context) {
        WearableApiManager.v(this.i).w();
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public IWearableService d() {
        return WearableApiManager.v(this.i).u();
    }
}
