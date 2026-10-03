package com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity;

import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.anotation.FieldIndex;
import com.oplus.aiunit.vision.m04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/oplus/nearx/track/internal/remoteconfig/cloudconfig/entity/AppConfigFlexibleEntity;", "", "enableUploadTrack", "", "(Z)V", "getEnableUploadTrack", "()Z", "setEnableUploadTrack", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "core-statistics_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class AppConfigFlexibleEntity {

    @FieldIndex(index = 1)
    private boolean enableUploadTrack;

    public AppConfigFlexibleEntity() {
        this(false, 1, null);
    }

    public static /* synthetic */ AppConfigFlexibleEntity copy$default(AppConfigFlexibleEntity appConfigFlexibleEntity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = appConfigFlexibleEntity.enableUploadTrack;
        }
        return appConfigFlexibleEntity.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnableUploadTrack() {
        return this.enableUploadTrack;
    }

    @NotNull
    public final AppConfigFlexibleEntity copy(boolean enableUploadTrack) {
        return new AppConfigFlexibleEntity(enableUploadTrack);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AppConfigFlexibleEntity) && this.enableUploadTrack == ((AppConfigFlexibleEntity) other).enableUploadTrack;
    }

    public final boolean getEnableUploadTrack() {
        return this.enableUploadTrack;
    }

    public int hashCode() {
        boolean z = this.enableUploadTrack;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final void setEnableUploadTrack(boolean z) {
        this.enableUploadTrack = z;
    }

    @NotNull
    public String toString() {
        return "AppConfigFlexibleEntity(enableUploadTrack=" + this.enableUploadTrack + ')';
    }

    public AppConfigFlexibleEntity(boolean z) {
        this.enableUploadTrack = z;
    }

    public /* synthetic */ AppConfigFlexibleEntity(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? m04.INSTANCE.l() : z);
    }
}
