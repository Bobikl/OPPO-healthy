package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class VersionListRspBody {
    private List<Long> modifiedTime;

    public List<Long> getModifiedTime() {
        return this.modifiedTime;
    }

    public void setModifiedTime(List<Long> list) {
        this.modifiedTime = list;
    }
}
