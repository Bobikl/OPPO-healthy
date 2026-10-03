package com.heytap.nearx.uikit.widget.calendar;

import android.R;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$string;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.aiunit.vision.thc;
import com.oplus.aiunit.vision.ugc;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class NearDateMonthView extends View implements View.OnFocusChangeListener {
    private static final int DAYS_IN_WEEK = 7;
    private static final int DEFAULT_SELECTED_DAY = -1;
    private static final int DEFAULT_WEEK_START = 1;
    private static final int DURATION_OF_DISMISS_ANIMATOR = 150;
    private static final int DURATION_OF_SELECT_ANIMATOR = 280;
    private static final int MAX_WEEKS_IN_MONTH = 6;
    public static final int MAX_YEAR = 2100;
    private static final int MIN_WEEKS_IN_MONTH = 5;
    public static final int MIN_YEAR = 1900;
    private static final String MONTH_YEAR_FORMAT = "MMMMy";
    private static final int SELECTED_HIGHLIGHT_ALPHA = 176;
    private int mActivatedDay;
    private int mActivatedMonth;
    private final int mBackgroundColor;
    private final Calendar mCalendar;
    private int mCellWidth;
    private ValueAnimator mCircleInAnimator;
    private ValueAnimator mCircleOutAnimator;
    private Paint mCirclePaint;
    private Context mContext;
    private float mCurrentDayStrokeRadius;
    private float mDayCircleRadius;
    private final NumberFormat mDayFormatter;
    private int mDayHeight;
    private final Paint mDayHighlightPaint;
    private final Paint mDayHighlightSelectorPaint;
    private int mDayOfWeekHeight;
    private final String[] mDayOfWeekLabels;
    private final TextPaint mDayOfWeekPaint;
    private int mDayOfWeekStart;
    private final TextPaint mDayPaint;
    private float mDaySelectRadius;
    private final Paint mDaySelectorPaint;
    private ColorStateList mDayTextColor;
    private int mDaysInMonth;
    private final int mDesiredCellWidth;
    private final int mDesiredDayHeight;
    private final int mDesiredDayOfWeekHeight;
    private final int mDesiredDayPadding;
    private final int mDesiredMonthHeight;
    private int mEnabledDayEnd;
    private int mEnabledDayStart;
    private int mHighlightedDay;
    private final int mHintColor;
    private int mInitColor;
    private boolean mIsMaxCol;
    private boolean mIsSelectYear;
    private boolean mIsShowAnimaor;
    private boolean mIsTouchHighlighted;
    private final Locale mLocale;
    private int mMonth;
    private int mMonthHeight;
    private final TextPaint mMonthPaint;
    private int mMonthWidth;
    private String mMonthYearLabel;
    private int mOldMonth;
    private int mOldSelectDay;
    private final Paint mOldSelectorPaint;
    private OnDayClickListener mOnDayClickListener;
    private int mPaddedHeight;
    private int mPaddedWidth;
    private int mPaddingStart;
    private int mPreviouslyHighlightedDay;
    private final int mPrimaryColor;
    private int mToday;
    private final MonthViewTouchHelper mTouchHelper;
    private int mWeekStart;
    private int mYear;
    private static final PathInterpolator SELECT_ANIMATOR_INTERPOLATOR = new PathInterpolator(0.3f, 0.0f, 0.1f, 1.0f);
    private static final PathInterpolator CIRCLE_OUT_ANIMATOR_INTERPOLATOR = new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);

    public class MonthViewTouchHelper extends ExploreByTouchHelper {
        private static final String CN_DATE_FORMAT = "MMMM dd 日 EE";
        private static final String CN_LOCAL = "CN";
        private static final String DATE_FORMAT = "EE dd MMMM";
        private static final String HK_LOCAL = "HK";
        private static final String TW_LOCAL = "TW";
        private final Calendar mTempCalendar;
        private final Rect mTempRect;

        public MonthViewTouchHelper(View view) {
            super(view);
            this.mTempRect = new Rect();
            this.mTempCalendar = Calendar.getInstance();
        }

        private CharSequence getDayDescription(int i) {
            if (!NearDateMonthView.this.isValidDayOfMonth(i)) {
                return "";
            }
            this.mTempCalendar.set(NearDateMonthView.this.mYear, NearDateMonthView.this.mMonth, i);
            return DateFormat.format(isChinese() ? CN_DATE_FORMAT : DATE_FORMAT, this.mTempCalendar.getTimeInMillis());
        }

        private CharSequence getDayText(int i) {
            if (NearDateMonthView.this.isValidDayOfMonth(i)) {
                return NearDateMonthView.this.mDayFormatter.format(i);
            }
            return null;
        }

        private boolean isChinese() {
            String country = NearDateMonthView.this.mContext.getResources().getConfiguration().locale.getCountry();
            if (country != null) {
                return country.equalsIgnoreCase("CN") || country.equalsIgnoreCase("TW") || country.equalsIgnoreCase(HK_LOCAL);
            }
            return false;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f, float f2) {
            int dayAtLocation = NearDateMonthView.this.getDayAtLocation((int) (f + 0.5f), (int) (f2 + 0.5f));
            if (dayAtLocation != -1) {
                return dayAtLocation;
            }
            return Integer.MIN_VALUE;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(List<Integer> list) {
            for (int i = 1; i <= NearDateMonthView.this.mDaysInMonth; i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            return NearDateMonthView.this.onDayClicked(i);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setContentDescription(getDayDescription(i));
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (!NearDateMonthView.this.getBoundsForDay(i, this.mTempRect)) {
                this.mTempRect.setEmpty();
                accessibilityNodeInfoCompat.setContentDescription("");
                accessibilityNodeInfoCompat.setBoundsInParent(this.mTempRect);
                accessibilityNodeInfoCompat.setVisibleToUser(false);
                return;
            }
            accessibilityNodeInfoCompat.setText(getDayText(i));
            accessibilityNodeInfoCompat.setContentDescription(getDayDescription(i));
            accessibilityNodeInfoCompat.setBoundsInParent(this.mTempRect);
            boolean zIsDayEnabled = NearDateMonthView.this.isDayEnabled(i);
            if (zIsDayEnabled) {
                accessibilityNodeInfoCompat.addAction(16);
            }
            accessibilityNodeInfoCompat.setEnabled(zIsDayEnabled);
            if (i == NearDateMonthView.this.mActivatedDay) {
                accessibilityNodeInfoCompat.setChecked(true);
            }
        }
    }

    public interface OnDayClickListener {
        void onDayClick(NearDateMonthView nearDateMonthView, Calendar calendar);
    }

    public interface OnMonthChangeListener {
        void onMonthChange(String str);
    }

    public NearDateMonthView(Context context) {
        this(context, null);
    }

    @SuppressLint({"WrongConstant"})
    private ColorStateList applyTextAppearance(Paint paint, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(null, R$styleable.TextAppearance, 0, i);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.TextAppearance_android_fontFamily);
        if (string != null) {
            paint.setTypeface(Typeface.create(string, 0));
        }
        paint.setTextSize((int) ugc.c(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TextAppearance_android_textSize, (int) paint.getTextSize()), getContext().getResources().getConfiguration().fontScale));
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.TextAppearance_android_textColor);
        if (colorStateList != null) {
            paint.setColor(colorStateList.getColorForState(View.ENABLED_STATE_SET, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return colorStateList;
    }

    private void configAnimator() {
        ValueAnimator valueAnimator = new ValueAnimator();
        this.mCircleInAnimator = valueAnimator;
        valueAnimator.setFloatValues(0.0f, 1.0f);
        this.mCircleInAnimator.setDuration(280L);
        this.mCircleInAnimator.setInterpolator(SELECT_ANIMATOR_INTERPOLATOR);
        this.mCircleInAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.calendar.NearDateMonthView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float animatedFraction = valueAnimator2.getAnimatedFraction();
                NearDateMonthView.this.mDaySelectorPaint.setAlpha((int) (255.0f * animatedFraction));
                NearDateMonthView nearDateMonthView = NearDateMonthView.this;
                nearDateMonthView.mDaySelectRadius = (nearDateMonthView.mDayCircleRadius * 0.8f) + (0.2f * animatedFraction * NearDateMonthView.this.mDayCircleRadius);
                NearDateMonthView.this.invalidate();
                if (animatedFraction == 1.0f) {
                    NearDateMonthView.this.mIsShowAnimaor = false;
                }
            }
        });
        ValueAnimator valueAnimator2 = new ValueAnimator();
        this.mCircleOutAnimator = valueAnimator2;
        valueAnimator2.setFloatValues(0.0f, 1.0f);
        this.mCircleOutAnimator.setDuration(150L);
        this.mCircleOutAnimator.setInterpolator(CIRCLE_OUT_ANIMATOR_INTERPOLATOR);
        this.mCircleOutAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.calendar.NearDateMonthView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator3) {
                NearDateMonthView.this.mOldSelectorPaint.setAlpha((int) ((1.0f - valueAnimator3.getAnimatedFraction()) * 255.0f));
            }
        });
    }

    private void drawDays(Canvas canvas) {
        boolean z;
        int i;
        int i2;
        int colorForState;
        TextPaint textPaint = this.mDayPaint;
        int i3 = this.mMonthHeight + this.mDayOfWeekHeight;
        int i4 = 1;
        boolean z2 = false;
        boolean z3 = (this.mDayOfWeekStart + getDaysInMonth(this.mMonth, this.mYear)) - 1 > 35;
        this.mIsMaxCol = z3;
        int i5 = this.mDayHeight + (z3 ? 0 : this.mDesiredDayPadding);
        int i6 = this.mCellWidth;
        float fAscent = (textPaint.ascent() + textPaint.descent()) / 2.0f;
        int i7 = i3 + (i5 / 2);
        boolean z4 = this.mWeekStart == 2;
        int i8 = 7;
        if (z4) {
            int i9 = this.mDayOfWeekStart;
            if (i9 == 1) {
                this.mDayOfWeekStart = 7;
                z = true;
            } else {
                this.mDayOfWeekStart = i9 - 1;
                z = false;
            }
        } else {
            z = false;
        }
        if (this.mDayOfWeekStart > 1) {
            int i10 = 1;
            while (i10 <= this.mDayOfWeekStart - i4) {
                int i11 = (i6 / 2) + ((i10 - 1) * i6);
                if (NearPickerMathUtils.isLayoutRtl(this)) {
                    i11 = this.mPaddedWidth - i11;
                }
                textPaint.setFakeBoldText(z2);
                textPaint.setColor(this.mHintColor);
                int i12 = this.mMonth;
                canvas.drawText(this.mDayFormatter.format(((i12 == 0 ? getDaysInMonth(11, this.mYear - i4) : getDaysInMonth(i12 - 1, this.mYear)) - this.mDayOfWeekStart) + i10 + i4), i11, i7 - fAscent, textPaint);
                i10++;
                i5 = i5;
                i4 = 1;
                z2 = false;
            }
        }
        int i13 = i5;
        int daysInMonth = ((((this.mIsMaxCol ? 6 : 5) * 7) - getDaysInMonth(this.mMonth, this.mYear)) - this.mDayOfWeekStart) + 1;
        int i14 = (i13 * 4) + i7;
        boolean z5 = this.mIsMaxCol;
        int i15 = i14 + (z5 ? i13 : 0);
        int iFindEndDayOffset = findEndDayOffset(z5);
        int i16 = i15;
        int i17 = 1;
        while (i17 <= daysInMonth) {
            int i18 = (i6 / 2) + (i6 * iFindEndDayOffset);
            if (NearPickerMathUtils.isLayoutRtl(this)) {
                i18 = this.mPaddedWidth - i18;
            }
            textPaint.setColor(this.mHintColor);
            canvas.drawText(this.mDayFormatter.format(i17), i18, i16 - fAscent, textPaint);
            iFindEndDayOffset++;
            if (iFindEndDayOffset == 7) {
                i16 += i13;
                iFindEndDayOffset = 0;
            }
            i17++;
            i8 = 7;
        }
        int i19 = i8;
        if (z4) {
            int i20 = this.mDayOfWeekStart;
            if (i20 == i19 && z) {
                i = 1;
                this.mDayOfWeekStart = 1;
            } else {
                i = 1;
                this.mDayOfWeekStart = i20 + 1;
            }
        } else {
            i = 1;
        }
        int iFindDayOffset = findDayOffset();
        int i21 = i;
        while (i21 <= this.mDaysInMonth) {
            int i22 = (i6 * iFindDayOffset) + (i6 / 2);
            if (NearPickerMathUtils.isLayoutRtl(this)) {
                i22 = this.mPaddedWidth - i22;
            }
            boolean zIsDayEnabled = isDayEnabled(i21);
            int i23 = zIsDayEnabled ? 8 : 0;
            int i24 = (this.mActivatedDay == i21 && this.mIsSelectYear) ? i : 0;
            int i25 = (this.mOldSelectDay == i21 && this.mActivatedMonth == this.mOldMonth && this.mIsShowAnimaor) ? i : 0;
            int i26 = this.mHighlightedDay == i21 ? i : 0;
            if (i24 != 0) {
                i23 |= 32;
                canvas.drawCircle(i22, i7, this.mDaySelectRadius / 2.0f, i26 != 0 ? this.mDayHighlightSelectorPaint : this.mDaySelectorPaint);
            } else if (i26 != 0) {
                i23 |= 16;
                if (zIsDayEnabled) {
                    canvas.drawCircle(i22, i7, this.mDayCircleRadius / 2.0f, this.mDayHighlightPaint);
                }
            } else if (i25 != 0 && zIsDayEnabled) {
                canvas.drawCircle(i22, i7, this.mDayCircleRadius / 2.0f, this.mOldSelectorPaint);
            }
            if ((this.mToday == i21) && i24 == 0) {
                colorForState = this.mPrimaryColor;
                this.mCirclePaint.setColor(colorForState);
                canvas.drawCircle(i22, i7, this.mDayCircleRadius / 2.0f, this.mCirclePaint);
                i2 = 0;
            } else {
                int[] viewState = NearPickerMathUtils.getViewState(i23);
                i2 = 0;
                colorForState = this.mDayTextColor.getColorForState(viewState, 0);
            }
            textPaint.setColor(colorForState);
            canvas.drawText(this.mDayFormatter.format(i21), i22, i7 - fAscent, textPaint);
            iFindDayOffset++;
            if (iFindDayOffset == 7) {
                i7 += i13;
                iFindDayOffset = i2;
            }
            i21++;
            i = 1;
        }
    }

    private void drawDaysOfWeek(Canvas canvas) {
        TextPaint textPaint = this.mDayOfWeekPaint;
        int i = this.mMonthHeight;
        int i2 = this.mDayOfWeekHeight;
        int i3 = this.mCellWidth;
        float fAscent = (textPaint.ascent() + textPaint.descent()) / 2.0f;
        int i4 = i + (i2 / 2);
        for (int i5 = 0; i5 < 7; i5++) {
            int i6 = (i3 * i5) + (i3 / 2);
            if (NearPickerMathUtils.isLayoutRtl(this)) {
                i6 = this.mPaddedWidth - i6;
            }
            canvas.drawText(this.mDayOfWeekLabels[i5], i6, i4 - fAscent, textPaint);
        }
    }

    private void drawMonth(Canvas canvas) {
        canvas.drawText(this.mMonthYearLabel, this.mPaddingStart * 2, (this.mMonthHeight - (this.mMonthPaint.ascent() + this.mMonthPaint.descent())) / 2.0f, this.mMonthPaint);
    }

    private void ensureFocusedDay() {
        if (this.mHighlightedDay != -1) {
            return;
        }
        int i = this.mPreviouslyHighlightedDay;
        if (i != -1) {
            this.mHighlightedDay = i;
            return;
        }
        int i2 = this.mActivatedDay;
        if (i2 != -1) {
            this.mHighlightedDay = i2;
        } else {
            this.mHighlightedDay = 1;
        }
    }

    private int findClosestColumn(Rect rect) {
        if (rect == null) {
            return 3;
        }
        int iCenterX = rect.centerX() - getPaddingLeft();
        int i = this.mCellWidth;
        if (i == 0) {
            return 3;
        }
        int iConstrain = NearPickerMathUtils.constrain(iCenterX / i, 0, 6);
        return NearPickerMathUtils.isLayoutRtl(this) ? (7 - iConstrain) - 1 : iConstrain;
    }

    private int findClosestRow(Rect rect) {
        if (rect == null) {
            return 3;
        }
        int iCenterY = rect.centerY();
        TextPaint textPaint = this.mDayPaint;
        int i = this.mMonthHeight + this.mDayOfWeekHeight;
        int i2 = this.mDayHeight;
        int iRound = Math.round(((int) (iCenterY - ((i + (i2 / 2)) - ((textPaint.ascent() + textPaint.descent()) / 2.0f)))) / i2);
        int iFindDayOffset = findDayOffset() + this.mDaysInMonth;
        return NearPickerMathUtils.constrain(iRound, 0, (iFindDayOffset / 7) - (iFindDayOffset % 7 == 0 ? 1 : 0));
    }

    private int findDayOffset() {
        int i = this.mDayOfWeekStart;
        int i2 = this.mWeekStart;
        int i3 = i - i2;
        return i < i2 ? i3 + 7 : i3;
    }

    private int findEndDayOffset(boolean z) {
        int daysInMonth = ((z ? 6 : 5) * 7) - ((getDaysInMonth(this.mMonth, this.mYear) + this.mDayOfWeekStart) - 1);
        return daysInMonth > 7 ? Math.abs(daysInMonth - 14) : Math.abs(daysInMonth - 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getDayAtLocation(int i, int i2) {
        int i3;
        int paddingTop;
        int paddingLeft = i - getPaddingLeft();
        if (paddingLeft < 0 || paddingLeft >= this.mCellWidth * 7 || (paddingTop = i2 - getPaddingTop()) < (i3 = this.mMonthHeight + this.mDayOfWeekHeight) || paddingTop >= this.mPaddedHeight) {
            return -100;
        }
        if (NearPickerMathUtils.isLayoutRtl(this)) {
            paddingLeft = (this.mCellWidth * 7) - paddingLeft;
        }
        return (((paddingLeft / this.mCellWidth) + (((paddingTop - i3) / (this.mDayHeight + (this.mIsMaxCol ? 0 : this.mDesiredDayPadding))) * 7)) + 1) - findDayOffset();
    }

    private static int getDaysInMonth(int i, int i2) {
        switch (i) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                return 31;
            case 1:
                return i2 % 4 == 0 ? 29 : 28;
            case 3:
            case 5:
            case 8:
            case 10:
                return 30;
            default:
                throw new IllegalArgumentException("Invalid Month");
        }
    }

    @SuppressLint({"WrongConstant"})
    private void initPaints(Resources resources) {
        String string = resources.getString(R$string.calendar_picker_month_typeface);
        String string2 = resources.getString(R$string.calendar_picker_day_of_week_typeface);
        String string3 = resources.getString(R$string.calendar_picker_day_typeface);
        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.calendar_picker_month_text_size);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.calendar_picker_day_of_week_text_size);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R$dimen.calendar_picker_day_text_size);
        int iC = (int) ugc.c(dimensionPixelSize, getContext().getResources().getConfiguration().fontScale);
        int iC2 = (int) ugc.c(dimensionPixelSize2, getContext().getResources().getConfiguration().fontScale);
        int iC3 = (int) ugc.c(dimensionPixelSize3, getContext().getResources().getConfiguration().fontScale);
        this.mMonthPaint.setAntiAlias(true);
        this.mMonthPaint.setTextSize(iC);
        this.mMonthPaint.setTypeface(Typeface.create(string, 0));
        this.mMonthPaint.setTextAlign(Paint.Align.CENTER);
        this.mMonthPaint.setStyle(Paint.Style.FILL);
        this.mDayOfWeekPaint.setAntiAlias(true);
        this.mDayOfWeekPaint.setTextSize(iC2);
        this.mDayOfWeekPaint.setTypeface(Typeface.create(string2, 0));
        this.mDayOfWeekPaint.setTextAlign(Paint.Align.CENTER);
        this.mDayOfWeekPaint.setStyle(Paint.Style.FILL);
        this.mDaySelectorPaint.setAntiAlias(true);
        this.mDaySelectorPaint.setStyle(Paint.Style.FILL);
        this.mOldSelectorPaint.setAntiAlias(true);
        this.mOldSelectorPaint.setStyle(Paint.Style.FILL);
        this.mDayHighlightPaint.setAntiAlias(true);
        this.mDayHighlightPaint.setStyle(Paint.Style.FILL);
        this.mDayHighlightSelectorPaint.setAntiAlias(true);
        this.mDayHighlightSelectorPaint.setStyle(Paint.Style.FILL);
        this.mDayPaint.setAntiAlias(true);
        this.mDayPaint.setTextSize(iC3);
        this.mDayPaint.setTypeface(Typeface.create(string3, 0));
        this.mDayPaint.setTextAlign(Paint.Align.CENTER);
        this.mDayPaint.setStyle(Paint.Style.FILL);
        Paint paint = new Paint();
        this.mCirclePaint = paint;
        paint.setAntiAlias(true);
        this.mCirclePaint.setStyle(Paint.Style.STROKE);
        this.mCirclePaint.setStrokeWidth(this.mCurrentDayStrokeRadius);
        configAnimator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDayEnabled(int i) {
        return i >= this.mEnabledDayStart && i <= this.mEnabledDayEnd;
    }

    private boolean isFirstDayOfWeek(int i) {
        return ((findDayOffset() + i) - 1) % 7 == 0;
    }

    private boolean isLastDayOfWeek(int i) {
        return (findDayOffset() + i) % 7 == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isValidDayOfMonth(int i) {
        return i >= 1 && i <= this.mDaysInMonth;
    }

    private static boolean isValidDayOfWeek(int i) {
        return i >= 1 && i <= 7;
    }

    private static boolean isValidMonth(int i) {
        return i >= 0 && i <= 11;
    }

    private boolean moveOneDay(boolean z) {
        int i;
        int i2;
        ensureFocusedDay();
        if (z) {
            if (!isLastDayOfWeek(this.mHighlightedDay) && (i2 = this.mHighlightedDay) < this.mDaysInMonth) {
                this.mHighlightedDay = i2 + 1;
                return true;
            }
        } else if (!isFirstDayOfWeek(this.mHighlightedDay) && (i = this.mHighlightedDay) > 1) {
            this.mHighlightedDay = i - 1;
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onDayClicked(int i) {
        if (i == this.mActivatedDay) {
            return false;
        }
        this.mIsShowAnimaor = true;
        if (this.mOnDayClickListener != null) {
            Calendar calendar = Calendar.getInstance();
            if (i <= 0) {
                int i2 = this.mMonth;
                if (i2 > 0) {
                    int i3 = this.mYear;
                    calendar.set(i3, i2 - 1, getDaysInMonth(i2 - 1, i3) + i);
                } else {
                    int i4 = this.mYear;
                    calendar.set(i4 - 1, 11, getDaysInMonth(i2, i4 - 1) + i);
                }
            } else if (i > getDaysInMonth(this.mMonth, this.mYear)) {
                int i5 = this.mMonth;
                if (i5 < 11) {
                    int i6 = this.mYear;
                    calendar.set(i6, i5 + 1, i - getDaysInMonth(i5, i6));
                } else {
                    int i7 = this.mYear;
                    calendar.set(i7 + 1, 0, i - getDaysInMonth(i5, i7));
                }
            } else {
                calendar.set(this.mYear, this.mMonth, i);
            }
            if (calendar.get(1) <= 1900 || calendar.get(1) > 2100) {
                return false;
            }
            this.mOnDayClickListener.onDayClick(this, calendar);
        }
        this.mTouchHelper.sendEventForVirtualView(i, 1);
        return true;
    }

    private boolean sameDay(int i, Calendar calendar) {
        return this.mYear == calendar.get(1) && this.mMonth == calendar.get(2) && i == calendar.get(5);
    }

    private void updateDayOfWeekLabels() {
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < 8; i++) {
            arrayList.add(DateUtils.getDayOfWeekString(i, 50));
        }
        for (int i2 = 0; i2 < 7; i2++) {
            this.mDayOfWeekLabels[i2] = (String) arrayList.get(((this.mWeekStart + i2) - 1) % 7);
        }
    }

    private void updateMonthYearLabel() {
        this.mMonthYearLabel = new SimpleDateFormat(DateFormat.getBestDateTimePattern(this.mLocale, MONTH_YEAR_FORMAT), this.mLocale).format(this.mCalendar.getTime());
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.mTouchHelper.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean getBoundsForDay(int i, Rect rect) {
        if (!isValidDayOfMonth(i)) {
            return false;
        }
        int iFindDayOffset = (i - 1) + findDayOffset();
        int i2 = iFindDayOffset % 7;
        int i3 = this.mCellWidth;
        int width = NearPickerMathUtils.isLayoutRtl(this) ? (getWidth() - getPaddingRight()) - ((i2 + 1) * i3) : getPaddingLeft() + (i2 * i3);
        int i4 = iFindDayOffset / 7;
        int i5 = this.mDayHeight + (this.mIsMaxCol ? 0 : this.mDesiredDayPadding);
        int paddingTop = getPaddingTop() + this.mMonthHeight + this.mDayOfWeekHeight + (i4 * i5);
        rect.set(width, paddingTop, i3 + width, i5 + paddingTop);
        return true;
    }

    public int getCellWidth() {
        return this.mCellWidth;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        int i = this.mHighlightedDay;
        if (i > 0) {
            getBoundsForDay(i, rect);
        } else {
            super.getFocusedRect(rect);
        }
    }

    public int getMonthHeight() {
        return this.mMonthHeight;
    }

    public int getMonthWidth() {
        return this.mMonthWidth;
    }

    public String getMonthYearLabel() {
        return this.mMonthYearLabel;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        canvas.translate(paddingLeft, paddingTop);
        drawDaysOfWeek(canvas);
        drawDays(canvas);
        canvas.translate(-paddingLeft, -paddingTop);
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        if (z || this.mIsTouchHighlighted) {
            return;
        }
        this.mPreviouslyHighlightedDay = this.mHighlightedDay;
        this.mHighlightedDay = -1;
        invalidate();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            int iFindDayOffset = findDayOffset();
            if (i == 17) {
                this.mHighlightedDay = Math.min(this.mDaysInMonth, ((findClosestRow(rect) + 1) * 7) - iFindDayOffset);
            } else if (i == 33) {
                int iFindClosestColumn = findClosestColumn(rect);
                int i2 = this.mDaysInMonth;
                int i3 = (iFindClosestColumn - iFindDayOffset) + (((iFindDayOffset + i2) / 7) * 7) + 1;
                if (i3 > i2) {
                    i3 -= 7;
                }
                this.mHighlightedDay = i3;
            } else if (i == 66) {
                int iFindClosestRow = findClosestRow(rect);
                this.mHighlightedDay = iFindClosestRow != 0 ? 1 + ((iFindClosestRow * 7) - iFindDayOffset) : 1;
            } else if (i == 130) {
                int iFindClosestColumn2 = (findClosestColumn(rect) - iFindDayOffset) + 1;
                if (iFindClosestColumn2 < 1) {
                    iFindClosestColumn2 += 7;
                }
                this.mHighlightedDay = iFindClosestColumn2;
            }
            ensureFocusedDay();
            invalidate();
        }
        super.onFocusChanged(z, i, rect);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2;
        int keyCode = keyEvent.getKeyCode();
        boolean zMoveOneDay = false;
        if (keyCode == 61) {
            int i3 = keyEvent.hasNoModifiers() ? 2 : keyEvent.hasModifiers(1) ? 1 : 0;
            if (i3 != 0) {
                ViewParent parent = getParent();
                View viewFocusSearch = this;
                do {
                    viewFocusSearch = viewFocusSearch.focusSearch(i3);
                    if (viewFocusSearch == null || viewFocusSearch == this) {
                        break;
                    }
                } while (viewFocusSearch.getParent() == parent);
                if (viewFocusSearch != null) {
                    viewFocusSearch.requestFocus();
                    return true;
                }
            }
        } else if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                    if (keyEvent.hasNoModifiers()) {
                        ensureFocusedDay();
                        int i4 = this.mHighlightedDay;
                        if (i4 > 7) {
                            this.mHighlightedDay = i4 - 7;
                            zMoveOneDay = true;
                        }
                    }
                    break;
                case 20:
                    if (keyEvent.hasNoModifiers()) {
                        ensureFocusedDay();
                        int i5 = this.mHighlightedDay;
                        if (i5 <= this.mDaysInMonth - 7) {
                            this.mHighlightedDay = i5 + 7;
                            zMoveOneDay = true;
                        }
                    }
                    break;
                case 21:
                    if (keyEvent.hasNoModifiers()) {
                        zMoveOneDay = moveOneDay(NearPickerMathUtils.isLayoutRtl(this));
                    }
                    break;
                case 22:
                    if (keyEvent.hasNoModifiers()) {
                        zMoveOneDay = moveOneDay(!NearPickerMathUtils.isLayoutRtl(this));
                    }
                    break;
                case 23:
                    i2 = this.mHighlightedDay;
                    if (i2 != -1) {
                        onDayClicked(i2);
                        return true;
                    }
                    break;
            }
        } else {
            i2 = this.mHighlightedDay;
            if (i2 != -1) {
                onDayClicked(i2);
                return true;
            }
        }
        if (!zMoveOneDay) {
            return super.onKeyDown(i, keyEvent);
        }
        invalidate();
        return true;
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = getPaddingRight();
            int paddingBottom = getPaddingBottom();
            int i7 = (i5 - paddingRight) - paddingLeft;
            int i8 = (i6 - paddingBottom) - paddingTop;
            if (i7 == this.mPaddedWidth || i8 == this.mPaddedHeight || i7 < 0 || i8 < 0) {
                return;
            }
            this.mPaddedWidth = i7;
            this.mPaddedHeight = i8;
            float measuredHeight = i8 / ((getMeasuredHeight() - paddingTop) - paddingBottom);
            this.mMonthHeight = 0;
            this.mMonthWidth = (int) this.mMonthPaint.measureText(this.mMonthYearLabel);
            this.mDayOfWeekHeight = (int) (this.mDesiredDayOfWeekHeight * measuredHeight);
            this.mDayHeight = (int) (this.mDesiredDayHeight * measuredHeight);
            this.mTouchHelper.invalidateRoot();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingTop = (this.mDesiredDayHeight * 6) + this.mDesiredDayOfWeekHeight + this.mDesiredMonthHeight + getPaddingTop() + getPaddingBottom();
        int iResolveSize = View.resolveSize((this.mDesiredCellWidth * 7) + getPaddingStart() + getPaddingEnd(), i);
        int iResolveSize2 = View.resolveSize(paddingTop, i2);
        this.mCellWidth = ((iResolveSize - getPaddingRight()) - getPaddingLeft()) / 7;
        setMeasuredDimension(iResolveSize, iResolveSize2);
    }

    @Override // android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (isEnabled()) {
            return getDayAtLocation((int) (motionEvent.getX() + 0.5f), (int) (motionEvent.getY() + 0.5f)) >= 0 ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
        }
        return null;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int dayAtLocation;
        int x = (int) (motionEvent.getX() + 0.5f);
        int y = (int) (motionEvent.getY() + 0.5f);
        int action = motionEvent.getAction();
        if (action == 0) {
            dayAtLocation = getDayAtLocation(x, y);
            this.mIsTouchHighlighted = true;
            if (this.mHighlightedDay != dayAtLocation) {
                this.mHighlightedDay = dayAtLocation;
                this.mPreviouslyHighlightedDay = dayAtLocation;
                invalidate();
            }
            if (action != 0 && dayAtLocation == -100) {
                return false;
            }
        } else {
            if (action == 1) {
                int dayAtLocation2 = getDayAtLocation(x, y);
                if (dayAtLocation2 != -100) {
                    onDayClicked(dayAtLocation2);
                }
            } else if (action == 2) {
                dayAtLocation = getDayAtLocation(x, y);
                this.mIsTouchHighlighted = true;
                if (this.mHighlightedDay != dayAtLocation) {
                    this.mHighlightedDay = dayAtLocation;
                    this.mPreviouslyHighlightedDay = dayAtLocation;
                    invalidate();
                }
                if (action != 0) {
                }
            } else if (action == 3) {
            }
            this.mHighlightedDay = -1;
            this.mIsTouchHighlighted = false;
            invalidate();
        }
        return true;
    }

    public void setDayHighlightColor(ColorStateList colorStateList) {
        this.mDayHighlightPaint.setColor(colorStateList.getColorForState(NearPickerMathUtils.getViewState(24), 0));
        invalidate();
    }

    public void setDayOfWeekTextAppearance(int i) {
        applyTextAppearance(this.mDayOfWeekPaint, i);
        invalidate();
    }

    public void setDayOfWeekTextColor(ColorStateList colorStateList) {
        this.mDayOfWeekPaint.setColor(colorStateList.getColorForState(View.ENABLED_STATE_SET, 0));
        invalidate();
    }

    public void setDaySelectorColor(int i) {
        this.mDaySelectorPaint.setColor(i);
        this.mOldSelectorPaint.setColor(i);
        this.mDayHighlightSelectorPaint.setColor(i);
        this.mDayHighlightSelectorPaint.setAlpha(176);
        invalidate();
    }

    public void setDayTextAppearance(int i) {
        ColorStateList colorStateListApplyTextAppearance = applyTextAppearance(this.mDayPaint, i);
        if (colorStateListApplyTextAppearance != null) {
            this.mDayTextColor = colorStateListApplyTextAppearance;
        }
        invalidate();
    }

    public void setDayTextColor(ColorStateList colorStateList) {
        this.mDayTextColor = colorStateList;
        invalidate();
    }

    public void setFirstDayOfWeek(int i) {
        if (isValidDayOfWeek(i)) {
            this.mWeekStart = i;
        } else {
            this.mWeekStart = this.mCalendar.getFirstDayOfWeek();
        }
        updateDayOfWeekLabels();
        this.mTouchHelper.invalidateRoot();
        invalidate();
    }

    public void setMonthParams(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.mActivatedDay = i;
        if (isValidMonth(i2)) {
            this.mMonth = i2;
        }
        this.mYear = i3;
        this.mIsSelectYear = z;
        this.mCalendar.set(2, this.mMonth);
        this.mCalendar.set(1, this.mYear);
        this.mCalendar.set(5, 1);
        this.mDayOfWeekStart = this.mCalendar.get(7);
        if (isValidDayOfWeek(i4)) {
            this.mWeekStart = i4;
        } else {
            this.mWeekStart = this.mCalendar.getFirstDayOfWeek();
        }
        Calendar calendar = Calendar.getInstance();
        this.mToday = -1;
        this.mDaysInMonth = getDaysInMonth(this.mMonth, this.mYear);
        int i7 = 0;
        while (true) {
            int i8 = this.mDaysInMonth;
            if (i7 >= i8) {
                int iConstrain = NearPickerMathUtils.constrain(i5, 1, i8);
                this.mEnabledDayStart = iConstrain;
                this.mEnabledDayEnd = NearPickerMathUtils.constrain(i6, iConstrain, this.mDaysInMonth);
                updateMonthYearLabel();
                updateDayOfWeekLabels();
                this.mTouchHelper.invalidateRoot();
                invalidate();
                return;
            }
            i7++;
            if (sameDay(i7, calendar)) {
                this.mToday = i7;
            }
        }
    }

    public void setMonthTextAlpha(int i) {
        int i2 = this.mInitColor;
        if (Integer.toHexString(i2).length() > 2) {
            this.mMonthPaint.setColor(new ColorStateList(new int[][]{new int[]{16842910}, new int[0]}, new int[]{new BigInteger(Integer.toHexString((i * new BigInteger(Integer.toHexString(i2).substring(0, 2), 16).intValue()) / 255) + Integer.toHexString(i2).substring(2), 16).intValue(), i2}).getColorForState(View.ENABLED_STATE_SET, 0));
            invalidate();
        }
    }

    public void setMonthTextAppearance(int i) {
        applyTextAppearance(this.mMonthPaint, i);
        this.mInitColor = this.mMonthPaint.getColor();
        invalidate();
    }

    public void setMonthTextColor(ColorStateList colorStateList) {
        this.mMonthPaint.setColor(thc.a(getContext(), R$attr.nxColorPrimary));
        invalidate();
    }

    public void setOldDay(int i, int i2) {
        int i3 = this.mActivatedDay;
        if (i3 == -1 || i3 == i) {
            return;
        }
        this.mOldSelectDay = i;
        this.mOldMonth = i2;
    }

    public void setOnDayClickListener(OnDayClickListener onDayClickListener) {
        this.mOnDayClickListener = onDayClickListener;
    }

    public void setSelectedDay(int i, int i2, int i3) {
        this.mActivatedDay = i;
        this.mActivatedMonth = i2;
        this.mIsSelectYear = this.mYear == i3;
        this.mTouchHelper.invalidateRoot();
        this.mCircleInAnimator.start();
        this.mCircleOutAnimator.start();
    }

    public NearDateMonthView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.datePickerStyle);
    }

    public NearDateMonthView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NearDateMonthView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mMonthPaint = new TextPaint();
        this.mDayOfWeekPaint = new TextPaint();
        this.mDayPaint = new TextPaint();
        this.mDaySelectorPaint = new Paint();
        this.mOldSelectorPaint = new Paint();
        this.mDayHighlightPaint = new Paint();
        this.mDayHighlightSelectorPaint = new Paint();
        this.mDayOfWeekLabels = new String[7];
        this.mActivatedDay = -1;
        this.mActivatedMonth = -1;
        this.mOldSelectDay = -1;
        this.mOldMonth = -1;
        this.mToday = -1;
        this.mWeekStart = 1;
        this.mEnabledDayStart = 1;
        this.mEnabledDayEnd = 31;
        this.mHighlightedDay = -1;
        this.mPreviouslyHighlightedDay = -1;
        this.mIsTouchHighlighted = false;
        this.mContext = context;
        Resources resources = context.getResources();
        this.mDesiredMonthHeight = resources.getDimensionPixelSize(R$dimen.calendar_picker_month_height);
        this.mPaddingStart = resources.getDimensionPixelSize(R$dimen.calendar_picker_month_padding_start);
        this.mDesiredDayOfWeekHeight = resources.getDimensionPixelSize(R$dimen.calendar_picker_day_of_week_height);
        this.mDesiredDayHeight = resources.getDimensionPixelSize(R$dimen.calendar_picker_day_height);
        this.mDesiredDayPadding = resources.getDimensionPixelSize(R$dimen.calendar_picker_day_min_col_padding);
        this.mDesiredCellWidth = resources.getDimensionPixelSize(R$dimen.calendar_picker_day_width);
        this.mDayCircleRadius = resources.getDimensionPixelSize(R$dimen.calendar_picker_current_day_radius);
        this.mCurrentDayStrokeRadius = resources.getDimensionPixelSize(R$dimen.calendar_picker_current_day_stroke_radius);
        this.mDaySelectRadius = this.mDayCircleRadius;
        this.mHintColor = thc.a(context, R$attr.nxColorDisabledNeutral);
        this.mPrimaryColor = thc.a(context, R$attr.nxColorPrimary);
        this.mBackgroundColor = thc.a(context, R$attr.nxColorBackground);
        MonthViewTouchHelper monthViewTouchHelper = new MonthViewTouchHelper(this);
        this.mTouchHelper = monthViewTouchHelper;
        ViewCompat.setAccessibilityDelegate(this, monthViewTouchHelper);
        setImportantForAccessibility(1);
        Locale locale = resources.getConfiguration().locale;
        this.mLocale = locale;
        this.mCalendar = Calendar.getInstance(locale);
        this.mDayFormatter = NumberFormat.getIntegerInstance(locale);
        updateMonthYearLabel();
        updateDayOfWeekLabels();
        initPaints(resources);
    }
}
