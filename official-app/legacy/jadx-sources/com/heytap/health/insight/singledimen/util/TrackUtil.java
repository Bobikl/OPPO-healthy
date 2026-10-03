package com.heytap.health.insight.singledimen.util;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.track.a;
import com.heytap.health.health.insight.Consumption;
import com.heytap.health.health.insight.Sleep;
import com.heytap.health.health.insight.Snore;
import com.heytap.health.health.insight.Step;
import com.oplus.aiunit.vision.f8b;
import com.oplus.aiunit.vision.vik;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004R\"\u0010\u0013\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/insight/singledimen/util/TrackUtil;", "", "Lcom/oplus/aiunit/vision/f8b;", "logicType", "", "a", "", "b", "Lcom/heytap/health/insight/singledimen/util/TrackUtil$NotifySource;", "source", "notifyCode", "d", "c", "", "I", "getInsightCardPos", "()I", MapSchema.FIELD_NAME_ENTRY, "(I)V", "insightCardPos", "<init>", "()V", "NotifyCondition", "NotifySource", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TrackUtil {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static int insightCardPos;

    @NotNull
    public static final TrackUtil INSTANCE = new TrackUtil();
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/heytap/health/insight/singledimen/util/TrackUtil$NotifyCondition;", "", "id", "", "(Ljava/lang/String;II)V", "getId", "()I", "MATCH_CONDITION", "REAL_SEND", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum NotifyCondition {
        MATCH_CONDITION(0),
        REAL_SEND(1);

        private final int id;

        NotifyCondition(int i) {
            this.id = i;
        }

        public final int getId() {
            return this.id;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/heytap/health/insight/singledimen/util/TrackUtil$NotifySource;", "", "id", "", "(Ljava/lang/String;II)V", "getId", "()I", "NET", "LOCAL", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum NotifySource {
        NET(0),
        LOCAL(1);

        private final int id;

        NotifySource(int i) {
            this.id = i;
        }

        public final int getId() {
            return this.id;
        }
    }

    @NotNull
    public final String a(@Nullable f8b logicType) {
        if (logicType == null) {
            return "";
        }
        if (logicType == Step.STEP_TRENT_MONTH || logicType == Step.STEP_TRENT_WEEK) {
            return "步数趋势";
        }
        if (logicType == Step.STEP_REACH_GOAL_WEEK || logicType == Step.STEP_REACH_GOAL_MONTH) {
            return "步数达标";
        }
        if (logicType == Step.STEP_DISTANCE_MONTH || logicType == Step.STEP_DISTANCE_WEEK) {
            return "活动距离";
        }
        if (logicType == Consumption.CALORIE_TRENT_MONTH || logicType == Consumption.CALORIE_TRENT_WEEK) {
            return "消耗趋势";
        }
        if (logicType == Consumption.CALORIE_REACH_GOAL_MONTH || logicType == Consumption.CALORIE_REACH_GOAL_WEEK) {
            return "消耗达标";
        }
        if (logicType == Sleep.SLEEP_DURATION_WEEK) {
            return "睡眠时长";
        }
        if (logicType == Sleep.SLEEP_SCORE_WEEK) {
            return "睡眠评分";
        }
        if (logicType == Sleep.SLEEP_LAW_WEEK) {
            return "睡眠规律";
        }
        if (logicType == Snore.SNORE_RISK_WEEK) {
            return "鼾症风险";
        }
        if (logicType == Snore.SNORE_DECIBEL_WEEK) {
            return "鼾声分贝";
        }
        if (logicType == Snore.SNORE_DURATION_WEEK) {
            return "鼾声时长";
        }
        return logicType == Snore.SNORE_TIMES_WEEK ? "鼾声个数" : "";
    }

    public final void b(@NotNull f8b logicType) {
        Intrinsics.checkNotNullParameter(logicType, "logicType");
        a.k().a(vik.TAG_MODULE_ID, Integer.valueOf(insightCardPos)).a("element", a(logicType)).a("home_card_name", "健康智眼").b();
    }

    public final void c(@NotNull NotifySource source, @NotNull String notifyCode) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(notifyCode, "notifyCode");
        a.q().a("message_source", Integer.valueOf(source.getId())).a("message_code", notifyCode).a("message_condition", NotifyCondition.MATCH_CONDITION).b();
    }

    public final void d(@NotNull NotifySource source, @NotNull String notifyCode) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(notifyCode, "notifyCode");
        a.q().a("message_source", Integer.valueOf(source.getId())).a("message_code", notifyCode).a("message_condition", NotifyCondition.REAL_SEND).b();
    }

    public final void e(int i) {
        insightCardPos = i;
    }
}
