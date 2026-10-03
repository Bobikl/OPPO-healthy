package com.coui.appcompat.calendar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class COUICalendarDayViewPager extends ViewPager {
    public final ArrayList<View> i;

    public COUICalendarDayViewPager(Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        try {
            Method declaredMethod = ViewPager.class.getDeclaredMethod("populate", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this, new Object[0]);
            }
        } catch (Exception unused) {
        }
        int childCount = getChildCount();
        boolean z = (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) ? false : true;
        int iMax = 0;
        int iMax2 = 0;
        int iCombineMeasuredStates = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) childAt.getLayoutParams();
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                if (z && (((ViewGroup.LayoutParams) layoutParams).width == -1 || ((ViewGroup.LayoutParams) layoutParams).height == -1)) {
                    this.i.add(childAt);
                }
            }
        }
        int paddingLeft = iMax + getPaddingLeft() + getPaddingRight();
        int iMax3 = Math.max(iMax2 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight());
        int iMax4 = Math.max(paddingLeft, getSuggestedMinimumWidth());
        Drawable foreground = getForeground();
        if (foreground != null) {
            iMax3 = Math.max(iMax3, foreground.getMinimumHeight());
            iMax4 = Math.max(iMax4, foreground.getMinimumWidth());
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax4, i, iCombineMeasuredStates), View.resolveSizeAndState(iMax3, i2, iCombineMeasuredStates << 16));
        int size = this.i.size();
        if (size > 1) {
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.i.get(i4);
                ViewPager.LayoutParams layoutParams2 = (ViewPager.LayoutParams) view.getLayoutParams();
                view.measure(((ViewGroup.LayoutParams) layoutParams2).width == -1 ? View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824) : ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((ViewGroup.LayoutParams) layoutParams2).width), ((ViewGroup.LayoutParams) layoutParams2).height == -1 ? View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824) : ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), ((ViewGroup.LayoutParams) layoutParams2).height));
            }
        }
        this.i.clear();
    }

    public COUICalendarDayViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new ArrayList<>(1);
    }
}
