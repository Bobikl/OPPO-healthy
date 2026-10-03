package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.f2e, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJJ\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/f2e;", "", "", "lapNum", "duration", "distance", "lapPace", "Landroidx/compose/ui/graphics/Color;", "itemColor", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;)Lcom/oplus/aiunit/vision/f2e;", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "d", "c", b2n.f, MapSchema.FIELD_NAME_ENTRY, "Landroidx/compose/ui/graphics/Color;", "()Landroidx/compose/ui/graphics/Color;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PaceSingleLapData {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String lapNum;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String duration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String distance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String lapPace;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Color itemColor;

    public /* synthetic */ PaceSingleLapData(String str, String str2, String str3, String str4, Color color, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, color);
    }

    public static /* synthetic */ PaceSingleLapData b(PaceSingleLapData paceSingleLapData, String str, String str2, String str3, String str4, Color color, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paceSingleLapData.lapNum;
        }
        if ((i & 2) != 0) {
            str2 = paceSingleLapData.duration;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = paceSingleLapData.distance;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = paceSingleLapData.lapPace;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            color = paceSingleLapData.itemColor;
        }
        return paceSingleLapData.a(str, str5, str6, str7, color);
    }

    @NotNull
    public final PaceSingleLapData a(@NotNull String lapNum, @NotNull String duration, @NotNull String distance, @NotNull String lapPace, @Nullable Color itemColor) {
        Intrinsics.checkNotNullParameter(lapNum, "lapNum");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(distance, "distance");
        Intrinsics.checkNotNullParameter(lapPace, "lapPace");
        return new PaceSingleLapData(lapNum, duration, distance, lapPace, itemColor, null);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDistance() {
        return this.distance;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Color getItemColor() {
        return this.itemColor;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaceSingleLapData)) {
            return false;
        }
        PaceSingleLapData paceSingleLapData = (PaceSingleLapData) other;
        return Intrinsics.areEqual(this.lapNum, paceSingleLapData.lapNum) && Intrinsics.areEqual(this.duration, paceSingleLapData.duration) && Intrinsics.areEqual(this.distance, paceSingleLapData.distance) && Intrinsics.areEqual(this.lapPace, paceSingleLapData.lapPace) && Intrinsics.areEqual(this.itemColor, paceSingleLapData.itemColor);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getLapNum() {
        return this.lapNum;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLapPace() {
        return this.lapPace;
    }

    public int hashCode() {
        int iHashCode = ((((((this.lapNum.hashCode() * 31) + this.duration.hashCode()) * 31) + this.distance.hashCode()) * 31) + this.lapPace.hashCode()) * 31;
        Color color = this.itemColor;
        return iHashCode + (color == null ? 0 : Color.m1625hashCodeimpl(color.m1628unboximpl()));
    }

    @NotNull
    public String toString() {
        return "PaceSingleLapData(lapNum=" + this.lapNum + ", duration=" + this.duration + ", distance=" + this.distance + ", lapPace=" + this.lapPace + ", itemColor=" + this.itemColor + ")";
    }

    public PaceSingleLapData(String str, String str2, String str3, String str4, Color color) {
        this.lapNum = str;
        this.duration = str2;
        this.distance = str3;
        this.lapPace = str4;
        this.itemColor = color;
    }

    public /* synthetic */ PaceSingleLapData(String str, String str2, String str3, String str4, Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, str4, (i & 16) != 0 ? null : color, null);
    }
}
