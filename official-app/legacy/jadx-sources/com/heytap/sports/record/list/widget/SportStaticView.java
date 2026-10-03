package com.heytap.sports.record.list.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sporthealth.blib.weiget.jlayout.MultiStateLayout;
import com.heytap.sports.R$id;
import com.heytap.sports.R$layout;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103B!\b\u0016\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00106\u001a\u00020\u0004¢\u0006\u0004\b2\u00107B\u0019\b\u0016\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\b2\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004J\b\u0010\b\u001a\u00020\u0002H\u0002R\"\u0010\u000f\u001a\u00020\u00048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR$\u0010'\u001a\u0004\u0018\u00010 8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010+\u001a\u0004\u0018\u00010 8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R$\u0010/\u001a\u0004\u0018\u00010 8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&¨\u00069"}, d2 = {"Lcom/heytap/sports/record/list/widget/SportStaticView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "onFinishInflate", "", MapSchema.FIELD_NAME_ENTRY, "numSize", "setNumSize", "f", "i", "I", "getMTitleRes", "()I", "setMTitleRes", "(I)V", "mTitleRes", "", "j", "Ljava/lang/Object;", "getMUnitHolder", "()Ljava/lang/Object;", "setMUnitHolder", "(Ljava/lang/Object;)V", "mUnitHolder", MapSchema.FIELD_NAME_KEY, "getMShowNum", "setMShowNum", "mShowNum", LogFieldKey.LEVEL_KEY, "getMNumSize", "setMNumSize", "mNumSize", "Landroid/widget/TextView;", LogFieldKey.MESSAGE_KEY, "Landroid/widget/TextView;", "getMTitle", "()Landroid/widget/TextView;", "setMTitle", "(Landroid/widget/TextView;)V", "mTitle", "n", "getMNum", "setMNum", "mNum", "o", "getMUnit", "setMUnit", "mUnit", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public class SportStaticView extends ConstraintLayout {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int mTitleRes;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Object mUnitHolder;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public Object mShowNum;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int mNumSize;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public TextView mTitle;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public TextView mNum;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public TextView mUnit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportStaticView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mUnitHolder = "";
        this.mShowNum = 0;
    }

    public int e() {
        return R$layout.sports_statistc_item;
    }

    public final void f() {
        TextView textView;
        int i = this.mNumSize;
        if (i > 0 && (textView = this.mNum) != null) {
            textView.setTextSize(0, i);
        }
        int i2 = this.mTitleRes;
        if (i2 != 0) {
            TextView textView2 = this.mTitle;
            if (textView2 != null) {
                textView2.setText(i2);
            }
            TextView textView3 = this.mNum;
            if (textView3 != null) {
                textView3.setText(this.mShowNum.toString());
            }
            Object obj = this.mUnitHolder;
            if (!(obj instanceof Integer)) {
                TextView textView4 = this.mUnit;
                if (textView4 == null) {
                    return;
                }
                textView4.setText(obj.toString());
                return;
            }
            TextView textView5 = this.mUnit;
            if (textView5 != null) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                textView5.setText(((Integer) obj).intValue());
            }
        }
    }

    @Nullable
    public final TextView getMNum() {
        return this.mNum;
    }

    public final int getMNumSize() {
        return this.mNumSize;
    }

    @NotNull
    public final Object getMShowNum() {
        return this.mShowNum;
    }

    @Nullable
    public final TextView getMTitle() {
        return this.mTitle;
    }

    public final int getMTitleRes() {
        return this.mTitleRes;
    }

    @Nullable
    public final TextView getMUnit() {
        return this.mUnit;
    }

    @NotNull
    public final Object getMUnitHolder() {
        return this.mUnitHolder;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View.inflate(getContext(), e(), this);
        this.mTitle = (TextView) findViewById(R$id.fit_his_static_title);
        this.mNum = (TextView) findViewById(R$id.fit_his_static_num);
        this.mUnit = (TextView) findViewById(R$id.fit_his_static_unit);
        f();
    }

    public final void setMNum(@Nullable TextView textView) {
        this.mNum = textView;
    }

    public final void setMNumSize(int i) {
        this.mNumSize = i;
    }

    public final void setMShowNum(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.mShowNum = obj;
    }

    public final void setMTitle(@Nullable TextView textView) {
        this.mTitle = textView;
    }

    public final void setMTitleRes(int i) {
        this.mTitleRes = i;
    }

    public final void setMUnit(@Nullable TextView textView) {
        this.mUnit = textView;
    }

    public final void setMUnitHolder(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.mUnitHolder = obj;
    }

    public final void setNumSize(int numSize) {
        this.mNumSize = MultiStateLayout.g(numSize);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportStaticView(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.mUnitHolder = "";
        this.mShowNum = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportStaticView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.mUnitHolder = "";
        this.mShowNum = 0;
    }
}
