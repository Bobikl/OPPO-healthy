package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.dn6, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR\"\u0010\u001a\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR$\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\r¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/dn6;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "setBase64EncodeMsgHead", "(Ljava/lang/String;)V", "base64EncodeMsgHead", "b", "setBase64EncodeMsgTail", "base64EncodeMsgTail", "c", "d", "setBase64PaddingChar", "base64PaddingChar", "Z", "()Z", "setBase64FinalResultShouldReverse", "(Z)V", "base64FinalResultShouldReverse", MapSchema.FIELD_NAME_ENTRY, "setRsaPubKeyString", "rsaPubKeyString", "f", "setRsaTransformation", "rsaTransformation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "OLog_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class EncryptConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public String base64EncodeMsgHead;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public String base64EncodeMsgTail;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public String base64PaddingChar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public boolean base64FinalResultShouldReverse;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public String rsaPubKeyString;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public String rsaTransformation;

    public EncryptConfig() {
        this(null, null, null, false, null, null, 63, null);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBase64EncodeMsgHead() {
        return this.base64EncodeMsgHead;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBase64EncodeMsgTail() {
        return this.base64EncodeMsgTail;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getBase64FinalResultShouldReverse() {
        return this.base64FinalResultShouldReverse;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getBase64PaddingChar() {
        return this.base64PaddingChar;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRsaPubKeyString() {
        return this.rsaPubKeyString;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncryptConfig)) {
            return false;
        }
        EncryptConfig encryptConfig = (EncryptConfig) other;
        return Intrinsics.areEqual(this.base64EncodeMsgHead, encryptConfig.base64EncodeMsgHead) && Intrinsics.areEqual(this.base64EncodeMsgTail, encryptConfig.base64EncodeMsgTail) && Intrinsics.areEqual(this.base64PaddingChar, encryptConfig.base64PaddingChar) && this.base64FinalResultShouldReverse == encryptConfig.base64FinalResultShouldReverse && Intrinsics.areEqual(this.rsaPubKeyString, encryptConfig.rsaPubKeyString) && Intrinsics.areEqual(this.rsaTransformation, encryptConfig.rsaTransformation);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getRsaTransformation() {
        return this.rsaTransformation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    public int hashCode() {
        String str = this.base64EncodeMsgHead;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.base64EncodeMsgTail;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.base64PaddingChar;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z = this.base64FinalResultShouldReverse;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode3 + r2) * 31;
        String str4 = this.rsaPubKeyString;
        int iHashCode4 = (i + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rsaTransformation;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EncryptConfig(base64EncodeMsgHead=" + this.base64EncodeMsgHead + ", base64EncodeMsgTail=" + this.base64EncodeMsgTail + ", base64PaddingChar=" + this.base64PaddingChar + ", base64FinalResultShouldReverse=" + this.base64FinalResultShouldReverse + ", rsaPubKeyString=" + this.rsaPubKeyString + ", rsaTransformation=" + this.rsaTransformation + ")";
    }

    public EncryptConfig(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, @Nullable String str4, @Nullable String str5) {
        this.base64EncodeMsgHead = str;
        this.base64EncodeMsgTail = str2;
        this.base64PaddingChar = str3;
        this.base64FinalResultShouldReverse = z;
        this.rsaPubKeyString = str4;
        this.rsaTransformation = str5;
    }

    public /* synthetic */ EncryptConfig(String str, String str2, String str3, boolean z, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
