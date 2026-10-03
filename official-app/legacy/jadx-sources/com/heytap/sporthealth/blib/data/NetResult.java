package com.heytap.sporthealth.blib.data;

import android.text.TextUtils;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class NetResult<D> {
    public static final int ERROR_CODE_REFRESHDATA = 1991;
    private static final int LOADING_EMPTY = 20190708;
    private static final int LOADING_SHOW = -19910113;
    private static final int LOADING_SUCCEED = 0;
    private static final int LOAD_MORE_ERROR = 20190527;
    private static final int LOAD_MORE_FINISH = 19910227;
    private static final int LOAD_MORE_SUCCEED = 19910113;

    @Keep
    public D body;
    public boolean hasNextPage;

    @Keep
    public String message;
    public int statusCodeValue = 0;

    @Keep
    public int errorCode = 0;

    public static <DA> NetResult<DA> newNetLoading() {
        NetResult<DA> netResult = new NetResult<>();
        netResult.statusCodeValue = LOADING_SHOW;
        return netResult;
    }

    public static <DA> NetResult<DA> newNetResultEmpty() {
        NetResult<DA> netResult = new NetResult<>();
        netResult.statusCodeValue = LOADING_EMPTY;
        return netResult;
    }

    public static <DA> NetResult<DA> newNetResultError() {
        return newNetResultError("");
    }

    public static <DA> NetResult<DA> newNetResultLoadMoreFail() {
        NetResult<DA> netResult = new NetResult<>();
        netResult.statusCodeValue = LOAD_MORE_ERROR;
        return netResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <DA> NetResult<DA> newNetResultLoadMoreFinish(DA da) {
        NetResult<DA> netResult = new NetResult<>();
        netResult.statusCodeValue = LOAD_MORE_FINISH;
        netResult.body = da;
        return netResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <DA> NetResult<DA> newNetResultLoadMoreSuccess(DA da) {
        NetResult<DA> netResult = new NetResult<>();
        netResult.errorCode = 0;
        netResult.statusCodeValue = LOAD_MORE_SUCCEED;
        netResult.body = da;
        return netResult;
    }

    public static <DA> NetResult<DA> newNetResultSuccess() {
        NetResult<DA> netResult = new NetResult<>();
        netResult.statusCodeValue = 0;
        return netResult;
    }

    public void asLoadMoreFinish() {
        this.statusCodeValue = LOAD_MORE_FINISH;
    }

    public void asLoadMoreSucceed() {
        this.statusCodeValue = LOAD_MORE_SUCCEED;
    }

    public void asLoadSucceed(boolean z) {
        this.statusCodeValue = 0;
        this.hasNextPage = z;
    }

    public boolean isEmpty() {
        if (isSucceed()) {
            return LOADING_EMPTY == this.statusCodeValue;
        }
        return !TextUtils.isEmpty(this.message);
    }

    public boolean isLoadMoreFail() {
        return LOAD_MORE_ERROR == this.statusCodeValue;
    }

    public boolean isLoadMoreFinish() {
        boolean z = LOAD_MORE_FINISH == this.statusCodeValue;
        if (z) {
            this.message = null;
        }
        return z;
    }

    public boolean isLoadMoreSucced() {
        boolean z = LOAD_MORE_SUCCEED == this.statusCodeValue;
        if (z) {
            this.message = null;
        }
        return z;
    }

    public boolean isShowLoading() {
        return LOADING_SHOW == this.statusCodeValue;
    }

    public boolean isSucceed() {
        boolean z = this.statusCodeValue == 0 && this.errorCode == 0;
        if (z) {
            this.message = null;
        }
        return z;
    }

    public String toString() {
        return "NetResult{statusCodeValue=" + this.statusCodeValue + ", errorCode=" + this.errorCode + ", message='" + this.message + "'}";
    }

    public static <DA> NetResult<DA> newNetResultError(String str) {
        NetResult<DA> netResult = new NetResult<>();
        netResult.statusCodeValue = -28;
        netResult.message = str;
        return netResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <DA> NetResult<DA> newNetResultSuccess(DA da) {
        NetResult<DA> netResult = new NetResult<>();
        netResult.errorCode = 0;
        netResult.statusCodeValue = 0;
        netResult.body = da;
        return netResult;
    }
}
