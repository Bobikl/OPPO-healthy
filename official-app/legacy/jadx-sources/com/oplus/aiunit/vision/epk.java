package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import com.oplus.accountsdk.open.core.web.executor.AcOpenGetTokenExecutor;

/* JADX INFO: loaded from: classes16.dex */
public class epk {

    @SerializedName("userId")
    private String a;

    @SerializedName("userName")
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(AcOpenGetTokenExecutor.ACCOUNT_NAME_KEY)
    private String f11011c;

    @SerializedName("userNameNeedModify")
    private boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("status")
    private String f11012e;

    @SerializedName("country")
    private String f;

    public String a() {
        return this.f11011c;
    }
}
