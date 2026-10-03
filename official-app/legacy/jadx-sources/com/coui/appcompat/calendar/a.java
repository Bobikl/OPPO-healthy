package com.coui.appcompat.calendar;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.media.AudioAttributes;
import android.os.Parcelable;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.annotation.RequiresApi;
import com.coui.appcompat.rotateview.COUIRotateView;
import com.oplus.aiunit.vision.gg2;
import com.oplus.aiunit.vision.hj2;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.sh2;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.appcompat.R$attr;
import com.support.calendar.R$dimen;
import com.support.calendar.R$id;
import com.support.calendar.R$layout;
import com.support.calendar.R$styleable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class a extends COUICalendarPicker.AbstractDatePickerDelegate {
    public ValueAnimator f;
    public ValueAnimator g;
    public ViewGroup h;
    public TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageButton f1635j;
    public ImageButton k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public COUIRotateView f1636l;
    public LinearLayout m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ViewAnimator f1637n;
    public COUICalendarDayPickerView o;
    public COUICalendarYearView p;
    public int q;
    public final Calendar r;
    public final Calendar s;
    public final Calendar t;
    public int u;
    public final SimpleDateFormat v;
    public final COUICalendarDayPickerView.d w;
    public final COUICalendarYearView.b x;
    public final View.OnClickListener y;
    public static final int[] z = {R.attr.textColor};
    public static final PathInterpolator A = new hj2();
    public static final PathInterpolator B = new sh2();
    public static final AudioAttributes C = new AudioAttributes.Builder().setContentType(4).setUsage(13).build();

    /* JADX INFO: renamed from: com.coui.appcompat.calendar.a$a, reason: collision with other inner class name */
    public class C0195a implements Animator.AnimatorListener {
        public C0195a() {
        }

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
            a.this.f1635j.setVisibility(a.this.o.q() ? 0 : 8);
            a.this.k.setVisibility(a.this.o.p() ? 0 : 8);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            a.this.f1635j.setAlpha(animatedFraction);
            a.this.k.setAlpha(animatedFraction);
        }
    }

    public class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f1635j.setVisibility(8);
            a.this.k.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
            a.this.f1635j.setAlpha(animatedFraction);
            a.this.k.setAlpha(animatedFraction);
        }
    }

    public class e implements COUICalendarDayPickerView.d {
        public e() {
        }

        @Override // com.coui.appcompat.calendar.COUICalendarDayPickerView.d
        public void a(COUICalendarDayPickerView cOUICalendarDayPickerView, Calendar calendar) {
            a.this.f1628c.setTimeInMillis(calendar.getTimeInMillis());
            a.this.r(true, true);
        }
    }

    public class f implements COUICalendarYearView.b {
        public f() {
        }

        @Override // com.coui.appcompat.calendar.COUICalendarYearView.b
        public void a(COUICalendarYearView cOUICalendarYearView, int i, int i2, int i3) {
            a.this.f1628c.set(1, i);
            a.this.f1628c.set(2, i2);
            a.this.f1628c.set(5, i3);
            a.this.getClass();
            a.this.getClass();
            a.this.i.setText(a.this.v.format(a.this.f1628c.getTime()));
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            if (a.this.q != 0 && a.this.q == 1) {
                a.this.s(0, false);
            } else {
                a.this.s(1, false);
            }
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.p.requestFocus();
            a.this.p.clearFocus();
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f1637n.setDisplayedChild(1);
        }
    }

    public a(COUICalendarPicker cOUICalendarPicker, Context context, AttributeSet attributeSet, int i2, int i3) {
        super(cOUICalendarPicker, context);
        this.q = 0;
        this.u = 0;
        e eVar = new e();
        this.w = eVar;
        f fVar = new f();
        this.x = fVar;
        g gVar = new g();
        this.y = gVar;
        Locale locale = this.d;
        this.f1628c = Calendar.getInstance(locale);
        this.r = Calendar.getInstance(locale);
        Calendar calendar = Calendar.getInstance(locale);
        this.s = calendar;
        Calendar calendar2 = Calendar.getInstance(locale);
        this.t = calendar2;
        calendar.set(1900, 0, 1);
        calendar2.set(2100, 11, 31);
        TypedArray typedArrayObtainStyledAttributes = this.b.obtainStyledAttributes(attributeSet, R$styleable.COUICalendarPicker, i2, i3);
        ViewGroup viewGroup = (ViewGroup) ((LayoutInflater) this.b.getSystemService("layout_inflater")).inflate(R$layout.coui_calendar_picker_material, (ViewGroup) this.a, false);
        this.h = viewGroup;
        viewGroup.setSaveFromParentEnabled(false);
        this.a.addView(this.h);
        ViewGroup viewGroup2 = (ViewGroup) this.h.findViewById(R$id.date_picker_header);
        this.f1636l = (COUIRotateView) viewGroup2.findViewById(R$id.expand);
        this.f1635j = (ImageButton) viewGroup2.findViewById(R$id.prev);
        this.k = (ImageButton) viewGroup2.findViewById(R$id.next);
        this.i = (TextView) viewGroup2.findViewById(R$id.date_picker_header_month);
        this.i.setTextSize(0, (int) gg2.f(context.getResources().getDimensionPixelSize(R$dimen.calendar_picker_month_text_size), context.getResources().getConfiguration().fontScale));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateFormat.getBestDateTimePattern(context.getResources().getConfiguration().locale, "MMMMy"), context.getResources().getConfiguration().locale);
        this.v = simpleDateFormat;
        this.i.setText(simpleDateFormat.format(this.f1628c.getTime()));
        LinearLayout linearLayout = (LinearLayout) viewGroup2.findViewById(R$id.date_picker_header_month_layout);
        this.m = linearLayout;
        linearLayout.setOnClickListener(gVar);
        this.f1636l.setOnClickListener(gVar);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.COUICalendarPicker_android_headerMonthTextAppearance, 0);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = this.b.obtainStyledAttributes(null, z, 0, resourceId);
            typedArrayObtainStyledAttributes2.getColorStateList(0);
            typedArrayObtainStyledAttributes2.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        ViewAnimator viewAnimator = (ViewAnimator) this.h.findViewById(R$id.animator);
        this.f1637n = viewAnimator;
        COUICalendarDayPickerView cOUICalendarDayPickerView = (COUICalendarDayPickerView) viewAnimator.findViewById(R$id.date_picker_day_picker);
        this.o = cOUICalendarDayPickerView;
        cOUICalendarDayPickerView.setFirstDayOfWeek(this.u);
        this.o.setMinDate(calendar.getTimeInMillis());
        this.o.setMaxDate(calendar2.getTimeInMillis());
        this.o.setDate(this.f1628c.getTimeInMillis());
        this.o.setOnDaySelectedListener(eVar);
        this.o.setMonthView(this.i);
        this.o.setPrevButton(this.f1635j);
        this.o.setNextButton(this.k);
        COUICalendarYearView cOUICalendarYearView = (COUICalendarYearView) this.f1637n.findViewById(R$id.date_picker_year_picker);
        this.p = cOUICalendarYearView;
        cOUICalendarYearView.b(calendar, calendar2);
        this.p.setDate(this.f1628c);
        this.p.setOnYearSelectedListener(fVar);
        p();
        d(this.d);
    }

    @Override // com.coui.appcompat.calendar.COUICalendarPicker.AbstractDatePickerDelegate, com.coui.appcompat.calendar.COUICalendarPicker.b
    public /* bridge */ /* synthetic */ void a(COUICalendarPicker.d dVar) {
        super.a(dVar);
    }

    @Override // com.coui.appcompat.calendar.COUICalendarPicker.AbstractDatePickerDelegate, com.coui.appcompat.calendar.COUICalendarPicker.b
    public /* bridge */ /* synthetic */ void b(boolean z2) {
        super.b(z2);
    }

    @Override // com.coui.appcompat.calendar.COUICalendarPicker.AbstractDatePickerDelegate
    public void d(Locale locale) {
        q(false);
    }

    @Override // com.coui.appcompat.calendar.COUICalendarPicker.AbstractDatePickerDelegate, com.coui.appcompat.calendar.COUICalendarPicker.b
    public /* bridge */ /* synthetic */ long getDate() {
        return super.getDate();
    }

    @Override // com.coui.appcompat.calendar.COUICalendarPicker.b
    public int getDayOfMonth() {
        return this.f1628c.get(5);
    }

    @Override // com.coui.appcompat.calendar.COUICalendarPicker.b
    public int getFirstDayOfWeek() {
        int i2 = this.u;
        return i2 != 0 ? i2 : this.f1628c.getFirstDayOfWeek();
    }

    @Override // com.coui.appcompat.calendar.COUICalendarPicker.b
    public Calendar getMaxDate() {
        return this.t;
    }

    @Override // com.coui.appcompat.calendar.COUICalendarPicker.b
    public Calendar getMinDate() {
        return this.s;
    }

    @Override // com.coui.appcompat.calendar.COUICalendarPicker.b
    public int getMonth() {
        return this.f1628c.get(2);
    }

    @Override // com.coui.appcompat.calendar.COUICalendarPicker.b
    public int getYear() {
        return this.f1628c.get(1);
    }

    @Override // com.coui.appcompat.calendar.COUICalendarPicker.b
    public boolean isEnabled() {
        return this.h.isEnabled();
    }

    @Override // com.coui.appcompat.calendar.COUICalendarPicker.b
    public void onConfigurationChanged(Configuration configuration) {
        e(configuration.locale);
    }

    @Override // com.coui.appcompat.calendar.COUICalendarPicker.b
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof COUICalendarPicker.AbstractDatePickerDelegate.SavedState) {
            COUICalendarPicker.AbstractDatePickerDelegate.SavedState savedState = (COUICalendarPicker.AbstractDatePickerDelegate.SavedState) parcelable;
            this.f1628c.set(savedState.getSelectedYear(), savedState.getSelectedMonth(), savedState.getSelectedDay());
            this.s.setTimeInMillis(savedState.getMinDate());
            this.t.setTimeInMillis(savedState.getMaxDate());
            q(false);
            int currentView = savedState.getCurrentView();
            s(currentView, true);
            int listPosition = savedState.getListPosition();
            if (listPosition == Integer.MIN_VALUE || currentView != 0) {
                return;
            }
            this.o.setPosition(listPosition);
            this.i.setText(this.v.format(Long.valueOf(savedState.getCurrentTimeMillis())));
        }
    }

    @Override // com.coui.appcompat.calendar.COUICalendarPicker.b
    public Parcelable onSaveInstanceState(Parcelable parcelable) {
        return new COUICalendarPicker.AbstractDatePickerDelegate.SavedState(parcelable, this.f1628c.get(1), this.f1628c.get(2), this.f1628c.get(5), this.s.getTimeInMillis(), this.t.getTimeInMillis(), this.q, this.q == 0 ? this.o.getMostVisiblePosition() : Integer.MIN_VALUE, Integer.MIN_VALUE, this.o.getCurrentTimeMillis());
    }

    public final void p() {
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f = valueAnimator;
        valueAnimator.setFloatValues(0.0f, 1.0f);
        this.f.setDuration(280L);
        this.f.setInterpolator(A);
        this.f.addListener(new C0195a());
        this.f.addUpdateListener(new b());
        ValueAnimator valueAnimator2 = new ValueAnimator();
        this.g = valueAnimator2;
        valueAnimator2.setFloatValues(0.0f, 1.0f);
        this.g.setDuration(150L);
        this.g.setInterpolator(B);
        this.g.addListener(new c());
        this.g.addUpdateListener(new d());
    }

    public final void q(boolean z2) {
        if (z2) {
            this.f1637n.announceForAccessibility(c());
        }
    }

    public final void r(boolean z2, boolean z3) {
        this.f1628c.get(1);
        this.o.t(this.f1628c.getTimeInMillis(), this.f1629e);
        this.p.setDate(this.f1628c);
        q(z2);
    }

    @RequiresApi(api = 22)
    public final void s(int i2, boolean z2) {
        this.i.setText(this.v.format(this.f1628c.getTime()));
        if (i2 == 0) {
            r(true, true);
            this.o.setDate(this.f1628c.getTimeInMillis());
            if (this.q != i2) {
                this.i.setTextColor(lh2.a(this.b, R$attr.couiColorPrimaryNeutral));
                this.f1637n.setDisplayedChild(0);
                this.f1636l.startCollapseAnimation();
                this.q = i2;
                this.g.cancel();
                this.f.setCurrentFraction(this.f1635j.getAlpha());
                this.f.start();
                return;
            }
            return;
        }
        if (i2 != 1) {
            return;
        }
        this.p.setDate(this.f1628c);
        this.p.post(new h());
        if (this.q != i2) {
            this.i.setTextColor(lh2.a(this.b, R$attr.couiColorPrimary));
            if (z2) {
                this.f1637n.setDisplayedChild(1);
                this.f1635j.setVisibility(8);
                this.k.setVisibility(8);
                this.f1636l.setExpanded(true);
            } else {
                this.f1637n.postDelayed(new i(), 120L);
                this.f.cancel();
                this.g.start();
                this.f1636l.startExpandAnimation();
            }
            this.q = i2;
        }
    }

    @Override // com.coui.appcompat.calendar.COUICalendarPicker.AbstractDatePickerDelegate, com.coui.appcompat.calendar.COUICalendarPicker.b
    public /* bridge */ /* synthetic */ void setAutoFillChangeListener(COUICalendarPicker.c cVar) {
        super.setAutoFillChangeListener(cVar);
    }

    @Override // com.coui.appcompat.calendar.COUICalendarPicker.b
    public void setEnabled(boolean z2) {
        this.h.setEnabled(z2);
        this.o.setEnabled(z2);
        this.p.setEnabled(z2);
    }

    @Override // com.coui.appcompat.calendar.COUICalendarPicker.b
    public void setFirstDayOfWeek(int i2) {
        this.u = i2;
        this.o.setFirstDayOfWeek(i2);
    }

    @Override // com.coui.appcompat.calendar.COUICalendarPicker.b
    public void setMaxDate(long j2) {
        this.r.setTimeInMillis(j2);
        if (this.r.get(1) == this.t.get(1) && this.r.get(6) == this.t.get(6)) {
            return;
        }
        if (this.f1628c.after(this.r)) {
            this.f1628c.setTimeInMillis(j2);
            r(false, true);
        }
        this.t.setTimeInMillis(j2);
        this.o.setMaxDate(j2);
        this.p.b(this.s, this.t);
    }

    @Override // com.coui.appcompat.calendar.COUICalendarPicker.b
    public void setMinDate(long j2) {
        this.r.setTimeInMillis(j2);
        if (this.r.get(1) == this.s.get(1) && this.r.get(6) == this.s.get(6)) {
            return;
        }
        if (this.f1628c.before(this.r)) {
            this.f1628c.setTimeInMillis(j2);
            r(false, true);
        }
        this.s.setTimeInMillis(j2);
        this.o.setMinDate(j2);
        this.p.b(this.s, this.t);
    }

    @Override // com.coui.appcompat.calendar.COUICalendarPicker.AbstractDatePickerDelegate, com.coui.appcompat.calendar.COUICalendarPicker.b
    public /* bridge */ /* synthetic */ void setOnDateChangedListener(COUICalendarPicker.c cVar) {
        super.setOnDateChangedListener(cVar);
    }

    @Override // com.coui.appcompat.calendar.COUICalendarPicker.AbstractDatePickerDelegate, com.coui.appcompat.calendar.COUICalendarPicker.b
    public /* bridge */ /* synthetic */ void updateDate(long j2) {
        super.updateDate(j2);
    }

    @Override // com.coui.appcompat.calendar.COUICalendarPicker.b
    public void updateDate(int i2, int i3, int i4) {
        this.f1628c.set(1, i2);
        this.f1628c.set(2, i3);
        this.f1628c.set(5, i4);
        this.i.setText(this.v.format(this.f1628c.getTime()));
        this.o.setClick(true);
        r(false, true);
    }
}
