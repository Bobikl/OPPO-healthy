package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/heytap/store/homemodule/data/Comment;", "", "nickName", "", "comment", "(Ljava/lang/String;Ljava/lang/String;)V", "getComment", "()Ljava/lang/String;", "setComment", "(Ljava/lang/String;)V", "getNickName", "setNickName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class Comment {

    @Nullable
    private String comment;

    @Nullable
    private String nickName;

    public Comment(@Nullable String str, @Nullable String str2) {
        this.nickName = str;
        this.comment = str2;
    }

    public static /* synthetic */ Comment copy$default(Comment comment, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = comment.nickName;
        }
        if ((i & 2) != 0) {
            str2 = comment.comment;
        }
        return comment.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    @NotNull
    public final Comment copy(@Nullable String nickName, @Nullable String comment) {
        return new Comment(nickName, comment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Comment)) {
            return false;
        }
        Comment comment = (Comment) other;
        return Intrinsics.areEqual(this.nickName, comment.nickName) && Intrinsics.areEqual(this.comment, comment.comment);
    }

    @Nullable
    public final String getComment() {
        return this.comment;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    public int hashCode() {
        String str = this.nickName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.comment;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setComment(@Nullable String str) {
        this.comment = str;
    }

    public final void setNickName(@Nullable String str) {
        this.nickName = str;
    }

    @NotNull
    public String toString() {
        return "Comment(nickName=" + ((Object) this.nickName) + ", comment=" + ((Object) this.comment) + ')';
    }
}
