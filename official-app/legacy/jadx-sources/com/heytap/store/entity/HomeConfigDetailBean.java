package com.heytap.store.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001a\u0010\u001a\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001a\u0010 \u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rR\u001a\u0010#\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\b¨\u0006&"}, d2 = {"Lcom/heytap/store/entity/HomeConfigDetailBean;", "", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "isLogin", "", "()Z", "setLogin", "(Z)V", "link", "getLink", "setLink", "mediaType", "", "getMediaType", "()I", "setMediaType", "(I)V", "pic", "getPic", "setPic", "seq", "getSeq", "setSeq", "subPic", "getSubPic", "setSubPic", "switchValue", "getSwitchValue", "setSwitchValue", "title", "getTitle", "setTitle", "datapersistence_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class HomeConfigDetailBean {
    private boolean isLogin;
    private int mediaType;
    private int seq;
    private boolean switchValue;

    @NotNull
    private String id = "";

    @NotNull
    private String title = "";

    @NotNull
    private String link = "";

    @NotNull
    private String pic = "";

    @NotNull
    private String subPic = "";

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    public final int getMediaType() {
        return this.mediaType;
    }

    @NotNull
    public final String getPic() {
        return this.pic;
    }

    public final int getSeq() {
        return this.seq;
    }

    @NotNull
    public final String getSubPic() {
        return this.subPic;
    }

    public final boolean getSwitchValue() {
        return this.switchValue;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: isLogin, reason: from getter */
    public final boolean getIsLogin() {
        return this.isLogin;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.link = str;
    }

    public final void setLogin(boolean z) {
        this.isLogin = z;
    }

    public final void setMediaType(int i) {
        this.mediaType = i;
    }

    public final void setPic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pic = str;
    }

    public final void setSeq(int i) {
        this.seq = i;
    }

    public final void setSubPic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subPic = str;
    }

    public final void setSwitchValue(boolean z) {
        this.switchValue = z;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }
}
