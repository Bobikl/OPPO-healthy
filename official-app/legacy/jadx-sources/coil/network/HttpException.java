package coil.network;

import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.oplus.aiunit.vision.ytf;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcoil/network/HttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lcom/oplus/aiunit/vision/ytf;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "Lcom/oplus/aiunit/vision/ytf;", "getResponse", "()Lcom/oplus/aiunit/vision/ytf;", "<init>", "(Lcom/oplus/aiunit/vision/ytf;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class HttpException extends RuntimeException {

    @NotNull
    private final ytf response;

    public HttpException(@NotNull ytf ytfVar) {
        super("HTTP " + ytfVar.getCode() + ": " + ytfVar.getMessage());
        this.response = ytfVar;
    }

    @NotNull
    public final ytf getResponse() {
        return this.response;
    }
}
