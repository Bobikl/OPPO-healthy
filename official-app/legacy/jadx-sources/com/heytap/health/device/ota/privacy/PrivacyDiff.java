package com.heytap.health.device.ota.privacy;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/device/ota/privacy/PrivacyDiff;", "", "id", "", "content", "", "(ILjava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getId", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "deviceota_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PrivacyDiff {

    @NotNull
    private final String content;
    private final int id;

    public PrivacyDiff(int i, @NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = i;
        this.content = content;
    }

    public static /* synthetic */ PrivacyDiff copy$default(PrivacyDiff privacyDiff, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = privacyDiff.id;
        }
        if ((i2 & 2) != 0) {
            str = privacyDiff.content;
        }
        return privacyDiff.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final PrivacyDiff copy(int id, @NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new PrivacyDiff(id, content);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivacyDiff)) {
            return false;
        }
        PrivacyDiff privacyDiff = (PrivacyDiff) other;
        return this.id == privacyDiff.id && Intrinsics.areEqual(this.content, privacyDiff.content);
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return (Integer.hashCode(this.id) * 31) + this.content.hashCode();
    }

    @NotNull
    public String toString() {
        return "PrivacyDiff(id=" + this.id + ", content=" + this.content + ")";
    }
}
