package com.heytap.store.homemodule.helper;

import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0012\u001a\u00020\u000fJ\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/heytap/store/homemodule/helper/DeepLinkTarget;", "", "targetIndex", "", "targetChannel", "", "(ILjava/lang/String;)V", "getTargetChannel", "()Ljava/lang/String;", "getTargetIndex", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "isEmpty", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class DeepLinkTarget {

    @NotNull
    private final String targetChannel;
    private final int targetIndex;

    public DeepLinkTarget(int i, @NotNull String targetChannel) {
        Intrinsics.checkNotNullParameter(targetChannel, "targetChannel");
        this.targetIndex = i;
        this.targetChannel = targetChannel;
    }

    public static /* synthetic */ DeepLinkTarget copy$default(DeepLinkTarget deepLinkTarget, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = deepLinkTarget.targetIndex;
        }
        if ((i2 & 2) != 0) {
            str = deepLinkTarget.targetChannel;
        }
        return deepLinkTarget.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTargetIndex() {
        return this.targetIndex;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTargetChannel() {
        return this.targetChannel;
    }

    @NotNull
    public final DeepLinkTarget copy(int targetIndex, @NotNull String targetChannel) {
        Intrinsics.checkNotNullParameter(targetChannel, "targetChannel");
        return new DeepLinkTarget(targetIndex, targetChannel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeepLinkTarget)) {
            return false;
        }
        DeepLinkTarget deepLinkTarget = (DeepLinkTarget) other;
        return this.targetIndex == deepLinkTarget.targetIndex && Intrinsics.areEqual(this.targetChannel, deepLinkTarget.targetChannel);
    }

    @NotNull
    public final String getTargetChannel() {
        return this.targetChannel;
    }

    public final int getTargetIndex() {
        return this.targetIndex;
    }

    public int hashCode() {
        return (Integer.hashCode(this.targetIndex) * 31) + this.targetChannel.hashCode();
    }

    public final boolean isEmpty() {
        return this.targetIndex < 0 && TextUtils.isEmpty(this.targetChannel);
    }

    @NotNull
    public String toString() {
        return "DeepLinkTarget(targetIndex=" + this.targetIndex + ", targetChannel=" + this.targetChannel + ')';
    }
}
