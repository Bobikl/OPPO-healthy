package com.heytap.health.community.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000b¨\u0006!"}, d2 = {"Lcom/heytap/health/community/data/Mutual;", "", "liked", "", "followed", "beFollowed", "mySelf", "blocked", "beBlocked", "(ZZZZZZ)V", "getBeBlocked", "()Z", "getBeFollowed", "getBlocked", "getFollowed", "setFollowed", "(Z)V", "getLiked", "setLiked", "getMySelf", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Mutual {
    private final boolean beBlocked;
    private final boolean beFollowed;
    private final boolean blocked;
    private boolean followed;
    private boolean liked;
    private final boolean mySelf;

    public Mutual(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.liked = z;
        this.followed = z2;
        this.beFollowed = z3;
        this.mySelf = z4;
        this.blocked = z5;
        this.beBlocked = z6;
    }

    public static /* synthetic */ Mutual copy$default(Mutual mutual, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        if ((i & 1) != 0) {
            z = mutual.liked;
        }
        if ((i & 2) != 0) {
            z2 = mutual.followed;
        }
        boolean z7 = z2;
        if ((i & 4) != 0) {
            z3 = mutual.beFollowed;
        }
        boolean z8 = z3;
        if ((i & 8) != 0) {
            z4 = mutual.mySelf;
        }
        boolean z9 = z4;
        if ((i & 16) != 0) {
            z5 = mutual.blocked;
        }
        boolean z10 = z5;
        if ((i & 32) != 0) {
            z6 = mutual.beBlocked;
        }
        return mutual.copy(z, z7, z8, z9, z10, z6);
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
    public final boolean getBeFollowed() {
        return this.beFollowed;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getMySelf() {
        return this.mySelf;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getBlocked() {
        return this.blocked;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getBeBlocked() {
        return this.beBlocked;
    }

    @NotNull
    public final Mutual copy(boolean liked, boolean followed, boolean beFollowed, boolean mySelf, boolean blocked, boolean beBlocked) {
        return new Mutual(liked, followed, beFollowed, mySelf, blocked, beBlocked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Mutual)) {
            return false;
        }
        Mutual mutual = (Mutual) other;
        return this.liked == mutual.liked && this.followed == mutual.followed && this.beFollowed == mutual.beFollowed && this.mySelf == mutual.mySelf && this.blocked == mutual.blocked && this.beBlocked == mutual.beBlocked;
    }

    public final boolean getBeBlocked() {
        return this.beBlocked;
    }

    public final boolean getBeFollowed() {
        return this.beFollowed;
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
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
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
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
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
        boolean z3 = this.beFollowed;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.mySelf;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        int i4 = (i3 + r4) * 31;
        boolean z5 = this.blocked;
        ?? r5 = z5;
        if (z5) {
            r5 = 1;
        }
        int i5 = (i4 + r5) * 31;
        boolean z6 = this.beBlocked;
        return i5 + (z6 ? 1 : z6);
    }

    public final void setFollowed(boolean z) {
        this.followed = z;
    }

    public final void setLiked(boolean z) {
        this.liked = z;
    }

    @NotNull
    public String toString() {
        return "Mutual(liked=" + this.liked + ", followed=" + this.followed + ", beFollowed=" + this.beFollowed + ", mySelf=" + this.mySelf + ", blocked=" + this.blocked + ", beBlocked=" + this.beBlocked + ")";
    }
}
