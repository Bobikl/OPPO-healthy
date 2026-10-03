package com.heytap.sports.record.list.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.R$layout;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\r"}, d2 = {"Lcom/heytap/sports/record/list/widget/SportStaticViewBig;", "Lcom/heytap/sports/record/list/widget/SportStaticView;", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SportStaticViewBig extends SportStaticView {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportStaticViewBig(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.heytap.sports.record.list.widget.SportStaticView
    public int e() {
        return R$layout.sports_statistc_item_big;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportStaticViewBig(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, new int[]{R.attr.textSize});
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "getContext().obtainStyle…android.R.attr.textSize))");
        setMNumSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportStaticViewBig(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
