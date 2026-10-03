package com.heytap.health.base.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.heytap.health.base.R$integer;
import com.heytap.health.base.R$styleable;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.vik;
import com.oplus.smartenginehelper.ParserTag;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes15.dex */
public class ViewPagerTabLayout extends FrameLayout {
    public b A;
    public float[] B;
    public int C;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f3304j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f3305l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f3306n;
    public String[] o;
    public ViewPager p;
    public ViewPager2 q;
    public int r;
    public LinearLayoutCompat s;
    public ImageView t;
    public int u;
    public Drawable v;
    public int w;
    public float x;
    public Typeface y;
    public c z;

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ View i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ View f3307j;

        public a(View view, View view2) {
            this.i = view;
            this.f3307j = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a7b.f("ViewpagerTabLayout", ParserTag.TAG_ON_ANIMATION_END);
            this.i.setSelected(false);
            this.f3307j.setSelected(true);
            ViewPagerTabLayout.this.C--;
        }
    }

    public interface b {
        void onItemClick(int i);
    }

    public static class c extends ViewPager2.OnPageChangeCallback implements ViewPager.OnPageChangeListener {
        public final WeakReference<ViewPagerTabLayout> i;

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            if (this.i.get() == null) {
                return;
            }
            if (this.i.get().C > 0) {
                a7b.f("ViewpagerTabLayout", "animation resume");
                return;
            }
            if (f == 0.0f) {
                View childAt = this.i.get().s.getChildAt(this.i.get().r);
                if (childAt != null) {
                    childAt.setSelected(false);
                }
                View childAt2 = this.i.get().s.getChildAt(i);
                if (childAt2 != null) {
                    childAt2.setSelected(true);
                }
                this.i.get().r = i;
            }
            this.i.get().w = i;
            this.i.get().x = f;
            this.i.get().t.requestLayout();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
        }

        public c(ViewPagerTabLayout viewPagerTabLayout) {
            this.i = new WeakReference<>(viewPagerTabLayout);
        }
    }

    public ViewPagerTabLayout(@NonNull Context context) {
        super(context);
        this.o = new String[]{"1", "2", "3", "4", "5"};
        this.A = null;
        this.B = null;
        this.C = 0;
        k(context, null);
    }

    public int getCurrentPosition() {
        return this.r;
    }

    public final void h() {
        ViewPager viewPager = this.p;
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(this.z);
            return;
        }
        ViewPager2 viewPager2 = this.q;
        if (viewPager2 != null) {
            viewPager2.registerOnPageChangeCallback(this.z);
        }
    }

    public View i(@NonNull Context context) {
        this.t = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.m, (int) this.f3306n);
        layoutParams.gravity = 16;
        this.t.setLayoutParams(layoutParams);
        this.t.setForceDarkAllowed(false);
        this.t.setImageDrawable(this.f3305l);
        return this.t;
    }

    public final float j(float f) {
        this.B = new float[this.o.length];
        float measuredWidth = (this.s.getMeasuredWidth() * 1.0f) / this.o.length;
        for (int i = 0; i < this.o.length; i++) {
            this.B[i] = (i * measuredWidth) + ((measuredWidth - this.t.getMeasuredWidth()) / 2.0f) + getPaddingStart();
        }
        int i2 = 1;
        if (this.B.length < 1) {
            return -1.0f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getNearestStandardX sliderX:");
        sb.append(Arrays.toString(this.B));
        float fAbs = Math.abs(this.B[0] - f);
        float f2 = this.B[0];
        while (true) {
            float[] fArr = this.B;
            if (i2 >= fArr.length) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("getNearestStandardX nowX:");
                sb2.append(f2);
                sb2.append(",eventX:");
                sb2.append(f);
                return f2;
            }
            float fAbs2 = Math.abs(fArr[i2] - f);
            if (fAbs2 < fAbs) {
                f2 = this.B[i2];
                fAbs = fAbs2;
            }
            i2++;
        }
    }

    public void k(@NonNull Context context, AttributeSet attributeSet) {
        this.z = new c();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.lib_base_ViewPagerTabLayout);
        this.i = typedArrayObtainStyledAttributes.getDimension(R$styleable.lib_base_ViewPagerTabLayout_tabTextSize, (context.getResources().getDisplayMetrics().scaledDensity * 12.0f) + 0.5f);
        this.f3304j = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.lib_base_ViewPagerTabLayout_tabTextColor);
        this.f3305l = typedArrayObtainStyledAttributes.getDrawable(R$styleable.lib_base_ViewPagerTabLayout_sliderSrc);
        this.m = typedArrayObtainStyledAttributes.getDimension(R$styleable.lib_base_ViewPagerTabLayout_sliderWidth, (context.getResources().getDisplayMetrics().density * 64.0f) + 0.5f);
        this.f3306n = typedArrayObtainStyledAttributes.getDimension(R$styleable.lib_base_ViewPagerTabLayout_sliderHeight, (context.getResources().getDisplayMetrics().density * 24.0f) + 0.5f);
        this.u = typedArrayObtainStyledAttributes.getResourceId(R$styleable.lib_base_ViewPagerTabLayout_bindViewPager, -1);
        this.k = typedArrayObtainStyledAttributes.getString(R$styleable.lib_base_ViewPagerTabLayout_tabTextFontFamily);
        this.v = typedArrayObtainStyledAttributes.getDrawable(R$styleable.lib_base_ViewPagerTabLayout_contentBackground);
        typedArrayObtainStyledAttributes.recycle();
        View view = new View(context);
        view.setBackground(this.v);
        addView(view);
        addView(i(context));
        this.s = new LinearLayoutCompat(context);
        this.s.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.s.setGravity(16);
        this.s.setOrientation(0);
        addView(this.s);
        o();
    }

    public final void l(View view) {
        if (view.getTag() instanceof Integer) {
            this.C++;
            int iIntValue = ((Integer) view.getTag()).intValue();
            View childAt = this.s.getChildAt(this.r);
            this.r = iIntValue;
            float fJ = j(view.getLeft() + getPaddingStart());
            StringBuilder sb = new StringBuilder();
            sb.append("itemClick view.getLeft:");
            sb.append(view.getLeft());
            sb.append(",sliderX:");
            sb.append(Arrays.toString(this.B));
            this.t.animate().setDuration(b78.a().getResources().getInteger(R$integer.lib_base_home_card_animate_common_time)).x(fJ).setListener(new a(childAt, view));
            b bVar = this.A;
            if (bVar != null) {
                bVar.onItemClick(this.r);
            }
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 1).a(vik.TAG_POSTION1, Integer.valueOf(this.r + 1)).b();
            ViewPager viewPager = this.p;
            if (viewPager != null) {
                viewPager.setCurrentItem(this.r, false);
            } else {
                ViewPager2 viewPager2 = this.q;
                if (viewPager2 != null) {
                    viewPager2.setCurrentItem(this.r, false);
                }
            }
            n();
        }
    }

    public void m(int i, boolean z) {
        this.r = i;
        this.w = i;
        o();
        ViewPager2 viewPager2 = this.q;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(i, z);
        }
        ViewPager viewPager = this.p;
        if (viewPager != null) {
            viewPager.setCurrentItem(i, z);
        }
        this.t.requestLayout();
    }

    public final void n() {
        Typeface typeface;
        int childCount = this.s.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.s.getChildAt(i);
            if (childAt instanceof TextView) {
                if (i != this.r || (typeface = this.y) == null) {
                    ((TextView) childAt).setTypeface(Typeface.DEFAULT);
                } else {
                    ((TextView) childAt).setTypeface(typeface);
                }
            }
        }
    }

    public void o() {
        Typeface typeface;
        if (this.o == null) {
            return;
        }
        this.s.removeAllViews();
        int i = 0;
        while (i < this.o.length) {
            LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(0, -1);
            ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
            ((LinearLayout.LayoutParams) layoutParams).weight = 1.0f;
            TextView textView = new TextView(getContext());
            textView.setLayoutParams(layoutParams);
            textView.setGravity(17);
            textView.setTextSize(0, this.i);
            textView.setTextColor(this.f3304j);
            textView.setText(this.o[i]);
            if (!TextUtils.isEmpty(this.k)) {
                textView.setTypeface(Typeface.create(this.k, 0));
            }
            textView.setTag(Integer.valueOf(i));
            if (i == this.r && (typeface = this.y) != null) {
                textView.setTypeface(typeface);
            }
            textView.setSelected(i == this.r);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.o0l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.i.l(view);
                }
            });
            this.s.addView(textView);
            i++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        String[] strArr = this.o;
        if (strArr != null && strArr.length > 0) {
            float measuredWidth = (this.s.getMeasuredWidth() * 1.0f) / this.o.length;
            this.t.setX((this.w * measuredWidth) + ((measuredWidth - this.t.getMeasuredWidth()) / 2.0f) + getPaddingStart() + (this.x * measuredWidth));
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.p != null || this.q != null || this.u == -1 || getRootView() == null) {
            return;
        }
        View viewFindViewById = getRootView().findViewById(this.u);
        if (viewFindViewById instanceof ViewPager) {
            this.p = (ViewPager) viewFindViewById;
        } else if (viewFindViewById instanceof ViewPager2) {
            this.q = (ViewPager2) viewFindViewById;
        }
        h();
    }

    public void setCurrentPosition(int i) {
        m(i, true);
    }

    public void setItemClickListener(b bVar) {
        this.A = bVar;
    }

    public void setSelectedTypeface(Typeface typeface) {
        this.y = typeface;
    }

    public void setSliderDrawable(Drawable drawable) {
        this.f3305l = drawable;
        ImageView imageView = this.t;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public void setSliderHeight(float f) {
        this.f3306n = f;
        ImageView imageView = this.t;
        if (imageView != null) {
            imageView.getLayoutParams().height = (int) f;
        }
    }

    public void setSliderWidth(float f) {
        this.m = f;
        ImageView imageView = this.t;
        if (imageView != null) {
            imageView.getLayoutParams().width = (int) f;
        }
    }

    public void setTabsText(String[] strArr) {
        this.o = strArr;
        o();
    }

    public ViewPagerTabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = new String[]{"1", "2", "3", "4", "5"};
        this.A = null;
        this.B = null;
        this.C = 0;
        k(context, attributeSet);
    }

    public ViewPagerTabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = new String[]{"1", "2", "3", "4", "5"};
        this.A = null;
        this.B = null;
        this.C = 0;
        k(context, attributeSet);
    }
}
