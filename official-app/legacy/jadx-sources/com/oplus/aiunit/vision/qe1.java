package com.oplus.aiunit.vision;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.bloodpressure.R$color;
import com.heytap.health.bloodpressure.R$layout;
import com.heytap.health.bloodpressure.R$string;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\tH\u0016R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/qe1;", "Lcom/oplus/aiunit/vision/o51;", "", b2n.f, "", "j", "", MapSchema.FIELD_NAME_KEY, MapSchema.FIELD_NAME_ENTRY, "", "f", LogFieldKey.MESSAGE_KEY, "a", LogFieldKey.LEVEL_KEY, "Ljava/lang/String;", "BLOOD_PRESSURE_DEVICE_LIST", "<init>", "()V", "blood_pressure_release"}, k = 1, mv = {1, 8, 0})
public final class qe1 extends o51 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String BLOOD_PRESSURE_DEVICE_LIST = "health-guide/index.html?page=devices&steerCode=bloodpressure";

    public static final void o(qe1 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a7b.f("BindingOmronCard", " setOnClickListener ");
        x0.d().b("/operation/report/OperationWebViewActivity").withString("jumpUrl", this$0.BLOOD_PRESSURE_DEVICE_LIST).navigation();
    }

    @Override // com.oplus.aiunit.vision.e7c
    public int a() {
        return R$layout.health_blood_pressure_binding_omron_card;
    }

    @Override // com.oplus.aiunit.vision.o51
    @NotNull
    public String e() {
        String string = getMContext().getString(R$string.health_blood_pressure_binding_bp_device_card_content_desc);
        Intrinsics.checkNotNullExpressionValue(string, "mContext.getString(R.str…device_card_content_desc)");
        return string;
    }

    @Override // com.oplus.aiunit.vision.o51
    public int f() {
        return getMContext().getColor(R$color.health_blood_pressure_black_85alpha);
    }

    @Override // com.oplus.aiunit.vision.o51
    @NotNull
    public String g() {
        String string = getMContext().getString(R$string.health_blood_pressure_binding_bp_device_card_content_title);
        Intrinsics.checkNotNullExpressionValue(string, "mContext.getString(R.str…evice_card_content_title)");
        return string;
    }

    @Override // com.oplus.aiunit.vision.o51
    public void j() {
    }

    @Override // com.oplus.aiunit.vision.o51
    public boolean k() {
        return false;
    }

    @Override // com.oplus.aiunit.vision.o51
    public void m() {
        View mRootView = getMRootView();
        if (mRootView != null) {
            mRootView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.pe1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qe1.o(this.i, view);
                }
            });
        }
    }
}
