package com.heytap.store.business.component.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.heytap.store.business.component.widget.OStoreProductBannerView;
import com.heytap.store.platform.imageloader.ImageLoader;
import com.heytap.store.platform.imageloader.LoadStep;
import com.heytap.store.platform.tools.LogUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\nH\u0002J\u0016\u0010\u001d\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001fH\u0002J\b\u0010 \u001a\u00020\u0018H\u0014J\b\u0010!\u001a\u00020\u0018H\u0014J\u0006\u0010\"\u001a\u00020\u0018J\u0006\u0010#\u001a\u00020\u0018J\u0016\u0010$\u001a\u00020\u00182\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001fJ\u0012\u0010%\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010\nH\u0002J\u0006\u0010'\u001a\u00020\u0018J\b\u0010(\u001a\u00020\u0018H\u0002J\u0006\u0010)\u001a\u00020\u0018R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/heytap/store/business/component/widget/OStoreProductBannerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defaultStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "firstShowImg", "Landroidx/appcompat/widget/AppCompatImageView;", "hanlder", "Landroid/os/Handler;", "imgUrlQueue", "Ljava/util/LinkedList;", "", "isCanLoop", "", "isFirstImgShow", "isStartBanner", "mRunnable", "Ljava/lang/Runnable;", "nextShowImg", "clearCache", "", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "getImageView", "initImageView", "list", "", "onAttachedToWindow", "onDetachedFromWindow", "recycle", "reset", "setBannerData", "setImgUrl", "imageView", "startBanner", "startLoop", "stopBanner", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreProductBannerView extends FrameLayout {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @Nullable
    private AppCompatImageView firstShowImg;

    @Nullable
    private Handler hanlder;

    @NotNull
    private final LinkedList<String> imgUrlQueue;
    private boolean isCanLoop;
    private boolean isFirstImgShow;
    private boolean isStartBanner;

    @Nullable
    private Runnable mRunnable;

    @Nullable
    private AppCompatImageView nextShowImg;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreProductBannerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m4859_init_$lambda0(OStoreProductBannerView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isStartBanner = false;
        this$0.startLoop();
    }

    private final void clearCache() {
        Handler handler;
        Runnable runnable = this.mRunnable;
        if (runnable == null || (handler = this.hanlder) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    private final AppCompatImageView getImageView() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return appCompatImageView;
    }

    private final void initImageView(List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.imgUrlQueue.add(list.get(i));
        }
        this.isCanLoop = this.imgUrlQueue.size() > 1;
        AppCompatImageView appCompatImageView = this.nextShowImg;
        if (appCompatImageView == null) {
            AppCompatImageView imageView = getImageView();
            this.nextShowImg = imageView;
            if (imageView != null) {
                imageView.setTag(2);
            }
            AppCompatImageView appCompatImageView2 = this.nextShowImg;
            if (appCompatImageView2 != null) {
                appCompatImageView2.setAlpha(0.0f);
            }
            addView(this.nextShowImg);
        } else {
            if (appCompatImageView != null) {
                appCompatImageView.setTag(2);
            }
            AppCompatImageView appCompatImageView3 = this.nextShowImg;
            if (appCompatImageView3 != null) {
                appCompatImageView3.setAlpha(0.0f);
            }
        }
        AppCompatImageView appCompatImageView4 = this.firstShowImg;
        if (appCompatImageView4 == null) {
            AppCompatImageView imageView2 = getImageView();
            this.firstShowImg = imageView2;
            if (imageView2 != null) {
                imageView2.setTag(1);
            }
            AppCompatImageView appCompatImageView5 = this.firstShowImg;
            if (appCompatImageView5 != null) {
                appCompatImageView5.setAlpha(1.0f);
            }
            addView(this.firstShowImg);
        } else {
            if (appCompatImageView4 != null) {
                appCompatImageView4.setTag(1);
            }
            AppCompatImageView appCompatImageView6 = this.firstShowImg;
            if (appCompatImageView6 != null) {
                appCompatImageView6.setAlpha(1.0f);
            }
        }
        if (this.imgUrlQueue.size() > 0) {
            if (this.imgUrlQueue.size() == 1) {
                AppCompatImageView appCompatImageView7 = this.firstShowImg;
                if (appCompatImageView7 == null) {
                    return;
                }
                String strPeek = this.imgUrlQueue.peek();
                Intrinsics.checkNotNullExpressionValue(strPeek, "imgUrlQueue.peek()");
                LoadStep.into$default(ImageLoader.load(strPeek), appCompatImageView7, null, 2, null);
                return;
            }
            AppCompatImageView appCompatImageView8 = this.firstShowImg;
            if (appCompatImageView8 != null) {
                setImgUrl(appCompatImageView8);
            }
            AppCompatImageView appCompatImageView9 = this.nextShowImg;
            if (appCompatImageView9 != null) {
                setImgUrl(appCompatImageView9);
            }
            startBanner();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setImgUrl(AppCompatImageView imageView) {
        if (imageView == null || this.imgUrlQueue.size() == 0) {
            return;
        }
        String url = this.imgUrlQueue.poll();
        this.imgUrlQueue.add(url);
        Intrinsics.checkNotNullExpressionValue(url, "url");
        LoadStep.into$default(ImageLoader.load(url), imageView, null, 2, null);
    }

    private final void startLoop() {
        AppCompatImageView appCompatImageView;
        final AppCompatImageView appCompatImageView2 = this.firstShowImg;
        if (appCompatImageView2 == null || (appCompatImageView = this.nextShowImg) == null) {
            return;
        }
        if (!this.isFirstImgShow) {
            appCompatImageView2 = appCompatImageView;
        }
        if (appCompatImageView2 == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatImageView2, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.heytap.store.business.component.widget.OStoreProductBannerView$startLoop$1$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@Nullable Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@Nullable Animator animation) {
                this.this$0.setImgUrl(appCompatImageView2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@Nullable Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@Nullable Animator animation) {
            }
        });
        objectAnimatorOfFloat.start();
        final AppCompatImageView appCompatImageView3 = Intrinsics.areEqual(appCompatImageView2.getTag(), (Object) 1) ? this.nextShowImg : this.firstShowImg;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatImageView3, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.addListener(new Animator.AnimatorListener() { // from class: com.heytap.store.business.component.widget.OStoreProductBannerView$startLoop$1$2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@Nullable Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@Nullable Animator animation) {
                OStoreProductBannerView oStoreProductBannerView = this.this$0;
                AppCompatImageView appCompatImageView4 = appCompatImageView3;
                oStoreProductBannerView.isFirstImgShow = appCompatImageView4 == null ? false : Intrinsics.areEqual(appCompatImageView4.getTag(), (Object) 1);
                this.this$0.startBanner();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@Nullable Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@Nullable Animator animation) {
            }
        });
        objectAnimatorOfFloat2.setStartDelay(250L);
        objectAnimatorOfFloat2.start();
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
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        startBanner();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopBanner();
    }

    public final void recycle() {
        clearCache();
    }

    public final void reset() {
    }

    public final void setBannerData(@Nullable List<String> list) {
        clearCache();
        if (list == null) {
            list = new ArrayList<>();
        }
        initImageView(list);
    }

    public final void startBanner() {
        Handler handler;
        if (!this.isCanLoop || this.isStartBanner) {
            return;
        }
        this.isStartBanner = true;
        LogUtils.INSTANCE.d("HotZoneBanner", "startBanner");
        Runnable runnable = this.mRunnable;
        if (runnable == null || (handler = this.hanlder) == null) {
            return;
        }
        handler.postDelayed(runnable, 1800L);
    }

    public final void stopBanner() {
        Handler handler;
        if (this.isCanLoop) {
            AppCompatImageView appCompatImageView = this.firstShowImg;
            if (appCompatImageView != null && this.nextShowImg != null) {
                if (appCompatImageView != null) {
                    appCompatImageView.clearAnimation();
                }
                AppCompatImageView appCompatImageView2 = this.nextShowImg;
                if (appCompatImageView2 != null) {
                    appCompatImageView2.clearAnimation();
                }
                AppCompatImageView appCompatImageView3 = this.firstShowImg;
                float alpha = appCompatImageView3 == null ? 0.0f : appCompatImageView3.getAlpha();
                AppCompatImageView appCompatImageView4 = this.nextShowImg;
                if (alpha >= (appCompatImageView4 == null ? 0.0f : appCompatImageView4.getAlpha())) {
                    AppCompatImageView appCompatImageView5 = this.firstShowImg;
                    if (appCompatImageView5 != null) {
                        appCompatImageView5.setAlpha(1.0f);
                    }
                    AppCompatImageView appCompatImageView6 = this.nextShowImg;
                    if (appCompatImageView6 != null) {
                        appCompatImageView6.setAlpha(0.0f);
                    }
                    this.isFirstImgShow = true;
                } else {
                    AppCompatImageView appCompatImageView7 = this.firstShowImg;
                    if (appCompatImageView7 != null) {
                        appCompatImageView7.setAlpha(0.0f);
                    }
                    AppCompatImageView appCompatImageView8 = this.nextShowImg;
                    if (appCompatImageView8 != null) {
                        appCompatImageView8.setAlpha(1.0f);
                    }
                    this.isFirstImgShow = false;
                }
            }
            this.isStartBanner = false;
            LogUtils.INSTANCE.d("HotZoneBanner", "stopBanner");
            Runnable runnable = this.mRunnable;
            if (runnable == null || (handler = this.hanlder) == null) {
                return;
            }
            handler.removeCallbacks(runnable);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreProductBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OStoreProductBannerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreProductBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.hanlder = new Handler(Looper.getMainLooper());
        this.mRunnable = new Runnable() { // from class: com.oplus.aiunit.vision.a5d
            @Override // java.lang.Runnable
            public final void run() {
                OStoreProductBannerView.m4859_init_$lambda0(this.i);
            }
        };
        this.imgUrlQueue = new LinkedList<>();
        this.isFirstImgShow = true;
        this._$_findViewCache = new LinkedHashMap();
    }
}
