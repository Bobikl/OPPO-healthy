package com.heytap.health.menstrual_period.data;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.c8l;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/menstrual_period/data/SymptomSubTypeData;", "", "bitPos", "", c8l.IMAGE_KEY, "", "text", "", "Lcom/heytap/health/menstrual_period/data/SymptomTextsData;", "(ILjava/lang/String;Ljava/util/List;)V", "getBitPos", "()I", "getImage", "()Ljava/lang/String;", "getText", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SymptomSubTypeData {
    public static final int $stable = 8;
    private final int bitPos;

    @NotNull
    private final String image;

    @NotNull
    private final List<SymptomTextsData> text;

    public SymptomSubTypeData(int i, @NotNull String image, @NotNull List<SymptomTextsData> text) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(text, "text");
        this.bitPos = i;
        this.image = image;
        this.text = text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SymptomSubTypeData copy$default(SymptomSubTypeData symptomSubTypeData, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = symptomSubTypeData.bitPos;
        }
        if ((i2 & 2) != 0) {
            str = symptomSubTypeData.image;
        }
        if ((i2 & 4) != 0) {
            list = symptomSubTypeData.text;
        }
        return symptomSubTypeData.copy(i, str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBitPos() {
        return this.bitPos;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final List<SymptomTextsData> component3() {
        return this.text;
    }

    @NotNull
    public final SymptomSubTypeData copy(int bitPos, @NotNull String image, @NotNull List<SymptomTextsData> text) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(text, "text");
        return new SymptomSubTypeData(bitPos, image, text);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SymptomSubTypeData)) {
            return false;
        }
        SymptomSubTypeData symptomSubTypeData = (SymptomSubTypeData) other;
        return this.bitPos == symptomSubTypeData.bitPos && Intrinsics.areEqual(this.image, symptomSubTypeData.image) && Intrinsics.areEqual(this.text, symptomSubTypeData.text);
    }

    public final int getBitPos() {
        return this.bitPos;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final List<SymptomTextsData> getText() {
        return this.text;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.bitPos) * 31) + this.image.hashCode()) * 31) + this.text.hashCode();
    }

    @NotNull
    public String toString() {
        return "SymptomSubTypeData(bitPos=" + this.bitPos + ", image=" + this.image + ", text=" + this.text + ")";
    }
}
