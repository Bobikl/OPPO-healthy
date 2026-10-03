package com.sensorsdata.analytics.android.sdk.data.persistent;

import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;

/* JADX INFO: loaded from: classes10.dex */
public class PersistentFirstTrackInstallationWithCallback extends PersistentIdentity<Boolean> {
    public PersistentFirstTrackInstallationWithCallback() {
        super(DbParams.PersistentName.FIRST_INSTALL_CALLBACK, new PersistentIdentity.PersistentSerializer<Boolean>() { // from class: com.sensorsdata.analytics.android.sdk.data.persistent.PersistentFirstTrackInstallationWithCallback.1
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
                return bool == null ? create().toString() : String.valueOf(bool);
            }
        });
    }
}
