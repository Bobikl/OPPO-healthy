package com.oplus.aiunit.vision;

import com.heytap.health.community.impl.R$string;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/qzc;", "", "", "count", "", "a", "", "b", "<init>", "()V", "community_impl_release"}, k = 1, mv = {1, 8, 0})
public final class qzc {

    @NotNull
    public static final qzc INSTANCE = new qzc();

    @NotNull
    public final String a(long count) {
        String str;
        if (count < 10000) {
            return String.valueOf(count);
        }
        float f = 10;
        float fFloor = (float) Math.floor((count / ((long) 100)) / f);
        if (!b()) {
            String str2 = MessageFormat.format(qtf.l(R$string.community_ten_thousand), Integer.valueOf((int) fFloor));
            Intrinsics.checkNotNullExpressionValue(str2, "{// 数值都*10\n             …ds.toInt())\n            }");
            return str2;
        }
        if (fFloor % f == 0.0f) {
            str = MessageFormat.format(qtf.l(R$string.community_ten_thousand), Integer.valueOf((int) (fFloor / f)));
        } else {
            String strL = qtf.l(R$string.community_ten_thousand);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str3 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(fFloor / f)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            str = MessageFormat.format(strL, str3);
        }
        Intrinsics.checkNotNullExpressionValue(str, "{\n                if (th…          }\n            }");
        return str;
    }

    public final boolean b() {
        return Intrinsics.areEqual(kta.c(), Locale.CHINA.getLanguage());
    }
}
