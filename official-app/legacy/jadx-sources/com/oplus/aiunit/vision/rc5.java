package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import io.protostuff.MapSchema;
import java.util.BitSet;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\t\u001a\u00020\bH&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH&J\b\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH&J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u000eH&J\u0012\u0010\u0014\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H&J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H&J\u0012\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H&J\b\u0010\u001b\u001a\u00020\fH&¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/rc5;", "Lcom/oplus/aiunit/vision/jr7;", "Lcom/oplus/aiunit/vision/p11;", b2n.g, "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "f", "Lcom/oplus/aiunit/vision/ua5;", "w", "", MapSchema.FIELD_NAME_ENTRY, "", "q", "", "u", "", "model", "o", "Lcom/oplus/aiunit/vision/g4j;", "n", "data", b2n.f, "Ljava/util/BitSet;", "t", "Landroid/content/Context;", "context", "", "i", "c", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public interface rc5 extends jr7 {
    boolean c();

    int e();

    @Nullable
    UserDeviceInfo f();

    boolean g(@Nullable UserDeviceInfo data);

    @Nullable
    p11<?> h();

    void i(@Nullable Context context);

    @Nullable
    g4j n(@NotNull String model);

    boolean o(@NotNull String model);

    @NotNull
    List<UserDeviceInfo> q();

    @NotNull
    BitSet t(@Nullable UserDeviceInfo data);

    boolean u();

    @Nullable
    ua5 w();
}
