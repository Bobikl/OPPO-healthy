package com.heytap.health.watch.oaf;

import android.content.Context;
import com.heytap.health.watch.oaf.wrapper.AbsMsgAgent;
import com.oplus.aiunit.vision.ot9;
import com.oplus.aiunit.vision.qt9;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class NotificationAgent extends AbsMsgAgent {
    public static final int SID = 2;
    public static final String URN = "wear:notification";

    public NotificationAgent(Context context) {
        super("NotificationA", context);
        F(this.v);
    }

    public static void F(Map<ot9, qt9> map) {
        map.put(ot9.a(NotificationAgent.class.getName(), URN, "?", 0), qt9.a(2, "?", 0));
    }

    @Override // com.heytap.health.watch.oaf.wrapper.AbsMsgAgent
    public String o() {
        return URN;
    }
}
