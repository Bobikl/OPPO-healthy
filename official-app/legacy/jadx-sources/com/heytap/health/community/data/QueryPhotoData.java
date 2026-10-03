package com.heytap.health.community.data;

import androidx.annotation.Keep;
import com.opos.process.bridge.base.BridgeConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/community/data/QueryPhotoData;", "", "data", "Lcom/heytap/health/community/data/ChoosePhotosData;", BridgeConstant.KEY_EXTRAS, "Lcom/heytap/health/community/data/QueryPhotoExtraData;", "(Lcom/heytap/health/community/data/ChoosePhotosData;Lcom/heytap/health/community/data/QueryPhotoExtraData;)V", "getData", "()Lcom/heytap/health/community/data/ChoosePhotosData;", "setData", "(Lcom/heytap/health/community/data/ChoosePhotosData;)V", "getExtras", "()Lcom/heytap/health/community/data/QueryPhotoExtraData;", "setExtras", "(Lcom/heytap/health/community/data/QueryPhotoExtraData;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "community_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class QueryPhotoData {

    @NotNull
    private ChoosePhotosData data;

    @NotNull
    private QueryPhotoExtraData extras;

    public QueryPhotoData(@NotNull ChoosePhotosData data, @NotNull QueryPhotoExtraData extras) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.data = data;
        this.extras = extras;
    }

    public static /* synthetic */ QueryPhotoData copy$default(QueryPhotoData queryPhotoData, ChoosePhotosData choosePhotosData, QueryPhotoExtraData queryPhotoExtraData, int i, Object obj) {
        if ((i & 1) != 0) {
            choosePhotosData = queryPhotoData.data;
        }
        if ((i & 2) != 0) {
            queryPhotoExtraData = queryPhotoData.extras;
        }
        return queryPhotoData.copy(choosePhotosData, queryPhotoExtraData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChoosePhotosData getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final QueryPhotoExtraData getExtras() {
        return this.extras;
    }

    @NotNull
    public final QueryPhotoData copy(@NotNull ChoosePhotosData data, @NotNull QueryPhotoExtraData extras) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new QueryPhotoData(data, extras);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryPhotoData)) {
            return false;
        }
        QueryPhotoData queryPhotoData = (QueryPhotoData) other;
        return Intrinsics.areEqual(this.data, queryPhotoData.data) && Intrinsics.areEqual(this.extras, queryPhotoData.extras);
    }

    @NotNull
    public final ChoosePhotosData getData() {
        return this.data;
    }

    @NotNull
    public final QueryPhotoExtraData getExtras() {
        return this.extras;
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + this.extras.hashCode();
    }

    public final void setData(@NotNull ChoosePhotosData choosePhotosData) {
        Intrinsics.checkNotNullParameter(choosePhotosData, "<set-?>");
        this.data = choosePhotosData;
    }

    public final void setExtras(@NotNull QueryPhotoExtraData queryPhotoExtraData) {
        Intrinsics.checkNotNullParameter(queryPhotoExtraData, "<set-?>");
        this.extras = queryPhotoExtraData;
    }

    @NotNull
    public String toString() {
        return "QueryPhotoData(data=" + this.data + ", extras=" + this.extras + ")";
    }
}
