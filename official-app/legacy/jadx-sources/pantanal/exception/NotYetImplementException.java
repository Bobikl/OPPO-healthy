package pantanal.exception;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00072\u00060\u0001j\u0002`\u0002:\u0001\bB\u0013\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lpantanal/exception/NotYetImplementException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "message", "<init>", "(Ljava/lang/String;)V", "Companion", "a", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0})
public final class NotYetImplementException extends RuntimeException {

    @NotNull
    private static final String MSG_NOT_IMPLEMENTED = "\nNOT YET IMPLEMENTED! ";

    public NotYetImplementException(@Nullable String str) {
        super("\nNOT YET IMPLEMENTED!  + " + str);
    }
}
