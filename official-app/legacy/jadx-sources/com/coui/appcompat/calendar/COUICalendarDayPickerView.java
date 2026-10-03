package com.coui.appcompat.calendar;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.oplus.aiunit.vision.bg2;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.vj2;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.appcompat.R$attr;
import com.support.calendar.R$id;
import com.support.calendar.R$layout;
import com.support.calendar.R$style;
import com.support.calendar.R$styleable;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes13.dex */
public class COUICalendarDayPickerView extends ViewGroup {
    public static final int A = R$layout.coui_calendar_picker_content_material;
    public static final DateFormat B = new SimpleDateFormat("MM/dd/yyyy");
    public final Calendar i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Calendar f1623j;
    public final Calendar k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ViewPager f1624l;
    public Field m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageButton f1625n;
    public ImageButton o;
    public final COUICalendarDayPagerAdapter p;
    public Calendar q;
    public TextView r;
    public boolean s;
    public d t;
    public bg2 u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final ViewPager.OnPageChangeListener y;
    public final View.OnClickListener z;

    public class a implements COUICalendarDayPagerAdapter.b {
        public a() {
        }

        @Override // com.coui.appcompat.calendar.COUICalendarDayPagerAdapter.b
        public void a(COUICalendarDayPagerAdapter cOUICalendarDayPagerAdapter, Calendar calendar) {
            if (COUICalendarDayPickerView.this.t != null) {
                COUICalendarDayPickerView.this.t.a(COUICalendarDayPickerView.this, calendar);
            }
        }
    }

    public class b implements ViewPager.OnPageChangeListener {
        public int i;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            double d = f;
            if (d > 0.99d || d < 0.01d) {
                return;
            }
            COUICalendarDayPickerView.this.s = false;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            ArrayList<COUIDateMonthView> currentView = COUICalendarDayPickerView.this.p.getCurrentView();
            if (currentView.size() >= 3) {
                if (COUICalendarDayPickerView.this.s) {
                    COUIDateMonthView cOUIDateMonthView = currentView.get(1);
                    if (COUICalendarDayPickerView.this.r != null) {
                        COUICalendarDayPickerView.this.r.setText(cOUIDateMonthView.getMonthYearLabel());
                    }
                } else {
                    for (int i2 = 0; i2 < currentView.size(); i2++) {
                        COUIDateMonthView cOUIDateMonthView2 = currentView.get(i2);
                        if (((i2 == 0 && i - this.i <= 0) || (i2 == 2 && i - this.i > 0)) && COUICalendarDayPickerView.this.r != null) {
                            COUICalendarDayPickerView.this.r.setText(cOUIDateMonthView2.getMonthYearLabel());
                        }
                    }
                }
            } else if (currentView.size() == 2) {
                COUIDateMonthView cOUIDateMonthView3 = currentView.get(!COUICalendarDayPickerView.this.s ? 1 : 0);
                if (cOUIDateMonthView3.getMonthYearLabel().contains(String.valueOf(COUICalendarDayPickerView.this.k.get(1)))) {
                    cOUIDateMonthView3 = currentView.get(COUICalendarDayPickerView.this.s ? 1 : 0);
                }
                if (COUICalendarDayPickerView.this.r != null) {
                    COUICalendarDayPickerView.this.r.setText(cOUIDateMonthView3.getMonthYearLabel());
                }
            }
            COUICalendarDayPickerView.this.v(i);
            this.i = i;
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            byte b;
            if (view == COUICalendarDayPickerView.this.f1625n) {
                b = -1;
            } else {
                if (view != COUICalendarDayPickerView.this.o) {
                    SensorsDataAutoTrackHelper.trackViewOnClick(view);
                    return;
                }
                b = 1;
            }
            COUICalendarDayPickerView.this.s = true;
            if (b == -1) {
                COUICalendarDayPickerView.this.f1624l.arrowScroll(17);
            } else {
                COUICalendarDayPickerView.this.f1624l.arrowScroll(66);
            }
            COUICalendarDayPickerView.this.u.a(300);
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public interface d {
        void a(COUICalendarDayPickerView cOUICalendarDayPickerView, Calendar calendar);
    }

    public COUICalendarDayPickerView(Context context) {
        this(context, null);
    }

