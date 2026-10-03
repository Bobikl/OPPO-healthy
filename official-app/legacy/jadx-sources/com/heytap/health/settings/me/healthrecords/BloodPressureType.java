package com.heytap.health.settings.me.healthrecords;

import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.health.settings.R$string;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.MapsKt__MapsJVMKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/settings/me/healthrecords/BloodPressureType;", "", "", "type", "I", "getType", "()I", DBHealthReviewPlan.DESC, "getDesc", "<init>", "(Ljava/lang/String;III)V", "Companion", "a", "EMPTY", LanConstants.OPERATOR_UNKNOWN, "NORMAL", "HIGH_NORMAL", "HIGH", "LOW", "settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBloodPressureType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodPressureType.kt\ncom/heytap/health/settings/me/healthrecords/BloodPressureType\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,18:1\n8541#2,2:19\n8801#2,4:21\n*S KotlinDebug\n*F\n+ 1 BloodPressureType.kt\ncom/heytap/health/settings/me/healthrecords/BloodPressureType\n*L\n14#1:19,2\n14#1:21,4\n*E\n"})
public enum BloodPressureType {
    EMPTY(0, R$string.settings_health_record_tofill),
    UNKNOWN(1, R$string.settings_blood_pressure_unknown),
    NORMAL(2, R$string.settings_blood_pressure_normal),
    HIGH_NORMAL(3, R$string.settings_blood_pressure_normal_high),
    HIGH(4, R$string.settings_blood_pressure_high),
    LOW(5, R$string.settings_blood_pressure_low);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<Integer, BloodPressureType> map;
    private final int desc;
    private final int type;

    /* JADX INFO: renamed from: com.heytap.health.settings.me.healthrecords.BloodPressureType$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/settings/me/healthrecords/BloodPressureType$a;", "", "", "type", "Lcom/heytap/health/settings/me/healthrecords/BloodPressureType;", "a", "", "map", "Ljava/util/Map;", "<init>", "()V", "settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final BloodPressureType a(int type) {
            return (BloodPressureType) BloodPressureType.map.get(Integer.valueOf(type));
        }
    }

    static {
        BloodPressureType[] bloodPressureTypeArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(bloodPressureTypeArrValues.length), 16));
        for (BloodPressureType bloodPressureType : bloodPressureTypeArrValues) {
            linkedHashMap.put(Integer.valueOf(bloodPressureType.type), bloodPressureType);
        }
        map = linkedHashMap;
    }

    BloodPressureType(int i, int i2) {
        this.type = i;
        this.desc = i2;
    }

    public final int getDesc() {
        return this.desc;
    }

    public final int getType() {
        return this.type;
    }
}
