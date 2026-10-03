package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.gs3, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001d\u001a\u0004\b\t\u0010\u001f\"\u0004\b\u0012\u0010\"R\u001a\u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b\u000e\u0010\u001fR\u001a\u0010(\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u001aR \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0013\u001a\u0004\b*\u0010\u0015¨\u0006,"}, d2 = {"Lcom/oplus/aiunit/vision/gs3;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "getChangeProviderEnabled", "()Z", "changeProviderEnabled", "b", "getChangeStyleEnabled", "changeStyleEnabled", "", "c", "Ljava/util/List;", "getCoordinates", "()Ljava/util/List;", "coordinates", "d", "Ljava/lang/String;", "getFixedColor", "()Ljava/lang/String;", "fixedColor", MapSchema.FIELD_NAME_ENTRY, "I", "getId", "()I", "id", "f", "(I)V", "providerId", b2n.f, "providerMode", b2n.g, "getWidget", "widget", "i", "getSizes", "sizes", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ComplicationConfigs {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("mChangeProviderEnabled")
    private final boolean changeProviderEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("mChangeStyleEnabled")
    private final boolean changeStyleEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("mCoordinates")
    @NotNull
    private final List<Integer> coordinates;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("mFixedColor")
    @NotNull
    private final String fixedColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("mId")
    private final int id;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("mProviderId")
    private int providerId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("mProviderMode")
    private final int providerMode;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName("widget")
    @NotNull
    private final String widget;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName("mSizes")
    @NotNull
    private final List<Integer> sizes;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getProviderId() {
        return this.providerId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getProviderMode() {
        return this.providerMode;
    }

    public final void c(int i) {
        this.providerId = i;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComplicationConfigs)) {
            return false;
        }
        ComplicationConfigs complicationConfigs = (ComplicationConfigs) other;
        return this.changeProviderEnabled == complicationConfigs.changeProviderEnabled && this.changeStyleEnabled == complicationConfigs.changeStyleEnabled && Intrinsics.areEqual(this.coordinates, complicationConfigs.coordinates) && Intrinsics.areEqual(this.fixedColor, complicationConfigs.fixedColor) && this.id == complicationConfigs.id && this.providerId == complicationConfigs.providerId && this.providerMode == complicationConfigs.providerMode && Intrinsics.areEqual(this.widget, complicationConfigs.widget) && Intrinsics.areEqual(this.sizes, complicationConfigs.sizes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    public int hashCode() {
        boolean z = this.changeProviderEnabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.changeStyleEnabled;
        return ((((((((((((((i + (z2 ? 1 : z2)) * 31) + this.coordinates.hashCode()) * 31) + this.fixedColor.hashCode()) * 31) + Integer.hashCode(this.id)) * 31) + Integer.hashCode(this.providerId)) * 31) + Integer.hashCode(this.providerMode)) * 31) + this.widget.hashCode()) * 31) + this.sizes.hashCode();
    }

    @NotNull
    public String toString() {
        return "ComplicationConfigs(changeProviderEnabled=" + this.changeProviderEnabled + ", changeStyleEnabled=" + this.changeStyleEnabled + ", coordinates=" + this.coordinates + ", fixedColor=" + this.fixedColor + ", id=" + this.id + ", providerId=" + this.providerId + ", providerMode=" + this.providerMode + ", widget=" + this.widget + ", sizes=" + this.sizes + ")";
    }
}
