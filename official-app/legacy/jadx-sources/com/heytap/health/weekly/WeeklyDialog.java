package com.heytap.health.weekly;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.heytap.health.R;
import com.oplus.aiunit.vision.fn9;
import com.oplus.aiunit.vision.jql;
import java.util.Date;

/* JADX INFO: loaded from: classes19.dex */
public class WeeklyDialog extends Dialog {
    public TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f7211j;

    public WeeklyDialog(Context context, View view, int i) {
        super(context, i);
        setContentView(view);
        b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        dismiss();
    }

    public final void b(Context context) {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 17;
        window.setAttributes(attributes);
        d(context, new Date(System.currentTimeMillis() - 604800000));
        TextView textView = (TextView) findViewById(R.id.app_close);
        this.i = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.zpl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.c(view);
            }
        });
    }

    public final void d(Context context, Date date) {
        if (context != null) {
            this.f7211j = (TextView) findViewById(R.id.app_date);
            Date dateA = jql.a(date);
            Date dateB = jql.b(date);
            fn9.b bVar = new fn9.b(dateA);
            fn9.b bVar2 = new fn9.b(dateB);
            String str = String.format(context.getString(R.string.app_weekly_dialog_time_to_time), fn9.a().h(bVar, context), fn9.a().h(bVar2, context));
            TextView textView = this.f7211j;
            if (textView != null) {
                textView.setText(str);
            }
        }
    }
}
