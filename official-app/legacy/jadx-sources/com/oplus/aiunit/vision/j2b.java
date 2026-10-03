package com.oplus.aiunit.vision;

import com.heytap.health.watchface.business.creation.db.LivePhotoRecord;
import com.heytap.health.watchface.business.creation.db.LivePhotoRecordDatabase;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class j2b implements i2b {
    public i2b a;

    public static class a {
        public static final j2b a = new j2b();
    }

    public static j2b h() {
        return a.a;
    }

    @Override // com.oplus.aiunit.vision.i2b
    public void a(LivePhotoRecord livePhotoRecord) {
        ltl.a("LivePhotoRecordDaoImpl", "insert record" + livePhotoRecord);
        livePhotoRecord.deviceFlag = z0j.a(livePhotoRecord.deviceFlag);
        this.a.a(livePhotoRecord);
    }

    @Override // com.oplus.aiunit.vision.i2b
    public List<LivePhotoRecord> b(String str) {
        List<LivePhotoRecord> listB = this.a.b(z0j.a(str));
        ltl.a("LivePhotoRecordDaoImpl", "queryNotCompletedTask record" + listB);
        return listB;
    }

    @Override // com.oplus.aiunit.vision.i2b
    public void c(long j2) {
        ltl.a("LivePhotoRecordDaoImpl", "delete taskId" + j2);
        this.a.c(j2);
    }

    @Override // com.oplus.aiunit.vision.i2b
    public List<LivePhotoRecord> d(String str) {
        List<LivePhotoRecord> listD = this.a.d(z0j.a(str));
        Collections.reverse(listD);
        ltl.a("LivePhotoRecordDaoImpl", "queryCompletedOrWaitToIntoLibTask record" + listD);
        return listD;
    }

    @Override // com.oplus.aiunit.vision.i2b
    public void delete(String str) {
        ltl.a("LivePhotoRecordDaoImpl", "delete device_flag" + str);
        this.a.delete(z0j.a(str));
    }

    @Override // com.oplus.aiunit.vision.i2b
    public int e(LivePhotoRecord livePhotoRecord) {
        ltl.a("LivePhotoRecordDaoImpl", "delete record" + livePhotoRecord);
        livePhotoRecord.deviceFlag = z0j.a(livePhotoRecord.deviceFlag);
        return this.a.e(livePhotoRecord);
    }

    @Override // com.oplus.aiunit.vision.i2b
    public List<LivePhotoRecord> f(String str) {
        List<LivePhotoRecord> listF = this.a.f(z0j.a(str));
        Collections.reverse(listF);
        ltl.a("LivePhotoRecordDaoImpl", "queryCompletedTask record" + listF);
        return listF;
    }

    @Override // com.oplus.aiunit.vision.i2b
    public List<LivePhotoRecord> g(String str) {
        List<LivePhotoRecord> listG = this.a.g(z0j.a(str));
        Collections.reverse(listG);
        ltl.a("LivePhotoRecordDaoImpl", "queryWaitToIntoLibTask record" + listG);
        return listG;
    }

    public j2b() {
        this.a = LivePhotoRecordDatabase.e(b78.a()).d();
    }
}
