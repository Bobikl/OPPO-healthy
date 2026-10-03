package com.oplus.accountsdk.base.common.net.data;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcGetInitHostResponse {

    @SerializedName("countryDomainMapping")
    public Map<String, String> hostUrlMap;

    @SerializedName("refreshInterval")
    public long refreshInterval;

    @SerializedName("country")
    public String region;
}
