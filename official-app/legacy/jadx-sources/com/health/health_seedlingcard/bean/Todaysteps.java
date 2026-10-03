package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006,"}, d2 = {"Lcom/health/health_seedlingcard/bean/Todaysteps;", "", "distanceUnit", "", ParserTag.TAG_PERCENT, "", "tips1x2", "title1x2", "totalCalories", "totalDistance", "totalSteps", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDistanceUnit", "()Ljava/lang/String;", "setDistanceUnit", "(Ljava/lang/String;)V", "getPercent", "()F", "setPercent", "(F)V", "getTips1x2", "setTips1x2", "getTitle1x2", "setTitle1x2", "getTotalCalories", "setTotalCalories", "getTotalDistance", "setTotalDistance", "getTotalSteps", "setTotalSteps", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Todaysteps {

    @NotNull
    private String distanceUnit;
    private float percent;

    @NotNull
    private String tips1x2;

    @NotNull
    private String title1x2;

    @NotNull
    private String totalCalories;

    @NotNull
    private String totalDistance;

    @NotNull
    private String totalSteps;

    public Todaysteps(@NotNull String distanceUnit, float f, @NotNull String tips1x2, @NotNull String title1x2, @NotNull String totalCalories, @NotNull String totalDistance, @NotNull String totalSteps) {
        Intrinsics.checkNotNullParameter(distanceUnit, "distanceUnit");
        Intrinsics.checkNotNullParameter(tips1x2, "tips1x2");
        Intrinsics.checkNotNullParameter(title1x2, "title1x2");
        Intrinsics.checkNotNullParameter(totalCalories, "totalCalories");
        Intrinsics.checkNotNullParameter(totalDistance, "totalDistance");
        Intrinsics.checkNotNullParameter(totalSteps, "totalSteps");
        this.distanceUnit = distanceUnit;
        this.percent = f;
        this.tips1x2 = tips1x2;
        this.title1x2 = title1x2;
        this.totalCalories = totalCalories;
        this.totalDistance = totalDistance;
        this.totalSteps = totalSteps;
    }

    public static /* synthetic */ Todaysteps copy$default(Todaysteps todaysteps, String str, float f, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = todaysteps.distanceUnit;
        }
        if ((i & 2) != 0) {
            f = todaysteps.percent;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            str2 = todaysteps.tips1x2;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = todaysteps.title1x2;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = todaysteps.totalCalories;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = todaysteps.totalDistance;
        }
        String str10 = str5;
        if ((i & 64) != 0) {
            str6 = todaysteps.totalSteps;
        }
        return todaysteps.copy(str, f2, str7, str8, str9, str10, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDistanceUnit() {
        return this.distanceUnit;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getPercent() {
        return this.percent;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTips1x2() {
        return this.tips1x2;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle1x2() {
        return this.title1x2;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTotalCalories() {
        return this.totalCalories;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTotalDistance() {
        return this.totalDistance;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTotalSteps() {
        return this.totalSteps;
    }

    @NotNull
    public final Todaysteps copy(@NotNull String distanceUnit, float percent, @NotNull String tips1x2, @NotNull String title1x2, @NotNull String totalCalories, @NotNull String totalDistance, @NotNull String totalSteps) {
        Intrinsics.checkNotNullParameter(distanceUnit, "distanceUnit");
        Intrinsics.checkNotNullParameter(tips1x2, "tips1x2");
        Intrinsics.checkNotNullParameter(title1x2, "title1x2");
        Intrinsics.checkNotNullParameter(totalCalories, "totalCalories");
        Intrinsics.checkNotNullParameter(totalDistance, "totalDistance");
        Intrinsics.checkNotNullParameter(totalSteps, "totalSteps");
        return new Todaysteps(distanceUnit, percent, tips1x2, title1x2, totalCalories, totalDistance, totalSteps);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Todaysteps)) {
            return false;
        }
        Todaysteps todaysteps = (Todaysteps) other;
        return Intrinsics.areEqual(this.distanceUnit, todaysteps.distanceUnit) && Float.compare(this.percent, todaysteps.percent) == 0 && Intrinsics.areEqual(this.tips1x2, todaysteps.tips1x2) && Intrinsics.areEqual(this.title1x2, todaysteps.title1x2) && Intrinsics.areEqual(this.totalCalories, todaysteps.totalCalories) && Intrinsics.areEqual(this.totalDistance, todaysteps.totalDistance) && Intrinsics.areEqual(this.totalSteps, todaysteps.totalSteps);
    }

    @NotNull
    public final String getDistanceUnit() {
        return this.distanceUnit;
    }

    public final float getPercent() {
        return this.percent;
    }

    @NotNull
    public final String getTips1x2() {
        return this.tips1x2;
    }

    @NotNull
    public final String getTitle1x2() {
        return this.title1x2;
    }

    @NotNull
    public final String getTotalCalories() {
        return this.totalCalories;
    }

    @NotNull
    public final String getTotalDistance() {
        return this.totalDistance;
    }

    @NotNull
    public final String getTotalSteps() {
        return this.totalSteps;
    }

    public int hashCode() {
        return (((((((((((this.distanceUnit.hashCode() * 31) + Float.hashCode(this.percent)) * 31) + this.tips1x2.hashCode()) * 31) + this.title1x2.hashCode()) * 31) + this.totalCalories.hashCode()) * 31) + this.totalDistance.hashCode()) * 31) + this.totalSteps.hashCode();
    }

    public final void setDistanceUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.distanceUnit = str;
    }

    public final void setPercent(float f) {
        this.percent = f;
    }

    public final void setTips1x2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tips1x2 = str;
    }

    public final void setTitle1x2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title1x2 = str;
    }

    public final void setTotalCalories(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.totalCalories = str;
    }

    public final void setTotalDistance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.totalDistance = str;
    }

    public final void setTotalSteps(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.totalSteps = str;
    }

    @NotNull
    public String toString() {
        return "Todaysteps(distanceUnit=" + this.distanceUnit + ", percent=" + this.percent + ", tips1x2=" + this.tips1x2 + ", title1x2=" + this.title1x2 + ", totalCalories=" + this.totalCalories + ", totalDistance=" + this.totalDistance + ", totalSteps=" + this.totalSteps + ")";
    }
}
