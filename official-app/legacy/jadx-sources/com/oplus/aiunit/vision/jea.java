package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/jea;", "", "Lcom/oplus/aiunit/vision/jea$a;", "chain", "Lcom/oplus/aiunit/vision/ytf;", "intercept", "Companion", "a", "b", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public interface jea {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\nH&J\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH&J\b\u0010\u0010\u001a\u00020\nH&J\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH&J\b\u0010\u0012\u001a\u00020\nH&J\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH&¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/jea$a;", "", "Lokhttp3/Request;", "request", "Lcom/oplus/aiunit/vision/ytf;", "c", "Lcom/oplus/aiunit/vision/jy3;", "d", "Lcom/oplus/aiunit/vision/wr2;", "call", "", b2n.g, "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "b", "a", MapSchema.FIELD_NAME_ENTRY, b2n.f, "f", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public interface a {
        int a();

        @NotNull
        a b(int timeout, @NotNull TimeUnit unit);

        @NotNull
        ytf c(@NotNull Request request) throws IOException;

        @NotNull
        wr2 call();

        @Nullable
        jy3 d();

        @NotNull
        a e(int timeout, @NotNull TimeUnit unit);

        @NotNull
        a f(int timeout, @NotNull TimeUnit unit);

        int g();

        int h();

        @NotNull
        Request request();
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.jea$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/jea$b;", "", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
    }

    @NotNull
    ytf intercept(@NotNull a chain) throws IOException;
}
