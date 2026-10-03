package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import com.heytap.health.cervical_vertebra.R$id;
import com.heytap.health.cervical_vertebra.R$layout;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/sn2;", "Lcom/oplus/aiunit/vision/ap8;", "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.PROCESS_NAME_KEY, "", MapSchema.FIELD_NAME_ENTRY, "<init>", "()V", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0})
public final class sn2 extends ap8 {
    public static final void t(View view) {
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 8).a(vik.TAG_POSTION1, 1).b();
        x0.d().b("/cervicalVertebra/CervicalVertebraMobilityIntroActivity").navigation();
    }

    public static final void u(View view) {
        x0.d().b("/cervicalVertebra/CervicalVertebraMobilityHistoryActivity").navigation();
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.health_cs_layout_activity_card;
    }

    @Override // com.oplus.aiunit.vision.ap8
    public void p(@NotNull Context context, @NotNull View cardView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cardView, "cardView");
        cardView.findViewById(R$id.layout_card).setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.qn2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sn2.t(view);
            }
        });
        cardView.findViewById(R$id.view_to_history).setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.rn2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sn2.u(view);
            }
        });
    }
}
