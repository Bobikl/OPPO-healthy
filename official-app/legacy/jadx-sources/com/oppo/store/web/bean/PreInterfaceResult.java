package com.oppo.store.web.bean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/oppo/store/web/bean/PreInterfaceResult;", "", "code", "", "errorType", "", "errorMessage", "data", "Lcom/oppo/store/web/bean/PreInterfaceResult$Data;", "(ILjava/lang/String;Ljava/lang/String;Lcom/oppo/store/web/bean/PreInterfaceResult$Data;)V", "getCode", "()I", "getData", "()Lcom/oppo/store/web/bean/PreInterfaceResult$Data;", "getErrorMessage", "()Ljava/lang/String;", "getErrorType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Data", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class PreInterfaceResult {
    private final int code;

    @Nullable
    private final Data data;

    @Nullable
    private final String errorMessage;

    @Nullable
    private final String errorType;

    @Keep
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/oppo/store/web/bean/PreInterfaceResult$Data;", "", "pageInterfaces", "", "Lcom/oppo/store/web/bean/PageInterfaces;", "version", "", "(Ljava/util/List;Ljava/lang/String;)V", "getPageInterfaces", "()Ljava/util/List;", "getVersion", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Data {

        @NotNull
        private final List<PageInterfaces> pageInterfaces;

        @NotNull
        private final String version;

        public Data(@NotNull List<PageInterfaces> pageInterfaces, @NotNull String version) {
            Intrinsics.checkNotNullParameter(pageInterfaces, "pageInterfaces");
            Intrinsics.checkNotNullParameter(version, "version");
            this.pageInterfaces = pageInterfaces;
            this.version = version;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data copy$default(Data data, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = data.pageInterfaces;
            }
            if ((i & 2) != 0) {
                str = data.version;
            }
            return data.copy(list, str);
        }

        @NotNull
        public final List<PageInterfaces> component1() {
            return this.pageInterfaces;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        @NotNull
        public final Data copy(@NotNull List<PageInterfaces> pageInterfaces, @NotNull String version) {
            Intrinsics.checkNotNullParameter(pageInterfaces, "pageInterfaces");
            Intrinsics.checkNotNullParameter(version, "version");
            return new Data(pageInterfaces, version);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.areEqual(this.pageInterfaces, data.pageInterfaces) && Intrinsics.areEqual(this.version, data.version);
        }

        @NotNull
        public final List<PageInterfaces> getPageInterfaces() {
            return this.pageInterfaces;
        }

        @NotNull
        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return (this.pageInterfaces.hashCode() * 31) + this.version.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(pageInterfaces=" + this.pageInterfaces + ", version=" + this.version + ')';
        }
    }

    public PreInterfaceResult(int i, @Nullable String str, @Nullable String str2, @Nullable Data data) {
        this.code = i;
        this.errorType = str;
        this.errorMessage = str2;
        this.data = data;
    }

    public static /* synthetic */ PreInterfaceResult copy$default(PreInterfaceResult preInterfaceResult, int i, String str, String str2, Data data, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = preInterfaceResult.code;
        }
        if ((i2 & 2) != 0) {
            str = preInterfaceResult.errorType;
        }
        if ((i2 & 4) != 0) {
            str2 = preInterfaceResult.errorMessage;
        }
        if ((i2 & 8) != 0) {
            data = preInterfaceResult.data;
        }
        return preInterfaceResult.copy(i, str, str2, data);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @NotNull
    public final PreInterfaceResult copy(int code, @Nullable String errorType, @Nullable String errorMessage, @Nullable Data data) {
        return new PreInterfaceResult(code, errorType, errorMessage, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreInterfaceResult)) {
            return false;
        }
        PreInterfaceResult preInterfaceResult = (PreInterfaceResult) other;
        return this.code == preInterfaceResult.code && Intrinsics.areEqual(this.errorType, preInterfaceResult.errorType) && Intrinsics.areEqual(this.errorMessage, preInterfaceResult.errorMessage) && Intrinsics.areEqual(this.data, preInterfaceResult.data);
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final String getErrorType() {
        return this.errorType;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        String str = this.errorType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorMessage;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Data data = this.data;
        return iHashCode3 + (data != null ? data.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PreInterfaceResult(code=" + this.code + ", errorType=" + this.errorType + ", errorMessage=" + this.errorMessage + ", data=" + this.data + ')';
    }
}
