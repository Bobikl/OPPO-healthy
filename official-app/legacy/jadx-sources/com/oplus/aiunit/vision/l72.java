package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.browser.executors.AppExecutor;
import com.heytap.health.browser.executors.DeviceExecutor;
import com.heytap.health.browser.executors.SystemExecutor;
import com.heytap.health.core.webservice.js.CommonExecutor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes15.dex */
public class l72 {
    public static final String DefaultSafeDomain = zv8.H5_PATH;

    public static void a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AppExecutor.class);
        arrayList.add(CommonExecutor.class);
        arrayList.add(DeviceExecutor.class);
        arrayList.add(SystemExecutor.class);
        z62.x(context.getApplicationContext(), DefaultSafeDomain, arrayList);
    }
}
