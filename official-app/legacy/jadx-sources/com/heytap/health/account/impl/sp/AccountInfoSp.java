package com.heytap.health.account.impl.sp;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.accountsdk.open.core.web.executor.AcOpenGetTokenExecutor;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/heytap/health/account/impl/sp/AccountInfoSp;", "", "()V", AcOpenGetTokenExecutor.ACCOUNT_NAME_KEY, "", "getAccountName", "()Ljava/lang/String;", "setAccountName", "(Ljava/lang/String;)V", "userName", "getUserName", "setUserName", "account_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AccountInfoSp {
    public static final int $stable = 8;

    @NotNull
    private String userName = "";

    @NotNull
    private String accountName = "";

    @NotNull
    public final String getAccountName() {
        return this.accountName;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    public final void setAccountName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accountName = str;
    }

    public final void setUserName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userName = str;
    }
}
