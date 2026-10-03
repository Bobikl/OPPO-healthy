package com.heytap.weather.transceiver;

import com.oplus.aiunit.vision.b2n;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u000b\u001a\u00020\u0004H&J\b\u0010\f\u001a\u00020\u0004H&J\b\u0010\r\u001a\u00020\u0004H&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\u0011"}, d2 = {"Lcom/heytap/weather/transceiver/d;", "", "Lcom/heytap/weather/transceiver/AbsTransceiver$c;", "result", "", "j", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "i", "f", b2n.f, "d", "b", "a", "c", MapSchema.FIELD_NAME_ENTRY, b2n.g, "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
public interface d {
    void a();

    void b();

    void c(@NotNull MessageEvent event);

    void d();

    void e(@NotNull MessageEvent event);

    void f(@NotNull MessageEvent event);

    void g(@Nullable MessageEvent event);

    void h(@NotNull MessageEvent event);

    void i(@Nullable MessageEvent event);

    void j(@NotNull AbsTransceiver.c result);
}
