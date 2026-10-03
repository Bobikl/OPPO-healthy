package com.heytap.health.watch.oaf;

import android.content.Context;
import com.heytap.health.watch.oaf.wrapper.AbsMsgAgent;
import com.oplus.aiunit.vision.ot9;
import com.oplus.aiunit.vision.qt9;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class BandVoiceAssistant extends AbsMsgAgent {
    public static final int SID = 270;
    public static final String URN = "wear:bandvoiceassistant";

    public BandVoiceAssistant(Context context) {
        super("BandVoiceAssistant", context);
        F(this.v);
    }

    public static void F(Map<ot9, qt9> map) {
        map.put(ot9.a(BandVoiceAssistant.class.getName(), URN, "?", 0), qt9.a(270, "?", 0));
    }

    @Override // com.heytap.health.watch.oaf.wrapper.AbsMsgAgent
    public String o() {
        return URN;
    }
}
