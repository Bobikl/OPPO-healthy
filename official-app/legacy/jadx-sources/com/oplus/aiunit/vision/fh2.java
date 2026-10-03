package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import androidx.annotation.NonNull;
import com.support.poplist.R$integer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class fh2 {
    public final com.coui.appcompat.poplist.b a;
    public uoe b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public uoe.c f11358c;
    public boolean d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InputMethodManager f11359e;

    public class a implements uoe.c {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(View view, int i, int i2) {
            fh2.this.j(view, i, i2);
        }

        @Override // com.oplus.aiunit.vision.uoe.c
        public void onClick(final View view, final int i, final int i2) {
            if (fh2.this.f11358c != null) {
                fh2.this.f11358c.onClick(view, i, i2);
            }
            if (fh2.this.f11359e == null || !fh2.this.f11359e.hideSoftInputFromWindow(view.getWindowToken(), 0)) {
                fh2.this.j(view, i, i2);
            } else {
                view.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.eh2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.b(view, i, i2);
                    }
                }, view.getContext().getResources().getInteger(R$integer.support_menu_click_select_time));
            }
        }
    }

    public fh2(Context context, View view) {
        com.coui.appcompat.poplist.b bVar = new com.coui.appcompat.poplist.b(context);
        this.a = bVar;
        if (view != null) {
            bVar.i0(view);
        }
        this.f11359e = (InputMethodManager) context.getSystemService("input_method");
    }

    public void c() {
        this.a.dismiss();
    }

    public com.coui.appcompat.poplist.b d() {
        return this.a;
    }

    public void e(@NonNull View view, ArrayList<qne> arrayList) {
        if (arrayList.size() <= 0) {
            return;
        }
        this.a.n0(arrayList);
        view.setClickable(true);
        view.setLongClickable(true);
        this.a.i0(view);
        uoe uoeVar = this.b;
        if (uoeVar == null || uoeVar.c() != view) {
            this.b = new uoe(view, new a());
        } else {
            Log.w("COUIClickSelectMenu", "ItemView is same, no need to create PreciseClickHelper");
        }
    }

    @Deprecated
    public void f(@NonNull View view, ArrayList<qne> arrayList, int i) {
        e(view, arrayList);
        this.a.r0(i);
    }

    @Deprecated
    public void g(boolean z) {
        com.coui.appcompat.poplist.b bVar;
        if (!this.d || (bVar = this.a) == null) {
            return;
        }
        bVar.k0(z);
    }

    public void h(boolean z) {
        uoe uoeVar = this.b;
        if (uoeVar != null) {
            this.d = z;
            if (z) {
                uoeVar.d();
            } else {
                uoeVar.e();
            }
        }
    }

    @Deprecated
    public void i(int i) {
        com.coui.appcompat.poplist.b bVar = this.a;
        if (bVar != null) {
            bVar.q0(i);
        }
    }

    public void j(View view, int i, int i2) {
        if (this.d) {
            this.a.v0(view, i, i2);
        }
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.a.setOnItemClickListener(onItemClickListener);
    }

    public void setOnPreciseClickListener(uoe.c cVar) {
        this.f11358c = cVar;
    }

    public void setSubMenuItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.a.setSubMenuClickListener(onItemClickListener);
    }
}
