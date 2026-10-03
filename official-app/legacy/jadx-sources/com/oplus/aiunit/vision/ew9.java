package com.oplus.aiunit.vision;

import com.heytap.nearx.tangramconfig.strategy.Fields;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH&J\b\u0010\u000e\u001a\u00020\u0002H&J\b\u0010\u000f\u001a\u00020\u0002H&J6\u0010\u0014\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/ew9;", "", "", "f", "i", b2n.f, "Lcom/oplus/aiunit/vision/v30;", "config", "a", "", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "d", "b", b2n.g, "c", "", "y", "u", "v", MapSchema.FIELD_NAME_ENTRY, "animplayer_release"}, k = 1, mv = {1, 4, 0})
public interface ew9 {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class a {
        public static void a(ew9 ew9Var, int i, int i2, @Nullable byte[] bArr, @Nullable byte[] bArr2, @Nullable byte[] bArr3) {
        }

        public static void b(ew9 ew9Var, int i, int i2) {
        }
    }

    void a(@NotNull AnimConfig config);

    int b();

    void c();

    void d(int width, int height);

    void e(int width, int height, @Nullable byte[] y, @Nullable byte[] u, @Nullable byte[] v);

    void f();

    void g();

    void h();

    void i();
}
