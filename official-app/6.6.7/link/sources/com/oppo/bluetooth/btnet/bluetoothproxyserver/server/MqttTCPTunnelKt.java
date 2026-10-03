package com.oppo.bluetooth.btnet.bluetoothproxyserver.server;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"", "", "a", "device_btnet_impl_release"}, k = 2, mv = {1, 8, 0})
public final class MqttTCPTunnelKt {
    @NotNull
    public static final String a(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        String upperCase = ArraysKt.joinToString$default(bArr, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1<Byte, CharSequence>() { // from class: com.oppo.bluetooth.btnet.bluetoothproxyserver.server.MqttTCPTunnelKt$toHexString$1
            @NotNull
            public final CharSequence invoke(byte b) {
                String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return str;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).byteValue());
            }
        }, 30, (Object) null).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
