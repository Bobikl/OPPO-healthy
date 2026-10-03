package com.heytap.health.health.insight;

import com.heytap.health.insight.device.SingleDimenNotifyId;
import com.oplus.aiunit.vision.f8b;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'HRV_WEEK' uses external variables
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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B)\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/health/insight/HRV;", "", "Lcom/oplus/aiunit/vision/f8b;", "Lcom/heytap/health/health/insight/ModuleType;", "moduleType", "Lcom/heytap/health/health/insight/ModuleType;", "getModuleType", "()Lcom/heytap/health/health/insight/ModuleType;", "", "priority", "I", "getPriority", "()I", "id", "getId", "", "notifyId", "Ljava/lang/String;", "getNotifyId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILcom/heytap/health/health/insight/ModuleType;IILjava/lang/String;)V", "HRV_WEEK", "HRV_MONTH", "health_release"}, k = 1, mv = {1, 8, 0})
public final class HRV implements f8b {
    private static final /* synthetic */ HRV[] $VALUES;
    public static final HRV HRV_MONTH;
    public static final HRV HRV_WEEK;
    private final int id;

    @NotNull
    private final ModuleType moduleType;

    @NotNull
    private final String notifyId;
    private final int priority;

    private static final /* synthetic */ HRV[] $values() {
        return new HRV[]{HRV_WEEK, HRV_MONTH};
    }

    static {
        ModuleType moduleType = ModuleType.HRV;
        HRV_WEEK = new HRV("HRV_WEEK", 0, moduleType, 2, 25, SingleDimenNotifyId.HRV_WEEK.getId());
        HRV_MONTH = new HRV("HRV_MONTH", 1, moduleType, 1, 26, SingleDimenNotifyId.HRV_MONTH.getId());
        $VALUES = $values();
    }

    private HRV(String str, int i, ModuleType moduleType, int i2, int i3, String str2) {
        super(str, i);
        this.moduleType = moduleType;
        this.priority = i2;
        this.id = i3;
        this.notifyId = str2;
    }

    public static HRV valueOf(String str) {
        return (HRV) Enum.valueOf(HRV.class, str);
    }

    public static HRV[] values() {
        return (HRV[]) $VALUES.clone();
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
