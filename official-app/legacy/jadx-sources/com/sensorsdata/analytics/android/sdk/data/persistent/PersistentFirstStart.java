package com.sensorsdata.analytics.android.sdk.data.persistent;

import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;

/* JADX INFO: loaded from: classes10.dex */
public class PersistentFirstStart extends PersistentIdentity<Boolean> {
    public PersistentFirstStart() {
        super(DbParams.PersistentName.FIRST_START, new PersistentIdentity.PersistentSerializer<Boolean>() { // from class: com.sensorsdata.analytics.android.sdk.data.persistent.PersistentFirstStart.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public Boolean create() {
                return Boolean.TRUE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public Boolean load(String str) {
                return Boolean.FALSE;
            }

            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public String save(Boolean bool) {
                return bool == null ? create().toString() : String.valueOf(true);
            }
        });
    }
}
