package com.heytap.nearx.uikit.widget.picker;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import com.heytap.nearx.uikit.R$array;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$string;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.aiunit.vision.vhc;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class NearTimePicker extends FrameLayout {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEFAULT_ENABLED_STATE = true;
    private static final int HOURS_IN_HALF_DAY = 12;
    private static final int LONGPRESS_UPDATE_INTERVAL = 100;
    private static final OnTimeChangedListener NO_OP_CHANGE_LISTENER = new OnTimeChangedListener() { // from class: com.heytap.nearx.uikit.widget.picker.NearTimePicker.1
        @Override // com.heytap.nearx.uikit.widget.picker.NearTimePicker.OnTimeChangedListener
        public void onTimeChanged(NearTimePicker nearTimePicker, int i, int i2) {
        }
    };
    private final Button mAmPmButton;
    private final String[] mAmPmStrings;
    private int mBackgroundLeft;
    private int mBackgroundRadius;
    private RectF mBackgroundRect;
    private Context mContext;
    private Locale mCurrentLocale;
    private TextView mHourText;
    private boolean mIs24HourView;
    private boolean mIsAm;
    private boolean mIsEnabled;
    private int mMaxWidth;
    private TextView mMinuteText;
    private OnTimeChangedListener mOnTimeChangedListener;
    private Calendar mTempCalendar;
    private final NearNumberPicker mTheme1AmPmSpinner;
    private final NearNumberPicker mTheme1HourSpinner;
    private final NearNumberPicker mTheme1MinuteSpinner;

    public interface OnTimeChangedListener {
        void onTimeChanged(NearTimePicker nearTimePicker, int i, int i2);
    }

    public NearTimePicker(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTimeChanged() {
        OnTimeChangedListener onTimeChangedListener = this.mOnTimeChangedListener;
        if (onTimeChangedListener != null) {
            onTimeChangedListener.onTimeChanged(this, getCurrentHour().intValue(), getCurrentMinute().intValue());
        }
    }

    private void reorderSpinners() {
        NearNumberPicker nearNumberPicker;
        if (DateFormat.getBestDateTimePattern(Locale.getDefault(), "hm").startsWith("a") || (nearNumberPicker = this.mTheme1AmPmSpinner) == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) nearNumberPicker.getParent();
        viewGroup.removeView(this.mTheme1AmPmSpinner);
        viewGroup.addView(this.mTheme1AmPmSpinner);
    }

    private void setCurrentLocale(Locale locale) {
        if (locale.equals(this.mCurrentLocale)) {
            return;
        }
        this.mCurrentLocale = locale;
        this.mTempCalendar = Calendar.getInstance(locale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAmPmControl() {
        if (is24HourView()) {
            NearNumberPicker nearNumberPicker = this.mTheme1AmPmSpinner;
            if (nearNumberPicker != null) {
                nearNumberPicker.setVisibility(8);
                return;
            } else {
                this.mAmPmButton.setVisibility(8);
                return;
            }
        }
        int i = !this.mIsAm ? 1 : 0;
        NearNumberPicker nearNumberPicker2 = this.mTheme1AmPmSpinner;
        if (nearNumberPicker2 != null) {
            nearNumberPicker2.setValue(i);
            this.mTheme1AmPmSpinner.setVisibility(0);
        } else {
            this.mAmPmButton.setText(this.mAmPmStrings[i]);
            this.mAmPmButton.setVisibility(0);
        }
    }

    private void updateHourControl() {
        if (is24HourView()) {
            this.mTheme1HourSpinner.setMinValue(0);
            this.mTheme1HourSpinner.setMaxValue(23);
            this.mTheme1HourSpinner.setTwoDigitFormatter();
        } else {
            this.mTheme1HourSpinner.setMinValue(1);
            this.mTheme1HourSpinner.setMaxValue(12);
        }
        this.mTheme1HourSpinner.setWrapSelectorWheel(true);
        this.mTheme1MinuteSpinner.setWrapSelectorWheel(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(this.mTheme1HourSpinner.getBackgroundColor());
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

    @Override // android.view.View
    public int getBaseline() {
        return this.mTheme1HourSpinner.getBaseline();
    }

    public Integer getCurrentHour() {
        int value = this.mTheme1HourSpinner.getValue();
        if (is24HourView()) {
            return Integer.valueOf(value);
        }
        return this.mIsAm ? Integer.valueOf(value % 12) : Integer.valueOf((value % 12) + 12);
    }

    public Integer getCurrentMinute() {
        return Integer.valueOf(this.mTheme1MinuteSpinner.getValue());
    }

    public boolean is24HourView() {
        return this.mIs24HourView;
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), i2);
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        String str;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        String str2 = this.mIsAm ? this.mAmPmStrings[0] : this.mAmPmStrings[1];
        if (this.mIs24HourView) {
            str = getCurrentHour().toString() + this.mContext.getString(R$string.NXcolor_hour) + getCurrentMinute() + this.mContext.getString(R$string.NXcolor_minute);
        } else {
            str = str2 + this.mTheme1HourSpinner.getValue() + this.mContext.getString(R$string.NXcolor_hour) + getCurrentMinute() + this.mContext.getString(R$string.NXcolor_minute);
        }
        accessibilityEvent.getText().add(str);
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
        return new SavedState(super.onSaveInstanceState(), getCurrentHour().intValue(), getCurrentMinute().intValue());
    }

    public void refresh() {
        NearNumberPicker nearNumberPicker = this.mTheme1HourSpinner;
        if (nearNumberPicker != null) {
            nearNumberPicker.refresh();
        }
        NearNumberPicker nearNumberPicker2 = this.mTheme1MinuteSpinner;
        if (nearNumberPicker2 != null) {
            nearNumberPicker2.refresh();
        }
        NearNumberPicker nearNumberPicker3 = this.mTheme1AmPmSpinner;
        if (nearNumberPicker3 != null) {
            nearNumberPicker3.refresh();
        }
    }

    public void scrollForceFinished() {
        NearNumberPicker nearNumberPicker = this.mTheme1HourSpinner;
        if (nearNumberPicker != null) {
            nearNumberPicker.scrollForceFinished();
        }
        NearNumberPicker nearNumberPicker2 = this.mTheme1MinuteSpinner;
        if (nearNumberPicker2 != null) {
            nearNumberPicker2.scrollForceFinished();
        }
        NearNumberPicker nearNumberPicker3 = this.mTheme1AmPmSpinner;
        if (nearNumberPicker3 != null) {
            nearNumberPicker3.scrollForceFinished();
        }
    }

    public void setCurrentHour(Integer num) {
        if (num == null || num == getCurrentHour()) {
            return;
        }
        if (!is24HourView()) {
            if (num.intValue() >= 12) {
                this.mIsAm = false;
                if (num.intValue() > 12) {
                    num = Integer.valueOf(num.intValue() - 12);
                }
            } else {
                this.mIsAm = true;
                if (num.intValue() == 0) {
                    num = 12;
                }
            }
            updateAmPmControl();
        }
        this.mTheme1HourSpinner.setValue(num.intValue());
        onTimeChanged();
    }

    public void setCurrentMinute(Integer num) {
        if (num == null || num.equals(getCurrentMinute())) {
            return;
        }
        this.mTheme1MinuteSpinner.setValue(num.intValue());
        onTimeChanged();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.mIsEnabled == z) {
            return;
        }
        super.setEnabled(z);
        this.mTheme1MinuteSpinner.setEnabled(z);
        this.mTheme1HourSpinner.setEnabled(z);
        NearNumberPicker nearNumberPicker = this.mTheme1AmPmSpinner;
        if (nearNumberPicker != null) {
            nearNumberPicker.setEnabled(z);
        } else {
            this.mAmPmButton.setEnabled(z);
        }
        this.mIsEnabled = z;
    }

    public void setFocusColor(@ColorInt int i) {
        this.mTheme1HourSpinner.setPickerFocusColor(i);
        this.mTheme1MinuteSpinner.setPickerFocusColor(i);
        this.mTheme1AmPmSpinner.setPickerFocusColor(i);
    }

    public void setIs24HourView(Boolean bool) {
        if (this.mIs24HourView == bool.booleanValue()) {
            return;
        }
        int iIntValue = getCurrentHour().intValue();
        this.mIs24HourView = bool.booleanValue();
        updateHourControl();
        setCurrentHour(Integer.valueOf(iIntValue));
        updateAmPmControl();
        this.mTheme1HourSpinner.requestLayout();
    }

    public void setNormalColor(@ColorInt int i) {
        this.mTheme1HourSpinner.setPickerNormalColor(i);
        this.mTheme1MinuteSpinner.setPickerNormalColor(i);
        this.mTheme1AmPmSpinner.setPickerNormalColor(i);
    }

    public void setNormalTextColor(int i) {
        NearNumberPicker nearNumberPicker = this.mTheme1HourSpinner;
        if (nearNumberPicker != null) {
            nearNumberPicker.setNormalTextColor(i);
        }
        NearNumberPicker nearNumberPicker2 = this.mTheme1MinuteSpinner;
        if (nearNumberPicker2 != null) {
            nearNumberPicker2.setNormalTextColor(i);
        }
        NearNumberPicker nearNumberPicker3 = this.mTheme1AmPmSpinner;
        if (nearNumberPicker3 != null) {
            nearNumberPicker3.setNormalTextColor(i);
        }
    }

    public void setOnTimeChangedListener(OnTimeChangedListener onTimeChangedListener) {
        this.mOnTimeChangedListener = onTimeChangedListener;
    }

    public void setRowNumber(int i) {
        NearNumberPicker nearNumberPicker;
        if (i <= 0 || (nearNumberPicker = this.mTheme1HourSpinner) == null || this.mTheme1MinuteSpinner == null || this.mTheme1AmPmSpinner == null) {
            return;
        }
        nearNumberPicker.setPickerRowNumber(i);
        this.mTheme1MinuteSpinner.setPickerRowNumber(i);
        this.mTheme1AmPmSpinner.setPickerRowNumber(i);
    }

    public void setTextVisibility(int i) {
        this.mMinuteText.setVisibility(i);
        this.mHourText.setVisibility(i);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.heytap.nearx.uikit.widget.picker.NearTimePicker.SavedState.1
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
        private final int mHour;
        private final int mMinute;

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

    public NearTimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nxTimePickerStyle);
    }

    public NearTimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIsEnabled = true;
        vhc.b(this, false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearPickersCommonAttrs, i, 0);
        this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearPickersCommonAttrs_nxPickersMaxWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        setCurrentLocale(Locale.getDefault());
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R$layout.nx_time_picker, (ViewGroup) this, true);
        this.mBackgroundRect = new RectF();
        this.mMinuteText = (TextView) findViewById(R$id.theme1_timepicker_minute_text);
        this.mHourText = (TextView) findViewById(R$id.theme1_timepicker_hour_text);
        NearNumberPicker nearNumberPicker = (NearNumberPicker) findViewById(R$id.hour);
        this.mTheme1HourSpinner = nearNumberPicker;
        nearNumberPicker.setOnValueChangedListener(new NearNumberPicker.OnValueChangeListener() { // from class: com.heytap.nearx.uikit.widget.picker.NearTimePicker.2
            @Override // com.heytap.nearx.uikit.widget.picker.NearNumberPicker.OnValueChangeListener
            public void onValueChange(NearNumberPicker nearNumberPicker2, int i2, int i3) {
                NearTimePicker.this.onTimeChanged();
            }
        });
        nearNumberPicker.setOnScrollingStopListener(new NearNumberPicker.OnScrollingStopListener() { // from class: com.heytap.nearx.uikit.widget.picker.NearTimePicker.3
            @Override // com.heytap.nearx.uikit.widget.picker.NearNumberPicker.OnScrollingStopListener
            public void onScrollingStop() {
                NearTimePicker.this.sendAccessibilityEvent(4);
            }
        });
        nearNumberPicker.setUnitText(getResources().getString(R$string.nx_hour_abbreviation));
        this.mMinuteText.setTextAlignment(5);
        this.mHourText.setTextAlignment(5);
        NearNumberPicker nearNumberPicker2 = (NearNumberPicker) findViewById(R$id.minute);
        this.mTheme1MinuteSpinner = nearNumberPicker2;
        nearNumberPicker2.setTwoDigitFormatter();
        nearNumberPicker2.setMinValue(0);
        nearNumberPicker2.setMaxValue(59);
        nearNumberPicker2.setUnitText(getResources().getString(R$string.nx_minute_abbreviation));
        nearNumberPicker2.setOnLongPressUpdateInterval(100L);
        nearNumberPicker2.setOnValueChangedListener(new NearNumberPicker.OnValueChangeListener() { // from class: com.heytap.nearx.uikit.widget.picker.NearTimePicker.4
            @Override // com.heytap.nearx.uikit.widget.picker.NearNumberPicker.OnValueChangeListener
            public void onValueChange(NearNumberPicker nearNumberPicker3, int i2, int i3) {
                NearTimePicker.this.onTimeChanged();
            }
        });
        nearNumberPicker2.setOnScrollingStopListener(new NearNumberPicker.OnScrollingStopListener() { // from class: com.heytap.nearx.uikit.widget.picker.NearTimePicker.5
            @Override // com.heytap.nearx.uikit.widget.picker.NearNumberPicker.OnScrollingStopListener
            public void onScrollingStop() {
                NearTimePicker.this.sendAccessibilityEvent(4);
            }
        });
        String[] stringArray = getContext().getResources().getStringArray(R$array.NXtheme1_time_picker_ampm);
        this.mAmPmStrings = stringArray;
        View viewFindViewById = findViewById(R$id.amPm);
        if (viewFindViewById instanceof Button) {
            this.mTheme1AmPmSpinner = null;
            Button button = (Button) viewFindViewById;
            this.mAmPmButton = button;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.picker.NearTimePicker.6
                @Override // android.view.View.OnClickListener
                @SensorsDataInstrumented
                public void onClick(View view) {
                    view.requestFocus();
                    NearTimePicker nearTimePicker = NearTimePicker.this;
                    nearTimePicker.mIsAm = !nearTimePicker.mIsAm;
                    NearTimePicker.this.updateAmPmControl();
                    SensorsDataAutoTrackHelper.trackViewOnClick(view);
                }
            });
        } else {
            this.mAmPmButton = null;
            NearNumberPicker nearNumberPicker3 = (NearNumberPicker) viewFindViewById;
            this.mTheme1AmPmSpinner = nearNumberPicker3;
            nearNumberPicker3.setMinValue(0);
            nearNumberPicker3.setMaxValue(1);
            nearNumberPicker3.setDisplayedValues(stringArray);
            nearNumberPicker3.setOnValueChangedListener(new NearNumberPicker.OnValueChangeListener() { // from class: com.heytap.nearx.uikit.widget.picker.NearTimePicker.7
                @Override // com.heytap.nearx.uikit.widget.picker.NearNumberPicker.OnValueChangeListener
                public void onValueChange(NearNumberPicker nearNumberPicker4, int i2, int i3) {
                    nearNumberPicker4.requestFocus();
                    NearTimePicker nearTimePicker = NearTimePicker.this;
                    nearTimePicker.mIsAm = !nearTimePicker.mIsAm;
                    NearTimePicker.this.updateAmPmControl();
                    NearTimePicker.this.onTimeChanged();
                }
            });
            nearNumberPicker3.setOnScrollingStopListener(new NearNumberPicker.OnScrollingStopListener() { // from class: com.heytap.nearx.uikit.widget.picker.NearTimePicker.8
                @Override // com.heytap.nearx.uikit.widget.picker.NearNumberPicker.OnScrollingStopListener
                public void onScrollingStop() {
                    NearTimePicker.this.sendAccessibilityEvent(4);
                }
            });
        }
        updateHourControl();
        updateAmPmControl();
        setOnTimeChangedListener(NO_OP_CHANGE_LISTENER);
        setCurrentHour(Integer.valueOf(this.mTempCalendar.get(11)));
        setCurrentMinute(Integer.valueOf(this.mTempCalendar.get(12)));
        if (!isEnabled()) {
            setEnabled(false);
        }
        reorderSpinners();
        if (nearNumberPicker.isAccessibilityEnable()) {
            String string = context.getResources().getString(R$string.nx_picker_talkback_tip);
            nearNumberPicker.addTalkbackSuffix(context.getString(R$string.NXcolor_hour) + string);
            nearNumberPicker2.addTalkbackSuffix(context.getString(R$string.NXcolor_minute) + string);
            NearNumberPicker nearNumberPicker4 = this.mTheme1AmPmSpinner;
            if (nearNumberPicker4 != null) {
                nearNumberPicker4.addTalkbackSuffix(string);
            }
        }
        this.mBackgroundRadius = context.getResources().getDimensionPixelOffset(R$dimen.nx_selected_background_radius);
        this.mBackgroundLeft = context.getResources().getDimensionPixelOffset(R$dimen.nx_selected_background_horizontal_padding);
        setImportantForAccessibility(1);
        this.mContext = context;
    }

    public void setTextVisibility(boolean z) {
        if (z) {
            this.mMinuteText.setVisibility(0);
            this.mHourText.setVisibility(0);
        } else {
            this.mMinuteText.setVisibility(8);
            this.mHourText.setVisibility(8);
        }
    }
}
