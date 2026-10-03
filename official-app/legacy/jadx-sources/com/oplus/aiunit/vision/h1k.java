package com.oplus.aiunit.vision;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.base.R$string;
import com.heytap.health.home.impl.R$id;
import com.heytap.health.home.impl.R$layout;
import com.heytap.health.home.todocard.TodoAdapter;
import com.heytap.health.home.todocard.bean.TodoData;
import com.heytap.health.home.todocard.viewmodel.TodoViewModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class h1k extends pa9 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Fragment f11967c;
    public TodoViewModel d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TodoAdapter f11968e;
    public FrameLayout f;
    public List<TodoData> g;
    public wm2 h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f11969j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f11970l;

    public h1k(Context context, int i, String str, String str2) {
        super(context);
        this.g = new ArrayList();
        this.i = false;
        this.f11969j = new Handler();
        if (i != -1) {
            try {
                this.f11967c = op.n().s().getFragmentManager().getFragments().get(i);
            } catch (Exception e2) {
                a7b.b("TodoCard", "Error is " + e2.getMessage());
            }
        }
        this.d = (TodoViewModel) new ViewModelProvider((FragmentActivity) b()).get(TodoViewModel.class);
        this.k = str;
        this.f11970l = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        this.i = false;
        wm2 wm2Var = this.h;
        if (wm2Var != null) {
            wm2Var.dismiss();
        }
    }

    @Override // com.oplus.aiunit.vision.pa9
    public int a() {
        return R$layout.home_card_todo;
    }

    @Override // com.oplus.aiunit.vision.pa9
    public void c() {
        this.d.u().removeObservers((LifecycleOwner) b());
        this.d.u().observe((LifecycleOwner) b(), new Observer() { // from class: com.oplus.aiunit.vision.e1k
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.n((List) obj);
            }
        });
        q();
    }

    @Override // com.oplus.aiunit.vision.pa9
    public void e(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R$id.recycler_todo);
        this.f = (FrameLayout) view.findViewById(R$id.shadow);
        if (this.f11968e == null || recyclerView.getAdapter() != this.f11968e) {
            this.f11968e = new TodoAdapter(b());
            recyclerView.setLayoutManager(new LinearLayoutManager(b()));
            recyclerView.setAdapter(this.f11968e);
        }
        List<TodoData> value = this.d.u().getValue();
        if (value != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBindView() data = ");
            sb.append(value);
            n(value);
        }
    }

    @Override // com.oplus.aiunit.vision.pa9
    public void f() {
        super.f();
        this.f11969j.removeCallbacksAndMessages(null);
        if (b() instanceof LifecycleOwner) {
            this.d.u().removeObservers((LifecycleOwner) b());
        }
    }

    @Override // com.oplus.aiunit.vision.pa9
    public void g(boolean z) {
        wm2 wm2Var;
        FrameLayout frameLayout;
        super.g(z);
        if (z) {
            wm2 wm2Var2 = this.h;
            if (wm2Var2 != null) {
                wm2Var2.dismiss();
                return;
            }
            return;
        }
        if (v9g.w().r("SP_TODO_TIP", false) || (wm2Var = this.h) == null || (frameLayout = this.f) == null) {
            return;
        }
        wm2Var.X(frameLayout);
    }

    @Override // com.oplus.aiunit.vision.pa9
    public void h() {
        super.h();
        this.i = true;
        this.f11969j.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.g1k
            @Override // java.lang.Runnable
            public final void run() {
                this.i.p();
            }
        }, 1300L);
        q();
    }

    public final void n(List<TodoData> list) {
        List<TodoData> list2 = this.g;
        if (list2 != null) {
            list2.clear();
        }
        if (!lza.a(list)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getEventType().intValue() == 2 || list.get(i).getEventType().intValue() == 3) {
                    a7b.b("TodoCard", "sport class is offline,do not add it!");
                } else if (list.get(i).getEventType().intValue() != 6 && b().getString(R$string.lib_base_code_health).equals(this.k)) {
                    this.g.add(list.get(i));
                } else if (list.get(i).getPageCode() != null && list.get(i).getPageCode().equals(this.k) && list.get(i).getCardCode() != null && list.get(i).getCardCode().equals(this.f11970l)) {
                    this.g.add(list.get(i));
                }
            }
        }
        if (lza.a(this.g)) {
            a7b.f("TodoCard", "todo card has none data");
            this.f.setVisibility(8);
            return;
        }
        com.heytap.health.base.track.a.x().a(vik.TAG_MODULE_ID, 2).b();
        this.f.setVisibility(0);
        a7b.f("TodoCard", "todo list size is " + this.g.size());
        this.f11968e.setList(this.g);
        a7b.f("TodoCard", "[dealWithList] isHidden() is " + o());
        this.f.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.f1k
            @Override // java.lang.Runnable
            public final void run() {
                this.i.r();
            }
        }, 200L);
    }

    public boolean o() {
        Fragment fragment = this.f11967c;
        return fragment != null && fragment.isHidden();
    }

    public final void q() {
        if (b() != null) {
            this.d.v(b());
        } else {
            a7b.f("TodoCard", "context is null");
        }
    }

    public final void r() {
        a7b.f("TodoCard", "showTip()");
        Activity activityS = op.n().s();
        if (activityS == null || activityS.isDestroyed() || activityS.isFinishing()) {
            a7b.b("TodoCard", "HomeFragment not attached to an activity.");
            return;
        }
        if (v9g.w().r("SP_TODO_TIP", false) || o()) {
            a7b.f("TodoCard", "Tip has showed or fragment is hidden !");
            return;
        }
        if (this.i) {
            a7b.b("TodoCard", "首页在下拉刷新，不显示气泡！！");
            return;
        }
        if (lza.a(this.f11968e.getList())) {
            a7b.b("TodoCard", "显示列表没有数据，return！！");
            return;
        }
        FrameLayout frameLayout = this.f;
        if (frameLayout != null && frameLayout.getVisibility() == 8) {
            a7b.b("TodoCard", "shadowLayout wasn't show，return！！");
        }
        wm2 wm2Var = new wm2(activityS.getWindow());
        this.h = wm2Var;
        wm2Var.T(b().getResources().getString(com.heytap.health.home.impl.R$string.home_todo_tip_content));
        this.h.U(true);
        this.h.X(this.f);
        v9g.w().W("SP_TODO_TIP", true);
        com.heytap.health.base.track.a.x().a(vik.TAG_MODULE_ID, 2).a(vik.TAG_POSTION1, 3).b();
    }
}
