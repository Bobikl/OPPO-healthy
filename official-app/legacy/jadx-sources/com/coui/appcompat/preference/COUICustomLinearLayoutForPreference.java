package com.coui.appcompat.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.support.preference.R$dimen;
import com.support.preference.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUICustomLinearLayoutForPreference extends LinearLayout {
    public View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f1895j;
    public View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f1896l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1897n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public int t;

    public COUICustomLinearLayoutForPreference(Context context) {
        this(context, null);
    }

    public final void a(int i, int i2) {
        int iMax;
        int iG;
        int iE;
        int iMin;
        int iMin2;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight(), View.MeasureSpec.getMode(i));
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom(), View.MeasureSpec.getMode(i2));
        if (this.i.getVisibility() != 8) {
            measureChildWithMargins(this.i, iMakeMeasureSpec, 0, iMakeMeasureSpec2, 0);
            iMax = Math.max(this.i.getMeasuredHeight(), 0);
        } else {
            measureChild(this.i, View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            iMax = 0;
        }
        if (this.f1895j.getVisibility() != 8) {
            measureChildWithMargins(this.f1895j, iMakeMeasureSpec, 0, iMakeMeasureSpec2, 0);
            iMax = Math.max(this.f1895j.getMeasuredHeight(), iMax);
        } else {
            measureChild(this.f1895j, View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        }
        if (this.k.getVisibility() != 8) {
            measureChildWithMargins(this.k, iMakeMeasureSpec, 0, iMakeMeasureSpec2, 0);
            iMax = Math.max(this.k.getMeasuredHeight(), iMax);
        } else {
            measureChild(this.k, View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        }
        int paddingLeft = getPaddingLeft();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int i3 = measuredWidth - paddingLeft;
        if (g(this.i) + g(this.f1895j) + g(this.k) > i3) {
            if (this.o) {
                iG = g(this.k);
                iE = e(this.k);
            } else {
                iG = g(this.i);
                iE = e(this.i);
            }
            int i4 = iG - iE;
            int i5 = this.m;
            if (i4 >= i5) {
                i4 = i5;
            }
            if (this.o) {
                iMin2 = Math.min(g(this.i), (i3 - (i4 + e(this.k))) - g(this.f1895j));
                iMin = measuredWidth - Math.max(measuredWidth - g(this.k), (paddingLeft + iMin2) + g(this.f1895j));
            } else {
                iMin = Math.min(g(this.k), (i3 - (i4 + e(this.i))) - g(this.f1895j));
                iMin2 = Math.min(g(this.i), (i3 - iMin) - g(this.f1895j));
            }
            int iG2 = g(this.f1895j);
            if (this.i.getVisibility() != 8) {
                View view = this.i;
                j(view, iMin2 - e(view));
                iMax = Math.max(this.i.getMeasuredHeight(), iMax);
            }
            if (this.f1895j.getVisibility() != 8) {
                View view2 = this.f1895j;
                j(view2, iG2 - e(view2));
                iMax = Math.max(this.f1895j.getMeasuredHeight(), iMax);
            }
            if (this.k.getVisibility() != 8) {
                View view3 = this.k;
                j(view3, iMin - e(view3));
                iMax = Math.max(this.k.getMeasuredHeight(), iMax);
            }
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.makeMeasureSpec(iMax + getPaddingTop() + getPaddingBottom(), View.MeasureSpec.getMode(i2)));
        }
    }

    public final int b(View view) {
        if (view.getVisibility() != 8) {
            return ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        }
        return 0;
    }

    public final int c(View view) {
        if (view.getVisibility() != 8) {
            return ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
        }
        return 0;
    }

    public final int d(View view) {
        if (view.getVisibility() != 8) {
            return ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public final int e(View view) {
        if (view.getVisibility() != 8) {
            return ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
        }
        return 0;
    }

    public final int f(View view) {
        if (view.getVisibility() != 8) {
            return view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        }
        return 0;
    }

    public final int g(View view) {
        if (view.getVisibility() != 8) {
            return view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
        }
        return 0;
    }

    public final void h(Context context, AttributeSet attributeSet, int i) {
        setOrientation(0);
        this.p = getContext().getResources().getDimensionPixelSize(R$dimen.support_preference_reddot_margin_end_in_right_noassignment);
        this.q = getContext().getResources().getDimensionPixelSize(R$dimen.support_preference_reddot_margin_end_in_right_hasassignment);
        this.r = getContext().getResources().getDimensionPixelSize(R$dimen.support_preference_title_margin_end_in_right);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUICustomLinearLayoutForPreference, i, 0);
        this.t = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUICustomLinearLayoutForPreference_couiMessageLayoutMarginEnd, 0);
        this.f1897n = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUICustomLinearLayoutForPreference_couiBStickToC, this.f1897n);
        this.o = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUICustomLinearLayoutForPreference_couiAHavePriority, this.o);
        this.s = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUICustomLinearLayoutForPreference_couiMarginEndOfA, this.s);
        typedArrayObtainStyledAttributes.recycle();
        this.m = context.getResources().getDimensionPixelSize(R$dimen.assignment_in_right_low_priority_min_width);
    }

    public final boolean i() {
        return getLayoutDirection() == 1;
    }

    public final void j(View view, int i) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    public final boolean k() {
        boolean z;
        View view;
        View view2;
        View view3 = this.f1895j;
        if (view3 == null || view3.getVisibility() != 0) {
            z = false;
        } else {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1895j.getLayoutParams();
            View view4 = this.k;
            if (view4 == null || view4.getVisibility() != 0) {
                int marginEnd = layoutParams.getMarginEnd();
                int i = this.p;
                if (marginEnd != i) {
                    layoutParams.setMarginEnd(i);
                    this.f1895j.setLayoutParams(layoutParams);
                    z = true;
                } else {
                    z = false;
                }
            } else {
                int marginEnd2 = layoutParams.getMarginEnd();
                int i2 = this.q;
                if (marginEnd2 != i2) {
                    layoutParams.setMarginEnd(i2);
                    this.f1895j.setLayoutParams(layoutParams);
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (this.s && (view = this.i) != null && view.getVisibility() == 0) {
            View view5 = this.f1895j;
            if ((view5 == null || view5.getVisibility() != 0) && ((view2 = this.k) == null || view2.getVisibility() != 0)) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.i.getLayoutParams();
                int marginEnd3 = layoutParams2.getMarginEnd();
                int i3 = this.t;
                if (marginEnd3 != i3) {
                    layoutParams2.setMarginEnd(i3);
                    this.i.setLayoutParams(layoutParams2);
                    return true;
                }
            } else {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.i.getLayoutParams();
                int marginEnd4 = layoutParams3.getMarginEnd();
                int i4 = this.r;
                if (marginEnd4 != i4) {
                    layoutParams3.setMarginEnd(i4);
                    this.i.setLayoutParams(layoutParams3);
                    return true;
                }
            }
        }
        return z;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iG;
        int iG2;
        int paddingLeft = getPaddingLeft();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int measuredHeight = (getMeasuredHeight() - getPaddingBottom()) - paddingTop;
        int iF = ((measuredHeight - f(this.i)) / 2) + paddingTop;
        int iF2 = ((measuredHeight - f(this.k)) / 2) + paddingTop;
        int iF3 = paddingTop + ((measuredHeight - f(this.f1895j)) / 2);
        if (i()) {
            int iG3 = measuredWidth - g(this.i);
            iG = this.f1897n ? g(this.k) + paddingLeft : iG3 - g(this.f1895j);
            iG2 = paddingLeft;
            paddingLeft = iG3;
        } else {
            iG2 = measuredWidth - g(this.k);
            iG = this.f1897n ? iG2 - g(this.f1895j) : g(this.i) + paddingLeft;
        }
        View view = this.i;
        view.layout(c(view) + paddingLeft, d(this.i) + iF, ((paddingLeft + c(this.i)) + g(this.i)) - e(this.i), ((iF + d(this.i)) + f(this.i)) - b(this.i));
        View view2 = this.k;
        view2.layout(c(view2) + iG2, d(this.k) + iF2, ((iG2 + c(this.k)) + g(this.k)) - e(this.k), ((iF2 + d(this.k)) + f(this.k)) - b(this.k));
        View view3 = this.f1895j;
        view3.layout(c(view3) + iG, d(this.f1895j) + iF3, ((iG + c(this.f1895j)) + g(this.f1895j)) - e(this.f1895j), ((iF3 + d(this.f1895j)) + f(this.f1895j)) - b(this.f1895j));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.i = getChildAt(0);
        this.f1895j = getChildAt(1);
        this.k = getChildAt(2);
        if (k()) {
            super.onMeasure(i, i2);
        }
        a(i, i2);
    }

    public COUICustomLinearLayoutForPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUICustomLinearLayoutForPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1896l = "COUICustomLinearLayout";
        this.f1897n = true;
        this.o = true;
        this.s = true;
        h(context, attributeSet, i);
    }
}
