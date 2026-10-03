package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.OneTimeSport;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.DBOneTimeSport;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class p5k {
    public final HashMap<String, String> a;

    public static class a {
        public static final p5k instance = new p5k();
    }

    public static p5k e() {
        return a.instance;
    }

    public void a(OneTimeSport oneTimeSport) {
        String strF = f(oneTimeSport);
        String str = this.a.get(strF);
        if (str == null) {
            str = "";
        }
        this.a.put(strF, str + oneTimeSport.getData());
    }

    public void b(DBOneTimeSport dBOneTimeSport) {
        String strF = f(dBOneTimeSport);
        String str = this.a.get(strF);
        if (str == null) {
            str = "";
        }
        this.a.put(strF, str + dBOneTimeSport.getData());
    }

    public void c(List<DBOneTimeSport> list) {
        Iterator<DBOneTimeSport> it = list.iterator();
        while (it.hasNext()) {
            this.a.remove(f(it.next()));
        }
    }

    public void d(List<OneTimeSport> list) {
        Iterator<OneTimeSport> it = list.iterator();
        while (it.hasNext()) {
            this.a.remove(f(it.next()));
        }
    }

    public final String f(SportHealthData sportHealthData) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(sportHealthData.getStartTimestamp());
        stringBuffer.append("_");
        stringBuffer.append(sportHealthData.getEndTimestamp());
        stringBuffer.append("_");
        stringBuffer.append(sportHealthData.getSsoid());
        stringBuffer.append("_");
        stringBuffer.append(sportHealthData.getDeviceUniqueId());
        return stringBuffer.toString();
    }

    public String g(OneTimeSport oneTimeSport) {
        String strF = f(oneTimeSport);
        String str = this.a.get(strF);
        if (hz.a(str)) {
            return oneTimeSport.getData();
        }
        this.a.remove(strF);
        return str + oneTimeSport.getData();
    }

    public String h(DBOneTimeSport dBOneTimeSport) {
        String strF = f(dBOneTimeSport);
        String str = this.a.get(strF);
        if (hz.a(str)) {
            return dBOneTimeSport.getData();
        }
        this.a.remove(strF);
        return str + dBOneTimeSport.getData();
    }

    public p5k() {
        this.a = new HashMap<>();
    }
}