    public static boolean s(String str, Calendar calendar) {
        if (str != null && !str.isEmpty()) {
            try {
                calendar.setTime(B.parse(str));
                return true;
            } catch (ParseException unused) {
            }
        }
        return false;
    }

    public CharSequence getAdapterTitle() {
        return this.p.getPageTitle(0);
    }

    public long getCurrentTimeMillis() {
        if (this.p.getCurrentView().size() > 1) {
            return this.p.getCurrentView().get(1).getTimeMillis();
        }
        return 0L;
    }

    public long getDate() {
        return this.i.getTimeInMillis();
    }

    public int getDayOfWeekTextAppearance() {
        return this.p.getDayOfWeekTextAppearance();
    }

    public int getDayTextAppearance() {
        return this.p.getDayTextAppearance();
    }

    public int getFirstDayOfWeek() {
        return this.p.getFirstDayOfWeek();
    }

    public long getMaxDate() {
        return this.k.getTimeInMillis();
    }

    public long getMinDate() {
        return this.f1623j.getTimeInMillis();
    }

    public int getMostVisiblePosition() {
        return this.f1624l.getCurrentItem();
    }

    public final void l() {
        this.f1624l.setAdapter(this.p);
        this.f1624l.setOnPageChangeListener(this.y);
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            bg2 bg2Var = new bg2(this.f1624l.getContext());
            this.u = bg2Var;
            declaredField.set(this.f1624l, bg2Var);
        } catch (Exception unused) {
            Log.d("CalendarDayPickerView", "set scroller failed.");
        }
        try {
            Field declaredField2 = ViewPager.class.getDeclaredField("mFirstLayout");
            this.m = declaredField2;
            declaredField2.setAccessible(true);
        } catch (Exception unused2) {
            Log.d("CalendarDayPickerView", "get firstLayout failed.");
        }
    }

    public final int m(Calendar calendar, Calendar calendar2) {
        return (calendar2.get(2) - calendar.get(2)) + ((calendar2.get(1) - calendar.get(1)) * 12);
    }

    public final int n(long j2) {
        return vj2.a(m(this.f1623j, o(j2)), 0, m(this.f1623j, this.k));
    }

    public final Calendar o(long j2) {
        if (this.q == null) {
            this.q = Calendar.getInstance();
        }
        this.q.setTimeInMillis(j2);
        return this.q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1624l.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        ViewPager viewPager = this.f1624l;
        measureChild(viewPager, i, i2);
        setMeasuredDimension(viewPager.getMeasuredWidthAndState(), viewPager.getMeasuredHeightAndState());
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        requestLayout();
    }

    public boolean p() {
        return this.w;
    }

    public boolean q() {
        return this.v;
    }

    public void r() {
        this.p.setRange(this.f1623j, this.k);
        u(this.i.getTimeInMillis(), false, false);
    }

    public void setClick(boolean z) {
        this.s = z;
    }

    public void setDate(long j2) {
        t(j2, false);
    }

    public void setDayOfWeekTextAppearance(int i) {
        this.p.setDayOfWeekTextAppearance(i);
    }

    public void setDayTextAppearance(int i) {
        this.p.setDayTextAppearance(i);
    }

    public void setFirstDayOfWeek(int i) {
        this.p.setFirstDayOfWeek(i);
    }

    public void setMaxDate(long j2) {
        this.k.setTimeInMillis(j2);
        r();
    }

    public void setMinDate(long j2) {
        this.f1623j.setTimeInMillis(j2);
        r();
    }

    public void setMonthView(TextView textView) {
        this.r = textView;
    }

    public void setNextButton(ImageButton imageButton) {
        this.o = imageButton;
        imageButton.setSoundEffectsEnabled(false);
        this.o.setOnClickListener(this.z);
    }

    public void setOnDaySelectedListener(d dVar) {
        this.t = dVar;
    }

    public void setPosition(int i) {
        this.f1624l.setCurrentItem(i, false);
    }

    public void setPrevButton(ImageButton imageButton) {
        this.f1625n = imageButton;
        imageButton.setSoundEffectsEnabled(false);
        this.f1625n.setOnClickListener(this.z);
    }

