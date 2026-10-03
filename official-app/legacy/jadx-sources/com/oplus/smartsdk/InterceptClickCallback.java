package com.oplus.smartsdk;

import android.content.Intent;
import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/oplus/smartsdk/InterceptClickCallback;", "", "onStartActivity", "", "view", "Landroid/view/View;", "intent", "Landroid/content/Intent;", "cardName", "", "com.oplus.smartsdk.smartenginesdk"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface InterceptClickCallback {
    void onStartActivity(@Nullable View view, @NotNull Intent intent, @NotNull String cardName);
}
