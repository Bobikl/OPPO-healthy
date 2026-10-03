package pantanal.app;

import android.content.Intent;
import android.view.View;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import pantanal.app.bean.CardCategory;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&¨\u0006\u000f"}, d2 = {"Lpantanal/app/CardLaunchInterceptor;", "", "onStartActivity", "", "view", "Landroid/view/View;", "cardCategory", "Lpantanal/app/bean/CardCategory;", "cardName", "", "intentList", "", "Landroid/content/Intent;", "originCard", "Lpantanal/app/Card;", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface CardLaunchInterceptor {
    boolean onStartActivity(@Nullable View view, @NotNull CardCategory cardCategory, @Nullable String cardName, @NotNull List<? extends Intent> intentList, @Nullable Card originCard);
}
