package com.heytap.nearx.uikit.widget.calendar;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.autofill.AutofillValue;
import android.widget.FrameLayout;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$styleable;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class NearCalendarPicker extends FrameLayout {
    private static final String LOG_TAG = "NearCalendarPicker";
    private final NearDatePickerDelegate mDelegate;
    private final int mMaxWidth;

    public static abstract class AbstractDatePickerDelegate implements NearDatePickerDelegate {
        protected OnDateChangedListener mAutoFillChangeListener;
        protected Context mContext;
        protected Calendar mCurrentDate;
        protected Locale mCurrentLocale;
        protected NearCalendarPicker mDelegator;
        protected OnDateChangedListener mOnDateChangedListener;
        protected ValidationCallback mValidationCallback;

        public static class SavedState extends View.BaseSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.AbstractDatePickerDelegate.SavedState.1
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
            private final int mCurrentView;
            private final int mListPosition;
            private final int mListPositionOffset;
            private final long mMaxDate;
            private final long mMinDate;
            private final int mSelectedDay;
            private final int mSelectedMonth;
            private final int mSelectedYear;

            public int getCurrentView() {
                return this.mCurrentView;
            }

            public int getListPosition() {
                return this.mListPosition;
            }

            public int getListPositionOffset() {
                return this.mListPositionOffset;
            }

            public long getMaxDate() {
                return this.mMaxDate;
            }

            public long getMinDate() {
                return this.mMinDate;
            }

            public int getSelectedDay() {
                return this.mSelectedDay;
            }

            public int getSelectedMonth() {
                return this.mSelectedMonth;
            }

            public int getSelectedYear() {
                return this.mSelectedYear;
            }

            @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.mSelectedYear);
                parcel.writeInt(this.mSelectedMonth);
                parcel.writeInt(this.mSelectedDay);
                parcel.writeLong(this.mMinDate);
                parcel.writeLong(this.mMaxDate);
                parcel.writeInt(this.mCurrentView);
                parcel.writeInt(this.mListPosition);
                parcel.writeInt(this.mListPositionOffset);
            }

            public SavedState(Parcelable parcelable, int i, int i2, int i3, long j2, long j3) {
                this(parcelable, i, i2, i3, j2, j3, 0, 0, 0);
            }

            public SavedState(Parcelable parcelable, int i, int i2, int i3, long j2, long j3, int i4, int i5, int i6) {
                super(parcelable);
                this.mSelectedYear = i;
                this.mSelectedMonth = i2;
                this.mSelectedDay = i3;
                this.mMinDate = j2;
                this.mMaxDate = j3;
                this.mCurrentView = i4;
                this.mListPosition = i5;
                this.mListPositionOffset = i6;
            }

            private SavedState(Parcel parcel) {
                super(parcel);
                this.mSelectedYear = parcel.readInt();
                this.mSelectedMonth = parcel.readInt();
                this.mSelectedDay = parcel.readInt();
                this.mMinDate = parcel.readLong();
                this.mMaxDate = parcel.readLong();
                this.mCurrentView = parcel.readInt();
                this.mListPosition = parcel.readInt();
                this.mListPositionOffset = parcel.readInt();
            }
        }

        public AbstractDatePickerDelegate(NearCalendarPicker nearCalendarPicker, Context context) {
            this.mDelegator = nearCalendarPicker;
            this.mContext = context;
            setCurrentLocale(Locale.getDefault());
        }

        @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
        public long getDate() {
            return this.mCurrentDate.getTimeInMillis();
        }

        public String getFormattedCurrentDate() {
            return DateUtils.formatDateTime(this.mContext, this.mCurrentDate.getTimeInMillis(), 22);
        }

        public void onLocaleChanged(Locale locale) {
        }

        @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
        public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.getText().add(getFormattedCurrentDate());
        }

        public void onValidationChanged(boolean z) {
            ValidationCallback validationCallback = this.mValidationCallback;
            if (validationCallback != null) {
                validationCallback.onValidationChanged(z);
            }
        }

        @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
        public void setAutoFillChangeListener(OnDateChangedListener onDateChangedListener) {
            this.mAutoFillChangeListener = onDateChangedListener;
        }

        public void setCurrentLocale(Locale locale) {
            if (locale.equals(this.mCurrentLocale)) {
                return;
            }
            this.mCurrentLocale = locale;
            onLocaleChanged(locale);
        }

        @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
        public void setOnDateChangedListener(OnDateChangedListener onDateChangedListener) {
            this.mOnDateChangedListener = onDateChangedListener;
        }

        @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
        public void setValidationCallback(ValidationCallback validationCallback) {
            this.mValidationCallback = validationCallback;
        }

        @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
        public void updateDate(long j2) {
            Calendar calendar = Calendar.getInstance(this.mCurrentLocale);
            calendar.setTimeInMillis(j2);
            updateDate(calendar.get(1), calendar.get(2), calendar.get(5));
        }
    }

    public interface NearDatePickerDelegate {
        boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent);

        long getDate();

        int getDayOfMonth();

        int getFirstDayOfWeek();

        Calendar getMaxDate();

        Calendar getMinDate();

        int getMonth();

        int getYear();

        void init(int i, int i2, int i3, OnDateChangedListener onDateChangedListener);

        boolean isEnabled();

        boolean isYearPickerIsShow();

        void onConfigurationChanged(Configuration configuration);

        void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent);

        void onRestoreInstanceState(Parcelable parcelable);

        Parcelable onSaveInstanceState(Parcelable parcelable);

        void setAutoFillChangeListener(OnDateChangedListener onDateChangedListener);

        void setCurrentYear();

        void setEnabled(boolean z);

        void setFirstDayOfWeek(int i);

        void setMaxDate(long j2);

        void setMinDate(long j2);

        void setOnDateChangedListener(OnDateChangedListener onDateChangedListener);

        void setValidationCallback(ValidationCallback validationCallback);

        void updateDate(int i, int i2, int i3);

        void updateDate(long j2);
    }

    public interface OnDateChangedListener {
        void onDateChanged(NearCalendarPicker nearCalendarPicker, int i, int i2, int i3);
    }

    public interface ValidationCallback {
        void onValidationChanged(boolean z);
    }

    public NearCalendarPicker(Context context) {
        this(context, null);
    }

    private NearDatePickerDelegate createCalendarUIDelegate(Context context, AttributeSet attributeSet, int i, int i2) {
        return new NearCalendarPickerDelegate(this, context, attributeSet, i, i2);
    }

    @Override // android.view.View
    public void autofill(AutofillValue autofillValue) {
        if (isEnabled()) {
            if (autofillValue.isDate()) {
                this.mDelegate.updateDate(autofillValue.getDateValue());
                return;
            }
            Log.w(LOG_TAG, autofillValue + " could not be autofilled into " + this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return NearCalendarPicker.class.getName();
    }

    @Override // android.view.View
    public int getAutofillType() {
        return isEnabled() ? 4 : 0;
    }

    @Override // android.view.View
    public AutofillValue getAutofillValue() {
        if (isEnabled()) {
            return AutofillValue.forDate(this.mDelegate.getDate());
        }
        return null;
    }

    public int getDayOfMonth() {
        return this.mDelegate.getDayOfMonth();
    }

    public int getFirstDayOfWeek() {
        return this.mDelegate.getFirstDayOfWeek();
    }

    public long getMaxDate() {
        return this.mDelegate.getMaxDate().getTimeInMillis();
    }

    public long getMinDate() {
        return this.mDelegate.getMinDate().getTimeInMillis();
    }

    public int getMonth() {
        return this.mDelegate.getMonth();
    }

    public int getYear() {
        return this.mDelegate.getYear();
    }

    public void init(int i, int i2, int i3, OnDateChangedListener onDateChangedListener) {
        this.mDelegate.init(i, i2, i3, onDateChangedListener);
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.mDelegate.isEnabled();
    }

    public boolean isYearPickerShowing() {
        return this.mDelegate.isYearPickerIsShow();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mDelegate.onConfigurationChanged(configuration);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.mMaxWidth), View.MeasureSpec.getMode(i)), i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View.BaseSavedState baseSavedState = (View.BaseSavedState) parcelable;
        super.onRestoreInstanceState(baseSavedState.getSuperState());
        this.mDelegate.onRestoreInstanceState(baseSavedState);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return this.mDelegate.onSaveInstanceState(super.onSaveInstanceState());
    }

    public void setCurrentYear() {
        this.mDelegate.setCurrentYear();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.mDelegate.isEnabled() == z) {
            return;
        }
        super.setEnabled(z);
        this.mDelegate.setEnabled(z);
    }

    public void setFirstDayOfWeek(int i) {
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("firstDayOfWeek must be between 1 and 7");
        }
        this.mDelegate.setFirstDayOfWeek(i);
    }

    public void setMaxDate(long j2) {
        this.mDelegate.setMaxDate(j2);
    }

    public void setMinDate(long j2) {
        this.mDelegate.setMinDate(j2);
    }

    public void setOnDateChangedListener(OnDateChangedListener onDateChangedListener) {
        this.mDelegate.setOnDateChangedListener(onDateChangedListener);
    }

    public void setValidationCallback(ValidationCallback validationCallback) {
        this.mDelegate.setValidationCallback(validationCallback);
    }

    public void updateDate(int i, int i2, int i3) {
        this.mDelegate.updateDate(i, i2, i3);
    }

    public NearCalendarPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.datePickerStyle);
    }

    public NearCalendarPicker(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NearCalendarPicker(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearCalendarPicker, i, i2);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.NearCalendarPicker_android_firstDayOfWeek, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.mDelegate = createCalendarUIDelegate(context, attributeSet, i, i2);
        this.mMaxWidth = context.getResources().getDimensionPixelOffset(R$dimen.calendar_picker_max_width);
        if (i3 != 0) {
            setFirstDayOfWeek(i3);
        }
    }
}
