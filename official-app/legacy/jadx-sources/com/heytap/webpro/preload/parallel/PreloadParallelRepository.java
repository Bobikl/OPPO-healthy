package com.heytap.webpro.preload.parallel;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.gson.reflect.TypeToken;
import com.heytap.webpro.preload.network.core.CoreResponse;
import com.heytap.webpro.preload.parallel.entity.PreloadConfig;
import com.oplus.aiunit.vision.ar9;
import com.oplus.aiunit.vision.cse;
import com.oplus.aiunit.vision.h41;
import com.oplus.aiunit.vision.lwj;
import com.oplus.aiunit.vision.pt9;
import com.oplus.aiunit.vision.q7b;
import com.oplus.aiunit.vision.vre;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class PreloadParallelRepository extends h41 {

    public static class a {
        public static final PreloadParallelRepository a = new PreloadParallelRepository();
    }

    public static PreloadParallelRepository m() {
        return a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void o(String str, String str2) {
        List<PreloadConfig.PreloadConfigData> list;
        try {
            ar9 ar9VarF = f(str, null);
            try {
                CoreResponse coreResponse = (CoreResponse) d(ar9VarF, new TypeToken<CoreResponse<PreloadConfig>>() { // from class: com.heytap.webpro.preload.parallel.PreloadParallelRepository.1
                }.getType());
                if (coreResponse.isSuccess()) {
                    PreloadConfig preloadConfig = (PreloadConfig) coreResponse.data;
                    if (preloadConfig != null && preloadConfig.enable && (list = preloadConfig.maps) != null) {
                        cse.f().c(str2, list);
                    }
                    cse.f().d();
                    q7b.i("PreloadDataRepository", "get preload data   preloadConfig == null");
                    if (ar9VarF != null) {
                        ar9VarF.close();
                        return;
                    }
                    return;
                }
                q7b.n("PreloadDataRepository", "get preload data config failed");
                if (ar9VarF != null) {
                    ar9VarF.close();
                }
            } catch (Throwable th) {
                if (ar9VarF != null) {
                    try {
                        ar9VarF.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            q7b.n("PreloadDataRepository", "get preload data config failed, error=" + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(String str, String str2, pt9 pt9Var) {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/json;charset=UTF-8;");
        try {
            ar9 ar9VarB = b(vre.c(str).g(str2, "application/json;charset=UTF-8;").h(map).f());
            try {
                pt9Var.onResult(l(ar9VarB));
                if (ar9VarB != null) {
                    ar9VarB.close();
                }
            } catch (Throwable th) {
                if (ar9VarB != null) {
                    try {
                        ar9VarB.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            pt9Var.onResult(CoreResponse.error(-1001, "postPreloadData failed! " + e2.getMessage()).toJsonObject());
        }
    }

    @WorkerThread
    public JSONObject l(ar9 ar9Var) throws Exception {
        String strE = e(ar9Var);
        if (strE == null) {
            return null;
        }
        return new JSONObject(strE);
    }

    public void n(final String str, final String str2) {
        lwj.i(new Runnable() { // from class: com.oplus.aiunit.vision.gse
            @Override // java.lang.Runnable
            public final void run() {
                this.i.o(str, str2);
            }
        });
    }

    public void q(final String str, final String str2, @NonNull final pt9<JSONObject> pt9Var) {
        lwj.i(new Runnable() { // from class: com.oplus.aiunit.vision.hse
            @Override // java.lang.Runnable
            public final void run() {
                this.i.p(str, str2, pt9Var);
            }
        });
    }

    public PreloadParallelRepository() {
    }
}