    public void t(long j2, boolean z) {
        u(j2, z, true);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    public final void u(long j2, boolean z, boolean z2) {
        boolean z3;
        int iN;
        if (j2 >= this.f1623j.getTimeInMillis()) {
            if (j2 > this.k.getTimeInMillis()) {
                j2 = this.k.getTimeInMillis();
            } else {
                z3 = false;
            }
            o(j2);
            if (z2 || z3) {
                this.i.setTimeInMillis(j2);
            }
            setClick(true);
            iN = n(j2);
            if (iN != this.f1624l.getCurrentItem()) {
                this.f1624l.setCurrentItem(iN, z);
            }
            this.p.setSelectedDay(this.q);
        }
        j2 = this.f1623j.getTimeInMillis();
        z3 = true;
        o(j2);
        if (z2) {
            this.i.setTimeInMillis(j2);
        } else {
            this.i.setTimeInMillis(j2);
        }
        setClick(true);
        iN = n(j2);
        if (iN != this.f1624l.getCurrentItem()) {
            this.f1624l.setCurrentItem(iN, z);
        }
        this.p.setSelectedDay(this.q);
    }

    public final void v(int i) {
        boolean z = true;
        this.v = i > 0;
        if (i >= this.p.getCount() - 1 && !this.x) {
            z = false;
        }
        this.w = z;
        ImageButton imageButton = this.f1625n;
        if (imageButton != null) {
            imageButton.setVisibility(this.v ? 0 : 4);
        }
        ImageButton imageButton2 = this.o;
        if (imageButton2 != null) {
            imageButton2.setVisibility(this.w ? 0 : 4);
        }
        this.x = false;
    }

    public COUICalendarDayPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.calendarViewStyle);
    }

    public COUICalendarDayPickerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public COUICalendarDayPickerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        this.i = Calendar.getInstance();
        this.f1623j = Calendar.getInstance();
        this.k = Calendar.getInstance();
        this.w = true;
        this.x = true;
        this.y = new b();
        this.z = new c();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUICalendarView, i, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.COUICalendarView_android_firstDayOfWeek, Calendar.getInstance().get(7));
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.COUICalendarView_android_minDate);
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.COUICalendarView_android_maxDate);
        int i4 = R$style.TextAppearance_Material_Widget_Calendar_Month;
        int i5 = R$style.TextAppearance_Material_Widget_Calendar_DayOfWeek;
        int i6 = R$style.TextAppearance_Material_Widget_Calendar_Day;
        int iB = lh2.b(context, R$attr.couiColorPrimary, 0);
        typedArrayObtainStyledAttributes.recycle();
        COUICalendarDayPagerAdapter cOUICalendarDayPagerAdapter = new COUICalendarDayPagerAdapter(context, R$layout.coui_calendar_picker_month_item_material, R$id.month_view);
        this.p = cOUICalendarDayPagerAdapter;
        cOUICalendarDayPagerAdapter.setMonthTextAppearance(i4);
        cOUICalendarDayPagerAdapter.setDayOfWeekTextAppearance(i5);
        cOUICalendarDayPagerAdapter.setDayTextAppearance(i6);
        cOUICalendarDayPagerAdapter.setDaySelectorColor(iB);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(A, (ViewGroup) this, false);
        while (viewGroup.getChildCount() > 0) {
            View childAt = viewGroup.getChildAt(0);
            viewGroup.removeViewAt(0);
            addView(childAt);
        }
        this.f1624l = (ViewPager) findViewById(R$id.day_picker_view_pager);
        l();
        Calendar calendar = Calendar.getInstance();
        if (!s(string, calendar)) {
            calendar.set(1900, 0, 1);
        }
        long timeInMillis = calendar.getTimeInMillis();
        if (!s(string2, calendar)) {
            calendar.set(2100, 11, 31);
        }
        long timeInMillis2 = calendar.getTimeInMillis();
        if (timeInMillis2 >= timeInMillis) {
            long jB = vj2.b(System.currentTimeMillis(), timeInMillis, timeInMillis2);
            setFirstDayOfWeek(i3);
            setMinDate(timeInMillis);
            setMaxDate(timeInMillis2);
            t(jB, false);
            this.p.setOnDaySelectedListener(new a());
            return;
        }
        throw new IllegalArgumentException("maxDate must be >= minDate");
    }
}
