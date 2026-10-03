package com.heytap.udeviceui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.qek;
import com.oplus.aiunit.vision.vek;
import com.oplus.aiunit.vision.y04;
import com.oplus.smartenginehelper.ParserTag;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import io.protostuff.MapSchema;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001FB\u0011\b\u0016\u0012\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AB\u001b\b\u0016\u0012\u0006\u0010?\u001a\u00020>\u0012\b\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\b@\u0010DJ\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u000e\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014J\u0012\u0010\u0019\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0014J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005H\u0014J0\u0010$\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0014J\u0012\u0010'\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010%H\u0014J\b\u0010(\u001a\u00020\u0003H\u0002R\u001c\u0010,\u001a\n )*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010+R\u0016\u00103\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0016\u00108\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00107¨\u0006G"}, d2 = {"Lcom/heytap/udeviceui/UDeviceSwitchView;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "", "onFinishInflate", "", "resId", "setTitle", "", "text", "setSummary", "setSummaryColor", "type", "setBackgroundType", "Landroid/view/View;", "view", ParserTag.TAG_ONCLICK, "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "listener", "setOnSwitchCheckedChangedListener", "", "checked", "setChecked", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "disabled", "setDisabled", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "onLayout", "Landroid/graphics/Canvas;", "canvas", "onDraw", "b", "kotlin.jvm.PlatformType", "i", "Ljava/lang/String;", "TAG", "j", "mTitle", MapSchema.FIELD_NAME_KEY, "mSummary", LogFieldKey.LEVEL_KEY, "I", "mSummaryColor", LogFieldKey.MESSAGE_KEY, "mBackgroundType", "n", "Z", "mChecked", "o", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "mListener", LogFieldKey.PROCESS_NAME_KEY, "mDisabled", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "a", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class UDeviceSwitchView extends FrameLayout implements View.OnClickListener {
    public static final int r = 0;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final String TAG;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public String mTitle;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public String mSummary;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int mSummaryColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int mBackgroundType;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean mChecked;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public CompoundButton.OnCheckedChangeListener mListener;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean mDisabled;
    public HashMap q;
    public static final int s = 1;
    public static final int t = 2;
    public static final int u = 3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UDeviceSwitchView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.TAG = UDeviceSwitchView.class.getSimpleName();
        View.inflate(getContext(), R$layout.udevice_switch_layout, this);
        this.mSummaryColor = context.getColor(R$color.text_color_gray);
    }

    public View a(int i) {
        if (this.q == null) {
            this.q = new HashMap();
        }
        View view = (View) this.q.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.q.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    public final void b() {
        if (TextUtils.isEmpty(this.mSummary)) {
            LinearLayout linearLayout = (LinearLayout) a(R$id.mContainerText);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            Resources resources = context.getResources();
            int i = R$dimen.link_action_padding;
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            Resources resources2 = context2.getResources();
            int i2 = R$dimen.cell_single_text_vertical_padding;
            int dimensionPixelSize2 = resources2.getDimensionPixelSize(i2);
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            int dimensionPixelSize3 = context3.getResources().getDimensionPixelSize(i);
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "context");
            linearLayout.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, context4.getResources().getDimensionPixelSize(i2));
            TextView udevice_switch_summary = (TextView) a(R$id.udevice_switch_summary);
            Intrinsics.checkNotNullExpressionValue(udevice_switch_summary, "udevice_switch_summary");
            udevice_switch_summary.setVisibility(8);
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) a(R$id.mContainerText);
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        Resources resources3 = context5.getResources();
        int i3 = R$dimen.link_action_padding;
        int dimensionPixelSize4 = resources3.getDimensionPixelSize(i3);
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "context");
        Resources resources4 = context6.getResources();
        int i4 = R$dimen.cell_multi_text_vertical_padding;
        int dimensionPixelSize5 = resources4.getDimensionPixelSize(i4);
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "context");
        int dimensionPixelSize6 = context7.getResources().getDimensionPixelSize(i3);
        Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "context");
        linearLayout2.setPadding(dimensionPixelSize4, dimensionPixelSize5, dimensionPixelSize6, context8.getResources().getDimensionPixelSize(i4));
        int i5 = R$id.udevice_switch_summary;
        TextView udevice_switch_summary2 = (TextView) a(i5);
        Intrinsics.checkNotNullExpressionValue(udevice_switch_summary2, "udevice_switch_summary");
        udevice_switch_summary2.setVisibility(0);
        TextView udevice_switch_summary3 = (TextView) a(i5);
        Intrinsics.checkNotNullExpressionValue(udevice_switch_summary3, "udevice_switch_summary");
        udevice_switch_summary3.setText(this.mSummary);
        ((TextView) a(i5)).setTextColor(this.mSummaryColor);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        if (this.mDisabled) {
            return false;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // android.view.View.OnClickListener
    @SensorsDataInstrumented
    public void onClick(@Nullable View view) {
        int i = R$id.udevice_switch_icon;
        UDeviceSwitch udevice_switch_icon = (UDeviceSwitch) a(i);
        Intrinsics.checkNotNullExpressionValue(udevice_switch_icon, "udevice_switch_icon");
        UDeviceSwitch udevice_switch_icon2 = (UDeviceSwitch) a(i);
        Intrinsics.checkNotNullExpressionValue(udevice_switch_icon2, "udevice_switch_icon");
        udevice_switch_icon.setChecked(!udevice_switch_icon2.isChecked());
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        qek qekVar = qek.INSTANCE;
        String TAG = this.TAG;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        qekVar.a(TAG, "onDraw");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        TextView udevice_switch_title = (TextView) a(R$id.udevice_switch_title);
        Intrinsics.checkNotNullExpressionValue(udevice_switch_title, "udevice_switch_title");
        udevice_switch_title.setText(this.mTitle);
        b();
        setChecked(this.mChecked);
        setBackgroundType(this.mBackgroundType);
        setOnClickListener(this);
        setForceDarkAllowed(false);
        UDeviceSwitch uDeviceSwitch = (UDeviceSwitch) a(R$id.udevice_switch_icon);
        vek vekVar = vek.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        uDeviceSwitch.setBarCheckedColor(vekVar.c(context));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        qek qekVar = qek.INSTANCE;
        String TAG = this.TAG;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        qekVar.a(TAG, "onLayout");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        qek qekVar = qek.INSTANCE;
        String TAG = this.TAG;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        qekVar.a(TAG, "onMeasure");
    }

    public final void setBackgroundType(int type) {
        int dimensionPixelOffset;
        int dimensionPixelOffset2;
        if (type == s) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.cell_text_vertical_offset);
            setBackground(ContextCompat.getDrawable(getContext(), R$drawable.udevice_preview_shape_up_radius));
            dimensionPixelOffset2 = 0;
        } else if (type == t) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(R$dimen.cell_text_vertical_offset);
            setBackground(ContextCompat.getDrawable(getContext(), R$drawable.udevice_preview_shape_down_radius));
            dimensionPixelOffset2 = dimensionPixelOffset3;
            dimensionPixelOffset = 0;
        } else if (type == u) {
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
        ((LinearLayoutCompat) a(R$id.switch_list)).setPadding(0, dimensionPixelOffset, 0, dimensionPixelOffset2);
    }

    public final void setChecked(boolean checked) {
        int i = R$id.udevice_switch_icon;
        ((UDeviceSwitch) a(i)).setOnCheckedChangeListener(null);
        UDeviceSwitch udevice_switch_icon = (UDeviceSwitch) a(i);
        Intrinsics.checkNotNullExpressionValue(udevice_switch_icon, "udevice_switch_icon");
        udevice_switch_icon.setChecked(checked);
        ((UDeviceSwitch) a(i)).setOnCheckedChangeListener(this.mListener);
    }

    public final void setDisabled(boolean disabled) {
        this.mDisabled = disabled;
        if (disabled) {
            TextView udevice_switch_title = (TextView) a(R$id.udevice_switch_title);
            Intrinsics.checkNotNullExpressionValue(udevice_switch_title, "udevice_switch_title");
            udevice_switch_title.setAlpha(0.3f);
            TextView udevice_switch_summary = (TextView) a(R$id.udevice_switch_summary);
            Intrinsics.checkNotNullExpressionValue(udevice_switch_summary, "udevice_switch_summary");
            udevice_switch_summary.setAlpha(0.3f);
            UDeviceSwitch udevice_switch_icon = (UDeviceSwitch) a(R$id.udevice_switch_icon);
            Intrinsics.checkNotNullExpressionValue(udevice_switch_icon, "udevice_switch_icon");
            udevice_switch_icon.setAlpha(0.3f);
            return;
        }
        TextView udevice_switch_title2 = (TextView) a(R$id.udevice_switch_title);
        Intrinsics.checkNotNullExpressionValue(udevice_switch_title2, "udevice_switch_title");
        udevice_switch_title2.setAlpha(1.0f);
        TextView udevice_switch_summary2 = (TextView) a(R$id.udevice_switch_summary);
        Intrinsics.checkNotNullExpressionValue(udevice_switch_summary2, "udevice_switch_summary");
        udevice_switch_summary2.setAlpha(1.0f);
        UDeviceSwitch udevice_switch_icon2 = (UDeviceSwitch) a(R$id.udevice_switch_icon);
        Intrinsics.checkNotNullExpressionValue(udevice_switch_icon2, "udevice_switch_icon");
        udevice_switch_icon2.setAlpha(1.0f);
    }

    public final void setOnSwitchCheckedChangedListener(@NotNull CompoundButton.OnCheckedChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mListener = listener;
        ((UDeviceSwitch) a(R$id.udevice_switch_icon)).setOnCheckedChangeListener(listener);
    }

    public final void setSummary(int resId) {
        this.mSummary = getContext().getString(resId);
        b();
    }

    public final void setSummaryColor(int resId) {
        this.mSummaryColor = ContextCompat.getColor(getContext(), resId);
        ((TextView) a(R$id.udevice_switch_summary)).setTextColor(this.mSummaryColor);
    }

    public final void setTitle(int resId) {
        this.mTitle = getContext().getString(resId);
        TextView udevice_switch_title = (TextView) a(R$id.udevice_switch_title);
        Intrinsics.checkNotNullExpressionValue(udevice_switch_title, "udevice_switch_title");
        udevice_switch_title.setText(this.mTitle);
    }

    public final void setSummary(@Nullable String text) {
        this.mSummary = text;
        b();
    }

    public final void setTitle(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.mTitle = text;
        TextView udevice_switch_title = (TextView) a(R$id.udevice_switch_title);
        Intrinsics.checkNotNullExpressionValue(udevice_switch_title, "udevice_switch_title");
        udevice_switch_title.setText(this.mTitle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UDeviceSwitchView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.TAG = UDeviceSwitchView.class.getSimpleName();
        View.inflate(getContext(), R$layout.udevice_switch_layout, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.UDeviceSwitchView);
        this.mTitle = typedArrayObtainStyledAttributes.getString(R$styleable.UDeviceSwitchView_switch_title);
        this.mSummary = typedArrayObtainStyledAttributes.getString(R$styleable.UDeviceSwitchView_switch_summary);
        this.mBackgroundType = typedArrayObtainStyledAttributes.getInt(R$styleable.UDeviceSwitchView_switch_bg_type, r);
        this.mSummaryColor = typedArrayObtainStyledAttributes.getColor(R$styleable.UDeviceSwitchView_switch_summary_color, context.getColor(R$color.text_color_gray));
        this.mChecked = typedArrayObtainStyledAttributes.getBoolean(R$styleable.UDeviceSwitchView_switch_checked, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
