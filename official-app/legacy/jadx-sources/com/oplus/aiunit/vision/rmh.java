package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.sleep.R$string;
import com.heytap.health.sleep.bean.SleepDayBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/rmh;", "Lcom/oplus/aiunit/vision/u8h;", "", "d", "", "b", "", "c", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "Lcom/heytap/health/sleep/bean/SleepDayBean;", "Lcom/heytap/health/sleep/bean/SleepDayBean;", "sleepDayBean", "Lcom/oplus/aiunit/vision/jkh;", "Lcom/oplus/aiunit/vision/jkh;", "getMainSleep", "()Lcom/oplus/aiunit/vision/jkh;", "setMainSleep", "(Lcom/oplus/aiunit/vision/jkh;)V", "mainSleep", "<init>", "(Landroid/content/Context;Lcom/heytap/health/sleep/bean/SleepDayBean;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class rmh extends u8h {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final SleepDayBean sleepDayBean;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public SleepMainBean mainSleep;

    public rmh(@NotNull Context context, @NotNull SleepDayBean sleepDayBean) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sleepDayBean, "sleepDayBean");
        this.context = context;
        this.sleepDayBean = sleepDayBean;
    }

    @Override // com.oplus.aiunit.vision.u8h
    @NotNull
    public String b() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = this.context.getString(R$string.health_sleep_rem_scale_less_desc_v1);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…p_rem_scale_less_desc_v1)");
        Object[] objArr = new Object[1];
        SleepMainBean sleepMainBean = this.mainSleep;
        objArr[0] = String.valueOf(sleepMainBean != null ? Integer.valueOf(sleepMainBean.getRemSleepScale()) : null);
        String str = String.format(string, Arrays.copyOf(objArr, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Override // com.oplus.aiunit.vision.u8h
    @NotNull
    public List<String> c() {
        ArrayList arrayList = new ArrayList();
        String string = this.context.getString(R$string.health_sleep_rem_scale_less_desc_1);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ep_rem_scale_less_desc_1)");
        arrayList.add(string);
        String string2 = this.context.getString(R$string.health_sleep_rem_scale_less_desc_2);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…ep_rem_scale_less_desc_2)");
        arrayList.add(string2);
        String string3 = this.context.getString(R$string.health_sleep_rem_scale_less_desc_5);
        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…ep_rem_scale_less_desc_5)");
        arrayList.add(string3);
        return arrayList;
    }

    @Override // com.oplus.aiunit.vision.u8h
    public boolean d() {
        SleepMainBean mainSleep = this.sleepDayBean.getMainSleep();
        this.mainSleep = mainSleep;
        if (mainSleep == null) {
            return false;
        }
        Intrinsics.checkNotNull(mainSleep);
        if (mainSleep.getTotalSleepTime() <= 0) {
            return false;
        }
        SleepMainBean sleepMainBean = this.mainSleep;
        Intrinsics.checkNotNull(sleepMainBean);
        if (sleepMainBean.getTotalREMSleepTime() <= 0) {
            return false;
        }
        SleepMainBean sleepMainBean2 = this.mainSleep;
        Intrinsics.checkNotNull(sleepMainBean2);
        return sleepMainBean2.getRemSleepScale() < 10;
    }
}
