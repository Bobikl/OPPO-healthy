package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0005\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006 "}, d2 = {"Lcom/heytap/store/business/component/entity/LiveSubscribeBean;", "", "openMessageAuthText", "", "subscribeSuccessText", "isSubscribe", "", "message", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "setSubscribe", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getOpenMessageAuthText", "setOpenMessageAuthText", "getSubscribeSuccessText", "setSubscribeSuccessText", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/heytap/store/business/component/entity/LiveSubscribeBean;", "equals", "other", "hashCode", "", "toString", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class LiveSubscribeBean {

    @Nullable
    private Boolean isSubscribe;

    @Nullable
    private String message;

    @Nullable
    private String openMessageAuthText;

    @Nullable
    private String subscribeSuccessText;

    public LiveSubscribeBean() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ LiveSubscribeBean copy$default(LiveSubscribeBean liveSubscribeBean, String str, String str2, Boolean bool, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liveSubscribeBean.openMessageAuthText;
        }
        if ((i & 2) != 0) {
            str2 = liveSubscribeBean.subscribeSuccessText;
        }
        if ((i & 4) != 0) {
            bool = liveSubscribeBean.isSubscribe;
        }
        if ((i & 8) != 0) {
            str3 = liveSubscribeBean.message;
        }
        return liveSubscribeBean.copy(str, str2, bool, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOpenMessageAuthText() {
        return this.openMessageAuthText;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubscribeSuccessText() {
        return this.subscribeSuccessText;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsSubscribe() {
        return this.isSubscribe;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final LiveSubscribeBean copy(@Nullable String openMessageAuthText, @Nullable String subscribeSuccessText, @Nullable Boolean isSubscribe, @Nullable String message) {
        return new LiveSubscribeBean(openMessageAuthText, subscribeSuccessText, isSubscribe, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveSubscribeBean)) {
            return false;
        }
        LiveSubscribeBean liveSubscribeBean = (LiveSubscribeBean) other;
        return Intrinsics.areEqual(this.openMessageAuthText, liveSubscribeBean.openMessageAuthText) && Intrinsics.areEqual(this.subscribeSuccessText, liveSubscribeBean.subscribeSuccessText) && Intrinsics.areEqual(this.isSubscribe, liveSubscribeBean.isSubscribe) && Intrinsics.areEqual(this.message, liveSubscribeBean.message);
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getOpenMessageAuthText() {
        return this.openMessageAuthText;
    }

    @Nullable
    public final String getSubscribeSuccessText() {
        return this.subscribeSuccessText;
    }

    public int hashCode() {
        String str = this.openMessageAuthText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subscribeSuccessText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isSubscribe;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.message;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Nullable
    public final Boolean isSubscribe() {
        return this.isSubscribe;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    public final void setOpenMessageAuthText(@Nullable String str) {
        this.openMessageAuthText = str;
    }

    public final void setSubscribe(@Nullable Boolean bool) {
        this.isSubscribe = bool;
    }

    public final void setSubscribeSuccessText(@Nullable String str) {
        this.subscribeSuccessText = str;
    }

    @NotNull
    public String toString() {
        return "LiveSubscribeBean(openMessageAuthText=" + ((Object) this.openMessageAuthText) + ", subscribeSuccessText=" + ((Object) this.subscribeSuccessText) + ", isSubscribe=" + this.isSubscribe + ", message=" + ((Object) this.message) + ')';
    }

    public LiveSubscribeBean(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3) {
        this.openMessageAuthText = str;
        this.subscribeSuccessText = str2;
        this.isSubscribe = bool;
        this.message = str3;
    }

    public /* synthetic */ LiveSubscribeBean(String str, String str2, Boolean bool, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? "" : str3);
    }
}
