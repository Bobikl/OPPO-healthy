package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class VersionListRspBodyNewModify {

    @SerializedName("hasMore")
    private int hasMore;

    @SerializedName("modifiedTimestampList")
    private List<Long> modifiedTimestampList;

    public int getHasMore() {
        return this.hasMore;
    }

    public List<Long> getModifiedTimestampList() {
        return this.modifiedTimestampList;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setModifiedTimestampList(List<Long> list) {
        this.modifiedTimestampList = list;
    }
}
