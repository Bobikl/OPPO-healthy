package com.heytap.store.business.component.widget.banner;

import com.heytap.store.business.component.utils.viewpager2.Viewpager2KtsKt;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/heytap/store/business/component/widget/banner/BannerLoopTask;", "Ljava/lang/Runnable;", "banner", "Lcom/heytap/store/business/component/widget/banner/OStoreBannerView;", "(Lcom/heytap/store/business/component/widget/banner/OStoreBannerView;)V", "isPause", "", "()Z", "setPause", "(Z)V", "reference", "Ljava/lang/ref/WeakReference;", "run", "", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class BannerLoopTask implements Runnable {
    private boolean isPause;

    @Nullable
    private WeakReference<OStoreBannerView> reference;

    public BannerLoopTask(@NotNull OStoreBannerView banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        this.reference = new WeakReference<>(banner);
    }

    /* JADX INFO: renamed from: isPause, reason: from getter */
    public final boolean getIsPause() {
        return this.isPause;
    }

    @Override // java.lang.Runnable
    public void run() {
        WeakReference<OStoreBannerView> weakReference = this.reference;
        OStoreBannerView oStoreBannerView = weakReference == null ? null : weakReference.get();
        if (oStoreBannerView == null) {
            return;
        }
        if (this.isPause) {
            oStoreBannerView.removeCallbacks(oStoreBannerView.getMLoopTask());
            return;
        }
        Viewpager2KtsKt.setCurrentItem$default(oStoreBannerView.getViewPager2(), oStoreBannerView.getViewPager2().getCurrentItem() + 1, oStoreBannerView.getScrollTime(), null, 0, 12, null);
        oStoreBannerView.removeCallbacks(oStoreBannerView.getMLoopTask());
        oStoreBannerView.postDelayed(oStoreBannerView.getMLoopTask(), oStoreBannerView.getMLoopTime());
    }

    public final void setPause(boolean z) {
        this.isPause = z;
    }
}
