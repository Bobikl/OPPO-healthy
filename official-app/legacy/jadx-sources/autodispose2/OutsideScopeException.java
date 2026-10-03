package autodispose2;

import com.oplus.aiunit.vision.bo0;

/* JADX INFO: loaded from: classes12.dex */
public class OutsideScopeException extends RuntimeException {
    public OutsideScopeException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        if (!bo0.b) {
            return this;
        }
        return super.fillInStackTrace();
    }
}
