package com.heytap.health.base.view.recyclercard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.base.R$layout;
import com.heytap.health.base.view.recyclercard.RecyclerCardController;
import com.oplus.aiunit.vision.vik;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class RecyclerCardController {
    public final WeakReference<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f3334c;
    public final RecyclerView f;
    public final String a = "RecyclerCardController";
    public final List<com.heytap.health.base.view.recyclercard.a> d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<com.heytap.health.base.view.recyclercard.a, View> f3335e = new HashMap();
    public final d g = new a();

    public static final class CardHolder extends RecyclerView.ViewHolder {
        public com.heytap.health.base.view.recyclercard.a i;

        public CardHolder(@NonNull View view) {
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

    public class a extends d {
        public a() {
        }

        @Override // com.heytap.health.base.view.recyclercard.RecyclerCardController.d
        public void a(com.heytap.health.base.view.recyclercard.a aVar, com.heytap.health.base.view.recyclercard.a.C0298a c0298a) {
            super.a(aVar, c0298a);
            if (RecyclerCardController.this.f.isComputingLayout()) {
                return;
            }
            int iIndexOf = RecyclerCardController.this.d.indexOf(aVar);
            RecyclerCardController.this.f3334c.notifyItemChanged(iIndexOf);
            StringBuilder sb = new StringBuilder();
            sb.append("onCardChanged notifyItemChanged card index ");
            sb.append(iIndexOf);
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            com.heytap.health.base.track.a.x().a(vik.TAG_MODULE_ID, 2).b();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            for (com.heytap.health.base.view.recyclercard.a aVar : RecyclerCardController.this.d) {
                if (aVar.d()) {
                    aVar.i();
                }
                aVar.h();
                aVar.n(RecyclerCardController.this.g);
            }
        }
    }

    public final class c extends RecyclerView.Adapter<CardHolder> {
        public c() {
        }

        public static /* synthetic */ void e(com.heytap.health.base.view.recyclercard.a aVar, View view) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 2).b();
            aVar.g(view);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull CardHolder cardHolder, int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("onBindViewHolder: ");
            sb.append(cardHolder);
            final com.heytap.health.base.view.recyclercard.a aVar = (com.heytap.health.base.view.recyclercard.a) RecyclerCardController.this.d.get(i);
            cardHolder.a(aVar);
            View viewInflate = (View) RecyclerCardController.this.f3335e.get(aVar);
            if (viewInflate == null) {
                viewInflate = View.inflate((Context) RecyclerCardController.this.b.get(), aVar.e(), null);
                aVar.k(RecyclerCardController.this.g);
                aVar.l((Context) RecyclerCardController.this.b.get(), viewInflate);
                RecyclerCardController.this.f3335e.put(aVar, viewInflate);
            }
            cardHolder.setVisibility(aVar.c());
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ujf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RecyclerCardController.c.e(aVar, view);
                }
            });
            ((ViewGroup) cardHolder.itemView).removeAllViews();
            ViewParent parent = viewInflate.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(viewInflate);
            }
            ((ViewGroup) cardHolder.itemView).addView(viewInflate);
            aVar.f((Context) RecyclerCardController.this.b.get(), cardHolder.itemView, viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public CardHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            CardHolder cardHolder = new CardHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.lib_base_recycler_card_layout, viewGroup, false));
            StringBuilder sb = new StringBuilder();
            sb.append("onCreateViewHolder: ");
            sb.append(cardHolder);
            return cardHolder;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return RecyclerCardController.this.d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i < RecyclerCardController.this.d.size() ? ((com.heytap.health.base.view.recyclercard.a) RecyclerCardController.this.d.get(i)).b() : super.getItemViewType(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onViewAttachedToWindow(@NonNull CardHolder cardHolder) {
            super.onViewAttachedToWindow(cardHolder);
            StringBuilder sb = new StringBuilder();
            sb.append("onViewAttachedToWindow: ");
            sb.append(cardHolder);
            cardHolder.b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void onViewDetachedFromWindow(@NonNull CardHolder cardHolder) {
            if (cardHolder.itemView.findFocus() != null) {
                cardHolder.itemView.clearFocus();
            }
            super.onViewDetachedFromWindow(cardHolder);
            StringBuilder sb = new StringBuilder();
            sb.append("onViewDetachedFromWindow: ");
            sb.append(cardHolder);
            cardHolder.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(@NonNull CardHolder cardHolder) {
            super.onViewRecycled(cardHolder);
            StringBuilder sb = new StringBuilder();
            sb.append("onViewRecycled: ");
            sb.append(cardHolder);
            ((ViewGroup) cardHolder.itemView).removeAllViews();
        }
    }

    public static abstract class d {
        public void a(com.heytap.health.base.view.recyclercard.a aVar, com.heytap.health.base.view.recyclercard.a.C0298a c0298a) {
        }
    }

    public RecyclerCardController(Context context, RecyclerView recyclerView) {
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.b = weakReference;
        c cVar = new c();
        this.f3334c = cVar;
        this.f = recyclerView;
        if (recyclerView.getLayoutManager() == null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(weakReference.get()));
        }
        recyclerView.setAdapter(cVar);
        recyclerView.addOnAttachStateChangeListener(new b());
    }

    public void g(com.heytap.health.base.view.recyclercard.a aVar) {
        this.d.add(aVar);
        this.f3334c.notifyDataSetChanged();
    }

    public void h(com.heytap.health.base.view.recyclercard.a aVar, int i) {
        this.d.add(i, aVar);
        this.f3334c.notifyDataSetChanged();
        StringBuilder sb = new StringBuilder();
        sb.append("addCard notifyDataSetChanged ");
        sb.append(i);
    }

    public void i(List<com.heytap.health.base.view.recyclercard.a> list) {
        this.d.clear();
        this.d.addAll(list);
        this.f3334c.notifyDataSetChanged();
    }

    public List<com.heytap.health.base.view.recyclercard.a> j() {
        return this.d;
    }

    public RecyclerView k() {
        return this.f;
    }

    public void l(com.heytap.health.base.view.recyclercard.a aVar) {
        this.d.remove(aVar);
        this.f3334c.notifyDataSetChanged();
    }
}
