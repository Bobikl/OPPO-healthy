package com.heytap.sporthealth.blib.compose.composable;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import com.heytap.databaseengine.model.UserInfo;
import com.oplus.aiunit.vision.b2n;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Bj\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014\u0012\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u001fø\u0001\u0000¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00148\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\n\u0010\u0017R\u001f\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R#\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u000f\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/heytap/sporthealth/blib/compose/composable/MultiProgressBarBean;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", UserInfo.SEX_FEMALE, "c", "()F", "progress", "b", "I", "getCount", "()I", "count", "", "Ljava/util/List;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/util/List;", "valueList", "d", "showLabel", "Landroidx/compose/ui/graphics/Color;", "colorList", "f", "weightList", "Lkotlin/Function1;", b2n.f, "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "labelFormatter", "<init>", "(FILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "lib_ui_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class MultiProgressBarBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final float progress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int count;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<Integer> valueList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Boolean> showLabel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<Color> colorList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final List<Float> weightList;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public final Function1<Integer, String> labelFormatter;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiProgressBarBean(float f, int i, @NotNull List<Integer> valueList, @NotNull List<Boolean> showLabel, @NotNull List<Color> colorList, @Nullable List<Float> list, @NotNull Function1<? super Integer, String> labelFormatter) {
        Intrinsics.checkNotNullParameter(valueList, "valueList");
        Intrinsics.checkNotNullParameter(showLabel, "showLabel");
        Intrinsics.checkNotNullParameter(colorList, "colorList");
        Intrinsics.checkNotNullParameter(labelFormatter, "labelFormatter");
        this.progress = f;
        this.count = i;
        this.valueList = valueList;
        this.showLabel = showLabel;
        this.colorList = colorList;
        this.weightList = list;
        this.labelFormatter = labelFormatter;
    }

    @NotNull
    public final List<Color> a() {
        return this.colorList;
    }

    @NotNull
    public final Function1<Integer, String> b() {
        return this.labelFormatter;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    @NotNull
    public final List<Boolean> d() {
        return this.showLabel;
    }

    @NotNull
    public final List<Integer> e() {
        return this.valueList;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiProgressBarBean)) {
            return false;
        }
        MultiProgressBarBean multiProgressBarBean = (MultiProgressBarBean) other;
        return Float.compare(this.progress, multiProgressBarBean.progress) == 0 && this.count == multiProgressBarBean.count && Intrinsics.areEqual(this.valueList, multiProgressBarBean.valueList) && Intrinsics.areEqual(this.showLabel, multiProgressBarBean.showLabel) && Intrinsics.areEqual(this.colorList, multiProgressBarBean.colorList) && Intrinsics.areEqual(this.weightList, multiProgressBarBean.weightList) && Intrinsics.areEqual(this.labelFormatter, multiProgressBarBean.labelFormatter);
    }

    @Nullable
    public final List<Float> f() {
        return this.weightList;
    }

    public int hashCode() {
        int iHashCode = ((((((((Float.hashCode(this.progress) * 31) + Integer.hashCode(this.count)) * 31) + this.valueList.hashCode()) * 31) + this.showLabel.hashCode()) * 31) + this.colorList.hashCode()) * 31;
        List<Float> list = this.weightList;
        return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.labelFormatter.hashCode();
    }

    @NotNull
    public String toString() {
        return "MultiProgressBarBean(progress=" + this.progress + ", count=" + this.count + ", valueList=" + this.valueList + ", showLabel=" + this.showLabel + ", colorList=" + this.colorList + ", weightList=" + this.weightList + ", labelFormatter=" + this.labelFormatter + ")";
    }

    public /* synthetic */ MultiProgressBarBean(float f, int i, List list, List list2, List list3, List list4, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, i, list, list2, list3, list4, (i2 & 64) != 0 ? new Function1<Integer, String>() { // from class: com.heytap.sporthealth.blib.compose.composable.MultiProgressBarBean.1
            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ String invoke(Integer num) {
                return invoke(num.intValue());
            }

            @NotNull
            public final String invoke(int i3) {
                return String.valueOf(i3);
            }
        } : function1);
    }
}
