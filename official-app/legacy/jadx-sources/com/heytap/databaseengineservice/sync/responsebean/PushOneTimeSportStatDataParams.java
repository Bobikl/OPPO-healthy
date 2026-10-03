package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PushOneTimeSportStatDataParams<T> {

    @SerializedName("sportStatList")
    private List<T> list;

    public PushOneTimeSportStatDataParams(List<T> list) {
        this.list = list;
    }

    public String toString() {
        return "PushSportDataParams{, list=" + this.list + '}';
    }
}
