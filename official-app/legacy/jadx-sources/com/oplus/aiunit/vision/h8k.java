package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.OneTimeSport;
import com.heytap.sports.map.model.TrackPoint;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class h8k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static h8k f12056c;
    public OneTimeSport a;
    public List<TrackPoint> b;

    public static h8k a() {
        if (f12056c == null) {
            synchronized (h8k.class) {
                f12056c = new h8k();
            }
        }
        return f12056c;
    }

    public synchronized OneTimeSport b() {
        return this.a;
    }

    public synchronized void c() {
        this.a = null;
        this.b = null;
        f12056c = null;
    }

    public synchronized void d(OneTimeSport oneTimeSport) {
        this.a = oneTimeSport;
    }
}
