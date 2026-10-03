package com.oplus.aiunit.vision;

import com.heytap.health.base.R$string;
import com.heytap.sporthealth.blib.helper.DisconnectException;
import com.heytap.sporthealth.blib.helper.SilentUIStateException;
import com.heytap.sporthealth.blib.helper.UIStateException;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"", "", "a", "lib_ui_release"}, k = 2, mv = {1, 8, 0})
public final class ra2 {
    public static final void a(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        yha.j(th);
        if (th instanceof SilentUIStateException) {
            return;
        }
        if (!(th instanceof UIStateException)) {
            rg7.l(R$string.lib_base_retry_later);
            return;
        }
        if (th instanceof DisconnectException) {
            rg7.l(R$string.lib_base_device_disconnected_retry_later);
            return;
        }
        UIStateException uIStateException = (UIStateException) th;
        if (mtj.b(uIStateException.getMessage())) {
            return;
        }
        rg7.m(uIStateException.getMessage());
    }
}
