package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.svl, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00078\u0006X\u0087D¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00078\u0006X\u0087D¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\u000fR(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"¨\u0006("}, d2 = {"Lcom/oplus/aiunit/vision/svl;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "()I", "id", "b", "c", "(I)V", "providerId", "Z", "getChangeProviderEnabled", "()Z", "changeProviderEnabled", "d", "getChangeStyleEnabled", "changeStyleEnabled", MapSchema.FIELD_NAME_ENTRY, "getProviderMode", "setProviderMode", "providerMode", "", "f", "Ljava/util/List;", "getCoordinates", "()Ljava/util/List;", "setCoordinates", "(Ljava/util/List;)V", "coordinates", b2n.f, "getSize", "setSize", "size", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Widget {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("mId")
    private final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("mProviderId")
    private int providerId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("mChangeProviderEnabled")
    private final boolean changeProviderEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("mChangeStyleEnabled")
    private final boolean changeStyleEnabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("mProviderMode")
    private int providerMode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("mCoordinates")
    @NotNull
    private List<String> coordinates;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("mSizes")
    @NotNull
    private List<String> size;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getProviderId() {
        return this.providerId;
    }

    public final void c(int i) {
        this.providerId = i;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Widget)) {
            return false;
        }
        Widget widget = (Widget) other;
        return this.id == widget.id && this.providerId == widget.providerId;
    }

    public int hashCode() {
        return (Integer.hashCode(this.id) * 31) + Integer.hashCode(this.providerId);
    }

    @NotNull
    public String toString() {
        return "Widget(providerMode=" + this.providerMode + ", changeStyleEnabled=" + this.changeStyleEnabled + ", changeProviderEnabled=" + this.changeProviderEnabled + ", providerId=" + this.providerId + ", id=" + this.id + ")";
    }
}
