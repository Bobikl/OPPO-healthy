package com.heytap.health.voiceassistant.tts;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/voiceassistant/tts/WatchMemoryInfo;", "", "relyAppInfo", "Lcom/heytap/health/voiceassistant/tts/RelyAppInfo;", "relatedPhoneInfo", "Lcom/heytap/health/voiceassistant/tts/RelatedPhoneInfo;", "(Lcom/heytap/health/voiceassistant/tts/RelyAppInfo;Lcom/heytap/health/voiceassistant/tts/RelatedPhoneInfo;)V", "getRelatedPhoneInfo", "()Lcom/heytap/health/voiceassistant/tts/RelatedPhoneInfo;", "setRelatedPhoneInfo", "(Lcom/heytap/health/voiceassistant/tts/RelatedPhoneInfo;)V", "getRelyAppInfo", "()Lcom/heytap/health/voiceassistant/tts/RelyAppInfo;", "setRelyAppInfo", "(Lcom/heytap/health/voiceassistant/tts/RelyAppInfo;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WatchMemoryInfo {

    @Nullable
    private RelatedPhoneInfo relatedPhoneInfo;

    @Nullable
    private RelyAppInfo relyAppInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public WatchMemoryInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WatchMemoryInfo copy$default(WatchMemoryInfo watchMemoryInfo, RelyAppInfo relyAppInfo, RelatedPhoneInfo relatedPhoneInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            relyAppInfo = watchMemoryInfo.relyAppInfo;
        }
        if ((i & 2) != 0) {
            relatedPhoneInfo = watchMemoryInfo.relatedPhoneInfo;
        }
        return watchMemoryInfo.copy(relyAppInfo, relatedPhoneInfo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RelyAppInfo getRelyAppInfo() {
        return this.relyAppInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RelatedPhoneInfo getRelatedPhoneInfo() {
        return this.relatedPhoneInfo;
    }

    @NotNull
    public final WatchMemoryInfo copy(@Nullable RelyAppInfo relyAppInfo, @Nullable RelatedPhoneInfo relatedPhoneInfo) {
        return new WatchMemoryInfo(relyAppInfo, relatedPhoneInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchMemoryInfo)) {
            return false;
        }
        WatchMemoryInfo watchMemoryInfo = (WatchMemoryInfo) other;
        return Intrinsics.areEqual(this.relyAppInfo, watchMemoryInfo.relyAppInfo) && Intrinsics.areEqual(this.relatedPhoneInfo, watchMemoryInfo.relatedPhoneInfo);
    }

    @Nullable
    public final RelatedPhoneInfo getRelatedPhoneInfo() {
        return this.relatedPhoneInfo;
    }

    @Nullable
    public final RelyAppInfo getRelyAppInfo() {
        return this.relyAppInfo;
    }

    public int hashCode() {
        RelyAppInfo relyAppInfo = this.relyAppInfo;
        int iHashCode = (relyAppInfo == null ? 0 : relyAppInfo.hashCode()) * 31;
        RelatedPhoneInfo relatedPhoneInfo = this.relatedPhoneInfo;
        return iHashCode + (relatedPhoneInfo != null ? relatedPhoneInfo.hashCode() : 0);
    }

    public final void setRelatedPhoneInfo(@Nullable RelatedPhoneInfo relatedPhoneInfo) {
        this.relatedPhoneInfo = relatedPhoneInfo;
    }

    public final void setRelyAppInfo(@Nullable RelyAppInfo relyAppInfo) {
        this.relyAppInfo = relyAppInfo;
    }

    @NotNull
    public String toString() {
        return "WatchMemoryInfo(relyAppInfo=" + this.relyAppInfo + ", relatedPhoneInfo=" + this.relatedPhoneInfo + ")";
    }

    public WatchMemoryInfo(@Nullable RelyAppInfo relyAppInfo, @Nullable RelatedPhoneInfo relatedPhoneInfo) {
        this.relyAppInfo = relyAppInfo;
        this.relatedPhoneInfo = relatedPhoneInfo;
    }

    public /* synthetic */ WatchMemoryInfo(RelyAppInfo relyAppInfo, RelatedPhoneInfo relatedPhoneInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : relyAppInfo, (i & 2) != 0 ? null : relatedPhoneInfo);
    }
}
