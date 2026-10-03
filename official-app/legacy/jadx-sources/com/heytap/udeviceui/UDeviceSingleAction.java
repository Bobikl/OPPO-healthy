package com.heytap.udeviceui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import io.protostuff.MapSchema;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dB\u001d\b\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001c\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006!"}, d2 = {"Lcom/heytap/udeviceui/UDeviceSingleAction;", "Landroid/widget/LinearLayout;", "", "onFinishInflate", "", "resId", "setActionIcon", "", "text", "setActionText", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "disabled", "setDisabled", "Landroid/graphics/drawable/Drawable;", "i", "Landroid/graphics/drawable/Drawable;", "mActionIcon", "j", "Ljava/lang/String;", "mActionText", MapSchema.FIELD_NAME_KEY, "Z", "mDisabled", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class UDeviceSingleAction extends LinearLayout {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public Drawable mActionIcon;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public String mActionText;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean mDisabled;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashMap f8336l;

    public UDeviceSingleAction(@Nullable Context context) {
        super(context);
        View.inflate(getContext(), R$layout.layout_single_action, this);
    }

    public View a(int i) {
        if (this.f8336l == null) {
            this.f8336l = new HashMap();
        }
        View view = (View) this.f8336l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f8336l.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        if (this.mDisabled) {
            return false;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        ((ImageView) a(R$id.mIconSingleAction)).setImageDrawable(this.mActionIcon);
        TextView mTextSingleAction = (TextView) a(R$id.mTextSingleAction);
        Intrinsics.checkNotNullExpressionValue(mTextSingleAction, "mTextSingleAction");
        mTextSingleAction.setText(this.mActionText);
        setContentDescription(this.mActionText);
    }

    public final void setActionIcon(int resId) {
        ((ImageView) a(R$id.mIconSingleAction)).setImageDrawable(ContextCompat.getDrawable(getContext(), resId));
    }

    public final void setActionText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView mTextSingleAction = (TextView) a(R$id.mTextSingleAction);
        Intrinsics.checkNotNullExpressionValue(mTextSingleAction, "mTextSingleAction");
        mTextSingleAction.setText(text);
        setContentDescription(text);
    }

    public final void setDisabled(boolean disabled) {
        this.mDisabled = disabled;
        if (disabled) {
            ImageView mIconSingleAction = (ImageView) a(R$id.mIconSingleAction);
            Intrinsics.checkNotNullExpressionValue(mIconSingleAction, "mIconSingleAction");
            mIconSingleAction.setAlpha(0.3f);
            TextView mTextSingleAction = (TextView) a(R$id.mTextSingleAction);
            Intrinsics.checkNotNullExpressionValue(mTextSingleAction, "mTextSingleAction");
            mTextSingleAction.setAlpha(0.3f);
            return;
        }
        ImageView mIconSingleAction2 = (ImageView) a(R$id.mIconSingleAction);
        Intrinsics.checkNotNullExpressionValue(mIconSingleAction2, "mIconSingleAction");
        mIconSingleAction2.setAlpha(1.0f);
        TextView mTextSingleAction2 = (TextView) a(R$id.mTextSingleAction);
        Intrinsics.checkNotNullExpressionValue(mTextSingleAction2, "mTextSingleAction");
        mTextSingleAction2.setAlpha(1.0f);
    }

    public UDeviceSingleAction(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), R$layout.layout_single_action, this);
        TypedArray typedArrayObtainStyledAttributes = context != null ? context.obtainStyledAttributes(attributeSet, R$styleable.UDeviceSingleAction) : null;
        if (typedArrayObtainStyledAttributes != null) {
            this.mActionIcon = typedArrayObtainStyledAttributes.getDrawable(R$styleable.UDeviceSingleAction_actionIcon);
            this.mActionText = typedArrayObtainStyledAttributes.getString(R$styleable.UDeviceSingleAction_actionText);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void setActionText(int resId) {
        ((TextView) a(R$id.mTextSingleAction)).setText(resId);
        setContentDescription(getContext().getString(resId));
    }
}
