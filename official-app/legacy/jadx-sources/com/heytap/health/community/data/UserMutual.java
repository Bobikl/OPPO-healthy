package com.heytap.health.community.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/community/data/UserMutual;", "", "liked", "", "followed", "mySelf", "blocked", "beBlocked", "(ZZZZZ)V", "getBeBlocked", "()Z", "getBlocked", "getFollowed", "setFollowed", "(Z)V", "getLiked", "getMySelf", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UserMutual {
    private final boolean beBlocked;
    private final boolean blocked;
    private boolean followed;
    private final boolean liked;
    private final boolean mySelf;

    public UserMutual(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.liked = z;
        this.followed = z2;
        this.mySelf = z3;
        this.blocked = z4;
        this.beBlocked = z5;
    }

    public static /* synthetic */ UserMutual copy$default(UserMutual userMutual, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = userMutual.liked;
        }
        if ((i & 2) != 0) {
            z2 = userMutual.followed;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = userMutual.mySelf;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = userMutual.blocked;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            z5 = userMutual.beBlocked;
        }
        return userMutual.copy(z, z6, z7, z8, z5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getLiked() {
        return this.liked;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getFollowed() {
        return this.followed;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getMySelf() {
        return this.mySelf;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getBlocked() {
        return this.blocked;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getBeBlocked() {
        return this.beBlocked;
    }

    @NotNull
    public final UserMutual copy(boolean liked, boolean followed, boolean mySelf, boolean blocked, boolean beBlocked) {
        return new UserMutual(liked, followed, mySelf, blocked, beBlocked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserMutual)) {
            return false;
        }
        UserMutual userMutual = (UserMutual) other;
        return this.liked == userMutual.liked && this.followed == userMutual.followed && this.mySelf == userMutual.mySelf && this.blocked == userMutual.blocked && this.beBlocked == userMutual.beBlocked;
    }

    public final boolean getBeBlocked() {
        return this.beBlocked;
    }

    public final boolean getBlocked() {
        return this.blocked;
    }

    public final boolean getFollowed() {
        return this.followed;
    }

    public final boolean getLiked() {
        return this.liked;
    }

    public final boolean getMySelf() {
        return this.mySelf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z = this.liked;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.followed;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.mySelf;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.blocked;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        int i4 = (i3 + r4) * 31;
        boolean z5 = this.beBlocked;
        return i4 + (z5 ? 1 : z5);
    }

    public final void setFollowed(boolean z) {
        this.followed = z;
    }

    @NotNull
    public String toString() {
        return "UserMutual(liked=" + this.liked + ", followed=" + this.followed + ", mySelf=" + this.mySelf + ", blocked=" + this.blocked + ", beBlocked=" + this.beBlocked + ")";
    }
}
