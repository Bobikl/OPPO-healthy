package com.oplus.deepthinker.sdk.app.userprofile.labels;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.f04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/userprofile/labels/ODinLabel;", "", "updateTimeMills", "", f04.KEY_KEY_ID, "", "valueId", "", "(JLjava/lang/String;I)V", "getKeyId", "()Ljava/lang/String;", "setKeyId", "(Ljava/lang/String;)V", "getUpdateTimeMills", "()J", "setUpdateTimeMills", "(J)V", "getValueId", "()I", "setValueId", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class ODinLabel {

    @NotNull
    private String keyId;
    private long updateTimeMills;
    private int valueId;

    public ODinLabel(long j2, @NotNull String keyId, int i) {
        Intrinsics.checkNotNullParameter(keyId, "keyId");
        this.updateTimeMills = j2;
        this.keyId = keyId;
        this.valueId = i;
    }

    public static /* synthetic */ ODinLabel copy$default(ODinLabel oDinLabel, long j2, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = oDinLabel.updateTimeMills;
        }
        if ((i2 & 2) != 0) {
            str = oDinLabel.keyId;
        }
        if ((i2 & 4) != 0) {
            i = oDinLabel.valueId;
        }
        return oDinLabel.copy(j2, str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUpdateTimeMills() {
        return this.updateTimeMills;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKeyId() {
        return this.keyId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getValueId() {
        return this.valueId;
    }

    @NotNull
    public final ODinLabel copy(long updateTimeMills, @NotNull String keyId, int valueId) {
        Intrinsics.checkNotNullParameter(keyId, "keyId");
        return new ODinLabel(updateTimeMills, keyId, valueId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ODinLabel)) {
            return false;
        }
        ODinLabel oDinLabel = (ODinLabel) other;
        return this.updateTimeMills == oDinLabel.updateTimeMills && Intrinsics.areEqual(this.keyId, oDinLabel.keyId) && this.valueId == oDinLabel.valueId;
    }

    @NotNull
    public final String getKeyId() {
        return this.keyId;
    }

    public final long getUpdateTimeMills() {
        return this.updateTimeMills;
    }

    public final int getValueId() {
        return this.valueId;
    }

    public int hashCode() {
        return (((Long.hashCode(this.updateTimeMills) * 31) + this.keyId.hashCode()) * 31) + Integer.hashCode(this.valueId);
    }

    public final void setKeyId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.keyId = str;
    }

    public final void setUpdateTimeMills(long j2) {
        this.updateTimeMills = j2;
    }

    public final void setValueId(int i) {
        this.valueId = i;
    }

    @NotNull
    public String toString() {
        return "ODinLabel(updateTimeMills=" + this.updateTimeMills + ", keyId=" + this.keyId + ", valueId=" + this.valueId + ')';
    }
}
