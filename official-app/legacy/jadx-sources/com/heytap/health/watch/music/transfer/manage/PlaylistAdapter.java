package com.heytap.health.watch.music.transfer.manage;

import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.coui.appcompat.checkbox.COUICheckBox;
import com.heytap.health.base.base.BaseApplication;
import com.heytap.health.watch.music.R$id;
import com.heytap.health.watch.music.R$layout;
import com.heytap.health.watch.music.R$plurals;
import com.heytap.health.watch.music.transfer.manage.PlaylistAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class PlaylistAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public final List<Pair<String, Integer>> i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<String> f6521j = new ArrayList();
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f6522l;

    public interface a {
        void F(String str, boolean z);

        void e(String str);

        void f();
    }

    public static class b extends RecyclerView.ViewHolder {
        public View i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public View f6523j;
        public TextView k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public TextView f6524l;
        public ImageView m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public COUICheckBox f6525n;

        public b(@NonNull View view) {
            super(view);
            this.i = view.findViewById(R$id.headerRootView);
            this.f6523j = view.findViewById(R$id.itemRootView);
            this.k = (TextView) view.findViewById(R$id.titleTv);
            this.f6524l = (TextView) view.findViewById(R$id.subTitleTv);
            this.m = (ImageView) view.findViewById(R$id.arrowIcon);
            this.f6525n = (COUICheckBox) view.findViewById(R$id.checkbox);
        }
    }

    public PlaylistAdapter(a aVar) {
        this.f6522l = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        a aVar = this.f6522l;
        if (aVar != null) {
            aVar.f();
        }
    }

    public static /* synthetic */ void j(b bVar, View view) {
        bVar.f6525n.setPressed(true);
        COUICheckBox cOUICheckBox = bVar.f6525n;
        cOUICheckBox.setChecked(true ^ cOUICheckBox.isChecked());
        bVar.f6525n.setPressed(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(Pair pair, b bVar, COUICheckBox cOUICheckBox, int i) {
        a aVar;
        if (cOUICheckBox.isPressed() && (aVar = this.f6522l) != null) {
            aVar.F((String) pair.first, bVar.f6525n.isChecked());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(Pair pair, View view) {
        a aVar = this.f6522l;
        if (aVar != null) {
            aVar.e((String) pair.first);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.i.size() + 1;
    }

    public List<String> h() {
        ArrayList arrayList = new ArrayList();
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            arrayList.add((String) this.i.get(i).first);
        }
        return arrayList;
    }

    public void m(boolean z) {
        this.k = z;
        notifyDataSetChanged();
    }

    public void n(List<Pair<String, Integer>> list) {
        this.i.clear();
        this.i.addAll(list);
        notifyDataSetChanged();
    }

    public void o(List<String> list) {
        this.f6521j.clear();
        this.f6521j.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        final b bVar = (b) viewHolder;
        if (i == 0) {
            bVar.i.setVisibility(0);
            bVar.f6523j.setVisibility(8);
            if (this.k) {
                bVar.i.setAlpha(0.2f);
                bVar.i.setOnClickListener(null);
                return;
            } else {
                bVar.i.setAlpha(1.0f);
                bVar.i.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.kle
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.i.i(view);
                    }
                });
                return;
            }
        }
        final Pair<String, Integer> pair = this.i.get(i - 1);
        bVar.i.setVisibility(8);
        bVar.f6523j.setVisibility(0);
        bVar.k.setText((CharSequence) pair.first);
        bVar.f6524l.setText(BaseApplication.a().getResources().getQuantityString(R$plurals.watch_music_num_songs, ((Integer) pair.second).intValue(), pair.second));
        if (!this.k) {
            bVar.m.setVisibility(0);
            bVar.f6525n.setVisibility(8);
            bVar.f6523j.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.nle
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.i.l(pair, view);
                }
            });
        } else {
            bVar.m.setVisibility(8);
            bVar.f6525n.setVisibility(0);
            bVar.f6525n.setChecked(this.f6521j.contains(pair.first));
            bVar.f6523j.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.lle
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlaylistAdapter.j(bVar, view);
                }
            });
            bVar.f6525n.setOnStateChangeListener(new COUICheckBox.c() { // from class: com.oplus.aiunit.vision.mle
                @Override // com.coui.appcompat.checkbox.COUICheckBox.c
                public final void a(COUICheckBox cOUICheckBox, int i2) {
                    this.a.k(pair, bVar, cOUICheckBox, i2);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.watch_music_playlist_item_layout, viewGroup, false));
    }
}
