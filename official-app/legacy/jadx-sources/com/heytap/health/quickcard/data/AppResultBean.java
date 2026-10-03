package com.heytap.health.quickcard.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\nH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/quickcard/data/AppResultBean;", "", "()V", "data", "Lcom/heytap/health/quickcard/data/AppResultBean$ResultBean;", "getData", "()Lcom/heytap/health/quickcard/data/AppResultBean$ResultBean;", "setData", "(Lcom/heytap/health/quickcard/data/AppResultBean$ResultBean;)V", "type", "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "toString", "ResultBean", "quickcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppResultBean {

    @Nullable
    private ResultBean data;

    @NotNull
    private String type = "";

    @Nullable
    public final ResultBean getData() {
        return this.data;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final void setData(@Nullable ResultBean resultBean) {
        this.data = resultBean;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    @NotNull
    public String toString() {
        return "AppResultBean(type='" + this.type + "', data=" + this.data + ")";
    }

    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0002\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0001HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\b\u0010\u001c\u001a\u00020\u0005H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/quickcard/data/AppResultBean$ResultBean;", "", "code", "", "message", "", "payload", "(ILjava/lang/String;Ljava/lang/Object;)V", "getCode", "()I", "setCode", "(I)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getPayload", "()Ljava/lang/Object;", "setPayload", "(Ljava/lang/Object;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "quickcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ResultBean {
        private int code;

        @NotNull
        private String message;

        @NotNull
        private Object payload;

        public ResultBean(int i, @NotNull String message, @NotNull Object payload) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.code = i;
            this.message = message;
            this.payload = payload;
        }

        public static /* synthetic */ ResultBean copy$default(ResultBean resultBean, int i, String str, Object obj, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                i = resultBean.code;
            }
            if ((i2 & 2) != 0) {
                str = resultBean.message;
            }
            if ((i2 & 4) != 0) {
                obj = resultBean.payload;
            }
            return resultBean.copy(i, str, obj);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Object getPayload() {
            return this.payload;
        }

        @NotNull
        public final ResultBean copy(int code, @NotNull String message, @NotNull Object payload) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(payload, "payload");
            return new ResultBean(code, message, payload);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResultBean)) {
                return false;
            }
            ResultBean resultBean = (ResultBean) other;
            return this.code == resultBean.code && Intrinsics.areEqual(this.message, resultBean.message) && Intrinsics.areEqual(this.payload, resultBean.payload);
        }

        public final int getCode() {
            return this.code;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final Object getPayload() {
            return this.payload;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.code) * 31) + this.message.hashCode()) * 31) + this.payload.hashCode();
        }

        public final void setCode(int i) {
            this.code = i;
        }

        public final void setMessage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.message = str;
        }

        public final void setPayload(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "<set-?>");
            this.payload = obj;
        }

        @NotNull
        public String toString() {
            return "ResultBean(code=" + this.code + ", message='" + this.message + "', payload=" + this.payload + ")";
        }

        public /* synthetic */ ResultBean(int i, String str, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 200 : i, (i2 & 2) != 0 ? "" : str, obj);
        }
    }
}
