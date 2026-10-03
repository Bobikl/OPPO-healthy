package com.heytap.databaseengineservice.sync.weight;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.oplus.aiunit.vision.t6f;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class DeleteUnsignedWeightReq {

    @SerializedName(t6f.WEIGHT_ID)
    private String weightId;

    @SerializedName("weightIdList")
    private List<String> weightIdList;

    public DeleteUnsignedWeightReq(List<String> list) {
        this.weightIdList = list;
    }

    public DeleteUnsignedWeightReq(String str) {
        this.weightId = str;
    }
}
