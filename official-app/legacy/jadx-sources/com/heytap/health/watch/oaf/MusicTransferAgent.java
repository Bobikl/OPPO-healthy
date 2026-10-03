package com.heytap.health.watch.oaf;

import android.content.Context;
import com.heytap.health.watch.oaf.wrapper.AbsMsgAgent;
import com.oplus.aiunit.vision.ot9;
import com.oplus.aiunit.vision.qt9;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class MusicTransferAgent extends AbsMsgAgent {
    public static final int SID = 8;
    public static final String URN = "wear:music.transfer";

    public MusicTransferAgent(Context context) {
        super("MusicTransferA", context);
        F(this.v);
    }

    public static void F(Map<ot9, qt9> map) {
        map.put(ot9.a(MusicTransferAgent.class.getName(), URN, "10", 0), qt9.a(8, "10", 0));
        map.put(ot9.a(MusicTransferAgent.class.getName(), URN, "11", 0), qt9.a(8, "11", 0));
        map.put(ot9.a(MusicTransferAgent.class.getName(), URN, "12", 0), qt9.a(8, "12", 0));
        map.put(ot9.a(MusicTransferAgent.class.getName(), URN, "13", 0), qt9.a(8, "13", 0));
        map.put(ot9.a(MusicTransferAgent.class.getName(), URN, "14", 0), qt9.a(8, "14", 0));
        map.put(ot9.a(MusicTransferAgent.class.getName(), URN, "15", 0), qt9.a(8, "15", 0));
        map.put(ot9.a(MusicTransferAgent.class.getName(), URN, "18", 0), qt9.a(8, "18", 0));
    }

    @Override // com.heytap.health.watch.oaf.wrapper.AbsMsgAgent
    public String o() {
        return URN;
    }
}
