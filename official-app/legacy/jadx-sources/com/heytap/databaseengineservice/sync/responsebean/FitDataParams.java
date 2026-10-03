package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class FitDataParams<T> {

    @SerializedName("dataList")
    private List<T> list;

    public FitDataParams(List<T> list) {
        this.list = list;
    }

    public String toString() {
        return "FitDataParams{, list=" + this.list + '}';
    }
}
