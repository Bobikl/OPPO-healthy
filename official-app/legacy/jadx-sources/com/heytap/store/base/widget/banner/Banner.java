package com.heytap.store.base.widget.banner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import com.heytap.store.base.widget.R;
import com.heytap.store.base.widget.banner.adapter.BannerAdapter;
import com.heytap.store.base.widget.banner.config.BannerConfig;
import com.heytap.store.base.widget.banner.config.IndicatorConfig;
import com.heytap.store.base.widget.banner.indicator.Indicator;
import com.heytap.store.base.widget.banner.listener.OnBannerListener;
import com.heytap.store.base.widget.banner.listener.OnPageChangeListener;
import com.heytap.store.base.widget.banner.transformer.MZScaleInTransformer;
import com.heytap.store.base.widget.banner.transformer.ScaleInTransformer;
import com.heytap.store.base.widget.banner.util.BannerLifecycleObserver;
import com.heytap.store.base.widget.banner.util.BannerLifecycleObserverAdapter;
import com.heytap.store.base.widget.banner.util.BannerUtils;
import com.heytap.store.base.widget.banner.util.ScrollSpeedManger;
import com.heytap.store.platform.tools.LogUtils;
import com.heytap.store.platform.tools.SizeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class Banner<T, BA extends BannerAdapter> extends FrameLayout implements BannerLifecycleObserver {
    public static final int HORIZONTAL = 0;
    public static final int INVALID_VALUE = -1;
    public static final int VERTICAL = 1;
    private boolean disallowParentInterceptDownEvent;
    private int indicatorGravity;
    private int indicatorHeight;
    private int indicatorMargin;
    private int indicatorMarginBottom;
    private int indicatorMarginLeft;
    private int indicatorMarginRight;
    private int indicatorMarginTop;
    private int indicatorRadius;
    private int indicatorSpace;
    private boolean isIntercept;
    private boolean isSmoothScroll;
    private BA mAdapter;
    private RecyclerView.AdapterDataObserver mAdapterDataObserver;
    private float mBannerRadius;
    private CompositePageTransformer mCompositePageTransformer;
    private Paint mImagePaint;
    private Indicator mIndicator;
    private boolean mIsAutoLoop;
    private boolean mIsInfiniteLoop;
    private boolean mIsViewPager2Drag;
    private LifecycleObserver mLifecycleObserver;
    private AutoLoopTask mLoopTask;
    private long mLoopTime;
    private OnPageChangeListener mOnPageChangeListener;
    private Banner<T, BA>.BannerOnPageChangeCallback mPageChangeCallback;
    private Paint mRoundPaint;
    private int mScrollTime;
    private int mStartPosition;
    private float mStartX;
    private float mStartY;
    private int mTouchSlop;
    private ViewPager2 mViewPager2;
    private int normalColor;
    private int normalWidth;
    private int selectedColor;
    private int selectedWidth;

    public static class AutoLoopTask implements Runnable {
        private boolean isPause = false;
        private final WeakReference<Banner> reference;

        public AutoLoopTask(Banner banner) {
            this.reference = new WeakReference<>(banner);
        }

        @Override // java.lang.Runnable
        public void run() {
            Banner banner = this.reference.get();
            if (banner == null || !banner.mIsAutoLoop) {
                return;
            }
            if (this.isPause) {
                banner.removeCallbacks(banner.mLoopTask);
                return;
            }
            int itemCount = banner.getItemCount();
            if (itemCount == 0) {
                return;
            }
            int currentItem = (banner.getCurrentItem() + 1) % itemCount;
            if (banner.getCurrentItem() + 1 == itemCount) {
                return;
            }
            banner.setCurrentItem(currentItem, banner.isSmoothScroll);
            banner.removeCallbacks(banner.mLoopTask);
            banner.postDelayed(banner.mLoopTask, banner.mLoopTime);
        }
    }

    public class BannerOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {
        private boolean isScrolled;
        private int mTempPosition = -1;

        public BannerOnPageChangeCallback() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
            if (i == 1 || i == 2) {
                this.isScrolled = true;
            } else if (i == 0) {
                this.isScrolled = false;
                if (this.mTempPosition != -1 && Banner.this.mIsInfiniteLoop) {
                    int i2 = this.mTempPosition;
                    if (i2 == 0) {
                        Banner banner = Banner.this;
                        banner.setCurrentItem(banner.getRealCount(), false);
                    } else if (i2 == Banner.this.getItemCount() - 1) {
                        Banner.this.setCurrentItem(1, false);
                    }
                }
            }
            if (Banner.this.mOnPageChangeListener != null) {
                Banner.this.mOnPageChangeListener.onPageScrollStateChanged(i);
            }
            if (Banner.this.mIndicator != null) {
                Banner.this.mIndicator.onPageScrollStateChanged(i);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            int realPosition = BannerUtils.getRealPosition(Banner.this.isInfiniteLoop(), i, Banner.this.getRealCount());
            if (Banner.this.mOnPageChangeListener != null) {
                Banner.this.mOnPageChangeListener.onPageScrolled(realPosition, f, i2);
            }
            if (Banner.this.mIndicator != null) {
                Banner.this.mIndicator.onPageScrolled(realPosition, f, i2);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            if (this.isScrolled) {
                this.mTempPosition = i;
                int realPosition = BannerUtils.getRealPosition(Banner.this.isInfiniteLoop(), i, Banner.this.getRealCount());
                if (Banner.this.mOnPageChangeListener != null) {
                    Banner.this.mOnPageChangeListener.onPageSelected(realPosition);
                }
                if (Banner.this.mIndicator != null) {
                    Banner.this.mIndicator.onPageSelected(realPosition);
                }
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Orientation {
    }

    public Banner(Context context) {
        this(context, null);
    }

    private void drawBottomLeft(Canvas canvas) {
        int height = getHeight();
        Path path = new Path();
        float f = height;
        path.moveTo(0.0f, f - this.mBannerRadius);
        path.lineTo(0.0f, f);
        path.lineTo(this.mBannerRadius, f);
        float f2 = this.mBannerRadius;
        path.arcTo(new RectF(0.0f, f - (f2 * 2.0f), f2 * 2.0f, f), 90.0f, 90.0f);
        path.close();
        canvas.drawPath(path, this.mRoundPaint);
    }

    private void drawBottomRight(Canvas canvas) {
        int height = getHeight();
        int width = getWidth();
        Path path = new Path();
        float f = width;
        float f2 = height;
        path.moveTo(f - this.mBannerRadius, f2);
        path.lineTo(f, f2);
        path.lineTo(f, f2 - this.mBannerRadius);
        float f3 = this.mBannerRadius;
        path.arcTo(new RectF(f - (f3 * 2.0f), f2 - (f3 * 2.0f), f, f2), 0.0f, 90.0f);
        path.close();
        canvas.drawPath(path, this.mRoundPaint);
    }

    private void drawTopLeft(Canvas canvas) {
        Path path = new Path();
        path.moveTo(0.0f, this.mBannerRadius);
        path.lineTo(0.0f, 0.0f);
        path.lineTo(this.mBannerRadius, 0.0f);
        float f = this.mBannerRadius;
        path.arcTo(new RectF(0.0f, 0.0f, f * 2.0f, f * 2.0f), -90.0f, -90.0f);
        path.close();
        canvas.drawPath(path, this.mRoundPaint);
    }

    private void drawTopRight(Canvas canvas) {
        int width = getWidth();
        Path path = new Path();
        float f = width;
        path.moveTo(f - this.mBannerRadius, 0.0f);
        path.lineTo(f, 0.0f);
        path.lineTo(f, this.mBannerRadius);
        float f2 = this.mBannerRadius;
        path.arcTo(new RectF(f - (f2 * 2.0f), 0.0f, f, f2 * 2.0f), 0.0f, -90.0f);
        path.close();
        canvas.drawPath(path, this.mRoundPaint);
    }

    private void init(Context context) {
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop() / 2;
        this.mCompositePageTransformer = new CompositePageTransformer();
        this.mPageChangeCallback = new BannerOnPageChangeCallback();
        this.mLoopTask = new AutoLoopTask(this);
        ViewPager2 viewPager2 = new ViewPager2(context);
        this.mViewPager2 = viewPager2;
        viewPager2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.mViewPager2.setOffscreenPageLimit(1);
        this.mViewPager2.registerOnPageChangeCallback(this.mPageChangeCallback);
        this.mViewPager2.setPageTransformer(this.mCompositePageTransformer);
        ScrollSpeedManger.reflectLayoutManager(this);
        addView(this.mViewPager2);
        Paint paint = new Paint();
        this.mRoundPaint = paint;
        paint.setColor(-1);
        this.mRoundPaint.setAntiAlias(true);
        this.mRoundPaint.setStyle(Paint.Style.FILL);
        this.mRoundPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Paint paint2 = new Paint();
        this.mImagePaint = paint2;
        paint2.setXfermode(null);
    }

    private void initIndicator() {
        if (this.mIndicator == null || getAdapter() == null) {
            return;
        }
        if (this.mIndicator.getIndicatorConfig().isAttachToBanner()) {
            removeIndicator();
            addView(this.mIndicator.getIndicatorView());
        }
        initIndicatorAttr();
        setIndicatorPageChange();
    }

    private void initIndicatorAttr() {
        int i = this.indicatorMargin;
        if (i != 0) {
            setIndicatorMargins(new IndicatorConfig.Margins(i));
        } else {
            int i2 = this.indicatorMarginLeft;
            if (i2 != 0 || this.indicatorMarginTop != 0 || this.indicatorMarginRight != 0 || this.indicatorMarginBottom != 0) {
                setIndicatorMargins(new IndicatorConfig.Margins(i2, this.indicatorMarginTop, this.indicatorMarginRight, this.indicatorMarginBottom));
            }
        }
        int i3 = this.indicatorSpace;
        if (i3 > 0) {
            setIndicatorSpace(i3);
        }
        int i4 = this.indicatorGravity;
        if (i4 != 1) {
            setIndicatorGravity(i4);
        }
        int i5 = this.normalWidth;
        if (i5 > 0) {
            setIndicatorNormalWidth(i5);
        }
        int i6 = this.selectedWidth;
        if (i6 > 0) {
            setIndicatorSelectedWidth(i6);
        }
        int i7 = this.indicatorHeight;
        if (i7 > 0) {
            setIndicatorHeight(i7);
        }
        int i8 = this.indicatorRadius;
        if (i8 > 0) {
            setIndicatorRadius(i8);
        }
        setIndicatorNormalColor(this.normalColor);
        setIndicatorSelectedColor(this.selectedColor);
    }

    private void initTypedArray(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Banner);
        this.mBannerRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_banner_radius, 0);
        this.mLoopTime = typedArrayObtainStyledAttributes.getInt(R.styleable.Banner_banner_loop_time, BannerConfig.LOOP_TIME);
        this.mIsAutoLoop = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Banner_banner_auto_loop, true);
        this.mIsInfiniteLoop = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Banner_banner_infinite_loop, true);
        this.normalWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_banner_indicator_normal_width, BannerConfig.INDICATOR_NORMAL_WIDTH);
        this.selectedWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_banner_indicator_selected_width, BannerConfig.INDICATOR_SELECTED_WIDTH);
        this.normalColor = typedArrayObtainStyledAttributes.getColor(R.styleable.Banner_banner_indicator_normal_color, -1);
        this.selectedColor = typedArrayObtainStyledAttributes.getColor(R.styleable.Banner_banner_indicator_selected_color, BannerConfig.INDICATOR_SELECTED_COLOR);
        this.indicatorGravity = typedArrayObtainStyledAttributes.getInt(R.styleable.Banner_banner_indicator_gravity, 1);
        this.indicatorSpace = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_banner_indicator_space, 0);
        this.indicatorMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_banner_indicator_margin, 0);
        this.indicatorMarginLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_banner_indicator_marginLeft, 0);
        this.indicatorMarginTop = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_banner_indicator_marginTop, 0);
        this.indicatorMarginRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_banner_indicator_marginRight, 0);
        this.indicatorMarginBottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_banner_indicator_marginBottom, 0);
        this.indicatorHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_banner_indicator_height, BannerConfig.INDICATOR_HEIGHT);
        this.indicatorRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_banner_indicator_radius, BannerConfig.INDICATOR_RADIUS);
        setOrientation(typedArrayObtainStyledAttributes.getInt(R.styleable.Banner_banner_orientation, 0));
        setInfiniteLoop();
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setInfiniteLoop() {
        if (!isInfiniteLoop()) {
            isAutoLoop(false);
        }
        setStartPosition(isInfiniteLoop() ? 1 : 0);
    }

    private void setRecyclerViewPadding(int i) {
        setRecyclerViewPadding(i, i);
    }

    public Banner addBannerLifecycleObserver(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != null) {
            this.mLifecycleObserver = new BannerLifecycleObserverAdapter(lifecycleOwner, this);
            lifecycleOwner.getLifecycle().addObserver(this.mLifecycleObserver);
        }
        return this;
    }

    public Banner addItemDecoration(RecyclerView.ItemDecoration itemDecoration) {
        getViewPager2().addItemDecoration(itemDecoration);
        return this;
    }

    public Banner addOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.mOnPageChangeListener = onPageChangeListener;
        return this;
    }

    public Banner addPageTransformer(@Nullable ViewPager2.PageTransformer pageTransformer) {
        this.mCompositePageTransformer.addTransformer(pageTransformer);
        return this;
    }

    public void destroy() {
        if (getViewPager2() != null && this.mPageChangeCallback != null) {
            getViewPager2().unregisterOnPageChangeCallback(this.mPageChangeCallback);
            this.mPageChangeCallback = null;
        }
        stop();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.mBannerRadius <= 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.saveLayer(new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight()), this.mImagePaint, 31);
        super.dispatchDraw(canvas);
        drawTopLeft(canvas);
        drawTopRight(canvas);
        drawBottomLeft(canvas);
        drawBottomRight(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!getViewPager2().isUserInputEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3 || actionMasked == 4) {
            start();
        } else if (actionMasked == 0) {
            stop();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public BA getAdapter() {
        if (this.mAdapter == null) {
            LogUtils.INSTANCE.d("adapter is null");
        }
        return this.mAdapter;
    }

    public int getCurrentItem() {
        return getViewPager2().getCurrentItem();
    }

    public Indicator getIndicator() {
        if (this.mIndicator == null) {
            LogUtils.INSTANCE.d("should setIndicator() first");
        }
        return this.mIndicator;
    }

    public IndicatorConfig getIndicatorConfig() {
        if (getIndicator() != null) {
            return getIndicator().getIndicatorConfig();
        }
        return null;
    }

    public int getItemCount() {
        if (getAdapter() == null) {
            return 0;
        }
        return getAdapter().getItemCount();
    }

    public int getRealCount() {
        return getAdapter().getRealCount();
    }

    public RecyclerView getRecyclerView() {
        ViewPager2 viewPager2 = this.mViewPager2;
        if (viewPager2 != null) {
            return (RecyclerView) viewPager2.getChildAt(0);
        }
        return null;
    }

    public int getScrollTime() {
        return this.mScrollTime;
    }

    public ViewPager2 getViewPager2() {
        return this.mViewPager2;
    }

    public Banner isAutoLoop(boolean z) {
        this.mIsAutoLoop = z;
        return this;
    }

    public boolean isInfiniteLoop() {
        return this.mIsInfiniteLoop;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        start();
    }

    @Override // com.heytap.store.base.widget.banner.util.BannerLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        destroy();
        if (this.mLifecycleObserver != null) {
            lifecycleOwner.getLifecycle().removeObserver(this.mLifecycleObserver);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stop();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007a A[Catch: Exception -> 0x00a5, TryCatch #0 {Exception -> 0x00a5, blocks: (B:3:0x0001, B:6:0x0008, B:8:0x0012, B:11:0x0018, B:44:0x009b, B:19:0x0029, B:21:0x0049, B:27:0x0056, B:29:0x005e, B:37:0x0070, B:30:0x0061, B:36:0x006e, B:38:0x007a, B:39:0x0082, B:43:0x0098, B:46:0x00a0), top: B:49:0x0001 }] */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (getParent() == null) {
                return false;
            }
            if (getViewPager2().isUserInputEnabled() && this.isIntercept) {
                int action = motionEvent.getAction();
                boolean z = true;
                if (action == 0) {
                    this.mStartX = motionEvent.getX();
                    this.mStartY = motionEvent.getY();
                    ViewParent parent = getParent();
                    if (this.disallowParentInterceptDownEvent) {
                        z = false;
                    }
                    parent.requestDisallowInterceptTouchEvent(z);
                } else if (action == 1) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else if (action == 2) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float fAbs = Math.abs(x - this.mStartX);
                    float fAbs2 = Math.abs(y - this.mStartY);
                    if (getViewPager2().getOrientation() == 0) {
                        if (fAbs <= this.mTouchSlop || fAbs <= fAbs2) {
                            z = false;
                        }
                        this.mIsViewPager2Drag = z;
                        if (getRealCount() < 2) {
                            this.mIsViewPager2Drag = false;
                        }
                    } else {
                        if (fAbs2 <= this.mTouchSlop || fAbs2 <= fAbs) {
                            z = false;
                        }
                        this.mIsViewPager2Drag = z;
                    }
                    getParent().requestDisallowInterceptTouchEvent(this.mIsViewPager2Drag);
                } else if (action == 3) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.heytap.store.base.widget.banner.util.BannerLifecycleObserver
    public void onStart(LifecycleOwner lifecycleOwner) {
        start();
    }

    @Override // com.heytap.store.base.widget.banner.util.BannerLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner) {
        stop();
    }

    public Banner removeIndicator() {
        Indicator indicator = this.mIndicator;
        if (indicator != null) {
            removeView(indicator.getIndicatorView());
        }
        return this;
    }

    public Banner removeTransformer(ViewPager2.PageTransformer pageTransformer) {
        this.mCompositePageTransformer.removeTransformer(pageTransformer);
        return this;
    }

    public Banner setAdapter(BA ba) {
        if (ba == null) {
            throw new NullPointerException("adapter must not be null");
        }
        this.mAdapter = ba;
        if (!isInfiniteLoop()) {
            this.mAdapter.setIncreaseCount(0);
        }
        this.mAdapter.registerAdapterDataObserver(this.mAdapterDataObserver);
        this.mViewPager2.setAdapter(ba);
        setCurrentItem(this.mStartPosition, false);
        initIndicator();
        return this;
    }

    public Banner setBannerGalleryEffect(int i, int i2) {
        return setBannerGalleryEffect(i, i2, 0.85f);
    }

    public Banner setBannerGalleryMZ(int i) {
        return setBannerGalleryMZ(i, 0.88f);
    }

    public Banner setBannerRound(float f) {
        this.mBannerRadius = f;
        return this;
    }

    @RequiresApi(api = 21)
    public Banner setBannerRound2(float f) {
        BannerUtils.setBannerRound(this, f);
        return this;
    }

    public Banner setCurrentItem(int i) {
        return setCurrentItem(i, true);
    }

    public Banner setDatas(List<T> list) {
        if (getAdapter() != null) {
            getAdapter().setDatas(list);
            getAdapter().notifyDataSetChanged();
            setCurrentItem(this.mStartPosition, false);
            setIndicatorPageChange();
            start();
        }
        return this;
    }

    public void setDisallowParentInterceptDownEvent(boolean z) {
        this.disallowParentInterceptDownEvent = z;
    }

    public Banner setIndicator(Indicator indicator) {
        return setIndicator(indicator, true);
    }

    public Banner setIndicatorGravity(int i) {
        Indicator indicator = this.mIndicator;
        if (indicator != null && indicator.getIndicatorConfig().isAttachToBanner()) {
            this.mIndicator.getIndicatorConfig().setGravity(i);
            this.mIndicator.getIndicatorView().postInvalidate();
        }
        return this;
    }

    public Banner<T, BA> setIndicatorHeight(int i) {
        Indicator indicator = this.mIndicator;
        if (indicator != null) {
            indicator.getIndicatorConfig().setHeight(i);
        }
        return this;
    }

    public Banner setIndicatorMargins(IndicatorConfig.Margins margins) {
        Indicator indicator = this.mIndicator;
        if (indicator != null && indicator.getIndicatorConfig().isAttachToBanner()) {
            this.mIndicator.getIndicatorConfig().setMargins(margins);
            this.mIndicator.getIndicatorView().requestLayout();
        }
        return this;
    }

    public Banner setIndicatorNormalColor(@ColorInt int i) {
        Indicator indicator = this.mIndicator;
        if (indicator != null) {
            indicator.getIndicatorConfig().setNormalColor(i);
        }
        return this;
    }

    public Banner setIndicatorNormalColorRes(@ColorRes int i) {
        setIndicatorNormalColor(ContextCompat.getColor(getContext(), i));
        return this;
    }

    public Banner setIndicatorNormalWidth(int i) {
        Indicator indicator = this.mIndicator;
        if (indicator != null) {
            indicator.getIndicatorConfig().setNormalWidth(i);
        }
        return this;
    }

    public Banner setIndicatorPageChange() {
        if (this.mIndicator != null) {
            this.mIndicator.onPageChanged(getRealCount(), BannerUtils.getRealPosition(isInfiniteLoop(), getCurrentItem(), getRealCount()));
        }
        return this;
    }

    public Banner<T, BA> setIndicatorRadius(int i) {
        Indicator indicator = this.mIndicator;
        if (indicator != null) {
            indicator.getIndicatorConfig().setRadius(i);
        }
        return this;
    }

    public Banner setIndicatorSelectedColor(@ColorInt int i) {
        Indicator indicator = this.mIndicator;
        if (indicator != null) {
            indicator.getIndicatorConfig().setSelectedColor(i);
        }
        return this;
    }

    public Banner setIndicatorSelectedColorRes(@ColorRes int i) {
        setIndicatorSelectedColor(ContextCompat.getColor(getContext(), i));
        return this;
    }

    public Banner setIndicatorSelectedWidth(int i) {
        Indicator indicator = this.mIndicator;
        if (indicator != null) {
            indicator.getIndicatorConfig().setSelectedWidth(i);
        }
        return this;
    }

    public Banner setIndicatorSpace(int i) {
        Indicator indicator = this.mIndicator;
        if (indicator != null) {
            indicator.getIndicatorConfig().setIndicatorSpace(i);
        }
        return this;
    }

    public Banner setIndicatorWidth(int i, int i2) {
        Indicator indicator = this.mIndicator;
        if (indicator != null) {
            indicator.getIndicatorConfig().setNormalWidth(i);
            this.mIndicator.getIndicatorConfig().setSelectedWidth(i2);
        }
        return this;
    }

    public Banner setIntercept(boolean z) {
        this.isIntercept = z;
        return this;
    }

    public Banner setLoopTime(long j2) {
        this.mLoopTime = j2;
        return this;
    }

    public Banner setOnBannerListener(OnBannerListener onBannerListener) {
        if (getAdapter() != null) {
            getAdapter().setOnBannerListener(onBannerListener);
        }
        return this;
    }

    public Banner setOrientation(int i) {
        getViewPager2().setOrientation(i);
        return this;
    }

    public Banner setPageTransformer(@Nullable ViewPager2.PageTransformer pageTransformer) {
        getViewPager2().setPageTransformer(pageTransformer);
        return this;
    }

    public Banner setScrollTime(int i) {
        this.mScrollTime = i;
        return this;
    }

    public Banner setSmoothScroll(boolean z) {
        this.isSmoothScroll = z;
        return this;
    }

    public Banner setStartPosition(int i) {
        this.mStartPosition = i;
        return this;
    }

    public Banner setTouchSlop(int i) {
        this.mTouchSlop = i;
        return this;
    }

    public Banner setUserInputEnabled(boolean z) {
        getViewPager2().setUserInputEnabled(z);
        return this;
    }

    public Banner start() {
        if (this.mIsAutoLoop && getItemCount() > 1) {
            stop();
            removeCallbacks(this.mLoopTask);
            this.mLoopTask.isPause = false;
            postDelayed(this.mLoopTask, this.mLoopTime);
        }
        return this;
    }

    public Banner stop() {
        if (this.mIsAutoLoop) {
            this.mLoopTask.isPause = true;
            removeCallbacks(this.mLoopTask);
        }
        return this;
    }

    public Banner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setRecyclerViewPadding(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) getViewPager2().getChildAt(0);
        if (getViewPager2().getOrientation() == 1) {
            recyclerView.setPadding(0, i, 0, i2);
        } else {
            recyclerView.setPadding(i, 0, i2, 0);
        }
        recyclerView.setClipToPadding(false);
    }

    public Banner addItemDecoration(RecyclerView.ItemDecoration itemDecoration, int i) {
        getViewPager2().addItemDecoration(itemDecoration, i);
        return this;
    }

    public Banner setBannerGalleryEffect(int i, int i2, int i3) {
        return setBannerGalleryEffect(i, i2, i3, 0.85f);
    }

    public Banner setBannerGalleryMZ(int i, float f) {
        if (f < 1.0f && f > 0.0f) {
            addPageTransformer(new MZScaleInTransformer(f));
        }
        setRecyclerViewPadding(SizeUtils.INSTANCE.dp2px(i));
        return this;
    }

    public Banner setCurrentItem(int i, boolean z) {
        getViewPager2().setCurrentItem(i, z);
        return this;
    }

    public Banner setIndicator(Indicator indicator, boolean z) {
        removeIndicator();
        indicator.getIndicatorConfig().setAttachToBanner(z);
        this.mIndicator = indicator;
        initIndicator();
        return this;
    }

    public Banner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIsInfiniteLoop = true;
        this.mIsAutoLoop = true;
        this.mLoopTime = 3500L;
        this.mScrollTime = 800;
        this.mStartPosition = 1;
        this.mBannerRadius = 0.0f;
        this.isSmoothScroll = true;
        this.normalWidth = BannerConfig.INDICATOR_NORMAL_WIDTH;
        this.selectedWidth = BannerConfig.INDICATOR_SELECTED_WIDTH;
        this.normalColor = -1;
        this.selectedColor = BannerConfig.INDICATOR_SELECTED_COLOR;
        this.indicatorGravity = 1;
        this.indicatorHeight = BannerConfig.INDICATOR_HEIGHT;
        this.indicatorRadius = BannerConfig.INDICATOR_RADIUS;
        this.isIntercept = true;
        this.disallowParentInterceptDownEvent = false;
        this.mAdapterDataObserver = new RecyclerView.AdapterDataObserver() { // from class: com.heytap.store.base.widget.banner.Banner.1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                if (Banner.this.getItemCount() <= 1) {
                    Banner.this.stop();
                } else {
                    Banner.this.start();
                }
                Banner.this.setIndicatorPageChange();
            }
        };
        init(context);
        initTypedArray(context, attributeSet);
    }

    public Banner setBannerGalleryEffect(int i, int i2, float f) {
        return setBannerGalleryEffect(i, i, i2, f);
    }

    public Banner setBannerGalleryEffect(int i, int i2, int i3, float f) {
        if (i3 > 0) {
            addPageTransformer(new MarginPageTransformer(SizeUtils.INSTANCE.dp2px(i3)));
        }
        if (f < 1.0f && f > 0.0f) {
            addPageTransformer(new ScaleInTransformer(f));
        }
        setRecyclerViewPadding(i > 0 ? SizeUtils.INSTANCE.dp2px(i + i3) : 0, i2 > 0 ? SizeUtils.INSTANCE.dp2px(i2 + i3) : 0);
        return this;
    }

    public Banner setAdapter(BA ba, boolean z) {
        this.mIsInfiniteLoop = z;
        setInfiniteLoop();
        setAdapter(ba);
        return this;
    }
}
