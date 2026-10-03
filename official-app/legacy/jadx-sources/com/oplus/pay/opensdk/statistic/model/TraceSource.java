package com.oplus.pay.opensdk.statistic.model;

import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.platform.usercenter.account.newcommon.router.LinkInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/oplus/pay/opensdk/statistic/model/TraceSource;", "", "value", "", DBHealthReviewPlan.DESC, "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "getValue", "Merch", LinkInfo.CALL_TYPE_SDK, "paysdk_statistic_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum TraceSource {
    Merch("Merch", "商户"),
    SDK(LinkInfo.CALL_TYPE_SDK, "支付sdk");


    @NotNull
    private final String desc;

    @NotNull
    private final String value;

    TraceSource(String str, String str2) {
        this.value = str;
        this.desc = str2;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
