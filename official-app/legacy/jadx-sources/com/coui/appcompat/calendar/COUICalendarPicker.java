package com.coui.appcompat.calendar;

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
import android.view.autofill.AutofillValue;
import android.widget.FrameLayout;
import com.support.calendar.R$dimen;
import com.support.calendar.R$styleable;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class COUICalendarPicker extends FrameLayout {
    public static final String k = "COUICalendarPicker";
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f1627j;

    public static abstract class AbstractDatePickerDelegate implements b {
        public COUICalendarPicker a;
        public Context b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Calendar f1628c;
        public Locale d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f1629e = true;

        public static class SavedState extends View.BaseSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();
            private final long mCurrentTimeMillis;
            private final int mCurrentView;
            private final int mListPosition;
            private final int mListPositionOffset;
            private final long mMaxDate;
            private final long mMinDate;
            private final int mSelectedDay;
            private final int mSelectedMonth;
            private final int mSelectedYear;

            public class a implements Parcelable.Creator<SavedState> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            public long getCurrentTimeMillis() {
                return this.mCurrentTimeMillis;
            }

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
                parcel.writeLong(this.mCurrentTimeMillis);
            }

            public SavedState(Parcelable parcelable, int i, int i2, int i3, long j2, long j3) {
                this(parcelable, i, i2, i3, j2, j3, 0, 0, 0, 0L);
            }

            public SavedState(Parcelable parcelable, int i, int i2, int i3, long j2, long j3, int i4, int i5, int i6, long j4) {
                super(parcelable);
                this.mSelectedYear = i;
                this.mSelectedMonth = i2;
                this.mSelectedDay = i3;
                this.mMinDate = j2;
                this.mMaxDate = j3;
                this.mCurrentView = i4;
                this.mListPosition = i5;
                this.mListPositionOffset = i6;
                this.mCurrentTimeMillis = j4;
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
                this.mCurrentTimeMillis = parcel.readLong();
            }
        }

        public AbstractDatePickerDelegate(COUICalendarPicker cOUICalendarPicker, Context context) {
            this.a = cOUICalendarPicker;
            this.b = context;
            e(Locale.getDefault());
        }

        @Override // com.coui.appcompat.calendar.COUICalendarPicker.b
        public void a(d dVar) {
        }

        @Override // com.coui.appcompat.calendar.COUICalendarPicker.b
        public void b(boolean z) {
            this.f1629e = z;
        }

        public String c() {
            return DateUtils.formatDateTime(this.b, this.f1628c.getTimeInMillis(), 22);
        }

        public void d(Locale locale) {
        }

        public void e(Locale locale) {
            if (locale.equals(this.d)) {
                return;
            }
            this.d = locale;
            d(locale);
        }

        @Override // com.coui.appcompat.calendar.COUICalendarPicker.b
        public long getDate() {
            return this.f1628c.getTimeInMillis();
        }

        @Override // com.coui.appcompat.calendar.COUICalendarPicker.b
        public void setAutoFillChangeListener(c cVar) {
        }

        @Override // com.coui.appcompat.calendar.COUICalendarPicker.b
        public void setOnDateChangedListener(c cVar) {
        }

        @Override // com.coui.appcompat.calendar.COUICalendarPicker.b
        public void updateDate(long j2) {
            Calendar calendar = Calendar.getInstance(this.d);
            calendar.setTimeInMillis(j2);
            updateDate(calendar.get(1), calendar.get(2), calendar.get(5));
        }
    }

    public interface b {
        void a(d dVar);

        void b(boolean z);

        long getDate();

        int getDayOfMonth();

        int getFirstDayOfWeek();

        Calendar getMaxDate();

        Calendar getMinDate();

        int getMonth();

        int getYear();

        boolean isEnabled();

        void onConfigurationChanged(Configuration configuration);

        void onRestoreInstanceState(Parcelable parcelable);

        Parcelable onSaveInstanceState(Parcelable parcelable);

        void setAutoFillChangeListener(c cVar);

        void setEnabled(boolean z);

        void setFirstDayOfWeek(int i);

        void setMaxDate(long j2);

        void setMinDate(long j2);

        void setOnDateChangedListener(c cVar);

        void updateDate(int i, int i2, int i3);

        void updateDate(long j2);
    }

    public interface c {
    }

    public interface d {
    }

    public COUICalendarPicker(Context context) {
        this(context, null);
    }

    public final b a(Context context, AttributeSet attributeSet, int i, int i2) {
        return new com.coui.appcompat.calendar.a(this, context, attributeSet, i, i2);
    }

    @Override // android.view.View
    public void autofill(AutofillValue autofillValue) {
        if (isEnabled()) {
            if (autofillValue.isDate()) {
                this.i.updateDate(autofillValue.getDateValue());
                return;
            }
            Log.w(k, autofillValue + " could not be autofilled into " + this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return COUICalendarPicker.class.getName();
    }

    @Override // android.view.View
    public int getAutofillType() {
        return isEnabled() ? 4 : 0;
    }

    @Override // android.view.View
    public AutofillValue getAutofillValue() {
        if (isEnabled()) {
            return AutofillValue.forDate(this.i.getDate());
        }
        return null;
    }

    public int getDayOfMonth() {
        return this.i.getDayOfMonth();
    }

    public int getFirstDayOfWeek() {
        return this.i.getFirstDayOfWeek();
    }

    public long getMaxDate() {
        return this.i.getMaxDate().getTimeInMillis();
    }

    public long getMinDate() {
        return this.i.getMinDate().getTimeInMillis();
    }

    public int getMonth() {
        return this.i.getMonth();
    }

    public int getYear() {
        return this.i.getYear();
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.i.isEnabled();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.i.onConfigurationChanged(configuration);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f1627j), View.MeasureSpec.getMode(i)), i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View.BaseSavedState baseSavedState = (View.BaseSavedState) parcelable;
        super.onRestoreInstanceState(baseSavedState.getSuperState());
        this.i.onRestoreInstanceState(baseSavedState);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return this.i.onSaveInstanceState(super.onSaveInstanceState());
    }

    public void setCurrentItemAnimate(boolean z) {
        this.i.b(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.i.isEnabled() == z) {
            return;
        }
        super.setEnabled(z);
        this.i.setEnabled(z);
    }

    public void setFirstDayOfWeek(int i) {
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("firstDayOfWeek must be between 1 and 7");
        }
        this.i.setFirstDayOfWeek(i);
    }

    public void setMaxDate(long j2) {
        this.i.setMaxDate(j2);
    }

    public void setMinDate(long j2) {
        this.i.setMinDate(j2);
    }

    public void setOnDateChangedListener(c cVar) {
        this.i.setOnDateChangedListener(cVar);
    }

    public void setValidationCallback(d dVar) {
        this.i.a(dVar);
    }

    public COUICalendarPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.datePickerStyle);
    }

    public COUICalendarPicker(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public COUICalendarPicker(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUICalendarPicker, i, i2);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.COUICalendarPicker_android_firstDayOfWeek, 1);
        typedArrayObtainStyledAttributes.recycle();
        this.i = a(context, attributeSet, i, i2);
        this.f1627j = context.getResources().getDimensionPixelOffset(R$dimen.calendar_picker_max_width);
        if (i3 != 0) {
            setFirstDayOfWeek(i3);
        }
    }
}
