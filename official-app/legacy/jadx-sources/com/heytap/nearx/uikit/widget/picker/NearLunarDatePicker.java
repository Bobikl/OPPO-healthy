package com.heytap.nearx.uikit.widget.picker;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.CalendarView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.appcompat.content.res.AppCompatResources;
import com.heytap.nearx.uikit.R$array;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$string;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.aiunit.vision.fjc;
import com.oplus.aiunit.vision.gjc;
import com.oplus.aiunit.vision.tbb;
import com.oplus.aiunit.vision.vhc;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class NearLunarDatePicker extends FrameLayout {
    private static final int DAY_OF_REFRESH_SPINNER = 27;
    private static final boolean DEFAULT_CALENDAR_VIEW_SHOWN = true;
    private static final boolean DEFAULT_ENABLED_STATE = true;
    private static final int DEFAULT_END_DAY = 31;
    private static final int DEFAULT_END_HOUR = 23;
    private static final int DEFAULT_END_MINUTE = 59;
    private static final int DEFAULT_END_MONTH = 11;
    private static final int DEFAULT_END_YEAR = 2036;
    private static final boolean DEFAULT_SPINNERS_SHOWN = true;
    private static final int DEFAULT_START_YEAR = 1910;
    public static final int IGNORED_YEAR = Integer.MIN_VALUE;
    private static final int IGNORED_YEAR_MONTH_COUNT = 24;
    private static final int LEAPYEAR_MONTH_COUNT = 13;
    private static final int LONGPRESS_UPDATE_INTERVAL = 100;
    private static final int MONTH_LONGPRESS_UPDATE_INTERVAL = 200;
    private static final int NORMAL_MONTH_COUNT = 12;
    private static final int PICKER_CHILD_COUNT = 3;
    private static final String TAG = "NearLunarDatePicker";
    private static String sLeapString;
    private int mBackgroundLeft;
    private int mBackgroundRadius;
    private RectF mBackgroundRect;
    private IncompleteDate mCurrentDate;
    private Locale mCurrentLocale;
    private final NearNumberPicker mDaySpinner;
    private boolean mIsEnabled;
    private int mMaxWidth;
    private final NearNumberPicker mMonthSpinner;
    private int mNumberOfMonths;
    private OnDateChangedListener mOnDateChangedListener;
    private String[] mShortMonths;
    private final LinearLayout mSpinners;
    private IncompleteDate mTempDate;
    private boolean mYearIgnorable;
    private final NearNumberPicker mYearSpinner;
    private static final String[] CHINESE_NUMBER = {"一", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "十二"};
    private static Calendar sMinDate = Calendar.getInstance();
    private static Calendar sMaxDate = Calendar.getInstance();

    public interface OnDateChangedListener {
        void onLunarDateChanged(NearLunarDatePicker nearLunarDatePicker, int i, int i2, int i3);
    }

    static {
        sMinDate.set(DEFAULT_START_YEAR, 2, 10, 0, 0);
        sMaxDate.set(2036, 11, 31, 23, 59);
    }

    public NearLunarDatePicker(Context context) {
        this(context, null);
    }

    private void clampDate() {
        this.mCurrentDate.clampDate(sMinDate, sMaxDate);
    }

    private IncompleteDate getCalendarForLocale(IncompleteDate incompleteDate, Locale locale) {
        if (incompleteDate == null) {
            return new IncompleteDate(locale);
        }
        IncompleteDate incompleteDate2 = new IncompleteDate(locale);
        if (incompleteDate.isIncomplete) {
            incompleteDate2.setWith(incompleteDate);
        } else {
            incompleteDate2.setTimeInMillis(incompleteDate.getTimeInMillis());
        }
        return incompleteDate2;
    }

    @Deprecated
    public static String getLunarDateString(Calendar calendar) {
        int[] iArrA = tbb.a(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        return getLunarDateString(iArrA[0], iArrA[1], iArrA[2], iArrA[3]);
    }

    private static String getLunarDateString2(IncompleteDate incompleteDate) {
        try {
            int[] iArrA = tbb.a(incompleteDate.get(1), incompleteDate.get(2) + 1, incompleteDate.get(5));
            return getLunarDateString(iArrA[0], iArrA[1], iArrA[2], iArrA[3]);
        } catch (Exception unused) {
            int[] iArr = {2000, 1, 1, 1};
            return getLunarDateString(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
    }

    private boolean isNewDate(int i, int i2, int i3) {
        return (this.mCurrentDate.get(1) == i && this.mCurrentDate.get(2) == i3 && this.mCurrentDate.get(5) == i2) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDateChanged() {
        OnDateChangedListener onDateChangedListener = this.mOnDateChangedListener;
        if (onDateChangedListener != null) {
            onDateChangedListener.onLunarDateChanged(this, getYear(), getMonth(), getDayOfMonth());
        }
    }

    private void reorderSpinners() {
        this.mSpinners.removeAllViews();
        char[] dateFormatOrder = DateFormat.getDateFormatOrder(getContext());
        int length = dateFormatOrder.length;
        for (int i = 0; i < length; i++) {
            char c2 = dateFormatOrder[i];
            if (c2 == 'M') {
                this.mSpinners.addView(this.mMonthSpinner);
                setImeOptions(this.mMonthSpinner, length, i);
            } else if (c2 == 'd') {
                this.mSpinners.addView(this.mDaySpinner);
                setImeOptions(this.mDaySpinner, length, i);
            } else {
                if (c2 != 'y') {
                    throw new IllegalArgumentException();
                }
                this.mSpinners.addView(this.mYearSpinner);
                setImeOptions(this.mYearSpinner, length, i);
            }
        }
    }

    private void setCurrentLocale(Locale locale) {
        if (locale.equals(this.mCurrentLocale)) {
            return;
        }
        this.mCurrentLocale = locale;
        this.mTempDate = getCalendarForLocale(this.mTempDate, locale);
        sMinDate = getCalendarForLocale(sMinDate, locale);
        sMaxDate = getCalendarForLocale(sMaxDate, locale);
        this.mCurrentDate = getCalendarForLocale(this.mCurrentDate, locale);
    }

    private void setDate(int i, int i2, int i3) {
        this.mCurrentDate.set(i, i2, i3);
        clampDate();
    }

    private void setImeOptions(NearNumberPicker nearNumberPicker, int i, int i2) {
        int i3 = i2 < i - 1 ? 5 : 6;
        if (nearNumberPicker.getChildCount() != 3) {
            fjc.b(TAG, "spinner.getChildCount() != 3,It isn't init ok.return");
        } else {
            ((TextView) nearNumberPicker.getChildAt(1)).setImeOptions(i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCalendarView() {
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public void updateSpinners() {
        boolean z;
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
        int i5 = this.mCurrentDate.get(1);
        int[] iArrA = tbb.a(i5, this.mCurrentDate.get(2) + 1, this.mCurrentDate.get(5));
        int iK = tbb.k(iArrA[0]);
        int i6 = iArrA[1];
        String lunarDateString2 = getLunarDateString2(this.mCurrentDate);
        if (iK == 0 || ((i6 < iK && iK != 0) || (i6 == iK && !lunarDateString2.contains(sLeapString)))) {
            i6--;
        }
        if (i5 == Integer.MIN_VALUE && iArrA[3] == 0) {
            i6 += 12;
        }
        if (i5 != Integer.MIN_VALUE) {
            if (iK != 0) {
                this.mNumberOfMonths = 13;
                z = true;
            } else {
                this.mNumberOfMonths = 12;
            }
            iF = tbb.f(iArrA[0], iArrA[1]);
            if (iK != 0 && i6 == iK && lunarDateString2.contains(sLeapString)) {
                iF = tbb.g(iArrA[0]);
            }
            if (this.mCurrentDate.beforeOrEqual(sMinDate)) {
                this.mDaySpinner.setDisplayedValues(null);
                this.mDaySpinner.setMinValue(iArrA[2]);
                this.mDaySpinner.setMaxValue(iF);
                this.mDaySpinner.setWrapSelectorWheel(false);
                this.mMonthSpinner.setDisplayedValues(null);
                this.mMonthSpinner.setMinValue(i6);
                this.mMonthSpinner.setMaxValue(this.mNumberOfMonths - 1);
                this.mMonthSpinner.setWrapSelectorWheel(false);
            } else if (this.mCurrentDate.afterOrEqual(sMaxDate)) {
                this.mDaySpinner.setDisplayedValues(null);
                this.mDaySpinner.setMinValue(1);
                this.mDaySpinner.setMaxValue(iArrA[2]);
                this.mDaySpinner.setWrapSelectorWheel(false);
                this.mMonthSpinner.setDisplayedValues(null);
                this.mMonthSpinner.setMinValue(0);
                this.mMonthSpinner.setMaxValue(i6);
                this.mMonthSpinner.setWrapSelectorWheel(false);
            } else {
                this.mDaySpinner.setDisplayedValues(null);
                this.mDaySpinner.setMinValue(1);
                this.mDaySpinner.setMaxValue(iF);
                this.mDaySpinner.setWrapSelectorWheel(true);
                this.mMonthSpinner.setDisplayedValues(null);
                this.mMonthSpinner.setMinValue(0);
                this.mMonthSpinner.setMaxValue(this.mNumberOfMonths - 1);
                this.mMonthSpinner.setWrapSelectorWheel(true);
            }
            int i7 = this.mNumberOfMonths;
            strArr = new String[i7];
            strArr2 = new String[i7];
            if (i5 == Integer.MIN_VALUE) {
                for (i4 = 0; i4 < 24; i4++) {
                    if (i4 < 12) {
                        strArr[i4] = this.mShortMonths[i4];
                    } else {
                        strArr[i4] = sLeapString + this.mShortMonths[i4 - 12];
                    }
                }
            } else if (z) {
                i = 0;
                while (i < iK) {
                    strArr2[i] = this.mShortMonths[i];
                    i++;
                }
                strArr2[iK] = sLeapString + this.mShortMonths[iK - 1];
                for (i2 = i + 1; i2 < 13; i2++) {
                    strArr2[i2] = this.mShortMonths[i2 - 1];
                }
                strArr = (String[]) Arrays.copyOfRange(strArr2, this.mMonthSpinner.getMinValue(), this.mMonthSpinner.getMaxValue() + 1);
            } else {
                strArr = (String[]) Arrays.copyOfRange(this.mShortMonths, this.mMonthSpinner.getMinValue(), this.mMonthSpinner.getMaxValue() + 1);
            }
            this.mMonthSpinner.setDisplayedValues(strArr);
            maxValue = this.mDaySpinner.getMaxValue();
            minValue = this.mDaySpinner.getMinValue();
            strArr3 = new String[(maxValue - minValue) + 1];
            for (i3 = minValue; i3 <= maxValue; i3++) {
                strArr3[i3 - minValue] = tbb.c(i3);
            }
            this.mDaySpinner.setDisplayedValues(strArr3);
            int[] iArrA2 = tbb.a(sMinDate.get(1), sMinDate.get(2) + 1, sMinDate.get(5));
            int i8 = sMaxDate.get(1);
            int i9 = sMaxDate.get(2) + 1;
            int[] iArrA3 = tbb.a(i8, i9, i9);
            this.mYearSpinner.setMinValue(iArrA2[0]);
            this.mYearSpinner.setMaxValue(iArrA3[0]);
            this.mYearSpinner.setWrapSelectorWheel(true);
            this.mYearSpinner.setValue(iArrA[0]);
            this.mMonthSpinner.setValue(i6);
            this.mDaySpinner.setValue(iArrA[2]);
        }
        this.mNumberOfMonths = 24;
        z = false;
        iF = tbb.f(iArrA[0], iArrA[1]);
        if (iK != 0) {
            iF = tbb.g(iArrA[0]);
        }
        if (this.mCurrentDate.beforeOrEqual(sMinDate)) {
            this.mDaySpinner.setDisplayedValues(null);
            this.mDaySpinner.setMinValue(iArrA[2]);
            this.mDaySpinner.setMaxValue(iF);
            this.mDaySpinner.setWrapSelectorWheel(false);
            this.mMonthSpinner.setDisplayedValues(null);
            this.mMonthSpinner.setMinValue(i6);
            this.mMonthSpinner.setMaxValue(this.mNumberOfMonths - 1);
            this.mMonthSpinner.setWrapSelectorWheel(false);
        } else if (this.mCurrentDate.afterOrEqual(sMaxDate)) {
            this.mDaySpinner.setDisplayedValues(null);
            this.mDaySpinner.setMinValue(1);
            this.mDaySpinner.setMaxValue(iArrA[2]);
            this.mDaySpinner.setWrapSelectorWheel(false);
            this.mMonthSpinner.setDisplayedValues(null);
            this.mMonthSpinner.setMinValue(0);
            this.mMonthSpinner.setMaxValue(i6);
            this.mMonthSpinner.setWrapSelectorWheel(false);
        } else {
            this.mDaySpinner.setDisplayedValues(null);
            this.mDaySpinner.setMinValue(1);
            this.mDaySpinner.setMaxValue(iF);
            this.mDaySpinner.setWrapSelectorWheel(true);
            this.mMonthSpinner.setDisplayedValues(null);
            this.mMonthSpinner.setMinValue(0);
            this.mMonthSpinner.setMaxValue(this.mNumberOfMonths - 1);
            this.mMonthSpinner.setWrapSelectorWheel(true);
        }
        int i10 = this.mNumberOfMonths;
        strArr = new String[i10];
        strArr2 = new String[i10];
        if (i5 == Integer.MIN_VALUE) {
            while (i4 < 24) {
                if (i4 < 12) {
                    strArr[i4] = this.mShortMonths[i4];
                } else {
                    strArr[i4] = sLeapString + this.mShortMonths[i4 - 12];
                }
            }
        } else if (z) {
            i = 0;
            while (i < iK) {
                strArr2[i] = this.mShortMonths[i];
                i++;
            }
            strArr2[iK] = sLeapString + this.mShortMonths[iK - 1];
            while (i2 < 13) {
                strArr2[i2] = this.mShortMonths[i2 - 1];
            }
            strArr = (String[]) Arrays.copyOfRange(strArr2, this.mMonthSpinner.getMinValue(), this.mMonthSpinner.getMaxValue() + 1);
        } else {
            strArr = (String[]) Arrays.copyOfRange(this.mShortMonths, this.mMonthSpinner.getMinValue(), this.mMonthSpinner.getMaxValue() + 1);
        }
        this.mMonthSpinner.setDisplayedValues(strArr);
        maxValue = this.mDaySpinner.getMaxValue();
        minValue = this.mDaySpinner.getMinValue();
        strArr3 = new String[(maxValue - minValue) + 1];
        while (i3 <= maxValue) {
            strArr3[i3 - minValue] = tbb.c(i3);
        }
        this.mDaySpinner.setDisplayedValues(strArr3);
        int[] iArrA4 = tbb.a(sMinDate.get(1), sMinDate.get(2) + 1, sMinDate.get(5));
        int i11 = sMaxDate.get(1);
        int i12 = sMaxDate.get(2) + 1;
        int[] iArrA5 = tbb.a(i11, i12, i12);
        this.mYearSpinner.setMinValue(iArrA4[0]);
        this.mYearSpinner.setMaxValue(iArrA5[0]);
        this.mYearSpinner.setWrapSelectorWheel(true);
        this.mYearSpinner.setValue(iArrA[0]);
        this.mMonthSpinner.setValue(i6);
        this.mDaySpinner.setValue(iArrA[2]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(this.mDaySpinner.getBackgroundColor());
        this.mBackgroundRect.set(this.mBackgroundLeft, (getHeight() / 2.0f) - this.mBackgroundRadius, getWidth() - this.mBackgroundLeft, (getHeight() / 2.0f) + this.mBackgroundRadius);
        RectF rectF = this.mBackgroundRect;
        int i = this.mBackgroundRadius;
        canvas.drawRoundRect(rectF, i, i, paint);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
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
        return this.mCurrentDate.get(5);
    }

    public int getLeapMonth() {
        return tbb.k(this.mCurrentDate.get(1));
    }

    public int[] getLunarDate() {
        return tbb.a(this.mCurrentDate.get(1), this.mCurrentDate.get(2) + 1, this.mCurrentDate.get(5));
    }

    public long getMaxDate() {
        return sMaxDate.getTimeInMillis();
    }

    public long getMinDate() {
        return sMinDate.getTimeInMillis();
    }

    public int getMonth() {
        return this.mCurrentDate.get(2);
    }

    public OnDateChangedListener getOnDateChangedListener() {
        return this.mOnDateChangedListener;
    }

    public boolean getSpinnersShown() {
        return this.mSpinners.isShown();
    }

    public int getYear() {
        return this.mCurrentDate.get(1);
    }

    public void init(int i, int i2, int i3, OnDateChangedListener onDateChangedListener) {
        setDate(i, i2, i3);
        updateSpinners();
        updateCalendarView();
        this.mOnDateChangedListener = onDateChangedListener;
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public boolean isLeapMonth(int i) {
        return i == tbb.k(this.mCurrentDate.get(1));
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
        int i3 = this.mMaxWidth;
        if (i3 > 0 && size > i3) {
            size = i3;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), i2);
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(getLunarDateString2(this.mCurrentDate));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setDate(savedState.mYear, savedState.mMonth, savedState.mDay);
        updateSpinners();
        updateCalendarView();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), getYear(), getMonth(), getDayOfMonth());
    }

    public void refresh() {
        NearNumberPicker nearNumberPicker = this.mDaySpinner;
        if (nearNumberPicker != null) {
            nearNumberPicker.refresh();
        }
        NearNumberPicker nearNumberPicker2 = this.mMonthSpinner;
        if (nearNumberPicker2 != null) {
            nearNumberPicker2.refresh();
        }
        NearNumberPicker nearNumberPicker3 = this.mYearSpinner;
        if (nearNumberPicker3 != null) {
            nearNumberPicker3.refresh();
        }
    }

    public void scrollForceFinished() {
        NearNumberPicker nearNumberPicker = this.mDaySpinner;
        if (nearNumberPicker != null) {
            nearNumberPicker.scrollForceFinished();
        }
        NearNumberPicker nearNumberPicker2 = this.mMonthSpinner;
        if (nearNumberPicker2 != null) {
            nearNumberPicker2.scrollForceFinished();
        }
        NearNumberPicker nearNumberPicker3 = this.mYearSpinner;
        if (nearNumberPicker3 != null) {
            nearNumberPicker3.scrollForceFinished();
        }
    }

    public void setCalendarViewShown(boolean z) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.mIsEnabled == z) {
            return;
        }
        super.setEnabled(z);
        this.mDaySpinner.setEnabled(z);
        this.mMonthSpinner.setEnabled(z);
        this.mYearSpinner.setEnabled(z);
        this.mIsEnabled = z;
    }

    public void setFocusColor(@ColorInt int i) {
        this.mDaySpinner.setPickerFocusColor(i);
        this.mMonthSpinner.setPickerFocusColor(i);
        this.mYearSpinner.setPickerFocusColor(i);
    }

    public void setMaxDate(long j2) {
        this.mTempDate.setTimeInMillis(j2);
        if (this.mTempDate.get(1) != sMaxDate.get(1) || this.mTempDate.get(6) == sMaxDate.get(6)) {
            sMaxDate.setTimeInMillis(j2);
            if (this.mCurrentDate.after(sMaxDate)) {
                this.mCurrentDate.setTimeInMillis(sMaxDate.getTimeInMillis());
                updateCalendarView();
            }
            updateSpinners();
            return;
        }
        fjc.g(TAG, "setMaxDate failed!:" + this.mTempDate.get(1) + "<->" + sMaxDate.get(1) + ":" + this.mTempDate.get(6) + "<->" + sMaxDate.get(6));
    }

    public void setMinDate(long j2) {
        this.mTempDate.setTimeInMillis(j2);
        if (this.mTempDate.get(1) != sMinDate.get(1) || this.mTempDate.get(6) == sMinDate.get(6)) {
            sMinDate.setTimeInMillis(j2);
            if (this.mCurrentDate.before(sMinDate)) {
                this.mCurrentDate.setTimeInMillis(sMinDate.getTimeInMillis());
                updateCalendarView();
            }
            updateSpinners();
            return;
        }
        fjc.g(TAG, "setMinDate failed!:" + this.mTempDate.get(1) + "<->" + sMinDate.get(1) + ":" + this.mTempDate.get(6) + "<->" + sMinDate.get(6));
    }

    public void setNormalColor(@ColorInt int i) {
        this.mDaySpinner.setPickerNormalColor(i);
        this.mMonthSpinner.setPickerNormalColor(i);
        this.mYearSpinner.setPickerNormalColor(i);
    }

    public void setNormalTextColor(int i) {
        NearNumberPicker nearNumberPicker = this.mDaySpinner;
        if (nearNumberPicker != null) {
            nearNumberPicker.setNormalTextColor(i);
        }
        NearNumberPicker nearNumberPicker2 = this.mMonthSpinner;
        if (nearNumberPicker2 != null) {
            nearNumberPicker2.setNormalTextColor(i);
        }
        NearNumberPicker nearNumberPicker3 = this.mYearSpinner;
        if (nearNumberPicker3 != null) {
            nearNumberPicker3.setNormalTextColor(i);
        }
    }

    public void setOnDateChangedListener(OnDateChangedListener onDateChangedListener) {
        this.mOnDateChangedListener = onDateChangedListener;
    }

    public void setSpinnersShown(boolean z) {
        this.mSpinners.setVisibility(z ? 0 : 8);
    }

    public void updateDate(int i, int i2, int i3) {
        if (isNewDate(i, i2, i3)) {
            setDate(i, i2, i3);
            updateSpinners();
            updateCalendarView();
            notifyDateChanged();
        }
    }

    public static class IncompleteDate {
        public static final int LEAP_MONTH_ADDED_VALUE = 12;
        private Calendar date;
        private int day;
        private int hour;
        private boolean isIncomplete;
        private int minute;
        private int month;
        private int year;

        public IncompleteDate() {
            init(Calendar.getInstance());
        }

        public void add(int i, int i2) {
            if (!this.isIncomplete) {
                this.date.add(i, i2);
            } else if (i == 5) {
                this.day += i2;
            } else if (i == 2) {
                this.month += i2;
            }
        }

        public boolean after(Calendar calendar) {
            if (this.isIncomplete) {
                return false;
            }
            return this.date.after(calendar);
        }

        public boolean afterOrEqual(Calendar calendar) {
            if (this.isIncomplete) {
                return false;
            }
            return this.date.after(calendar) || this.date.equals(calendar);
        }

        public boolean before(Calendar calendar) {
            if (this.isIncomplete) {
                return false;
            }
            return this.date.before(calendar);
        }

        public boolean beforeOrEqual(Calendar calendar) {
            if (this.isIncomplete) {
                return false;
            }
            return this.date.before(calendar) || this.date.equals(calendar);
        }

        public void change(int i, int i2, int i3) {
            boolean z = true;
            int[] iArrA = tbb.a(get(1), get(2) + 1, get(5));
            if (i == 5) {
                if (this.isIncomplete) {
                    this.day = i3;
                    return;
                }
                if (i2 > 27 && i3 == 1) {
                    this.date.add(5, 1 - i2);
                    return;
                } else if (i2 != 1 || i3 <= 27) {
                    this.date.add(5, i3 - i2);
                    return;
                } else {
                    this.date.add(5, i3 - 1);
                    return;
                }
            }
            if (i == 2) {
                if (this.isIncomplete) {
                    this.month = i3;
                    return;
                }
                int i4 = i3 + 1;
                int iK = tbb.k(iArrA[0]);
                if (iK == 0 || i4 <= iK) {
                    z = false;
                } else if (i4 == iK + 1) {
                    i4 = iK;
                } else {
                    i4--;
                    z = false;
                }
                Date dateL = tbb.l(iArrA[0], i4, tbb.d(iArrA[0], i4, iArrA[2], z), z);
                if (dateL != null) {
                    setTimeInMillis(dateL.getTime());
                    return;
                }
                return;
            }
            if (i == 1) {
                boolean z2 = this.isIncomplete;
                if (!z2 && i3 != Integer.MIN_VALUE) {
                    setWith(tbb.b(i3, iArrA[1], iArrA[2], iArrA[3]));
                    return;
                }
                if (!z2 && i3 == Integer.MIN_VALUE) {
                    this.isIncomplete = true;
                    this.year = i3;
                    this.month = (iArrA[1] - 1) + (iArrA[3] != 1 ? 12 : 0);
                    this.day = iArrA[2];
                    this.hour = this.date.get(11);
                    this.minute = this.date.get(12);
                    return;
                }
                if (!z2 || i3 == Integer.MIN_VALUE) {
                    this.year = i3;
                    return;
                }
                this.isIncomplete = false;
                this.year = i3;
                int i5 = this.month;
                int i6 = (i5 % 12) + 1;
                z = i5 / 12 > 0 && tbb.k(i3) == i6;
                int iD = tbb.d(this.year, i6, this.day, z);
                this.day = iD;
                Date dateL2 = tbb.l(this.year, i6, iD, z);
                if (dateL2 != null) {
                    setTimeInMillis(dateL2.getTime());
                }
            }
        }

        public void clampDate(Calendar calendar, Calendar calendar2) {
            if (this.isIncomplete) {
                return;
            }
            if (this.date.before(calendar)) {
                setTimeInMillis(calendar.getTimeInMillis());
            } else if (this.date.after(calendar2)) {
                setTimeInMillis(calendar2.getTimeInMillis());
            }
        }

        public void clear() {
            this.date.clear();
            this.year = 0;
            this.month = 0;
            this.day = 0;
            this.hour = 0;
            this.minute = 0;
            this.isIncomplete = false;
        }

        public int get(int i) {
            if (!this.isIncomplete) {
                return this.date.get(i);
            }
            if (i == 5) {
                return this.day;
            }
            if (i == 2) {
                return this.month;
            }
            return i == 1 ? this.year : this.date.get(i);
        }

        public int getActualMaximum(int i) {
            return this.date.getActualMaximum(i);
        }

        public int getActualMinimum(int i) {
            return this.date.getActualMinimum(i);
        }

        public Date getTime() {
            return this.date.getTime();
        }

        public long getTimeInMillis() {
            return this.date.getTimeInMillis();
        }

        public void init(Calendar calendar) {
            this.date = calendar;
            this.isIncomplete = false;
        }

        public void set(int i, int i2, int i3) {
            if (i != Integer.MIN_VALUE) {
                this.date.set(1, i);
                this.date.set(2, i2);
                this.date.set(5, i3);
                this.isIncomplete = false;
                return;
            }
            this.year = Integer.MIN_VALUE;
            this.month = i2;
            this.day = i3;
            this.isIncomplete = true;
        }

        public void setTimeInMillis(long j2) {
            this.date.setTimeInMillis(j2);
            this.isIncomplete = false;
        }

        public void setWith(IncompleteDate incompleteDate) {
            this.date.setTimeInMillis(incompleteDate.date.getTimeInMillis());
            this.year = incompleteDate.year;
            this.month = incompleteDate.month;
            this.day = incompleteDate.day;
            this.hour = incompleteDate.hour;
            this.minute = incompleteDate.minute;
            this.isIncomplete = incompleteDate.isIncomplete;
        }

        public IncompleteDate(Locale locale) {
            init(Calendar.getInstance(locale));
        }

        public void set(int i, int i2, int i3, int i4, int i5) {
            if (i != Integer.MIN_VALUE) {
                this.date.set(1, i);
                this.date.set(2, i2);
                this.date.set(5, i3);
                this.date.set(11, i4);
                this.date.set(12, i5);
                this.isIncomplete = false;
                return;
            }
            this.year = Integer.MIN_VALUE;
            this.month = i2;
            this.day = i3;
            this.hour = i4;
            this.minute = i5;
            this.isIncomplete = true;
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.heytap.nearx.uikit.widget.picker.NearLunarDatePicker.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        private final int mDay;
        private final int mMonth;
        private final int mYear;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mYear);
            parcel.writeInt(this.mMonth);
            parcel.writeInt(this.mDay);
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

    public NearLunarDatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nxDatePickerStyle);
    }

    public NearLunarDatePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mNumberOfMonths = 12;
        this.mIsEnabled = true;
        vhc.b(this, false);
        setCurrentLocale(Locale.getDefault());
        this.mBackgroundRect = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearLunarDatePicker, i, 0);
        this.mYearIgnorable = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearLunarDatePicker_nxYearIgnorable, false);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.NearPickersCommonAttrs, i, 0);
        this.mMaxWidth = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.NearPickersCommonAttrs_nxPickersMaxWidth, 0);
        typedArrayObtainStyledAttributes2.recycle();
        int i2 = R$layout.nx_lunar_date_picker;
        this.mShortMonths = getResources().getStringArray(R$array.NXcolor_lunar_mounth);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(i2, (ViewGroup) this, true);
        sLeapString = getResources().getString(R$string.NXtheme1_lunar_leap_string);
        NearNumberPicker.OnValueChangeListener onValueChangeListener = new NearNumberPicker.OnValueChangeListener() { // from class: com.heytap.nearx.uikit.widget.picker.NearLunarDatePicker.1
            @Override // com.heytap.nearx.uikit.widget.picker.NearNumberPicker.OnValueChangeListener
            public void onValueChange(NearNumberPicker nearNumberPicker, int i3, int i4) {
                NearLunarDatePicker.this.mTempDate.setWith(NearLunarDatePicker.this.mCurrentDate);
                tbb.a(NearLunarDatePicker.this.mTempDate.get(1), NearLunarDatePicker.this.mTempDate.get(2) + 1, NearLunarDatePicker.this.mTempDate.get(5));
                if (nearNumberPicker == NearLunarDatePicker.this.mDaySpinner) {
                    NearLunarDatePicker.this.mTempDate.change(5, i3, i4);
                } else if (nearNumberPicker == NearLunarDatePicker.this.mMonthSpinner) {
                    NearLunarDatePicker.this.mTempDate.change(2, i3, i4);
                } else {
                    if (nearNumberPicker != NearLunarDatePicker.this.mYearSpinner) {
                        throw new IllegalArgumentException();
                    }
                    NearLunarDatePicker.this.mTempDate.change(1, i3, i4);
                }
                NearLunarDatePicker nearLunarDatePicker = NearLunarDatePicker.this;
                nearLunarDatePicker.setDate(nearLunarDatePicker.mTempDate);
                NearLunarDatePicker.this.updateSpinners();
                NearLunarDatePicker.this.updateCalendarView();
                NearLunarDatePicker.this.notifyDateChanged();
            }
        };
        NearNumberPicker.OnScrollingStopListener onScrollingStopListener = new NearNumberPicker.OnScrollingStopListener() { // from class: com.heytap.nearx.uikit.widget.picker.NearLunarDatePicker.2
            @Override // com.heytap.nearx.uikit.widget.picker.NearNumberPicker.OnScrollingStopListener
            public void onScrollingStop() {
                NearLunarDatePicker.this.sendAccessibilityEvent(4);
            }
        };
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.pickers);
        this.mSpinners = linearLayout;
        if (gjc.c()) {
            linearLayout.setBackground(AppCompatResources.getDrawable(context, R$drawable.nx_picker_full_bg));
        }
        NearNumberPicker nearNumberPicker = (NearNumberPicker) findViewById(R$id.day);
        this.mDaySpinner = nearNumberPicker;
        nearNumberPicker.setOnLongPressUpdateInterval(100L);
        nearNumberPicker.setOnValueChangedListener(onValueChangeListener);
        nearNumberPicker.setOnScrollingStopListener(onScrollingStopListener);
        NearNumberPicker nearNumberPicker2 = (NearNumberPicker) findViewById(R$id.month);
        this.mMonthSpinner = nearNumberPicker2;
        nearNumberPicker2.setMinValue(0);
        nearNumberPicker2.setMaxValue(this.mNumberOfMonths - 1);
        nearNumberPicker2.setDisplayedValues(this.mShortMonths);
        nearNumberPicker2.setOnLongPressUpdateInterval(200L);
        nearNumberPicker2.setOnValueChangedListener(onValueChangeListener);
        nearNumberPicker2.setOnScrollingStopListener(onScrollingStopListener);
        NearNumberPicker nearNumberPicker3 = (NearNumberPicker) findViewById(R$id.year);
        this.mYearSpinner = nearNumberPicker3;
        nearNumberPicker3.setOnLongPressUpdateInterval(100L);
        nearNumberPicker3.setOnValueChangedListener(onValueChangeListener);
        nearNumberPicker3.setOnScrollingStopListener(onScrollingStopListener);
        nearNumberPicker3.setIgnorable(this.mYearIgnorable);
        setSpinnersShown(true);
        setCalendarViewShown(true);
        this.mTempDate.clear();
        this.mTempDate.set(DEFAULT_START_YEAR, 2, 10, 0, 0);
        setMinDate(this.mTempDate.getTimeInMillis());
        this.mTempDate.clear();
        this.mTempDate.set(2036, 11, 31, 23, 59);
        setMaxDate(this.mTempDate.getTimeInMillis());
        this.mCurrentDate.setTimeInMillis(System.currentTimeMillis());
        init(this.mCurrentDate.get(1), this.mCurrentDate.get(2), this.mCurrentDate.get(5), null);
        if (nearNumberPicker3.isAccessibilityEnable()) {
            String string = context.getResources().getString(R$string.nx_picker_talkback_tip);
            nearNumberPicker3.addTalkbackSuffix(string);
            nearNumberPicker2.addTalkbackSuffix(string);
            nearNumberPicker.addTalkbackSuffix(string);
        }
        this.mBackgroundRadius = context.getResources().getDimensionPixelOffset(R$dimen.nx_selected_background_radius);
        this.mBackgroundLeft = context.getResources().getDimensionPixelOffset(R$dimen.nx_selected_background_horizontal_padding);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDate(IncompleteDate incompleteDate) {
        this.mCurrentDate.setWith(incompleteDate);
        clampDate();
    }

    private static String getLunarDateString(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        if (i5 < 0) {
            return "";
        }
        if (i != Integer.MIN_VALUE) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("年");
            sb.append(i4 == 0 ? sLeapString : "");
            sb.append(CHINESE_NUMBER[i5]);
            sb.append("月");
            sb.append(tbb.c(i3));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i4 == 0 ? sLeapString : "");
        sb2.append(CHINESE_NUMBER[i5]);
        sb2.append("月");
        sb2.append(tbb.c(i3));
        return sb2.toString();
    }

    private Calendar getCalendarForLocale(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeInMillis(timeInMillis);
        return calendar2;
    }
}
