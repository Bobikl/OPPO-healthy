package com.coui.appcompat.picker;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.oplus.aiunit.vision.cj2;
import com.oplus.aiunit.vision.ph2;
import com.support.picker.R$array;
import com.support.picker.R$attr;
import com.support.picker.R$dimen;
import com.support.picker.R$id;
import com.support.picker.R$layout;
import com.support.picker.R$string;
import com.support.picker.R$style;
import com.support.picker.R$styleable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class COUILunarDatePicker extends FrameLayout {
    public static final int IGNORED_YEAR = Integer.MIN_VALUE;
    public static final String x = "COUILunarDatePicker";
    public static String z;
    public final LinearLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final COUINumberPicker f1844j;
    public final COUINumberPicker k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final COUINumberPicker f1845l;
    public Locale m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String[] f1846n;
    public int o;
    public c p;
    public c q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public int w;
    public static final String[] y = {"一", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "十二"};
    public static Calendar A = Calendar.getInstance();
    public static Calendar B = Calendar.getInstance();

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        private final int mDay;
        private final int mMonth;
        private final int mYear;

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

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mYear);
            parcel.writeInt(this.mMonth);
            parcel.writeInt(this.mDay);
        }

        public /* synthetic */ SavedState(Parcelable parcelable, int i, int i2, int i3, a aVar) {
            this(parcelable, i, i2, i3);
        }

        private SavedState(Parcelable parcelable, int i, int i2, int i3) {
            super(parcelable);
            this.mYear = i;
            this.mMonth = i2;
            this.mDay = i3;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.mYear = parcel.readInt();
            this.mMonth = parcel.readInt();
            this.mDay = parcel.readInt();
        }
    }

    public class a implements COUINumberPicker.f {
        public a() {
        }

        @Override // com.coui.appcompat.picker.COUINumberPicker.f
        public void a(COUINumberPicker cOUINumberPicker, int i, int i2) {
            COUILunarDatePicker.this.p.o(COUILunarDatePicker.this.q);
            cj2.a(COUILunarDatePicker.this.p.i(1), COUILunarDatePicker.this.p.i(2) + 1, COUILunarDatePicker.this.p.i(5));
            if (cOUINumberPicker == COUILunarDatePicker.this.f1844j) {
                COUILunarDatePicker.this.p.f(5, i, i2);
            } else if (cOUINumberPicker == COUILunarDatePicker.this.k) {
                COUILunarDatePicker.this.p.f(2, i, i2);
            } else {
                if (cOUINumberPicker != COUILunarDatePicker.this.f1845l) {
                    throw new IllegalArgumentException();
                }
                COUILunarDatePicker.this.p.f(1, i, i2);
            }
            COUILunarDatePicker cOUILunarDatePicker = COUILunarDatePicker.this;
            cOUILunarDatePicker.setDate(cOUILunarDatePicker.p);
            COUILunarDatePicker.this.u();
            COUILunarDatePicker.this.t();
            COUILunarDatePicker.this.r();
        }
    }

    public class b implements COUINumberPicker.e {
        public b() {
        }

        @Override // com.coui.appcompat.picker.COUINumberPicker.e
        public void onScrollingStop() {
            COUILunarDatePicker cOUILunarDatePicker = COUILunarDatePicker.this;
            cOUILunarDatePicker.announceForAccessibility(COUILunarDatePicker.o(cOUILunarDatePicker.q));
        }
    }

    public interface d {
    }

    static {
        A.set(1910, 2, 10, 0, 0);
        B.set(2099, 11, 31, 23, 59);
    }

    public COUILunarDatePicker(Context context) {
        this(context, null);
    }

    public static String n(int i, int i2, int i3, int i4) {
        if (i2 <= 0) {
            return "";
        }
        if (i == Integer.MIN_VALUE) {
            StringBuilder sb = new StringBuilder();
            sb.append(i4 == 0 ? z : "");
            sb.append(y[i2 - 1]);
            sb.append("月");
            sb.append(cj2.c(i3));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        sb2.append("年");
        sb2.append(i4 == 0 ? z : "");
        sb2.append(y[i2 - 1]);
        sb2.append("月");
        sb2.append(cj2.c(i3));
        return sb2.toString();
    }

    public static String o(c cVar) {
        int[] iArrA = cj2.a(cVar.i(1), cVar.i(2) + 1, cVar.i(5));
        return n(iArrA[0], iArrA[1], iArrA[2], iArrA[3]);
    }

    private void setCurrentLocale(Locale locale) {
        if (locale.equals(this.m)) {
            return;
        }
        this.m = locale;
        this.p = l(this.p, locale);
        A = m(A, locale);
        B = m(B, locale);
        this.q = l(this.q, locale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDate(c cVar) {
        this.q.o(cVar);
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(this.f1844j.getBackgroundColor());
        int height = (int) ((getHeight() / 2.0f) - this.r);
        canvas.drawRect(this.s, height, getWidth() - this.s, height + this.t, paint);
        int height2 = (int) ((getHeight() / 2.0f) + this.r);
        canvas.drawRect(this.s, height2, getWidth() - this.s, height2 + this.t, paint);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public CalendarView getCalendarView() {
        return null;
    }

    public boolean getCalendarViewShown() {
        return false;
    }

    public int getDayOfMonth() {
        return this.q.i(5);
    }

    public COUINumberPicker getDaySpinner() {
        return this.f1844j;
    }

    public int getLeapMonth() {
        return cj2.k(this.q.i(1));
    }

    public int[] getLunarDate() {
        return cj2.a(this.q.i(1), this.q.i(2) + 1, this.q.i(5));
    }

    public long getMaxDate() {
        return B.getTimeInMillis();
    }

    public long getMinDate() {
        return A.getTimeInMillis();
    }

    public int getMonth() {
        return this.q.i(2);
    }

    public COUINumberPicker getMonthSpinner() {
        return this.k;
    }

    public d getOnDateChangedListener() {
        return null;
    }

    public boolean getSpinnersShown() {
        return this.i.isShown();
    }

    public int getYear() {
        return this.q.i(1);
    }

    public COUINumberPicker getYearSpinner() {
        return this.f1845l;
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.u;
    }

    public final void k() {
        this.q.g(A, B);
    }

    public final c l(c cVar, Locale locale) {
        if (cVar == null) {
            return new c(locale);
        }
        c cVar2 = new c(locale);
        if (cVar.g) {
            cVar2.o(cVar);
        } else {
            cVar2.n(cVar.j());
        }
        return cVar2;
    }

    public final Calendar m(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeInMillis(timeInMillis);
        return calendar2;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setCurrentLocale(configuration.locale);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.w;
        if (i3 > 0 && size > i3) {
            size = i3;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, mode);
        this.f1844j.clearNumberPickerPadding();
        this.k.clearNumberPickerPadding();
        this.f1845l.clearNumberPickerPadding();
        q(this.f1844j, i, i2);
        q(this.k, i, i2);
        q(this.f1845l, i, i2);
        int measuredWidth = (((size - this.f1844j.getMeasuredWidth()) - this.k.getMeasuredWidth()) - this.f1845l.getMeasuredWidth()) / 2;
        int childCount = this.i.getChildCount() - 1;
        if (this.i.getChildAt(0) instanceof COUINumberPicker) {
            ((COUINumberPicker) this.i.getChildAt(0)).setNumberPickerPaddingLeft(measuredWidth);
        }
        if (this.i.getChildAt(childCount) instanceof COUINumberPicker) {
            ((COUINumberPicker) this.i.getChildAt(childCount)).setNumberPickerPaddingRight(measuredWidth);
        }
        super.onMeasure(iMakeMeasureSpec, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        s(savedState.mYear, savedState.mMonth, savedState.mDay);
        u();
        t();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), getYear(), getMonth(), getDayOfMonth(), null);
    }

    public void p(int i, int i2, int i3, d dVar) {
        s(i, i2, i3);
        u();
        t();
    }

    public final void q(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
    }

    public final void r() {
    }

    public final void s(int i, int i2, int i3) {
        this.q.l(i, i2, i3);
        k();
    }

    public void setCalendarViewShown(boolean z2) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        if (this.u == z2) {
            return;
        }
        super.setEnabled(z2);
        this.f1844j.setEnabled(z2);
        this.k.setEnabled(z2);
        this.f1845l.setEnabled(z2);
        this.u = z2;
    }

    public void setMaxDate(long j2) {
        this.p.n(j2);
        if (this.p.i(1) != B.get(1) || this.p.i(6) == B.get(6)) {
            B.setTimeInMillis(j2);
            if (this.q.b(B)) {
                this.q.n(B.getTimeInMillis());
                t();
            }
            u();
            return;
        }
        Log.w(x, "setMaxDate failed!:" + this.p.i(1) + "<->" + B.get(1) + ":" + this.p.i(6) + "<->" + B.get(6));
    }

    public void setMinDate(long j2) {
        this.p.n(j2);
        if (this.p.i(1) != A.get(1) || this.p.i(6) == A.get(6)) {
            A.setTimeInMillis(j2);
            if (this.q.d(A)) {
                this.q.n(A.getTimeInMillis());
                t();
            }
            u();
            return;
        }
        Log.w(x, "setMinDate failed!:" + this.p.i(1) + "<->" + A.get(1) + ":" + this.p.i(6) + "<->" + A.get(6));
    }

    public void setNormalTextColor(int i) {
        COUINumberPicker cOUINumberPicker = this.f1844j;
        if (cOUINumberPicker != null) {
            cOUINumberPicker.setNormalTextColor(i);
        }
        COUINumberPicker cOUINumberPicker2 = this.k;
        if (cOUINumberPicker2 != null) {
            cOUINumberPicker2.setNormalTextColor(i);
        }
        COUINumberPicker cOUINumberPicker3 = this.f1845l;
        if (cOUINumberPicker3 != null) {
            cOUINumberPicker3.setNormalTextColor(i);
        }
    }

    public void setOnDateChangedListener(d dVar) {
    }

    public void setSpinnersShown(boolean z2) {
        this.i.setVisibility(z2 ? 0 : 8);
    }

    public void setVibrateIntensity(float f) {
        this.f1844j.setVibrateIntensity(f);
        this.k.setVibrateIntensity(f);
        this.f1845l.setVibrateIntensity(f);
    }

    public void setVibrateLevel(int i) {
        this.f1844j.setVibrateLevel(i);
        this.k.setVibrateLevel(i);
        this.f1845l.setVibrateLevel(i);
    }

    public final void t() {
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:39:0x011a  */
    /* JADX WARN: Code duplicated, block: B:41:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x011f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0126  */
    /* JADX WARN: Code duplicated, block: B:45:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0144  */
    /* JADX WARN: Code duplicated, block: B:48:0x0147 A[LOOP:2: B:47:0x0145->B:48:0x0147, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x016e A[LOOP:3: B:50:0x016c->B:51:0x016e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x018e  */
    /* JADX WARN: Code duplicated, block: B:56:0x01bd A[LOOP:1: B:55:0x01bb->B:56:0x01bd, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x0126, please report this as an issue */
    public final void u() {
        boolean z2;
        int iF;
        String[] strArr;
        String[] strArr2;
        int i;
        int i2;
        int maxValue;
        int minValue;
        String[] strArr3;
        int i3;
        int i4;
        int i5 = this.q.i(1);
        int[] iArrA = cj2.a(i5, this.q.i(2) + 1, this.q.i(5));
        int iK = cj2.k(iArrA[0]);
        int i6 = iArrA[1];
        String strO = o(this.q);
        if (iK == 0 || ((i6 < iK && iK != 0) || (i6 == iK && !strO.contains(z)))) {
            i6--;
        }
        if (i5 == Integer.MIN_VALUE && iArrA[3] == 0) {
            i6 += 12;
        }
        if (i5 != Integer.MIN_VALUE) {
            if (iK != 0) {
                this.o = 13;
                z2 = true;
            } else {
                this.o = 12;
            }
            iF = cj2.f(iArrA[0], iArrA[1]);
            if (iK != 0 && i6 == iK && strO.contains(z)) {
                iF = cj2.g(iArrA[0]);
            }
            if (this.q.e(A)) {
                this.f1844j.setDisplayedValues(null);
                this.f1844j.setMinValue(iArrA[2]);
                this.f1844j.setMaxValue(iF);
                this.f1844j.setWrapSelectorWheel(false);
                this.k.setDisplayedValues(null);
                this.k.setMinValue(i6);
                this.k.setMaxValue(this.o - 1);
                this.k.setWrapSelectorWheel(false);
            } else if (this.q.c(B)) {
                this.f1844j.setDisplayedValues(null);
                this.f1844j.setMinValue(1);
                this.f1844j.setMaxValue(iArrA[2]);
                this.f1844j.setWrapSelectorWheel(false);
                this.k.setDisplayedValues(null);
                this.k.setMinValue(0);
                this.k.setMaxValue(i6);
                this.k.setWrapSelectorWheel(false);
            } else {
                this.f1844j.setDisplayedValues(null);
                this.f1844j.setMinValue(1);
                this.f1844j.setMaxValue(iF);
                this.f1844j.setWrapSelectorWheel(true);
                this.k.setDisplayedValues(null);
                this.k.setMinValue(0);
                this.k.setMaxValue(this.o - 1);
                this.k.setWrapSelectorWheel(true);
            }
            int i7 = this.o;
            strArr = new String[i7];
            strArr2 = new String[i7];
            if (i5 == Integer.MIN_VALUE) {
                for (i4 = 0; i4 < 24; i4++) {
                    if (i4 < 12) {
                        strArr[i4] = this.f1846n[i4];
                    } else {
                        strArr[i4] = z + this.f1846n[i4 - 12];
                    }
                }
            } else if (z2) {
                i = 0;
                while (i < iK) {
                    strArr2[i] = this.f1846n[i];
                    i++;
                }
                strArr2[iK] = z + this.f1846n[iK - 1];
                for (i2 = i + 1; i2 < 13; i2++) {
                    strArr2[i2] = this.f1846n[i2 - 1];
                }
                strArr = (String[]) Arrays.copyOfRange(strArr2, this.k.getMinValue(), this.k.getMaxValue() + 1);
            } else {
                strArr = (String[]) Arrays.copyOfRange(this.f1846n, this.k.getMinValue(), this.k.getMaxValue() + 1);
            }
            this.k.setDisplayedValues(strArr);
            maxValue = this.f1844j.getMaxValue();
            minValue = this.f1844j.getMinValue();
            strArr3 = new String[(maxValue - minValue) + 1];
            for (i3 = minValue; i3 <= maxValue; i3++) {
                strArr3[i3 - minValue] = cj2.c(i3);
            }
            this.f1844j.setDisplayedValues(strArr3);
            int[] iArrA2 = cj2.a(A.get(1), A.get(2) + 1, A.get(5));
            int i8 = B.get(1);
            int i9 = B.get(2) + 1;
            int[] iArrA3 = cj2.a(i8, i9, i9);
            this.f1845l.setMinValue(iArrA2[0]);
            this.f1845l.setMaxValue(iArrA3[0]);
            this.f1845l.setWrapSelectorWheel(true);
            this.f1845l.setValue(iArrA[0]);
            this.k.setValue(i6);
            this.f1844j.setValue(iArrA[2]);
        }
        this.o = 24;
        z2 = false;
        iF = cj2.f(iArrA[0], iArrA[1]);
        if (iK != 0) {
            iF = cj2.g(iArrA[0]);
        }
        if (this.q.e(A)) {
            this.f1844j.setDisplayedValues(null);
            this.f1844j.setMinValue(iArrA[2]);
            this.f1844j.setMaxValue(iF);
            this.f1844j.setWrapSelectorWheel(false);
            this.k.setDisplayedValues(null);
            this.k.setMinValue(i6);
            this.k.setMaxValue(this.o - 1);
            this.k.setWrapSelectorWheel(false);
        } else if (this.q.c(B)) {
            this.f1844j.setDisplayedValues(null);
            this.f1844j.setMinValue(1);
            this.f1844j.setMaxValue(iArrA[2]);
            this.f1844j.setWrapSelectorWheel(false);
            this.k.setDisplayedValues(null);
            this.k.setMinValue(0);
            this.k.setMaxValue(i6);
            this.k.setWrapSelectorWheel(false);
        } else {
            this.f1844j.setDisplayedValues(null);
            this.f1844j.setMinValue(1);
            this.f1844j.setMaxValue(iF);
            this.f1844j.setWrapSelectorWheel(true);
            this.k.setDisplayedValues(null);
            this.k.setMinValue(0);
            this.k.setMaxValue(this.o - 1);
            this.k.setWrapSelectorWheel(true);
        }
        int i10 = this.o;
        strArr = new String[i10];
        strArr2 = new String[i10];
        if (i5 == Integer.MIN_VALUE) {
            while (i4 < 24) {
                if (i4 < 12) {
                    strArr[i4] = this.f1846n[i4];
                } else {
                    strArr[i4] = z + this.f1846n[i4 - 12];
                }
            }
        } else if (z2) {
            i = 0;
            while (i < iK) {
                strArr2[i] = this.f1846n[i];
                i++;
            }
            strArr2[iK] = z + this.f1846n[iK - 1];
            while (i2 < 13) {
                strArr2[i2] = this.f1846n[i2 - 1];
            }
            strArr = (String[]) Arrays.copyOfRange(strArr2, this.k.getMinValue(), this.k.getMaxValue() + 1);
        } else {
            strArr = (String[]) Arrays.copyOfRange(this.f1846n, this.k.getMinValue(), this.k.getMaxValue() + 1);
        }
        this.k.setDisplayedValues(strArr);
        maxValue = this.f1844j.getMaxValue();
        minValue = this.f1844j.getMinValue();
        strArr3 = new String[(maxValue - minValue) + 1];
        while (i3 <= maxValue) {
            strArr3[i3 - minValue] = cj2.c(i3);
        }
        this.f1844j.setDisplayedValues(strArr3);
        int[] iArrA4 = cj2.a(A.get(1), A.get(2) + 1, A.get(5));
        int i11 = B.get(1);
        int i12 = B.get(2) + 1;
        int[] iArrA5 = cj2.a(i11, i12, i12);
        this.f1845l.setMinValue(iArrA4[0]);
        this.f1845l.setMaxValue(iArrA5[0]);
        this.f1845l.setWrapSelectorWheel(true);
        this.f1845l.setValue(iArrA[0]);
        this.k.setValue(i6);
        this.f1844j.setValue(iArrA[2]);
    }

    public static class c {
        public static final int LEAP_MONTH_ADDED_VALUE = 12;
        public Calendar a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1847c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1848e;
        public int f;
        public boolean g;

        public c() {
            k(Calendar.getInstance());
        }

        public boolean b(Calendar calendar) {
            if (this.g) {
                return false;
            }
            return this.a.after(calendar);
        }

        public boolean c(Calendar calendar) {
            if (this.g) {
                return false;
            }
            return this.a.after(calendar) || this.a.equals(calendar);
        }

        public boolean d(Calendar calendar) {
            if (this.g) {
                return false;
            }
            return this.a.before(calendar);
        }

        public boolean e(Calendar calendar) {
            if (this.g) {
                return false;
            }
            return this.a.before(calendar) || this.a.equals(calendar);
        }

        public void f(int i, int i2, int i3) {
            boolean z = true;
            int[] iArrA = cj2.a(i(1), i(2) + 1, i(5));
            if (i == 5) {
                if (this.g) {
                    this.d = i3;
                    return;
                }
                if (i2 > 27 && i3 == 1) {
                    this.a.add(5, 1 - i2);
                    return;
                } else if (i2 != 1 || i3 <= 27) {
                    this.a.add(5, i3 - i2);
                    return;
                } else {
                    this.a.add(5, i3 - 1);
                    return;
                }
            }
            if (i == 2) {
                if (this.g) {
                    this.f1847c = i3;
                    return;
                }
                int i4 = i3 + 1;
                int iK = cj2.k(iArrA[0]);
                if (iK == 0 || i4 <= iK) {
                    z = false;
                } else if (i4 == iK + 1) {
                    i4 = iK;
                } else {
                    i4--;
                    z = false;
                }
                Date dateL = cj2.l(iArrA[0], i4, cj2.d(iArrA[0], i4, iArrA[2], z), z);
                if (dateL != null) {
                    n(dateL.getTime());
                    return;
                }
                return;
            }
            if (i == 1) {
                boolean z2 = this.g;
                if (!z2 && i3 != Integer.MIN_VALUE) {
                    o(cj2.b(i3, iArrA[1], iArrA[2], iArrA[3]));
                    return;
                }
                if (!z2 && i3 == Integer.MIN_VALUE) {
                    this.g = true;
                    this.b = i3;
                    this.f1847c = (iArrA[1] - 1) + (iArrA[3] != 1 ? 12 : 0);
                    this.d = iArrA[2];
                    this.f1848e = this.a.get(11);
                    this.f = this.a.get(12);
                    return;
                }
                if (!z2 || i3 == Integer.MIN_VALUE) {
                    this.b = i3;
                    return;
                }
                this.g = false;
                this.b = i3;
                int i5 = this.f1847c;
                int i6 = (i5 % 12) + 1;
                z = i5 / 12 > 0 && cj2.k(i3) == i6;
                int iD = cj2.d(this.b, i6, this.d, z);
                this.d = iD;
                Date dateL2 = cj2.l(this.b, i6, iD, z);
                if (dateL2 != null) {
                    n(dateL2.getTime());
                }
            }
        }

        public void g(Calendar calendar, Calendar calendar2) {
            if (this.g) {
                return;
            }
            if (this.a.before(calendar)) {
                n(calendar.getTimeInMillis());
            } else if (this.a.after(calendar2)) {
                n(calendar2.getTimeInMillis());
            }
        }

        public void h() {
            this.a.clear();
            this.b = 0;
            this.f1847c = 0;
            this.d = 0;
            this.f1848e = 0;
            this.f = 0;
            this.g = false;
        }

        public int i(int i) {
            if (!this.g) {
                return this.a.get(i);
            }
            if (i == 5) {
                return this.d;
            }
            if (i == 2) {
                return this.f1847c;
            }
            return i == 1 ? this.b : this.a.get(i);
        }

        public long j() {
            return this.a.getTimeInMillis();
        }

        public void k(Calendar calendar) {
            this.a = calendar;
            this.g = false;
        }

        public void l(int i, int i2, int i3) {
            if (i != Integer.MIN_VALUE) {
                this.a.set(1, i);
                this.a.set(2, i2);
                this.a.set(5, i3);
                this.g = false;
                return;
            }
            this.b = Integer.MIN_VALUE;
            this.f1847c = i2;
            this.d = i3;
            this.g = true;
        }

        public void m(int i, int i2, int i3, int i4, int i5) {
            if (i != Integer.MIN_VALUE) {
                this.a.set(1, i);
                this.a.set(2, i2);
                this.a.set(5, i3);
                this.a.set(11, i4);
                this.a.set(12, i5);
                this.g = false;
                return;
            }
            this.b = Integer.MIN_VALUE;
            this.f1847c = i2;
            this.d = i3;
            this.f1848e = i4;
            this.f = i5;
            this.g = true;
        }

        public void n(long j2) {
            this.a.setTimeInMillis(j2);
            this.g = false;
        }

        public void o(c cVar) {
            this.a.setTimeInMillis(cVar.a.getTimeInMillis());
            this.b = cVar.b;
            this.f1847c = cVar.f1847c;
            this.d = cVar.d;
            this.f1848e = cVar.f1848e;
            this.f = cVar.f;
            this.g = cVar.g;
        }

        public c(Locale locale) {
            k(Calendar.getInstance(locale));
        }
    }

    public COUILunarDatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiDatePickerStyle);
    }

    public COUILunarDatePicker(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.DatePickerStyle);
    }

    public COUILunarDatePicker(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.o = 12;
        this.u = true;
        ph2.c(this, false);
        setCurrentLocale(Locale.getDefault());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUILunarDatePicker, i, i2);
        this.v = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUILunarDatePicker_couiYearIgnorable, false);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.COUIPickersCommonAttrs, i, i2);
        this.w = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.COUIPickersCommonAttrs_couiPickersMaxWidth, 0);
        typedArrayObtainStyledAttributes2.recycle();
        this.t = Math.max(getResources().getDimensionPixelOffset(R$dimen.coui_number_picker_background_divider_height), 1);
        int i3 = R$layout.coui_lunar_date_picker;
        this.f1846n = getResources().getStringArray(R$array.coui_lunar_month);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(i3, (ViewGroup) this, true);
        z = getResources().getString(R$string.coui_lunar_leap_string);
        a aVar = new a();
        b bVar = new b();
        this.i = (LinearLayout) findViewById(R$id.pickers);
        COUINumberPicker cOUINumberPicker = (COUINumberPicker) findViewById(R$id.day);
        this.f1844j = cOUINumberPicker;
        cOUINumberPicker.setOnLongPressUpdateInterval(100L);
        cOUINumberPicker.setOnValueChangedListener(aVar);
        cOUINumberPicker.setOnScrollingStopListener(bVar);
        COUINumberPicker cOUINumberPicker2 = (COUINumberPicker) findViewById(R$id.month);
        this.k = cOUINumberPicker2;
        cOUINumberPicker2.setMinValue(0);
        cOUINumberPicker2.setMaxValue(this.o - 1);
        cOUINumberPicker2.setDisplayedValues(this.f1846n);
        cOUINumberPicker2.setOnLongPressUpdateInterval(200L);
        cOUINumberPicker2.setOnValueChangedListener(aVar);
        cOUINumberPicker2.setOnScrollingStopListener(bVar);
        COUINumberPicker cOUINumberPicker3 = (COUINumberPicker) findViewById(R$id.year);
        this.f1845l = cOUINumberPicker3;
        cOUINumberPicker3.setOnLongPressUpdateInterval(100L);
        cOUINumberPicker3.setOnValueChangedListener(aVar);
        cOUINumberPicker3.setOnScrollingStopListener(bVar);
        cOUINumberPicker3.setIgnorable(this.v);
        setSpinnersShown(true);
        setCalendarViewShown(true);
        this.p.h();
        this.p.l(1910, 0, 1);
        setMinDate(this.p.j());
        this.p.h();
        this.p.m(2099, 11, 31, 23, 59);
        setMaxDate(this.p.j());
        this.q.n(System.currentTimeMillis());
        p(this.q.i(1), this.q.i(2), this.q.i(5), null);
        if (cOUINumberPicker3.isAccessibilityEnable()) {
            cOUINumberPicker3.addTalkbackSuffix("年");
        }
        this.r = context.getResources().getDimensionPixelOffset(R$dimen.coui_selected_background_radius);
        this.s = context.getResources().getDimensionPixelOffset(R$dimen.coui_selected_background_horizontal_padding);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
