package com.platform.usercenter.basic.core.mvvm;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class Resource<T> {

    @Nullable
    public final int code;

    @Nullable
    public final T data;

    @Nullable
    public final String message;

    @NonNull
    public final Status status;

    public Resource(@NonNull Status status, @Nullable T t, int i, @Nullable String str) {
        this.status = status;
        this.data = t;
        this.code = i;
        this.message = str;
    }

    public static <T> Resource<T> cancel(@Nullable T t) {
        Status status = Status.CANCELED;
        return new Resource<>(status, t, status.ordinal(), status.name());
    }

    public static <T> Resource<T> error(int i, String str, @Nullable T t) {
        return new Resource<>(Status.ERROR, t, i, str);
    }

    public static boolean isCanceled(Status status) {
        return status == Status.CANCELED;
    }

    public static boolean isError(Status status) {
        return status == Status.ERROR;
    }

    public static boolean isLoading(Status status) {
        return status == Status.LOADING;
    }

    public static boolean isSuccessed(Status status) {
        return status == Status.SUCCESS;
    }

    public static <T> Resource<T> loading(@Nullable T t) {
        Status status = Status.LOADING;
        return new Resource<>(status, t, status.ordinal(), status.name());
    }

    public static <T> Resource<T> start(@Nullable T t) {
        Status status = Status.START;
        return new Resource<>(status, t, status.ordinal(), status.name());
    }

    public static <T> Resource<T> success(@Nullable T t) {
        Status status = Status.SUCCESS;
        return new Resource<>(status, t, status.ordinal(), status.name());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Resource resource = (Resource) obj;
        if (this.status != resource.status) {
            return false;
        }
        String str = this.message;
        if (str == null ? resource.message != null : !str.equals(resource.message)) {
            return false;
        }
        T t = this.data;
        if (t != null) {
            return t.equals(resource.data);
        }
        return resource.data == null;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        T t = this.data;
        return iHashCode2 + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        return "Resource{status=" + this.status + ", message='" + this.message + "', data=" + this.data + '}';
    }
}
