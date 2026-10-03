package com.heytap.health.watch.oaf;

import android.content.Context;
import com.heytap.health.watch.oaf.wrapper.AbsFtAgent;
import com.oplus.aiunit.vision.e07;
import com.oplus.aiunit.vision.f07;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class SafeGuardFtAgent extends AbsFtAgent {
    public static final f07 DEF_OLINK_REPORT = null;
    public static final int SID = 47;
    public static final String URN = "wear:safe_guard_ft";

    public SafeGuardFtAgent(Context context) {
        super("SafeGuardFtA", context);
        T(this.H);
    }

    public static void T(Map<e07, f07> map) {
        map.put(e07.a(SafeGuardFtAgent.class.getName(), URN, null), f07.a(47, null));
    }

    @Override // com.heytap.health.watch.oaf.wrapper.AbsFtAgent
    public boolean S() {
        return false;
    }

    @Override // com.heytap.health.watch.oaf.wrapper.AbsFtAgent
    public f07 u() {
        return DEF_OLINK_REPORT;
    }

    @Override // com.heytap.health.watch.oaf.wrapper.AbsFtAgent
    public String v() {
        return URN;
    }
}
