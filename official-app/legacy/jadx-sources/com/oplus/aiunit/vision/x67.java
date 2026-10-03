package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.base.R$layout;
import com.heytap.health.base.view.recyclercard.RecyclerCardLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class x67 {
    public final WeakReference<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f18511c;
    public final String a = "FamilyShareSettingRecycler";
    public List<com.heytap.health.base.view.recyclercard.a> d = new ArrayList();

    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            for (com.heytap.health.base.view.recyclercard.a aVar : x67.this.d) {
                if (aVar.d()) {
                    aVar.i();
                }
                aVar.h();
            }
        }
    }

    public final class b extends RecyclerView.Adapter<c> {
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull c cVar, int i) {
            s47.a("FamilyShareSettingRecycler", "onBindViewHolder: " + cVar);
            final com.heytap.health.base.view.recyclercard.a aVar = (com.heytap.health.base.view.recyclercard.a) x67.this.d.get(i);
            cVar.a(aVar);
            cVar.setVisibility(aVar.c());
            View viewInflate = View.inflate((Context) x67.this.b.get(), aVar.e(), null);
            aVar.l((Context) x67.this.b.get(), viewInflate);
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.y67
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    aVar.r(view);
                }
            });
            ((ViewGroup) cVar.itemView).addView(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            c cVar = new c(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.lib_base_recycler_card_layout, viewGroup, false));
            s47.a("FamilyShareSettingRecycler", "onCreateViewHolder: " + cVar);
            return cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onViewAttachedToWindow(@NonNull c cVar) {
            super.onViewAttachedToWindow(cVar);
            s47.a("FamilyShareSettingRecycler", "onViewAttachedToWindow: " + cVar);
            cVar.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onViewDetachedFromWindow(@NonNull c cVar) {
            super.onViewDetachedFromWindow(cVar);
            s47.a("FamilyShareSettingRecycler", "onViewDetachedFromWindow: " + cVar);
            cVar.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return x67.this.d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(@NonNull c cVar) {
            super.onViewRecycled(cVar);
            s47.a("FamilyShareSettingRecycler", "onViewRecycled: " + cVar);
            ((ViewGroup) cVar.itemView).removeAllViews();
        }

        public b() {
        }
    }

    public static final class c extends RecyclerView.ViewHolder {
        public com.heytap.health.base.view.recyclercard.a i;

        public c(@NonNull View view) {
            super(view);
        }

        public void a(com.heytap.health.base.view.recyclercard.a aVar) {
            this.i = aVar;
        }

        public void b() {
            com.heytap.health.base.view.recyclercard.a aVar = this.i;
            if (aVar != null) {
                aVar.j();
            }
        }

        public void c() {
            com.heytap.health.base.view.recyclercard.a aVar = this.i;
            if (aVar != null) {
                aVar.i();
            }
        }

        public void setVisibility(boolean z) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.itemView.getLayoutParams();
            if (z) {
                ((ViewGroup.MarginLayoutParams) layoutParams).width = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
                this.itemView.setVisibility(0);
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
                this.itemView.setVisibility(8);
            }
            this.itemView.setLayoutParams(layoutParams);
        }
    }

    public x67(Context context, RecyclerCardLayout recyclerCardLayout) {
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.b = weakReference;
        b bVar = new b();
        this.f18511c = bVar;
        recyclerCardLayout.setLayoutManager(new LinearLayoutManager(weakReference.get()));
        recyclerCardLayout.setAdapter(bVar);
        recyclerCardLayout.addOnAttachStateChangeListener(new a());
    }

    public void c(List<com.heytap.health.base.view.recyclercard.a> list) {
        this.d.addAll(list);
        this.f18511c.notifyDataSetChanged();
    }

    public void d(List<com.heytap.health.base.view.recyclercard.a> list) {
        this.d = list;
        this.f18511c.notifyDataSetChanged();
    }
}
