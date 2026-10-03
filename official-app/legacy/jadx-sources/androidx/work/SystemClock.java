package androidx.work;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes12.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemClock implements Clock {
    @Override // androidx.work.Clock
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
