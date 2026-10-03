package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.uuk, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/uuk;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "verifyCode", "b", "verifyContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class VerifyCode {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String verifyCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String verifyContent;

    public VerifyCode(@NotNull String verifyCode, @Nullable String str) {
        Intrinsics.checkNotNullParameter(verifyCode, "verifyCode");
        this.verifyCode = verifyCode;
        this.verifyContent = str;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyCode)) {
            return false;
        }
        VerifyCode verifyCode = (VerifyCode) other;
        return Intrinsics.areEqual(this.verifyCode, verifyCode.verifyCode) && Intrinsics.areEqual(this.verifyContent, verifyCode.verifyContent);
    }

    public int hashCode() {
        int iHashCode = this.verifyCode.hashCode() * 31;
        String str = this.verifyContent;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "VerifyCode(verifyCode=" + this.verifyCode + ", verifyContent=" + this.verifyContent + ")";
    }
}
