package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/an;", "", "", "ssoid", "", "accountType", "", "b", "a", Fields.HEIGHT_FIELD, "c", "weight", "d", "ACCOUNT_TYPE_NORMAL", "I", "ACCOUNT_TYPE_CHILD", "<init>", "()V", "account_impl_release"}, k = 1, mv = {1, 8, 0})
public final class an {
    public static final int $stable = 0;
    public static final int ACCOUNT_TYPE_CHILD = 2;
    public static final int ACCOUNT_TYPE_NORMAL = 1;

    @NotNull
    public static final an INSTANCE = new an();

    public final int a(@Nullable String ssoid) {
        if (TextUtils.isEmpty(ssoid)) {
            a7b.b("AccountInfoUtil", "getAccountType ssoid is empty!");
            return -1;
        }
        String strD = vbb.d(ssoid);
        Intrinsics.checkNotNullExpressionValue(strD, "strToMD5(ssoid)");
        return v9g.x("sp_health_account_info").z(strD + "sp_key_account_type", 0);
    }

    public final void b(@Nullable String ssoid, int accountType) {
        if (TextUtils.isEmpty(ssoid)) {
            a7b.b("AccountInfoUtil", "saveAccountType ssoid is empty!");
            return;
        }
        String strD = vbb.d(ssoid);
        Intrinsics.checkNotNullExpressionValue(strD, "strToMD5(ssoid)");
        v9g.x("sp_health_account_info").S(strD + "sp_key_account_type", accountType);
    }

    @NotNull
    public final String c(@NotNull String height) {
        int i;
        Intrinsics.checkNotNullParameter(height, "height");
        return (!TextUtils.isEmpty(height) && (i = (int) Double.parseDouble(height)) <= 2400 && i >= 600) ? height : UserInfo.HEIGHT_DEFAULT;
    }

    @NotNull
    public final String d(@NotNull String weight) {
        int i;
        Intrinsics.checkNotNullParameter(weight, "weight");
        return (!TextUtils.isEmpty(weight) && (i = (int) Double.parseDouble(weight)) <= 240000 && i >= 30000) ? weight : "60000";
    }
}
