package pantanal.app;

import android.content.Intent;
import android.view.View;
import com.oplus.aiunit.vision.bs9;
import com.oplus.aiunit.vision.t6e;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.app.bean.CardCategory;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&JT\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0011H\u0016¨\u0006\u0012"}, d2 = {"Lpantanal/app/ILaunchInterceptor;", "", "onStartActivity", "", "view", "Landroid/view/View;", "cardCategory", "Lpantanal/app/bean/CardCategory;", "cardName", "", "intentList", "", "Landroid/content/Intent;", "onStartActivityV2", "clickedView", "targetCard", "extraMap", "", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ILaunchInterceptor {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onStartActivityV2(@NotNull ILaunchInterceptor iLaunchInterceptor, @Nullable View view, @NotNull CardCategory cardCategory, @Nullable String str, @NotNull List<? extends Intent> intentList, @Nullable Object obj, @Nullable Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(cardCategory, "cardCategory");
            Intrinsics.checkNotNullParameter(intentList, "intentList");
            bs9.a.c(t6e.INSTANCE, "ILaunchInterceptor", "onStartActivityV2 default impl.", false, null, false, 0, false, null, 252, null);
        }
    }

    void onStartActivity(@Nullable View view, @NotNull CardCategory cardCategory, @Nullable String cardName, @NotNull List<? extends Intent> intentList);

    void onStartActivityV2(@Nullable View clickedView, @NotNull CardCategory cardCategory, @Nullable String cardName, @NotNull List<? extends Intent> intentList, @Nullable Object targetCard, @Nullable Map<String, ? extends Object> extraMap);
}
