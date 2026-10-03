package com.heytap.store.apm.Net.utils;

import com.oplus.aiunit.vision.jea;
import com.oplus.aiunit.vision.qx5;
import com.oplus.aiunit.vision.wr2;
import com.oplus.aiunit.vision.wr6;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class OkHttpHooker {
    public static wr6.c globalEventFactory = new a();
    public static qx5 globalDns = qx5.SYSTEM;
    public static List<jea> globalInterceptors = new ArrayList();
    public static List<jea> globalNetworkInterceptors = new ArrayList();

    public class a implements wr6.c {
        @Override // com.oplus.aiunit.vision.wr6.c
        public wr6 a(wr2 wr2Var) {
            return wr6.NONE;
        }
    }

    public static void installDns(qx5 qx5Var) {
        globalDns = qx5Var;
    }

    public static void installEventListenerFactory(wr6.c cVar) {
        globalEventFactory = cVar;
    }

    public static void installInterceptor(jea jeaVar) {
        if (jeaVar != null) {
            globalInterceptors.add(jeaVar);
        }
    }

    public static void installNetworkInterceptors(jea jeaVar) {
        if (jeaVar != null) {
            globalNetworkInterceptors.add(jeaVar);
        }
    }
}
