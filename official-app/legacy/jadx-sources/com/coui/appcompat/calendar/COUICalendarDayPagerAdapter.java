package com.coui.appcompat.calendar;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes13.dex */
public class COUICalendarDayPagerAdapter extends PagerAdapter {
    public final LayoutInflater d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1618e;
    public final int f;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1619j;
    public ColorStateList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1620l;
    public ColorStateList m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f1621n;
    public int o;
    public int p;
    public final Calendar a = Calendar.getInstance();
    public final Calendar b = Calendar.getInstance();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray<c> f1617c = new SparseArray<>();
    public Calendar g = null;
    public ArrayList<COUIDateMonthView> q = new ArrayList<>();
    public final COUIDateMonthView.d r = new a();

    public class a implements COUIDateMonthView.d {
        public a() {
        }

        @Override // com.coui.appcompat.calendar.COUIDateMonthView.d
        public void a(COUIDateMonthView cOUIDateMonthView, Calendar calendar) {
            if (calendar != null) {
                COUICalendarDayPagerAdapter.this.setSelectedDay(calendar);
                if (COUICalendarDayPagerAdapter.this.f1621n != null) {
                    COUICalendarDayPagerAdapter.this.f1621n.a(COUICalendarDayPagerAdapter.this, calendar);
                }
            }
        }
    }

    public interface b {
        void a(COUICalendarDayPagerAdapter cOUICalendarDayPagerAdapter, Calendar calendar);
    }

    public static class c {
        public final int a;
        public final View b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final COUIDateMonthView f1622c;

        public c(int i, View view, COUIDateMonthView cOUIDateMonthView) {
            this.a = i;
            this.b = view;
            this.f1622c = cOUIDateMonthView;
        }
    }

    public COUICalendarDayPagerAdapter(@NonNull Context context, @LayoutRes int i, @IdRes int i2) {
        this.d = LayoutInflater.from(context);
        this.f1618e = i;
        this.f = i2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.colorControlHighlight});
        this.m = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView(((c) obj).b);
        this.f1617c.remove(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.o;
    }

    public ArrayList<COUIDateMonthView> getCurrentView() {
        return this.q;
    }

    public int getDayOfWeekTextAppearance() {
        return this.i;
    }

    public int getDayTextAppearance() {
        return this.f1619j;
    }

    public int getFirstDayOfWeek() {
        return this.p;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return ((c) obj).a;
    }

    public final int getMonthForPosition(int i) {
        return (i + this.a.get(2)) % 12;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        COUIDateMonthView cOUIDateMonthView = this.f1617c.get(i).f1622c;
        if (cOUIDateMonthView != null) {
            return cOUIDateMonthView.getMonthYearLabel();
        }
        return null;
    }

    public final int getPositionForDay(Calendar calendar) {
        if (calendar == null) {
            return Integer.MIN_VALUE;
        }
        return ((calendar.get(1) - this.a.get(1)) * 12) + (calendar.get(2) - this.a.get(2));
    }

    public final int getYearForPosition(int i) {
        return ((i + this.a.get(2)) / 12) + this.a.get(1);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        boolean z = false;
        View viewInflate = this.d.inflate(this.f1618e, viewGroup, false);
        COUIDateMonthView cOUIDateMonthView = (COUIDateMonthView) viewInflate.findViewById(this.f);
        cOUIDateMonthView.setOnDayClickListener(this.r);
        cOUIDateMonthView.setMonthTextAppearance(this.h);
        cOUIDateMonthView.setDayOfWeekTextAppearance(this.i);
        cOUIDateMonthView.setDayTextAppearance(this.f1619j);
        int i2 = this.f1620l;
        if (i2 != 0) {
            cOUIDateMonthView.setDaySelectorColor(i2);
        }
        ColorStateList colorStateList = this.m;
        if (colorStateList != null) {
            cOUIDateMonthView.setDayHighlightColor(colorStateList);
        }
        ColorStateList colorStateList2 = this.k;
        if (colorStateList2 != null) {
            cOUIDateMonthView.setMonthTextColor(colorStateList2);
            cOUIDateMonthView.setDayOfWeekTextColor(this.k);
            cOUIDateMonthView.setDayTextColor(this.k);
        }
        int monthForPosition = getMonthForPosition(i);
        int yearForPosition = getYearForPosition(i);
        Calendar calendar = this.g;
        int i3 = (calendar == null || calendar.get(2) != monthForPosition) ? Integer.MIN_VALUE : this.g.get(5);
        int i4 = (this.a.get(2) == monthForPosition && this.a.get(1) == yearForPosition) ? this.a.get(5) : 1;
        int i5 = (this.b.get(2) == monthForPosition && this.b.get(1) == yearForPosition) ? this.b.get(5) : 31;
        int i6 = this.p;
        Calendar calendar2 = this.g;
        if (calendar2 != null && yearForPosition == calendar2.get(1)) {
            z = true;
        }
        cOUIDateMonthView.L(i3, monthForPosition, yearForPosition, i6, i4, i5, z);
        c cVar = new c(i, viewInflate, cOUIDateMonthView);
        this.f1617c.put(i, cVar);
        viewGroup.addView(viewInflate);
        return cVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == ((c) obj).b;
    }

    public void setDayOfWeekTextAppearance(int i) {
        this.i = i;
        notifyDataSetChanged();
    }

    public void setDaySelectorColor(int i) {
        this.f1620l = i;
        notifyDataSetChanged();
    }

    public void setDayTextAppearance(int i) {
        this.f1619j = i;
        notifyDataSetChanged();
    }

    public void setFirstDayOfWeek(int i) {
        this.p = i;
        int size = this.f1617c.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1617c.valueAt(i2).f1622c.setFirstDayOfWeek(i);
        }
    }

    public void setMonthTextAppearance(int i) {
        this.h = i;
        notifyDataSetChanged();
    }

    public void setOnDaySelectedListener(b bVar) {
        this.f1621n = bVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
        this.q.clear();
        int i2 = i - 1;
        if (this.f1617c.get(i2) != null && this.f1617c.get(i2).f1622c != null) {
            this.q.add(this.f1617c.get(i2).f1622c);
        }
        this.q.add(this.f1617c.get(i).f1622c);
        int i3 = i + 1;
        if (this.f1617c.get(i3) == null || this.f1617c.get(i3).f1622c == null) {
            return;
        }
        this.q.add(this.f1617c.get(i3).f1622c);
    }

    public void setRange(@NonNull Calendar calendar, @NonNull Calendar calendar2) {
        this.a.setTimeInMillis(calendar.getTimeInMillis());
        this.b.setTimeInMillis(calendar2.getTimeInMillis());
        this.o = (this.b.get(2) - this.a.get(2)) + ((this.b.get(1) - this.a.get(1)) * 12) + 1;
        notifyDataSetChanged();
    }

    public void setSelectedDay(Calendar calendar) {
        c cVar;
        int positionForDay = getPositionForDay(this.g);
        int positionForDay2 = getPositionForDay(calendar);
        if (positionForDay >= 1) {
            for (int i = positionForDay - 1; i <= positionForDay + 1; i++) {
                c cVar2 = this.f1617c.get(i, null);
                if (cVar2 != null) {
                    cVar2.f1622c.N(Integer.MIN_VALUE, calendar.get(2), calendar.get(1));
                }
            }
        }
        if (positionForDay2 >= 0 && (cVar = this.f1617c.get(positionForDay2, null)) != null) {
            cVar.f1622c.N(calendar.get(5), calendar.get(2), calendar.get(1));
            cVar.f1622c.M(this.g.get(5), this.g.get(2));
        }
        this.g = calendar;
    }
}
