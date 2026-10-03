package com.heytap.health.health.insight;

import com.heytap.health.insight.device.SingleDimenNotifyId;
import com.oplus.aiunit.vision.f8b;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'CALORIE_TRENT_WEEK' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B)\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/health/insight/Consumption;", "", "Lcom/oplus/aiunit/vision/f8b;", "Lcom/heytap/health/health/insight/ModuleType;", "moduleType", "Lcom/heytap/health/health/insight/ModuleType;", "getModuleType", "()Lcom/heytap/health/health/insight/ModuleType;", "", "priority", "I", "getPriority", "()I", "id", "getId", "", "notifyId", "Ljava/lang/String;", "getNotifyId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILcom/heytap/health/health/insight/ModuleType;IILjava/lang/String;)V", "CALORIE_TRENT_WEEK", "CALORIE_REACH_GOAL_WEEK", "CALORIE_TRENT_MONTH", "CALORIE_REACH_GOAL_MONTH", "health_release"}, k = 1, mv = {1, 8, 0})
public final class Consumption implements f8b {
    private static final /* synthetic */ Consumption[] $VALUES;
    public static final Consumption CALORIE_REACH_GOAL_MONTH;
    public static final Consumption CALORIE_REACH_GOAL_WEEK;
    public static final Consumption CALORIE_TRENT_MONTH;
    public static final Consumption CALORIE_TRENT_WEEK;
    private final int id;

    @NotNull
    private final ModuleType moduleType;

    @NotNull
    private final String notifyId;
    private final int priority;

    private static final /* synthetic */ Consumption[] $values() {
        return new Consumption[]{CALORIE_TRENT_WEEK, CALORIE_REACH_GOAL_WEEK, CALORIE_TRENT_MONTH, CALORIE_REACH_GOAL_MONTH};
    }

    static {
        ModuleType moduleType = ModuleType.CONSUMPTION;
        CALORIE_TRENT_WEEK = new Consumption("CALORIE_TRENT_WEEK", 0, moduleType, 3, 11, SingleDimenNotifyId.CALORIE_TRENT_WEEK.getId());
        CALORIE_REACH_GOAL_WEEK = new Consumption("CALORIE_REACH_GOAL_WEEK", 1, moduleType, 4, 12, SingleDimenNotifyId.CALORIE_REACH_GOAL_WEEK.getId());
        CALORIE_TRENT_MONTH = new Consumption("CALORIE_TRENT_MONTH", 2, moduleType, 1, 13, SingleDimenNotifyId.CALORIE_TRENT_MONTH.getId());
        CALORIE_REACH_GOAL_MONTH = new Consumption("CALORIE_REACH_GOAL_MONTH", 3, moduleType, 2, 14, SingleDimenNotifyId.CALORIE_REACH_GOAL_MONTH.getId());
        $VALUES = $values();
    }

    private Consumption(String str, int i, ModuleType moduleType, int i2, int i3, String str2) {
        super(str, i);
        this.moduleType = moduleType;
        this.priority = i2;
        this.id = i3;
        this.notifyId = str2;
    }

    public static Consumption valueOf(String str) {
        return (Consumption) Enum.valueOf(Consumption.class, str);
    }

    public static Consumption[] values() {
        return (Consumption[]) $VALUES.clone();
    }

    @Override // com.oplus.aiunit.vision.f8b
    public int getId() {
        return this.id;
    }

    @Override // com.oplus.aiunit.vision.f8b
    @NotNull
    public ModuleType getModuleType() {
        return this.moduleType;
    }

    @Override // com.oplus.aiunit.vision.f8b
    @NotNull
    public String getNotifyId() {
        return this.notifyId;
    }

    @Override // com.oplus.aiunit.vision.f8b
    public int getPriority() {
        return this.priority;
    }
}
