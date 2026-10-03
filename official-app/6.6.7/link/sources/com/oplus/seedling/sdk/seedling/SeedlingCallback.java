package com.oplus.seedling.sdk.seedling;

import android.view.View;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.ht9;
import com.oplus.aiunit.vision.s8e;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pantanal.foundation.utils.RequiresVersionSdk;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0017J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u000e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0012"}, d2 = {"Lcom/oplus/seedling/sdk/seedling/SeedlingCallback;", "", "onFailed", "", "errorCode", "", "errorMsg", "", "onFirstFrame", "seedling", "Lcom/oplus/seedling/sdk/seedling/ISeedling;", "view", "Landroid/view/View;", "onLoadFinished", "onReceiveData", "data", "Lcom/oplus/seedling/sdk/seedling/SeedlingUIData;", "Companion", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SeedlingCallback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/oplus/seedling/sdk/seedling/SeedlingCallback$Companion;", "", "()V", "TAG", "", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final String TAG = "SeedlingCallback";

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated(message = "Deprecated in os14.0,please use onFailed(errorCode: Int, errorMsg: String) instead.")
        public static void onFailed(@NotNull SeedlingCallback seedlingCallback, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "errorMsg");
            ht9.a.b(s8e.INSTANCE, "SeedlingCallback", "onFailed, errorMsg: " + str, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }

        @RequiresVersionSdk(version = 1002024)
        public static void onFirstFrame(@NotNull SeedlingCallback seedlingCallback, @NotNull ISeedling iSeedling, @Nullable View view) {
            Intrinsics.checkNotNullParameter(iSeedling, "seedling");
            ht9.a.c(s8e.INSTANCE, "SeedlingCallback", "onFirstFrame seedling = " + iSeedling + ",view =" + view, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }

        public static void onLoadFinished(@NotNull SeedlingCallback seedlingCallback, @NotNull ISeedling iSeedling) {
            Intrinsics.checkNotNullParameter(iSeedling, "seedling");
            ht9.a.d(s8e.INSTANCE, "SeedlingCallback", "onLoadFinished", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }

        public static void onReceiveData(@NotNull SeedlingCallback seedlingCallback, @NotNull ISeedling iSeedling, @Nullable SeedlingUIData seedlingUIData) {
            Intrinsics.checkNotNullParameter(iSeedling, "seedling");
            ht9.a.d(s8e.INSTANCE, "SeedlingCallback", "onReceiveData", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }

        public static void onFailed(@NotNull SeedlingCallback seedlingCallback, int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "errorMsg");
            seedlingCallback.onFailed("code:" + i + ",msg = " + str);
        }
    }

    void onFailed(int errorCode, @NotNull String errorMsg);

    @Deprecated(message = "Deprecated in os14.0,please use onFailed(errorCode: Int, errorMsg: String) instead.")
    void onFailed(@NotNull String errorMsg);

    @RequiresVersionSdk(version = 1002024)
    void onFirstFrame(@NotNull ISeedling seedling, @Nullable View view);

    void onLoadFinished(@NotNull ISeedling seedling);

    void onReceiveData(@NotNull ISeedling seedling, @Nullable SeedlingUIData data);
}
