package com.oplus.deviceui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.content.ContextCompat;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.udeviceui.R$bool;
import com.heytap.udeviceui.R$color;
import com.heytap.udeviceui.R$dimen;
import com.heytap.udeviceui.R$drawable;
import com.heytap.udeviceui.R$id;
import com.heytap.udeviceui.R$layout;
import com.heytap.udeviceui.R$styleable;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.n52;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import java.util.HashMap;
import org.hapjs.card.sdk.CardServiceDelegator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0011\b\u0016\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(B\u001b\b\u0017\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b'\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000bH\u0002R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0013\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0016\u0010$\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001c¨\u0006."}, d2 = {"Lcom/oplus/deviceui/BatteryView;", "Landroid/widget/FrameLayout;", "", "getDefaultColor", "", "onFinishInflate", "getPower", "power", "setPower", CardServiceDelegator.KEY_COLOR_INT, "c", "", "charging", "setIsCharging", "isVisible", ClickApiEntity.SET_VISIBILITY, "", Const.Arguments.Open.STYLE, "setBatteryStyle", "isExported", "b", "i", "I", "mPower", "j", "Ljava/lang/String;", "mStyle", MapSchema.FIELD_NAME_KEY, "Z", "isCharging", "Landroid/widget/ProgressBar;", LogFieldKey.LEVEL_KEY, "Landroid/widget/ProgressBar;", "mProgressView", LogFieldKey.MESSAGE_KEY, "n", "isFixedChargeSpace", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "a", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class BatteryView extends FrameLayout {
    public static final int DEFAULT_PROGRESS_COLOR_INT = 0;

    @NotNull
    public static final String STYLE_NORMAL = "normal";

    @NotNull
    public static final String STYLE_SMALL = "small";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int mPower;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public String mStyle;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isCharging;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public ProgressBar mProgressView;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean isExported;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean isFixedChargeSpace;
    public HashMap o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mStyle = "normal";
        View.inflate(getContext(), R$layout.battery_layout, this);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        boolean z = context2.getResources().getBoolean(R$bool.udevice_exported);
        this.isExported = z;
        b(z);
    }

    private final int getDefaultColor() {
        if (n52.INSTANCE.a()) {
            return this.isExported ? ContextCompat.getColor(getContext(), R$color.link_progress_op) : ContextCompat.getColor(getContext(), R$color.black_85);
        }
        return ContextCompat.getColor(getContext(), R$color.link_progress);
    }

    public View a(int i) {
        if (this.o == null) {
            this.o = new HashMap();
        }
        View view = (View) this.o.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.o.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    public final void b(boolean isExported) {
        Log.i("BatteryView", "inflate : " + isExported);
        if (isExported && n52.INSTANCE.a()) {
            ((ViewStub) findViewById(R$id.mStubBatteryOp)).inflate();
            this.mProgressView = (ProgressBar) a(R$id.mProgressBatteryOp);
        } else {
            ((ViewStub) findViewById(R$id.mStubBatteryCommon)).inflate();
            this.mProgressView = (ProgressBar) a(R$id.mProgressBattery);
        }
    }

    public final void c(int power, int colorInt) {
        if (colorInt == 0) {
            colorInt = ContextCompat.getColor(getContext(), R$color.link_progress);
        }
        ImageView imageView = (ImageView) a(R$id.mIconCharge);
        if (imageView != null) {
            imageView.setImageTintList(ColorStateList.valueOf(colorInt));
        }
        this.mPower = power;
        if (power <= 20) {
            ProgressBar progressBar = this.mProgressView;
            if (progressBar != null) {
                progressBar.setProgressTintList(ColorStateList.valueOf(ContextCompat.getColor(getContext(), R$color.link_progress_red)));
            }
        } else {
            ProgressBar progressBar2 = this.mProgressView;
            if (progressBar2 != null) {
                progressBar2.setProgressTintList(ColorStateList.valueOf(colorInt));
            }
        }
        ProgressBar progressBar3 = this.mProgressView;
        if (progressBar3 != null) {
            progressBar3.setProgress(this.mPower);
        }
    }

    /* JADX INFO: renamed from: getPower, reason: from getter */
    public final int getMPower() {
        return this.mPower;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setPower(this.mPower);
        setBatteryStyle(this.mStyle);
    }

    public final void setBatteryStyle(@NotNull String style) {
        Intrinsics.checkNotNullParameter(style, "style");
        if (this.isExported && n52.INSTANCE.a()) {
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
        if (Intrinsics.areEqual(style, STYLE_SMALL)) {
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

    public final void setIsCharging(boolean charging) {
        this.isCharging = charging;
        ImageView imageView = (ImageView) a(R$id.mIconChargeOp);
        if (imageView != null) {
            imageView.setVisibility(this.isCharging ? 0 : 8);
        }
        int i = this.isFixedChargeSpace ? 4 : 8;
        ImageView imageView2 = (ImageView) a(R$id.mIconCharge);
        if (imageView2 != null) {
            imageView2.setVisibility(this.isCharging ? 0 : i);
        }
    }

    public final void setPower(int power) {
        c(power, getDefaultColor());
    }

    public final void setVisibility(boolean isVisible) {
        setVisibility(isVisible ? 0 : 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public BatteryView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mStyle = "normal";
        View.inflate(getContext(), R$layout.battery_layout, this);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        boolean z = context2.getResources().getBoolean(R$bool.udevice_exported);
        this.isExported = z;
        b(z);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LinkBatteryView);
        this.mPower = typedArrayObtainStyledAttributes.getInt(R$styleable.LinkBatteryView_batteryPower, 0);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.LinkBatteryView_batteryStyle);
        this.mStyle = string != null ? string : "normal";
        this.isFixedChargeSpace = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LinkBatteryView_fixedChargeSpace, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
