package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.coui.appcompat.couiswitch.COUISwitch;
import com.heytap.health.family.family.R$id;
import com.heytap.health.family.family.R$layout;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fR\u0017\u0010\u0016\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0016\u0010 \u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/oplus/aiunit/vision/d9e;", "Lcom/heytap/health/base/view/recyclercard/a;", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.LEVEL_KEY, "view", b2n.f, "", "isChecked", "q", "Lcom/oplus/aiunit/vision/d9e$a;", "listener", "r", "o", "Z", "getC", "()Z", "c", "", LogFieldKey.PROCESS_NAME_KEY, "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "title", "Lcom/coui/appcompat/couiswitch/COUISwitch;", "Lcom/coui/appcompat/couiswitch/COUISwitch;", "COUISwitch", "checked", "s", "Lcom/oplus/aiunit/vision/d9e$a;", "<init>", "(ZLjava/lang/String;)V", "a", "family_release"}, k = 1, mv = {1, 8, 0})
public final class d9e extends com.heytap.health.base.view.recyclercard.a {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final boolean c;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final String title;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public COUISwitch COUISwitch;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean checked;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public a listener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/d9e$a;", "", "", "isChecked", "", "a", "family_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(boolean isChecked);
    }

    public d9e(boolean z, @NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.c = z;
        this.title = title;
        this.checked = z;
    }

    public static final void p(d9e this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r(view);
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.health_family_card_partly_share;
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    /* JADX INFO: renamed from: g */
    public void r(@Nullable View view) {
        super.r(view);
        if (Intrinsics.areEqual(view, this.COUISwitch)) {
            boolean z = !this.checked;
            this.checked = z;
            a aVar = this.listener;
            if (aVar != null) {
                aVar.a(z);
            }
        }
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public void l(@Nullable Context context, @Nullable View cardView) {
        super.l(context, cardView);
        COUISwitch cOUISwitch = cardView != null ? (COUISwitch) cardView.findViewById(R$id.switch_btn) : null;
        this.COUISwitch = cOUISwitch;
        if (cOUISwitch != null) {
            cOUISwitch.setChecked(this.checked);
        }
        COUISwitch cOUISwitch2 = this.COUISwitch;
        if (cOUISwitch2 != null) {
            cOUISwitch2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.c9e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d9e.p(this.i, view);
                }
            });
        }
        TextView textView = cardView != null ? (TextView) cardView.findViewById(R$id.tv_title) : null;
        if (textView == null) {
            return;
        }
        textView.setText(this.title);
    }

    public final void q(boolean isChecked) {
        this.checked = isChecked;
    }

    public final void r(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }
}
