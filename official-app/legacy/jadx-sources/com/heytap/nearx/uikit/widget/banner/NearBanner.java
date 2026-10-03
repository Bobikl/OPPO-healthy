package com.heytap.nearx.uikit.widget.banner;

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
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.banner.adapter.NearBannerBaseAdapter;
import com.heytap.nearx.uikit.widget.banner.pageTransformer.NearScalePageTransformer;
import com.heytap.nearx.uikit.widget.indicator.NearPageIndicatorKit;
import com.heytap.nearx.uikit.widget.viewPager.NearViewPager2SlideHelper;

/* JADX INFO: loaded from: classes18.dex */
public class NearBanner extends ConstraintLayout {
    public static final int EXPAND_TYPE = 1;
    public static final int NORMAL_TYPE = 0;
    private final Runnable loopTask;
    private NearBannerBaseAdapter mBannerAdapter;
    private CompositePageTransformer mCompositePageTransformer;
    protected NearPageIndicatorKit mIndicator;
    private boolean mIsAutoLoop;
    private boolean mIsInfiniteLoop;
    private int mLeftItemWidth;
    private int mLoopDuration;
    private NearBannerOnPageChangeCallback mNearBannerOnPageChangeCallback;
    private ViewPager2.OnPageChangeCallback mOnPageChangeCallback;
    private int mPageMargin;
    protected NearBannerRecyclerView mRecyclerView;
    private int mRightItemWidth;
    private int mStartPosition;
    protected ViewPager2 mViewPager2;
    protected NearViewPager2SlideHelper mViewPager2SlideHelper;
    private int type;
    private int type_backup;

    public NearBanner(@NonNull Context context) {
        this(context, null);
    }

    private void initIndicator() {
        this.mIndicator.setDotsCount(this.mBannerAdapter.getRealCount());
        this.mIndicator.setCurrentPosition(0);
    }

