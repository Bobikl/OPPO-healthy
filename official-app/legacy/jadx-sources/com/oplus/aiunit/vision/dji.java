package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.device_settings.impl.R$string;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\r\u001a\u0004\b\n\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/dji;", "", "", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "a", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "d", "()Lcom/heytap/health/device_settings/health/SportHealthSetting;", "type", "b", "c", "recordTypeKey", "I", "()I", "f", "(I)V", "recordType", "Lcom/oplus/aiunit/vision/spe;", "Lcom/oplus/aiunit/vision/spe;", "()Lcom/oplus/aiunit/vision/spe;", "detail", "DIALOG_CHECK_TYPE", "<init>", "(Lcom/heytap/health/device_settings/health/SportHealthSetting;Lcom/heytap/health/device_settings/health/SportHealthSetting;ILcom/oplus/aiunit/vision/spe;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class dji {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SportHealthSetting type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final SportHealthSetting recordTypeKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int recordType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final PrefStruct detail;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int DIALOG_CHECK_TYPE;

    public dji(@NotNull SportHealthSetting type, @NotNull SportHealthSetting recordTypeKey, int i, @NotNull PrefStruct detail) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(recordTypeKey, "recordTypeKey");
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.type = type;
        this.recordTypeKey = recordTypeKey;
        this.recordType = i;
        this.detail = detail;
        this.DIALOG_CHECK_TYPE = 1;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final PrefStruct getDetail() {
        return this.detail;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getRecordType() {
        return this.recordType;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final SportHealthSetting getRecordTypeKey() {
        return this.recordTypeKey;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final SportHealthSetting getType() {
        return this.type;
    }

    public final int e() {
        return this.recordType == this.DIALOG_CHECK_TYPE ? R$string.settings_health_auto_recognize_sport_record_type_one : R$string.settings_health_auto_recognize_sport_record_type_two;
    }

    public final void f(int i) {
        this.recordType = i;
    }
}
