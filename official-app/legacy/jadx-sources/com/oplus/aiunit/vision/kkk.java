package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.AsyncTask;
import androidx.annotation.NonNull;
import com.heytap.upgrade.UpgradeSDK;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechErrorCode;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class kkk extends w81 {
    public HashMap<String, ckk> d;

    @Override // com.oplus.aiunit.vision.tp9
    public boolean a(@NonNull t26 t26Var) {
        String absolutePath = UpgradeSDK.instance.getInitParam().b().getAbsolutePath();
        String strC = t26Var.c();
        if (!rqk.p(t26Var.e().getApkFileSize() - new File(v9e.a(absolutePath, strC, t26Var.e().getMd5())).length())) {
            nz9 nz9VarB = t26Var.b();
            if (nz9VarB != null) {
                nz9VarB.S4(SpeechErrorCode.ERROR_PERMISSION_DENIED);
            }
            return false;
        }
        ckk ckkVar = this.d.get(strC);
        if (ckkVar == null || ckkVar.r()) {
            ckkVar = new ckk(t26Var, this.f18156c);
            this.d.put(strC, ckkVar);
        }
        if (!ckkVar.s()) {
            return true;
        }
        ckkVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return true;
    }

    @Override // com.oplus.aiunit.vision.tp9
    public void b() {
        for (ckk ckkVar : this.d.values()) {
            if (ckkVar != null) {
                ckkVar.cancel(true);
                ckkVar.x();
            }
        }
        this.d.clear();
    }

    @Override // com.oplus.aiunit.vision.tp9
    public void c(@NonNull String str) {
        ckk ckkVar = this.d.get(str);
        if (ckkVar != null) {
            ckkVar.cancel(true);
            ckkVar.x();
        }
        this.d.remove(str);
    }

    @Override // com.oplus.aiunit.vision.tp9
    public boolean d(@NonNull String str) {
        ckk ckkVar = this.d.get(str);
        return ckkVar != null && ckkVar.q();
    }

    @Override // com.oplus.aiunit.vision.w81
    public void h(Context context, y7a y7aVar) {
        super.h(context, y7aVar);
        this.d = new HashMap<>();
    }
}
