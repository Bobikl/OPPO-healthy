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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0010R\u0014\u0010!\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0010R\u0014\u0010#\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0010R\u0013\u0010%\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0006R\u0013\u0010'\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0010R\u0013\u0010+\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0006R\u0013\u0010-\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0006R\u0019\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/heytap/store/product_support/data/InformationFlowThread;", "", "()V", h27.FAMILY_KEY_PUSH_FRIEND_AVATAR, "", "getAvatar", "()Ljava/lang/String;", "completeCover", "getCompleteCover", "content", "getContent", "cover", "getCover", "coverHeight", "", "getCoverHeight", "()I", "coverWidth", "getCoverWidth", "dateline", "getDateline", "imageType", "getImageType", "setImageType", "(I)V", "link", "getLink", "liveImageVideoPath", "getLiveImageVideoPath", "setLiveImageVideoPath", "(Ljava/lang/String;)V", "praiseNum", "getPraiseNum", "praiseStatus", "getPraiseStatus", "serialVersionUID", "getSerialVersionUID", "tid", "getTid", "title", "getTitle", "type", "getType", TriggerEvent.EXTRA_UID, "getUid", "userName", "getUserName", "videos", "", "Lcom/heytap/store/product_support/data/Video;", "getVideos", "()Ljava/util/List;", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class InformationFlowThread {

    @Nullable
    private final String avatar;

    @Nullable
    private final String completeCover;

    @Nullable
    private final String content;

    @Nullable
    private final String cover;
    private final int coverHeight;
    private final int coverWidth;
    private final int dateline;
    private int imageType;

    @Nullable
    private final String link;

    @NotNull
    private String liveImageVideoPath = "";
    private final int praiseNum;
    private final int praiseStatus;
    private final int serialVersionUID;

    @Nullable
    private final String tid;

    @Nullable
    private final String title;
    private final int type;

    @Nullable
    private final String uid;

    @Nullable
    private final String userName;

    @Nullable
    private final List<Video> videos;

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final String getCompleteCover() {
        return this.completeCover;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
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

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getLiveImageVideoPath() {
        return this.liveImageVideoPath;
    }

    public final int getPraiseNum() {
        return this.praiseNum;
    }

    public final int getPraiseStatus() {
        return this.praiseStatus;
    }

    public final int getSerialVersionUID() {
        return this.serialVersionUID;
    }

    @Nullable
    public final String getTid() {
        return this.tid;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final String getUid() {
        return this.uid;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    @Nullable
    public final List<Video> getVideos() {
        return this.videos;
    }

    public final void setImageType(int i) {
        this.imageType = i;
    }

    public final void setLiveImageVideoPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.liveImageVideoPath = str;
    }
}
