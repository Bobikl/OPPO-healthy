package com.heytap.health.home.rankpage;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.health.home.datacard.RankParams;
import com.heytap.health.network.core.BaseResponse;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.faf;
import com.oplus.aiunit.vision.fkj;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.ld9;
import com.oplus.aiunit.vision.mpe;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.t04;
import com.oplus.aiunit.vision.um;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rJ\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\fR\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/heytap/health/home/rankpage/RankInfoRepository;", "", "", "adcode", "", "step", "Lcom/heytap/health/network/core/BaseResponse;", "Lcom/heytap/health/home/rankpage/UserRankBean;", "b", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/home/rankpage/RankListBean;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "hasPermission", "f", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/home/rankpage/RankStatusBean;", "d", "a", "Ljava/lang/String;", "TAG", "Lcom/oplus/aiunit/vision/faf;", "kotlin.jvm.PlatformType", "Lcom/oplus/aiunit/vision/faf;", "rankDataSource", "<init>", "()V", "RankListParams", "RankPermiStateReq", "home_impl_release"}, k = 1, mv = {1, 8, 0})
public final class RankInfoRepository {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "RankInfoRepository";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final faf rankDataSource = (faf) com.heytap.health.network.core.a.j(faf.class);

    @StabilityInferred(parameters = 0)
    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/home/rankpage/RankInfoRepository$RankListParams;", "", "mSsoid", "", "(Ljava/lang/String;)V", "getMSsoid", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "home_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class RankListParams {
        public static final int $stable = 0;

        @SerializedName("ssoid")
        @NotNull
        private final String mSsoid;

        public RankListParams(@NotNull String mSsoid) {
            Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
            this.mSsoid = mSsoid;
        }

        public static /* synthetic */ RankListParams copy$default(RankListParams rankListParams, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = rankListParams.mSsoid;
            }
            return rankListParams.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMSsoid() {
            return this.mSsoid;
        }

        @NotNull
        public final RankListParams copy(@NotNull String mSsoid) {
            Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
            return new RankListParams(mSsoid);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RankListParams) && Intrinsics.areEqual(this.mSsoid, ((RankListParams) other).mSsoid);
        }

        @NotNull
        public final String getMSsoid() {
            return this.mSsoid;
        }

        public int hashCode() {
            return this.mSsoid.hashCode();
        }

