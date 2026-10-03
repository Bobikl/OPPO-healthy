package retrofit2;

import com.oplus.aiunit.vision.ztf;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class HttpException extends RuntimeException {
    private final int code;
    private final String message;
    private final transient ztf<?> response;

    public HttpException(ztf<?> ztfVar) {
        super(getMessage(ztfVar));
        this.code = ztfVar.b();
        this.message = ztfVar.h();
        this.response = ztfVar;
    }

    private static String getMessage(ztf<?> ztfVar) {
        Objects.requireNonNull(ztfVar, "response == null");
        return "HTTP " + ztfVar.b() + " " + ztfVar.h();
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    @Nullable
    public ztf<?> response() {
        return this.response;
    }
}
