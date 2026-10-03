package com.heytap.store.product_support.data;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/heytap/store/product_support/data/RecommendVoBean;", "", "()V", "code", "", "getCode", "()I", "setCode", "(I)V", "data", "", "Lcom/heytap/store/product_support/data/RecommendVo;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "setErrorMessage", "(Ljava/lang/String;)V", "message", "getMessage", "setMessage", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class RecommendVoBean {
    private int code;

    @Nullable
    private List<RecommendVo> data;

    @Nullable
    private String errorMessage;

    @Nullable
    private String message;

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final List<RecommendVo> getData() {
        return this.data;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setData(@Nullable List<RecommendVo> list) {
        this.data = list;
    }

    public final void setErrorMessage(@Nullable String str) {
        this.errorMessage = str;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }
}
