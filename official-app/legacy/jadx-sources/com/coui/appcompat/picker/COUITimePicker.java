package com.coui.appcompat.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.ph2;
import com.support.picker.R$array;
import com.support.picker.R$attr;
import com.support.picker.R$dimen;
import com.support.picker.R$id;
import com.support.picker.R$layout;
import com.support.picker.R$string;
import com.support.picker.R$style;
import com.support.picker.R$styleable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class COUITimePicker extends FrameLayout {
    public COUINumberPicker A;
    public COUINumberPicker B;
    public LinearLayout C;
    public int D;
    public boolean E;
    public int F;
    public int G;
    public i H;
    public int I;
    public int J;
    public int K;
    public int L;
    public j M;
    public String[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Calendar f1858j;
    public Calendar k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Calendar f1859l;
    public SimpleDateFormat m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1860n;
    public int o;
    public int p;
    public int q;
    public long r;
    public Date s;
    public Context t;
    public String[] u;
    public String[] v;
    public String w;
    public String x;
    public COUINumberPicker y;
    public COUINumberPicker z;

    public class a implements COUINumberPicker.f {
        public a() {
        }

        @Override // com.coui.appcompat.picker.COUINumberPicker.f
        public void a(COUINumberPicker cOUINumberPicker, int i, int i2) {
            COUITimePicker.this.D = cOUINumberPicker.getValue();
            COUITimePicker.this.f1858j.set(9, cOUINumberPicker.getValue());
            if (COUITimePicker.this.M != null) {
                j jVar = COUITimePicker.this.M;
                COUITimePicker cOUITimePicker = COUITimePicker.this;
                jVar.a(cOUITimePicker, cOUITimePicker.f1858j);
            }
        }
    }

    public class b implements COUINumberPicker.e {
        public b() {
        }

        @Override // com.coui.appcompat.picker.COUINumberPicker.e
        public void onScrollingStop() {
            COUITimePicker cOUITimePicker = COUITimePicker.this;
            cOUITimePicker.announceForAccessibility(cOUITimePicker.A());
        }
    }

    public class c implements COUINumberPicker.f {
        public c() {
        }

        @Override // com.coui.appcompat.picker.COUINumberPicker.f
        public void a(COUINumberPicker cOUINumberPicker, int i, int i2) {
            if (COUITimePicker.this.u() || COUITimePicker.this.D == 0) {
                COUITimePicker.this.f1858j.set(11, cOUINumberPicker.getValue());
            } else if (COUITimePicker.this.D == 1) {
                if (cOUINumberPicker.getValue() != 12) {
                    COUITimePicker.this.f1858j.set(11, cOUINumberPicker.getValue() + 12);
                } else {
                    COUITimePicker.this.f1858j.set(11, 0);
                }
            }
            if (!COUITimePicker.this.u() && cOUINumberPicker.getValue() == 12) {
                COUITimePicker cOUITimePicker = COUITimePicker.this;
                cOUITimePicker.D = 1 - cOUITimePicker.D;
                COUITimePicker.this.B.setValue(COUITimePicker.this.D);
            }
            if (COUITimePicker.this.M != null) {
                j jVar = COUITimePicker.this.M;
                COUITimePicker cOUITimePicker2 = COUITimePicker.this;
                jVar.a(cOUITimePicker2, cOUITimePicker2.f1858j);
            }
        }
    }

    public class d implements COUINumberPicker.e {
        public d() {
        }

        @Override // com.coui.appcompat.picker.COUINumberPicker.e
        public void onScrollingStop() {
            COUITimePicker cOUITimePicker = COUITimePicker.this;
            cOUITimePicker.announceForAccessibility(cOUITimePicker.A());
        }
    }

    public class e implements COUINumberPicker.f {
        public e() {
        }

        @Override // com.coui.appcompat.picker.COUINumberPicker.f
        public void a(COUINumberPicker cOUINumberPicker, int i, int i2) {
            if (COUITimePicker.this.E) {
                COUITimePicker.this.f1858j.set(12, cOUINumberPicker.getValue() * 5);
            } else {
                COUITimePicker.this.f1858j.set(12, cOUINumberPicker.getValue());
            }
            if (COUITimePicker.this.M != null) {
                j jVar = COUITimePicker.this.M;
                COUITimePicker cOUITimePicker = COUITimePicker.this;
                jVar.a(cOUITimePicker, cOUITimePicker.f1858j);
            }
        }
    }

    public class f implements COUINumberPicker.e {
        public f() {
        }

        @Override // com.coui.appcompat.picker.COUINumberPicker.e
        public void onScrollingStop() {
            COUITimePicker cOUITimePicker = COUITimePicker.this;
            cOUITimePicker.announceForAccessibility(cOUITimePicker.A());
        }
    }

    public class g implements COUINumberPicker.f {
        public g() {
        }

        @Override // com.coui.appcompat.picker.COUINumberPicker.f
        public void a(COUINumberPicker cOUINumberPicker, int i, int i2) {
            Date dateR = COUITimePicker.this.r(cOUINumberPicker.getValue());
            if (dateR != null) {
                COUITimePicker.this.f1858j.set(2, dateR.getMonth());
                COUITimePicker.this.f1858j.set(5, dateR.getDate());
                COUITimePicker.this.f1858j.set(1, dateR.getYear() + 1900);
                if (COUITimePicker.this.M != null) {
                    j jVar = COUITimePicker.this.M;
                    COUITimePicker cOUITimePicker = COUITimePicker.this;
                    jVar.a(cOUITimePicker, cOUITimePicker.f1858j);
                }
            }
        }
    }

    public class h implements COUINumberPicker.e {
        public h() {
        }

        @Override // com.coui.appcompat.picker.COUINumberPicker.e
        public void onScrollingStop() {
            COUITimePicker cOUITimePicker = COUITimePicker.this;
            cOUITimePicker.announceForAccessibility(cOUITimePicker.A());
        }
    }

    public class i implements COUINumberPicker.c {
        public i() {
        }

        @Override // com.coui.appcompat.picker.COUINumberPicker.c
        public String format(int i) {
            int i2 = i - 1;
            COUITimePicker.this.i[i2] = COUITimePicker.this.s(i);
            if (i == COUITimePicker.this.q) {
                COUITimePicker.this.u[i2] = COUITimePicker.this.w;
                return COUITimePicker.this.u[i2];
            }
            if (!Locale.getDefault().getLanguage().equals("zh")) {
                return DateUtils.formatDateTime(COUITimePicker.this.getContext(), COUITimePicker.this.s.getTime(), 524314);
            }
            return new SimpleDateFormat("MMMdd" + COUITimePicker.this.x + " E", Locale.getDefault()).format(Long.valueOf(COUITimePicker.this.s.getTime()));
        }
    }

    public interface j {
        void a(View view, Calendar calendar);
    }

    public COUITimePicker(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x0084, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x00a6, please report this as an issue */
    public final String A() {
        String strQ = q(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMMMddhm"));
        String str = "";
        boolean z = false;
        for (int i2 = 0; i2 < strQ.length(); i2++) {
            char cCharAt = strQ.charAt(i2);
            if (cCharAt == 'K') {
                str = str + this.z.getCurrentText() + this.t.getString(R$string.coui_hour_abbreviation);
            } else if (cCharAt == 'M') {
                if (!z) {
                    str = str + this.H.format(this.y.getValue()) + ",";
                    z = true;
                }
            } else if (cCharAt != 'a') {
                if (cCharAt == 'd') {
                    if (!z) {
                        str = str + this.H.format(this.y.getValue()) + ",";
                        z = true;
                    }
                } else if (cCharAt == 'h') {
                    str = str + this.z.getCurrentText() + this.t.getString(R$string.coui_hour_abbreviation);
                } else if (cCharAt == 'm') {
                    str = str + this.A.getCurrentText() + this.t.getString(R$string.coui_minute_abbreviation);
                } else if (cCharAt == 'y') {
                    if (!z) {
                        str = str + this.H.format(this.y.getValue()) + ",";
                        z = true;
                    }
                }
            } else if (!u()) {
                str = str + (u() ? this.v[0] : this.v[1]);
            }
        }
        return str;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!u()) {
            this.G = 0;
        }
        Paint paint = new Paint();
        paint.setColor(this.y.getBackgroundColor());
        int height = (int) ((getHeight() / 2.0f) - this.F);
        canvas.drawRect(this.G, height, getWidth() - this.G, height + this.L, paint);
        int height2 = (int) ((getHeight() / 2.0f) + this.F);
        canvas.drawRect(this.G, height2, getWidth() - this.G, height2 + this.L, paint);
        super.dispatchDraw(canvas);
    }

    public COUINumberPicker getPickerAmPm() {
        return this.B;
    }

    public COUINumberPicker getPickerDate() {
        return this.y;
    }

    public COUINumberPicker getPickerHour() {
        return this.z;
    }

    public COUINumberPicker getPickerMinute() {
        return this.A;
    }

    public View getTimePicker() {
        int i2;
        StringBuilder sb;
        Calendar calendar = this.f1859l;
        if (calendar != null) {
            i2 = calendar.get(1);
        } else {
            calendar = this.k;
            i2 = calendar.get(1);
        }
        int i3 = i2;
        int i4 = calendar.get(2) + 1;
        int i5 = calendar.get(5);
        int i6 = calendar.get(11);
        int i7 = calendar.get(9);
        int i8 = calendar.get(12);
        this.f1858j.setTimeZone(calendar.getTimeZone());
        this.m.setTimeZone(calendar.getTimeZone());
        int i9 = i4 - 1;
        this.f1858j.set(i3, i9, i5, i6, i8);
        int iT = 36500;
        for (int i10 = 0; i10 < 100; i10++) {
            iT += t((i3 - 50) + i10);
        }
        int iT2 = 0;
        for (int i11 = 0; i11 < 50; i11++) {
            iT2 += t((i3 - 50) + i11);
        }
        String[] strArr = new String[iT];
        this.u = strArr;
        this.i = (String[]) strArr.clone();
        if (i4 > 2 && !w(i3 - 50) && w(i3)) {
            iT2++;
        }
        if (i4 > 2 && w(i3 - 50)) {
            iT2--;
        }
        int i12 = iT2;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeZone(calendar.getTimeZone());
        int i13 = iT;
        calendar2.set(i3, i9, i5, i6, i8);
        if (w(i3) && i4 == 2 && i5 == 29) {
            calendar2.add(5, 1);
        }
        calendar2.add(1, -50);
        this.r = calendar2.getTimeInMillis();
        this.s = new Date();
        if (u()) {
            this.z.setMaxValue(23);
            this.z.setMinValue(0);
            this.z.setTwoDigitFormatter();
            this.B.setVisibility(8);
        } else {
            this.z.setMaxValue(12);
            this.z.setMinValue(1);
            this.B.setMaxValue(this.v.length - 1);
            this.B.setMinValue(0);
            this.B.setDisplayedValues(this.v);
            this.B.setVisibility(0);
            this.B.setWrapSelectorWheel(false);
        }
        this.z.setWrapSelectorWheel(true);
        if (u()) {
            this.z.setValue(i6);
        } else {
            if (i7 > 0) {
                this.z.setValue(i6 - 12);
            } else {
                this.z.setValue(i6);
            }
            this.B.setValue(i7);
            this.D = i7;
        }
        this.B.setOnValueChangedListener(new a());
        this.B.setOnScrollingStopListener(new b());
        this.z.setOnValueChangedListener(new c());
        this.z.setOnScrollingStopListener(new d());
        this.A.setMinValue(0);
        if (this.E) {
            this.A.setMinValue(0);
            this.A.setMaxValue(11);
            String[] strArr2 = new String[12];
            int i14 = 0;
            for (int i15 = 12; i14 < i15; i15 = 12) {
                int i16 = i14 * 5;
                if (i16 < 10) {
                    sb = new StringBuilder();
                    sb.append("0");
                    sb.append(i16);
                } else {
                    sb = new StringBuilder();
                    sb.append(i16);
                    sb.append("");
                }
                strArr2[i14] = sb.toString();
                i14++;
            }
            this.A.setDisplayedValues(strArr2);
            int i17 = i8 / 5;
            this.A.setValue(i17);
            this.f1858j.set(12, Integer.parseInt(strArr2[i17]));
        } else {
            this.A.setMaxValue(59);
            this.A.setValue(i8);
        }
        this.A.setTwoDigitFormatter();
        this.A.setWrapSelectorWheel(true);
        this.A.setOnValueChangedListener(new e());
        this.A.setOnScrollingStopListener(new f());
        this.y.setMinValue(1);
        this.y.setMaxValue(i13);
        this.y.setWrapSelectorWheel(false);
        this.y.setValue(i12);
        i iVar = new i();
        this.H = iVar;
        this.y.setFormatter(iVar);
        this.y.setOnValueChangedListener(new g());
        this.y.setOnScrollingStopListener(new h());
        return this;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i4 = this.K;
        if (i4 > 0 && size > i4) {
            size = i4;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, mode);
        this.A.clearNumberPickerPadding();
        this.z.clearNumberPickerPadding();
        this.y.clearNumberPickerPadding();
        this.B.clearNumberPickerPadding();
        float f2 = size / (((this.A.getLayoutParams().width + this.z.getLayoutParams().width) + this.y.getLayoutParams().width) + this.B.getLayoutParams().width);
        y(this.A, i2, i3, f2);
        y(this.z, i2, i3, f2);
        y(this.y, i2, i3, f2);
        y(this.B, i2, i3, f2);
        int measuredWidth = ((((size - this.A.getMeasuredWidth()) - this.z.getMeasuredWidth()) - this.y.getMeasuredWidth()) - (u() ? 0 : this.B.getMeasuredWidth())) / 2;
        if (this.C.getChildAt(this.I) instanceof COUINumberPicker) {
            ((COUINumberPicker) this.C.getChildAt(this.I)).setNumberPickerPaddingLeft(measuredWidth);
        }
        if (this.C.getChildAt(this.J) instanceof COUINumberPicker) {
            ((COUINumberPicker) this.C.getChildAt(this.J)).setNumberPickerPaddingRight(measuredWidth);
        }
        super.onMeasure(iMakeMeasureSpec, i3);
    }

    public final String q(String str) {
        String strValueOf = String.valueOf(str.charAt(0));
        for (int i2 = 1; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != str.charAt(i2 - 1)) {
                strValueOf = strValueOf + cCharAt;
            }
        }
        return strValueOf;
    }

    public final Date r(int i2) {
        try {
            return this.m.parse(this.i[i2 - 1]);
        } catch (ParseException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final String s(int i2) {
        this.s.setTime(this.r + (((long) i2) * 86400000));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.s);
        if (x(calendar.get(1), calendar.get(2), calendar.get(5))) {
            this.q = i2;
        } else {
            this.q = -1;
        }
        return this.m.format(Long.valueOf(this.s.getTime()));
    }

    public void setNormalTextColor(int i2) {
        COUINumberPicker cOUINumberPicker = this.y;
        if (cOUINumberPicker != null) {
            cOUINumberPicker.setNormalTextColor(i2);
        }
        COUINumberPicker cOUINumberPicker2 = this.z;
        if (cOUINumberPicker2 != null) {
            cOUINumberPicker2.setNormalTextColor(i2);
        }
        COUINumberPicker cOUINumberPicker3 = this.A;
        if (cOUINumberPicker3 != null) {
            cOUINumberPicker3.setNormalTextColor(i2);
        }
        COUINumberPicker cOUINumberPicker4 = this.B;
        if (cOUINumberPicker4 != null) {
            cOUINumberPicker4.setNormalTextColor(i2);
        }
    }

    public void setOnTimeChangeListener(j jVar) {
        this.M = jVar;
    }

    public void setTimePicker(Calendar calendar) {
        this.f1859l = calendar;
        getTimePicker();
    }

    public void setUnitVisible(boolean z) {
        if (z) {
            this.z.setUnitText(getContext().getString(R$string.coui_hour_abbreviation));
            this.A.setUnitText(getContext().getString(R$string.coui_minute_abbreviation));
        } else {
            this.z.setUnitText("");
            this.A.setUnitText("");
        }
    }

    public void setVibrateIntensity(float f2) {
        this.y.setVibrateIntensity(f2);
        this.z.setVibrateIntensity(f2);
        this.A.setVibrateIntensity(f2);
        this.B.setVibrateIntensity(f2);
    }

    public void setVibrateLevel(int i2) {
        this.y.setVibrateLevel(i2);
        this.z.setVibrateLevel(i2);
        this.A.setVibrateLevel(i2);
        this.B.setVibrateLevel(i2);
    }

    public final int t(int i2) {
        return w(i2) ? 366 : 365;
    }

    public final boolean u() {
        String string = Settings.System.getString(this.t.getContentResolver(), "time_12_24");
        return string != null && string.equals("24");
    }

    public boolean v() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public final boolean w(int i2) {
        return (i2 % 4 == 0 && i2 % 100 != 0) || i2 % 400 == 0;
    }

    public final boolean x(int i2, int i3, int i4) {
        return i2 == this.f1860n && i3 == this.o && i4 == this.p;
    }

    public final void y(View view, int i2, int i3, float f2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (f2 < 1.0f) {
            marginLayoutParams.width = (int) (marginLayoutParams.width * f2);
        }
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    public final void z() {
        String strQ = q(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMMMddhm"));
        ViewGroup viewGroup = (ViewGroup) this.y.getParent();
        viewGroup.removeAllViews();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (i2 < strQ.length()) {
            char cCharAt = strQ.charAt(i2);
            if (cCharAt == '\'') {
                int i3 = i2 + 1;
                if (i3 >= strQ.length() || strQ.charAt(i3) != '\'') {
                    z = !z;
                } else {
                    i2 = i3;
                }
            } else if (!z) {
                if (cCharAt == 'K') {
                    viewGroup.addView(this.z);
                    arrayList.add(b2n.g);
                } else if (cCharAt == 'M') {
                    if (!z2) {
                        viewGroup.addView(this.y);
                        arrayList.add("D");
                        z2 = true;
                    }
                } else if (cCharAt == 'a') {
                    viewGroup.addView(this.B);
                    arrayList.add("a");
                } else if (cCharAt == 'd') {
                    if (!z2) {
                        viewGroup.addView(this.y);
                        arrayList.add("D");
                        z2 = true;
                    }
                } else if (cCharAt == 'h') {
                    viewGroup.addView(this.z);
                    arrayList.add(b2n.g);
                } else if (cCharAt == 'm') {
                    viewGroup.addView(this.A);
                    arrayList.add(LogFieldKey.MESSAGE_KEY);
                } else if (cCharAt == 'y') {
                    if (!z2) {
                        viewGroup.addView(this.y);
                        arrayList.add("D");
                        z2 = true;
                    }
                }
                if (!u()) {
                    if (this.I == -1) {
                        this.I = viewGroup.getChildCount() - 1;
                    }
                    this.J = viewGroup.getChildCount() - 1;
                } else if (viewGroup.getChildAt(viewGroup.getChildCount() - 1) != this.B) {
                    if (this.I == -1) {
                        this.I = viewGroup.getChildCount() - 1;
                    }
                    this.J = viewGroup.getChildCount() - 1;
                }
            }
            i2++;
        }
        if (v()) {
            int i4 = this.I;
            this.I = this.J;
            this.J = i4;
        }
    }

    public COUITimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiTimePickerStyle);
    }

    public COUITimePicker(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, R$style.TimePickerStyle);
    }

    public COUITimePicker(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.q = -1;
        this.D = -1;
        this.I = -1;
        this.J = -1;
        ph2.c(this, false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIPickersCommonAttrs, i2, i3);
        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIPickersCommonAttrs_couiPickersMaxWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.t = context;
        this.v = context.getResources().getStringArray(R$array.coui_time_picker_ampm);
        this.w = this.t.getResources().getString(R$string.coui_time_picker_today);
        this.x = this.t.getResources().getString(R$string.coui_time_picker_day);
        this.f1858j = Calendar.getInstance();
        Calendar calendar = Calendar.getInstance();
        this.k = calendar;
        this.f1860n = calendar.get(1);
        this.o = this.k.get(2);
        this.p = this.k.get(5);
        this.m = new SimpleDateFormat("yyyy MMM dd" + this.x + " E", Locale.getDefault());
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.t).inflate(R$layout.coui_time_picker, (ViewGroup) this, true);
        this.y = (COUINumberPicker) viewGroup.findViewById(R$id.coui_time_picker_date);
        this.z = (COUINumberPicker) viewGroup.findViewById(R$id.coui_time_picker_hour);
        this.A = (COUINumberPicker) viewGroup.findViewById(R$id.coui_time_picker_minute);
        this.B = (COUINumberPicker) viewGroup.findViewById(R$id.coui_time_picker_ampm);
        this.C = (LinearLayout) viewGroup.findViewById(R$id.pickers);
        this.F = context.getResources().getDimensionPixelOffset(R$dimen.coui_selected_background_radius);
        this.G = context.getResources().getDimensionPixelOffset(R$dimen.coui_selected_background_horizontal_padding);
        this.L = Math.max(getResources().getDimensionPixelOffset(R$dimen.coui_number_picker_background_divider_height), 1);
        if (!Locale.getDefault().getLanguage().equals("zh") && !Locale.getDefault().getLanguage().equals("en")) {
            this.y.getLayoutParams().width = getResources().getDimensionPixelOffset(R$dimen.coui_number_picker_width_biggest);
        }
        z();
        COUINumberPicker cOUINumberPicker = this.z;
        if (cOUINumberPicker != null && cOUINumberPicker.isAccessibilityEnable()) {
            this.z.addTalkbackSuffix(context.getResources().getString(R$string.coui_hour_abbreviation));
            COUINumberPicker cOUINumberPicker2 = this.A;
            if (cOUINumberPicker2 != null) {
                cOUINumberPicker2.addTalkbackSuffix(context.getResources().getString(R$string.coui_minute_abbreviation));
            }
            COUINumberPicker cOUINumberPicker3 = this.B;
            if (cOUINumberPicker3 != null) {
                cOUINumberPicker3.addTalkbackSuffix(context.getResources().getString(R$string.coui_minute_abbreviation));
            }
        }
        setImportantForAccessibility(1);
    }
}
