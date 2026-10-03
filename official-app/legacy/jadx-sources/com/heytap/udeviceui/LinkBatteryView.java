package com.heytap.udeviceui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.content.ContextCompat;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.n52;
import com.oplus.deviceui.BatteryView;
import io.protostuff.MapSchema;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated(message = "has deprecated, use BatteryView instead.")
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dB\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001c\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\u000f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/heytap/udeviceui/LinkBatteryView;", "Landroid/widget/FrameLayout;", "", Const.Arguments.Open.STYLE, "", "setBatteryStyle", "onFinishInflate", "", "power", "setPower", "", "charging", "setIsCharging", "i", "I", "mPower", "j", "Ljava/lang/String;", "mStyle", MapSchema.FIELD_NAME_KEY, "Z", "isCharging", "Landroid/widget/ProgressBar;", LogFieldKey.LEVEL_KEY, "Landroid/widget/ProgressBar;", "mProgressView", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "a", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class LinkBatteryView extends FrameLayout {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int mPower;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public String mStyle;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isCharging;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public ProgressBar mProgressView;
    public HashMap m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkBatteryView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mStyle = "normal";
        View.inflate(getContext(), R$layout.battery_layout, this);
        if (n52.INSTANCE.a()) {
            ((ViewStub) findViewById(R$id.mStubBatteryOp)).inflate();
            this.mProgressView = (ProgressBar) a(R$id.mProgressBatteryOp);
        } else {
            ((ViewStub) findViewById(R$id.mStubBatteryCommon)).inflate();
            this.mProgressView = (ProgressBar) a(R$id.mProgressBattery);
        }
    }

    private final void setBatteryStyle(String style) {
        if (n52.INSTANCE.a()) {
            return;
        }
        if (Intrinsics.areEqual(style, "normal")) {
            ProgressBar progressBar = this.mProgressView;
            if (progressBar != null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                int dimension = (int) context.getResources().getDimension(R$dimen.link_progress_width);
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                progressBar.setLayoutParams(new LinearLayout.LayoutParams(dimension, (int) context2.getResources().getDimension(R$dimen.link_progress_height)));
            }
            ProgressBar progressBar2 = this.mProgressView;
            if (progressBar2 != null) {
                progressBar2.setForeground(ContextCompat.getDrawable(getContext(), R$drawable.stat_battery));
            }
            ProgressBar progressBar3 = this.mProgressView;
            if (progressBar3 != null) {
                progressBar3.setProgressDrawable(ContextCompat.getDrawable(getContext(), R$drawable.link_progress_bar_bg));
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(style, BatteryView.STYLE_SMALL)) {
            ProgressBar progressBar4 = this.mProgressView;
            if (progressBar4 != null) {
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "context");
                int dimension2 = (int) context3.getResources().getDimension(R$dimen.link_progress_width_small);
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "context");
                progressBar4.setLayoutParams(new LinearLayout.LayoutParams(dimension2, (int) context4.getResources().getDimension(R$dimen.link_progress_height_small)));
            }
            ProgressBar progressBar5 = this.mProgressView;
            if (progressBar5 != null) {
                progressBar5.setForeground(ContextCompat.getDrawable(getContext(), R$drawable.stat_battery_small));
            }
            ProgressBar progressBar6 = this.mProgressView;
            if (progressBar6 != null) {
                progressBar6.setProgressDrawable(ContextCompat.getDrawable(getContext(), R$drawable.link_progress_bar_bg_small));
            }
        }
    }

    public View a(int i) {
        if (this.m == null) {
            this.m = new HashMap();
        }
        View view = (View) this.m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.m.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setPower(this.mPower);
        setBatteryStyle(this.mStyle);
    }

    public final void setIsCharging(boolean charging) {
        this.isCharging = charging;
        if (n52.INSTANCE.a()) {
            ImageView mIconChargeOp = (ImageView) a(R$id.mIconChargeOp);
            Intrinsics.checkNotNullExpressionValue(mIconChargeOp, "mIconChargeOp");
            mIconChargeOp.setVisibility(this.isCharging ? 0 : 8);
        } else {
            ImageView mIconCharge = (ImageView) a(R$id.mIconCharge);
            Intrinsics.checkNotNullExpressionValue(mIconCharge, "mIconCharge");
            mIconCharge.setVisibility(this.isCharging ? 0 : 8);
        }
    }

    public final void setPower(int power) {
        this.mPower = power;
        if (power <= 20) {
            ProgressBar progressBar = this.mProgressView;
            if (progressBar != null) {
                progressBar.setProgressTintList(ColorStateList.valueOf(ContextCompat.getColor(getContext(), R$color.link_progress_red)));
            }
        } else {
            int i = n52.INSTANCE.a() ? R$color.link_progress_op : R$color.link_progress;
            ProgressBar progressBar2 = this.mProgressView;
            if (progressBar2 != null) {
                progressBar2.setProgressTintList(ColorStateList.valueOf(ContextCompat.getColor(getContext(), i)));
            }
        }
        ProgressBar progressBar3 = this.mProgressView;
        if (progressBar3 != null) {
            progressBar3.setProgress(this.mPower);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkBatteryView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mStyle = "normal";
        View.inflate(getContext(), R$layout.battery_layout, this);
        if (n52.INSTANCE.a()) {
            ((ViewStub) findViewById(R$id.mStubBatteryOp)).inflate();
            this.mProgressView = (ProgressBar) a(R$id.mProgressBatteryOp);
        } else {
            ((ViewStub) findViewById(R$id.mStubBatteryCommon)).inflate();
            this.mProgressView = (ProgressBar) a(R$id.mProgressBattery);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LinkBatteryView);
        this.mPower = typedArrayObtainStyledAttributes.getInt(R$styleable.LinkBatteryView_batteryPower, 0);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.LinkBatteryView_batteryStyle);
        this.mStyle = string != null ? string : "normal";
        typedArrayObtainStyledAttributes.recycle();
    }
}
