package com.heytap.speech.engine;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/heytap/speech/engine/LogUploadBean;", "", "tag", "", "level", "", "message", "(Ljava/lang/String;ILjava/lang/String;)V", "getLevel", "()I", "getMessage", "()Ljava/lang/String;", "getTag", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class LogUploadBean {
    private final int level;

    @NotNull
    private final String message;

    @NotNull
    private final String tag;

    public LogUploadBean(@NotNull String tag, int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        this.tag = tag;
        this.level = i;
        this.message = message;
    }

    public static /* synthetic */ LogUploadBean copy$default(LogUploadBean logUploadBean, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = logUploadBean.tag;
        }
        if ((i2 & 2) != 0) {
            i = logUploadBean.level;
        }
        if ((i2 & 4) != 0) {
            str2 = logUploadBean.message;
        }
        return logUploadBean.copy(str, i, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final LogUploadBean copy(@NotNull String tag, int level, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        return new LogUploadBean(tag, level, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogUploadBean)) {
            return false;
        }
        LogUploadBean logUploadBean = (LogUploadBean) other;
        return Intrinsics.areEqual(this.tag, logUploadBean.tag) && this.level == logUploadBean.level && Intrinsics.areEqual(this.message, logUploadBean.message);
    }

    public final int getLevel() {
        return this.level;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return (((this.tag.hashCode() * 31) + Integer.hashCode(this.level)) * 31) + this.message.hashCode();
    }

    @NotNull
    public String toString() {
        return "LogUploadBean(tag=" + this.tag + ", level=" + this.level + ", message=" + this.message + ')';
    }
}
