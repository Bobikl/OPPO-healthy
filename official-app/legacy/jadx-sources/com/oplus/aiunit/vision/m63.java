package com.oplus.aiunit.vision;

import android.content.Intent;
import android.webkit.URLUtil;
import com.heytap.health.cervical_vertebra.R$string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/m63;", "", "", "c", "", "errCode", "a", "", "url", "b", "<init>", "()V", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0})
public final class m63 {

    @NotNull
    public static final m63 INSTANCE = new m63();

    public final int a(int errCode) {
        if (errCode == 1) {
            return R$string.cervical_vertebra_err_msg_install;
        }
        if (errCode == 2) {
            return R$string.cervical_vertebra_err_msg_support;
        }
        if (errCode == 3) {
            return R$string.cervical_vertebra_err_msg_ota_update;
        }
        if (errCode == 4) {
            return R$string.cervical_vertebra_err_msg_wearing;
        }
        z53.INSTANCE.b("undefine cervical vertebra error code");
        return R$string.cervical_vertebra_err_msg_support;
    }

    @Nullable
    public final String b(@Nullable String url) {
        if (!URLUtil.isNetworkUrl(url)) {
            return null;
        }
        Intrinsics.checkNotNull(url);
        String strSubstring = url.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) url, "/", 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean c() {
        String str;
        Intent intentB = com.heytap.health.rpc.host.c.INSTANCE.b(1);
        if (intentB == null || (str = intentB.getPackage()) == null) {
            return false;
        }
        return iba.b(b78.a(), str);
    }
}
