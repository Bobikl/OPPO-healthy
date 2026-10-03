package com.heytap.nearx.uikit.internal.widget.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.internal.widget.preference.NearThemelessPreference;
import com.heytap.nearx.uikit.widget.NearRoundImageView;
import com.oplus.aiunit.vision.gqe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B/\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007J\u0006\u0010\u001b\u001a\u00020\u000bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000bJ\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u000bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/heytap/nearx/uikit/internal/widget/preference/NearThemelessPreference;", "Landroidx/preference/Preference;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "hasBorder", "", "isEnableClickSpan", "isGroupStyle", "maxRadius", "minRadius", "positionInGroup", "getPositionInGroup", "()I", "setPositionInGroup", "(I)V", "radius", "scale", "", "showDivider", "getBorderRectRadius", "iconSize", "isShowDivider", "onBindViewHolder", "", "view", "Landroidx/preference/PreferenceViewHolder;", "setIsGroupStyle", "setShowDivider", CardAction.LIFE_CIRCLE_VALUE_SHOW, "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class NearThemelessPreference extends Preference {
    private final boolean hasBorder;
    private final boolean isEnableClickSpan;
    private boolean isGroupStyle;
    private final int maxRadius;
    private final int minRadius;
    private int positionInGroup;
    private int radius;
    private final float scale;
    private boolean showDivider;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearThemelessPreference(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onBindViewHolder$lambda-2$lambda-1, reason: not valid java name */
    public static final boolean m4670onBindViewHolder$lambda2$lambda1(TextView this_apply, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        int actionMasked = motionEvent.getActionMasked();
        int selectionStart = this_apply.getSelectionStart();
        int selectionEnd = this_apply.getSelectionEnd();
        int offsetForPosition = this_apply.getOffsetForPosition(motionEvent.getX(), motionEvent.getY());
        boolean z = selectionStart == selectionEnd || offsetForPosition <= selectionStart || offsetForPosition >= selectionEnd;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this_apply.setPressed(false);
                this_apply.postInvalidateDelayed(70L);
            }
        } else {
            if (z) {
                return false;
            }
            this_apply.setPressed(true);
            this_apply.invalidate();
        }
        return false;
    }

    public final int getBorderRectRadius(int iconSize) {
        return (iconSize == 1 || iconSize == 2 || iconSize != 3) ? 14 : 16;
    }

    public final int getPositionInGroup() {
        return this.positionInGroup;
    }

    /* JADX INFO: renamed from: isShowDivider, reason: from getter */
    public final boolean getShowDivider() {
        return this.showDivider;
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(@NotNull PreferenceViewHolder view) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onBindViewHolder(view);
        int i = this.positionInGroup;
        if (this.isGroupStyle || i < 0 || i > 3) {
            view.itemView.setBackgroundResource(R$drawable.nx_group_list_selector_item);
        } else {
            view.itemView.setBackgroundResource(gqe.DRAWABLEIDS[i]);
        }
        View viewFindViewById = view.findViewById(R.id.icon);
        if (viewFindViewById != null && (viewFindViewById instanceof NearRoundImageView)) {
            if (viewFindViewById.getHeight() != 0 && (drawable = ((NearRoundImageView) viewFindViewById).getDrawable()) != null) {
                int intrinsicHeight = drawable.getIntrinsicHeight() / 6;
                this.radius = intrinsicHeight;
                int i2 = this.minRadius;
                if (intrinsicHeight < i2) {
                    this.radius = i2;
                } else {
                    int i3 = this.maxRadius;
                    if (intrinsicHeight > i3) {
                        this.radius = i3;
                    }
                }
            }
            NearRoundImageView nearRoundImageView = (NearRoundImageView) viewFindViewById;
            nearRoundImageView.setHasBorder(this.hasBorder);
            nearRoundImageView.setBorderRectRadius(this.radius);
        }
        if (this.isEnableClickSpan) {
            View viewFindViewById2 = view.findViewById(R.id.summary);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            final TextView textView = (TextView) viewFindViewById2;
            textView.setHighlightColor(textView.getContext().getResources().getColor(R.color.transparent));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.qlc
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return NearThemelessPreference.m4670onBindViewHolder$lambda2$lambda1(textView, view2, motionEvent);
                }
            });
        }
    }

    public final void setIsGroupStyle(boolean isGroupStyle) {
        this.isGroupStyle = isGroupStyle;
    }

    public final void setPositionInGroup(int i) {
        this.positionInGroup = i;
    }

    public final void setShowDivider(boolean show) {
        if (this.showDivider != show) {
            this.showDivider = show;
            notifyChanged();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearThemelessPreference(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearThemelessPreference(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearThemelessPreference(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.positionInGroup = -1;
        this.showDivider = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearPreference, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…efStyleAttr, defStyleRes)");
        this.positionInGroup = typedArrayObtainStyledAttributes.getInt(R$styleable.NearPreference_nxPreferencePosition, 3);
        this.showDivider = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearPreference_nxShowDivider, this.showDivider);
        this.isGroupStyle = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearPreference_nxIsGroupMode, true);
        this.hasBorder = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearPreference_nxIsBorder, false);
        this.radius = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearPreference_nxIconRadius, 14);
        this.isEnableClickSpan = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearPreference_nxEnalbeClickSpan, false);
        typedArrayObtainStyledAttributes.recycle();
        float f = context.getResources().getDisplayMetrics().density;
        this.scale = f;
        float f2 = 3;
        this.minRadius = (int) ((14 * f) / f2);
        this.maxRadius = (int) ((36 * f) / f2);
    }

    public /* synthetic */ NearThemelessPreference(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.preferenceStyle : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
