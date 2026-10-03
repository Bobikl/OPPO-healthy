package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.k48, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tBS\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0018\u0010\u001cR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0016\u0010\"¨\u0006&"}, d2 = {"Lcom/oplus/aiunit/vision/k48;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "isImprovement", "()Z", "", "b", "J", "()J", "date", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "generalReviewTitle", "d", "generalReviewDesc", MapSchema.FIELD_NAME_ENTRY, "f", "itemsTitle", "I", "()I", "itemsColumnCount", "", "Lcom/oplus/aiunit/vision/k48$a;", b2n.f, "Ljava/util/List;", "()Ljava/util/List;", "items", "<init>", "(ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class GeneralReviewBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean isImprovement;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long date;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String generalReviewTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String generalReviewDesc;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String itemsTitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final int itemsColumnCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Items> items;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.k48$a, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0015\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/k48$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", Feedback.WIDGET_LABEL, "I", "c", "()I", "labelColor", "d", "value", "avg", MapSchema.FIELD_NAME_ENTRY, "valueStr", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Items {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String label;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int labelColor;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String value;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        public final String avg;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String valueStr;

        public Items() {
            this(null, 0, null, null, null, 31, null);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAvg() {
            return this.avg;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getLabelColor() {
            return this.labelColor;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getValueStr() {
            return this.valueStr;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Items)) {
                return false;
            }
            Items items = (Items) other;
            return Intrinsics.areEqual(this.label, items.label) && this.labelColor == items.labelColor && Intrinsics.areEqual(this.value, items.value) && Intrinsics.areEqual(this.avg, items.avg) && Intrinsics.areEqual(this.valueStr, items.valueStr);
        }

        public int hashCode() {
            return (((((((this.label.hashCode() * 31) + Integer.hashCode(this.labelColor)) * 31) + this.value.hashCode()) * 31) + this.avg.hashCode()) * 31) + this.valueStr.hashCode();
        }

        @NotNull
        public String toString() {
            return "Items(label=" + this.label + ", labelColor=" + this.labelColor + ", value=" + this.value + ", avg=" + this.avg + ", valueStr=" + this.valueStr + ")";
        }

        public Items(@NotNull String label, int i, @NotNull String value, @NotNull String avg, @NotNull String valueStr) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(avg, "avg");
            Intrinsics.checkNotNullParameter(valueStr, "valueStr");
            this.label = label;
            this.labelColor = i;
            this.value = value;
            this.avg = avg;
            this.valueStr = valueStr;
        }

        public /* synthetic */ Items(String str, int i, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -16777216 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4);
        }
    }

    public GeneralReviewBean() {
        this(false, 0L, null, null, null, 0, null, 127, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getGeneralReviewDesc() {
        return this.generalReviewDesc;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getGeneralReviewTitle() {
        return this.generalReviewTitle;
    }

    @NotNull
    public final List<Items> d() {
        return this.items;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getItemsColumnCount() {
        return this.itemsColumnCount;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeneralReviewBean)) {
            return false;
        }
        GeneralReviewBean generalReviewBean = (GeneralReviewBean) other;
        return this.isImprovement == generalReviewBean.isImprovement && this.date == generalReviewBean.date && Intrinsics.areEqual(this.generalReviewTitle, generalReviewBean.generalReviewTitle) && Intrinsics.areEqual(this.generalReviewDesc, generalReviewBean.generalReviewDesc) && Intrinsics.areEqual(this.itemsTitle, generalReviewBean.itemsTitle) && this.itemsColumnCount == generalReviewBean.itemsColumnCount && Intrinsics.areEqual(this.items, generalReviewBean.items);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getItemsTitle() {
        return this.itemsTitle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public int hashCode() {
        boolean z = this.isImprovement;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((((((((r0 * 31) + Long.hashCode(this.date)) * 31) + this.generalReviewTitle.hashCode()) * 31) + this.generalReviewDesc.hashCode()) * 31) + this.itemsTitle.hashCode()) * 31) + Integer.hashCode(this.itemsColumnCount)) * 31) + this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return "GeneralReviewBean(isImprovement=" + this.isImprovement + ", date=" + this.date + ", generalReviewTitle=" + this.generalReviewTitle + ", generalReviewDesc=" + this.generalReviewDesc + ", itemsTitle=" + this.itemsTitle + ", itemsColumnCount=" + this.itemsColumnCount + ", items=" + this.items + ")";
    }

    public GeneralReviewBean(boolean z, long j2, @NotNull String generalReviewTitle, @NotNull String generalReviewDesc, @NotNull String itemsTitle, int i, @NotNull List<Items> items) {
        Intrinsics.checkNotNullParameter(generalReviewTitle, "generalReviewTitle");
        Intrinsics.checkNotNullParameter(generalReviewDesc, "generalReviewDesc");
        Intrinsics.checkNotNullParameter(itemsTitle, "itemsTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.isImprovement = z;
        this.date = j2;
        this.generalReviewTitle = generalReviewTitle;
        this.generalReviewDesc = generalReviewDesc;
        this.itemsTitle = itemsTitle;
        this.itemsColumnCount = i;
        this.items = items;
    }

    public /* synthetic */ GeneralReviewBean(boolean z, long j2, String str, String str2, String str3, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? System.currentTimeMillis() : j2, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) == 0 ? str3 : "", (i2 & 32) != 0 ? 3 : i, (i2 & 64) != 0 ? new ArrayList() : list);
    }
}
