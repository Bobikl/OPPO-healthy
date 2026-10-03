package com.heytap.nearx.uikit.widget.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.provider.Settings;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.appcompat.content.res.AppCompatResources;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.uikit.R$array;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$string;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.fjc;
import com.oplus.aiunit.vision.gjc;
import com.oplus.aiunit.vision.vhc;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class NearDateTimePicker extends FrameLayout {
    private static final int HOURS_OF_A_DAY = 23;
    private static final int HOURS_OF_HALF_DAY = 12;
    private static final int LEAPYEAR_STEP_FOUR = 4;
    private static final int LEAPYEAR_STEP_FOUR_HUN = 400;
    private static final int LEAPYEAR_STEP_HUN = 100;
    private static final long MILLISECOND_A_DAY = 86400000;
    private static final int MINUTES_OF_A_HOUR = 59;
    private static final int MINUTES_STEP = 5;
    private static final int START_YEAR = 1900;
    private static final String TAG = "ColorTimePicker";
    private static final int TOTAL_YEAR = 100;
    private static final int YEAR_AMOUNT_LEAP = 366;
    private static final int YEAR_AMOUNT_NOT_LEAP = 365;
    private static Date endDate = null;
    private static long startTime = 0;
    private static int todayDate = 0;
    private static int todayIndex = -1;
    private static int todayMonth;
    private static int todayYear;
    private Format f;
    private String[] mAMPM;
    private int mAmPm;
    private int mBackgroundLeft;
    private int mBackgroundRadius;
    private RectF mBackgroundRect;
    private Calendar mCalendar;
    private ViewGroup mColorTimePicker;
    private Context mContext;
    private String[] mDateNames;
    private String[] mDateNamesTemp;
    private String mDay;
    private Calendar mDefaultCalendar;
    private boolean mIsMinuteFiveStep;
    private int mMaxWidth;
    private OnDateTimeChangeListener mOnDateTimeChangeListener;
    private OnTimeChangeListener mOnTimeChangeListener;
    private String mToday;
    private Calendar mTodayCalendar;
    private SimpleDateFormat outformatter;
    private NearNumberPicker pickerAmPm;
    private NearNumberPicker pickerDate;
    private NearNumberPicker pickerHour;
    private NearNumberPicker pickerMinute;
    private String selectedDateUtterance;

    public class Format implements NearNumberPicker.Formatter {
        public Format() {
        }

        @Override // com.heytap.nearx.uikit.widget.picker.NearNumberPicker.Formatter
        public String format(int i) {
            int i2 = i - 1;
            NearDateTimePicker.this.mDateNamesTemp[i2] = NearDateTimePicker.this.getDateYMDW(i);
            if (i == NearDateTimePicker.todayIndex) {
                NearDateTimePicker.this.mDateNames[i2] = NearDateTimePicker.this.mToday;
                return NearDateTimePicker.this.mDateNames[i2];
            }
            if (!Locale.getDefault().getLanguage().equals("zh")) {
                return DateUtils.formatDateTime(NearDateTimePicker.this.getContext(), NearDateTimePicker.endDate.getTime(), 524314);
            }
            return new SimpleDateFormat("MMMdd" + NearDateTimePicker.this.mDay + " E", Locale.getDefault()).format(Long.valueOf(NearDateTimePicker.endDate.getTime()));
        }
    }

    public interface OnDateTimeChangeListener {
        void onDateTimeChange(View view, Calendar calendar);
    }

    public interface OnTimeChangeListener {
        void onTimeChange(Calendar calendar);
    }

    public NearDateTimePicker(Context context) {
        this(context, null);
    }

    private String deduplicate(String str) {
        String strValueOf = String.valueOf(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != str.charAt(i - 1)) {
                strValueOf = strValueOf + cCharAt;
            }
        }
        return strValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Date getDateFromValue(int i) {
        try {
            return this.outformatter.parse(this.mDateNamesTemp[i - 1]);
        } catch (ParseException e2) {
            fjc.c(e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getDateYMDW(int i) {
        endDate.setTime(startTime + (((long) i) * 86400000));
        if (isToday(endDate.getYear() + 1900, endDate.getMonth(), endDate.getDate())) {
            todayIndex = i;
        } else {
            todayIndex = -1;
        }
        return this.outformatter.format(Long.valueOf(endDate.getTime()));
    }

    private int getDaysAmountOfYear(int i) {
        return isLeapYear(i) ? YEAR_AMOUNT_LEAP : YEAR_AMOUNT_NOT_LEAP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean is24Hours() {
        String string = Settings.System.getString(this.mContext.getContentResolver(), "time_12_24");
        return string != null && string.equals("24");
    }

    private boolean isLeapYear(int i) {
        return (i % 4 == 0 && i % 100 != 0) || i % 400 == 0;
    }

    private boolean isToday(int i, int i2, int i3) {
        return i == todayYear && i2 == todayMonth && i3 == todayDate;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0076 A[SYNTHETIC] */
    private void reorderSpinners() {
        String strDeduplicate = deduplicate(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMMMddhm"));
        ViewGroup viewGroup = (ViewGroup) this.pickerDate.getParent();
        viewGroup.removeAllViews();
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (int i = 0; i < strDeduplicate.length(); i++) {
            char cCharAt = strDeduplicate.charAt(i);
            if (cCharAt == 'K') {
                viewGroup.addView(this.pickerHour);
                arrayList.add(b2n.g);
            } else if (cCharAt == 'M') {
                if (!z) {
                    viewGroup.addView(this.pickerDate);
                    arrayList.add("D");
                    z = true;
                }
            } else if (cCharAt == 'a') {
                viewGroup.addView(this.pickerAmPm);
                arrayList.add("a");
            } else if (cCharAt == 'd') {
                if (!z) {
                    viewGroup.addView(this.pickerDate);
                    arrayList.add("D");
                    z = true;
                }
            } else if (cCharAt == 'h') {
                viewGroup.addView(this.pickerHour);
                arrayList.add(b2n.g);
            } else if (cCharAt == 'm') {
                viewGroup.addView(this.pickerMinute);
                arrayList.add(LogFieldKey.MESSAGE_KEY);
            } else if (cCharAt == 'y') {
                if (!z) {
                    viewGroup.addView(this.pickerDate);
                    arrayList.add("D");
                    z = true;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x008f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x00b0, please report this as an issue */
    private void reorderUtterance() {
        this.selectedDateUtterance = "";
        String strDeduplicate = deduplicate(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMMMddhm"));
        boolean z = false;
        for (int i = 0; i < strDeduplicate.length(); i++) {
            char cCharAt = strDeduplicate.charAt(i);
            if (cCharAt == 'K') {
                this.selectedDateUtterance += this.pickerHour.getValue() + this.mContext.getString(R$string.NXcolor_hour);
            } else if (cCharAt == 'M') {
                if (!z) {
                    this.selectedDateUtterance += this.f.format(this.pickerDate.getValue());
                    z = true;
                }
            } else if (cCharAt != 'a') {
                if (cCharAt == 'd') {
                    if (!z) {
                        this.selectedDateUtterance += this.f.format(this.pickerDate.getValue());
                        z = true;
                    }
                } else if (cCharAt == 'h') {
                    this.selectedDateUtterance += this.pickerHour.getValue() + this.mContext.getString(R$string.NXcolor_hour);
                } else if (cCharAt == 'm') {
                    this.selectedDateUtterance += this.pickerMinute.getValue() + this.mContext.getString(R$string.NXcolor_minute);
                } else if (cCharAt == 'y') {
                    if (!z) {
                        this.selectedDateUtterance += this.f.format(this.pickerDate.getValue());
                        z = true;
                    }
                }
            } else if (!is24Hours()) {
                this.selectedDateUtterance += (is24Hours() ? this.mAMPM[0] : this.mAMPM[1]);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!is24Hours()) {
            this.mBackgroundLeft = 0;
        }
        Paint paint = new Paint();
        paint.setColor(this.pickerDate.getBackgroundColor());
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

    public View getColorTimePicker() {
        int i;
        StringBuilder sb;
        Calendar calendar = this.mDefaultCalendar;
        if (calendar != null) {
            i = calendar.get(1);
        } else {
            calendar = this.mTodayCalendar;
            i = calendar.get(1);
        }
        int i2 = i;
        int i3 = calendar.get(2) + 1;
        int i4 = calendar.get(5);
        int i5 = calendar.get(11);
        int i6 = calendar.get(9);
        int i7 = calendar.get(12);
        this.mCalendar.setTimeZone(calendar.getTimeZone());
        this.outformatter.setTimeZone(calendar.getTimeZone());
        int i8 = i3 - 1;
        this.mCalendar.set(i2, i8, i4, i5, i7);
        int daysAmountOfYear = 36500;
        for (int i9 = 0; i9 < 100; i9++) {
            daysAmountOfYear += getDaysAmountOfYear((i2 - 50) + i9);
        }
        int daysAmountOfYear2 = 0;
        for (int i10 = 0; i10 < 50; i10++) {
            daysAmountOfYear2 += getDaysAmountOfYear((i2 - 50) + i10);
        }
        String[] strArr = new String[daysAmountOfYear];
        this.mDateNames = strArr;
        this.mDateNamesTemp = (String[]) strArr.clone();
        if (i3 > 2 && !isLeapYear(i2 - 50) && isLeapYear(i2)) {
            daysAmountOfYear2++;
        }
        if (i3 > 2 && isLeapYear(i2 - 50)) {
            daysAmountOfYear2--;
        }
        int i11 = daysAmountOfYear2;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeZone(calendar.getTimeZone());
        int i12 = daysAmountOfYear;
        calendar2.set(i2, i8, i4, i5, i7);
        if (isLeapYear(i2) && i3 == 2 && i4 == 29) {
            calendar2.add(5, 1);
        }
        calendar2.add(1, -50);
        startTime = calendar2.getTimeInMillis();
        endDate = new Date();
        if (is24Hours()) {
            this.pickerHour.setMaxValue(23);
            this.pickerHour.setMinValue(0);
            this.pickerHour.setTwoDigitFormatter();
            this.pickerAmPm.setVisibility(8);
        } else {
            this.pickerHour.setMaxValue(12);
            this.pickerHour.setMinValue(1);
            this.pickerAmPm.setMaxValue(this.mAMPM.length - 1);
            this.pickerAmPm.setMinValue(0);
            this.pickerAmPm.setDisplayedValues(this.mAMPM);
            this.pickerAmPm.setVisibility(0);
            this.pickerAmPm.setWrapSelectorWheel(false);
        }
        this.pickerHour.setWrapSelectorWheel(true);
        if (is24Hours()) {
            this.pickerHour.setValue(i5);
        } else {
            if (i6 > 0) {
                this.pickerHour.setValue(i5 - 12);
            } else {
                this.pickerHour.setValue(i5);
            }
            this.pickerAmPm.setValue(i6);
            this.mAmPm = i6;
        }
        this.pickerAmPm.setOnValueChangedListener(new NearNumberPicker.OnValueChangeListener() { // from class: com.heytap.nearx.uikit.widget.picker.NearDateTimePicker.1
            @Override // com.heytap.nearx.uikit.widget.picker.NearNumberPicker.OnValueChangeListener
            public void onValueChange(NearNumberPicker nearNumberPicker, int i13, int i14) {
                NearDateTimePicker.this.mAmPm = nearNumberPicker.getValue();
                NearDateTimePicker.this.mCalendar.set(9, nearNumberPicker.getValue());
                if (NearDateTimePicker.this.mOnTimeChangeListener != null) {
                    NearDateTimePicker.this.mOnTimeChangeListener.onTimeChange(NearDateTimePicker.this.mCalendar);
                }
                if (NearDateTimePicker.this.mOnDateTimeChangeListener != null) {
                    OnDateTimeChangeListener onDateTimeChangeListener = NearDateTimePicker.this.mOnDateTimeChangeListener;
                    NearDateTimePicker nearDateTimePicker = NearDateTimePicker.this;
                    onDateTimeChangeListener.onDateTimeChange(nearDateTimePicker, nearDateTimePicker.mCalendar);
                }
            }
        });
        this.pickerAmPm.setOnScrollingStopListener(new NearNumberPicker.OnScrollingStopListener() { // from class: com.heytap.nearx.uikit.widget.picker.NearDateTimePicker.2
            @Override // com.heytap.nearx.uikit.widget.picker.NearNumberPicker.OnScrollingStopListener
            public void onScrollingStop() {
                NearDateTimePicker.this.sendAccessibilityEvent(4);
            }
        });
        this.pickerHour.setOnValueChangedListener(new NearNumberPicker.OnValueChangeListener() { // from class: com.heytap.nearx.uikit.widget.picker.NearDateTimePicker.3
            @Override // com.heytap.nearx.uikit.widget.picker.NearNumberPicker.OnValueChangeListener
            public void onValueChange(NearNumberPicker nearNumberPicker, int i13, int i14) {
                if (NearDateTimePicker.this.is24Hours() || NearDateTimePicker.this.mAmPm == 0) {
                    NearDateTimePicker.this.mCalendar.set(11, nearNumberPicker.getValue());
                } else if (NearDateTimePicker.this.mAmPm == 1) {
                    if (nearNumberPicker.getValue() != 12) {
                        NearDateTimePicker.this.mCalendar.set(11, nearNumberPicker.getValue() + 12);
                    } else {
                        NearDateTimePicker.this.mCalendar.set(11, 0);
                    }
                }
                if (!NearDateTimePicker.this.is24Hours() && nearNumberPicker.getValue() == 12) {
                    NearDateTimePicker nearDateTimePicker = NearDateTimePicker.this;
                    nearDateTimePicker.mAmPm = 1 - nearDateTimePicker.mAmPm;
                    NearDateTimePicker.this.pickerAmPm.setValue(NearDateTimePicker.this.mAmPm);
                }
                if (NearDateTimePicker.this.mOnTimeChangeListener != null) {
                    NearDateTimePicker.this.mOnTimeChangeListener.onTimeChange(NearDateTimePicker.this.mCalendar);
                }
                if (NearDateTimePicker.this.mOnDateTimeChangeListener != null) {
                    OnDateTimeChangeListener onDateTimeChangeListener = NearDateTimePicker.this.mOnDateTimeChangeListener;
                    NearDateTimePicker nearDateTimePicker2 = NearDateTimePicker.this;
                    onDateTimeChangeListener.onDateTimeChange(nearDateTimePicker2, nearDateTimePicker2.mCalendar);
                }
            }
        });
        this.pickerHour.setOnScrollingStopListener(new NearNumberPicker.OnScrollingStopListener() { // from class: com.heytap.nearx.uikit.widget.picker.NearDateTimePicker.4
            @Override // com.heytap.nearx.uikit.widget.picker.NearNumberPicker.OnScrollingStopListener
            public void onScrollingStop() {
                NearDateTimePicker.this.sendAccessibilityEvent(4);
            }
        });
        this.pickerMinute.setMinValue(0);
        if (this.mIsMinuteFiveStep) {
            this.pickerMinute.setMinValue(0);
            this.pickerMinute.setMaxValue(11);
            String[] strArr2 = new String[12];
            int i13 = 0;
            for (int i14 = 12; i13 < i14; i14 = 12) {
                int i15 = i13 * 5;
                if (i15 < 10) {
                    sb = new StringBuilder();
                    sb.append("0");
                    sb.append(i15);
                } else {
                    sb = new StringBuilder();
                    sb.append(i15);
                    sb.append("");
                }
                strArr2[i13] = sb.toString();
                i13++;
            }
            this.pickerMinute.setDisplayedValues(strArr2);
            int i16 = i7 / 5;
            this.pickerMinute.setValue(i16);
            this.mCalendar.set(12, Integer.parseInt(strArr2[i16]));
        } else {
            this.pickerMinute.setMaxValue(59);
            this.pickerMinute.setValue(i7);
        }
        this.pickerMinute.setTwoDigitFormatter();
        this.pickerMinute.setWrapSelectorWheel(true);
        this.pickerMinute.setOnValueChangedListener(new NearNumberPicker.OnValueChangeListener() { // from class: com.heytap.nearx.uikit.widget.picker.NearDateTimePicker.5
            @Override // com.heytap.nearx.uikit.widget.picker.NearNumberPicker.OnValueChangeListener
            public void onValueChange(NearNumberPicker nearNumberPicker, int i17, int i18) {
                if (NearDateTimePicker.this.mIsMinuteFiveStep) {
                    NearDateTimePicker.this.mCalendar.set(12, nearNumberPicker.getValue() * 5);
                } else {
                    NearDateTimePicker.this.mCalendar.set(12, nearNumberPicker.getValue());
                }
                if (NearDateTimePicker.this.mOnTimeChangeListener != null) {
                    NearDateTimePicker.this.mOnTimeChangeListener.onTimeChange(NearDateTimePicker.this.mCalendar);
                }
                if (NearDateTimePicker.this.mOnDateTimeChangeListener != null) {
                    OnDateTimeChangeListener onDateTimeChangeListener = NearDateTimePicker.this.mOnDateTimeChangeListener;
                    NearDateTimePicker nearDateTimePicker = NearDateTimePicker.this;
                    onDateTimeChangeListener.onDateTimeChange(nearDateTimePicker, nearDateTimePicker.mCalendar);
                }
            }
        });
        this.pickerMinute.setOnScrollingStopListener(new NearNumberPicker.OnScrollingStopListener() { // from class: com.heytap.nearx.uikit.widget.picker.NearDateTimePicker.6
            @Override // com.heytap.nearx.uikit.widget.picker.NearNumberPicker.OnScrollingStopListener
            public void onScrollingStop() {
                NearDateTimePicker.this.sendAccessibilityEvent(4);
            }
        });
        this.pickerDate.setMinValue(1);
        this.pickerDate.setMaxValue(i12);
        this.pickerDate.setWrapSelectorWheel(false);
        this.pickerDate.setValue(i11);
        Format format = new Format();
        this.f = format;
        this.pickerDate.setFormatter(format);
        this.pickerDate.setOnValueChangedListener(new NearNumberPicker.OnValueChangeListener() { // from class: com.heytap.nearx.uikit.widget.picker.NearDateTimePicker.7
            @Override // com.heytap.nearx.uikit.widget.picker.NearNumberPicker.OnValueChangeListener
            public void onValueChange(NearNumberPicker nearNumberPicker, int i17, int i18) {
                Date dateFromValue = NearDateTimePicker.this.getDateFromValue(nearNumberPicker.getValue());
                if (dateFromValue != null) {
                    NearDateTimePicker.this.mCalendar.set(2, dateFromValue.getMonth());
                    NearDateTimePicker.this.mCalendar.set(5, dateFromValue.getDate());
                    NearDateTimePicker.this.mCalendar.set(1, dateFromValue.getYear() + 1900);
                    if (NearDateTimePicker.this.mOnTimeChangeListener != null) {
                        NearDateTimePicker.this.mOnTimeChangeListener.onTimeChange(NearDateTimePicker.this.mCalendar);
                    }
                    if (NearDateTimePicker.this.mOnDateTimeChangeListener != null) {
                        OnDateTimeChangeListener onDateTimeChangeListener = NearDateTimePicker.this.mOnDateTimeChangeListener;
                        NearDateTimePicker nearDateTimePicker = NearDateTimePicker.this;
                        onDateTimeChangeListener.onDateTimeChange(nearDateTimePicker, nearDateTimePicker.mCalendar);
                    }
                }
            }
        });
        this.pickerDate.setOnScrollingStopListener(new NearNumberPicker.OnScrollingStopListener() { // from class: com.heytap.nearx.uikit.widget.picker.NearDateTimePicker.8
            @Override // com.heytap.nearx.uikit.widget.picker.NearNumberPicker.OnScrollingStopListener
            public void onScrollingStop() {
                NearDateTimePicker.this.sendAccessibilityEvent(4);
            }
        });
        return this;
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
        reorderUtterance();
        accessibilityEvent.getText().add(this.selectedDateUtterance);
    }

    public void refresh() {
        NearNumberPicker nearNumberPicker = this.pickerDate;
        if (nearNumberPicker != null) {
            nearNumberPicker.refresh();
        }
        NearNumberPicker nearNumberPicker2 = this.pickerHour;
        if (nearNumberPicker2 != null) {
            nearNumberPicker2.refresh();
        }
        NearNumberPicker nearNumberPicker3 = this.pickerMinute;
        if (nearNumberPicker3 != null) {
            nearNumberPicker3.refresh();
        }
        NearNumberPicker nearNumberPicker4 = this.pickerAmPm;
        if (nearNumberPicker4 != null) {
            nearNumberPicker4.refresh();
        }
    }

    public void scrollForceFinished() {
        NearNumberPicker nearNumberPicker = this.pickerDate;
        if (nearNumberPicker != null) {
            nearNumberPicker.scrollForceFinished();
        }
        NearNumberPicker nearNumberPicker2 = this.pickerHour;
        if (nearNumberPicker2 != null) {
            nearNumberPicker2.scrollForceFinished();
        }
        NearNumberPicker nearNumberPicker3 = this.pickerMinute;
        if (nearNumberPicker3 != null) {
            nearNumberPicker3.scrollForceFinished();
        }
        if (this.pickerAmPm == null || is24Hours()) {
            return;
        }
        this.pickerAmPm.scrollForceFinished();
    }

    @Deprecated
    public void setColorTimePicker(int i, Calendar calendar) {
        this.mDefaultCalendar = calendar;
        getColorTimePicker();
    }

    public void setFocusColor(@ColorInt int i) {
        this.pickerDate.setPickerFocusColor(i);
        this.pickerHour.setPickerFocusColor(i);
        this.pickerMinute.setPickerFocusColor(i);
        this.pickerAmPm.setPickerFocusColor(i);
    }

    public void setMinuteStepToFive() {
        this.mIsMinuteFiveStep = true;
    }

    public void setNormalColor(@ColorInt int i) {
        this.pickerDate.setPickerNormalColor(i);
        this.pickerHour.setPickerNormalColor(i);
        this.pickerMinute.setPickerNormalColor(i);
        this.pickerAmPm.setPickerNormalColor(i);
    }

    public void setNormalTextColor(int i) {
        NearNumberPicker nearNumberPicker = this.pickerDate;
        if (nearNumberPicker != null) {
            nearNumberPicker.setNormalTextColor(i);
        }
        NearNumberPicker nearNumberPicker2 = this.pickerHour;
        if (nearNumberPicker2 != null) {
            nearNumberPicker2.setNormalTextColor(i);
        }
        NearNumberPicker nearNumberPicker3 = this.pickerMinute;
        if (nearNumberPicker3 != null) {
            nearNumberPicker3.setNormalTextColor(i);
        }
        NearNumberPicker nearNumberPicker4 = this.pickerAmPm;
        if (nearNumberPicker4 != null) {
            nearNumberPicker4.setNormalTextColor(i);
        }
    }

    public void setOnTimeChangeListener(OnTimeChangeListener onTimeChangeListener) {
        this.mOnTimeChangeListener = onTimeChangeListener;
    }

    public NearDateTimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nxDatePickerStyle);
    }

    public void setOnTimeChangeListener(OnDateTimeChangeListener onDateTimeChangeListener) {
        this.mOnDateTimeChangeListener = onDateTimeChangeListener;
    }

    public NearDateTimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAmPm = -1;
        this.selectedDateUtterance = "";
        vhc.b(this, false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearPickersCommonAttrs, i, 0);
        this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearPickersCommonAttrs_nxPickersMaxWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.mContext = context;
        this.mBackgroundRect = new RectF();
        this.mAMPM = this.mContext.getResources().getStringArray(R$array.NXtheme1_time_picker_ampm);
        this.mToday = this.mContext.getResources().getString(R$string.NXcolor_time_picker_today);
        this.mDay = this.mContext.getResources().getString(R$string.NXcolor_time_picker_day);
        this.mCalendar = Calendar.getInstance();
        Calendar calendar = Calendar.getInstance();
        this.mTodayCalendar = calendar;
        todayYear = calendar.get(1);
        todayMonth = this.mTodayCalendar.get(2);
        todayDate = this.mTodayCalendar.get(5);
        this.outformatter = new SimpleDateFormat("yyyy MMM dd" + this.mDay + " E", Locale.getDefault());
        this.mColorTimePicker = (ViewGroup) LayoutInflater.from(this.mContext).inflate(R$layout.nx_color_time_picker, (ViewGroup) this, true);
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.pickers);
        if (gjc.c()) {
            linearLayout.setBackground(AppCompatResources.getDrawable(context, R$drawable.nx_picker_full_bg));
        }
        this.pickerDate = (NearNumberPicker) this.mColorTimePicker.findViewById(R$id.time_picker_date);
        this.pickerHour = (NearNumberPicker) this.mColorTimePicker.findViewById(R$id.time_picker_hour);
        this.pickerMinute = (NearNumberPicker) this.mColorTimePicker.findViewById(R$id.time_picker_minute);
        this.pickerAmPm = (NearNumberPicker) this.mColorTimePicker.findViewById(R$id.time_picker_ampm);
        this.mBackgroundRadius = context.getResources().getDimensionPixelOffset(R$dimen.nx_selected_background_radius);
        this.mBackgroundLeft = context.getResources().getDimensionPixelOffset(R$dimen.nx_selected_background_horizontal_padding);
        if (!Locale.getDefault().getLanguage().equals("zh") && !Locale.getDefault().getLanguage().equals("en")) {
            this.pickerDate.getLayoutParams().width = getResources().getDimensionPixelOffset(R$dimen.nx_numberPicker_width_biggest);
        }
        reorderSpinners();
        if (this.pickerHour.isAccessibilityEnable()) {
            String string = context.getResources().getString(R$string.nx_picker_talkback_tip);
            NearNumberPicker nearNumberPicker = this.pickerDate;
            if (nearNumberPicker != null) {
                nearNumberPicker.addTalkbackSuffix(string);
            }
            NearNumberPicker nearNumberPicker2 = this.pickerHour;
            if (nearNumberPicker2 != null) {
                nearNumberPicker2.addTalkbackSuffix(context.getResources().getString(R$string.NXcolor_hour) + string);
            }
            NearNumberPicker nearNumberPicker3 = this.pickerMinute;
            if (nearNumberPicker3 != null) {
                nearNumberPicker3.addTalkbackSuffix(context.getResources().getString(R$string.NXcolor_minute) + string);
            }
            NearNumberPicker nearNumberPicker4 = this.pickerAmPm;
            if (nearNumberPicker4 != null) {
                nearNumberPicker4.addTalkbackSuffix(context.getResources().getString(R$string.NXcolor_minute) + string);
            }
        }
        setImportantForAccessibility(1);
    }

    public void setColorTimePicker(Calendar calendar) {
        this.mDefaultCalendar = calendar;
        getColorTimePicker();
    }
}
