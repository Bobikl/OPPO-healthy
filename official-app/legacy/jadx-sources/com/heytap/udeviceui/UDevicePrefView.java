package com.heytap.udeviceui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.qek;
import io.protostuff.MapSchema;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u00014B\u0011\b\u0016\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/B\u001b\b\u0016\u0012\u0006\u0010-\u001a\u00020,\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b.\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004J\u0012\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0007J\b\u0010\u0017\u001a\u00020\u0002H\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0002R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010+\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001e¨\u00065"}, d2 = {"Lcom/heytap/udeviceui/UDevicePrefView;", "Landroid/widget/FrameLayout;", "", "onFinishInflate", "", "resId", "setIcon", "", "visible", "setShowNext", "setTitle", "", "text", "setSummary", "colorResId", "setSummaryColor", "type", "setBackgroundType", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "disabled", "setDisabled", "b", "c", "Landroid/graphics/drawable/Drawable;", "i", "Landroid/graphics/drawable/Drawable;", "mIcon", "j", "Z", "mShowNext", MapSchema.FIELD_NAME_KEY, "Ljava/lang/String;", "mTitle", LogFieldKey.LEVEL_KEY, "mSummary", LogFieldKey.MESSAGE_KEY, "I", "mSummaryColor", "n", "mBackgroundType", "o", "mDisabled", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "a", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class UDevicePrefView extends FrameLayout {
    public static final int q = 0;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public Drawable mIcon;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean mShowNext;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public String mTitle;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public String mSummary;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int mSummaryColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int mBackgroundType;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean mDisabled;
    public HashMap p;
    public static final int r = 1;
    public static final int s = 2;
    public static final int t = 3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UDevicePrefView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mShowNext = true;
        View.inflate(getContext(), R$layout.udevice_pref_layout, this);
        this.mSummaryColor = context.getColor(R$color.text_color_gray);
    }

    public View a(int i) {
        if (this.p == null) {
            this.p = new HashMap();
        }
        View view = (View) this.p.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.p.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    public final void b() {
        if (this.mIcon == null) {
            ImageView udevice_preview_icon = (ImageView) a(R$id.udevice_preview_icon);
            Intrinsics.checkNotNullExpressionValue(udevice_preview_icon, "udevice_preview_icon");
            udevice_preview_icon.setVisibility(8);
        } else {
            int i = R$id.udevice_preview_icon;
            ((ImageView) a(i)).setImageDrawable(this.mIcon);
            ImageView udevice_preview_icon2 = (ImageView) a(i);
            Intrinsics.checkNotNullExpressionValue(udevice_preview_icon2, "udevice_preview_icon");
            udevice_preview_icon2.setVisibility(0);
        }
    }

    public final void c() {
        if (TextUtils.isEmpty(this.mSummary)) {
            LinearLayout linearLayout = (LinearLayout) a(R$id.mContainerText);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            Resources resources = context.getResources();
            int i = R$dimen.cell_single_text_vertical_padding;
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            linearLayout.setPadding(0, dimensionPixelSize, 0, context2.getResources().getDimensionPixelSize(i));
            TextView udevice_preview_summary = (TextView) a(R$id.udevice_preview_summary);
            Intrinsics.checkNotNullExpressionValue(udevice_preview_summary, "udevice_preview_summary");
            udevice_preview_summary.setVisibility(8);
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) a(R$id.mContainerText);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        Resources resources2 = context3.getResources();
        int i2 = R$dimen.cell_multi_text_vertical_padding;
        int dimensionPixelSize2 = resources2.getDimensionPixelSize(i2);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        linearLayout2.setPadding(0, dimensionPixelSize2, 0, context4.getResources().getDimensionPixelSize(i2));
        int i3 = R$id.udevice_preview_summary;
        TextView udevice_preview_summary2 = (TextView) a(i3);
        Intrinsics.checkNotNullExpressionValue(udevice_preview_summary2, "udevice_preview_summary");
        udevice_preview_summary2.setVisibility(0);
        TextView udevice_preview_summary3 = (TextView) a(i3);
        Intrinsics.checkNotNullExpressionValue(udevice_preview_summary3, "udevice_preview_summary");
        udevice_preview_summary3.setText(this.mSummary);
        ((TextView) a(i3)).setTextColor(this.mSummaryColor);
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
        qek.INSTANCE.a("onFinishInflate", "onFinishInflate " + this.mBackgroundType);
        TextView udevice_preview_title = (TextView) a(R$id.udevice_preview_title);
        Intrinsics.checkNotNullExpressionValue(udevice_preview_title, "udevice_preview_title");
        udevice_preview_title.setText(this.mTitle);
        b();
        c();
        setShowNext(this.mShowNext);
        setBackgroundType(this.mBackgroundType);
        setForceDarkAllowed(false);
    }

    public final void setBackgroundType(int type) {
        int dimensionPixelOffset;
        int dimensionPixelOffset2;
        if (type == r) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.cell_text_vertical_offset);
            setBackground(ContextCompat.getDrawable(getContext(), R$drawable.udevice_preview_shape_up_radius));
            dimensionPixelOffset2 = 0;
        } else if (type == s) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(R$dimen.cell_text_vertical_offset);
            setBackground(ContextCompat.getDrawable(getContext(), R$drawable.udevice_preview_shape_down_radius));
            dimensionPixelOffset2 = dimensionPixelOffset3;
            dimensionPixelOffset = 0;
        } else if (type == t) {
            setBackground(ContextCompat.getDrawable(getContext(), R$drawable.udevice_preview_shape_no_radius));
            dimensionPixelOffset = 0;
            dimensionPixelOffset2 = 0;
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            Resources resources = context3.getResources();
            int i = R$dimen.cell_text_vertical_offset;
            dimensionPixelOffset = resources.getDimensionPixelOffset(i);
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "context");
            dimensionPixelOffset2 = context4.getResources().getDimensionPixelOffset(i);
            setBackground(ContextCompat.getDrawable(getContext(), R$drawable.udevice_preview_shape_all_radius));
        }
        ((LinearLayoutCompat) a(R$id.pref_list)).setPadding(0, dimensionPixelOffset, 0, dimensionPixelOffset2);
    }

    public final void setDisabled(boolean disabled) {
        this.mDisabled = disabled;
        if (disabled) {
            ImageView udevice_preview_icon = (ImageView) a(R$id.udevice_preview_icon);
            Intrinsics.checkNotNullExpressionValue(udevice_preview_icon, "udevice_preview_icon");
            udevice_preview_icon.setAlpha(0.3f);
            TextView udevice_preview_title = (TextView) a(R$id.udevice_preview_title);
            Intrinsics.checkNotNullExpressionValue(udevice_preview_title, "udevice_preview_title");
            udevice_preview_title.setAlpha(0.3f);
            TextView udevice_preview_summary = (TextView) a(R$id.udevice_preview_summary);
            Intrinsics.checkNotNullExpressionValue(udevice_preview_summary, "udevice_preview_summary");
            udevice_preview_summary.setAlpha(0.3f);
            ImageView udevice_preview_next = (ImageView) a(R$id.udevice_preview_next);
            Intrinsics.checkNotNullExpressionValue(udevice_preview_next, "udevice_preview_next");
            udevice_preview_next.setAlpha(0.3f);
            return;
        }
        ImageView udevice_preview_icon2 = (ImageView) a(R$id.udevice_preview_icon);
        Intrinsics.checkNotNullExpressionValue(udevice_preview_icon2, "udevice_preview_icon");
        udevice_preview_icon2.setAlpha(1.0f);
        TextView udevice_preview_title2 = (TextView) a(R$id.udevice_preview_title);
        Intrinsics.checkNotNullExpressionValue(udevice_preview_title2, "udevice_preview_title");
        udevice_preview_title2.setAlpha(1.0f);
        TextView udevice_preview_summary2 = (TextView) a(R$id.udevice_preview_summary);
        Intrinsics.checkNotNullExpressionValue(udevice_preview_summary2, "udevice_preview_summary");
        udevice_preview_summary2.setAlpha(1.0f);
        ImageView udevice_preview_next2 = (ImageView) a(R$id.udevice_preview_next);
        Intrinsics.checkNotNullExpressionValue(udevice_preview_next2, "udevice_preview_next");
        udevice_preview_next2.setAlpha(1.0f);
    }

    public final void setIcon(int resId) {
        this.mIcon = ContextCompat.getDrawable(getContext(), resId);
        b();
    }

    public final void setShowNext(boolean visible) {
        ImageView udevice_preview_next = (ImageView) a(R$id.udevice_preview_next);
        Intrinsics.checkNotNullExpressionValue(udevice_preview_next, "udevice_preview_next");
        udevice_preview_next.setVisibility(visible ? 0 : 8);
    }

    public final void setSummary(int resId) {
        this.mSummary = getContext().getString(resId);
        c();
    }

    public final void setSummaryColor(int colorResId) {
        this.mSummaryColor = colorResId;
        ((TextView) a(R$id.udevice_preview_summary)).setTextColor(this.mSummaryColor);
    }

    public final void setTitle(int resId) {
        this.mTitle = getContext().getString(resId);
        TextView udevice_preview_title = (TextView) a(R$id.udevice_preview_title);
        Intrinsics.checkNotNullExpressionValue(udevice_preview_title, "udevice_preview_title");
        udevice_preview_title.setText(this.mTitle);
    }

    public final void setSummary(@Nullable String text) {
        this.mSummary = text;
        c();
    }

    public final void setTitle(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.mTitle = text;
        TextView udevice_preview_title = (TextView) a(R$id.udevice_preview_title);
        Intrinsics.checkNotNullExpressionValue(udevice_preview_title, "udevice_preview_title");
        udevice_preview_title.setText(this.mTitle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UDevicePrefView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mShowNext = true;
        View.inflate(getContext(), R$layout.udevice_pref_layout, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.UDevicePrefView);
        this.mIcon = typedArrayObtainStyledAttributes.getDrawable(R$styleable.UDevicePrefView_item_icon);
        this.mShowNext = typedArrayObtainStyledAttributes.getBoolean(R$styleable.UDevicePrefView_show_next, true);
        this.mTitle = typedArrayObtainStyledAttributes.getString(R$styleable.UDevicePrefView_item_title);
        this.mSummary = typedArrayObtainStyledAttributes.getString(R$styleable.UDevicePrefView_item_summary);
        this.mBackgroundType = typedArrayObtainStyledAttributes.getInt(R$styleable.UDevicePrefView_item_bg_type, q);
        this.mSummaryColor = typedArrayObtainStyledAttributes.getColor(R$styleable.UDevicePrefView_summary_color, context.getColor(R$color.text_color_gray));
        typedArrayObtainStyledAttributes.recycle();
    }
}
