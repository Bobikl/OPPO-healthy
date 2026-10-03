package com.heytap.store.apm.util;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import com.heytap.store.platform.tools.DeviceUtils;
import org.apache.commons.codec.language.Soundex;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/heytap/store/apm/util/ViewVisibility;", "", "()V", "Companion", "apm_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ViewVisibility {
    private static final int EXPOSURE_VISIBILITY_PERCENTAGE = 5;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = ViewVisibility.class.getSimpleName();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/heytap/store/apm/util/ViewVisibility$Companion;", "", "()V", "EXPOSURE_VISIBILITY_PERCENTAGE", "", "TAG", "", "kotlin.jvm.PlatformType", "isVisibility", "", "view", "Landroid/view/View;", "apm_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isVisibility(@NotNull View view) {
            int i;
            Intrinsics.checkNotNullParameter(view, "view");
            Rect rect = new Rect();
            int[] iArr = new int[2];
            view.getLocalVisibleRect(rect);
            view.getLocationOnScreen(iArr);
            int height = view.getHeight();
            boolean zIsShown = view.isShown();
            if (rect.bottom <= 0 || (i = rect.left) < 0) {
                return false;
            }
            DeviceUtils deviceUtils = DeviceUtils.INSTANCE;
            if (i >= deviceUtils.getScreenWidth() || iArr[1] >= deviceUtils.getScreenHeight() || iArr[0] > deviceUtils.getScreenWidth() || !zIsShown) {
                return false;
            }
            int i2 = rect.top;
            int i3 = 100;
            if (i2 != 0 || rect.bottom != height) {
                if (i2 > 0) {
                    i3 = ((height - i2) * 100) / height;
                } else {
                    int i4 = rect.bottom;
                    if (1 <= i4 && i4 < height) {
                        i3 = (i4 * 100) / height;
                    }
                }
            }
            Log.d(ViewVisibility.TAG, "" + rect.left + Soundex.SILENT_MARKER + rect.top + Soundex.SILENT_MARKER + rect.right + Soundex.SILENT_MARKER + rect.bottom);
            return i3 > 5;
        }
    }
}
