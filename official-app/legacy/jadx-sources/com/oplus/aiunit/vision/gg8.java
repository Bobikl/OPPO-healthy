package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import com.coui.appcompat.panel.COUIBottomSheetDialog;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.heytap.health.watchface.R$string;
import com.heytap.health.watchface.business.creation.category.paint.widget.HandPaintColorPickView;
import com.support.panel.R$style;

/* JADX INFO: loaded from: classes19.dex */
public class gg8 {
    public static final gg8 b = new gg8();
    public COUIBottomSheetDialog a = null;

    public static gg8 d() {
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        this.a.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(HandPaintColorPickView.a aVar, HandPaintColorPickView handPaintColorPickView, View view) {
        aVar.a(handPaintColorPickView.getColor());
        this.a.dismiss();
    }

    public void c() {
        COUIBottomSheetDialog cOUIBottomSheetDialog = this.a;
        if (cOUIBottomSheetDialog != null) {
            cOUIBottomSheetDialog.dismiss();
            this.a = null;
        }
    }

    public void g(Context context, int i, final HandPaintColorPickView.a aVar) {
        View viewInflate = View.inflate(context, R$layout.watch_face_hand_paint_color_pick_container, null);
        final HandPaintColorPickView handPaintColorPickView = (HandPaintColorPickView) viewInflate.findViewById(R$id.color_pick);
        COUIToolbar cOUIToolbar = (COUIToolbar) viewInflate.findViewById(com.heytap.health.base.R$id.lib_base_toolbar);
        cOUIToolbar.setTitle(context.getString(R$string.watch_face_paint_choose_color));
        cOUIToolbar.setTitleTextColor(-1);
        cOUIToolbar.setIsTitleCenterStyle(true);
        handPaintColorPickView.setColor(i);
        COUIBottomSheetDialog cOUIBottomSheetDialog = new COUIBottomSheetDialog(context, R$style.DefaultBottomSheetDialog);
        this.a = cOUIBottomSheetDialog;
        cOUIBottomSheetDialog.setContentView(viewInflate);
        this.a.getBehavior().setDraggable(false);
        this.a.setBottomButtonBar(false, context.getString(R$string.watch_face_cancel), new View.OnClickListener() { // from class: com.oplus.aiunit.vision.eg8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.e(view);
            }
        }, context.getString(R$string.watch_face_paint_save), new View.OnClickListener() { // from class: com.oplus.aiunit.vision.fg8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.f(aVar, handPaintColorPickView, view);
            }
        }, null, null);
        this.a.show();
    }
}
