package com.heytap.store.homemodule.data.blackcard;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/heytap/store/homemodule/data/blackcard/BlackCardUserVipInfo;", "", "()V", "code", "", "getCode", "()I", "setCode", "(I)V", "data", "Lcom/heytap/store/homemodule/data/blackcard/UserVipInfoVo;", "getData", "()Lcom/heytap/store/homemodule/data/blackcard/UserVipInfoVo;", "setData", "(Lcom/heytap/store/homemodule/data/blackcard/UserVipInfoVo;)V", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "setErrorMessage", "(Ljava/lang/String;)V", "msg", "getMsg", "setMsg", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class BlackCardUserVipInfo {
    private int code;

    @Nullable
    private UserVipInfoVo data;

    @Nullable
    private String errorMessage;

    @Nullable
    private String msg;

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final UserVipInfoVo getData() {
        return this.data;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setData(@Nullable UserVipInfoVo userVipInfoVo) {
        this.data = userVipInfoVo;
    }

    public final void setErrorMessage(@Nullable String str) {
        this.errorMessage = str;
    }

    public final void setMsg(@Nullable String str) {
        this.msg = str;
    }
}
