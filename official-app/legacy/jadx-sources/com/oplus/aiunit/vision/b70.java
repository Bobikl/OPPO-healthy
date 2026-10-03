package com.oplus.aiunit.vision;

import com.heytap.health.wallet.bean.TaskResult;

/* JADX INFO: loaded from: classes18.dex */
public class b70 extends mz0<String> {
    @Override // com.oplus.aiunit.vision.c70
    public void onStart() {
        TaskResult taskResultD = f70.d();
        if (taskResultD.getResultCode() != 9000) {
            t6b.i("BaseApduJob", "get default aid failed");
            notifyResult("no_activite_aid");
            return;
        }
        String strF = f70.f(taskResultD.getContent().getCommands());
        t6b.i("BaseApduJob", "get default aid success, aid = " + strF);
        notifyResult(strF);
    }
}
