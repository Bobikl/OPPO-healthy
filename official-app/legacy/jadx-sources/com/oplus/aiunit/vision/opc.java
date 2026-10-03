package com.oplus.aiunit.vision;

import com.heytap.log.consts.LogSenderConst;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.codec.language.Soundex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/opc;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getCallStartType", "()Ljava/lang/String;", "callStartType", "", "b", "Ljava/util/List;", "()Ljava/util/List;", LogSenderConst.SUBTYPE, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final /* data */ class opc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String callStartType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<String> subType;

    public opc(@NotNull String callStartType, @NotNull List<String> subType) {
        Intrinsics.checkNotNullParameter(callStartType, "callStartType");
        Intrinsics.checkNotNullParameter(subType, "subType");
        this.callStartType = callStartType;
        this.subType = subType;
    }

    @NotNull
    public final List<String> a() {
        return this.subType;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof opc)) {
            return false;
        }
        opc opcVar = (opc) other;
        return Intrinsics.areEqual(this.callStartType, opcVar.callStartType) && Intrinsics.areEqual(this.subType, opcVar.subType);
    }

    public int hashCode() {
        String str = this.callStartType;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.subType;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<String> list = this.subType;
        return this.callStartType + Soundex.SILENT_MARKER + (list == null || list.isEmpty() ? "null" : CollectionsKt___CollectionsKt.joinToString$default(this.subType, ";", null, null, 0, null, null, 62, null));
    }

    public /* synthetic */ opc(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new ArrayList() : list);
    }
}
