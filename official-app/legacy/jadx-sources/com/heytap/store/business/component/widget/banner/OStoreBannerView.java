package com.heytap.store.business.component.widget.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.heytap.store.base.widget.banner.listener.OnPageChangeListener;
import com.heytap.store.base.widget.recycler.BannerIndicatorView;
import com.heytap.store.base.widget.recycler.OnSnapPositionChangeListener;
import com.heytap.store.business.component.adapter.banner.OStoreBannerViewAdapter;
import com.heytap.store.business.component.entity.BannerDetail;
import com.oplus.channel.client.data.Action;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u00101\u001a\u00020\n2\u0006\u00102\u001a\u000203H\u0016J\u0006\u00104\u001a\u00020\u0007J\u0006\u00105\u001a\u00020\u0007J\u0006\u00106\u001a\u00020\u0007J\u0019\u00107\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u00109J\b\u0010:\u001a\u0004\u0018\u00010;J\b\u0010<\u001a\u00020=H\u0014J\b\u0010>\u001a\u00020=H\u0014J\u0010\u0010?\u001a\u00020\n2\u0006\u0010@\u001a\u000203H\u0016J\u0016\u0010A\u001a\u00020=2\u0006\u00108\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\nJL\u0010C\u001a\u00020=2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020F0E2\b\u0010G\u001a\u0004\u0018\u00010H2\b\b\u0002\u0010I\u001a\u00020%2\"\b\u0002\u0010J\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020=\u0018\u00010KJ\u000e\u0010L\u001a\u00020=2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010M\u001a\u00020=J\u0006\u0010N\u001a\u00020=R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020,X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006O"}, d2 = {"Lcom/heytap/store/business/component/widget/banner/OStoreBannerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defaultStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "disallowParentInterceptDownEvent", "", "isAutoLoop", "()Z", "setAutoLoop", "(Z)V", "isIntercept", "isRegisgterOnPageChangeCallback", "mIsViewPager2Drag", "mLoopTask", "Lcom/heytap/store/business/component/widget/banner/BannerLoopTask;", "getMLoopTask", "()Lcom/heytap/store/business/component/widget/banner/BannerLoopTask;", "setMLoopTask", "(Lcom/heytap/store/business/component/widget/banner/BannerLoopTask;)V", "mLoopTime", "", "getMLoopTime", "()J", "setMLoopTime", "(J)V", "mOnPageChangeListener", "Lcom/heytap/store/base/widget/banner/listener/OnPageChangeListener;", "getMOnPageChangeListener", "()Lcom/heytap/store/base/widget/banner/listener/OnPageChangeListener;", "setMOnPageChangeListener", "(Lcom/heytap/store/base/widget/banner/listener/OnPageChangeListener;)V", "mStartX", "", "mStartY", "mTouchSlop", "scrollTime", "getScrollTime", "()I", "viewPager2", "Landroidx/viewpager2/widget/ViewPager2;", "getViewPager2", "()Landroidx/viewpager2/widget/ViewPager2;", "setViewPager2", "(Landroidx/viewpager2/widget/ViewPager2;)V", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "findFirstPosition", "getCurrentItem", "getItemCount", "getRealPosition", "position", "(Ljava/lang/Integer;)Ljava/lang/Integer;", "getRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onAttachedToWindow", "", "onDetachedFromWindow", "onInterceptTouchEvent", "event", "setCurrentItem", "smoothScroll", "setData", "list", "", "Lcom/heytap/store/business/component/entity/BannerDetail;", "indicator", "Lcom/heytap/store/base/widget/recycler/BannerIndicatorView;", "itemCorner", "clickAction", "Lkotlin/Function3;", "setDisallowParentInterceptDownEvent", "start", Action.LIFE_CIRCLE_VALUE_STOP, "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreBannerView extends FrameLayout {

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private boolean disallowParentInterceptDownEvent;
    private boolean isAutoLoop;
    private boolean isIntercept;
    private boolean isRegisgterOnPageChangeCallback;
    private boolean mIsViewPager2Drag;
    public BannerLoopTask mLoopTask;
    private long mLoopTime;

    @Nullable
    private OnPageChangeListener mOnPageChangeListener;
    private float mStartX;
    private float mStartY;
    private int mTouchSlop;
    private final int scrollTime;
    public ViewPager2 viewPager2;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreBannerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ Integer getRealPosition$default(OStoreBannerView oStoreBannerView, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return oStoreBannerView.getRealPosition(num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(OStoreBannerView oStoreBannerView, List list, BannerIndicatorView bannerIndicatorView, float f, Function3 function3, int i, Object obj) {
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        if ((i & 8) != 0) {
            function3 = null;
        }
        oStoreBannerView.setData(list, bannerIndicatorView, f, function3);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (!getViewPager2().isUserInputEnabled()) {
            return super.dispatchTouchEvent(ev);
        }
        int actionMasked = ev.getActionMasked();
        if (actionMasked == 0) {
            stop();
        } else if (actionMasked == 1 || actionMasked == 3 || actionMasked == 4) {
            start();
        }
        return super.dispatchTouchEvent(ev);
    }

    public final int findFirstPosition() {
        RecyclerView.Adapter adapter = getViewPager2().getAdapter();
        OStoreBannerViewAdapter oStoreBannerViewAdapter = adapter instanceof OStoreBannerViewAdapter ? (OStoreBannerViewAdapter) adapter : null;
        if (oStoreBannerViewAdapter == null) {
            return -1;
        }
        if (oStoreBannerViewAdapter.getRealCount() == 1) {
            return 0;
        }
        return oStoreBannerViewAdapter.getRealCount() * 1000;
    }

    public final int getCurrentItem() {
        return getViewPager2().getCurrentItem();
    }

    public final int getItemCount() {
        RecyclerView.Adapter adapter = getViewPager2().getAdapter();
        OStoreBannerViewAdapter oStoreBannerViewAdapter = adapter instanceof OStoreBannerViewAdapter ? (OStoreBannerViewAdapter) adapter : null;
        if (oStoreBannerViewAdapter == null) {
            return 0;
        }
        return oStoreBannerViewAdapter.getItemCount();
    }

    @NotNull
    public final BannerLoopTask getMLoopTask() {
        BannerLoopTask bannerLoopTask = this.mLoopTask;
        if (bannerLoopTask != null) {
            return bannerLoopTask;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mLoopTask");
        return null;
    }

    public final long getMLoopTime() {
        return this.mLoopTime;
    }

    @Nullable
    public final OnPageChangeListener getMOnPageChangeListener() {
        return this.mOnPageChangeListener;
    }

    @Nullable
    public final Integer getRealPosition(@Nullable Integer position) {
        RecyclerView.Adapter adapter = getViewPager2().getAdapter();
        OStoreBannerViewAdapter oStoreBannerViewAdapter = adapter instanceof OStoreBannerViewAdapter ? (OStoreBannerViewAdapter) adapter : null;
        if (oStoreBannerViewAdapter == null) {
            return null;
        }
        if (oStoreBannerViewAdapter.getRealCount() == 1) {
            return 0;
        }
        return position == null ? Integer.valueOf(getViewPager2().getCurrentItem() % oStoreBannerViewAdapter.getRealCount()) : Integer.valueOf(position.intValue() % oStoreBannerViewAdapter.getRealCount());
    }

    @Nullable
    public final RecyclerView getRecyclerView() {
        if (getViewPager2() == null) {
            return null;
        }
        View childAt = getViewPager2().getChildAt(0);
        if (childAt instanceof RecyclerView) {
            return (RecyclerView) childAt;
        }
        return null;
    }

    public final int getScrollTime() {
        return this.scrollTime;
    }

    @NotNull
    public final ViewPager2 getViewPager2() {
        ViewPager2 viewPager2 = this.viewPager2;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewPager2");
        return null;
    }

    /* JADX INFO: renamed from: isAutoLoop, reason: from getter */
    public final boolean getIsAutoLoop() {
        return this.isAutoLoop;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stop();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!getViewPager2().isUserInputEnabled() || !this.isIntercept) {
            return super.onInterceptTouchEvent(event);
        }
        int action = event.getAction();
        if (action == 0) {
            this.mStartX = event.getX();
            this.mStartY = event.getY();
            getParent().requestDisallowInterceptTouchEvent(true ^ this.disallowParentInterceptDownEvent);
        } else if (action == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (action == 2) {
            float x = event.getX();
            float y = event.getY();
            float fAbs = Math.abs(x - this.mStartX);
            float fAbs2 = Math.abs(y - this.mStartY);
            if (getViewPager2().getOrientation() == 0) {
                this.mIsViewPager2Drag = fAbs > ((float) this.mTouchSlop) && fAbs > fAbs2;
                if (getItemCount() < 2) {
                    this.mIsViewPager2Drag = false;
                }
            } else {
                this.mIsViewPager2Drag = fAbs2 > ((float) this.mTouchSlop) && fAbs2 > fAbs;
            }
            getParent().requestDisallowInterceptTouchEvent(this.mIsViewPager2Drag);
        } else if (action == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.onInterceptTouchEvent(event);
    }

    public final void setAutoLoop(boolean z) {
        this.isAutoLoop = z;
    }

    public final void setCurrentItem(int position, boolean smoothScroll) {
        getViewPager2().setCurrentItem(position, smoothScroll);
    }

    public final void setData(@NotNull List<BannerDetail> list, @Nullable final BannerIndicatorView indicator, float itemCorner, @Nullable Function3<? super Integer, ? super Long, ? super Integer, Unit> clickAction) {
        Intrinsics.checkNotNullParameter(list, "list");
        OStoreBannerViewAdapter oStoreBannerViewAdapter = new OStoreBannerViewAdapter(list, this, itemCorner);
        oStoreBannerViewAdapter.setMClickAction(clickAction);
        getViewPager2().setAdapter(oStoreBannerViewAdapter);
        if (oStoreBannerViewAdapter.getRealCount() > 0) {
            if (oStoreBannerViewAdapter.getRealCount() != 1) {
                if (indicator != null) {
                    indicator.setVisibility(0);
                }
                if (indicator != null) {
                    indicator.setDotsCount(oStoreBannerViewAdapter.getRealCount());
                }
                getViewPager2().setCurrentItem(oStoreBannerViewAdapter.getRealCount() * 1000, false);
            } else if (indicator != null) {
                indicator.setVisibility(4);
            }
            if (this.isRegisgterOnPageChangeCallback) {
                return;
            }
            this.isRegisgterOnPageChangeCallback = true;
            getViewPager2().registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.heytap.store.business.component.widget.banner.OStoreBannerView.setData.1
                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageScrollStateChanged(int state) {
                    BannerIndicatorView bannerIndicatorView = indicator;
                    if (bannerIndicatorView != null) {
                        bannerIndicatorView.onPageScrollStateChanged(state);
                    }
                    if (state == 0) {
                        int currentItem = OStoreBannerView.this.getViewPager2().getCurrentItem();
                        RecyclerView.Adapter adapter = OStoreBannerView.this.getViewPager2().getAdapter();
                        OStoreBannerViewAdapter oStoreBannerViewAdapter2 = adapter instanceof OStoreBannerViewAdapter ? (OStoreBannerViewAdapter) adapter : null;
                        if (oStoreBannerViewAdapter2 == null || oStoreBannerViewAdapter2.getRealCount() == 1) {
                            return;
                        }
                        if (currentItem == 0) {
                            OStoreBannerView oStoreBannerView = OStoreBannerView.this;
                            oStoreBannerView.setCurrentItem(oStoreBannerView.findFirstPosition(), false);
                        } else if (currentItem == OStoreBannerView.this.getItemCount() - 1) {
                            OStoreBannerView oStoreBannerView2 = OStoreBannerView.this;
                            oStoreBannerView2.setCurrentItem(oStoreBannerView2.findFirstPosition(), false);
                        }
                    }
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                    RecyclerView.Adapter adapter = OStoreBannerView.this.getViewPager2().getAdapter();
                    OStoreBannerViewAdapter oStoreBannerViewAdapter2 = adapter instanceof OStoreBannerViewAdapter ? (OStoreBannerViewAdapter) adapter : null;
                    if (oStoreBannerViewAdapter2 == null || oStoreBannerViewAdapter2.getRealCount() == 1) {
                        return;
                    }
                    int realCount = position % oStoreBannerViewAdapter2.getRealCount();
                    BannerIndicatorView bannerIndicatorView = indicator;
                    if (bannerIndicatorView == null) {
                        return;
                    }
                    bannerIndicatorView.onPageScrolled(realCount, positionOffset, positionOffsetPixels);
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageSelected(int position) {
                    Integer realPosition;
                    RecyclerView.Adapter adapter = OStoreBannerView.this.getViewPager2().getAdapter();
                    OStoreBannerViewAdapter oStoreBannerViewAdapter2 = adapter instanceof OStoreBannerViewAdapter ? (OStoreBannerViewAdapter) adapter : null;
                    if (oStoreBannerViewAdapter2 == null || (realPosition = OStoreBannerView.this.getRealPosition(Integer.valueOf(position))) == null) {
                        return;
                    }
                    BannerIndicatorView bannerIndicatorView = indicator;
                    OStoreBannerView oStoreBannerView = OStoreBannerView.this;
                    int iIntValue = realPosition.intValue();
                    if (bannerIndicatorView != null) {
                        bannerIndicatorView.setCurrentPosition(iIntValue);
                    }
                    OnSnapPositionChangeListener onScrollListener = oStoreBannerViewAdapter2.getOnScrollListener();
                    if (onScrollListener != null) {
                        onScrollListener.onSnapPositionChange(position);
                    }
                    OnPageChangeListener mOnPageChangeListener = oStoreBannerView.getMOnPageChangeListener();
                    if (mOnPageChangeListener == null) {
                        return;
                    }
                    mOnPageChangeListener.onPageSelected(position);
                }
            });
        }
    }

    public final void setDisallowParentInterceptDownEvent(boolean disallowParentInterceptDownEvent) {
        this.disallowParentInterceptDownEvent = disallowParentInterceptDownEvent;
    }

    public final void setMLoopTask(@NotNull BannerLoopTask bannerLoopTask) {
        Intrinsics.checkNotNullParameter(bannerLoopTask, "<set-?>");
        this.mLoopTask = bannerLoopTask;
    }

    public final void setMLoopTime(long j2) {
        this.mLoopTime = j2;
    }

    public final void setMOnPageChangeListener(@Nullable OnPageChangeListener onPageChangeListener) {
        this.mOnPageChangeListener = onPageChangeListener;
    }

    public final void setViewPager2(@NotNull ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "<set-?>");
        this.viewPager2 = viewPager2;
    }

    public final void start() {
        if (getItemCount() <= 1 || !this.isAutoLoop) {
            return;
        }
        stop();
        removeCallbacks(getMLoopTask());
        getMLoopTask().setPause(false);
        postDelayed(getMLoopTask(), this.mLoopTime);
    }

    public final void stop() {
        if (this.isAutoLoop) {
            getMLoopTask().setPause(true);
            removeCallbacks(getMLoopTask());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OStoreBannerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.scrollTime = 800;
        this.isAutoLoop = true;
        this.mLoopTime = 3500L;
        this.isIntercept = true;
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop() / 2;
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        viewPager2.setOffscreenPageLimit(1);
        setViewPager2(viewPager2);
        setMLoopTask(new BannerLoopTask(this));
        ScrollSpeedManger.reflectLayoutManager(this);
        addView(getViewPager2());
        this._$_findViewCache = new LinkedHashMap();
    }
}
