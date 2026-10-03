package com.oplus.accountsdk.base.common.net.data;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.xa;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcSdkNetResponse<T, E> {
    private int code;
    private T data;
    private AcSdkErrorBean<E> error;
    private String netMessage;

    @Keep
    public static class AcSdkErrorBean<E> {
        private E errorData;
        private String message;

        public E getErrorData() {
            return this.errorData;
        }

        public String getMessage() {
            return this.message;
        }

        public void setErrorData(E e2) {
            this.errorData = e2;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        private AcSdkErrorBean(String str, E e2) {
            this.message = str;
            this.errorData = e2;
        }
    }

    public AcSdkNetResponse(int i, AcSdkErrorBean<E> acSdkErrorBean, T t, String str) {
        this.code = i;
        this.error = acSdkErrorBean;
        this.data = t;
        this.netMessage = str;
    }

    public static <T, E> AcSdkNetResponse<T, E> createError(int i, String str, String str2) {
        a aVar = null;
        return new AcSdkNetResponse<>(i, new AcSdkErrorBean(str, aVar), null, str2);
    }

    public static <T, E> AcSdkNetResponse<T, E> createSuccess(T t) {
        a aVar = null;
        return new AcSdkNetResponse<>(200, new AcSdkErrorBean("", aVar), t, "");
    }

    public static boolean isNetWorkError(int i) {
        if (-417006 == i || -417005 == i || -417004 == i || -417003 == i || -417002 == i || -417001 == i) {
            return true;
        }
        return i > 200 && i < 1000;
    }

    public int getCode() {
        return this.code;
    }

    public T getData() {
        return this.data;
    }

    public AcSdkErrorBean<E> getError() {
        return this.error;
    }

    public String getErrorMessage() {
        AcSdkErrorBean<E> acSdkErrorBean = this.error;
        return acSdkErrorBean != null ? ((AcSdkErrorBean) acSdkErrorBean).message : "";
    }

    public String getNetMessage() {
        return this.netMessage;
    }

    public boolean isSuccess() {
        return this.code == 200;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setData(T t) {
        this.data = t;
    }

    public void setError(AcSdkErrorBean<E> acSdkErrorBean) {
        this.error = acSdkErrorBean;
    }

    public void setNetMessage(String str) {
        this.netMessage = str;
    }

    @NonNull
    public String toString() {
        return xa.d(this);
    }

    public boolean isNetWorkError() {
        return isNetWorkError(this.code);
    }
}
