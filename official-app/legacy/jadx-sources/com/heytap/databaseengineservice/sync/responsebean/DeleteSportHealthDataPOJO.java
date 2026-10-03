package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class DeleteSportHealthDataPOJO {

    @SerializedName("idList")
    private List<String> list;

    public DeleteSportHealthDataPOJO(List<String> list) {
        this.list = list;
    }
}
