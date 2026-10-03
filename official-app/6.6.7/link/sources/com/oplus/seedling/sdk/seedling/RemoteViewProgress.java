package com.oplus.seedling.sdk.seedling;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\bH\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/oplus/seedling/sdk/seedling/RemoteViewProgress;", "", "progressIcon", "", "progressBackgroundColor", "", "progressColor", "progressPercent", "", "([BLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getProgressBackgroundColor", "()Ljava/lang/String;", "getProgressColor", "getProgressIcon", "()[B", "getProgressPercent", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "([BLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/oplus/seedling/sdk/seedling/RemoteViewProgress;", "equals", "", "other", "hashCode", "toString", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RemoteViewProgress {

    @Nullable
    private final String progressBackgroundColor;

    @Nullable
    private final String progressColor;

    @Nullable
    private final byte[] progressIcon;

    @Nullable
    private final Integer progressPercent;

    public RemoteViewProgress() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ RemoteViewProgress copy$default(RemoteViewProgress remoteViewProgress, byte[] bArr, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = remoteViewProgress.progressIcon;
        }
        if ((i & 2) != 0) {
            str = remoteViewProgress.progressBackgroundColor;
        }
        if ((i & 4) != 0) {
            str2 = remoteViewProgress.progressColor;
        }
        if ((i & 8) != 0) {
            num = remoteViewProgress.progressPercent;
        }
        return remoteViewProgress.copy(bArr, str, str2, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte[] getProgressIcon() {
        return this.progressIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProgressBackgroundColor() {
        return this.progressBackgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProgressColor() {
        return this.progressColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getProgressPercent() {
        return this.progressPercent;
    }

    @NotNull
    public final RemoteViewProgress copy(@Nullable byte[] progressIcon, @Nullable String progressBackgroundColor, @Nullable String progressColor, @Nullable Integer progressPercent) {
        return new RemoteViewProgress(progressIcon, progressBackgroundColor, progressColor, progressPercent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(RemoteViewProgress.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.oplus.seedling.sdk.seedling.RemoteViewProgress");
        RemoteViewProgress remoteViewProgress = (RemoteViewProgress) other;
        byte[] bArr = this.progressIcon;
        if (bArr != null) {
            byte[] bArr2 = remoteViewProgress.progressIcon;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (remoteViewProgress.progressIcon != null) {
            return false;
        }
        return Intrinsics.areEqual(this.progressBackgroundColor, remoteViewProgress.progressBackgroundColor) && Intrinsics.areEqual(this.progressColor, remoteViewProgress.progressColor) && Intrinsics.areEqual(this.progressPercent, remoteViewProgress.progressPercent);
    }

    @Nullable
    public final String getProgressBackgroundColor() {
        return this.progressBackgroundColor;
    }

    @Nullable
    public final String getProgressColor() {
        return this.progressColor;
    }

    @Nullable
    public final byte[] getProgressIcon() {
        return this.progressIcon;
    }

    @Nullable
    public final Integer getProgressPercent() {
        return this.progressPercent;
    }

    public int hashCode() {
        byte[] bArr = this.progressIcon;
        int iHashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        String str = this.progressBackgroundColor;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.progressColor;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.progressPercent;
        return iHashCode3 + (num != null ? num.intValue() : 0);
    }

    @NotNull
    public String toString() {
        byte[] bArr = this.progressIcon;
        return "RemoteViewProgress(progressIconSize=" + (bArr != null ? Integer.valueOf(bArr.length) : null) + ", progressBackgroundColor=" + this.progressBackgroundColor + ", progressColor=" + this.progressColor + ", progressPercent=" + this.progressPercent + ")";
    }

    public RemoteViewProgress(@Nullable byte[] bArr, @Nullable String str, @Nullable String str2, @Nullable Integer num) {
        this.progressIcon = bArr;
        this.progressBackgroundColor = str;
        this.progressColor = str2;
        this.progressPercent = num;
    }

    public /* synthetic */ RemoteViewProgress(byte[] bArr, String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bArr, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num);
    }
}