    private void initNormalData() {
        this.mNearBannerOnPageChangeCallback = new NearBannerOnPageChangeCallback(this);
        this.mCompositePageTransformer = new CompositePageTransformer();
        this.mViewPager2.setOrientation(0);
        this.mViewPager2.setOffscreenPageLimit(2);
        this.mViewPager2.registerOnPageChangeCallback(this.mNearBannerOnPageChangeCallback);
        this.mViewPager2.setPageTransformer(this.mCompositePageTransformer);
        NearViewPager2SlideHelper nearViewPager2SlideHelper = new NearViewPager2SlideHelper(this.mViewPager2);
        this.mViewPager2SlideHelper = nearViewPager2SlideHelper;
        nearViewPager2SlideHelper.setDuration(950L);
        this.mViewPager2SlideHelper.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.1f, 1.0f));
        setSlideEffect(this.mLeftItemWidth, this.mRightItemWidth, this.mPageMargin, 1.0f);
    }

    private void initView() {
        this.mViewPager2 = (ViewPager2) findViewById(R$id.viewpager);
        this.mIndicator = (NearPageIndicatorKit) findViewById(R$id.indicator);
        NearBannerRecyclerView nearBannerRecyclerView = (NearBannerRecyclerView) findViewById(R$id.recycler);
        this.mRecyclerView = nearBannerRecyclerView;
        if (this.type == 0) {
            this.mIndicator.setVisibility(0);
            this.mViewPager2.setVisibility(0);
            this.mRecyclerView.setVisibility(4);
        } else {
            nearBannerRecyclerView.setVisibility(0);
            this.mIndicator.setVisibility(4);
            this.mViewPager2.setVisibility(4);
        }
    }

    private void parseAttr(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearBanner);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.NearBanner_nxBannerType, 0);
        this.type = integer;
        this.type_backup = integer;
        this.mIsAutoLoop = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearBanner_nxAutoLoop, true);
        this.mLoopDuration = typedArrayObtainStyledAttributes.getInteger(R$styleable.NearBanner_nxLoopDuration, 5);
        this.mLeftItemWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearBanner_nxLeftItemWidth, 0);
        this.mRightItemWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearBanner_nxRightItemWidth, 0);
        this.mPageMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearBanner_nxPageMargin, NearBannerUtil.DEF_PAGE_MARGIN);
        if (getContext().getResources().getConfiguration().screenWidthDp >= 600) {
            this.type = 1;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void removeLoopTask() {
        getHandler().removeCallbacks(this.loopTask);
    }

    private void setBannerAdapter(NearBannerBaseAdapter nearBannerBaseAdapter, boolean z) {
        this.mBannerAdapter = nearBannerBaseAdapter;
        nearBannerBaseAdapter.setAdapterType(getType());
        if (this.type != 0) {
            this.mRecyclerView.setAdapter(nearBannerBaseAdapter);
            return;
        }
        setInfiniteLoop(z);
        this.mViewPager2.setAdapter(nearBannerBaseAdapter);
        setCurrentItem(this.mStartPosition, false);
        initIndicator();
    }

    private void setInfiniteLoop(boolean z) {
        this.mIsInfiniteLoop = z;
        if (!isInfiniteLoop()) {
            setAutoLoop(false);
        }
        setStartPosition(isInfiniteLoop() ? this.mStartPosition : 0);
    }

    private void setRecyclerViewPadding(int i) {
        setRecyclerViewPadding(i, i);
    }

    private void setTypeWithDataChange(int i) {
        this.type = i;
        this.mBannerAdapter.setAdapterType(i);
        initView();
        setBannerAdapter(this.mBannerAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLoopTask() {
        getHandler().removeCallbacks(this.loopTask);
        getHandler().postDelayed(this.loopTask, (((long) this.mLoopDuration) * 1000) + this.mViewPager2SlideHelper.getDuration());
    }

    public void addOnPageChangeCallback(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.mOnPageChangeCallback = onPageChangeCallback;
    }

    public void addPageTransformer(@NonNull ViewPager2.PageTransformer pageTransformer) {
        this.mCompositePageTransformer.addTransformer(pageTransformer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if ((action == 1 || action == 3) && isAutoLoop() && this.type == 0) {
                startLoopTask();
            }
        } else if (isAutoLoop() && this.type == 0) {
            removeLoopTask();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public NearBannerBaseAdapter getAdapter() {
        return this.mBannerAdapter;
    }

    public int getCurrentItem() {
        return this.mViewPager2.getCurrentItem();
    }

    public NearPageIndicatorKit getIndicator() {
        return this.mIndicator;
    }

    public int getItemCount() {
        if (getAdapter() != null) {
            return getAdapter().getItemCount();
        }
        return 0;
    }

    public int getLeftItemWidth() {
        return this.mLeftItemWidth;
    }

    public int getLoopDuration() {
        return this.mLoopDuration;
    }

    public ViewPager2.OnPageChangeCallback getOnPageChangeCallback() {
        return this.mOnPageChangeCallback;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public int getRealCount() {
        if (getAdapter() != null) {
            return getAdapter().getRealCount();
        }
        return 0;
    }

    public int getRightItemWidth() {
        return this.mRightItemWidth;
    }

    public int getType() {
        return this.type;
    }

    public boolean isAutoLoop() {
        return this.mIsAutoLoop;
    }

    public boolean isInfiniteLoop() {
        return this.mIsInfiniteLoop;
    }

    public void nextItem() {
        if (this.type != 0) {
            return;
        }
        this.mViewPager2SlideHelper.setOffset(((-(getPageMargin() * 2)) - getLeftItemWidth()) - getRightItemWidth());
        this.mViewPager2SlideHelper.nextItem();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isAutoLoop() && this.type == 0) {
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
        int i = this.type;
        int i2 = this.type_backup;
        if (i != i2) {
            setType(i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    public void previousItem() {
        if (this.type != 0) {
            return;
        }
        this.mViewPager2SlideHelper.setOffset(((-(getPageMargin() * 2)) - getLeftItemWidth()) - getRightItemWidth());
        this.mViewPager2SlideHelper.previousItem();
    }

    public void release() {
        getHandler().removeCallbacksAndMessages(null);
        this.mRecyclerView.removeAllViews();
        this.mViewPager2.removeAllViews();
        this.mIndicator.removeAllViews();
    }

    public void removeTransformer(@NonNull ViewPager2.PageTransformer pageTransformer) {
        this.mCompositePageTransformer.removeTransformer(pageTransformer);
    }

    public void setAutoLoop(boolean z) {
        if (!z) {
            removeLoopTask();
        } else if (this.type == 0) {
            startLoopTask();
        }
        if (this.type == 1) {
            return;
        }
        this.mIsAutoLoop = z;
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public void setDuration(int i) {
        this.mViewPager2SlideHelper.setDuration(i);
    }

    public void setInterpolator(Interpolator interpolator) {
        this.mViewPager2SlideHelper.setInterpolator(interpolator);
    }

    public void setLeftItemWidth(int i) {
        this.mLeftItemWidth = i;
        setSlideEffect(i, this.mRightItemWidth, this.mPageMargin, 1.0f);
    }

    public void setLoopDuration(int i) {
        this.mLoopDuration = i;
        if (isAutoLoop() && this.type == 0) {
            startLoopTask();
        }
    }

    public void setPageMargin(int i) {
        this.mPageMargin = i;
        setSlideEffect(this.mLeftItemWidth, this.mRightItemWidth, i, 1.0f);
    }

    public void setPageTransformer(@NonNull ViewPager2.PageTransformer pageTransformer) {
        this.mViewPager2.setPageTransformer(pageTransformer);
    }

    public void setRightItemWidth(int i) {
        this.mRightItemWidth = i;
        setSlideEffect(this.mLeftItemWidth, i, this.mPageMargin, 1.0f);
    }

    public void setSlideEffect(@Px int i, @Px int i2, @Px int i3, float f) {
        if (i3 > 0) {
            addPageTransformer(new MarginPageTransformer(i3));
        }
        if (f < 1.0f && f > 0.0f) {
            addPageTransformer(new NearScalePageTransformer(f));
        }
        setRecyclerViewPadding(i + i3, i2 + i3);
    }

    public void setStartPosition(int i) {
        this.mStartPosition = i;
    }

    public void setType(int i) {
        this.type = i;
        this.type_backup = i;
        setTypeWithDataChange(i);
    }

    public NearBanner(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setRecyclerViewPadding(int i, int i2) {
        if (this.mViewPager2.getOrientation() == 1) {
            ViewPager2 viewPager2 = this.mViewPager2;
            viewPager2.setPadding(viewPager2.getPaddingLeft(), i, this.mViewPager2.getPaddingRight(), i2);
        } else {
            ViewPager2 viewPager3 = this.mViewPager2;
            viewPager3.setPadding(i, viewPager3.getPaddingTop(), i2, this.mViewPager2.getPaddingBottom());
        }
        this.mViewPager2.setClipToPadding(false);
        this.mViewPager2.setClipChildren(false);
    }

    public void setCurrentItem(int i, boolean z) {
        this.mViewPager2.setCurrentItem(i, z);
    }

    public NearBanner(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mStartPosition = 1;
        this.mIsAutoLoop = true;
        this.mLoopDuration = 5;
        this.mLeftItemWidth = 0;
        this.mRightItemWidth = 0;
        this.mPageMargin = NearBannerUtil.DEF_PAGE_MARGIN;
        this.mIsInfiniteLoop = true;
        this.type = 0;
        this.type_backup = 0;
        this.loopTask = new Runnable() { // from class: com.heytap.nearx.uikit.widget.banner.NearBanner.1
            @Override // java.lang.Runnable
            public void run() {
                NearBanner.this.nextItem();
                if (NearBanner.this.isAutoLoop()) {
                    NearBanner.this.startLoopTask();
                }
            }
        };
        LayoutInflater.from(context).inflate(R$layout.nx_banner_content_layout, this);
        if (attributeSet != null) {
            parseAttr(context, attributeSet);
        }
        initView();
        initNormalData();
    }

    public void setBannerAdapter(NearBannerBaseAdapter nearBannerBaseAdapter) {
        setBannerAdapter(nearBannerBaseAdapter, true);
    }
}
