package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import com.oplus.coreapp.appfeature.AppFeatureProviderUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/bb0;", "Lcom/oplus/coreapp/appfeature/AppFeatureProviderUtils;", "Companion", "a", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
public final class bb0 extends AppFeatureProviderUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.bb0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/bb0$a;", "", "Landroid/content/ContentResolver;", "cr", "", "featureName", "defaultValue", "a", "", "b", "<init>", "()V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a(@NotNull ContentResolver cr, @NotNull String featureName, @NotNull String defaultValue) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(featureName, "featureName");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            try {
                String strE = AppFeatureProviderUtils.e(cr, featureName, defaultValue);
                Intrinsics.checkNotNullExpressionValue(strE, "{\n                AppFea…faultValue)\n            }");
                return strE;
            } catch (SQLiteException unused) {
                return defaultValue;
            }
        }

        public final boolean b(@NotNull ContentResolver cr, @NotNull String featureName) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(featureName, "featureName");
            return AppFeatureProviderUtils.i(cr, featureName);
        }
    }
}
