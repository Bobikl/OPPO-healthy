package com.heytap.health.health.family;

import androidx.annotation.Keep;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "Ljava/io/Serializable;", "ssoid", "", "dayTime", "", "(Ljava/lang/String;J)V", "getDayTime", "()J", "getSsoid", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FamilyMoreDataDetailConfigBean implements Serializable {
    private final long dayTime;

    @NotNull
    private final String ssoid;

    public FamilyMoreDataDetailConfigBean(@NotNull String ssoid, long j2) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.ssoid = ssoid;
        this.dayTime = j2;
    }

    public static /* synthetic */ FamilyMoreDataDetailConfigBean copy$default(FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean, String str, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = familyMoreDataDetailConfigBean.ssoid;
        }
        if ((i & 2) != 0) {
            j2 = familyMoreDataDetailConfigBean.dayTime;
        }
        return familyMoreDataDetailConfigBean.copy(str, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSsoid() {
        return this.ssoid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDayTime() {
        return this.dayTime;
    }

    @NotNull
    public final FamilyMoreDataDetailConfigBean copy(@NotNull String ssoid, long dayTime) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        return new FamilyMoreDataDetailConfigBean(ssoid, dayTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyMoreDataDetailConfigBean)) {
            return false;
        }
        FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean = (FamilyMoreDataDetailConfigBean) other;
        return Intrinsics.areEqual(this.ssoid, familyMoreDataDetailConfigBean.ssoid) && this.dayTime == familyMoreDataDetailConfigBean.dayTime;
    }

    public final long getDayTime() {
        return this.dayTime;
    }

    @NotNull
    public final String getSsoid() {
        return this.ssoid;
    }

    public int hashCode() {
        return (this.ssoid.hashCode() * 31) + Long.hashCode(this.dayTime);
    }

    @NotNull
    public String toString() {
        return "FamilyMoreDataDetailConfigBean(ssoid=" + this.ssoid + ", dayTime=" + this.dayTime + ")";
    }
}
