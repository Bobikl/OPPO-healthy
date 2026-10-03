package com.coloros.sceneservice.k;

import com.coloros.sceneservice.m.f;
import com.coloros.sceneservice.sceneprovider.service.BaseSceneService;
import com.coloros.sceneservice.sceneprovider.service.ServiceManager;

/* JADX INFO: loaded from: classes13.dex */
public class b implements Runnable {
    public final /* synthetic */ String yc;

    public b(String str) {
        this.yc = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("static finish :");
            sb.append(this.yc);
            f.d(BaseSceneService.TAG, sb.toString());
            BaseSceneService service = ServiceManager.getInstance().getService(this.yc);
            if (service != null) {
                service.destroy();
            }
        } catch (Exception e2) {
            f.e(BaseSceneService.TAG, "static finishBySelf error", e2);
        }
    }
}
