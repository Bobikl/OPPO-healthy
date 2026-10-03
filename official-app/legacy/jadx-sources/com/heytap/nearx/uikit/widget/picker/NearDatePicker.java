package com.heytap.nearx.uikit.widget.picker;

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
import android.view.accessibility.AccessibilityEvent;
import android.widget.CalendarView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.timepicker.TimeModel;
import com.heytap.nearx.uikit.R$array;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$string;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.aiunit.vision.t13;
import com.oplus.aiunit.vision.vhc;
import com.oplus.aiunit.vision.xhc;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class NearDatePicker extends FrameLayout {
    private static final int A_LEAP_YEAR = 2020;
    private static final String DATE_FORMAT = "MM/dd/yyyy";
    private static final boolean DEFAULT_CALENDAR_VIEW_SHOWN = true;
    private static final boolean DEFAULT_ENABLED_STATE = true;
    private static final int DEFAULT_END_YEAR = 2100;
    private static final boolean DEFAULT_SPINNERS_SHOWN = true;
    private static final int DEFAULT_START_YEAR = 1900;
    private static final int HOURS_OF_HALF_DAY = 12;
    public static final int IGNORED_YEAR = Integer.MIN_VALUE;
    private static final String LOG_TAG = "NearDatePicker";
    private static final int LONGPRESS_UPDATE_INTERVAL = 100;
    private static final String MD_FORMAT = "MM/dd";
    private static final int MONTH_LONGPRESS_UPDATE_INTERVAL = 200;
    private static final String TAG = "NearDatePicker";
    private static char[] sOrderEn = {'d', 'M', 'y'};
    private int mBackgroundLeft;
    private int mBackgroundRadius;
    private Context mContext;
    private IncompleteDate mCurrentDate;
    private Locale mCurrentLocale;
    private final DateFormat mDateFormat;
    private Format mDayFormat;
    private final NearNumberPicker mDaySpinner;
    private Date mEndDate;
    private int mFocusColor;
    private boolean mIsEnabled;
    int mLeftPickerPosition;
    private Calendar mMaxDate;
    private int mMaxWidth;
    private Calendar mMinDate;
    private Format mMonthFormat;
    private final NearNumberPicker mMonthSpinner;
    private int mNormalColor;
    private int mNumberOfMonths;
    private OnDateChangedListener mOnDateChangedListener;
    int mRightPickerPosition;
    private String[] mShortMonths;
    private final LinearLayout mSpinners;
    private IncompleteDate mTempDate;
    private Format mYearFormat;
    private boolean mYearIgnorable;
    private final NearNumberPicker mYearSpinner;

    public class Format implements NearNumberPicker.Formatter {
        int mId;
        String mTag;

        public Format(int i, String str) {
            this.mId = i;
            this.mTag = str;
        }

        @Override // com.heytap.nearx.uikit.widget.picker.NearNumberPicker.Formatter
        public String format(int i) {
            if (this.mTag.equals(t13.MONTH)) {
                NearDatePicker.this.mEndDate.setMonth(i);
                return DateUtils.formatDateTime(NearDatePicker.this.getContext(), NearDatePicker.this.mEndDate.getTime(), 65576);
            }
            if (!Locale.getDefault().getLanguage().equals("zh")) {
                Formatter formatter = new Formatter(new StringBuilder(), NearDatePicker.this.mCurrentLocale);
                if (this.mTag.equals(t13.YEAR)) {
                    formatter.format(TimeModel.NUMBER_FORMAT, Integer.valueOf(i));
                    return formatter.toString();
                }
                if (this.mTag.equals(t13.DAY)) {
                    formatter.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i));
                    return formatter.toString();
                }
            }
            return i + NearDatePicker.this.getResources().getString(this.mId);
        }
    }

    public interface OnDateChangedListener {
        void onDateChanged(NearDatePicker nearDatePicker, int i, int i2, int i3);
    }

    public NearDatePicker(Context context) {
        this(context, null);
    }

    private void clampDate() {
        this.mCurrentDate.clampDate(this.mMinDate, this.mMaxDate);
    }

    private String formatDate() {
        return !this.mCurrentDate.isIncomplete ? DateUtils.formatDateTime(this.mContext, this.mCurrentDate.date.getTimeInMillis(), 20) : DateUtils.formatDateTime(this.mContext, this.mCurrentDate.date.getTimeInMillis(), 24);
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

    private boolean isNewDate(int i, int i2, int i3) {
        return (this.mCurrentDate.get(1) == i && this.mCurrentDate.get(2) == i2 && this.mCurrentDate.get(5) == i3) ? false : true;
    }

    private void measureChildConstrained(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDateChanged() {
        OnDateChangedListener onDateChangedListener = this.mOnDateChangedListener;
        if (onDateChangedListener != null) {
            onDateChangedListener.onDateChanged(this, getYear(), getMonth(), getDayOfMonth());
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
        int actualMaximum = this.mTempDate.getActualMaximum(2) + 1;
        this.mNumberOfMonths = actualMaximum;
        this.mShortMonths = new String[actualMaximum];
    }

    private void setDate(int i, int i2, int i3) {
        this.mCurrentDate.set(i, i2, i3);
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
        if (this.mCurrentDate.get(1) == this.mMinDate.get(1) && this.mCurrentDate.get(1) != this.mMaxDate.get(1)) {
            this.mMonthSpinner.setMinValue(this.mMinDate.get(2));
            this.mMonthSpinner.setMaxValue(this.mMinDate.getActualMaximum(2));
            this.mMonthSpinner.setWrapSelectorWheel(this.mMinDate.get(2) == 0);
        } else if (this.mCurrentDate.get(1) != this.mMinDate.get(1) && this.mCurrentDate.get(1) == this.mMaxDate.get(1)) {
            this.mMonthSpinner.setMinValue(0);
            this.mMonthSpinner.setMaxValue(this.mMaxDate.get(2));
            this.mMonthSpinner.setWrapSelectorWheel(this.mMaxDate.get(2) == this.mMaxDate.getActualMaximum(2));
        } else if (this.mCurrentDate.get(1) == this.mMinDate.get(1) && this.mCurrentDate.get(1) == this.mMaxDate.get(1)) {
            this.mMonthSpinner.setMinValue(this.mMinDate.get(2));
            this.mMonthSpinner.setMaxValue(this.mMaxDate.get(2));
            this.mMonthSpinner.setWrapSelectorWheel(this.mMaxDate.get(2) == this.mMaxDate.getActualMaximum(2) && this.mMinDate.get(2) == 0);
        } else {
            this.mMonthSpinner.setMinValue(this.mCurrentDate.getActualMinimum(2));
            this.mMonthSpinner.setMaxValue(this.mCurrentDate.getActualMaximum(2));
            this.mMonthSpinner.setWrapSelectorWheel(true);
        }
        if (this.mCurrentDate.get(1) == this.mMinDate.get(1) && this.mCurrentDate.get(2) == this.mMinDate.get(2) && (this.mCurrentDate.get(1) != this.mMaxDate.get(1) || this.mCurrentDate.get(2) != this.mMaxDate.get(2))) {
            this.mDaySpinner.setMinValue(this.mMinDate.get(5));
            this.mDaySpinner.setMaxValue(this.mMinDate.getActualMaximum(5));
            this.mDaySpinner.setWrapSelectorWheel(this.mMinDate.get(5) == 1);
        } else if (!(this.mCurrentDate.get(1) == this.mMinDate.get(1) && this.mCurrentDate.get(2) == this.mMinDate.get(2)) && this.mCurrentDate.get(1) == this.mMaxDate.get(1) && this.mCurrentDate.get(2) == this.mMaxDate.get(2)) {
            this.mDaySpinner.setMinValue(1);
            this.mDaySpinner.setMaxValue(this.mMaxDate.get(5));
            this.mDaySpinner.setWrapSelectorWheel(this.mMaxDate.get(5) == this.mMaxDate.getActualMaximum(5));
        } else if (this.mCurrentDate.get(1) == this.mMinDate.get(1) && this.mCurrentDate.get(2) == this.mMinDate.get(2) && this.mCurrentDate.get(1) == this.mMaxDate.get(1) && this.mCurrentDate.get(2) == this.mMaxDate.get(2)) {
            this.mDaySpinner.setMinValue(this.mMinDate.get(5));
            this.mDaySpinner.setMaxValue(this.mMaxDate.get(5));
            NearNumberPicker nearNumberPicker = this.mDaySpinner;
            if (this.mMaxDate.get(5) == this.mMaxDate.getActualMaximum(5) && this.mMinDate.get(5) == 1) {
                z = true;
            }
            nearNumberPicker.setWrapSelectorWheel(z);
        } else {
            this.mDaySpinner.setMinValue(this.mCurrentDate.getActualMinimum(5));
            this.mDaySpinner.setMaxValue(this.mCurrentDate.getActualMaximum(5));
            this.mDaySpinner.setWrapSelectorWheel(true);
        }
        this.mYearSpinner.setMinValue(this.mMinDate.get(1));
        this.mYearSpinner.setMaxValue(this.mMaxDate.get(1));
        this.mYearSpinner.setWrapSelectorWheel(true);
        this.mYearSpinner.setFormatter(this.mYearFormat);
        this.mYearSpinner.setValue(this.mCurrentDate.get(1));
        this.mMonthSpinner.setValue(this.mCurrentDate.get(2));
        this.mDaySpinner.setValue(this.mCurrentDate.get(5));
        this.mDaySpinner.setFormatter(this.mDayFormat);
        if (this.mDaySpinner.getValue() > 27) {
            this.mDaySpinner.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(this.mDaySpinner.getBackgroundColor());
        float f = this.mBackgroundLeft;
        float height = (getHeight() / 2.0f) - this.mBackgroundRadius;
        float width = getWidth() - this.mBackgroundLeft;
        float height2 = getHeight() / 2.0f;
        int i = this.mBackgroundRadius;
        canvas.drawRoundRect(f, height, width, i + height2, i, i, paint);
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

    public long getMaxDate() {
        return this.mMaxDate.getTimeInMillis();
    }

    public long getMinDate() {
        return this.mMinDate.getTimeInMillis();
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

    public void hideDaySpinner() {
        this.mDaySpinner.setVisibility(8);
        this.mMonthSpinner.setLayoutParams(this.mYearSpinner.getLayoutParams());
        this.mYearSpinner.setAlignPosition(0);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R$dimen.nx_numberpicker_padding);
        this.mSpinners.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
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
        if (this.mSpinners.getChildAt(this.mLeftPickerPosition) instanceof NearNumberPicker) {
            ((NearNumberPicker) this.mSpinners.getChildAt(this.mLeftPickerPosition)).setNumberPickerPaddingLeft(measuredWidth);
        }
        if (this.mSpinners.getChildAt(this.mRightPickerPosition) instanceof NearNumberPicker) {
            ((NearNumberPicker) this.mSpinners.getChildAt(this.mRightPickerPosition)).setNumberPickerPaddingRight(measuredWidth);
        }
        super.onMeasure(iMakeMeasureSpec, i2);
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(formatDate());
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

    public void setFocusColor(int i) {
        this.mFocusColor = i;
        updateSpinnerColor();
    }

    public void setMaxDate(long j2) {
        this.mTempDate.setTimeInMillis(j2);
        if (this.mTempDate.get(1) != this.mMaxDate.get(1) || this.mTempDate.get(6) == this.mMaxDate.get(6)) {
            this.mMaxDate.setTimeInMillis(j2);
            if (this.mCurrentDate.after(this.mMaxDate)) {
                this.mCurrentDate.setTimeInMillis(this.mMaxDate.getTimeInMillis());
                updateCalendarView();
            }
            updateSpinners();
        }
    }

    public void setMinDate(long j2) {
        this.mTempDate.setTimeInMillis(j2);
        if (this.mTempDate.get(1) != this.mMinDate.get(1) || this.mTempDate.get(6) == this.mMinDate.get(6)) {
            this.mMinDate.setTimeInMillis(j2);
            if (this.mCurrentDate.before(this.mMinDate)) {
                this.mCurrentDate.setTimeInMillis(this.mMinDate.getTimeInMillis());
                updateCalendarView();
            }
            updateSpinners();
        }
    }

    public void setNormalColor(int i) {
        this.mNormalColor = i;
        updateSpinnerColor();
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

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.heytap.nearx.uikit.widget.picker.NearDatePicker.SavedState.1
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

    public NearDatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nxDatePickerStyle);
    }

    public void setBackground(int i) {
        xhc xhcVar = xhc.INSTANCE;
        setBackgroundDrawable(xhc.a(getContext(), i));
    }

    public NearDatePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDateFormat = new SimpleDateFormat(DATE_FORMAT);
        this.mLeftPickerPosition = -1;
        this.mRightPickerPosition = -1;
        this.mIsEnabled = true;
        vhc.b(this, false);
        this.mContext = context;
        setCurrentLocale(Locale.getDefault());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearDatePicker, i, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearDatePicker_spinnerShown, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearDatePicker_calendarViewShown, true);
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.NearDatePicker_nxStartYear, 1900);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.NearDatePicker_nxEndYear, 2100);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.NearDatePicker_nxMinDate);
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.NearDatePicker_nxMaxDate);
        this.mShortMonths = getResources().getStringArray(R$array.NXcolor_solor_mounth);
        this.mNormalColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearDatePicker_nxTextColor, -1);
        this.mFocusColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearDatePicker_nxSelectedTextColor, -1);
        int i4 = R$layout.nx_date_picker;
        this.mYearIgnorable = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearDatePicker_nxYearIgnorable, false);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.NearPickersCommonAttrs, i, 0);
        this.mMaxWidth = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.NearPickersCommonAttrs_nxPickersMaxWidth, 0);
        typedArrayObtainStyledAttributes2.recycle();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(i4, (ViewGroup) this, true);
        NearNumberPicker.OnValueChangeListener onValueChangeListener = new NearNumberPicker.OnValueChangeListener() { // from class: com.heytap.nearx.uikit.widget.picker.NearDatePicker.1
            @Override // com.heytap.nearx.uikit.widget.picker.NearNumberPicker.OnValueChangeListener
            public void onValueChange(NearNumberPicker nearNumberPicker, int i5, int i6) {
                NearDatePicker.this.mTempDate.setWith(NearDatePicker.this.mCurrentDate);
                if (nearNumberPicker == NearDatePicker.this.mDaySpinner) {
                    NearDatePicker.this.mTempDate.set(5, i6);
                } else if (nearNumberPicker == NearDatePicker.this.mMonthSpinner) {
                    NearDatePicker.this.mTempDate.set(2, i6);
                } else {
                    if (nearNumberPicker != NearDatePicker.this.mYearSpinner) {
                        throw new IllegalArgumentException();
                    }
                    NearDatePicker.this.mTempDate.set(1, i6);
                }
                NearDatePicker nearDatePicker = NearDatePicker.this;
                nearDatePicker.setDate(nearDatePicker.mTempDate);
                NearDatePicker.this.updateSpinners();
                NearDatePicker.this.updateCalendarView();
                NearDatePicker.this.notifyDateChanged();
            }
        };
        NearNumberPicker.OnScrollingStopListener onScrollingStopListener = new NearNumberPicker.OnScrollingStopListener() { // from class: com.heytap.nearx.uikit.widget.picker.NearDatePicker.2
            @Override // com.heytap.nearx.uikit.widget.picker.NearNumberPicker.OnScrollingStopListener
            public void onScrollingStop() {
                NearDatePicker.this.sendAccessibilityEvent(4);
            }
        };
        this.mSpinners = (LinearLayout) findViewById(R$id.pickers);
        this.mYearFormat = new Format(R$string.NXcolor_year, t13.YEAR);
        this.mMonthFormat = new Format(R$string.NXcolor_month, t13.MONTH);
        this.mDayFormat = new Format(R$string.NXcolor_day, t13.DAY);
        this.mEndDate = new Date();
        NearNumberPicker nearNumberPicker = (NearNumberPicker) findViewById(R$id.day);
        this.mDaySpinner = nearNumberPicker;
        nearNumberPicker.setOnLongPressUpdateInterval(100L);
        nearNumberPicker.setOnValueChangedListener(onValueChangeListener);
        nearNumberPicker.setOnScrollingStopListener(onScrollingStopListener);
        NearNumberPicker nearNumberPicker2 = (NearNumberPicker) findViewById(R$id.month);
        this.mMonthSpinner = nearNumberPicker2;
        nearNumberPicker2.setMinValue(0);
        nearNumberPicker2.setMaxValue(this.mNumberOfMonths - 1);
        nearNumberPicker2.setOnLongPressUpdateInterval(200L);
        nearNumberPicker2.setOnValueChangedListener(onValueChangeListener);
        nearNumberPicker2.setOnScrollingStopListener(onScrollingStopListener);
        NearNumberPicker nearNumberPicker3 = (NearNumberPicker) findViewById(R$id.year);
        this.mYearSpinner = nearNumberPicker3;
        nearNumberPicker3.setOnLongPressUpdateInterval(100L);
        nearNumberPicker3.setOnValueChangedListener(onValueChangeListener);
        nearNumberPicker3.setOnScrollingStopListener(onScrollingStopListener);
        nearNumberPicker3.setIgnorable(this.mYearIgnorable);
        updateSpinnerColor();
        if (!z && !z2) {
            setSpinnersShown(true);
        } else {
            setSpinnersShown(z);
            setCalendarViewShown(z2);
        }
        this.mTempDate.clear();
        if (TextUtils.isEmpty(string) || !parseDate(string, this.mTempDate.date)) {
            this.mTempDate.set(i2, 0, 1);
        }
        setMinDate(this.mTempDate.date.getTimeInMillis());
        this.mTempDate.clear();
        if (TextUtils.isEmpty(string2) || !parseDate(string2, this.mTempDate.date)) {
            this.mTempDate.set(i3, 11, 31);
        }
        setMaxDate(this.mTempDate.date.getTimeInMillis());
        this.mCurrentDate.setTimeInMillis(System.currentTimeMillis());
        init(this.mCurrentDate.get(1), this.mCurrentDate.get(2), this.mCurrentDate.get(5), null);
        reorderSpinners();
        if (nearNumberPicker3.isAccessibilityEnable()) {
            String string3 = context.getResources().getString(R$string.nx_picker_talkback_tip);
            nearNumberPicker3.addTalkbackSuffix(string3);
            nearNumberPicker2.addTalkbackSuffix(string3);
            nearNumberPicker.addTalkbackSuffix(string3);
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

    private Calendar getCalendarForLocale(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeInMillis(timeInMillis);
        return calendar2;
    }

    public static class IncompleteDate {
        private Calendar date;
        private boolean isIncomplete;

        public IncompleteDate(Locale locale) {
            this.date = Calendar.getInstance(locale);
        }

        public boolean after(Calendar calendar) {
            if (this.isIncomplete) {
                return false;
            }
            return this.date.after(calendar);
        }

        public boolean before(Calendar calendar) {
            if (this.isIncomplete) {
                return false;
            }
            return this.date.before(calendar);
        }

        public void clampDate(Calendar calendar, Calendar calendar2) {
            if (this.isIncomplete) {
                return;
            }
            if (this.date.before(calendar)) {
                set(1, calendar.get(1));
                set(2, calendar.get(2));
                set(5, calendar.get(5));
            } else if (this.date.after(calendar2)) {
                set(1, calendar2.get(1));
                set(2, calendar2.get(2));
                set(5, calendar2.get(5));
            }
        }

        public int clampDay(int i) {
            int actualMaximum = this.date.getActualMaximum(5);
            return i > actualMaximum ? actualMaximum : i;
        }

        public void clear() {
            this.date.clear();
            this.isIncomplete = false;
        }

        public int get(int i) {
            if (this.isIncomplete && i != 5 && i != 2 && i == 1) {
                return Integer.MIN_VALUE;
            }
            return this.date.get(i);
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

        public void set(int i, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 5) {
                        this.date.set(5, clampDay(i2));
                        return;
                    }
                    return;
                } else {
                    int i3 = this.date.get(1);
                    int i4 = this.date.get(5);
                    this.date.clear();
                    this.date.set(1, i3);
                    this.date.set(2, i2);
                    this.date.set(5, clampDay(i4));
                    return;
                }
            }
            if (i2 != Integer.MIN_VALUE) {
                this.isIncomplete = false;
                int i5 = this.date.get(2);
                int i6 = this.date.get(5);
                this.date.clear();
                this.date.set(1, i2);
                this.date.set(2, i5);
                this.date.set(5, clampDay(i6));
                return;
            }
            this.isIncomplete = true;
            int i7 = this.date.get(2);
            int i8 = this.date.get(5);
            this.date.clear();
            this.date.set(i, 2020);
            this.date.set(2, i7);
            this.date.set(5, clampDay(i8));
        }

        public void setTimeInMillis(long j2) {
            this.date.setTimeInMillis(j2);
            this.isIncomplete = false;
        }

        public void setWith(IncompleteDate incompleteDate) {
            this.date.setTimeInMillis(incompleteDate.date.getTimeInMillis());
            this.isIncomplete = incompleteDate.isIncomplete;
        }

        public void set(int i, int i2, int i3) {
            set(1, i);
            set(2, i2);
            set(5, i3);
        }
    }
}
