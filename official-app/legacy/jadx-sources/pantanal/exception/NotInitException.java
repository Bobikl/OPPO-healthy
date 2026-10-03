package pantanal.exception;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\rB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0013\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0013\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0003\u0010\nB\u001d\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0003\u0010\u000b¨\u0006\u000e"}, d2 = {"Lpantanal/exception/NotInitException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "", "message", "(Ljava/lang/String;)V", "", "cause", "(Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Companion", "a", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0})
public final class NotInitException extends RuntimeException {

    @NotNull
    private static final String MSG_NOT_INIT = "\nPANTANAL CLIENT IS NOT INIT ! ";

    public NotInitException() {
        super(MSG_NOT_INIT);
    }

    public NotInitException(@Nullable String str) {
        super("\nPANTANAL CLIENT IS NOT INIT !  + " + str);
    }

    public NotInitException(@Nullable Throwable th) {
        super(th);
    }

    public NotInitException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }
}
