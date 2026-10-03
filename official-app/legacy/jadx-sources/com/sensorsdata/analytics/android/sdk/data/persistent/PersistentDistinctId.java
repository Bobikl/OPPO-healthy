package com.sensorsdata.analytics.android.sdk.data.persistent;

import android.content.Context;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public class PersistentDistinctId extends PersistentIdentity<String> {
    public PersistentDistinctId(final Context context) {
        super(DbParams.PersistentName.DISTINCT_ID, new PersistentIdentity.PersistentSerializer<String>() { // from class: com.sensorsdata.analytics.android.sdk.data.persistent.PersistentDistinctId.1
            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public String load(String str) {
                return str;
            }

            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public String create() {
                String identifier = SensorsDataUtils.getIdentifier(context);
                return SensorsDataUtils.isValidAndroidId(identifier) ? identifier : UUID.randomUUID().toString();
            }

            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public String save(String str) {
                return str == null ? create() : str;
            }
        });
    }
}
