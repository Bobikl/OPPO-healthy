package com.oplus.seedling.sdk.callback;

import android.content.Intent;
import android.view.View;
import androidx.annotation.Keep;
import com.oplus.seedling.sdk.seedling.ISeedling;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J(\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/oplus/seedling/sdk/callback/StartActivityCallback;", "", "onStartActivity", "", "seedling", "Lcom/oplus/seedling/sdk/seedling/ISeedling;", "intentList", "", "Landroid/content/Intent;", "onStartActivityV2", "view", "Landroid/view/View;", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface StartActivityCallback {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean onStartActivityV2(@NotNull StartActivityCallback startActivityCallback, @NotNull ISeedling iSeedling, @NotNull List<? extends Intent> list, @Nullable View view) {
            Intrinsics.checkNotNullParameter(iSeedling, "seedling");
            Intrinsics.checkNotNullParameter(list, "intentList");
            return false;
        }
    }

    boolean onStartActivity(@NotNull ISeedling seedling, @NotNull List<? extends Intent> intentList);

    boolean onStartActivityV2(@NotNull ISeedling seedling, @NotNull List<? extends Intent> intentList, @Nullable View view);
}
