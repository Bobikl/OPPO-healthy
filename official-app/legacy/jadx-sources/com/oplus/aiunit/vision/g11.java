package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0017\u001a\u00020\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\u00020\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/g11;", "", "Lcom/oplus/aiunit/vision/f8b;", "n", "", "a", "b", b2n.g, "()Lcom/oplus/aiunit/vision/f8b;", LogFieldKey.MESSAGE_KEY, "(Lcom/oplus/aiunit/vision/f8b;)V", "finalVisibleType", "Lcom/oplus/aiunit/vision/dlf;", "f", "()Lcom/oplus/aiunit/vision/dlf;", LogFieldKey.LEVEL_KEY, "(Lcom/oplus/aiunit/vision/dlf;)V", "finalDateRange", "", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", "setDeviceTitle", "(Ljava/lang/String;)V", "deviceTitle", b2n.f, "setDeviceContent", "deviceContent", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public interface g11 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @NotNull
        public static fz7 a(@NotNull g11 g11Var) {
            return new fz7();
        }

        @NotNull
        public static String b(@NotNull g11 g11Var) {
            return "logicType:" + g11Var.h();
        }
    }

    boolean a();

    boolean b();

    @NotNull
    String e();

    @Nullable
    RelativeDateRange f();

    @NotNull
    String g();

    @Nullable
    f8b h();

    void l(@Nullable RelativeDateRange relativeDateRange);

    void m(@Nullable f8b f8bVar);

    @Nullable
    f8b n();
}
