package com.heytap.sporthealth.blib.helper;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.wek;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\n\u001a\u00020\u0005H\u0002R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/heytap/sporthealth/blib/helper/LinearLayout2;", "Landroid/widget/LinearLayout;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "a", "i", "I", "getDp8", "()I", "dp8", "", "j", "Z", "isFold", "()Z", "setFold", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lib_ui_release"}, k = 1, mv = {1, 8, 0})
public final class LinearLayout2 extends LinearLayout {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int dp8;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean isFold;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/heytap/sporthealth/blib/helper/LinearLayout2$a", "Landroid/graphics/drawable/ColorDrawable;", "", "getIntrinsicWidth", "lib_ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends ColorDrawable {
        public a() {
            super(0);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return LinearLayout2.this.getDp8();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LinearLayout2(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        if (this.isFold) {
            setOrientation(1);
            return;
        }
        setOrientation(0);
        setShowDividers(2);
        setDividerPadding(this.dp8);
        setDividerDrawable(new a());
    }

    public final int getDp8() {
        return this.dp8;
    }

    @Override // android.view.View
    public void onConfigurationChanged(@Nullable Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.isFold = wek.a(context);
        a();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.isFold) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int i = (size - this.dp8) / 2;
        int childCount = getChildCount();
        int iCoerceAtLeast = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            measureChild(childAt, View.MeasureSpec.makeMeasureSpec(i, 1073741824), heightMeasureSpec);
            iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(childAt.getMeasuredHeight(), iCoerceAtLeast);
        }
        setMeasuredDimension(size, iCoerceAtLeast);
    }

    public final void setFold(boolean z) {
        this.isFold = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LinearLayout2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LinearLayout2(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LinearLayout2(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = qtf.b(8.0f);
        this.isFold = wek.a(context);
        a();
    }
}
