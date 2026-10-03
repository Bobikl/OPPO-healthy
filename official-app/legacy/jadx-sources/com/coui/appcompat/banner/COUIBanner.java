package com.coui.appcompat.banner;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import com.coui.appcompat.banner.adapter.COUIBannerBaseAdapter;
import com.coui.appcompat.banner.pageTransformer.COUIMarginPageTransformer;
import com.coui.appcompat.banner.pageTransformer.COUIScalePageTransformer;
import com.heytap.health.watch.notification.impl.ui.j;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.hn2;
import com.oplus.aiunit.vision.kf2;
import com.support.nearx.R$id;
import com.support.nearx.R$layout;
import com.support.nearx.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIBanner extends ConstraintLayout {
    public static final int EXPAND_TYPE = 1;
    public static final int NORMAL_TYPE = 0;
    public Interpolator A;
    public final Runnable B;
    public COUIBannerRecyclerView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewPager2 f1538j;
    public hn2 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public COUIPageIndicatorKit f1539l;
    public COUIBannerBaseAdapter m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CompositePageTransformer f1540n;
    public ViewPager2.OnPageChangeCallback o;
    public COUIBannerOnPageChangeCallback p;
    public int q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            COUIBanner.this.nextItem();
            if (COUIBanner.this.isAutoLoop()) {
                COUIBanner.this.startLoopTask();
            }
        }
    }

    public COUIBanner(@NonNull Context context) {
        this(context, null);
    }

    private void setInfiniteLoop(boolean z) {
        this.w = z;
        if (!isInfiniteLoop()) {
            setAutoLoop(false);
        }
        setStartPosition(isInfiniteLoop() ? this.q : 0);
    }

    private void setRecyclerViewPadding(int i) {
        setRecyclerViewPadding(i, i);
    }

    private void setTypeWithDataChange(int i) {
        this.x = i;
        initView();
        COUIBannerBaseAdapter cOUIBannerBaseAdapter = this.m;
        if (cOUIBannerBaseAdapter == null) {
            bj2.c("COUIBanner", "setTypeWithDataChange mBannerAdapter is null");
        } else {
            cOUIBannerBaseAdapter.setAdapterType(i);
            setBannerAdapter(this.m);
        }
    }

    public void addPageTransformer(@NonNull ViewPager2.PageTransformer pageTransformer) {
        this.f1540n.addTransformer(pageTransformer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if ((action == 1 || action == 3) && isAutoLoop() && this.x == 0) {
                startLoopTask();
            }
        } else if (isAutoLoop() && this.x == 0) {
            removeLoopTask();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void f(COUIBannerBaseAdapter cOUIBannerBaseAdapter, boolean z) {
        this.m = cOUIBannerBaseAdapter;
        cOUIBannerBaseAdapter.setAdapterType(getType());
        if (this.x != 0) {
            this.i.setAdapter(cOUIBannerBaseAdapter);
            return;
        }
        setInfiniteLoop(z);
        this.f1538j.setAdapter(cOUIBannerBaseAdapter);
        setCurrentItem(this.q, false);
        initIndicator();
    }

    public COUIBannerBaseAdapter getAdapter() {
        return this.m;
    }

    public int getCurrentItem() {
        return this.f1538j.getCurrentItem();
    }

    public COUIPageIndicatorKit getIndicator() {
        return this.f1539l;
    }

    public int getItemCount() {
        if (getAdapter() != null) {
            return getAdapter().getItemCount();
        }
        return 0;
    }

    public int getLeftItemWidth() {
        return this.t;
    }

    public int getLoopDuration() {
        return this.s;
    }

    public ViewPager2.OnPageChangeCallback getOnPageChangeCallback() {
        return this.o;
    }

    public int getPageMargin() {
        return this.v;
    }

    public int getRealCount() {
        if (getAdapter() != null) {
            return getAdapter().getRealCount();
        }
        return 0;
    }

    public int getRightItemWidth() {
        return this.u;
    }

    public int getType() {
        return this.x;
    }

    public final void initIndicator() {
        this.f1539l.setDotsCount(this.m.getRealCount());
        this.f1539l.setCurrentPosition(0);
    }

    public final void initNormalData() {
        this.p = new COUIBannerOnPageChangeCallback(this);
        this.f1540n = new CompositePageTransformer();
        this.f1538j.setOrientation(0);
        this.f1538j.setOffscreenPageLimit(2);
        this.f1538j.registerOnPageChangeCallback(this.p);
        this.f1538j.setPageTransformer(this.f1540n);
        hn2 hn2Var = new hn2(this.f1538j);
        this.k = hn2Var;
        hn2Var.f(this.z);
        this.k.g(this.A);
        setSlideEffect(this.t, this.u, this.v, 1.0f);
    }

    public final void initView() {
        this.f1538j = (ViewPager2) findViewById(R$id.viewpager);
        this.f1539l = (COUIPageIndicatorKit) findViewById(R$id.indicator);
        COUIBannerRecyclerView cOUIBannerRecyclerView = (COUIBannerRecyclerView) findViewById(R$id.recycler);
        this.i = cOUIBannerRecyclerView;
        if (this.x == 0) {
            this.f1539l.setVisibility(0);
            this.f1538j.setVisibility(0);
            this.i.setVisibility(8);
        } else {
            cOUIBannerRecyclerView.setVisibility(0);
            this.f1539l.setVisibility(8);
            this.f1538j.setVisibility(8);
        }
    }

    public boolean isAutoLoop() {
        return this.r;
    }

    public boolean isInfiniteLoop() {
        return this.w;
    }

    public void nextItem() {
        if (this.x != 0) {
            return;
        }
        this.k.h(((-(getPageMargin() * 2)) - getLeftItemWidth()) - getRightItemWidth());
        this.k.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isAutoLoop() && this.x == 0) {
            startLoopTask();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.screenWidthDp >= 600) {
            setTypeWithDataChange(1);
            return;
        }
        int i = this.x;
        int i2 = this.y;
        if (i != i2) {
            setType(i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    public final void parseAttr(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIBanner);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIBanner_couiBannerType, 0);
        this.x = integer;
        this.y = integer;
        this.r = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIBanner_couiAutoLoop, true);
        this.s = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIBanner_couiLoopDuration, 5);
        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIBanner_couiLeftItemWidth, 0);
        this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIBanner_couiRightItemWidth, 0);
        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIBanner_couiPageMargin, kf2.DEF_PAGE_MARGIN);
        if (getContext().getResources().getConfiguration().screenWidthDp >= 600) {
            this.x = 1;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void release() {
        if (getHandler() != null) {
            bj2.c("COUIBanner", "release getHandler() is null");
            getHandler().removeCallbacksAndMessages(null);
        }
        this.i.removeAllViews();
        this.f1538j.removeAllViews();
        this.f1539l.removeAllViews();
    }

    public final void removeLoopTask() {
        if (getHandler() == null) {
            bj2.c("COUIBanner", "removeLoopTask getHandler() is null");
        } else {
            getHandler().removeCallbacks(this.B);
        }
    }

    public void setAutoLoop(boolean z) {
        if (!z) {
            removeLoopTask();
        } else if (this.x == 0) {
            startLoopTask();
        }
        if (this.x == 1) {
            return;
        }
        this.r = z;
    }

    public void setBannerAdapter(COUIBannerBaseAdapter cOUIBannerBaseAdapter) {
        f(cOUIBannerBaseAdapter, true);
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public void setDuration(int i) {
        this.z = i;
        this.k.f(i);
    }

    public void setInterpolator(Interpolator interpolator) {
        this.A = interpolator;
        this.k.g(interpolator);
    }

    public void setLeftItemWidth(int i) {
        this.t = i;
        setSlideEffect(i, this.u, this.v, 1.0f);
    }

    public void setLoopDuration(int i) {
        this.s = i;
        if (isAutoLoop() && this.x == 0) {
            startLoopTask();
        }
    }

    public void setPageMargin(int i) {
        this.v = i;
        setSlideEffect(this.t, this.u, i, 1.0f);
    }

    public void setPageTransformer(@NonNull ViewPager2.PageTransformer pageTransformer) {
        this.f1538j.setPageTransformer(pageTransformer);
    }

    public void setRightItemWidth(int i) {
        this.u = i;
        setSlideEffect(this.t, i, this.v, 1.0f);
    }

    public void setSlideEffect(@Px int i, @Px int i2, @Px int i3, float f) {
        if (i3 > 0) {
            addPageTransformer(new COUIMarginPageTransformer(i3));
        }
        if (f < 1.0f && f > 0.0f) {
            addPageTransformer(new COUIScalePageTransformer(f));
        }
        setRecyclerViewPadding(i + i3, i2 + i3);
    }

    public void setStartPosition(int i) {
        this.q = i;
    }

    public void setType(int i) {
        this.x = i;
        this.y = i;
        setTypeWithDataChange(i);
    }

    public final void startLoopTask() {
        if (getHandler() == null) {
            bj2.c("COUIBanner", "startLoopTask getHandler() is null");
        } else {
            getHandler().removeCallbacks(this.B);
            getHandler().postDelayed(this.B, (((long) this.s) * 1000) + ((long) this.z));
        }
    }

    public COUIBanner(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setCurrentItem(int i, boolean z) {
        this.f1538j.setCurrentItem(i, z);
    }

    public final void setRecyclerViewPadding(int i, int i2) {
        if (this.f1538j.getOrientation() == 1) {
            ViewPager2 viewPager2 = this.f1538j;
            viewPager2.setPadding(viewPager2.getPaddingLeft(), i, this.f1538j.getPaddingRight(), i2);
        } else {
            ViewPager2 viewPager3 = this.f1538j;
            viewPager3.setPadding(i, viewPager3.getPaddingTop(), i2, this.f1538j.getPaddingBottom());
        }
        this.f1538j.setClipToPadding(false);
        this.f1538j.setClipChildren(false);
    }

    public COUIBanner(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = 1;
        this.r = true;
        this.s = 5;
        this.t = 0;
        this.u = 0;
        this.v = kf2.DEF_PAGE_MARGIN;
        this.w = true;
        this.x = 0;
        this.y = 0;
        this.z = j.VIEW_TYPE_SWITCH_FLASHBACK;
        this.A = new PathInterpolator(0.2f, 0.0f, 0.1f, 1.0f);
        this.B = new a();
        LayoutInflater.from(context).inflate(R$layout.coui_banner_content_layout, this);
        if (attributeSet != null) {
            parseAttr(context, attributeSet);
        }
        initView();
        initNormalData();
    }
}
