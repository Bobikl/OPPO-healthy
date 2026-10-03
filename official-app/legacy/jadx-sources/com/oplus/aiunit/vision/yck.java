package com.oplus.aiunit.vision;

import com.heytap.databaseengineservice.db.table.DBTumbleRecord;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes15.dex */
public class yck extends l6<DBTumbleRecord> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wck f18978e;

    public yck() {
        super(DBTumbleRecord.class);
        this.f18978e = this.f13538c.a1();
    }

    @Override // com.oplus.aiunit.vision.l6
    public boolean c(List<DBTumbleRecord> list) {
        long dataCreatedTimestamp = list.get(0).getDataCreatedTimestamp();
        long dataCreatedTimestamp2 = list.get(0).getDataCreatedTimestamp();
        this.a = list.get(0).getSsoid();
        for (DBTumbleRecord dBTumbleRecord : list) {
            dataCreatedTimestamp = Math.min(dBTumbleRecord.getDataCreatedTimestamp(), dataCreatedTimestamp);
            dataCreatedTimestamp2 = Math.max(dBTumbleRecord.getDataCreatedTimestamp(), dataCreatedTimestamp2);
        }
        ConcurrentHashMap<Long, List<DBTumbleRecord>> concurrentHashMapE = e(dataCreatedTimestamp, dataCreatedTimestamp2);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        for (DBTumbleRecord dBTumbleRecord2 : list) {
            cj4.c("TumbleRecordMerge", "merge tumble record insert data, dataCreatedTimestamp: " + dBTumbleRecord2.getDataCreatedTimestamp() + ", state: " + dBTumbleRecord2.getState());
            List<DBTumbleRecord> list2 = concurrentHashMapE.get(Long.valueOf(dBTumbleRecord2.getDataCreatedTimestamp()));
            if (list2 == null) {
                copyOnWriteArrayList.add(dBTumbleRecord2);
            } else if (dBTumbleRecord2.getModifiedTimestamp() > 0) {
                for (DBTumbleRecord dBTumbleRecord3 : list2) {
                    if (dBTumbleRecord2.getDeviceUniqueId().equals(dBTumbleRecord3.getDeviceUniqueId())) {
                        dBTumbleRecord3.setModifiedTimestamp(dBTumbleRecord2.getModifiedTimestamp());
                        dBTumbleRecord3.setSyncStatus(1);
                        dBTumbleRecord3.setUpdated(0);
                        copyOnWriteArrayList2.add(dBTumbleRecord3);
                    }
                }
            }
        }
        if (!hz.b(copyOnWriteArrayList)) {
            this.f18978e.a(copyOnWriteArrayList);
        }
        if (!hz.b(copyOnWriteArrayList2)) {
            this.f18978e.b(copyOnWriteArrayList2);
        }
        return true;
    }

    public final ConcurrentHashMap<Long, List<DBTumbleRecord>> e(long j2, long j3) {
        List<DBTumbleRecord> listE = this.f18978e.e(this.a, j2, j3);
        ConcurrentHashMap<Long, List<DBTumbleRecord>> concurrentHashMap = new ConcurrentHashMap<>();
        if (!hz.b(listE)) {
            for (DBTumbleRecord dBTumbleRecord : listE) {
                List<DBTumbleRecord> list = concurrentHashMap.get(Long.valueOf(dBTumbleRecord.getDataCreatedTimestamp()));
                if (list != null) {
                    list.add(dBTumbleRecord);
                } else {
                    concurrentHashMap.put(Long.valueOf(dBTumbleRecord.getDataCreatedTimestamp()), new CopyOnWriteArrayList(Collections.singletonList(dBTumbleRecord)));
                }
            }
        }
        return concurrentHashMap;
    }
}
