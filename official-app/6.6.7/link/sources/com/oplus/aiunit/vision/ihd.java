package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.WearableApiManager;
import com.oplus.wearable.linkservice.sdk.IWearableService;
import java.io.PrintWriter;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ihd implements in9<IWearableService> {
    public final Context i;

    public ihd(Context context) {
        this.i = context;
    }

    public void a(@NonNull PrintWriter printWriter, String[] strArr) {
        WearableApiManager.v(this.i).q(printWriter, strArr);
    }

    public void b(@NonNull Context context) {
        WearableApiManager.v(this.i).y();
    }

    public void c(@NonNull Context context) {
        WearableApiManager.v(this.i).w();
    }

    @NonNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public IWearableService getService() {
        return WearableApiManager.v(this.i).u();
    }
}
