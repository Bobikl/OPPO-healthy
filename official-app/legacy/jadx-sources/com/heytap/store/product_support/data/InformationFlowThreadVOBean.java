package com.heytap.store.product_support.data;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.h27;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.TriggerEvent;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014R\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0012\"\u0004\b5\u0010\u0014R\u001a\u00106\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\"\u0010<\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lcom/heytap/store/product_support/data/InformationFlowThreadVOBean;", "", "()V", h27.FAMILY_KEY_PUSH_FRIEND_AVATAR, "", "getAvatar", "()Ljava/lang/String;", "setAvatar", "(Ljava/lang/String;)V", "content", "getContent", "setContent", "cover", "getCover", "setCover", "coverHeight", "", "getCoverHeight", "()I", "setCoverHeight", "(I)V", "coverWidth", "getCoverWidth", "setCoverWidth", "dateline", "getDateline", "setDateline", "imageType", "getImageType", "setImageType", "link", "getLink", "setLink", "liveImageVideoPath", "getLiveImageVideoPath", "setLiveImageVideoPath", "praiseNum", "", "getPraiseNum", "()J", "setPraiseNum", "(J)V", "praiseStatus", "getPraiseStatus", "setPraiseStatus", "tid", "getTid", "setTid", "title", "getTitle", "setTitle", "type", "getType", "setType", TriggerEvent.EXTRA_UID, "getUid", "setUid", "userName", "getUserName", "setUserName", "videos", "", "Lcom/heytap/store/product_support/data/InformationVideoBean;", "getVideos", "()Ljava/util/List;", "setVideos", "(Ljava/util/List;)V", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class InformationFlowThreadVOBean {
    private int coverHeight;
    private int coverWidth;
    private int dateline;
    private int imageType;
    private long praiseNum;
    private int praiseStatus;
    private int type;

    @Nullable
    private List<InformationVideoBean> videos;

    @NotNull
    private String avatar = "";

    @NotNull
    private String content = "";

    @NotNull
    private String cover = "";

    @NotNull
    private String liveImageVideoPath = "";

    @NotNull
    private String tid = "";

    @NotNull
    private String title = "";

    @NotNull
    private String uid = "";

    @NotNull
    private String userName = "";

    @NotNull
    private String link = "";

    @NotNull
    public final String getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getCover() {
        return this.cover;
    }

    public final int getCoverHeight() {
        return this.coverHeight;
    }

    public final int getCoverWidth() {
        return this.coverWidth;
    }

    public final int getDateline() {
        return this.dateline;
    }

    public final int getImageType() {
        return this.imageType;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getLiveImageVideoPath() {
        return this.liveImageVideoPath;
    }

    public final long getPraiseNum() {
        return this.praiseNum;
    }

    public final int getPraiseStatus() {
        return this.praiseStatus;
    }

    @NotNull
    public final String getTid() {
        return this.tid;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getUid() {
        return this.uid;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    @Nullable
    public final List<InformationVideoBean> getVideos() {
        return this.videos;
    }

    public final void setAvatar(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.avatar = str;
    }

    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.content = str;
    }

    public final void setCover(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cover = str;
    }

    public final void setCoverHeight(int i) {
        this.coverHeight = i;
    }

    public final void setCoverWidth(int i) {
        this.coverWidth = i;
    }

    public final void setDateline(int i) {
        this.dateline = i;
    }

    public final void setImageType(int i) {
        this.imageType = i;
    }

    public final void setLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.link = str;
    }

    public final void setLiveImageVideoPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.liveImageVideoPath = str;
    }

    public final void setPraiseNum(long j2) {
        this.praiseNum = j2;
    }

    public final void setPraiseStatus(int i) {
        this.praiseStatus = i;
    }

    public final void setTid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tid = str;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uid = str;
    }

    public final void setUserName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userName = str;
    }

    public final void setVideos(@Nullable List<InformationVideoBean> list) {
        this.videos = list;
    }
}
