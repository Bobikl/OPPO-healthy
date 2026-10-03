package com.heytap.health.watchface.fluid;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b#\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001.BW\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b+\u0010,J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003Jc\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\fHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b&\u0010\u001eR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b'\u0010\u001eR\u0017\u0010\u0016\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/heytap/health/watchface/fluid/WfFileTransInfo;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "", "component9", "key", "code", "progress", "capsuleLeftText", "capsuleRightText", "title", "content", "dplink", "needExpand", "copy", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "I", "getCode", "()I", "getProgress", "getCapsuleLeftText", "getCapsuleRightText", "getTitle", "getContent", "getDplink", "Z", "getNeedExpand", "()Z", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Companion", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class WfFileTransInfo {
    public static final int CODE_EXCEPTION = -1;
    public static final int CODE_PROGRESS = 1;
    public static final int CODE_SUCCESS = 2;

    @NotNull
    private final String capsuleLeftText;

    @NotNull
    private final String capsuleRightText;
    private final int code;

    @NotNull
    private final String content;

    @NotNull
    private final String dplink;

    @NotNull
    private final String key;
    private final boolean needExpand;
    private final int progress;

    @NotNull
    private final String title;

    public WfFileTransInfo(@NotNull String key, int i, int i2, @NotNull String capsuleLeftText, @NotNull String capsuleRightText, @NotNull String title, @NotNull String content, @NotNull String dplink, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(capsuleLeftText, "capsuleLeftText");
        Intrinsics.checkNotNullParameter(capsuleRightText, "capsuleRightText");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(dplink, "dplink");
        this.key = key;
        this.code = i;
        this.progress = i2;
        this.capsuleLeftText = capsuleLeftText;
        this.capsuleRightText = capsuleRightText;
        this.title = title;
        this.content = content;
        this.dplink = dplink;
        this.needExpand = z;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCapsuleLeftText() {
        return this.capsuleLeftText;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCapsuleRightText() {
        return this.capsuleRightText;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDplink() {
        return this.dplink;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getNeedExpand() {
        return this.needExpand;
    }

    @NotNull
    public final WfFileTransInfo copy(@NotNull String key, int code, int progress, @NotNull String capsuleLeftText, @NotNull String capsuleRightText, @NotNull String title, @NotNull String content, @NotNull String dplink, boolean needExpand) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(capsuleLeftText, "capsuleLeftText");
        Intrinsics.checkNotNullParameter(capsuleRightText, "capsuleRightText");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(dplink, "dplink");
        return new WfFileTransInfo(key, code, progress, capsuleLeftText, capsuleRightText, title, content, dplink, needExpand);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WfFileTransInfo)) {
            return false;
        }
        WfFileTransInfo wfFileTransInfo = (WfFileTransInfo) other;
        return Intrinsics.areEqual(this.key, wfFileTransInfo.key) && this.code == wfFileTransInfo.code && this.progress == wfFileTransInfo.progress && Intrinsics.areEqual(this.capsuleLeftText, wfFileTransInfo.capsuleLeftText) && Intrinsics.areEqual(this.capsuleRightText, wfFileTransInfo.capsuleRightText) && Intrinsics.areEqual(this.title, wfFileTransInfo.title) && Intrinsics.areEqual(this.content, wfFileTransInfo.content) && Intrinsics.areEqual(this.dplink, wfFileTransInfo.dplink) && this.needExpand == wfFileTransInfo.needExpand;
    }

    @NotNull
    public final String getCapsuleLeftText() {
        return this.capsuleLeftText;
    }

    @NotNull
    public final String getCapsuleRightText() {
        return this.capsuleRightText;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getDplink() {
        return this.dplink;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final boolean getNeedExpand() {
        return this.needExpand;
    }

    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((((((((((((((this.key.hashCode() * 31) + Integer.hashCode(this.code)) * 31) + Integer.hashCode(this.progress)) * 31) + this.capsuleLeftText.hashCode()) * 31) + this.capsuleRightText.hashCode()) * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31) + this.dplink.hashCode()) * 31;
        boolean z = this.needExpand;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    @NotNull
    public String toString() {
        return "WfFileTransInfo(key=" + this.key + ", code=" + this.code + ", progress=" + this.progress + ", capsuleLeftText=" + this.capsuleLeftText + ", capsuleRightText=" + this.capsuleRightText + ", title=" + this.title + ", content=" + this.content + ", dplink=" + this.dplink + ", needExpand=" + this.needExpand + ")";
    }

    public /* synthetic */ WfFileTransInfo(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3, str4, str5, (i3 & 128) != 0 ? "" : str6, (i3 & 256) != 0 ? false : z);
    }
}
