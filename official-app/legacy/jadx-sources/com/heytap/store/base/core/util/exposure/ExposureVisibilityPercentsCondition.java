package com.heytap.store.base.core.util.exposure;

import android.graphics.Rect;
import android.view.View;
import com.heytap.store.platform.tools.DeviceUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00072\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/heytap/store/base/core/util/exposure/ExposureVisibilityPercentsCondition;", "Lcom/heytap/store/base/core/util/exposure/IExposureCondition;", "Landroid/view/View;", "()V", "accept", "", "view", "Companion", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ExposureVisibilityPercentsCondition implements IExposureCondition<View> {
    private static final int EXPOSURE_VISIBILITY_PERCENTAGE = 50;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = ExposureUtil.class.getSimpleName();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/base/core/util/exposure/ExposureVisibilityPercentsCondition$Companion;", "", "()V", "EXPOSURE_VISIBILITY_PERCENTAGE", "", "TAG", "", "kotlin.jvm.PlatformType", "getVisibilityPercents", "view", "Landroid/view/View;", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getVisibilityPercents(View view) {
            Rect rect = new Rect();
            int[] iArr = new int[2];
            view.getLocalVisibleRect(rect);
            view.getLocationOnScreen(iArr);
            int height = view.getHeight();
            boolean zIsShown = view.isShown();
            boolean z = false;
            if (rect.bottom > 0) {
                int i = iArr[1];
                DeviceUtils deviceUtils = DeviceUtils.INSTANCE;
                if (i < deviceUtils.getScreenHeight() && iArr[0] <= deviceUtils.getScreenWidth() && zIsShown) {
                    int i2 = rect.top;
                    if (i2 == 0 && rect.bottom == height) {
                        return 100;
                    }
                    if (i2 > 0) {
                        return ((height - i2) * 100) / height;
                    }
                    int i3 = rect.bottom;
                    if (1 <= i3 && i3 < height) {
                        z = true;
                    }
                    if (z) {
                        return (i3 * 100) / height;
                    }
                    return 100;
                }
            }
            return 0;
        }
    }

    @Override // com.heytap.store.base.core.util.exposure.IExposureCondition
    public boolean accept(@Nullable View view) {
        return view != null && INSTANCE.getVisibilityPercents(view) > 50;
    }
}
