package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/heytap/store/homemodule/data/PicLinkDetail;", "", "isLogin", "", "link", "", "pic", "(ZLjava/lang/String;Ljava/lang/String;)V", "()Z", "setLogin", "(Z)V", "getLink", "()Ljava/lang/String;", "setLink", "(Ljava/lang/String;)V", "getPic", "setPic", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class PicLinkDetail {
    private boolean isLogin;

    @NotNull
    private String link;

    @NotNull
    private String pic;

    public PicLinkDetail() {
        this(false, null, null, 7, null);
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getPic() {
        return this.pic;
    }

    /* JADX INFO: renamed from: isLogin, reason: from getter */
    public final boolean getIsLogin() {
        return this.isLogin;
    }

    public final void setLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.link = str;
    }

    public final void setLogin(boolean z) {
        this.isLogin = z;
    }

    public final void setPic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pic = str;
    }

    public PicLinkDetail(boolean z, @NotNull String link, @NotNull String pic) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(pic, "pic");
        this.isLogin = z;
        this.link = link;
        this.pic = pic;
    }

    public /* synthetic */ PicLinkDetail(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
