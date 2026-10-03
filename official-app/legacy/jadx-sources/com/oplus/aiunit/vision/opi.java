package com.oplus.aiunit.vision;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import com.heytap.health.step.R$id;
import com.heytap.health.step.R$layout;

/* JADX INFO: loaded from: classes18.dex */
public class opi {

    public class a implements View.OnClickListener {
        public final /* synthetic */ Dialog i;

        public a(Dialog dialog) {
            this.i = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.i.cancel();
        }
    }

    public static void a(Context context, String str, int i) {
        Dialog dialog = new Dialog(context);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.setContentView(R$layout.step_card_dialog_encourage);
        if (str == null || str.equals("")) {
            return;
        }
        r4a.e(context, str, (ImageView) dialog.findViewById(R$id.encourage_img));
        ImageView imageView = (ImageView) dialog.findViewById(R$id.quit_dialog);
        imageView.setImageResource(i);
        dialog.setCancelable(true);
        imageView.setOnClickListener(new a(dialog));
        dialog.show();
    }
}
