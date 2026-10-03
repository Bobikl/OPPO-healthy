package com.oppo.store.web.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/oppo/store/web/bean/CommonCommandSendBean;", "", "url", "", "index", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/oppo/store/web/bean/CommonCommandSendBean;", "equals", "", "other", "hashCode", "toString", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class CommonCommandSendBean {

    @Nullable
    private final Integer index;

    @Nullable
    private final String url;

    public CommonCommandSendBean(@Nullable String str, @Nullable Integer num) {
        this.url = str;
        this.index = num;
    }

    public static /* synthetic */ CommonCommandSendBean copy$default(CommonCommandSendBean commonCommandSendBean, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commonCommandSendBean.url;
        }
        if ((i & 2) != 0) {
            num = commonCommandSendBean.index;
        }
        return commonCommandSendBean.copy(str, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getIndex() {
        return this.index;
    }

    @NotNull
    public final CommonCommandSendBean copy(@Nullable String url, @Nullable Integer index) {
        return new CommonCommandSendBean(url, index);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonCommandSendBean)) {
            return false;
        }
        CommonCommandSendBean commonCommandSendBean = (CommonCommandSendBean) other;
        return Intrinsics.areEqual(this.url, commonCommandSendBean.url) && Intrinsics.areEqual(this.index, commonCommandSendBean.index);
    }

    @Nullable
    public final Integer getIndex() {
        return this.index;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.index;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CommonCommandSendBean(url=" + this.url + ", index=" + this.index + ')';
    }
}
