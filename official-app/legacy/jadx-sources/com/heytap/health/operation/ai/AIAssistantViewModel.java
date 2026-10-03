package com.heytap.health.operation.ai;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sporthealth.blib.basic.BasicStateViewModel;
import com.oplus.aiunit.vision.Switch;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.c0;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.mpe;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.vik;
import com.oplus.aiunit.vision.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsJVMKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b+\u0010,J\u001b\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000b\u001a\u00020\nJ\u001e\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007R\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0086D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R*\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\"\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR*\u0010&\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR*\u0010*\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lcom/heytap/health/operation/ai/AIAssistantViewModel;", "Lcom/heytap/sporthealth/blib/basic/BasicStateViewModel;", "", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "g0", "", "moduleId", vik.TAG_POSTION1, "switch", "f0", "", "o", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "value", LogFieldKey.PROCESS_NAME_KEY, "Z", "b0", "()Z", "h0", "(Z)V", "enterState", "q", "d0", "j0", "sportAnalyzeState", "r", "e0", "k0", "sportRecommendState", "s", "c0", "i0", "health60sState", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final class AIAssistantViewModel extends BasicStateViewModel<Object> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean enterState;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public boolean sportAnalyzeState;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean sportRecommendState;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public boolean health60sState;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/heytap/health/network/core/BaseResponse;", "Lcom/oplus/aiunit/vision/a6j;", "it", "", "a", "(Lcom/heytap/health/network/core/BaseResponse;)Z"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements mpe {
        public static final a<T> INSTANCE = new a<>();

        @Override // com.oplus.aiunit.vision.mpe
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(@NotNull BaseResponse<Switch> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getErrorCode() == 0 && it.getBody() != null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIAssistantViewModel(@NotNull SavedStateHandle stateHandle) {
        super(stateHandle);
        Intrinsics.checkNotNullParameter(stateHandle, "stateHandle");
        this.TAG = "AIAssistantViewModel";
    }

    @Override // com.heytap.sporthealth.blib.basic.BasicStateViewModel
    @Nullable
    public Object J(@NotNull SavedStateHandle savedStateHandle, @NotNull Continuation<? super Object> continuation) {
        h0(v9g.x(c0.SPNAME).r(c0.QUESTION_STATE, true));
        j0(v9g.x(c0.SPNAME).r(c0.SPORT_ANALYZE_STATE, true));
        k0(v9g.x(c0.SPNAME).r(c0.SPORT_RECOMMEND_STATE, true));
        i0(v9g.x(c0.SPNAME).r(c0.HEALTH_60S_RECOMMEND_STATE, true));
        return Boxing.boxInt(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a0(@NotNull Continuation<? super Boolean> continuation) {
        AIAssistantViewModel$get60sAiAnalyzeSwitchFromCloud$1 aIAssistantViewModel$get60sAiAnalyzeSwitchFromCloud$1;
        if (continuation instanceof AIAssistantViewModel$get60sAiAnalyzeSwitchFromCloud$1) {
            aIAssistantViewModel$get60sAiAnalyzeSwitchFromCloud$1 = (AIAssistantViewModel$get60sAiAnalyzeSwitchFromCloud$1) continuation;
            int i = aIAssistantViewModel$get60sAiAnalyzeSwitchFromCloud$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aIAssistantViewModel$get60sAiAnalyzeSwitchFromCloud$1.label = i - Integer.MIN_VALUE;
            } else {
                aIAssistantViewModel$get60sAiAnalyzeSwitchFromCloud$1 = new AIAssistantViewModel$get60sAiAnalyzeSwitchFromCloud$1(this, continuation);
            }
        } else {
            aIAssistantViewModel$get60sAiAnalyzeSwitchFromCloud$1 = new AIAssistantViewModel$get60sAiAnalyzeSwitchFromCloud$1(this, continuation);
        }
        Object objC = aIAssistantViewModel$get60sAiAnalyzeSwitchFromCloud$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aIAssistantViewModel$get60sAiAnalyzeSwitchFromCloud$1.label;
        boolean z = false;
        boolean z2 = true;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objC);
                lbd<BaseResponse<Switch>> lbdVarP = ((w0) com.heytap.health.network.core.a.j(w0.class)).a(MapsKt__MapsJVMKt.mapOf(TuplesKt.to("switchType", "114"))).L0(su8.d(this.TAG)).n0(su8.d(this.TAG)).P(a.INSTANCE);
                Intrinsics.checkNotNullExpressionValue(lbdVarP, "getCommApi(API::class.ja…!= null\n                }");
                aIAssistantViewModel$get60sAiAnalyzeSwitchFromCloud$1.L$0 = this;
                aIAssistantViewModel$get60sAiAnalyzeSwitchFromCloud$1.label = 1;
                objC = RxExtendKt.c(lbdVarP, aIAssistantViewModel$get60sAiAnalyzeSwitchFromCloud$1);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (AIAssistantViewModel) aIAssistantViewModel$get60sAiAnalyzeSwitchFromCloud$1.L$0;
                ResultKt.throwOnFailure(objC);
            }
            Intrinsics.checkNotNullExpressionValue(objC, "getCommApi(API::class.ja…            }.awaitOnce()");
            Switch r7 = (Switch) ((BaseResponse) objC).getBody();
            boolean z3 = r7 != null && r7.getSwitchStatus() == 1;
            String str = this.TAG;
            if (!z3) {
                z2 = false;
            }
            a7b.f(str, "114 switchStatus:" + z2);
            z = z3;
        } catch (Exception e2) {
            a7b.b(this.TAG, "get60sAiAnalyzeSwitchFromCloud error: " + e2.getMessage());
        }
        return Boxing.boxBoolean(z);
    }

    /* JADX INFO: renamed from: b0, reason: from getter */
    public final boolean getEnterState() {
        return this.enterState;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final boolean getHealth60sState() {
        return this.health60sState;
    }

    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getSportAnalyzeState() {
        return this.sportAnalyzeState;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final boolean getSportRecommendState() {
        return this.sportRecommendState;
    }

    public final void f0(int moduleId, int position1, boolean z) {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, Integer.valueOf(moduleId)).a(vik.TAG_POSTION1, Integer.valueOf(position1)).a("element", Integer.valueOf(!z ? 1 : 0)).b();
    }

    public final void g0() {
        com.heytap.health.base.track.a.x().a(vik.TAG_MODULE_ID, -1).b();
    }

    public final void h0(boolean z) {
        this.enterState = z;
        v9g.x(c0.SPNAME).W(c0.QUESTION_STATE, z);
    }

    public final void i0(boolean z) {
        this.health60sState = z;
        v9g.x(c0.SPNAME).W(c0.HEALTH_60S_RECOMMEND_STATE, z);
    }

    public final void j0(boolean z) {
        this.sportAnalyzeState = z;
        v9g.x(c0.SPNAME).W(c0.SPORT_ANALYZE_STATE, z);
    }

    public final void k0(boolean z) {
        this.sportRecommendState = z;
        v9g.x(c0.SPNAME).W(c0.SPORT_RECOMMEND_STATE, z);
    }
}