        @NotNull
        public String toString() {
            return "RankListParams(mSsoid=" + this.mSsoid + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/heytap/health/network/core/BaseResponse;", "Lcom/heytap/health/home/rankpage/RankStatusBean;", "result", "", "a", "(Lcom/heytap/health/network/core/BaseResponse;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements o14 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.o14
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull BaseResponse<RankStatusBean> result) {
            Intrinsics.checkNotNullParameter(result, "result");
            String unused = RankInfoRepository.this.TAG;
            if (result.getBody() == null || result.getErrorCode() != 0) {
                return;
            }
            a7b.f(RankInfoRepository.this.TAG, "queryRankPermissionState result" + result);
            RankInfoRepository rankInfoRepository = RankInfoRepository.this;
            RankStatusBean body = result.getBody();
            Intrinsics.checkNotNull(body);
            rankInfoRepository.e(body.getSwitchStatus() == 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/heytap/health/network/core/BaseResponse;", "Lcom/heytap/health/home/rankpage/RankStatusBean;", "stringBaseResponse", "", "a", "(Lcom/heytap/health/network/core/BaseResponse;)Z"}, k = 3, mv = {1, 8, 0})
    public static final class b<T> implements mpe {
        public static final b<T> INSTANCE = new b<>();

        @Override // com.oplus.aiunit.vision.mpe
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(@NotNull BaseResponse<RankStatusBean> stringBaseResponse) {
            Intrinsics.checkNotNullParameter(stringBaseResponse, "stringBaseResponse");
            return stringBaseResponse.getErrorCode() == 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull String str, int i, @NotNull Continuation<? super BaseResponse<UserRankBean>> continuation) {
        RankInfoRepository$getRankInfo$1 rankInfoRepository$getRankInfo$1;
        if (continuation instanceof RankInfoRepository$getRankInfo$1) {
            rankInfoRepository$getRankInfo$1 = (RankInfoRepository$getRankInfo$1) continuation;
            int i2 = rankInfoRepository$getRankInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rankInfoRepository$getRankInfo$1.label = i2 - Integer.MIN_VALUE;
            } else {
                rankInfoRepository$getRankInfo$1 = new RankInfoRepository$getRankInfo$1(this, continuation);
            }
        } else {
            rankInfoRepository$getRankInfo$1 = new RankInfoRepository$getRankInfo$1(this, continuation);
        }
        Object objC = rankInfoRepository$getRankInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = rankInfoRepository$getRankInfo$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objC);
            String ssoid = um.c().getSsoid();
            Intrinsics.checkNotNullExpressionValue(ssoid, "getAccountManager().ssoid");
            RankParams rankParams = new RankParams(ssoid, str, i, System.currentTimeMillis());
            StringBuilder sb = new StringBuilder();
            sb.append("push ");
            sb.append(rankParams);
            lbd<BaseResponse<UserRankBean>> lbdVarD = this.rankDataSource.d(rankParams);
            rankInfoRepository$getRankInfo$1.label = 1;
            objC = RxExtendKt.c(lbdVarD, rankInfoRepository$getRankInfo$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "rankDataSource.reportRegion(rankReq).awaitOnce()");
        return objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(@NotNull Continuation<? super BaseResponse<RankListBean>> continuation) {
        RankInfoRepository$queryRank$1 rankInfoRepository$queryRank$1;
        if (continuation instanceof RankInfoRepository$queryRank$1) {
            rankInfoRepository$queryRank$1 = (RankInfoRepository$queryRank$1) continuation;
            int i = rankInfoRepository$queryRank$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rankInfoRepository$queryRank$1.label = i - Integer.MIN_VALUE;
            } else {
                rankInfoRepository$queryRank$1 = new RankInfoRepository$queryRank$1(this, continuation);
            }
        } else {
            rankInfoRepository$queryRank$1 = new RankInfoRepository$queryRank$1(this, continuation);
        }
        Object objC = rankInfoRepository$queryRank$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = rankInfoRepository$queryRank$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            String ssoid = um.c().getSsoid();
            Intrinsics.checkNotNullExpressionValue(ssoid, "getAccountManager().ssoid");
            RankListParams rankListParams = new RankListParams(ssoid);
            StringBuilder sb = new StringBuilder();
            sb.append("Rank List req Json : ");
            sb.append(rankListParams);
            lbd<BaseResponse<RankListBean>> lbdVarA = this.rankDataSource.a(rankListParams);
            rankInfoRepository$queryRank$1.label = 1;
            objC = RxExtendKt.c(lbdVarA, rankInfoRepository$queryRank$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "rankDataSource.queryRegi…(rankListReq).awaitOnce()");
        return objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object d(@NotNull Continuation<? super BaseResponse<RankStatusBean>> continuation) {
        RankInfoRepository$queryRankPermissionState$1 rankInfoRepository$queryRankPermissionState$1;
        if (continuation instanceof RankInfoRepository$queryRankPermissionState$1) {
            rankInfoRepository$queryRankPermissionState$1 = (RankInfoRepository$queryRankPermissionState$1) continuation;
            int i = rankInfoRepository$queryRankPermissionState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rankInfoRepository$queryRankPermissionState$1.label = i - Integer.MIN_VALUE;
            } else {
                rankInfoRepository$queryRankPermissionState$1 = new RankInfoRepository$queryRankPermissionState$1(this, continuation);
            }
        } else {
            rankInfoRepository$queryRankPermissionState$1 = new RankInfoRepository$queryRankPermissionState$1(this, continuation);
        }
        Object objC = rankInfoRepository$queryRankPermissionState$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = rankInfoRepository$queryRankPermissionState$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            String ssoid = um.c().getSsoid();
            Intrinsics.checkNotNullExpressionValue(ssoid, "getAccountManager().ssoid");
            String strE = ilj.e();
            Intrinsics.checkNotNullExpressionValue(strE, "getAndroidId()");
            lbd<BaseResponse<RankStatusBean>> lbdVarP = this.rankDataSource.c(new RankPermiStateReq(ssoid, strE, 1)).L0(su8.c()).J(new a()).P(b.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(lbdVarP, "suspend fun queryRankPer…       .awaitOnce()\n    }");
            rankInfoRepository$queryRankPermissionState$1.label = 1;
            objC = RxExtendKt.c(lbdVarP, rankInfoRepository$queryRankPermissionState$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "suspend fun queryRankPer…       .awaitOnce()\n    }");
        return objC;
    }

    public final void e(boolean hasPermission) {
        ld9.N(hasPermission);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object f(boolean z, @NotNull Continuation<? super BaseResponse<String>> continuation) {
        RankInfoRepository$setRankPermissionState$1 rankInfoRepository$setRankPermissionState$1;
        if (continuation instanceof RankInfoRepository$setRankPermissionState$1) {
            rankInfoRepository$setRankPermissionState$1 = (RankInfoRepository$setRankPermissionState$1) continuation;
            int i = rankInfoRepository$setRankPermissionState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rankInfoRepository$setRankPermissionState$1.label = i - Integer.MIN_VALUE;
            } else {
                rankInfoRepository$setRankPermissionState$1 = new RankInfoRepository$setRankPermissionState$1(this, continuation);
            }
        } else {
            rankInfoRepository$setRankPermissionState$1 = new RankInfoRepository$setRankPermissionState$1(this, continuation);
        }
        Object objC = rankInfoRepository$setRankPermissionState$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = rankInfoRepository$setRankPermissionState$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            String ssoid = um.c().getSsoid();
            Intrinsics.checkNotNullExpressionValue(ssoid, "getAccountManager().ssoid");
            String strE = ilj.e();
            Intrinsics.checkNotNullExpressionValue(strE, "getAndroidId()");
            lbd<BaseResponse<String>> lbdVarB = this.rankDataSource.b(new RankPermiStateReq(ssoid, strE, !z ? 1 : 0));
            rankInfoRepository$setRankPermissionState$1.label = 1;
            objC = RxExtendKt.c(lbdVarB, rankInfoRepository$setRankPermissionState$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNullExpressionValue(objC, "rankDataSource.syncRankP…ankPermiPram).awaitOnce()");
        return objC;
    }

    @StabilityInferred(parameters = 0)
    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/home/rankpage/RankInfoRepository$RankPermiStateReq;", "", "ssoid", "", t04.DEVICE_UNIQUE_ID, fkj.PARAM_SWITCH_STATUS, "", "(Ljava/lang/String;Ljava/lang/String;I)V", "switchType", "(Ljava/lang/String;Ljava/lang/String;II)V", "getDeviceUniqueId", "()Ljava/lang/String;", "getSsoid", "getSwitchStatus", "()I", "getSwitchType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "home_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class RankPermiStateReq {
        public static final int $stable = 0;

        @SerializedName(t04.DEVICE_UNIQUE_ID)
        @NotNull
        private final String deviceUniqueId;

        @SerializedName("ssoid")
        @NotNull
        private final String ssoid;

        @SerializedName(fkj.PARAM_SWITCH_STATUS)
        private final int switchStatus;

        @SerializedName("switchType")
        private final int switchType;

        public RankPermiStateReq(@NotNull String ssoid, @NotNull String deviceUniqueId, int i, int i2) {
            Intrinsics.checkNotNullParameter(ssoid, "ssoid");
            Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
            this.ssoid = ssoid;
            this.deviceUniqueId = deviceUniqueId;
            this.switchType = i;
            this.switchStatus = i2;
        }

        public static /* synthetic */ RankPermiStateReq copy$default(RankPermiStateReq rankPermiStateReq, String str, String str2, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = rankPermiStateReq.ssoid;
            }
            if ((i3 & 2) != 0) {
                str2 = rankPermiStateReq.deviceUniqueId;
            }
            if ((i3 & 4) != 0) {
                i = rankPermiStateReq.switchType;
            }
            if ((i3 & 8) != 0) {
                i2 = rankPermiStateReq.switchStatus;
            }
            return rankPermiStateReq.copy(str, str2, i, i2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSsoid() {
            return this.ssoid;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDeviceUniqueId() {
            return this.deviceUniqueId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getSwitchType() {
            return this.switchType;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getSwitchStatus() {
            return this.switchStatus;
        }

        @NotNull
        public final RankPermiStateReq copy(@NotNull String ssoid, @NotNull String deviceUniqueId, int switchType, int switchStatus) {
            Intrinsics.checkNotNullParameter(ssoid, "ssoid");
            Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
            return new RankPermiStateReq(ssoid, deviceUniqueId, switchType, switchStatus);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RankPermiStateReq)) {
                return false;
            }
            RankPermiStateReq rankPermiStateReq = (RankPermiStateReq) other;
            return Intrinsics.areEqual(this.ssoid, rankPermiStateReq.ssoid) && Intrinsics.areEqual(this.deviceUniqueId, rankPermiStateReq.deviceUniqueId) && this.switchType == rankPermiStateReq.switchType && this.switchStatus == rankPermiStateReq.switchStatus;
        }

        @NotNull
        public final String getDeviceUniqueId() {
            return this.deviceUniqueId;
        }

        @NotNull
        public final String getSsoid() {
            return this.ssoid;
        }

        public final int getSwitchStatus() {
            return this.switchStatus;
        }

        public final int getSwitchType() {
            return this.switchType;
        }

        public int hashCode() {
            return (((((this.ssoid.hashCode() * 31) + this.deviceUniqueId.hashCode()) * 31) + Integer.hashCode(this.switchType)) * 31) + Integer.hashCode(this.switchStatus);
        }

        @NotNull
        public String toString() {
            return "RankPermiStateReq(ssoid=" + this.ssoid + ", deviceUniqueId=" + this.deviceUniqueId + ", switchType=" + this.switchType + ", switchStatus=" + this.switchStatus + ")";
        }

        public /* synthetic */ RankPermiStateReq(String str, String str2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i3 & 4) != 0 ? 51 : i, i2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public RankPermiStateReq(@NotNull String ssoid, @NotNull String deviceUniqueId, int i) {
            this(ssoid, deviceUniqueId, 51, i);
            Intrinsics.checkNotNullParameter(ssoid, "ssoid");
            Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
        }
    }
}
