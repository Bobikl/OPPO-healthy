package com.heytap.health.vision.processor.bean;

import androidx.annotation.Keep;
import com.heytap.store.platform.videoplayer.base.BuildConfig;
import com.oplus.aiunit.model.Feature;
import com.oplus.aiunit.model.WatchFaceRecom;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes16.dex */
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jg\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00052\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010%\u001a\u0004\b(\u0010'R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/heytap/health/devicemanager/processor/bean/ResBean;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "component1", "component2", "Lcom/heytap/health/devicemanager/processor/bean/Params;", "component3", BuildConfig.VERSION_NAME, "Lcom/heytap/health/devicemanager/processor/bean/FaceRes;", "component4", "Lcom/heytap/health/devicemanager/processor/bean/Res;", "component5", "Lcom/oplus/aiunit/vision/b97;", "component6", "Lcom/oplus/aiunit/vision/mhl;", "component7", "defaultId", "model", "params", "faceList", "res", "newFeatures", "recommendWatchDial", "copy", "toString", BuildConfig.VERSION_NAME, "hashCode", "other", BuildConfig.VERSION_NAME, "equals", "Ljava/lang/String;", "getDefaultId", "()Ljava/lang/String;", "getModel", "Lcom/heytap/health/devicemanager/processor/bean/Params;", "getParams", "()Lcom/heytap/health/devicemanager/processor/bean/Params;", "Ljava/util/List;", "getFaceList", "()Ljava/util/List;", "getRes", "getNewFeatures", "Lcom/oplus/aiunit/vision/mhl;", "getRecommendWatchDial", "()Lcom/oplus/aiunit/vision/mhl;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/heytap/health/devicemanager/processor/bean/Params;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/oplus/aiunit/vision/mhl;)V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ResBean {

    @NotNull
    private final String defaultId;

    @Nullable
    private final List<FaceRes> faceList;

    @NotNull
    private final String model;

    @Nullable
    private final List<Feature> newFeatures;

    @NotNull
    private final Params params;

    @Nullable
    private final WatchFaceRecom recommendWatchDial;

    @NotNull
    private final List<Res> res;

    public ResBean(@NotNull String str, @NotNull String str2, @NotNull Params params, @Nullable List<FaceRes> list, @NotNull List<Res> list2, @Nullable List<Feature> list3, @Nullable WatchFaceRecom watchFaceRecom) {
        Intrinsics.checkNotNullParameter(str, "defaultId");
        Intrinsics.checkNotNullParameter(str2, "model");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(list2, "res");
        this.defaultId = str;
        this.model = str2;
        this.params = params;
        this.faceList = list;
        this.res = list2;
        this.newFeatures = list3;
        this.recommendWatchDial = watchFaceRecom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResBean copy$default(ResBean resBean, String str, String str2, Params params, List list, List list2, List list3, WatchFaceRecom watchFaceRecom, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resBean.defaultId;
        }
        if ((i & 2) != 0) {
            str2 = resBean.model;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            params = resBean.params;
        }
        Params params2 = params;
        if ((i & 8) != 0) {
            list = resBean.faceList;
        }
        List list4 = list;
        if ((i & 16) != 0) {
            list2 = resBean.res;
        }
        List list5 = list2;
        if ((i & 32) != 0) {
            list3 = resBean.newFeatures;
        }
        List list6 = list3;
        if ((i & 64) != 0) {
            watchFaceRecom = resBean.recommendWatchDial;
        }
        return resBean.copy(str, str3, params2, list4, list5, list6, watchFaceRecom);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDefaultId() {
        return this.defaultId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Params getParams() {
        return this.params;
    }

    @Nullable
    public final List<FaceRes> component4() {
        return this.faceList;
    }

    @NotNull
    public final List<Res> component5() {
        return this.res;
    }

    @Nullable
    public final List<Feature> component6() {
        return this.newFeatures;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final WatchFaceRecom getRecommendWatchDial() {
        return this.recommendWatchDial;
    }

    @NotNull
    public final ResBean copy(@NotNull String defaultId, @NotNull String model, @NotNull Params params, @Nullable List<FaceRes> faceList, @NotNull List<Res> res, @Nullable List<Feature> newFeatures, @Nullable WatchFaceRecom recommendWatchDial) {
        Intrinsics.checkNotNullParameter(defaultId, "defaultId");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(res, "res");
        return new ResBean(defaultId, model, params, faceList, res, newFeatures, recommendWatchDial);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResBean)) {
            return false;
        }
        ResBean resBean = (ResBean) other;
        return Intrinsics.areEqual(this.defaultId, resBean.defaultId) && Intrinsics.areEqual(this.model, resBean.model) && Intrinsics.areEqual(this.params, resBean.params) && Intrinsics.areEqual(this.faceList, resBean.faceList) && Intrinsics.areEqual(this.res, resBean.res) && Intrinsics.areEqual(this.newFeatures, resBean.newFeatures) && Intrinsics.areEqual(this.recommendWatchDial, resBean.recommendWatchDial);
    }

    @NotNull
    public final String getDefaultId() {
        return this.defaultId;
    }

    @Nullable
    public final List<FaceRes> getFaceList() {
        return this.faceList;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @Nullable
    public final List<Feature> getNewFeatures() {
        return this.newFeatures;
    }

    @NotNull
    public final Params getParams() {
        return this.params;
    }

    @Nullable
    public final WatchFaceRecom getRecommendWatchDial() {
        return this.recommendWatchDial;
    }

    @NotNull
    public final List<Res> getRes() {
        return this.res;
    }

    public int hashCode() {
        int iHashCode = ((((this.defaultId.hashCode() * 31) + this.model.hashCode()) * 31) + this.params.hashCode()) * 31;
        List<FaceRes> list = this.faceList;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.res.hashCode()) * 31;
        List<Feature> list2 = this.newFeatures;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        WatchFaceRecom watchFaceRecom = this.recommendWatchDial;
        return iHashCode3 + (watchFaceRecom != null ? watchFaceRecom.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ResBean(defaultId=" + this.defaultId + ", model=" + this.model + ", params=" + this.params + ", faceList=" + this.faceList + ", res=" + this.res + ", newFeatures=" + this.newFeatures + ", recommendWatchDial=" + this.recommendWatchDial + ")";
    }

    public /* synthetic */ ResBean(String str, String str2, Params params, List list, List list2, List list3, WatchFaceRecom watchFaceRecom, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, params, list, list2, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : watchFaceRecom);
    }
}
