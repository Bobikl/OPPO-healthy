package androidx.work.impl.foreground;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;

/* JADX INFO: loaded from: classes12.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface ForegroundProcessor {
    void startForeground(@NonNull String str, @NonNull ForegroundInfo foregroundInfo);
}
