package com.heytap.health.health_archives.bean;

import com.heytap.health.health_archives.R$string;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.qtf;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.MapsKt__MapsJVMKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/health_archives/bean/HealthIndicatorTagType;", "", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "Companion", "a", "INDICATOR_REGULAR_REVIEW", "INDICATOR_APPROACH_ABNORMAL", "INDICATOR_ATTENTION_REQUIRED", "INDICATOR_UPWARD_TREND", "INDICATOR_DOWNWARD_TREND", "INDICATOR_NORMAL_TREND", "INDICATOR_IMAGE", "INDICATOR_STABLE", "INDICATOR_OTHER_TREND", "health_archives_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHealthIndicatorTagType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthIndicatorTagType.kt\ncom/heytap/health/health_archives/bean/HealthIndicatorTagType\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,60:1\n8541#2,2:61\n8801#2,4:63\n*S KotlinDebug\n*F\n+ 1 HealthIndicatorTagType.kt\ncom/heytap/health/health_archives/bean/HealthIndicatorTagType\n*L\n48#1:61,2\n48#1:63,4\n*E\n"})
public enum HealthIndicatorTagType {
    INDICATOR_REGULAR_REVIEW("regular_review", R$string.health_archives_indicator_focus_tag),
    INDICATOR_APPROACH_ABNORMAL("approach_abnormal", R$string.health_archives_indicator_tag_terminate),
    INDICATOR_ATTENTION_REQUIRED("attention_required", R$string.health_archives_indicator_tag_attention_required),
    INDICATOR_UPWARD_TREND("upward_trend", R$string.health_archives_indicator_tag_increase),
    INDICATOR_DOWNWARD_TREND("downward_trend", R$string.health_archives_indicator_tag_decrease),
    INDICATOR_NORMAL_TREND("normal_trend", R$string.health_archives_indicator_tag_normal),
    INDICATOR_IMAGE(c8l.IMAGE_KEY, R$string.health_archives_mri_indicator_tag),
    INDICATOR_STABLE("stable", R$string.health_archives_indicator_tag_stable),
    INDICATOR_OTHER_TREND("other_trend", R$string.health_archives_other_category);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<String, HealthIndicatorTagType> codeToEnumMap;

    @NotNull
    private final String code;
    private final int value;

    /* JADX INFO: renamed from: com.heytap.health.health_archives.bean.HealthIndicatorTagType$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0002R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/health_archives/bean/HealthIndicatorTagType$a;", "", "", "code", "", "b", "(Ljava/lang/String;)Ljava/lang/Integer;", "value", "a", "", "Lcom/heytap/health/health_archives/bean/HealthIndicatorTagType;", "codeToEnumMap", "Ljava/util/Map;", "<init>", "()V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHealthIndicatorTagType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthIndicatorTagType.kt\ncom/heytap/health/health_archives/bean/HealthIndicatorTagType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0025  */
        /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
        @Nullable
        public final String a(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            for (HealthIndicatorTagType healthIndicatorTagType : HealthIndicatorTagType.values()) {
                if (Intrinsics.areEqual(qtf.l(healthIndicatorTagType.getValue()), value)) {
                    if (healthIndicatorTagType != null) {
                        return healthIndicatorTagType.getCode();
                    }
                    return null;
                }
            }
            healthIndicatorTagType = null;
            if (healthIndicatorTagType != null) {
                return healthIndicatorTagType.getCode();
            }
            return null;
        }

        @Nullable
        public final Integer b(@NotNull String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            HealthIndicatorTagType healthIndicatorTagType = (HealthIndicatorTagType) HealthIndicatorTagType.codeToEnumMap.get(code);
            if (healthIndicatorTagType != null) {
                return Integer.valueOf(healthIndicatorTagType.getValue());
            }
            return null;
        }
    }

    static {
        HealthIndicatorTagType[] healthIndicatorTagTypeArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(healthIndicatorTagTypeArrValues.length), 16));
        for (HealthIndicatorTagType healthIndicatorTagType : healthIndicatorTagTypeArrValues) {
            linkedHashMap.put(healthIndicatorTagType.code, healthIndicatorTagType);
        }
        codeToEnumMap = linkedHashMap;
    }

    HealthIndicatorTagType(String str, int i) {
        this.code = str;
        this.value = i;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final int getValue() {
        return this.value;
    }
}
