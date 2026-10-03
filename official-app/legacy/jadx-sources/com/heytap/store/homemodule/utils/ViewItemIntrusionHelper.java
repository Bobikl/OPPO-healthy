package com.heytap.store.homemodule.utils;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.internal.view.SupportMenu;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.store.apm.util.DataReportUtilKt;
import com.heytap.store.homemodule.data.MediaInfo;
import com.heytap.store.homemodule.utils.ViewItemIntrusionHelper;
import com.heytap.store.platform.tools.LogUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u000f\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0016J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\rJ\n\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\b\u0010\u001e\u001a\u00020\u001cH\u0002J\u000e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u0013R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006!"}, d2 = {"Lcom/heytap/store/homemodule/utils/ViewItemIntrusionHelper;", "", "itemView", "Landroid/view/View;", "mediaInfo", "Lcom/heytap/store/homemodule/data/MediaInfo;", "(Landroid/view/View;Lcom/heytap/store/homemodule/data/MediaInfo;)V", "alignViewParam", "getItemView", "()Landroid/view/View;", "getMediaInfo", "()Lcom/heytap/store/homemodule/data/MediaInfo;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "scrollerListener", "com/heytap/store/homemodule/utils/ViewItemIntrusionHelper$scrollerListener$1", "Lcom/heytap/store/homemodule/utils/ViewItemIntrusionHelper$scrollerListener$1;", "getAlignView", "getAllOffset", "", "count", "view", "getFloatView", "getRootViewParen", "Landroid/view/ViewParent;", "notifyAlign", "", "onVideoHide", "", "onVideoShow", "resetHeight", "setHeightToFloatView", "alignHeight", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class ViewItemIntrusionHelper {

    @Nullable
    private View alignViewParam;

    @NotNull
    private final View itemView;

    @NotNull
    private final MediaInfo mediaInfo;

    @Nullable
    private RecyclerView recyclerView;

    @NotNull
    private final ViewItemIntrusionHelper$scrollerListener$1 scrollerListener;

    public ViewItemIntrusionHelper(@NotNull View itemView, @NotNull MediaInfo mediaInfo) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(mediaInfo, "mediaInfo");
        this.itemView = itemView;
        this.mediaInfo = mediaInfo;
        this.scrollerListener = new ViewItemIntrusionHelper$scrollerListener$1(this);
    }

    private final ViewParent getRootViewParen() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            return null;
        }
        return recyclerView.getParent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onVideoHide$lambda-3$lambda-2$lambda-1, reason: not valid java name */
    public static final void m4980onVideoHide$lambda3$lambda2$lambda1(ViewItemIntrusionHelper this$0, ViewParent parent, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(parent, "$parent");
        Intrinsics.checkNotNullParameter(it, "$it");
        try {
            LogUtils logUtils = LogUtils.INSTANCE;
            logUtils.i("jarvanTest Visible hashcode is " + this$0.hashCode() + " 尝试移除通道视频");
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(it);
            }
            logUtils.i("jarvanTest Visible hashcode is " + this$0.hashCode() + " 移除通道视频成功");
        } catch (Exception e2) {
            DataReportUtilKt.reportExceptionEvent(e2);
            e2.printStackTrace();
        }
    }

    private final void resetHeight() {
        final View alignViewParam = getAlignViewParam();
        Integer numValueOf = alignViewParam == null ? null : Integer.valueOf(alignViewParam.getHeight());
        if (numValueOf == null) {
            return;
        }
        int iIntValue = numValueOf.intValue();
        if (iIntValue == 0) {
            alignViewParam.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.heytap.store.homemodule.utils.ViewItemIntrusionHelper.resetHeight.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    alignViewParam.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    this.setHeightToFloatView(alignViewParam.getHeight());
                }
            });
        } else {
            setHeightToFloatView(iIntValue);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getAlignView, reason: from getter */
    public View getAlignViewParam() {
        return this.alignViewParam;
    }

    public final int getAllOffset(int count, @Nullable View view, @NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Object parent = view == null ? null : view.getParent();
        return (view == null || Intrinsics.areEqual(view.getParent(), recyclerView) || parent == null) ? count : getAllOffset(count + view.getTop(), (View) parent, recyclerView);
    }

    @Nullable
    public View getFloatView() {
        View view = new View(this.itemView.getContext());
        view.setBackgroundColor(SupportMenu.CATEGORY_MASK);
        view.setAlpha(0.2f);
        return view;
    }

    @NotNull
    public final View getItemView() {
        return this.itemView;
    }

    @NotNull
    public final MediaInfo getMediaInfo() {
        return this.mediaInfo;
    }

    public final boolean notifyAlign() {
        View alignViewParam = getAlignViewParam();
        if (alignViewParam == null) {
            return false;
        }
        ViewParent rootViewParen = getRootViewParen();
        if (this.scrollerListener.getFloatView() == null) {
            this.scrollerListener.setFloatView(getFloatView());
        }
        int height = alignViewParam.getHeight();
        View floatView = this.scrollerListener.getFloatView();
        if (rootViewParen instanceof ViewGroup) {
            ViewParent parent = floatView == null ? null : floatView.getParent();
            int alphaAddBigScale = (int) (height * this.mediaInfo.getAlphaAddBigScale());
            LogUtils.INSTANCE.i(Intrinsics.stringPlus("jarvanTest notifyAlign 展示裸眼3D的样式 高度为  ", Integer.valueOf(alphaAddBigScale)));
            if (Intrinsics.areEqual(parent, rootViewParen)) {
                if (floatView.getLayoutParams().height != alphaAddBigScale) {
                    ViewGroup.LayoutParams layoutParams = floatView.getLayoutParams();
                    layoutParams.height = alphaAddBigScale;
                    floatView.setLayoutParams(layoutParams);
                }
            } else if (parent == null) {
                ((ViewGroup) rootViewParen).addView(floatView, new ViewGroup.LayoutParams(-1, alphaAddBigScale));
            }
        }
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            this.scrollerListener.onScrolled(recyclerView, 0, 0);
        }
        LogUtils.INSTANCE.i("jarvanTest Visible hashcode is " + hashCode() + " notifyAlign 展示裸眼3D的样式  " + floatView);
        if (floatView == null) {
            return true;
        }
        floatView.setVisibility(0);
        return true;
    }

    public final void onVideoHide() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.scrollerListener);
        }
        final View floatView = this.scrollerListener.getFloatView();
        if (floatView != null) {
            final ViewParent parent = floatView.getParent();
            if (parent != null) {
                floatView.post(new Runnable() { // from class: com.oplus.aiunit.vision.i0l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewItemIntrusionHelper.m4980onVideoHide$lambda3$lambda2$lambda1(this.i, parent, floatView);
                    }
                });
            }
            floatView.setVisibility(8);
            LogUtils.INSTANCE.i("jarvanTest Visible hashcode is " + hashCode() + " 隐藏视频内容");
        }
        this.scrollerListener.setOffset(0.0f);
    }

    public final void onVideoShow() {
        if (this.recyclerView == null) {
            ViewParent parent = this.itemView.getParent();
            if (parent instanceof RecyclerView) {
                this.recyclerView = (RecyclerView) parent;
            }
        }
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            return;
        }
        recyclerView.addOnScrollListener(this.scrollerListener);
    }

    public final void setHeightToFloatView(int alignHeight) {
        View floatView = this.scrollerListener.getFloatView();
        ViewGroup.LayoutParams layoutParams = floatView == null ? null : floatView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (int) (alignHeight * this.mediaInfo.getAlphaAddBigScale());
        }
        View floatView2 = this.scrollerListener.getFloatView();
        if (floatView2 == null) {
            return;
        }
        floatView2.setLayoutParams(layoutParams);
    }
}
