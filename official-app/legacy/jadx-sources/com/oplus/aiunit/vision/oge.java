package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengineservice.db.table.datacollection.DataCollection;
import com.heytap.health.account.AccountUserInfo;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt___StringsKt;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000bH\u0002J\u0012\u0010\u0012\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/oge;", "", "Lcom/heytap/health/account/AccountUserInfo;", UTraceSQLiteHelperKt.COL_INFO, "", "d", "", "birthday", "b", "userName", MapSchema.FIELD_NAME_ENTRY, "", DataCollection.FIELD, "content", "c", b2n.f, "len", "a", "f", "<init>", "()V", "account_impl_release"}, k = 1, mv = {1, 8, 0})
public final class oge {
    public static final int $stable = 0;

    @NotNull
    public static final oge INSTANCE = new oge();

    public final String a(int len) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append("*");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public final void b(String birthday) {
        c(2, f(birthday));
    }

    public final void c(int field, String content) {
        if (TextUtils.isEmpty(content)) {
            return;
        }
        n7a.Companion companion = n7a.INSTANCE;
        Intrinsics.checkNotNull(content);
        n7a.Companion.d(companion, field, 2, content, 0L, 0L, null, 56, null);
    }

    public final void d(@NotNull AccountUserInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        b(info.birthday);
        e(info.userName);
        n7a.Companion companion = n7a.INSTANCE;
        String str = info.avatarUrl;
        Intrinsics.checkNotNullExpressionValue(str, "info.avatarUrl");
        n7a.Companion.d(companion, 96, 2, str, 0L, 0L, null, 56, null);
    }

    public final void e(String userName) {
        c(95, g(userName));
    }

    public final String f(String content) {
        if (TextUtils.isEmpty(content)) {
            return "";
        }
        Intrinsics.checkNotNull(content);
        if (content.length() < 4) {
            return a(content.length());
        }
        String strSubstring = content.substring(0, 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring + "-**-**";
    }

    public final String g(String content) {
        if (TextUtils.isEmpty(content)) {
            return "";
        }
        Intrinsics.checkNotNull(content);
        int length = content.length();
        if (length == 1) {
            return content;
        }
        if (length == 2) {
            return StringsKt___StringsKt.first(content) + "*";
        }
        return (StringsKt___StringsKt.first(content) + a(content.length() - 2)) + StringsKt___StringsKt.last(content);
    }
}
