package com.heytap.webpro.preload.res.entity;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.webpro.preload.res.db.entity.H5OfflineRecord;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class ManifestEntity {
    public int appId;
    public List<H5OfflineRecord> contents;
    public long id;
    public String version;

    @NonNull
    public String toString() {
        return "ManifestEntity{id=" + this.id + ", appId=" + this.appId + ", version='" + this.version + "', contents=" + this.contents + '}';
    }
}
