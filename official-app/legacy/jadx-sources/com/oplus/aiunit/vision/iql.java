package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.heytap.health.operation.R$id;
import com.heytap.health.operation.R$layout;

/* JADX INFO: loaded from: classes17.dex */
public class iql implements uzg {
    public View a;
    public ImageView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f12622c;

    public class a implements k1h.b {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.k1h.b
        public Bitmap a(Bitmap bitmap) {
            return ejg.d(iql.this.f12622c, 0);
        }
    }

    public class b extends n3g<Object> {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.n3g
        public void h(Object obj) {
            if (obj != null) {
                iql.this.f12622c = (Bitmap) obj;
                iql.this.b.setImageBitmap(iql.this.f12622c);
            }
            j("VIEW_SHOT_MSG");
            dispose();
        }
    }

    @Override // com.oplus.aiunit.vision.uzg
    public void a(Intent intent) {
    }

    @Override // com.oplus.aiunit.vision.uzg
    public View c(Activity activity) {
        i(activity);
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.uzg
    public void d() {
    }

    @Override // com.oplus.aiunit.vision.uzg
    public k1h.a e(k1h.a aVar) {
        aVar.b(new a());
        return aVar;
    }

    public final void i(Activity activity) {
        this.a = LayoutInflater.from(activity).inflate(R$layout.operation_activity_weekly_share, (ViewGroup) null, false);
        x0.d().f(this);
        ImageView imageView = (ImageView) this.a.findViewById(R$id.share_bm);
        this.b = imageView;
        imageView.bringToFront();
        if (i3g.b().c("VIEW_SHOT_MSG")) {
            i3g.b().d("VIEW_SHOT_MSG", new b());
        } else {
            activity.finish();
        }
    }
}
