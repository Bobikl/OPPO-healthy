package com.heytap.health.watch.music.transfer.manage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.watch.music.R$id;
import com.heytap.health.watch.music.R$layout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class SimplePlaylistAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public List<String> i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f6527j;

    public interface a {
        void e(String str);

        void f();
    }

    public static class b extends RecyclerView.ViewHolder {
        public TextView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public TextView f6528j;

        public b(@NonNull View view) {
            super(view);
            this.i = (TextView) view.findViewById(R$id.newPlaylistTv);
            this.f6528j = (TextView) view.findViewById(R$id.titleTv);
        }
    }

    public SimplePlaylistAdapter(@NonNull a aVar) {
        this.f6527j = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        a aVar = this.f6527j;
        if (aVar != null) {
            aVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(int i, View view) {
        a aVar = this.f6527j;
        if (aVar != null) {
            aVar.e(this.i.get(i - 1));
        }
    }

    public List<String> f() {
        return this.i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.i.size() + 1;
    }

    public void i(@NonNull List<String> list) {
        this.i = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        b bVar = (b) viewHolder;
        if (i == 0) {
            bVar.i.setVisibility(0);
            bVar.f6528j.setVisibility(8);
            bVar.i.setAlpha(1.0f);
            bVar.i.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.d4h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.i.g(view);
                }
            });
            return;
        }
        bVar.i.setVisibility(8);
        bVar.f6528j.setVisibility(0);
        bVar.f6528j.setText(this.i.get(i - 1));
        bVar.f6528j.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.e4h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.h(i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.watch_music_simple_playlist_item_layout, viewGroup, false));
    }
}
