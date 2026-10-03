package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.bloodpressure.R$id;
import com.heytap.health.bloodpressure.R$layout;
import com.heytap.health.bloodpressure.R$plurals;
import com.heytap.health.bloodpressure.R$string;
import com.heytap.health.bloodpressure.util.ResearchAppHelper;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/yq1;", "Lcom/oplus/aiunit/vision/o51;", "", b2n.f, MapSchema.FIELD_NAME_ENTRY, "", "a", "", "j", LogFieldKey.MESSAGE_KEY, LogFieldKey.LEVEL_KEY, "I", "getDay", "()I", "day", "", "J", "getTime", "()J", ClickApiEntity.TIME, "<init>", "(IJ)V", "blood_pressure_release"}, k = 1, mv = {1, 8, 0})
public final class yq1 extends o51 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final int day;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final long time;

    public yq1(int i, long j2) {
        this.day = i;
        this.time = j2;
    }

    public static final void o(View this_apply, View view) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 8).c(vik.TAG_POSTION1, 1);
        ResearchAppHelper.Companion companion = ResearchAppHelper.INSTANCE;
        Context context = this_apply.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        companion.c(context, companion.h(), "normal");
    }

    @Override // com.oplus.aiunit.vision.e7c
    public int a() {
        return R$layout.health_blood_pressure_risk_card;
    }

    @Override // com.oplus.aiunit.vision.o51
    @NotNull
    public String e() {
        Resources resources = getMContext().getResources();
        int i = R$plurals.health_blood_pressure_joined_day;
        int i2 = this.day;
        String quantityString = resources.getQuantityString(i, i2, Integer.valueOf(i2));
        Intrinsics.checkNotNullExpressionValue(quantityString, "mContext.resources.getQu…ure_joined_day, day, day)");
        return quantityString;
    }

    @Override // com.oplus.aiunit.vision.o51
    @NotNull
    public String g() {
        String string = getMContext().getString(R$string.health_blood_pressure_evaluate);
        Intrinsics.checkNotNullExpressionValue(string, "mContext.getString(R.str…_blood_pressure_evaluate)");
        return string;
    }

    @Override // com.oplus.aiunit.vision.o51
    public void j() {
    }

    @Override // com.oplus.aiunit.vision.o51
    public void m() {
        final View mRootView = getMRootView();
        if (mRootView != null) {
            TextView textView = (TextView) mRootView.findViewById(R$id.risk_time);
            if (textView != null) {
                textView.setText(fn9.g(this.time, "yyyy.MM.dd"));
            }
            mRootView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.xq1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    yq1.o(mRootView, view);
                }
            });
        }
    }
}
