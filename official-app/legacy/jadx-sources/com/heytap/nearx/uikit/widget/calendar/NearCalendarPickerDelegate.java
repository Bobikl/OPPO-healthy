package com.heytap.nearx.uikit.widget.calendar;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.media.AudioAttributes;
import android.os.Parcelable;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.PathInterpolator;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.NearRotateView;
import com.oplus.aiunit.vision.thc;
import com.oplus.aiunit.vision.ugc;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class NearCalendarPickerDelegate extends NearCalendarPicker.AbstractDatePickerDelegate {
    private static final int DEFAULT_END_YEAR = 2100;
    private static final int DEFAULT_START_YEAR = 1900;
    private static final long DURATION_OF_DISMISS_ANIMATOR = 150;
    private static final long DURATION_OF_SHOW_ANIMATOR = 280;
    private static final int PICKER_FADE_IN_DELAY = 120;
    private static final int UNINITIALIZED = -1;
    private static final int USE_LOCALE = 0;
    private static final int VIEW_MONTH_DAY = 0;
    private static final int VIEW_YEAR = 1;
    private ViewAnimator mAnimator;
    private ViewGroup mContainer;
    private int mCurrentView;
    private NearCalendarDayPickerView mDayPickerView;
    private ValueAnimator mDisMissAnimator;
    private NearRotateView mExpandButton;
    private int mFirstDayOfWeek;
    private LinearLayout mHeaderMonthLayout;
    private TextView mHeaderMonthView;
    private final Calendar mMaxDate;
    private final Calendar mMinDate;
    private ImageButton mNextButton;
    private final NearCalendarDayPickerView.OnDaySelectedListener mOnDaySelectedListener;
    private final View.OnClickListener mOnHeaderClickListener;
    private final NearCalendarYearView.OnYearSelectedListener mOnYearSelectedListener;
    private ImageButton mPrevButton;
    private ValueAnimator mShowAnimator;
    private final Calendar mTempDate;
    private NearCalendarYearView mYearPickerView;
    private static final int[] ATTRS_TEXT_COLOR = {R.attr.textColor};
    private static final PathInterpolator SHOW_ANIMATOR_INTERPOLATOR = new PathInterpolator(0.3f, 0.0f, 0.1f, 1.0f);
    private static final PathInterpolator DISMISS_ANIMATOR_INTERPOLATOR = new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
    private static final AudioAttributes VIBRATION_ATTRIBUTES = new AudioAttributes.Builder().setContentType(4).setUsage(13).build();

    public NearCalendarPickerDelegate(NearCalendarPicker nearCalendarPicker, Context context, AttributeSet attributeSet, int i, int i2) {
        super(nearCalendarPicker, context);
        this.mCurrentView = -1;
        this.mFirstDayOfWeek = 0;
        NearCalendarDayPickerView.OnDaySelectedListener onDaySelectedListener = new NearCalendarDayPickerView.OnDaySelectedListener() { // from class: com.heytap.nearx.uikit.widget.calendar.NearCalendarPickerDelegate.5
            @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarDayPickerView.OnDaySelectedListener
            public void onDaySelected(NearCalendarDayPickerView nearCalendarDayPickerView, Calendar calendar) {
                if (NearCalendarPickerDelegate.this.mDayPickerView != null) {
                    NearCalendarPickerDelegate.this.mDayPickerView.setClick(true);
                }
                NearCalendarPickerDelegate.this.mCurrentDate.setTimeInMillis(calendar.getTimeInMillis());
                NearCalendarPickerDelegate.this.onDateChanged(true, true);
            }
        };
        this.mOnDaySelectedListener = onDaySelectedListener;
        NearCalendarYearView.OnYearSelectedListener onYearSelectedListener = new NearCalendarYearView.OnYearSelectedListener() { // from class: com.heytap.nearx.uikit.widget.calendar.NearCalendarPickerDelegate.6
            @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarYearView.OnYearSelectedListener
            public void onYearChanged(NearCalendarYearView nearCalendarYearView, int i3, int i4, int i5) {
                if (NearCalendarPickerDelegate.this.mDayPickerView != null) {
                    NearCalendarPickerDelegate.this.mDayPickerView.setClick(true);
                }
                NearCalendarPickerDelegate.this.mCurrentDate.set(1, i3);
                NearCalendarPickerDelegate.this.mCurrentDate.set(2, i4);
                NearCalendarPickerDelegate.this.mCurrentDate.set(5, i5);
                NearCalendarPickerDelegate.this.onDateChanged(true, true);
            }
        };
        this.mOnYearSelectedListener = onYearSelectedListener;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.calendar.NearCalendarPickerDelegate.7
            @Override // android.view.View.OnClickListener
            @SensorsDataInstrumented
            public void onClick(View view) {
                if (NearCalendarPickerDelegate.this.mCurrentView != 0 && NearCalendarPickerDelegate.this.mCurrentView == 1) {
                    NearCalendarPickerDelegate.this.setCurrentView(0, false);
                } else {
                    NearCalendarPickerDelegate.this.setCurrentView(1, false);
                }
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        };
        this.mOnHeaderClickListener = onClickListener;
        Locale locale = this.mCurrentLocale;
        this.mCurrentDate = Calendar.getInstance(locale);
        this.mTempDate = Calendar.getInstance(locale);
        Calendar calendar = Calendar.getInstance(locale);
        this.mMinDate = calendar;
        Calendar calendar2 = Calendar.getInstance(locale);
        this.mMaxDate = calendar2;
        calendar.set(1900, 0, 1);
        calendar2.set(2100, 11, 31);
        TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(attributeSet, R$styleable.NearCalendarPicker, i, i2);
        ViewGroup viewGroup = (ViewGroup) ((LayoutInflater) this.mContext.getSystemService("layout_inflater")).inflate(R$layout.nx_calendar_picker_material, (ViewGroup) this.mDelegator, false);
        this.mContainer = viewGroup;
        viewGroup.setSaveFromParentEnabled(false);
        this.mDelegator.addView(this.mContainer);
        ViewGroup viewGroup2 = (ViewGroup) this.mContainer.findViewById(R$id.date_picker_header);
        this.mExpandButton = (NearRotateView) viewGroup2.findViewById(R$id.expand);
        this.mPrevButton = (ImageButton) viewGroup2.findViewById(R$id.prev);
        this.mNextButton = (ImageButton) viewGroup2.findViewById(R$id.next);
        this.mHeaderMonthView = (TextView) viewGroup2.findViewById(R$id.date_picker_header_month);
        this.mHeaderMonthView.setTextSize(0, (int) ugc.c(context.getResources().getDimensionPixelSize(R$dimen.calendar_picker_month_text_size), context.getResources().getConfiguration().fontScale));
        this.mHeaderMonthView.setText(new SimpleDateFormat(DateFormat.getBestDateTimePattern(context.getResources().getConfiguration().locale, "MMMMy"), context.getResources().getConfiguration().locale).format(this.mCurrentDate.getTime()));
        LinearLayout linearLayout = (LinearLayout) viewGroup2.findViewById(R$id.date_picker_header_month_layout);
        this.mHeaderMonthLayout = linearLayout;
        linearLayout.setOnClickListener(onClickListener);
        this.mExpandButton.setOnClickListener(onClickListener);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.NearCalendarPicker_android_headerMonthTextAppearance, 0);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = this.mContext.obtainStyledAttributes(null, ATTRS_TEXT_COLOR, 0, resourceId);
            typedArrayObtainStyledAttributes2.getColorStateList(0);
            typedArrayObtainStyledAttributes2.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        ViewAnimator viewAnimator = (ViewAnimator) this.mContainer.findViewById(R$id.animator);
        this.mAnimator = viewAnimator;
        NearCalendarDayPickerView nearCalendarDayPickerView = (NearCalendarDayPickerView) viewAnimator.findViewById(R$id.date_picker_day_picker);
        this.mDayPickerView = nearCalendarDayPickerView;
        nearCalendarDayPickerView.setFirstDayOfWeek(this.mFirstDayOfWeek);
        this.mDayPickerView.setMinDate(calendar.getTimeInMillis());
        this.mDayPickerView.setMaxDate(calendar2.getTimeInMillis());
        this.mDayPickerView.setDate(this.mCurrentDate.getTimeInMillis());
        this.mDayPickerView.setOnDaySelectedListener(onDaySelectedListener);
        this.mDayPickerView.setMonthView(this.mHeaderMonthView);
        this.mDayPickerView.setPrevButton(this.mPrevButton);
        this.mDayPickerView.setNextButton(this.mNextButton);
        NearCalendarYearView nearCalendarYearView = (NearCalendarYearView) this.mAnimator.findViewById(R$id.date_picker_year_picker);
        this.mYearPickerView = nearCalendarYearView;
        nearCalendarYearView.setRange(calendar, calendar2);
        this.mYearPickerView.setDate(this.mCurrentDate);
        this.mYearPickerView.setOnYearSelectedListener(onYearSelectedListener);
        configAnimator();
        onLocaleChanged(this.mCurrentLocale);
    }

    private void configAnimator() {
        ValueAnimator valueAnimator = new ValueAnimator();
        this.mShowAnimator = valueAnimator;
        valueAnimator.setFloatValues(0.0f, 1.0f);
        this.mShowAnimator.setDuration(DURATION_OF_SHOW_ANIMATOR);
        this.mShowAnimator.setInterpolator(SHOW_ANIMATOR_INTERPOLATOR);
        this.mShowAnimator.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.calendar.NearCalendarPickerDelegate.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                NearCalendarPickerDelegate.this.mPrevButton.setVisibility(0);
                NearCalendarPickerDelegate.this.mNextButton.setVisibility(0);
            }
        });
        this.mShowAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.calendar.NearCalendarPickerDelegate.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float animatedFraction = valueAnimator2.getAnimatedFraction();
                NearCalendarPickerDelegate.this.mPrevButton.setAlpha(animatedFraction);
                NearCalendarPickerDelegate.this.mNextButton.setAlpha(animatedFraction);
            }
        });
        ValueAnimator valueAnimator2 = new ValueAnimator();
        this.mDisMissAnimator = valueAnimator2;
        valueAnimator2.setFloatValues(0.0f, 1.0f);
        this.mDisMissAnimator.setDuration(150L);
        this.mDisMissAnimator.setInterpolator(DISMISS_ANIMATOR_INTERPOLATOR);
        this.mDisMissAnimator.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.calendar.NearCalendarPickerDelegate.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                NearCalendarPickerDelegate.this.mPrevButton.setVisibility(8);
                NearCalendarPickerDelegate.this.mNextButton.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        this.mDisMissAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.calendar.NearCalendarPickerDelegate.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator3) {
                float animatedFraction = 1.0f - valueAnimator3.getAnimatedFraction();
                NearCalendarPickerDelegate.this.mPrevButton.setAlpha(animatedFraction);
                NearCalendarPickerDelegate.this.mNextButton.setAlpha(animatedFraction);
            }
        });
    }

    public static int getDaysInMonth(int i, int i2) {
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

    private int multiplyAlphaComponent(int i, float f) {
        return (16777215 & i) | (((int) ((((i >> 24) & 255) * f) + 0.5f)) << 24);
    }

    private void onCurrentDateChanged(boolean z) {
        if (z) {
            this.mAnimator.announceForAccessibility(getFormattedCurrentDate());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDateChanged(boolean z, boolean z2) {
        int i = this.mCurrentDate.get(1);
        if (z2 && (this.mOnDateChangedListener != null || this.mAutoFillChangeListener != null)) {
            int i2 = this.mCurrentDate.get(2);
            int i3 = this.mCurrentDate.get(5);
            NearCalendarPicker.OnDateChangedListener onDateChangedListener = this.mOnDateChangedListener;
            if (onDateChangedListener != null) {
                onDateChangedListener.onDateChanged(this.mDelegator, i, i2, i3);
            }
            NearCalendarPicker.OnDateChangedListener onDateChangedListener2 = this.mAutoFillChangeListener;
            if (onDateChangedListener2 != null) {
                onDateChangedListener2.onDateChanged(this.mDelegator, i, i2, i3);
            }
        }
        this.mDayPickerView.setDate(this.mCurrentDate.getTimeInMillis(), true);
        onCurrentDateChanged(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentView(int i, boolean z) {
        if (i == 0) {
            this.mDayPickerView.setDate(this.mCurrentDate.getTimeInMillis());
            if (this.mCurrentView != i) {
                this.mHeaderMonthView.setTextColor(thc.a(this.mContext, R$attr.nxColorPrimaryNeutral));
                this.mExpandButton.setImageTintList(ColorStateList.valueOf(thc.a(this.mContext, R$attr.nxColorSecondNeutral)));
                this.mAnimator.setDisplayedChild(0);
                this.mExpandButton.startCollapseAnimation();
                this.mCurrentView = i;
                this.mDisMissAnimator.cancel();
                this.mShowAnimator.setCurrentFraction(this.mPrevButton.getAlpha());
                this.mShowAnimator.start();
                return;
            }
            return;
        }
        if (i != 1) {
            return;
        }
        this.mYearPickerView.setDate(this.mCurrentDate);
        this.mYearPickerView.post(new Runnable() { // from class: com.heytap.nearx.uikit.widget.calendar.NearCalendarPickerDelegate.8
            @Override // java.lang.Runnable
            public void run() {
                NearCalendarPickerDelegate.this.mYearPickerView.requestFocus();
                NearCalendarPickerDelegate.this.mYearPickerView.clearFocus();
            }
        });
        if (this.mCurrentView != i) {
            TextView textView = this.mHeaderMonthView;
            Context context = this.mContext;
            int i2 = R$attr.nxColorPrimary;
            textView.setTextColor(thc.a(context, i2));
            this.mExpandButton.setImageTintList(ColorStateList.valueOf(thc.a(this.mContext, i2)));
            if (z) {
                this.mAnimator.setDisplayedChild(1);
                this.mPrevButton.setVisibility(8);
                this.mNextButton.setVisibility(8);
                this.mExpandButton.setExpanded(true);
            } else {
                this.mAnimator.postDelayed(new Runnable() { // from class: com.heytap.nearx.uikit.widget.calendar.NearCalendarPickerDelegate.9
                    @Override // java.lang.Runnable
                    public void run() {
                        NearCalendarPickerDelegate.this.mAnimator.setDisplayedChild(1);
                    }
                }, 120L);
                this.mShowAnimator.cancel();
                this.mDisMissAnimator.start();
                this.mExpandButton.startExpandAnimation();
            }
            this.mCurrentView = i;
        }
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public CharSequence getAccessibilityClassName() {
        return NearCalendarPicker.class.getName();
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.AbstractDatePickerDelegate, com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public /* bridge */ /* synthetic */ long getDate() {
        return super.getDate();
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public int getDayOfMonth() {
        return this.mCurrentDate.get(5);
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public int getFirstDayOfWeek() {
        int i = this.mFirstDayOfWeek;
        return i != 0 ? i : this.mCurrentDate.getFirstDayOfWeek();
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public Calendar getMaxDate() {
        return this.mMaxDate;
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public Calendar getMinDate() {
        return this.mMinDate;
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public int getMonth() {
        return this.mCurrentDate.get(2);
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public int getYear() {
        return this.mCurrentDate.get(1);
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public void init(int i, int i2, int i3, NearCalendarPicker.OnDateChangedListener onDateChangedListener) {
        this.mCurrentDate.set(1, i);
        this.mCurrentDate.set(2, i2);
        this.mCurrentDate.set(5, i3);
        onDateChanged(false, false);
        this.mOnDateChangedListener = onDateChangedListener;
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public boolean isEnabled() {
        return this.mContainer.isEnabled();
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public boolean isYearPickerIsShow() {
        return this.mCurrentView == 1;
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public void onConfigurationChanged(Configuration configuration) {
        setCurrentLocale(configuration.locale);
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.AbstractDatePickerDelegate
    public void onLocaleChanged(Locale locale) {
        onCurrentDateChanged(false);
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.AbstractDatePickerDelegate, com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public /* bridge */ /* synthetic */ void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof NearCalendarPicker.AbstractDatePickerDelegate.SavedState) {
            NearCalendarPicker.AbstractDatePickerDelegate.SavedState savedState = (NearCalendarPicker.AbstractDatePickerDelegate.SavedState) parcelable;
            this.mCurrentDate.set(savedState.getSelectedYear(), savedState.getSelectedMonth(), savedState.getSelectedDay());
            this.mMinDate.setTimeInMillis(savedState.getMinDate());
            this.mMaxDate.setTimeInMillis(savedState.getMaxDate());
            onCurrentDateChanged(false);
            int currentView = savedState.getCurrentView();
            setCurrentView(currentView, true);
            int listPosition = savedState.getListPosition();
            if (listPosition != -1) {
                if (currentView == 0) {
                    this.mDayPickerView.setPosition(listPosition);
                } else if (currentView == 1) {
                    savedState.getListPositionOffset();
                }
            }
        }
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public Parcelable onSaveInstanceState(Parcelable parcelable) {
        return new NearCalendarPicker.AbstractDatePickerDelegate.SavedState(parcelable, this.mCurrentDate.get(1), this.mCurrentDate.get(2), this.mCurrentDate.get(5), this.mMinDate.getTimeInMillis(), this.mMaxDate.getTimeInMillis(), this.mCurrentView, this.mCurrentView == 0 ? this.mDayPickerView.getMostVisiblePosition() : -1, -1);
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.AbstractDatePickerDelegate, com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public /* bridge */ /* synthetic */ void setAutoFillChangeListener(NearCalendarPicker.OnDateChangedListener onDateChangedListener) {
        super.setAutoFillChangeListener(onDateChangedListener);
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public void setCurrentYear() {
        this.mYearPickerView.setCurrentYear();
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public void setEnabled(boolean z) {
        this.mContainer.setEnabled(z);
        this.mDayPickerView.setEnabled(z);
        this.mYearPickerView.setEnabled(z);
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public void setFirstDayOfWeek(int i) {
        this.mFirstDayOfWeek = i;
        this.mDayPickerView.setFirstDayOfWeek(i);
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public void setMaxDate(long j2) {
        this.mTempDate.setTimeInMillis(j2);
        if (this.mTempDate.get(1) == this.mMaxDate.get(1) && this.mTempDate.get(6) == this.mMaxDate.get(6)) {
            return;
        }
        if (this.mCurrentDate.after(this.mTempDate)) {
            this.mCurrentDate.setTimeInMillis(j2);
            onDateChanged(false, true);
        }
        this.mMaxDate.setTimeInMillis(j2);
        this.mDayPickerView.setMaxDate(j2);
        this.mYearPickerView.setRange(this.mMinDate, this.mMaxDate);
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public void setMinDate(long j2) {
        this.mTempDate.setTimeInMillis(j2);
        if (this.mTempDate.get(1) == this.mMinDate.get(1) && this.mTempDate.get(6) == this.mMinDate.get(6)) {
            return;
        }
        if (this.mCurrentDate.before(this.mTempDate)) {
            this.mCurrentDate.setTimeInMillis(j2);
            onDateChanged(false, true);
        }
        this.mMinDate.setTimeInMillis(j2);
        this.mDayPickerView.setMinDate(j2);
        this.mYearPickerView.setRange(this.mMinDate, this.mMaxDate);
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.AbstractDatePickerDelegate, com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public /* bridge */ /* synthetic */ void setOnDateChangedListener(NearCalendarPicker.OnDateChangedListener onDateChangedListener) {
        super.setOnDateChangedListener(onDateChangedListener);
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.AbstractDatePickerDelegate, com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public /* bridge */ /* synthetic */ void setValidationCallback(NearCalendarPicker.ValidationCallback validationCallback) {
        super.setValidationCallback(validationCallback);
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.AbstractDatePickerDelegate, com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public /* bridge */ /* synthetic */ void updateDate(long j2) {
        super.updateDate(j2);
    }

    @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarPicker.NearDatePickerDelegate
    public void updateDate(int i, int i2, int i3) {
        this.mCurrentDate.set(1, i);
        this.mCurrentDate.set(2, i2);
        this.mCurrentDate.set(5, i3);
        onDateChanged(false, true);
    }
}
