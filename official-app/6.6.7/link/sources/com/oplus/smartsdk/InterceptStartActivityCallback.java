package com.oplus.smartsdk;

import android.content.Intent;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/oplus/smartsdk/InterceptStartActivityCallback;", "", "onCall", "", "view", "Landroid/view/View;", "intentList", "", "Landroid/content/Intent;", "cardName", "", "com.oplus.smartsdk.smartenginesdk"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface InterceptStartActivityCallback {
    void onCall(@Nullable View view, @NotNull List<? extends Intent> intentList, @NotNull String cardName);
}
