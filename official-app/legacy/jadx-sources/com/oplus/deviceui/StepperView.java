package com.oplus.deviceui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.udeviceui.R$id;
import com.heytap.udeviceui.R$layout;
import com.heytap.udeviceui.R$styleable;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.pw7;
import com.oplus.smartenginehelper.ParserTag;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 82\u00020\u0001:\u00029:B\u0011\b\u0016\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104B\u001b\b\u0016\u0012\u0006\u00102\u001a\u000201\u0012\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b3\u00107J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0015J\b\u0010\u0018\u001a\u00020\u000fH\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0002R\u0016\u0010\u001d\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010#R\u0016\u0010*\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010#R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u0006;"}, d2 = {"Lcom/oplus/deviceui/StepperView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "unit", "", "setUnit", "", "value", "setValue", "step", "setStep", "maxValue", "setMaxValue", "minValue", "setMinValue", "", "enable", "setEnable", "Lcom/oplus/deviceui/StepperView$d;", "listener", "setOnChangedListener", "Landroid/widget/ImageView;", "getSubButton", "getAddButton", b2n.g, MapSchema.FIELD_NAME_KEY, "i", "j", "Landroid/widget/ImageView;", "mSubButton", "mAddButton", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "mValueView", LogFieldKey.LEVEL_KEY, "I", "mCurrentValue", LogFieldKey.MESSAGE_KEY, "mMaxValue", "n", "mMinValue", "o", "mStep", LogFieldKey.PROCESS_NAME_KEY, "Ljava/lang/String;", "mUnit", "q", "Lcom/oplus/deviceui/StepperView$d;", "mChangeListener", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "c", "d", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class StepperView extends ConstraintLayout {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public ImageView mSubButton;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public ImageView mAddButton;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public TextView mValueView;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int mCurrentValue;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int mMaxValue;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int mMinValue;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int mStep;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public String mUnit;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public d mChangeListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", ParserTag.TAG_ONCLICK}, k = 3, mv = {1, 4, 2})
    public static final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public final void onClick(View view) {
            StepperView.this.k();
            StepperView.this.i();
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", ParserTag.TAG_ONCLICK}, k = 3, mv = {1, 4, 2})
    public static final class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public final void onClick(View view) {
            StepperView.this.h();
            StepperView.this.i();
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/oplus/deviceui/StepperView$d;", "", "", "value", "", "c", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
    public interface d {
        void c(int value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepperView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mCurrentValue = 50;
        this.mMaxValue = 100;
        this.mStep = 1;
        this.mUnit = "";
        View.inflate(getContext(), R$layout.stepper_layout, this);
        View viewFindViewById = findViewById(R$id.sub_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.sub_btn)");
        this.mSubButton = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.add_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.add_btn)");
        this.mAddButton = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.value);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.value)");
        TextView textView = (TextView) viewFindViewById3;
        this.mValueView = textView;
        pw7 pw7Var = pw7.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        textView.setTextSize(pw7Var.c(context2));
        this.mSubButton.setOnClickListener(new a());
        this.mAddButton.setOnClickListener(new b());
    }

    @NotNull
    /* JADX INFO: renamed from: getAddButton, reason: from getter */
    public final ImageView getMAddButton() {
        return this.mAddButton;
    }

    @NotNull
    /* JADX INFO: renamed from: getSubButton, reason: from getter */
    public final ImageView getMSubButton() {
        return this.mSubButton;
    }

    public final boolean h() {
        boolean z;
        int i = this.mCurrentValue;
        int i2 = this.mMaxValue;
        if (i < i2) {
            int i3 = this.mStep;
            if (i + i3 < i2) {
                i2 = i + i3;
            }
            this.mCurrentValue = i2;
            j();
            d dVar = this.mChangeListener;
            if (dVar != null) {
                dVar.c(this.mCurrentValue);
            }
            z = true;
        } else {
            z = false;
        }
        i();
        return z;
    }

    public final void i() {
        int i = this.mCurrentValue;
        if (i <= this.mMinValue) {
            this.mSubButton.setEnabled(false);
            this.mCurrentValue = this.mMinValue;
        } else if (i >= this.mMaxValue) {
            this.mAddButton.setEnabled(false);
            this.mCurrentValue = this.mMaxValue;
        } else {
            this.mSubButton.setEnabled(true);
            this.mAddButton.setEnabled(true);
        }
    }

    public final void j() {
        this.mValueView.setText(this.mCurrentValue + this.mUnit);
    }

    public final boolean k() {
        boolean z;
        int i = this.mCurrentValue;
        int i2 = this.mMinValue;
        if (i > i2) {
            int i3 = this.mStep;
            if (i - i3 > i2) {
                i2 = i - i3;
            }
            this.mCurrentValue = i2;
            j();
            d dVar = this.mChangeListener;
            if (dVar != null) {
                dVar.c(this.mCurrentValue);
            }
            z = true;
        } else {
            z = false;
        }
        i();
        return z;
    }

    public final void setEnable(boolean enable) {
        setAlpha(enable ? 1.0f : 0.3f);
        this.mAddButton.setEnabled(enable);
        this.mSubButton.setEnabled(enable);
        if (enable) {
            i();
        }
    }

    public final void setMaxValue(int maxValue) {
        this.mMaxValue = maxValue;
        i();
    }

    public final void setMinValue(int minValue) {
        this.mMinValue = minValue;
        i();
    }

    public final void setOnChangedListener(@NotNull d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mChangeListener = listener;
    }

    public final void setStep(int step) {
        this.mStep = step;
    }

    public final void setUnit(@NotNull String unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.mUnit = unit;
        j();
    }

    public final void setValue(int value) {
        this.mCurrentValue = value;
        j();
        i();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepperView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mCurrentValue = 50;
        this.mMaxValue = 100;
        this.mStep = 1;
        this.mUnit = "";
        View.inflate(getContext(), R$layout.stepper_layout, this);
        View viewFindViewById = findViewById(R$id.sub_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.sub_btn)");
        this.mSubButton = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.add_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.add_btn)");
        this.mAddButton = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.value);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.value)");
        TextView textView = (TextView) viewFindViewById3;
        this.mValueView = textView;
        pw7 pw7Var = pw7.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        textView.setTextSize(pw7Var.c(context2));
        this.mSubButton.setOnClickListener(new a());
        this.mAddButton.setOnClickListener(new b());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.StepperView);
        this.mCurrentValue = typedArrayObtainStyledAttributes.getInt(R$styleable.StepperView_current_value, 50);
        this.mMaxValue = typedArrayObtainStyledAttributes.getInt(R$styleable.StepperView_max_value, 100);
        this.mMinValue = typedArrayObtainStyledAttributes.getInt(R$styleable.StepperView_min_value, 0);
        this.mStep = typedArrayObtainStyledAttributes.getInt(R$styleable.StepperView_step_value, 1);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.StepperView_unit);
        this.mUnit = string != null ? string : "";
        j();
        typedArrayObtainStyledAttributes.recycle();
    }
}
