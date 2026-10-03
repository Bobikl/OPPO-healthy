package com.oplus.aiunit.vision;

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
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/wp1;", "Lcom/oplus/aiunit/vision/o51;", "", "a", "", b2n.f, MapSchema.FIELD_NAME_ENTRY, "", MapSchema.FIELD_NAME_KEY, "", "j", LogFieldKey.MESSAGE_KEY, LogFieldKey.LEVEL_KEY, "I", "getDay", "()I", "day", "<init>", "(I)V", "blood_pressure_release"}, k = 1, mv = {1, 8, 0})
public final class wp1 extends o51 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final int day;

    public wp1(int i) {
        this.day = i;
    }

    public static final void o(wp1 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 10).c(vik.TAG_POSTION1, 1);
        ResearchAppHelper.Companion companion = ResearchAppHelper.INSTANCE;
        companion.c(this$0.getMContext(), companion.f(), "normal");
    }

    @Override // com.oplus.aiunit.vision.e7c
    public int a() {
        return R$layout.health_blood_pressure_text_card;
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
        String string = getMContext().getString(R$string.health_blood_pressure_manager_title);
        Intrinsics.checkNotNullExpressionValue(string, "mContext.getString(R.str…d_pressure_manager_title)");
        return string;
    }

    @Override // com.oplus.aiunit.vision.o51
    public void j() {
        View mRootView = getMRootView();
        if (mRootView != null) {
            mRootView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.vp1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wp1.o(this.i, view);
                }
            });
            TextView textView = (TextView) mRootView.findViewById(R$id.guide_text);
            textView.setText(getMContext().getString(R$string.health_blood_pressure_risk_content));
            textView.setVisibility(0);
        }
    }

    @Override // com.oplus.aiunit.vision.o51
    public boolean k() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.o51
    public void m() {
    }
}
