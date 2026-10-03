package com.google.android.material.motion;

import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface MaterialBackHandler {
    void cancelBackProgress();

    void handleBackInvoked();

    void startBackProgress(@NonNull BackEventCompat backEventCompat);

    void updateBackProgress(@NonNull BackEventCompat backEventCompat);
}
