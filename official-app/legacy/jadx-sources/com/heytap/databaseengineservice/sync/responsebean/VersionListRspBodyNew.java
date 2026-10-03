package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class VersionListRspBodyNew {

    @SerializedName("hasMore")
    private int hasMore;

    @SerializedName("modifiedTime")
    private List<Long> modifiedTime;

    public int getHasMore() {
        return this.hasMore;
    }

    public List<Long> getModifiedTime() {
        return this.modifiedTime;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setModifiedTime(List<Long> list) {
        this.modifiedTime = list;
    }
}
