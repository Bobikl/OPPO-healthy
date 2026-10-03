package com.heytap.health.watch.oaf;

import android.content.Context;
import com.heytap.health.watch.oaf.wrapper.AbsMsgAgent;
import com.oplus.aiunit.vision.ot9;
import com.oplus.aiunit.vision.qt9;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class DeviceEventAgent extends AbsMsgAgent {
    public static final int SID = 30;
    public static final String URN = "wear:deviceevent";

    public DeviceEventAgent(Context context) {
        super("DeviceEventA", context);
        F(this.v);
    }

    public static void F(Map<ot9, qt9> map) {
        map.put(ot9.a(DeviceEventAgent.class.getName(), URN, "?", 0), qt9.a(30, "?", 0));
    }

    @Override // com.heytap.health.watch.oaf.wrapper.AbsMsgAgent
    public String o() {
        return URN;
    }
}
