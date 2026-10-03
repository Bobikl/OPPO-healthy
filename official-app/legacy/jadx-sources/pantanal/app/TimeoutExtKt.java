package pantanal.app;

import com.oplus.aiunit.vision.oea;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"createTimeOutLoadCallback", "Lpantanal/app/TimeOutLoadCallback;", "cardLogMsg", "", "timeOut", "", oea.CALLBACK, "Lpantanal/app/OnLoadCallback;", "pantanal-interface_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TimeoutExtKt {
    @NotNull
    public static final TimeOutLoadCallback createTimeOutLoadCallback(@NotNull String cardLogMsg, int i, @NotNull OnLoadCallback cb) {
        Intrinsics.checkNotNullParameter(cardLogMsg, "cardLogMsg");
        Intrinsics.checkNotNullParameter(cb, "cb");
        return new TimeOutLoadCallback(cardLogMsg, i, cb);
    }
}
