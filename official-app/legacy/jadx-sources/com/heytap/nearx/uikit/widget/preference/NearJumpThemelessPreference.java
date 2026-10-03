package com.heytap.nearx.uikit.widget.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.PreferenceViewHolder;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.internal.widget.preference.NearThemelessPreference;
import com.oplus.aiunit.vision.xhc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B/\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u000e\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020\u0007R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u001d\u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR(\u0010 \u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001c¨\u0006)"}, d2 = {"Lcom/heytap/nearx/uikit/widget/preference/NearJumpThemelessPreference;", "Lcom/heytap/nearx/uikit/internal/widget/preference/NearThemelessPreference;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "clickStyle", "getClickStyle", "()I", "setClickStyle", "(I)V", "jump", "Landroid/graphics/drawable/Drawable;", "jumpRes", "getJumpRes", "()Landroid/graphics/drawable/Drawable;", "setJumpRes", "(Landroid/graphics/drawable/Drawable;)V", "text", "", "statusText1", "getStatusText1", "()Ljava/lang/CharSequence;", "setStatusText1", "(Ljava/lang/CharSequence;)V", "statusText2", "getStatusText2", "setStatusText2", "statusText3", "getStatusText3", "setStatusText3", "onBindViewHolder", "", "view", "Landroidx/preference/PreferenceViewHolder;", "setJump", "iconResId", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class NearJumpThemelessPreference extends NearThemelessPreference {
    private int clickStyle;

    @Nullable
    private Drawable jumpRes;

    @Nullable
    private CharSequence statusText1;

    @Nullable
    private CharSequence statusText2;

    @Nullable
    private CharSequence statusText3;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearJumpThemelessPreference(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final int getClickStyle() {
        return this.clickStyle;
    }

    @Nullable
    public final Drawable getJumpRes() {
        return this.jumpRes;
    }

    @Nullable
    public final CharSequence getStatusText1() {
        return this.statusText1;
    }

    @Nullable
    public final CharSequence getStatusText2() {
        return this.statusText2;
    }

    @Nullable
    public final CharSequence getStatusText3() {
        return this.statusText3;
    }

    @Override // com.heytap.nearx.uikit.internal.widget.preference.NearThemelessPreference, androidx.preference.Preference
    public void onBindViewHolder(@NotNull PreferenceViewHolder view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onBindViewHolder(view);
        View viewFindViewById = view.findViewById(R$id.nx_preference_widget_jump);
        if (viewFindViewById != null) {
            if (getJumpRes() != null) {
                viewFindViewById.setBackgroundDrawable(getJumpRes());
                viewFindViewById.setVisibility(0);
            } else {
                viewFindViewById.setVisibility(8);
            }
        }
        View viewFindViewById2 = view.findViewById(R$id.nx_preference);
        if (viewFindViewById2 != null) {
            int clickStyle = getClickStyle();
            if (clickStyle == 1) {
                viewFindViewById2.setClickable(false);
            } else if (clickStyle == 2) {
                viewFindViewById2.setClickable(true);
            }
        }
        View viewFindViewById3 = view.findViewById(R$id.nx_statusText1);
        TextView textView = viewFindViewById3 instanceof TextView ? (TextView) viewFindViewById3 : null;
        if (textView != null) {
            CharSequence statusText1 = getStatusText1();
            if (TextUtils.isEmpty(statusText1)) {
                textView.setVisibility(8);
            } else {
                textView.setText(statusText1);
                textView.setVisibility(0);
            }
        }
        View viewFindViewById4 = view.findViewById(R$id.nx_statusText2);
        TextView textView2 = viewFindViewById4 instanceof TextView ? (TextView) viewFindViewById4 : null;
        if (textView2 != null) {
            CharSequence statusText2 = getStatusText2();
            if (TextUtils.isEmpty(statusText2)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(statusText2);
                textView2.setVisibility(0);
            }
        }
        View viewFindViewById5 = view.findViewById(R$id.nx_statusText3);
        TextView textView3 = viewFindViewById5 instanceof TextView ? (TextView) viewFindViewById5 : null;
        if (textView3 == null) {
            return;
        }
        CharSequence statusText3 = getStatusText3();
        if (TextUtils.isEmpty(statusText3)) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(statusText3);
            textView3.setVisibility(0);
        }
    }

    public final void setClickStyle(int i) {
        this.clickStyle = i;
    }

    public final void setJump(int iconResId) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        setJumpRes(xhc.a(context, iconResId));
    }

    public final void setJumpRes(@Nullable Drawable drawable) {
        if (this.jumpRes != drawable) {
            this.jumpRes = drawable;
            notifyChanged();
        }
    }

    public final void setStatusText1(@Nullable CharSequence charSequence) {
        if ((charSequence != null || this.statusText1 == null) && (charSequence == null || Intrinsics.areEqual(charSequence, this.statusText1))) {
            return;
        }
        this.statusText1 = charSequence;
        notifyChanged();
    }

    public final void setStatusText2(@Nullable CharSequence charSequence) {
        if ((charSequence != null || this.statusText2 == null) && (charSequence == null || Intrinsics.areEqual(charSequence, this.statusText2))) {
            return;
        }
        this.statusText2 = charSequence;
        notifyChanged();
    }

    public final void setStatusText3(@Nullable CharSequence charSequence) {
        if ((charSequence != null || this.statusText3 == null) && (charSequence == null || Intrinsics.areEqual(charSequence, this.statusText3))) {
            return;
        }
        this.statusText3 = charSequence;
        notifyChanged();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearJumpThemelessPreference(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearJumpThemelessPreference(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearJumpThemelessPreference(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearPreference, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ference, defStyleAttr, 0)");
        setJumpRes(xhc.b(context, typedArrayObtainStyledAttributes, R$styleable.NearPreference_nxJumpMark));
        setStatusText1(typedArrayObtainStyledAttributes.getText(R$styleable.NearPreference_nxJumpStatus1));
        setStatusText2(typedArrayObtainStyledAttributes.getText(R$styleable.NearPreference_nxJumpStatus2));
        setStatusText3(typedArrayObtainStyledAttributes.getText(R$styleable.NearPreference_nxJumpStatus3));
        this.clickStyle = typedArrayObtainStyledAttributes.getInt(R$styleable.NearPreference_nxClickStyle, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public /* synthetic */ NearJumpThemelessPreference(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R$attr.nxJumpPreferenceStyle : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
