package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class DeleteECGDataPOJO {

    @SerializedName("clientDataIdList")
    private List<String> clientDataIdList;

    public void setClientDataIdList(List<String> list) {
        this.clientDataIdList = list;
    }

    public String toString() {
        return "DeleteECGDataPOJO{clientDataIdList=" + this.clientDataIdList + '}';
    }
}
