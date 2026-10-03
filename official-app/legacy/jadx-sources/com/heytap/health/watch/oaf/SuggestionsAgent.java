package com.heytap.health.watch.oaf;

import android.content.Context;
import com.heytap.health.watch.oaf.wrapper.AbsMsgAgent;
import com.oplus.aiunit.vision.ot9;
import com.oplus.aiunit.vision.qt9;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class SuggestionsAgent extends AbsMsgAgent {
    public static final int SID = 271;
    public static final String URN = "wear:breeno_suggestions";

    public SuggestionsAgent(Context context) {
        super("SuggestionsA", context);
        F(this.v);
    }

    public static void F(Map<ot9, qt9> map) {
        map.put(ot9.a(SuggestionsAgent.class.getName(), URN, "?", 0), qt9.a(271, "?", 0));
    }

    @Override // com.heytap.health.watch.oaf.wrapper.AbsMsgAgent
    public String o() {
        return URN;
    }
}
