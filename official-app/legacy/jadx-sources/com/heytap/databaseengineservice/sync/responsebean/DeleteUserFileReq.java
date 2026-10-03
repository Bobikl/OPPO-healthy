package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class DeleteUserFileReq {

    @SerializedName("clientFileIdList")
    private List<String> clientFileIdList;

    public DeleteUserFileReq(List<String> list) {
        this.clientFileIdList = list;
    }

    public List<String> getClientFileIdList() {
        return this.clientFileIdList;
    }

    public void setClientFileIdList(List<String> list) {
        this.clientFileIdList = list;
    }

    public String toString() {
        return "DeleteUserFileReq{clientFileIdList=" + this.clientFileIdList + '}';
    }
}
