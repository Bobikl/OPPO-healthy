package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.health.esim.R$string;
import com.heytap.health.esim.nsc.utils.NSCHelper;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import io.protostuff.MapSchema;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.oqc, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0004\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\n\u001a\u00020\u0002H\u0002R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/oqc;", "", "", "d", "toString", "", "hashCode", "other", "", "equals", "c", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "id", "b", "getDesc", DBHealthReviewPlan.DESC, "name", "getPrice", SensorsBean.PRICE, MapSchema.FIELD_NAME_ENTRY, "I", "getComboSize", "()I", "comboSize", "", "f", "J", "getExpireTime", "()J", "expireTime", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class NextCombo {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("comboThirdId")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("comboDesc")
    @NotNull
    private final String desc;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("comboName")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("comboPrice")
    @NotNull
    private final String price;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("comboSize")
    private final int comboSize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("disPlayExpireTime")
    private final long expireTime;

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final String c() {
        return NSCHelper.INSTANCE.c(Integer.valueOf(RangesKt___RangesKt.coerceAtLeast(this.comboSize, 0)));
    }

    @NotNull
    public final String d() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(qtf.l(R$string.esim_redtea_user_combo_manager_next_desc), Arrays.copyOf(new Object[]{c(), this.price}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NextCombo)) {
            return false;
        }
        NextCombo nextCombo = (NextCombo) other;
        return Intrinsics.areEqual(this.id, nextCombo.id) && Intrinsics.areEqual(this.desc, nextCombo.desc) && Intrinsics.areEqual(this.name, nextCombo.name) && Intrinsics.areEqual(this.price, nextCombo.price) && this.comboSize == nextCombo.comboSize && this.expireTime == nextCombo.expireTime;
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.desc.hashCode()) * 31) + this.name.hashCode()) * 31) + this.price.hashCode()) * 31) + Integer.hashCode(this.comboSize)) * 31) + Long.hashCode(this.expireTime);
    }

    @NotNull
    public String toString() {
        return "NextCombo(id=" + this.id + ", desc=" + this.desc + ", name=" + this.name + ", price=" + this.price + ", comboSize=" + this.comboSize + ", expireTime=" + this.expireTime + ")";
    }
}
