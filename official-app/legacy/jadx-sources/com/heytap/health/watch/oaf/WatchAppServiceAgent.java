package com.heytap.health.watch.oaf;

import android.content.Context;
import com.heytap.health.watch.oaf.wrapper.AbsMsgAgent;
import com.oplus.aiunit.vision.ot9;
import com.oplus.aiunit.vision.qt9;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class WatchAppServiceAgent extends AbsMsgAgent {
    public static final int SID = 267;
    public static final String URN = "wear:watchappservice";

    public WatchAppServiceAgent(Context context) {
        super("WatchAppServiceA", context);
        F(this.v);
    }

    public static void F(Map<ot9, qt9> map) {
        map.put(ot9.a(WatchAppServiceAgent.class.getName(), URN, "?", 0), qt9.a(267, "?", 0));
    }

    @Override // com.heytap.health.watch.oaf.wrapper.AbsMsgAgent
    public String o() {
        return URN;
    }
}
