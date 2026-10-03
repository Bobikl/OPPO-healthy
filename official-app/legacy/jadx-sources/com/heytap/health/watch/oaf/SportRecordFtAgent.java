package com.heytap.health.watch.oaf;

import android.content.Context;
import com.heytap.health.watch.oaf.wrapper.AbsFtAgent;
import com.oplus.aiunit.vision.e07;
import com.oplus.aiunit.vision.f07;
import com.oplus.aiunit.vision.jx4;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class SportRecordFtAgent extends AbsFtAgent {
    public static final f07 DEF_OLINK_REPORT = f07.a(6, jx4.SPORT_RECORD_FILE_URI);
    public static final int SID = 6;
    public static final String URN = "wear:health.ftsport_record2";

    public SportRecordFtAgent(Context context) {
        super("SportRecordFtA", context);
        T(this.H);
    }

    public static void T(Map<e07, f07> map) {
        map.put(e07.a(SportRecordFtAgent.class.getName(), URN, null), f07.a(6, null));
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
