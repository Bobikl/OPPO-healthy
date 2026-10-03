package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.OneTimeSport;
import java.util.HashMap;

/* JADX INFO: loaded from: classes15.dex */
public class vjd {
    public final HashMap<String, OneTimeSport> a;

    public static class a {
        public static final vjd instance = new vjd();
    }

    public static vjd d() {
        return a.instance;
    }

    public void a(OneTimeSport oneTimeSport) {
        this.a.put(e(oneTimeSport.getSsoid(), oneTimeSport.getStartTimestamp()), oneTimeSport);
    }

    public void b(String str, long j2) {
        this.a.remove(e(str, j2));
    }

    public OneTimeSport c(String str, long j2) {
        return this.a.get(e(str, j2));
    }

    public final String e(String str, long j2) {
        return str + "_" + j2;
    }

    public vjd() {
        this.a = new HashMap<>();
    }
}
