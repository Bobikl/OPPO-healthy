package com.oplus.accountsdk.base.account.clients;

import android.content.Context;
import androidx.annotation.NonNull;
import com.oplus.accountsdk.base.account.beans.AcAccountToken;
import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.aiunit.vision.c8;
import com.oplus.aiunit.vision.il9;
import com.platform.usercenter.account.ams.bean.AcLoginParam;
import com.platform.usercenter.account.ams.ipc.AcAccountInfo;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class AcAccountClientWrapper implements il9 {
    private il9 mClient;

    public AcAccountClientWrapper(il9 il9Var) {
        setClient(il9Var);
    }

    @Override // com.oplus.aiunit.vision.il9
    public AcApiResponse<AcAccountInfo> getAccountInfo() {
        il9 il9Var = this.mClient;
        return il9Var != null ? il9Var.getAccountInfo() : new AcApiResponse<>(ResponseEnum.ERROR_UNKNOWN_INNER_ERROR, null);
    }

    @Override // com.oplus.aiunit.vision.il9
    @NonNull
    public AcApiResponse<AcAccountToken> getAccountToken() {
        il9 il9Var = this.mClient;
        return il9Var != null ? il9Var.getAccountToken() : new AcApiResponse<>(ResponseEnum.ERROR_UNKNOWN_INNER_ERROR, null);
    }

    @Override // com.oplus.aiunit.vision.il9
    public AcApiResponse<AcAccountToken> getV1Token() {
        il9 il9Var = this.mClient;
        return il9Var != null ? il9Var.getV1Token() : new AcApiResponse<>(ResponseEnum.ERROR_UNKNOWN_INNER_ERROR, null);
    }

    @Override // com.oplus.aiunit.vision.il9
    public boolean isLogin() {
        il9 il9Var = this.mClient;
        if (il9Var != null) {
            return il9Var.isLogin();
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.il9
    public void login(@NonNull Context context, @NonNull c8<AcApiResponse<String>> c8Var) {
        il9 il9Var = this.mClient;
        if (il9Var != null) {
            il9Var.login(context, c8Var);
        } else {
            c8Var.call(new AcApiResponse<>(ResponseEnum.ERROR_UNKNOWN_INNER_ERROR, null));
        }
    }

    @Override // com.oplus.aiunit.vision.il9
    public AcApiResponse<String> refresh() {
        il9 il9Var = this.mClient;
        return il9Var != null ? il9Var.refresh() : new AcApiResponse<>(ResponseEnum.ERROR_UNKNOWN_INNER_ERROR, null);
    }

    public void setClient(il9 il9Var) {
        this.mClient = il9Var;
    }

    @Override // com.oplus.aiunit.vision.il9
    public void login(@NotNull Context context, @Nullable AcLoginParam acLoginParam, @NotNull c8<AcApiResponse<String>> c8Var) {
        il9 il9Var = this.mClient;
        if (il9Var != null) {
            il9Var.login(context, acLoginParam, c8Var);
        } else {
            c8Var.call(new AcApiResponse<>(ResponseEnum.ERROR_UNKNOWN_INNER_ERROR, null));
        }
    }
}
