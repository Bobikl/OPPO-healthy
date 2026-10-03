package com.heytap.nearx.uikit.widget.calendar;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$style;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.aiunit.vision.thc;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes18.dex */
public class NearCalendarDayPickerView extends ViewGroup {
    private static final int DEFAULT_END_YEAR = 2100;
    private static final int DEFAULT_START_YEAR = 1900;
    private final NearCalendarDayPagerAdapter mAdapter;
    private boolean mClick;
    private final Calendar mMaxDate;
    private final Calendar mMinDate;
    private TextView mMonthView;
    private ImageButton mNextButton;
    private final View.OnClickListener mOnClickListener;
    private OnDaySelectedListener mOnDaySelectedListener;
    private final ViewPager.OnPageChangeListener mOnPageChangedListener;
    private ImageButton mPrevButton;
    private NearCalendarViewPagerScroller mScroller;
    private final Calendar mSelectedDay;
    private Calendar mTempCalendar;
    private final ViewPager mViewPager;
    private static final int DEFAULT_LAYOUT = R$layout.nx_calendar_picker_content_material;
    private static final String DATE_FORMAT = "MM/dd/yyyy";
    private static final DateFormat DATE_FORMATTER = new SimpleDateFormat(DATE_FORMAT);

    public interface OnDaySelectedListener {
        void onDaySelected(NearCalendarDayPickerView nearCalendarDayPickerView, Calendar calendar);
    }

    public NearCalendarDayPickerView(Context context) {
        this(context, null);
    }

