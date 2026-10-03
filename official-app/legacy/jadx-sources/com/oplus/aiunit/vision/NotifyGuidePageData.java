package com.oplus.aiunit.vision;

import com.heytap.wearable.emergency.api.emergency.EmergencyMainApis;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.pyc, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/pyc;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", EmergencyMainApis.EVENT_OPEN_PAGE_PRAM_CODE, "cardCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "operations_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class NotifyGuidePageData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String pageCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String cardCode;

    public NotifyGuidePageData(@NotNull String pageCode, @NotNull String cardCode) {
        Intrinsics.checkNotNullParameter(pageCode, "pageCode");
        Intrinsics.checkNotNullParameter(cardCode, "cardCode");
        this.pageCode = pageCode;
        this.cardCode = cardCode;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCardCode() {
        return this.cardCode;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPageCode() {
        return this.pageCode;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotifyGuidePageData)) {
            return false;
        }
        NotifyGuidePageData notifyGuidePageData = (NotifyGuidePageData) other;
        return Intrinsics.areEqual(this.pageCode, notifyGuidePageData.pageCode) && Intrinsics.areEqual(this.cardCode, notifyGuidePageData.cardCode);
    }

    public int hashCode() {
        return (this.pageCode.hashCode() * 31) + this.cardCode.hashCode();
    }

    @NotNull
    public String toString() {
        return "NotifyGuidePageData(pageCode=" + this.pageCode + ", cardCode=" + this.cardCode + ")";
    }
}
