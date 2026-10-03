package com.heytap.health.health_archives.bean;

import com.heytap.health.health_archives.R$string;
import com.heytap.health.health_archives.activity.HealthArchivesDetailsActivity;
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/health_archives/bean/HealthArchiveType;", "", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "Companion", "a", "MEDICAL_IMAGE", "TABLE_IMAGE", "DRUG_IMAGE", "HEALTH_CHECK", "PACS_IMAGE", "MEDICAL_INVOICE", "HOSPITAL_IMAGE", "OTHER", "health_archives_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHealthArchiveType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthArchiveType.kt\ncom/heytap/health/health_archives/bean/HealthArchiveType\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,46:1\n8541#2,2:47\n8801#2,4:49\n*S KotlinDebug\n*F\n+ 1 HealthArchiveType.kt\ncom/heytap/health/health_archives/bean/HealthArchiveType\n*L\n32#1:47,2\n32#1:49,4\n*E\n"})
public enum HealthArchiveType {
    MEDICAL_IMAGE("medical_image", R$string.health_archives_type_medical_image),
    TABLE_IMAGE(HealthArchivesDetailsActivity.PAGE_DATA_TYPE_TABLE, R$string.health_archives_type_table_image),
    DRUG_IMAGE("drug_image", R$string.health_archives_type_drug_image),
    HEALTH_CHECK("health_check", R$string.health_archives_type_health_check),
    PACS_IMAGE("pacs_image", R$string.health_archives_type_pacs_image),
    MEDICAL_INVOICE("medical_invoice", R$string.health_archives_type_medical_invoice),
    HOSPITAL_IMAGE("hospital_image", R$string.health_archives_type_hospital_image),
    OTHER("other", R$string.health_archives_other_category);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<String, HealthArchiveType> codeToEnumMap;

    @NotNull
    private final String code;
    private final int value;

    /* JADX INFO: renamed from: com.heytap.health.health_archives.bean.HealthArchiveType$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/heytap/health/health_archives/bean/HealthArchiveType$a;", "", "", "code", "b", "value", "a", "", "Lcom/heytap/health/health_archives/bean/HealthArchiveType;", "codeToEnumMap", "Ljava/util/Map;", "<init>", "()V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHealthArchiveType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthArchiveType.kt\ncom/heytap/health/health_archives/bean/HealthArchiveType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
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
            for (HealthArchiveType healthArchiveType : HealthArchiveType.values()) {
                if (Intrinsics.areEqual(qtf.l(healthArchiveType.getValue()), value)) {
                    if (healthArchiveType != null) {
                        return healthArchiveType.getCode();
                    }
                    return null;
                }
            }
            healthArchiveType = null;
            if (healthArchiveType != null) {
                return healthArchiveType.getCode();
            }
            return null;
        }

        @Nullable
        public final String b(@NotNull String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            HealthArchiveType healthArchiveType = (HealthArchiveType) HealthArchiveType.codeToEnumMap.get(code);
            if (healthArchiveType != null) {
                return qtf.l(healthArchiveType.getValue());
            }
            return null;
        }
    }

    static {
        HealthArchiveType[] healthArchiveTypeArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(healthArchiveTypeArrValues.length), 16));
        for (HealthArchiveType healthArchiveType : healthArchiveTypeArrValues) {
            linkedHashMap.put(healthArchiveType.code, healthArchiveType);
        }
        codeToEnumMap = linkedHashMap;
    }

    HealthArchiveType(String str, int i) {
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
