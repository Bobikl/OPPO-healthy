package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.TumbleRecord;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.databaseengineservice.db.table.DBTumbleRecord;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class zck extends nai<DBTumbleRecord, TumbleRecord> {
    public zck() {
        this.b = new yck();
    }

    @Override // com.oplus.aiunit.vision.nai, com.oplus.aiunit.vision.ty9
    public int c(List<TumbleRecord> list) {
        cj4.c("TumbleRecordStore", "saveSportHealthData list size is " + list.size());
        return this.b.a(list) ? 0 : 101001;
    }

    @Override // com.oplus.aiunit.vision.nai
    public List<TumbleRecord> g(List<DBTumbleRecord> list, DataReadOption dataReadOption) {
        return null;
    }

    @Override // com.oplus.aiunit.vision.nai
    public List<DBTumbleRecord> l(DataReadOption dataReadOption) {
        return null;
    }
}
