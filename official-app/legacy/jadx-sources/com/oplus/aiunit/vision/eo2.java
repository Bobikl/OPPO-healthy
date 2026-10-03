package com.oplus.aiunit.vision;

import android.content.Context;
import com.github.mikephil.charting.data.Entry;
import com.heytap.health.cervical_vertebra.R$string;
import com.heytap.health.cervical_vertebra.bean.CSData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/eo2;", "Lcom/oplus/aiunit/vision/zfb;", "Lcom/github/mikephil/charting/data/Entry;", "entry", "", "b", "a", "datePattern", "", "d", "Lcom/heytap/health/cervical_vertebra/bean/CSData;", "c", "Landroid/content/Context;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Ljava/lang/String;", "hourUnit", "minuteUnit", "<init>", "(Landroid/content/Context;)V", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0})
public final class eo2 extends zfb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public String hourUnit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String minuteUnit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public String datePattern;

    public eo2(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.datePattern = "yyyMMMd";
        this.hourUnit = context.getString(R$string.health_cs_unit_hour);
        this.minuteUnit = context.getString(R$string.health_cs_unit_minute);
    }

    @Override // com.oplus.aiunit.vision.zfb
    @Nullable
    public String a(@NotNull Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        CSData cSDataC = c(entry);
        String str = "";
        if (cSDataC == null) {
            return "";
        }
        int goodSeconds = ((cSDataC.getGoodSeconds() + cSDataC.getMildSeconds()) + cSDataC.getHeavySeconds()) / 60;
        int i = goodSeconds / 60;
        int i2 = goodSeconds % 60;
        if (i <= 0) {
            if (i2 <= 0) {
                return "--" + this.minuteUnit;
            }
            return i2 + this.minuteUnit;
        }
        String str2 = this.hourUnit;
        if (i2 > 0) {
            str = i2 + this.minuteUnit;
        }
        return i + str2 + str;
    }

    @Override // com.oplus.aiunit.vision.zfb
    @Nullable
    public String b(@NotNull Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        CSData cSDataC = c(entry);
        return cSDataC == null ? "" : mq8.INSTANCE.y(cSDataC.getDate(), this.datePattern);
    }

    public final CSData c(Entry entry) {
        Object data = entry.getData();
        if (data instanceof CSData) {
            return (CSData) data;
        }
        return null;
    }

    public final void d(@NotNull String datePattern) {
        Intrinsics.checkNotNullParameter(datePattern, "datePattern");
        this.datePattern = datePattern;
    }
}
