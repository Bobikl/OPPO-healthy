package com.heytap.health.watch.oaf;

import android.content.Context;
import com.heytap.health.watch.oaf.wrapper.AbsMsgAgent;
import com.oplus.aiunit.vision.ot9;
import com.oplus.aiunit.vision.qt9;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class HealthGameAgent extends AbsMsgAgent {
    public static final int SID = 32;
    public static final String URN = "wear:health.game";

    public HealthGameAgent(Context context) {
        super("HealthGameA", context);
        F(this.v);
    }

    public static void F(Map<ot9, qt9> map) {
        map.put(ot9.a(HealthGameAgent.class.getName(), URN, "?", 0), qt9.a(32, "?", 0));
    }

    @Override // com.heytap.health.watch.oaf.wrapper.AbsMsgAgent
    public String o() {
        return URN;
    }
}
