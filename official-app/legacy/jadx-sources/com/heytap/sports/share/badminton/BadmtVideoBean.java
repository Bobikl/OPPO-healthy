package com.heytap.sports.share.badminton;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/heytap/sports/share/badminton/BadmtVideoBean;", "", "dataImageUrlM", "", "dataImageUrlF", "backgroudMp3", "videoList", "", "Lcom/heytap/sports/share/badminton/VideoList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getBackgroudMp3", "()Ljava/lang/String;", "getDataImageUrlF", "getDataImageUrlM", "getVideoList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BadmtVideoBean {
    public static final int $stable = 8;

    @Nullable
    private final String backgroudMp3;

    @NotNull
    private final String dataImageUrlF;

    @NotNull
    private final String dataImageUrlM;

    @Nullable
    private final List<VideoList> videoList;

    public BadmtVideoBean(@NotNull String dataImageUrlM, @NotNull String dataImageUrlF, @Nullable String str, @Nullable List<VideoList> list) {
        Intrinsics.checkNotNullParameter(dataImageUrlM, "dataImageUrlM");
        Intrinsics.checkNotNullParameter(dataImageUrlF, "dataImageUrlF");
        this.dataImageUrlM = dataImageUrlM;
        this.dataImageUrlF = dataImageUrlF;
        this.backgroudMp3 = str;
        this.videoList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BadmtVideoBean copy$default(BadmtVideoBean badmtVideoBean, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = badmtVideoBean.dataImageUrlM;
        }
        if ((i & 2) != 0) {
            str2 = badmtVideoBean.dataImageUrlF;
        }
        if ((i & 4) != 0) {
            str3 = badmtVideoBean.backgroudMp3;
        }
        if ((i & 8) != 0) {
            list = badmtVideoBean.videoList;
        }
        return badmtVideoBean.copy(str, str2, str3, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDataImageUrlM() {
        return this.dataImageUrlM;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDataImageUrlF() {
        return this.dataImageUrlF;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBackgroudMp3() {
        return this.backgroudMp3;
    }

    @Nullable
    public final List<VideoList> component4() {
        return this.videoList;
    }

    @NotNull
    public final BadmtVideoBean copy(@NotNull String dataImageUrlM, @NotNull String dataImageUrlF, @Nullable String backgroudMp3, @Nullable List<VideoList> videoList) {
        Intrinsics.checkNotNullParameter(dataImageUrlM, "dataImageUrlM");
        Intrinsics.checkNotNullParameter(dataImageUrlF, "dataImageUrlF");
        return new BadmtVideoBean(dataImageUrlM, dataImageUrlF, backgroudMp3, videoList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadmtVideoBean)) {
            return false;
        }
        BadmtVideoBean badmtVideoBean = (BadmtVideoBean) other;
        return Intrinsics.areEqual(this.dataImageUrlM, badmtVideoBean.dataImageUrlM) && Intrinsics.areEqual(this.dataImageUrlF, badmtVideoBean.dataImageUrlF) && Intrinsics.areEqual(this.backgroudMp3, badmtVideoBean.backgroudMp3) && Intrinsics.areEqual(this.videoList, badmtVideoBean.videoList);
    }

    @Nullable
    public final String getBackgroudMp3() {
        return this.backgroudMp3;
    }

    @NotNull
    public final String getDataImageUrlF() {
        return this.dataImageUrlF;
    }

    @NotNull
    public final String getDataImageUrlM() {
        return this.dataImageUrlM;
    }

    @Nullable
    public final List<VideoList> getVideoList() {
        return this.videoList;
    }

    public int hashCode() {
        int iHashCode = ((this.dataImageUrlM.hashCode() * 31) + this.dataImageUrlF.hashCode()) * 31;
        String str = this.backgroudMp3;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<VideoList> list = this.videoList;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BadmtVideoBean(dataImageUrlM=" + this.dataImageUrlM + ", dataImageUrlF=" + this.dataImageUrlF + ", backgroudMp3=" + this.backgroudMp3 + ", videoList=" + this.videoList + ")";
    }
}
