package com.heytap.health.community.utils;

import androidx.lifecycle.MutableLiveData;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/community/utils/NotifyUtils;", "", "Companion", "a", "b", "c", "community_release"}, k = 1, mv = {1, 8, 0})
public final class NotifyUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Lazy<MutableLiveData<PostMsg>> a = LazyKt__LazyJVMKt.lazy(new Function0<MutableLiveData<PostMsg>>() { // from class: com.heytap.health.community.utils.NotifyUtils$Companion$h5PostMsgLiveData$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final MutableLiveData<NotifyUtils.PostMsg> invoke() {
            return new MutableLiveData<>();
        }
    });

    @NotNull
    public static final Lazy<MutableLiveData<FollowUserMsg>> b = LazyKt__LazyJVMKt.lazy(new Function0<MutableLiveData<FollowUserMsg>>() { // from class: com.heytap.health.community.utils.NotifyUtils$Companion$userFollowStatusLiveData$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final MutableLiveData<NotifyUtils.FollowUserMsg> invoke() {
            return new MutableLiveData<>();
        }
    });

    /* JADX INFO: renamed from: com.heytap.health.community.utils.NotifyUtils$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/community/utils/NotifyUtils$a;", "", "Landroidx/lifecycle/MutableLiveData;", "Lcom/heytap/health/community/utils/NotifyUtils$c;", "h5PostMsgLiveData$delegate", "Lkotlin/Lazy;", "a", "()Landroidx/lifecycle/MutableLiveData;", "h5PostMsgLiveData", "Lcom/heytap/health/community/utils/NotifyUtils$b;", "userFollowStatusLiveData$delegate", "b", "userFollowStatusLiveData", "<init>", "()V", "community_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MutableLiveData<PostMsg> a() {
            return (MutableLiveData) NotifyUtils.a.getValue();
        }

        @NotNull
        public final MutableLiveData<FollowUserMsg> b() {
            return (MutableLiveData) NotifyUtils.b.getValue();
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.community.utils.NotifyUtils$b, reason: from toString */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/community/utils/NotifyUtils$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "userEncryptedSsoid", "Z", "()Z", "followStatus", "<init>", "(Ljava/lang/String;Z)V", "community_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class FollowUserMsg {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String userEncryptedSsoid;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean followStatus;

        public FollowUserMsg(@NotNull String userEncryptedSsoid, boolean z) {
            Intrinsics.checkNotNullParameter(userEncryptedSsoid, "userEncryptedSsoid");
            this.userEncryptedSsoid = userEncryptedSsoid;
            this.followStatus = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getFollowStatus() {
            return this.followStatus;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUserEncryptedSsoid() {
            return this.userEncryptedSsoid;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FollowUserMsg)) {
                return false;
            }
            FollowUserMsg followUserMsg = (FollowUserMsg) other;
            return Intrinsics.areEqual(this.userEncryptedSsoid, followUserMsg.userEncryptedSsoid) && this.followStatus == followUserMsg.followStatus;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public int hashCode() {
            int iHashCode = this.userEncryptedSsoid.hashCode() * 31;
            boolean z = this.followStatus;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return iHashCode + r1;
        }

        @NotNull
        public String toString() {
            return "FollowUserMsg(userEncryptedSsoid=" + this.userEncryptedSsoid + ", followStatus=" + this.followStatus + ")";
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.community.utils.NotifyUtils$c, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/community/utils/NotifyUtils$c;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", MapSchema.FIELD_NAME_ENTRY, "()J", "postId", "b", "Z", "d", "()Z", "hasLiked", "c", "followedNumber", "commentNumber", "dialogNumber", "<init>", "(JZJJJ)V", "community_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class PostMsg {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final long postId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean hasLiked;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final long followedNumber;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        public final long commentNumber;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final long dialogNumber;

        public PostMsg(long j2, boolean z, long j3, long j4, long j5) {
            this.postId = j2;
            this.hasLiked = z;
            this.followedNumber = j3;
            this.commentNumber = j4;
            this.dialogNumber = j5;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getCommentNumber() {
            return this.commentNumber;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getDialogNumber() {
            return this.dialogNumber;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getFollowedNumber() {
            return this.followedNumber;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getHasLiked() {
            return this.hasLiked;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getPostId() {
            return this.postId;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PostMsg)) {
                return false;
            }
            PostMsg postMsg = (PostMsg) other;
            return this.postId == postMsg.postId && this.hasLiked == postMsg.hasLiked && this.followedNumber == postMsg.followedNumber && this.commentNumber == postMsg.commentNumber && this.dialogNumber == postMsg.dialogNumber;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        public int hashCode() {
            int iHashCode = Long.hashCode(this.postId) * 31;
            boolean z = this.hasLiked;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return ((((((iHashCode + r1) * 31) + Long.hashCode(this.followedNumber)) * 31) + Long.hashCode(this.commentNumber)) * 31) + Long.hashCode(this.dialogNumber);
        }

        @NotNull
        public String toString() {
            return "PostMsg(postId=" + this.postId + ", hasLiked=" + this.hasLiked + ", followedNumber=" + this.followedNumber + ", commentNumber=" + this.commentNumber + ", dialogNumber=" + this.dialogNumber + ")";
        }
    }
}
