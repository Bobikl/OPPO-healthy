package com.coui.appcompat.picker;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.ph2;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.picker.R$array;
import com.support.picker.R$attr;
import com.support.picker.R$dimen;
import com.support.picker.R$id;
import com.support.picker.R$layout;
import com.support.picker.R$string;
import com.support.picker.R$style;
import com.support.picker.R$styleable;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class COUITimeLimitPicker extends FrameLayout {
    public static final i D = new a();
    public Context A;
    public int B;
    public int C;
    public final COUINumberPicker i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final COUINumberPicker f1855j;
    public final COUINumberPicker k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Button f1856l;
    public final String[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1857n;
    public int o;
    public LinearLayout p;
    public boolean q;
    public boolean r;
    public TextView s;
    public TextView t;
    public boolean u;
    public i v;
    public Calendar w;
    public Locale x;
    public int y;
    public int z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        private final int mHour;
        private final int mMinute;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        public int getHour() {
            return this.mHour;
        }

        public int getMinute() {
            return this.mMinute;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mHour);
            parcel.writeInt(this.mMinute);
        }

        public /* synthetic */ SavedState(Parcelable parcelable, int i, int i2, a aVar) {
            this(parcelable, i, i2);
        }

        private SavedState(Parcelable parcelable, int i, int i2) {
            super(parcelable);
            this.mHour = i;
            this.mMinute = i2;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.mHour = parcel.readInt();
            this.mMinute = parcel.readInt();
        }
    }

    public class a implements i {
        @Override // com.coui.appcompat.picker.COUITimeLimitPicker.i
        public void d(COUITimeLimitPicker cOUITimeLimitPicker, int i, int i2) {
        }
    }

    public class b implements COUINumberPicker.f {
        public b() {
        }

        @Override // com.coui.appcompat.picker.COUINumberPicker.f
        public void a(COUINumberPicker cOUINumberPicker, int i, int i2) {
            COUITimeLimitPicker.this.j();
        }
    }

    public class c implements COUINumberPicker.e {
        public c() {
        }

        @Override // com.coui.appcompat.picker.COUINumberPicker.e
        public void onScrollingStop() {
            COUITimeLimitPicker.this.f();
        }
    }

    public class d implements COUINumberPicker.f {
        public d() {
        }

        @Override // com.coui.appcompat.picker.COUINumberPicker.f
        public void a(COUINumberPicker cOUINumberPicker, int i, int i2) {
            COUITimeLimitPicker.this.j();
        }
    }

    public class e implements COUINumberPicker.e {
        public e() {
        }

        @Override // com.coui.appcompat.picker.COUINumberPicker.e
        public void onScrollingStop() {
            COUITimeLimitPicker.this.f();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            view.requestFocus();
            COUITimeLimitPicker cOUITimeLimitPicker = COUITimeLimitPicker.this;
            cOUITimeLimitPicker.r = !cOUITimeLimitPicker.r;
            COUITimeLimitPicker.this.n();
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public class g implements COUINumberPicker.f {
        public g() {
        }

        @Override // com.coui.appcompat.picker.COUINumberPicker.f
        public void a(COUINumberPicker cOUINumberPicker, int i, int i2) {
            cOUINumberPicker.requestFocus();
            COUITimeLimitPicker cOUITimeLimitPicker = COUITimeLimitPicker.this;
            cOUITimeLimitPicker.r = !cOUITimeLimitPicker.r;
            COUITimeLimitPicker.this.n();
            COUITimeLimitPicker.this.j();
        }
    }

    public class h implements COUINumberPicker.e {
        public h() {
        }

        @Override // com.coui.appcompat.picker.COUINumberPicker.e
        public void onScrollingStop() {
            COUITimeLimitPicker.this.f();
        }
    }

    public interface i {
        void d(COUITimeLimitPicker cOUITimeLimitPicker, int i, int i2);
    }

    public COUITimeLimitPicker(Context context) {
        this(context, null);
    }

    private void setCurrentLocale(Locale locale) {
        if (locale.equals(this.x)) {
            return;
        }
        this.x = locale;
        this.w = Calendar.getInstance(locale);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(this.i.getBackgroundColor());
        int height = (int) ((getHeight() / 2.0f) - this.y);
        canvas.drawRect(this.z, height, getWidth() - this.z, height + this.C, paint);
        int height2 = (int) ((getHeight() / 2.0f) + this.y);
        canvas.drawRect(this.z, height2, getWidth() - this.z, height2 + this.C, paint);
        super.dispatchDraw(canvas);
    }

    public final void f() {
        String str;
        String str2 = this.r ? this.m[0] : this.m[1];
        if (this.q) {
            str = this.i.getCurrentText() + this.A.getString(R$string.coui_hour_abbreviation) + "," + this.f1855j.getCurrentText() + this.A.getString(R$string.coui_minute_abbreviation);
        } else {
            str = str2 + "," + this.i.getCurrentText() + this.A.getString(R$string.coui_hour_abbreviation) + "," + this.f1855j.getCurrentText() + this.A.getString(R$string.coui_minute_abbreviation);
        }
        announceForAccessibility(str);
    }

    public boolean g() {
        return this.q;
    }

    public COUINumberPicker getAmPmSpinner() {
        return this.k;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.i.getBaseline();
    }

    public Integer getCurrentHour() {
        int value = this.i.getValue();
        if (g()) {
            return Integer.valueOf(value);
        }
        return this.r ? Integer.valueOf(value % 12) : Integer.valueOf((value % 12) + 12);
    }

    public Integer getCurrentMinute() {
        return Integer.valueOf(this.f1855j.getValue());
    }

    public COUINumberPicker getHourSpinner() {
        return this.i;
    }

    public COUINumberPicker getMinuteSpinner() {
        return this.f1855j;
    }

    public boolean h() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public final void i(View view, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.u;
    }

    public final void j() {
        i iVar = this.v;
        if (iVar != null) {
            iVar.d(this, getCurrentHour().intValue(), getCurrentMinute().intValue());
        }
    }

    public void k() {
        COUINumberPicker cOUINumberPicker = this.i;
        if (cOUINumberPicker != null) {
            cOUINumberPicker.refresh();
        }
        COUINumberPicker cOUINumberPicker2 = this.f1855j;
        if (cOUINumberPicker2 != null) {
            cOUINumberPicker2.refresh();
        }
        COUINumberPicker cOUINumberPicker3 = this.k;
        if (cOUINumberPicker3 != null) {
            cOUINumberPicker3.refresh();
        }
    }

    public final void l() {
        COUINumberPicker cOUINumberPicker;
        if (DateFormat.getBestDateTimePattern(Locale.getDefault(), "hm").startsWith("a") || (cOUINumberPicker = this.k) == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) cOUINumberPicker.getParent();
        viewGroup.removeView(this.k);
        viewGroup.addView(this.k);
    }

    public void m(Integer num, @NonNull Integer num2) {
        if (num2.equals(getCurrentMinute()) && num.equals(getCurrentHour())) {
            return;
        }
        int iIntValue = num.intValue();
        if (!g()) {
            if (num.intValue() >= 12) {
                this.r = false;
                if (num.intValue() > 12) {
                    iIntValue = num.intValue() - 12;
                }
            } else {
                this.r = true;
                if (num.intValue() == 0) {
                    iIntValue = 12;
                }
            }
            n();
        }
        this.i.setValue(iIntValue);
        this.f1855j.setValue(num2.intValue());
        j();
    }

    public final void n() {
        if (g()) {
            COUINumberPicker cOUINumberPicker = this.k;
            if (cOUINumberPicker != null) {
                cOUINumberPicker.setVisibility(8);
                return;
            } else {
                this.f1856l.setVisibility(8);
                return;
            }
        }
        int i2 = !this.r ? 1 : 0;
        COUINumberPicker cOUINumberPicker2 = this.k;
        if (cOUINumberPicker2 != null) {
            cOUINumberPicker2.setValue(i2);
            this.k.setVisibility(0);
        } else {
            this.f1856l.setText(this.m[i2]);
            this.f1856l.setVisibility(0);
        }
    }

    public final void o() {
        if (g()) {
            this.i.setMinValue(0);
            this.i.setMaxValue(23);
            this.i.setTwoDigitFormatter();
        } else {
            this.i.setMinValue(1);
            this.i.setMaxValue(12);
        }
        this.i.setWrapSelectorWheel(true);
        this.f1855j.setWrapSelectorWheel(true);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setCurrentLocale(configuration.locale);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i4 = this.B;
        if (i4 > 0 && size > i4) {
            size = i4;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, mode);
        this.f1857n = -1;
        for (int i5 = 0; i5 < this.p.getChildCount(); i5++) {
            View childAt = this.p.getChildAt(i5);
            if ((childAt instanceof COUINumberPicker) && childAt.getVisibility() == 0) {
                if (this.f1857n == -1) {
                    this.f1857n = i5;
                }
                this.o = i5;
                ((COUINumberPicker) childAt).clearNumberPickerPadding();
                i(childAt, i2, i3);
                size -= childAt.getMeasuredWidth();
            }
        }
        int i6 = size / 2;
        if (h()) {
            int i7 = this.f1857n;
            this.f1857n = this.o;
            this.o = i7;
        }
        if (this.p.getChildAt(this.f1857n) instanceof COUINumberPicker) {
            ((COUINumberPicker) this.p.getChildAt(this.f1857n)).setNumberPickerPaddingLeft(i6);
        }
        if (this.p.getChildAt(this.o) instanceof COUINumberPicker) {
            ((COUINumberPicker) this.p.getChildAt(this.o)).setNumberPickerPaddingRight(i6);
        }
        super.onMeasure(iMakeMeasureSpec, i3);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentHour(Integer.valueOf(savedState.getHour()));
        setCurrentMinute(Integer.valueOf(savedState.getMinute()));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), getCurrentHour().intValue(), getCurrentMinute().intValue(), null);
    }

    public void setCurrentHour(Integer num) {
        if (num == null || num.intValue() == getCurrentHour().intValue()) {
            return;
        }
        if (!g()) {
            if (num.intValue() >= 12) {
                this.r = false;
                if (num.intValue() > 12) {
                    num = Integer.valueOf(num.intValue() - 12);
                }
            } else {
                this.r = true;
                if (num.intValue() == 0) {
                    num = 12;
                }
            }
            n();
        }
        this.i.setValue(num.intValue());
        j();
    }

    public void setCurrentMinute(@NonNull Integer num) {
        if (num.equals(getCurrentMinute())) {
            return;
        }
        this.f1855j.setValue(num.intValue());
        j();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.u == z) {
            return;
        }
        super.setEnabled(z);
        this.f1855j.setEnabled(z);
        this.i.setEnabled(z);
        COUINumberPicker cOUINumberPicker = this.k;
        if (cOUINumberPicker != null) {
            cOUINumberPicker.setEnabled(z);
        } else {
            this.f1856l.setEnabled(z);
        }
        this.u = z;
    }

    public void setIs24HourView(Boolean bool) {
        if (this.q == bool.booleanValue()) {
            return;
        }
        int iIntValue = getCurrentHour().intValue();
        this.q = bool.booleanValue();
        o();
        setCurrentHour(Integer.valueOf(iIntValue));
        n();
        this.i.requestLayout();
    }

    public void setNormalTextColor(int i2) {
        COUINumberPicker cOUINumberPicker = this.i;
        if (cOUINumberPicker != null) {
            cOUINumberPicker.setNormalTextColor(i2);
        }
        COUINumberPicker cOUINumberPicker2 = this.f1855j;
        if (cOUINumberPicker2 != null) {
            cOUINumberPicker2.setNormalTextColor(i2);
        }
        COUINumberPicker cOUINumberPicker3 = this.k;
        if (cOUINumberPicker3 != null) {
            cOUINumberPicker3.setNormalTextColor(i2);
        }
    }

    public void setOnTimeChangedListener(i iVar) {
        this.v = iVar;
    }

    public void setRowNumber(int i2) {
        COUINumberPicker cOUINumberPicker;
        if (i2 <= 0 || (cOUINumberPicker = this.i) == null || this.f1855j == null || this.k == null) {
            return;
        }
        cOUINumberPicker.setPickerRowNumber(i2);
        this.f1855j.setPickerRowNumber(i2);
        this.k.setPickerRowNumber(i2);
    }

    public void setTextVisibility(boolean z) {
        if (z) {
            this.s.setVisibility(0);
            this.t.setVisibility(0);
        } else {
            this.s.setVisibility(8);
            this.t.setVisibility(8);
        }
    }

    public void setUnitVisible(boolean z) {
        if (z) {
            this.i.setUnitText(getContext().getString(R$string.coui_hour_abbreviation));
            this.f1855j.setUnitText(getContext().getString(R$string.coui_minute_abbreviation));
        } else {
            this.i.setUnitText("");
            this.f1855j.setUnitText("");
        }
    }

    public void setVibrateIntensity(float f2) {
        this.i.setVibrateIntensity(f2);
        this.f1855j.setVibrateIntensity(f2);
        this.k.setVibrateIntensity(f2);
    }

    public void setVibrateLevel(int i2) {
        this.i.setVibrateLevel(i2);
        this.f1855j.setVibrateLevel(i2);
        this.k.setVibrateLevel(i2);
    }

    public COUITimeLimitPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiTimePickerStyle);
    }

    public COUITimeLimitPicker(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, R$style.TimePickerStyle);
    }

    public COUITimeLimitPicker(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f1857n = -1;
        this.o = -1;
        this.u = true;
        ph2.c(this, false);
        setCurrentLocale(Locale.getDefault());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIPickersCommonAttrs, i2, i3);
        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIPickersCommonAttrs_couiPickersMaxWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.C = Math.max(getResources().getDimensionPixelOffset(R$dimen.coui_number_picker_background_divider_height), 1);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R$layout.coui_time_limit_picker, (ViewGroup) this, true);
        this.s = (TextView) findViewById(R$id.coui_timepicker_minute_text);
        this.t = (TextView) findViewById(R$id.coui_timepicker_hour_text);
        COUINumberPicker cOUINumberPicker = (COUINumberPicker) findViewById(R$id.hour);
        this.i = cOUINumberPicker;
        cOUINumberPicker.setOnValueChangedListener(new b());
        cOUINumberPicker.setOnScrollingStopListener(new c());
        cOUINumberPicker.setUnitText("");
        this.s.setTextAlignment(5);
        this.t.setTextAlignment(5);
        this.p = (LinearLayout) findViewById(R$id.time_pickers);
        COUINumberPicker cOUINumberPicker2 = (COUINumberPicker) findViewById(R$id.minute);
        this.f1855j = cOUINumberPicker2;
        cOUINumberPicker2.setTwoDigitFormatter();
        cOUINumberPicker2.setMinValue(0);
        cOUINumberPicker2.setMaxValue(59);
        cOUINumberPicker2.setUnitText("");
        cOUINumberPicker2.setOnLongPressUpdateInterval(100L);
        cOUINumberPicker2.setOnValueChangedListener(new d());
        cOUINumberPicker2.setOnScrollingStopListener(new e());
        String[] stringArray = getContext().getResources().getStringArray(R$array.coui_time_picker_ampm);
        this.m = stringArray;
        View viewFindViewById = findViewById(R$id.amPm);
        if (viewFindViewById instanceof Button) {
            this.k = null;
            Button button = (Button) viewFindViewById;
            this.f1856l = button;
            button.setOnClickListener(new f());
        } else {
            this.f1856l = null;
            COUINumberPicker cOUINumberPicker3 = (COUINumberPicker) viewFindViewById;
            this.k = cOUINumberPicker3;
            cOUINumberPicker3.setMinValue(0);
            cOUINumberPicker3.setMaxValue(1);
            cOUINumberPicker3.setDisplayedValues(stringArray);
            cOUINumberPicker3.setOnValueChangedListener(new g());
            cOUINumberPicker3.setOnScrollingStopListener(new h());
        }
        o();
        n();
        setOnTimeChangedListener(D);
        setCurrentHour(Integer.valueOf(this.w.get(11)));
        setCurrentMinute(Integer.valueOf(this.w.get(12)));
        if (!isEnabled()) {
            setEnabled(false);
        }
        l();
        if (cOUINumberPicker.isAccessibilityEnable()) {
            cOUINumberPicker.addTalkbackSuffix(context.getString(R$string.coui_hour_abbreviation));
            cOUINumberPicker2.addTalkbackSuffix(context.getString(R$string.coui_minute_abbreviation));
        }
        this.y = context.getResources().getDimensionPixelOffset(R$dimen.coui_selected_background_radius);
        this.z = context.getResources().getDimensionPixelOffset(R$dimen.coui_selected_background_horizontal_padding);
        setImportantForAccessibility(1);
        this.A = context;
    }
}
