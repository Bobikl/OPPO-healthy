package com.oplus.aiunit.core.data;

import com.oplus.pantanal.seedling.constants.TraceConstants;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.enums.EnumEntries;
import p010kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/core/data/ServiceType;", "", TraceConstants.KEY_PKG_NAME, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getPkgName", "()Ljava/lang/String;", "NONE", "AIUNIT", "OCRSERVICE", "aiunit.sdk.toolkits_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum ServiceType {
    NONE(""),
    AIUNIT("com.oplus.aiunit"),
    OCRSERVICE("com.coloros.ocrservice");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final String pkgName;

    ServiceType(String str) {
        this.pkgName = str;
    }

    @NotNull
    public static EnumEntries<ServiceType> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getPkgName() {
        return this.pkgName;
    }
}
