package com.heytap.health.bloodpressure.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.bloodpressure.viewmodel.ResearchBpViewModel;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.iba;
import com.oplus.aiunit.vision.lq0;
import com.oplus.aiunit.vision.lza;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.v9g;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/bloodpressure/util/ResearchAppHelper;", "", "()V", "bloodPressureLastSyncTime", "", "getBloodPressureLastSyncTime", "()J", "setBloodPressureLastSyncTime", "(J)V", "lifeCardClickCount", "", "getLifeCardClickCount", "()I", "setLifeCardClickCount", "(I)V", "researchCardClickCount", "getResearchCardClickCount", "setResearchCardClickCount", "Companion", "blood_pressure_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ResearchAppHelper {

    @NotNull
    public static final String BPMINI_BLOOD_PRESSURE = "bpMini";

    @NotNull
    public static final String DOWNLOAD_RESEARCH_DEEPLINK = "healthap://app/path=113?extra_launch_type=7&jumpUrl=blood-pressure-assessment/index.html?page=PageProgress";

    @NotNull
    public static final String EVALUATION_DEEPLINK = "healthap://app/path=113?extra_launch_type=7&jumpUrl=blood-pressure-assessment/index.html?page=PageResearchGuide&step=1";
    public static final int KEY_INSTALL_RESEARCH_APP = 22;

    @NotNull
    private static final String LIFE_DEEPLINK = "research://app_research/BpLifestyle/BpLifestyleHomeFragment?projectId=-1";
    public static final long RESEARCH_APP_BLOOD_PRESSURE_START_TIME = 1672502400000L;
    public static final int RESEARCH_BLOOD_PRESSURE_VERSION = 1110100;

    @NotNull
    public static final String RESEARCH_PACKAGE = "com.heytap.research";

    @NotNull
    private static final String RISK_DEEPLINK = "research://app_research/Cuffless/CufflessHomeFragment";

    @NotNull
    public static final String SP_KEY_BLOOD_PRESSURE = "blood_pressure";

    @NotNull
    public static final String SP_KEY_RECOMMEND_SHOW_KEY = "recommend_show_key";

    @NotNull
    public static final String SURVEY_BLOOD_PRESSURE = "bloodPressure";

    @NotNull
    public static final String TAG = "ResearchAppHelper";

    @NotNull
    public static final String TYPE_EXIT = "exit";

    @NotNull
    public static final String TYPE_JOIN = "join";

    @NotNull
    public static final String TYPE_MONITOR = "homeMonitoring";

    @NotNull
    public static final String TYPE_NORMAL = "normal";
    private long bloodPressureLastSyncTime;
    private int lifeCardClickCount;
    private int researchCardClickCount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\f\u001a\u00020\u000bJ\u0015\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0012\u001a\u00020\u000bH\u0007J\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000bR\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u001c8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0014\u0010 \u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0016R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0016R\u0014\u0010\"\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0016R\u0014\u0010#\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0016R\u0014\u0010$\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0016R\u0014\u0010%\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0016R\u0014\u0010&\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0016R\u0014\u0010'\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0016R\u0014\u0010(\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0016R\u0014\u0010)\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/heytap/health/bloodpressure/util/ResearchAppHelper$Companion;", "", "", b2n.g, "f", "Landroid/content/Context;", "context", "deeplink", "code", "", "c", "", "d", MapSchema.FIELD_NAME_ENTRY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "state", "a", "b", CardAction.LIFE_CIRCLE_VALUE_SHOW, b2n.f, "BPMINI_BLOOD_PRESSURE", "Ljava/lang/String;", "DOWNLOAD_RESEARCH_DEEPLINK", "EVALUATION_DEEPLINK", "KEY_INSTALL_RESEARCH_APP", "I", "LIFE_DEEPLINK", "", "RESEARCH_APP_BLOOD_PRESSURE_START_TIME", "J", "RESEARCH_BLOOD_PRESSURE_VERSION", "RESEARCH_PACKAGE", "RISK_DEEPLINK", "SP_KEY_BLOOD_PRESSURE", "SP_KEY_RECOMMEND_SHOW_KEY", "SURVEY_BLOOD_PRESSURE", "TAG", "TYPE_EXIT", "TYPE_JOIN", "TYPE_MONITOR", "TYPE_NORMAL", "<init>", "()V", "blood_pressure_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(int state) {
            a7b.f(ResearchBpViewModel.TAG, " state = " + state);
            if (state != -1) {
                return state != 0 && (state == 1 || state == 2 || state == 3);
            }
            return true;
        }

        @JvmStatic
        public final boolean b() {
            return v9g.x(ResearchAppHelper.SP_KEY_BLOOD_PRESSURE).r(ResearchAppHelper.SP_KEY_RECOMMEND_SHOW_KEY, true);
        }

        public final void c(@NotNull Context context, @Nullable String deeplink, @Nullable String code) {
            String str;
            Intrinsics.checkNotNullParameter(context, "context");
            if (deeplink != null) {
                if (!iba.b(b78.a(), "com.heytap.research")) {
                    lq0.c(ResearchAppHelper.TAG, "not install research app or version is low");
                    return;
                }
                if (TextUtils.isEmpty(code)) {
                    str = "";
                } else {
                    str = "&code=" + code;
                }
                String str2 = deeplink + str;
                lq0.c(ResearchAppHelper.TAG, "toResearchApp uri = " + str2);
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 131072);
                Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "context.packageManager.q…                        )");
                if (lza.a(listQueryIntentActivities) || listQueryIntentActivities.get(0) == null) {
                    lq0.c(ResearchAppHelper.TAG, "not found uri activity");
                } else {
                    context.startActivity(intent);
                }
            }
        }

        public final boolean d() {
            return iba.b(b78.a(), "com.heytap.research");
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public final Object e(@NotNull Continuation<? super Boolean> continuation) {
            ResearchAppHelper$Companion$isJoinProject$1 researchAppHelper$Companion$isJoinProject$1;
            if (continuation instanceof ResearchAppHelper$Companion$isJoinProject$1) {
                researchAppHelper$Companion$isJoinProject$1 = (ResearchAppHelper$Companion$isJoinProject$1) continuation;
                int i = researchAppHelper$Companion$isJoinProject$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    researchAppHelper$Companion$isJoinProject$1.label = i - Integer.MIN_VALUE;
                } else {
                    researchAppHelper$Companion$isJoinProject$1 = new ResearchAppHelper$Companion$isJoinProject$1(this, continuation);
                }
            } else {
                researchAppHelper$Companion$isJoinProject$1 = new ResearchAppHelper$Companion$isJoinProject$1(this, continuation);
            }
            Object objG = researchAppHelper$Companion$isJoinProject$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = researchAppHelper$Companion$isJoinProject$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objG);
                ResearchBpViewModel researchBpViewModel = new ResearchBpViewModel();
                researchAppHelper$Companion$isJoinProject$1.label = 1;
                objG = researchBpViewModel.G(researchAppHelper$Companion$isJoinProject$1);
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objG);
            }
            Boolean bool = (Boolean) objG;
            if (bool == null) {
                return null;
            }
            boolean zBooleanValue = bool.booleanValue();
            a7b.f(ResearchAppHelper.TAG, "isJoinProject = " + zBooleanValue);
            return Boxing.boxBoolean(zBooleanValue);
        }

        @NotNull
        public final String f() {
            return "research://app_research/BpLifestyle/BpLifestyleHomeFragment?projectId=-1?token=" + um.c().getV1Token();
        }

        public final void g(boolean show) {
            v9g.x(ResearchAppHelper.SP_KEY_BLOOD_PRESSURE).W(ResearchAppHelper.SP_KEY_RECOMMEND_SHOW_KEY, show);
        }

        @NotNull
        public final String h() {
            return "research://app_research/Cuffless/CufflessHomeFragment?token=" + um.c().getV1Token();
        }
    }

    @JvmStatic
    public static final boolean getBloodPressureRecommendShow() {
        return INSTANCE.b();
    }

    public final long getBloodPressureLastSyncTime() {
        return this.bloodPressureLastSyncTime;
    }

    public final int getLifeCardClickCount() {
        return this.lifeCardClickCount;
    }

    public final int getResearchCardClickCount() {
        return this.researchCardClickCount;
    }

    public final void setBloodPressureLastSyncTime(long j2) {
        this.bloodPressureLastSyncTime = j2;
    }

    public final void setLifeCardClickCount(int i) {
        this.lifeCardClickCount = i;
    }

    public final void setResearchCardClickCount(int i) {
        this.researchCardClickCount = i;
    }
}
