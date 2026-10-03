package com.oplus.aiunit.vision;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0012\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0006\u0012\b\b\u0002\u0010 \u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0096\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000fR\u0017\u0010\u001e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u001d\u0010\nR\u0017\u0010 \u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\b\u001a\u0004\b \u0010\n¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/mj9;", "", "", "a", "toString", "other", "", "equals", "Z", b2n.f, "()Z", "isEnableDnUnitSet", "b", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "regionUpper", "", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "setInnerWhiteList", "(Ljava/util/List;)V", "innerWhiteList", "enableHttpDns", MapSchema.FIELD_NAME_ENTRY, "region", SpeechConstant.KEY_APP_VERSION, "getEnableDnUnit", "enableDnUnit", b2n.g, "isSyncUpdateDnsList", "<init>", "(ZLjava/lang/String;Ljava/lang/String;ZZ)V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final class mj9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isEnableDnUnitSet;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String regionUpper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<String> innerWhiteList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean enable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String region;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String appVersion;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean enableDnUnit;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final boolean isSyncUpdateDnsList;

    @JvmOverloads
    public mj9(boolean z) {
        this(z, null, null, false, false, 30, null);
    }

    @NotNull
    public final String a() {
        return "";
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final List<String> d() {
        return this.innerWhiteList;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof mj9)) {
            return super.equals(other);
        }
        mj9 mj9Var = (mj9) other;
        return mj9Var.enable == this.enable && Intrinsics.areEqual(mj9Var.region, this.region) && Intrinsics.areEqual(mj9Var.appVersion, this.appVersion) && mj9Var.enableDnUnit == this.enableDnUnit;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getRegionUpper() {
        return this.regionUpper;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsEnableDnUnitSet() {
        return this.isEnableDnUnitSet;
    }

    @NotNull
    public String toString() {
        return "(enable=" + this.enable + ",region=" + this.region + ",appVersion=" + this.appVersion + ",enableUnit=" + this.enableDnUnit + ",innerList=" + this.innerWhiteList + ')';
    }

    @JvmOverloads
    public mj9(boolean z, @NotNull String region, @NotNull String appVersion, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        this.enable = z;
        this.region = region;
        this.appVersion = appVersion;
        this.enableDnUnit = z2;
        this.isSyncUpdateDnsList = z3;
        this.isEnableDnUnitSet = z2;
        if (region == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String upperCase = region.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
        this.regionUpper = upperCase;
        this.innerWhiteList = CollectionsKt__CollectionsKt.emptyList();
    }

    public /* synthetic */ mj9(boolean z, String str, String str2, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? false : z3);
    }
}
