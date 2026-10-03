package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.heytap.health.base.view.calendar.FixedMonthView;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\"\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004J\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ&\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0010R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/yq7;", "", "Landroid/view/ViewGroup;", "rootView", "", "monthHeight", "Landroid/view/View;", "a", "circleHeight", "bottomPadding", "b", "monthView", "Ljava/time/LocalDate;", "month", "", MapSchema.FIELD_NAME_ENTRY, "", "needUpdateDate", "d", "Lcom/oplus/aiunit/vision/kq2;", "Lcom/oplus/aiunit/vision/kq2;", "monthViewAdapter", "", "Z", "mondayFirst", "<init>", "(Lcom/oplus/aiunit/vision/kq2;Z)V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class yq7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final kq2 monthViewAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean mondayFirst;

    public yq7(@NotNull kq2 monthViewAdapter, boolean z) {
        Intrinsics.checkNotNullParameter(monthViewAdapter, "monthViewAdapter");
        this.monthViewAdapter = monthViewAdapter;
        this.mondayFirst = z;
    }

    public static /* synthetic */ View c(yq7 yq7Var, ViewGroup viewGroup, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 33.0f;
        }
        if ((i & 4) != 0) {
            f2 = 30.0f;
        }
        return yq7Var.b(viewGroup, f, f2);
    }

    @NotNull
    public final View a(@NotNull ViewGroup rootView, float monthHeight) {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        View viewInflate = LayoutInflater.from(rootView.getContext()).inflate(this.monthViewAdapter.a(), rootView, false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) viewInflate;
        if (this.monthViewAdapter.b() == null) {
            viewGroup = viewGroup2;
        } else {
            Integer numB = this.monthViewAdapter.b();
            Intrinsics.checkNotNull(numB);
            View viewFindViewById = viewGroup2.findViewById(numB.intValue());
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "parentView.findViewById(…apter.getMonthViewId()!!)");
            viewGroup = (ViewGroup) viewFindViewById;
        }
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "rootView.context");
        viewGroup.addView(new FixedMonthView(context, this.monthViewAdapter, false, this.mondayFirst, 4, null), -1, at5.a(monthHeight));
        return viewGroup2;
    }

    @NotNull
    public final View b(@NotNull ViewGroup rootView, float circleHeight, float bottomPadding) {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        View viewInflate = LayoutInflater.from(rootView.getContext()).inflate(this.monthViewAdapter.a(), rootView, false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) viewInflate;
        if (this.monthViewAdapter.b() == null) {
            viewGroup = viewGroup2;
        } else {
            Integer numB = this.monthViewAdapter.b();
            Intrinsics.checkNotNull(numB);
            View viewFindViewById = viewGroup2.findViewById(numB.intValue());
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "parentView.findViewById(…apter.getMonthViewId()!!)");
            viewGroup = (ViewGroup) viewFindViewById;
        }
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "rootView.context");
        viewGroup.addView(new FixedMonthView(context, this.monthViewAdapter, false, this.mondayFirst), -1, (at5.a(circleHeight) + at5.a(bottomPadding)) * 6);
        return viewGroup2;
    }

    public final void d(@NotNull ViewGroup monthView, @NotNull LocalDate month, @Nullable Set<LocalDate> needUpdateDate) {
        Intrinsics.checkNotNullParameter(monthView, "monthView");
        Intrinsics.checkNotNullParameter(month, "month");
        int childCount = monthView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (monthView.getChildAt(i) instanceof FixedMonthView) {
                View childAt = monthView.getChildAt(i);
                Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.heytap.health.base.view.calendar.FixedMonthView");
                ((FixedMonthView) childAt).e(month);
            }
        }
    }

    public final void e(@NotNull ViewGroup monthView, @NotNull LocalDate month) {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(monthView, "monthView");
        Intrinsics.checkNotNullParameter(month, "month");
        if (this.monthViewAdapter.b() == null) {
            viewGroup = monthView;
        } else {
            Integer numB = this.monthViewAdapter.b();
            Intrinsics.checkNotNull(numB);
            View viewFindViewById = monthView.findViewById(numB.intValue());
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "monthView.findViewById(m…apter.getMonthViewId()!!)");
            viewGroup = (ViewGroup) viewFindViewById;
        }
        this.monthViewAdapter.e(monthView, month);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (viewGroup.getChildAt(i) instanceof FixedMonthView) {
                View childAt = viewGroup.getChildAt(i);
                Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.heytap.health.base.view.calendar.FixedMonthView");
                ((FixedMonthView) childAt).e(month);
                return;
            }
        }
    }

    public /* synthetic */ yq7(kq2 kq2Var, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kq2Var, (i & 2) != 0 ? false : z);
    }
}
