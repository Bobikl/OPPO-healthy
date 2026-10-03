package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.record.util.RecordHelper;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.e5j, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\t\u0010\u0017R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\r\u0010\u0017R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/e5j;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "isMale", "()Z", "b", "I", MapSchema.FIELD_NAME_ENTRY, "()I", "pace", "c", "getSwimType", "swimType", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "level", "levelIcon", "f", "levelImg", b2n.f, "levelDes", b2n.g, "swimTypeName", "<init>", "(ZIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SwimGradeBean {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean isMale;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int pace;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int swimType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer level;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Integer levelIcon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer levelImg;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer levelDes;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer swimTypeName;

    public SwimGradeBean(boolean z, int i, int i2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5) {
        this.isMale = z;
        this.pace = i;
        this.swimType = i2;
        this.level = num;
        this.levelIcon = num2;
        this.levelImg = num3;
        this.levelDes = num4;
        this.swimTypeName = num5;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getLevel() {
        return this.level;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getLevelDes() {
        return this.levelDes;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getLevelIcon() {
        return this.levelIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getLevelImg() {
        return this.levelImg;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getPace() {
        return this.pace;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwimGradeBean)) {
            return false;
        }
        SwimGradeBean swimGradeBean = (SwimGradeBean) other;
        return this.isMale == swimGradeBean.isMale && this.pace == swimGradeBean.pace && this.swimType == swimGradeBean.swimType && Intrinsics.areEqual(this.level, swimGradeBean.level) && Intrinsics.areEqual(this.levelIcon, swimGradeBean.levelIcon) && Intrinsics.areEqual(this.levelImg, swimGradeBean.levelImg) && Intrinsics.areEqual(this.levelDes, swimGradeBean.levelDes) && Intrinsics.areEqual(this.swimTypeName, swimGradeBean.swimTypeName);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getSwimTypeName() {
        return this.swimTypeName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    public int hashCode() {
        boolean z = this.isMale;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((((r0 * 31) + Integer.hashCode(this.pace)) * 31) + Integer.hashCode(this.swimType)) * 31;
        Integer num = this.level;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.levelIcon;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.levelImg;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.levelDes;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.swimTypeName;
        return iHashCode5 + (num5 != null ? num5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SwimGradeBean(isMale=" + this.isMale + ", pace=" + this.pace + ", swimType=" + this.swimType + ", level=" + this.level + ", levelIcon=" + this.levelIcon + ", levelImg=" + this.levelImg + ", levelDes=" + this.levelDes + ", swimTypeName=" + this.swimTypeName + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SwimGradeBean(boolean z, int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        Integer numB = (i3 & 8) != 0 ? f5j.INSTANCE.b(z, i2, i) : num;
        this(z, i, i2, numB, (i3 & 16) != 0 ? f5j.INSTANCE.c(numB) : num2, (i3 & 32) != 0 ? f5j.INSTANCE.d(numB) : num3, (i3 & 64) != 0 ? f5j.INSTANCE.e(numB) : num4, (i3 & 128) != 0 ? Integer.valueOf(RecordHelper.INSTANCE.f(i2)) : num5);
    }
}
