package com.heytap.health.watch.music.transfer.add;

import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.base.base.BaseApplication;
import com.heytap.health.watch.music.R$id;
import com.heytap.health.watch.music.R$layout;
import com.heytap.health.watch.music.R$plurals;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class MusicIndexAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public final List<Pair<String, Integer>> i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f6506j;

    public static class a extends RecyclerView.ViewHolder {
        public View i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public TextView f6507j;
        public TextView k;

        public a(@NonNull View view) {
            super(view);
            this.i = view.findViewById(R$id.itemRootView);
            this.f6507j = (TextView) view.findViewById(R$id.titleTv);
            this.k = (TextView) view.findViewById(R$id.subTitleTv);
        }
    }

    public interface b {
        void e(String str);
    }

    public MusicIndexAdapter(b bVar) {
        this.f6506j = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Pair pair, View view) {
        b bVar = this.f6506j;
        if (bVar != null) {
            bVar.e((String) pair.first);
        }
    }

    public void f(List<Pair<String, Integer>> list) {
        this.i.clear();
        this.i.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        a aVar = (a) viewHolder;
        final Pair<String, Integer> pair = this.i.get(i);
        aVar.f6507j.setText((CharSequence) pair.first);
        aVar.k.setText(BaseApplication.a().getResources().getQuantityString(R$plurals.watch_music_num_songs, ((Integer) pair.second).intValue(), pair.second));
        aVar.i.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.cac
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.e(pair, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.watch_music_add_item_layout, viewGroup, false));
    }
}
