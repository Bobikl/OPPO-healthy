package com.heytap.health.esim.nsc.dto;

import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/esim/nsc/dto/EsimProfileState;", "", DBHealthReviewPlan.DESC, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "None", "NotAuthRealName", "NotDownload", "OK", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum EsimProfileState {
    None("无状态"),
    NotAuthRealName("未实名"),
    NotDownload("未下载"),
    OK("已安装卡");


    @NotNull
    private final String desc;

    EsimProfileState(String str) {
        this.desc = str;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }
}
