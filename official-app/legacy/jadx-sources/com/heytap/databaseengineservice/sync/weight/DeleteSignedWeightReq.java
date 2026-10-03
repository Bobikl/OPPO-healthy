package com.heytap.databaseengineservice.sync.weight;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.oplus.aiunit.vision.t6f;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class DeleteSignedWeightReq {

    @SerializedName("userTagId")
    private String userTagId;

    @SerializedName(t6f.WEIGHT_ID)
    private String weightId;

    @SerializedName("weightIdList")
    private List<String> weightIdList;

    public DeleteSignedWeightReq(List<String> list) {
        this.weightIdList = list;
    }

    public DeleteSignedWeightReq(String str) {
        this.weightId = str;
    }

    public DeleteSignedWeightReq(String str, List<String> list) {
        this.userTagId = str;
        this.weightIdList = list;
    }

    public DeleteSignedWeightReq(String str, String str2) {
        this.userTagId = str;
        this.weightId = str2;
    }
}
