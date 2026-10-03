package com.heytap.health.watch.oaf;

import android.content.Context;
import com.heytap.health.watch.oaf.wrapper.AbsMsgAgent;
import com.oplus.aiunit.p007vision.vu9;
import com.oplus.aiunit.p007vision.xu9;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes19.dex */
public class McuHealthAgent extends AbsMsgAgent {
    public static final int SID = 5;
    public static final String URN = "wear:health2";

    public McuHealthAgent(Context context) {
        super("McuHealthA", context);
        F(this.v);
    }

    public static void F(Map<vu9, xu9> map) {
        map.put(vu9.a(McuHealthAgent.class.getName(), URN, "?", 0), xu9.a(5, "?", 0));
    }

    @Override // com.heytap.health.watch.oaf.wrapper.AbsMsgAgent
    public String o() {
        return URN;
    }
}