package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/health_archives/bean/HealthTags;", "", "name", "", ClickApiEntity.TIME, "source", ConnectIdLogic.PARAM_EXT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getExt", "()Ljava/lang/String;", "setExt", "(Ljava/lang/String;)V", "getName", "setName", "getSource", "setSource", "getTime", "setTime", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HealthTags {

    @Nullable
    private String ext;

    @Nullable
    private String name;

    @Nullable
    private String source;

    @Nullable
    private String time;

    public HealthTags() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ HealthTags copy$default(HealthTags healthTags, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = healthTags.name;
        }
        if ((i & 2) != 0) {
            str2 = healthTags.time;
        }
        if ((i & 4) != 0) {
            str3 = healthTags.source;
        }
        if ((i & 8) != 0) {
            str4 = healthTags.ext;
        }
        return healthTags.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExt() {
        return this.ext;
    }

    @NotNull
    public final HealthTags copy(@Nullable String name, @Nullable String time, @Nullable String source, @Nullable String ext) {
        return new HealthTags(name, time, source, ext);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthTags)) {
            return false;
        }
        HealthTags healthTags = (HealthTags) other;
        return Intrinsics.areEqual(this.name, healthTags.name) && Intrinsics.areEqual(this.time, healthTags.time) && Intrinsics.areEqual(this.source, healthTags.source) && Intrinsics.areEqual(this.ext, healthTags.ext);
    }

    @Nullable
    public final String getExt() {
        return this.ext;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final String getTime() {
        return this.time;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.time;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.source;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ext;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setExt(@Nullable String str) {
        this.ext = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setSource(@Nullable String str) {
        this.source = str;
    }

    public final void setTime(@Nullable String str) {
        this.time = str;
    }

    @NotNull
    public String toString() {
        return "HealthTags(name=" + this.name + ", time=" + this.time + ", source=" + this.source + ", ext=" + this.ext + ")";
    }

    public HealthTags(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.name = str;
        this.time = str2;
        this.source = str3;
        this.ext = str4;
    }

    public /* synthetic */ HealthTags(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
