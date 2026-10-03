package com.heytap.mspsdk.proxy;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.msp.ipc.client.TargetModifier;
import com.heytap.msp.ipc.client.j;
import com.heytap.msp.ipc.server.ServerFilter;
import com.heytap.mspsdk.log.MspLog;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class c implements TargetModifier, ServerFilter {
    public final com.heytap.mspsdk.core.b a;

    public c(com.heytap.mspsdk.core.b bVar) {
        this.a = bVar;
    }

    @Override // com.heytap.msp.ipc.server.ServerFilter
    public j filter(Context context, List<j> list) {
        if (list != null && !list.isEmpty()) {
            for (j jVar : list) {
                if (TextUtils.equals(jVar.g(), this.a.h())) {
                    MspLog.iIgnore("ApiProxy", "filter target = " + jVar);
                    return jVar;
                }
            }
        }
        return null;
    }

    @Override // com.heytap.msp.ipc.client.TargetModifier
    public j modify(Context context, j jVar) {
        String strG = jVar.g();
        com.heytap.mspsdk.core.b bVar = this.a;
        if (bVar != null) {
            strG = bVar.h();
        }
        String strF = jVar.f();
        String strE = jVar.e();
        if (!TextUtils.isEmpty(strF) && strF.contains("${applicationId}")) {
            String strReplace = strF.replace("${applicationId}", strG);
            MspLog.v("ApiProxy", "replace package = " + strReplace);
            return j.c(strG, strReplace);
        }
        if (TextUtils.isEmpty(strE)) {
            return jVar;
        }
        if (strE.contains("${applicationId}")) {
            strE = strE.replace("${applicationId}", strG);
            MspLog.v("ApiProxy", "replace package = " + strE);
        }
        return j.a(strG, strE);
    }
}
