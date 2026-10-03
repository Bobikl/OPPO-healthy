package com.platform.usercenter.account.ams.ipc;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.platform.usercenter.account.ams.bean.AcLoginParam;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcAuthLoginRequestBean extends AcAuthRequestBean {
    public AcLoginParam loginRequest;
    public String requestApiName;

    public AcAuthLoginRequestBean(@NonNull String str, @NonNull String str2, boolean z, boolean z2, @Nullable String str3, @Nullable String str4, @Nullable AcLoginParam acLoginParam) {
        super(str, str2, z, z2, str3, str4);
        this.loginRequest = acLoginParam;
    }

    public AcAuthLoginRequestBean(@NonNull String str, @NonNull String str2, boolean z, boolean z2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable AcLoginParam acLoginParam) {
        super(str, str2, z, z2, str3, str4);
        this.loginRequest = acLoginParam;
        this.requestApiName = str5;
    }
}
