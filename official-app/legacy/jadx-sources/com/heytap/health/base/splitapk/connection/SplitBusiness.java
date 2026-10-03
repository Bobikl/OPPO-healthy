package com.heytap.health.base.splitapk.connection;

import com.heytap.health.base.R$string;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/heytap/health/base/splitapk/connection/SplitBusiness;", "", "splitName", "", "businessTextId", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getBusinessTextId", "()I", "getSplitName", "()Ljava/lang/String;", "OPERATION", "lib_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum SplitBusiness {
    OPERATION("operation", R$string.lib_base_plugin_operation_goal);

    private final int businessTextId;

    @NotNull
    private final String splitName;

    SplitBusiness(String str, int i) {
        this.splitName = str;
        this.businessTextId = i;
    }

    public final int getBusinessTextId() {
        return this.businessTextId;
    }

    @NotNull
    public final String getSplitName() {
        return this.splitName;
    }
}
