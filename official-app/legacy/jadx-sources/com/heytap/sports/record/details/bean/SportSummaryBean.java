package com.heytap.sports.record.details.bean;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b0\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0001\u0012B¹\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b;\u0010<JÁ\u0001\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00062\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00062\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\u001a\b\u0002\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R4\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001d\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R4\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010$\"\u0004\b0\u0010&R4\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\"\u001a\u0004\b2\u0010$\"\u0004\b3\u0010&R.\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b.\u00106\"\u0004\b7\u00108R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0017\u001a\u0004\b4\u0010\u0019\"\u0004\b9\u0010\u001bR4\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\"\u001a\u0004\b1\u0010$\"\u0004\b:\u0010&¨\u0006>"}, d2 = {"Lcom/heytap/sports/record/details/bean/SportSummaryBean;", "", "", "shareName", "", "icon", "Lkotlin/Function2;", "Landroid/content/Context;", "title", "quantity", "", "isBest", "value", "unit", "Lkotlin/Function1;", "subSeparator", "subValue", "subUnit", "a", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", "setShareName", "(Ljava/lang/String;)V", "b", "I", "c", "()I", "setIcon", "(I)V", "Lkotlin/jvm/functions/Function2;", "i", "()Lkotlin/jvm/functions/Function2;", "setTitle", "(Lkotlin/jvm/functions/Function2;)V", "d", "setQuantity", "Z", LogFieldKey.LEVEL_KEY, "()Z", "setBest", "(Z)V", "f", MapSchema.FIELD_NAME_KEY, "setValue", b2n.f, "j", "setUnit", b2n.g, "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "setSubSeparator", "(Lkotlin/jvm/functions/Function1;)V", "setSubValue", "setSubUnit", "<init>", "(Ljava/lang/String;ILkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Companion", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SportSummaryBean {

    @NotNull
    public static final String AVG_PACE = "avg_pace";

    @NotNull
    public static final String AVG_SPEED = "avg_speed";

    @NotNull
    public static final String CALORIES = "calories";

    @NotNull
    public static final String DURATION = "duration";

    @NotNull
    public static final String MAX_SPEED = "max_speed";

    @NotNull
    public static final String SKI_DURATION = "ski_duration";

    @NotNull
    public static final String SKI_MAX_DROP = "ski_max_drop";

    @NotNull
    public static final String TRIP_COUNT = "trip_count";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public String shareName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public int icon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public Function2<? super Context, ? super Integer, String> title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public int quantity;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean isBest;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public Function2<? super Context, ? super Integer, String> value;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public Function2<? super Context, ? super Integer, String> unit;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    public Function1<? super Context, String> subSeparator;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    public String subValue;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public Function2<? super Context, ? super Integer, String> subUnit;
    public static final int $stable = 8;

    public SportSummaryBean(@NotNull String shareName, int i, @NotNull Function2<? super Context, ? super Integer, String> title, int i2, boolean z, @NotNull Function2<? super Context, ? super Integer, String> value, @NotNull Function2<? super Context, ? super Integer, String> unit, @NotNull Function1<? super Context, String> subSeparator, @NotNull String subValue, @NotNull Function2<? super Context, ? super Integer, String> subUnit) {
        Intrinsics.checkNotNullParameter(shareName, "shareName");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(subSeparator, "subSeparator");
        Intrinsics.checkNotNullParameter(subValue, "subValue");
        Intrinsics.checkNotNullParameter(subUnit, "subUnit");
        this.shareName = shareName;
        this.icon = i;
        this.title = title;
        this.quantity = i2;
        this.isBest = z;
        this.value = value;
        this.unit = unit;
        this.subSeparator = subSeparator;
        this.subValue = subValue;
        this.subUnit = subUnit;
    }

    @NotNull
    public final SportSummaryBean a(@NotNull String shareName, int icon, @NotNull Function2<? super Context, ? super Integer, String> title, int quantity, boolean isBest, @NotNull Function2<? super Context, ? super Integer, String> value, @NotNull Function2<? super Context, ? super Integer, String> unit, @NotNull Function1<? super Context, String> subSeparator, @NotNull String subValue, @NotNull Function2<? super Context, ? super Integer, String> subUnit) {
        Intrinsics.checkNotNullParameter(shareName, "shareName");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(subSeparator, "subSeparator");
        Intrinsics.checkNotNullParameter(subValue, "subValue");
        Intrinsics.checkNotNullParameter(subUnit, "subUnit");
        return new SportSummaryBean(shareName, icon, title, quantity, isBest, value, unit, subSeparator, subValue, subUnit);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getShareName() {
        return this.shareName;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportSummaryBean)) {
            return false;
        }
        SportSummaryBean sportSummaryBean = (SportSummaryBean) other;
        return Intrinsics.areEqual(this.shareName, sportSummaryBean.shareName) && this.icon == sportSummaryBean.icon && Intrinsics.areEqual(this.title, sportSummaryBean.title) && this.quantity == sportSummaryBean.quantity && this.isBest == sportSummaryBean.isBest && Intrinsics.areEqual(this.value, sportSummaryBean.value) && Intrinsics.areEqual(this.unit, sportSummaryBean.unit) && Intrinsics.areEqual(this.subSeparator, sportSummaryBean.subSeparator) && Intrinsics.areEqual(this.subValue, sportSummaryBean.subValue) && Intrinsics.areEqual(this.subUnit, sportSummaryBean.subUnit);
    }

    @NotNull
    public final Function1<Context, String> f() {
        return this.subSeparator;
    }

    @NotNull
    public final Function2<Context, Integer, String> g() {
        return this.subUnit;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSubValue() {
        return this.subValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((this.shareName.hashCode() * 31) + Integer.hashCode(this.icon)) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.quantity)) * 31;
        boolean z = this.isBest;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((((iHashCode + r1) * 31) + this.value.hashCode()) * 31) + this.unit.hashCode()) * 31) + this.subSeparator.hashCode()) * 31) + this.subValue.hashCode()) * 31) + this.subUnit.hashCode();
    }

    @NotNull
    public final Function2<Context, Integer, String> i() {
        return this.title;
    }

    @NotNull
    public final Function2<Context, Integer, String> j() {
        return this.unit;
    }

    @NotNull
    public final Function2<Context, Integer, String> k() {
        return this.value;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsBest() {
        return this.isBest;
    }

    @NotNull
    public String toString() {
        return "SportSummaryBean(shareName=" + this.shareName + ", icon=" + this.icon + ", title=" + this.title + ", quantity=" + this.quantity + ", isBest=" + this.isBest + ", value=" + this.value + ", unit=" + this.unit + ", subSeparator=" + this.subSeparator + ", subValue=" + this.subValue + ", subUnit=" + this.subUnit + ")";
    }

    public /* synthetic */ SportSummaryBean(String str, int i, Function2 function2, int i2, boolean z, Function2 function3, Function2 function4, Function1 function1, String str2, Function2 function5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, i, function2, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? false : z, function3, (i3 & 64) != 0 ? new Function2<Context, Integer, String>() { // from class: com.heytap.sports.record.details.bean.SportSummaryBean.1
            @NotNull
            public final String invoke(@NotNull Context context, int i4) {
                Intrinsics.checkNotNullParameter(context, "<anonymous parameter 0>");
                return "";
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ String invoke(Context context, Integer num) {
                return invoke(context, num.intValue());
            }
        } : function4, (i3 & 128) != 0 ? new Function1<Context, String>() { // from class: com.heytap.sports.record.details.bean.SportSummaryBean.2
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return "/";
            }
        } : function1, (i3 & 256) != 0 ? "" : str2, (i3 & 512) != 0 ? new Function2<Context, Integer, String>() { // from class: com.heytap.sports.record.details.bean.SportSummaryBean.3
            @NotNull
            public final String invoke(@NotNull Context context, int i4) {
                Intrinsics.checkNotNullParameter(context, "<anonymous parameter 0>");
                return "";
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ String invoke(Context context, Integer num) {
                return invoke(context, num.intValue());
            }
        } : function5);
    }
}
