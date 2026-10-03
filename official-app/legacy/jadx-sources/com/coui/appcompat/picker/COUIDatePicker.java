package com.coui.appcompat.picker;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import com.google.android.material.timepicker.TimeModel;
import com.oplus.aiunit.vision.ph2;
import com.oplus.aiunit.vision.t13;
import com.support.picker.R$array;
import com.support.picker.R$attr;
import com.support.picker.R$dimen;
import com.support.picker.R$id;
import com.support.picker.R$layout;
import com.support.picker.R$string;
import com.support.picker.R$style;
import com.support.picker.R$styleable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class COUIDatePicker extends FrameLayout {
    private static final int A_LEAP_YEAR = 2020;
    private static final String DATE_FORMAT = "MM/dd/yyyy";
    private static final boolean DEFAULT_CALENDAR_VIEW_SHOWN = true;
    private static final boolean DEFAULT_ENABLED_STATE = true;
    private static final int DEFAULT_END_YEAR = 2100;
    private static final boolean DEFAULT_SPINNERS_SHOWN = true;
    private static final int DEFAULT_START_YEAR = 1900;
    private static final int HOURS_OF_HALF_DAY = 12;
    public static final int IGNORED_YEAR = Integer.MIN_VALUE;
    private static final String LOG_TAG = "COUIDatePicker";
    private static final int LONGPRESS_UPDATE_INTERVAL = 100;
    private static final String MD_FORMAT = "MM/dd";
    private static final int MIN_BACKGROUND_DIVIDER_HEIGHT = 1;
    private static final int MONTH_LONGPRESS_UPDATE_INTERVAL = 200;
    private static final String TAG = "COUIDatePicker";
    private static char[] sOrderEn = {'d', 'M', 'y'};
    private int mBackgroundDividerHeight;
    private int mBackgroundLeft;
    private int mBackgroundRadius;
    private Context mContext;
    private d mCurrentDate;
    private Locale mCurrentLocale;
    private final DateFormat mDateFormat;
    private c mDayFormat;
    private final COUINumberPicker mDaySpinner;
    private Date mEndDate;
    private int mFocusColor;
    private boolean mIsEnabled;
    int mLeftPickerPosition;
    private Calendar mMaxDate;
    private int mMaxWidth;
    private Calendar mMinDate;
    private c mMonthFormat;
    private final COUINumberPicker mMonthSpinner;
    private int mNormalColor;
    private int mNumberOfMonths;
    private e mOnDateChangedListener;
    int mRightPickerPosition;
    private String[] mShortMonths;
    private final LinearLayout mSpinners;
    private d mTempDate;
    private c mYearFormat;
    private boolean mYearIgnorable;
    private final COUINumberPicker mYearSpinner;

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
            COUIDatePicker.this.mTempDate.o(COUIDatePicker.this.mCurrentDate);
            if (cOUINumberPicker == COUIDatePicker.this.mDaySpinner) {
                COUIDatePicker.this.mTempDate.l(5, i2);
            } else if (cOUINumberPicker == COUIDatePicker.this.mMonthSpinner) {
                COUIDatePicker.this.mTempDate.l(2, i2);
            } else {
                if (cOUINumberPicker != COUIDatePicker.this.mYearSpinner) {
                    throw new IllegalArgumentException();
                }
                COUIDatePicker.this.mTempDate.l(1, i2);
            }
            COUIDatePicker cOUIDatePicker = COUIDatePicker.this;
            cOUIDatePicker.setDate(cOUIDatePicker.mTempDate);
            COUIDatePicker.this.updateSpinners();
            COUIDatePicker.this.updateCalendarView();
            COUIDatePicker.this.notifyDateChanged();
        }
    }

    public class b implements COUINumberPicker.e {
        public b() {
        }

        @Override // com.coui.appcompat.picker.COUINumberPicker.e
        public void onScrollingStop() {
            COUIDatePicker cOUIDatePicker = COUIDatePicker.this;
            cOUIDatePicker.announceForAccessibility(cOUIDatePicker.formatDate());
        }
    }

    public class c implements COUINumberPicker.c {
        public int a;
        public String b;

        public c(int i, String str) {
            this.a = i;
            this.b = str;
        }

        @Override // com.coui.appcompat.picker.COUINumberPicker.c
        public String format(int i) {
            if (this.b.equals(t13.MONTH)) {
                COUIDatePicker.this.mEndDate.setMonth(i);
                return DateUtils.formatDateTime(COUIDatePicker.this.getContext(), COUIDatePicker.this.mEndDate.getTime(), 65576);
            }
            if (!Locale.getDefault().getLanguage().equals("zh")) {
                Formatter formatter = new Formatter(new StringBuilder(), COUIDatePicker.this.mCurrentLocale);
                if (this.b.equals(t13.YEAR)) {
                    formatter.format(TimeModel.NUMBER_FORMAT, Integer.valueOf(i));
                    return formatter.toString();
                }
                if (this.b.equals(t13.DAY)) {
                    formatter.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i));
                    return formatter.toString();
                }
            }
            return i + COUIDatePicker.this.getResources().getString(this.a);
        }
    }

    public static class d {
        public Calendar a;
        public boolean b;

        public d(Locale locale) {
            this.a = Calendar.getInstance(locale);
        }

        public boolean c(Calendar calendar) {
            if (this.b) {
                return false;
            }
            return this.a.after(calendar);
        }

        public boolean d(Calendar calendar) {
            if (this.b) {
                return false;
            }
            return this.a.before(calendar);
        }

        public void e(Calendar calendar, Calendar calendar2) {
            if (this.b) {
                return;
            }
            if (this.a.before(calendar)) {
                l(1, calendar.get(1));
                l(2, calendar.get(2));
                l(5, calendar.get(5));
            } else if (this.a.after(calendar2)) {
                l(1, calendar2.get(1));
                l(2, calendar2.get(2));
                l(5, calendar2.get(5));
            }
        }

        public int f(int i) {
            int actualMaximum = this.a.getActualMaximum(5);
            return i > actualMaximum ? actualMaximum : i;
        }

        public void g() {
            this.a.clear();
            this.b = false;
        }

        public int h(int i) {
            if (this.b && i != 5 && i != 2 && i == 1) {
                return Integer.MIN_VALUE;
            }
            return this.a.get(i);
        }

        public int i(int i) {
            return this.a.getActualMaximum(i);
        }

        public int j(int i) {
            return this.a.getActualMinimum(i);
        }

        public long k() {
            return this.a.getTimeInMillis();
        }

        public void l(int i, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 5) {
                        this.a.set(5, f(i2));
                        return;
                    }
                    return;
                } else {
                    int i3 = this.a.get(1);
                    int i4 = this.a.get(5);
                    this.a.clear();
                    this.a.set(1, i3);
                    this.a.set(2, i2);
                    this.a.set(5, f(i4));
                    return;
                }
            }
            if (i2 != Integer.MIN_VALUE) {
                this.b = false;
                int i5 = this.a.get(2);
                int i6 = this.a.get(5);
                this.a.clear();
                this.a.set(1, i2);
                this.a.set(2, i5);
                this.a.set(5, f(i6));
                return;
            }
            this.b = true;
            int i7 = this.a.get(2);
            int i8 = this.a.get(5);
            this.a.clear();
            this.a.set(i, 2020);
            this.a.set(2, i7);
            this.a.set(5, f(i8));
        }

        public void m(int i, int i2, int i3) {
            l(1, i);
            l(2, i2);
            l(5, i3);
        }

        public void n(long j2) {
            this.a.setTimeInMillis(j2);
            this.b = false;
        }

        public void o(d dVar) {
            this.a.setTimeInMillis(dVar.a.getTimeInMillis());
            this.b = dVar.b;
        }
    }

    public interface e {
        void a(COUIDatePicker cOUIDatePicker, int i, int i2, int i3);
    }

    public COUIDatePicker(Context context) {
        this(context, null);
    }

    private void clampDate() {
        this.mCurrentDate.e(this.mMinDate, this.mMaxDate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String formatDate() {
        return !this.mCurrentDate.b ? DateUtils.formatDateTime(this.mContext, this.mCurrentDate.a.getTimeInMillis(), 20) : DateUtils.formatDateTime(this.mContext, this.mCurrentDate.a.getTimeInMillis(), 24);
    }

    private d getCalendarForLocale(d dVar, Locale locale) {
        if (dVar == null) {
            return new d(locale);
        }
        d dVar2 = new d(locale);
        if (dVar.b) {
            dVar2.o(dVar);
        } else {
            dVar2.n(dVar.k());
        }
        return dVar2;
    }

    private boolean isNewDate(int i, int i2, int i3) {
        return (this.mCurrentDate.h(1) == i && this.mCurrentDate.h(2) == i2 && this.mCurrentDate.h(5) == i3) ? false : true;
    }

    private void measureChildConstrained(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDateChanged() {
        e eVar = this.mOnDateChangedListener;
        if (eVar != null) {
            eVar.a(this, getYear(), getMonth(), getDayOfMonth());
        }
    }

    private boolean parseDate(String str, Calendar calendar) {
        try {
            calendar.setTime(this.mDateFormat.parse(str));
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    private void reorderSpinners() {
        String bestDateTimePattern = android.text.format.DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMMMMdd");
        if (isLayoutRtl()) {
            bestDateTimePattern = TextUtils.getReverse(bestDateTimePattern, 0, bestDateTimePattern.length()).toString();
        }
        this.mSpinners.removeAllViews();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < bestDateTimePattern.length(); i++) {
            char cCharAt = bestDateTimePattern.charAt(i);
            if (cCharAt != 'M') {
                if (cCharAt != 'd') {
                    if (cCharAt == 'y' && this.mYearSpinner.getParent() == null) {
                        this.mSpinners.addView(this.mYearSpinner);
                        arrayList.add("y");
                    }
                } else if (this.mDaySpinner.getParent() == null) {
                    this.mSpinners.addView(this.mDaySpinner);
                    arrayList.add("d");
                }
            } else if (this.mMonthSpinner.getParent() == null) {
                this.mSpinners.addView(this.mMonthSpinner);
                arrayList.add("M");
            }
            if (this.mLeftPickerPosition == -1) {
                this.mLeftPickerPosition = this.mSpinners.getChildCount() - 1;
            }
            this.mRightPickerPosition = this.mSpinners.getChildCount() - 1;
        }
    }

    private void setCurrentLocale(Locale locale) {
        if (locale.equals(this.mCurrentLocale)) {
            return;
        }
        this.mCurrentLocale = locale;
        this.mTempDate = getCalendarForLocale(this.mTempDate, locale);
        this.mMinDate = getCalendarForLocale(this.mMinDate, locale);
        this.mMaxDate = getCalendarForLocale(this.mMaxDate, locale);
        this.mCurrentDate = getCalendarForLocale(this.mCurrentDate, locale);
        int i = this.mTempDate.i(2) + 1;
        this.mNumberOfMonths = i;
        this.mShortMonths = new String[i];
    }

    private void setDate(int i, int i2, int i3) {
        this.mCurrentDate.m(i, i2, i3);
        clampDate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCalendarView() {
    }

    private void updateSpinnerColor() {
        int i = this.mNormalColor;
        if (i != -1) {
            this.mDaySpinner.setPickerNormalColor(i);
            this.mMonthSpinner.setPickerNormalColor(this.mNormalColor);
            this.mYearSpinner.setPickerNormalColor(this.mNormalColor);
        }
        int i2 = this.mFocusColor;
        if (i2 != -1) {
            this.mDaySpinner.setPickerFocusColor(i2);
            this.mMonthSpinner.setPickerFocusColor(this.mFocusColor);
            this.mYearSpinner.setPickerFocusColor(this.mFocusColor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSpinners() {
        this.mMonthSpinner.setFormatter(this.mMonthFormat);
        boolean z = false;
        if (this.mCurrentDate.h(1) == this.mMinDate.get(1) && this.mCurrentDate.h(1) != this.mMaxDate.get(1)) {
            this.mMonthSpinner.setMinValue(this.mMinDate.get(2));
            this.mMonthSpinner.setMaxValue(this.mMinDate.getActualMaximum(2));
            this.mMonthSpinner.setWrapSelectorWheel(this.mMinDate.get(2) == 0);
        } else if (this.mCurrentDate.h(1) != this.mMinDate.get(1) && this.mCurrentDate.h(1) == this.mMaxDate.get(1)) {
            this.mMonthSpinner.setMinValue(0);
            this.mMonthSpinner.setMaxValue(this.mMaxDate.get(2));
            this.mMonthSpinner.setWrapSelectorWheel(this.mMaxDate.get(2) == this.mMaxDate.getActualMaximum(2));
        } else if (this.mCurrentDate.h(1) == this.mMinDate.get(1) && this.mCurrentDate.h(1) == this.mMaxDate.get(1)) {
            this.mMonthSpinner.setMinValue(this.mMinDate.get(2));
            this.mMonthSpinner.setMaxValue(this.mMaxDate.get(2));
            this.mMonthSpinner.setWrapSelectorWheel(this.mMaxDate.get(2) == this.mMaxDate.getActualMaximum(2) && this.mMinDate.get(2) == 0);
        } else {
            this.mMonthSpinner.setMinValue(this.mCurrentDate.j(2));
            this.mMonthSpinner.setMaxValue(this.mCurrentDate.i(2));
            this.mMonthSpinner.setWrapSelectorWheel(true);
        }
        if (this.mCurrentDate.h(1) == this.mMinDate.get(1) && this.mCurrentDate.h(2) == this.mMinDate.get(2) && (this.mCurrentDate.h(1) != this.mMaxDate.get(1) || this.mCurrentDate.h(2) != this.mMaxDate.get(2))) {
            this.mDaySpinner.setMinValue(this.mMinDate.get(5));
            this.mDaySpinner.setMaxValue(this.mMinDate.getActualMaximum(5));
            this.mDaySpinner.setWrapSelectorWheel(this.mMinDate.get(5) == 1);
        } else if (!(this.mCurrentDate.h(1) == this.mMinDate.get(1) && this.mCurrentDate.h(2) == this.mMinDate.get(2)) && this.mCurrentDate.h(1) == this.mMaxDate.get(1) && this.mCurrentDate.h(2) == this.mMaxDate.get(2)) {
            this.mDaySpinner.setMinValue(1);
            this.mDaySpinner.setMaxValue(this.mMaxDate.get(5));
            this.mDaySpinner.setWrapSelectorWheel(this.mMaxDate.get(5) == this.mMaxDate.getActualMaximum(5));
        } else if (this.mCurrentDate.h(1) == this.mMinDate.get(1) && this.mCurrentDate.h(2) == this.mMinDate.get(2) && this.mCurrentDate.h(1) == this.mMaxDate.get(1) && this.mCurrentDate.h(2) == this.mMaxDate.get(2)) {
            this.mDaySpinner.setMinValue(this.mMinDate.get(5));
            this.mDaySpinner.setMaxValue(this.mMaxDate.get(5));
            COUINumberPicker cOUINumberPicker = this.mDaySpinner;
            if (this.mMaxDate.get(5) == this.mMaxDate.getActualMaximum(5) && this.mMinDate.get(5) == 1) {
                z = true;
            }
            cOUINumberPicker.setWrapSelectorWheel(z);
        } else {
            this.mDaySpinner.setMinValue(this.mCurrentDate.j(5));
            this.mDaySpinner.setMaxValue(this.mCurrentDate.i(5));
            this.mDaySpinner.setWrapSelectorWheel(true);
        }
        this.mYearSpinner.setMinValue(this.mMinDate.get(1));
        this.mYearSpinner.setMaxValue(this.mMaxDate.get(1));
        this.mYearSpinner.setWrapSelectorWheel(true);
        this.mYearSpinner.setFormatter(this.mYearFormat);
        this.mYearSpinner.setValue(this.mCurrentDate.h(1));
        this.mMonthSpinner.setValue(this.mCurrentDate.h(2));
        this.mDaySpinner.setValue(this.mCurrentDate.h(5));
        this.mDaySpinner.setFormatter(this.mDayFormat);
        if (this.mDaySpinner.getValue() > 27) {
            this.mDaySpinner.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(this.mDaySpinner.getBackgroundColor());
        int height = (int) ((getHeight() / 2.0f) - this.mBackgroundRadius);
        canvas.drawRect(this.mBackgroundLeft, height, getWidth() - this.mBackgroundLeft, height + this.mBackgroundDividerHeight, paint);
        int height2 = (int) ((getHeight() / 2.0f) + this.mBackgroundRadius);
        canvas.drawRect(this.mBackgroundLeft, height2, getWidth() - this.mBackgroundLeft, height2 + this.mBackgroundDividerHeight, paint);
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
        return this.mCurrentDate.h(5);
    }

    public COUINumberPicker getDaySpinner() {
        return this.mDaySpinner;
    }

    public long getMaxDate() {
        return this.mMaxDate.getTimeInMillis();
    }

    public long getMinDate() {
        return this.mMinDate.getTimeInMillis();
    }

    public int getMonth() {
        return this.mCurrentDate.h(2);
    }

    public COUINumberPicker getMonthSpinner() {
        return this.mMonthSpinner;
    }

    public e getOnDateChangedListener() {
        return this.mOnDateChangedListener;
    }

    public boolean getSpinnersShown() {
        return this.mSpinners.isShown();
    }

    public int getYear() {
        return this.mCurrentDate.h(1);
    }

    public COUINumberPicker getYearSpinner() {
        return this.mYearSpinner;
    }

    public void init(int i, int i2, int i3, e eVar) {
        setDate(i, i2, i3);
        updateSpinners();
        updateCalendarView();
        this.mOnDateChangedListener = eVar;
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public boolean isLayoutRtl() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
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
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, mode);
        this.mDaySpinner.clearNumberPickerPadding();
        this.mMonthSpinner.clearNumberPickerPadding();
        this.mYearSpinner.clearNumberPickerPadding();
        measureChildConstrained(this.mDaySpinner, i, i2);
        measureChildConstrained(this.mMonthSpinner, i, i2);
        measureChildConstrained(this.mYearSpinner, i, i2);
        int measuredWidth = (((size - this.mDaySpinner.getMeasuredWidth()) - this.mMonthSpinner.getMeasuredWidth()) - this.mYearSpinner.getMeasuredWidth()) / 2;
        if (this.mSpinners.getChildAt(this.mLeftPickerPosition) instanceof COUINumberPicker) {
            ((COUINumberPicker) this.mSpinners.getChildAt(this.mLeftPickerPosition)).setNumberPickerPaddingLeft(measuredWidth);
        }
        if (this.mSpinners.getChildAt(this.mRightPickerPosition) instanceof COUINumberPicker) {
            ((COUINumberPicker) this.mSpinners.getChildAt(this.mRightPickerPosition)).setNumberPickerPaddingRight(measuredWidth);
        }
        super.onMeasure(iMakeMeasureSpec, i2);
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
        return new SavedState(super.onSaveInstanceState(), getYear(), getMonth(), getDayOfMonth(), null);
    }

    public void refresh() {
        COUINumberPicker cOUINumberPicker = this.mDaySpinner;
        if (cOUINumberPicker != null) {
            cOUINumberPicker.refresh();
        }
        COUINumberPicker cOUINumberPicker2 = this.mMonthSpinner;
        if (cOUINumberPicker2 != null) {
            cOUINumberPicker2.refresh();
        }
        COUINumberPicker cOUINumberPicker3 = this.mYearSpinner;
        if (cOUINumberPicker3 != null) {
            cOUINumberPicker3.refresh();
        }
    }

    public void scrollForceFinished() {
        COUINumberPicker cOUINumberPicker = this.mDaySpinner;
        if (cOUINumberPicker != null) {
            cOUINumberPicker.scrollForceFinished();
        }
        COUINumberPicker cOUINumberPicker2 = this.mMonthSpinner;
        if (cOUINumberPicker2 != null) {
            cOUINumberPicker2.scrollForceFinished();
        }
        COUINumberPicker cOUINumberPicker3 = this.mYearSpinner;
        if (cOUINumberPicker3 != null) {
            cOUINumberPicker3.scrollForceFinished();
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
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
        this.mFocusColor = i;
        updateSpinnerColor();
    }

    public void setMaxDate(long j2) {
        this.mTempDate.n(j2);
        if (this.mTempDate.h(1) != this.mMaxDate.get(1) || this.mTempDate.h(6) == this.mMaxDate.get(6)) {
            this.mMaxDate.setTimeInMillis(j2);
            if (this.mCurrentDate.c(this.mMaxDate)) {
                this.mCurrentDate.n(this.mMaxDate.getTimeInMillis());
                updateCalendarView();
            }
            updateSpinners();
        }
    }

    public void setMinDate(long j2) {
        this.mTempDate.n(j2);
        if (this.mTempDate.h(1) != this.mMinDate.get(1) || this.mTempDate.h(6) == this.mMinDate.get(6)) {
            this.mMinDate.setTimeInMillis(j2);
            if (this.mCurrentDate.d(this.mMinDate)) {
                this.mCurrentDate.n(this.mMinDate.getTimeInMillis());
                updateCalendarView();
            }
            updateSpinners();
        }
    }

    public void setNormalColor(@ColorInt int i) {
        this.mNormalColor = i;
        updateSpinnerColor();
    }

    public void setNormalTextColor(int i) {
        COUINumberPicker cOUINumberPicker = this.mDaySpinner;
        if (cOUINumberPicker != null) {
            cOUINumberPicker.setNormalTextColor(i);
        }
        COUINumberPicker cOUINumberPicker2 = this.mMonthSpinner;
        if (cOUINumberPicker2 != null) {
            cOUINumberPicker2.setNormalTextColor(i);
        }
        COUINumberPicker cOUINumberPicker3 = this.mYearSpinner;
        if (cOUINumberPicker3 != null) {
            cOUINumberPicker3.setNormalTextColor(i);
        }
    }

    public void setOnDateChangedListener(e eVar) {
        this.mOnDateChangedListener = eVar;
    }

    public void setSpinnersShown(boolean z) {
        this.mSpinners.setVisibility(z ? 0 : 8);
    }

    public void setVibrateIntensity(float f) {
        this.mDaySpinner.setVibrateIntensity(f);
        this.mMonthSpinner.setVibrateIntensity(f);
        this.mYearSpinner.setVibrateIntensity(f);
    }

    public void setVibrateLevel(int i) {
        this.mDaySpinner.setVibrateLevel(i);
        this.mMonthSpinner.setVibrateLevel(i);
        this.mYearSpinner.setVibrateLevel(i);
    }

    public void updateDate(int i, int i2, int i3) {
        if (isNewDate(i, i2, i3)) {
            setDate(i, i2, i3);
            updateSpinners();
            updateCalendarView();
            notifyDateChanged();
        }
    }

    public COUIDatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiDatePickerStyle);
    }

    public void setBackground(int i) {
        setBackgroundDrawable(getContext().getResources().getDrawable(i));
    }

    public COUIDatePicker(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.DatePickerStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDate(d dVar) {
        this.mCurrentDate.o(dVar);
        clampDate();
    }

    public COUIDatePicker(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mDateFormat = new SimpleDateFormat(DATE_FORMAT);
        this.mLeftPickerPosition = -1;
        this.mRightPickerPosition = -1;
        this.mIsEnabled = true;
        ph2.c(this, false);
        this.mContext = context;
        setCurrentLocale(Locale.getDefault());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIDatePicker, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIDatePicker_spinnerShown, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIDatePicker_calendarViewShown, true);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIDatePicker_beginYear, 1900);
        int i4 = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIDatePicker_endYear, 2100);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.COUIDatePicker_minDate);
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.COUIDatePicker_maxDate);
        this.mShortMonths = getResources().getStringArray(R$array.coui_solor_mounth);
        this.mNormalColor = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIDatePicker_calendarTextColor, -1);
        this.mFocusColor = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIDatePicker_calendarSelectedTextColor, -1);
        int i5 = R$layout.coui_date_picker;
        this.mYearIgnorable = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIDatePicker_couiYearIgnorable, false);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.COUIPickersCommonAttrs, i, 0);
        this.mMaxWidth = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.COUIPickersCommonAttrs_couiPickersMaxWidth, 0);
        typedArrayObtainStyledAttributes2.recycle();
        this.mBackgroundDividerHeight = Math.max(getResources().getDimensionPixelOffset(R$dimen.coui_number_picker_background_divider_height), 1);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(i5, (ViewGroup) this, true);
        a aVar = new a();
        b bVar = new b();
        this.mSpinners = (LinearLayout) findViewById(R$id.pickers);
        this.mYearFormat = new c(R$string.coui_year, t13.YEAR);
        this.mMonthFormat = new c(R$string.coui_month, t13.MONTH);
        this.mDayFormat = new c(R$string.coui_day, t13.DAY);
        this.mEndDate = new Date();
        COUINumberPicker cOUINumberPicker = (COUINumberPicker) findViewById(R$id.day);
        this.mDaySpinner = cOUINumberPicker;
        cOUINumberPicker.setOnLongPressUpdateInterval(100L);
        cOUINumberPicker.setOnValueChangedListener(aVar);
        cOUINumberPicker.setOnScrollingStopListener(bVar);
        COUINumberPicker cOUINumberPicker2 = (COUINumberPicker) findViewById(R$id.month);
        this.mMonthSpinner = cOUINumberPicker2;
        cOUINumberPicker2.setMinValue(0);
        cOUINumberPicker2.setMaxValue(this.mNumberOfMonths - 1);
        cOUINumberPicker2.setOnLongPressUpdateInterval(200L);
        cOUINumberPicker2.setOnValueChangedListener(aVar);
        cOUINumberPicker2.setOnScrollingStopListener(bVar);
        COUINumberPicker cOUINumberPicker3 = (COUINumberPicker) findViewById(R$id.year);
        this.mYearSpinner = cOUINumberPicker3;
        cOUINumberPicker3.setOnLongPressUpdateInterval(100L);
        cOUINumberPicker3.setOnValueChangedListener(aVar);
        cOUINumberPicker3.setOnScrollingStopListener(bVar);
        cOUINumberPicker3.setIgnorable(this.mYearIgnorable);
        updateSpinnerColor();
        if (!z && !z2) {
            setSpinnersShown(true);
        } else {
            setSpinnersShown(z);
            setCalendarViewShown(z2);
        }
        this.mTempDate.g();
        if (TextUtils.isEmpty(string) || !parseDate(string, this.mTempDate.a)) {
            this.mTempDate.m(i3, 0, 1);
        }
        setMinDate(this.mTempDate.a.getTimeInMillis());
        this.mTempDate.g();
        if (TextUtils.isEmpty(string2) || !parseDate(string2, this.mTempDate.a)) {
            this.mTempDate.m(i4, 11, 31);
        }
        setMaxDate(this.mTempDate.a.getTimeInMillis());
        this.mCurrentDate.n(System.currentTimeMillis());
        init(this.mCurrentDate.h(1), this.mCurrentDate.h(2), this.mCurrentDate.h(5), null);
        reorderSpinners();
        this.mBackgroundRadius = context.getResources().getDimensionPixelOffset(R$dimen.coui_selected_background_radius);
        this.mBackgroundLeft = context.getResources().getDimensionPixelOffset(R$dimen.coui_selected_background_horizontal_padding);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
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