    private void configViewPager() {
        this.mViewPager.setAdapter(this.mAdapter);
        this.mViewPager.setOnPageChangeListener(this.mOnPageChangedListener);
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            NearCalendarViewPagerScroller nearCalendarViewPagerScroller = new NearCalendarViewPagerScroller(this.mViewPager.getContext());
            this.mScroller = nearCalendarViewPagerScroller;
            declaredField.set(this.mViewPager, nearCalendarViewPagerScroller);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private int getDiffMonths(Calendar calendar, Calendar calendar2) {
        return (calendar2.get(2) - calendar.get(2)) + ((calendar2.get(1) - calendar.get(1)) * 12);
    }

    private int getPositionFromDay(long j2) {
        return NearPickerMathUtils.constrain(getDiffMonths(this.mMinDate, getTempCalendarForTime(j2)), 0, getDiffMonths(this.mMinDate, this.mMaxDate));
    }

    private Calendar getTempCalendarForTime(long j2) {
        if (this.mTempCalendar == null) {
            this.mTempCalendar = Calendar.getInstance();
        }
        this.mTempCalendar.setTimeInMillis(j2);
        return this.mTempCalendar;
    }

    public static boolean parseDate(String str, Calendar calendar) {
        if (str != null && !str.isEmpty()) {
            try {
                calendar.setTime(DATE_FORMATTER.parse(str));
                return true;
            } catch (ParseException unused) {
            }
        }
        return false;
    }

    private void updateButtonVisibility(int i) {
        boolean z = i > 0;
        boolean z2 = i < this.mAdapter.getCount() - 1;
        ImageButton imageButton = this.mPrevButton;
        if (imageButton != null) {
            imageButton.setVisibility(z ? 0 : 4);
        }
        ImageButton imageButton2 = this.mNextButton;
        if (imageButton2 != null) {
            imageButton2.setVisibility(z2 ? 0 : 4);
        }
    }

    public CharSequence getAdapterTitle() {
        return this.mAdapter.getPageTitle(0);
    }

    public boolean getBoundsForDate(long j2, Rect rect) {
        if (getPositionFromDay(j2) != this.mViewPager.getCurrentItem()) {
            return false;
        }
        this.mTempCalendar.setTimeInMillis(j2);
        return this.mAdapter.getBoundsForDate(this.mTempCalendar, rect);
    }

    public long getDate() {
        return this.mSelectedDay.getTimeInMillis();
    }

    public int getDayOfWeekTextAppearance() {
        return this.mAdapter.getDayOfWeekTextAppearance();
    }

    public int getDayTextAppearance() {
        return this.mAdapter.getDayTextAppearance();
    }

    public int getFirstDayOfWeek() {
        return this.mAdapter.getFirstDayOfWeek();
    }

    public long getMaxDate() {
        return this.mMaxDate.getTimeInMillis();
    }

    public long getMinDate() {
        return this.mMinDate.getTimeInMillis();
    }

    public int getMostVisiblePosition() {
        return this.mViewPager.getCurrentItem();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.mViewPager.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        ViewPager viewPager = this.mViewPager;
        measureChild(viewPager, i, i2);
        setMeasuredDimension(viewPager.getMeasuredWidthAndState(), viewPager.getMeasuredHeightAndState());
    }

    public void onRangeChanged() {
        this.mAdapter.setRange(this.mMinDate, this.mMaxDate);
        setDate(this.mSelectedDay.getTimeInMillis(), false, false);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        requestLayout();
    }

    public void setClick(boolean z) {
        this.mClick = z;
    }

    public void setDate(long j2) {
        setDate(j2, false);
    }

    public void setDayOfWeekTextAppearance(int i) {
        this.mAdapter.setDayOfWeekTextAppearance(i);
    }

    public void setDayTextAppearance(int i) {
        this.mAdapter.setDayTextAppearance(i);
    }

    public void setFirstDayOfWeek(int i) {
        this.mAdapter.setFirstDayOfWeek(i);
    }

    public void setMaxDate(long j2) {
        this.mMaxDate.setTimeInMillis(j2);
        onRangeChanged();
    }

    public void setMinDate(long j2) {
        this.mMinDate.setTimeInMillis(j2);
        onRangeChanged();
    }

    public void setMonthView(TextView textView) {
        this.mMonthView = textView;
    }

    public void setNextButton(ImageButton imageButton) {
        this.mNextButton = imageButton;
        imageButton.setOnClickListener(this.mOnClickListener);
    }

    public void setOnDaySelectedListener(OnDaySelectedListener onDaySelectedListener) {
        this.mOnDaySelectedListener = onDaySelectedListener;
    }

    public void setPosition(int i) {
        this.mViewPager.setCurrentItem(i, false);
    }

    public void setPrevButton(ImageButton imageButton) {
        this.mPrevButton = imageButton;
        imageButton.setOnClickListener(this.mOnClickListener);
    }

    public NearCalendarDayPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.calendarViewStyle);
    }

    public void setDate(long j2, boolean z) {
        setDate(j2, z, true);
    }

    public NearCalendarDayPickerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    private void setDate(long j2, boolean z, boolean z2) {
        boolean z3 = true;
        if (j2 < this.mMinDate.getTimeInMillis()) {
            j2 = this.mMinDate.getTimeInMillis();
        } else if (j2 > this.mMaxDate.getTimeInMillis()) {
            j2 = this.mMaxDate.getTimeInMillis();
        } else {
            z3 = false;
        }
        getTempCalendarForTime(j2);
        if (z2 || z3) {
            this.mSelectedDay.setTimeInMillis(j2);
        }
        int positionFromDay = getPositionFromDay(j2);
        if (positionFromDay != this.mViewPager.getCurrentItem()) {
            this.mViewPager.setCurrentItem(positionFromDay, z);
        }
        this.mAdapter.setSelectedDay(this.mTempCalendar);
    }

    public NearCalendarDayPickerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        this.mSelectedDay = Calendar.getInstance();
        this.mMinDate = Calendar.getInstance();
        this.mMaxDate = Calendar.getInstance();
        this.mOnPageChangedListener = new ViewPager.OnPageChangeListener() { // from class: com.heytap.nearx.uikit.widget.calendar.NearCalendarDayPickerView.2
            private int mPosition;

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i3) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i3, float f, int i4) {
                double d = f;
                if (d >= 0.99d || d <= 0.01d) {
                    NearCalendarDayPickerView.this.mClick = false;
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i3) {
                ArrayList<NearDateMonthView> currentView = NearCalendarDayPickerView.this.mAdapter.getCurrentView();
                if (currentView.size() >= 3) {
                    if (NearCalendarDayPickerView.this.mClick) {
                        NearDateMonthView nearDateMonthView = currentView.get(1);
                        if (NearCalendarDayPickerView.this.mMonthView != null) {
                            NearCalendarDayPickerView.this.mMonthView.setText(nearDateMonthView.getMonthYearLabel());
                        }
                    } else {
                        for (int i4 = 0; i4 < currentView.size(); i4++) {
                            NearDateMonthView nearDateMonthView2 = currentView.get(i4);
                            if (((i4 == 0 && i3 - this.mPosition <= 0) || (i4 == 2 && i3 - this.mPosition > 0)) && NearCalendarDayPickerView.this.mMonthView != null) {
                                NearCalendarDayPickerView.this.mMonthView.setText(nearDateMonthView2.getMonthYearLabel());
                            }
                        }
                    }
                }
                this.mPosition = i3;
            }
        };
        this.mOnClickListener = new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.calendar.NearCalendarDayPickerView.3
            @Override // android.view.View.OnClickListener
            @SensorsDataInstrumented
            public void onClick(View view) {
                byte b;
                if (view == NearCalendarDayPickerView.this.mPrevButton) {
                    b = -1;
                } else {
                    if (view != NearCalendarDayPickerView.this.mNextButton) {
                        SensorsDataAutoTrackHelper.trackViewOnClick(view);
                        return;
                    }
                    b = 1;
                }
                NearCalendarDayPickerView.this.mClick = true;
                if (b == -1) {
                    NearCalendarDayPickerView.this.mViewPager.arrowScroll(17);
                } else {
                    NearCalendarDayPickerView.this.mViewPager.arrowScroll(66);
                }
                NearCalendarDayPickerView.this.mScroller.setmDuration(300);
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearCalendarView, i, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.NearCalendarView_android_firstDayOfWeek, Calendar.getInstance().get(7));
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.NearCalendarView_android_minDate);
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.NearCalendarView_android_maxDate);
        int i4 = R$style.UikitTextAppearance_Material_Widget_Calendar_Month;
        int i5 = R$style.UikitTextAppearance_Material_Widget_Calendar_DayOfWeek;
        int i6 = R$style.UikitTextAppearance_Material_Widget_Calendar_Day;
        int iB = thc.b(context, R$attr.nxColorPrimary, 0);
        typedArrayObtainStyledAttributes.recycle();
        NearCalendarDayPagerAdapter nearCalendarDayPagerAdapter = new NearCalendarDayPagerAdapter(context, R$layout.nx_calendar_picker_month_item_material, R$id.month_view);
        this.mAdapter = nearCalendarDayPagerAdapter;
        nearCalendarDayPagerAdapter.setMonthTextAppearance(i4);
        nearCalendarDayPagerAdapter.setDayOfWeekTextAppearance(i5);
        nearCalendarDayPagerAdapter.setDayTextAppearance(i6);
        nearCalendarDayPagerAdapter.setDaySelectorColor(iB);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(DEFAULT_LAYOUT, (ViewGroup) this, false);
        while (viewGroup.getChildCount() > 0) {
            View childAt = viewGroup.getChildAt(0);
            viewGroup.removeViewAt(0);
            addView(childAt);
        }
        this.mViewPager = (ViewPager) findViewById(R$id.day_picker_view_pager);
        configViewPager();
        Calendar calendar = Calendar.getInstance();
        if (!parseDate(string, calendar)) {
            calendar.set(1900, 0, 1);
        }
        long timeInMillis = calendar.getTimeInMillis();
        if (!parseDate(string2, calendar)) {
            calendar.set(2100, 11, 31);
        }
        long timeInMillis2 = calendar.getTimeInMillis();
        if (timeInMillis2 >= timeInMillis) {
            long jConstrain = NearPickerMathUtils.constrain(System.currentTimeMillis(), timeInMillis, timeInMillis2);
            setFirstDayOfWeek(i3);
            setMinDate(timeInMillis);
            setMaxDate(timeInMillis2);
            setDate(jConstrain, false);
            this.mAdapter.setOnDaySelectedListener(new NearCalendarDayPagerAdapter.OnDaySelectedListener() { // from class: com.heytap.nearx.uikit.widget.calendar.NearCalendarDayPickerView.1
                @Override // com.heytap.nearx.uikit.widget.calendar.NearCalendarDayPagerAdapter.OnDaySelectedListener
                public void onDaySelected(NearCalendarDayPagerAdapter nearCalendarDayPagerAdapter2, Calendar calendar2) {
                    if (NearCalendarDayPickerView.this.mOnDaySelectedListener != null) {
                        NearCalendarDayPickerView.this.mOnDaySelectedListener.onDaySelected(NearCalendarDayPickerView.this, calendar2);
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("maxDate must be >= minDate");
    }
}
