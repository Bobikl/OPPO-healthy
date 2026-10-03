package com.heytap.health.watch.music.transfer.manage;

import android.content.res.Resources;
import android.graphics.Color;
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
import com.heytap.health.watch.music.transfer.manage.MusicSongAdapter;
import com.oplus.aiunit.vision.dac;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class MusicSongAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public final List<dac> i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<dac> f6510j = new ArrayList();
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6511l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6512n;
    public boolean o;
    public final a p;

    public interface a {
        void P4(dac dacVar);

        void f();

        void n(dac dacVar, boolean z);
    }

    public static class b extends RecyclerView.ViewHolder {
        public View i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public TextView f6513j;
        public TextView k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ImageView f6514l;
        public COUICheckBox m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public View f6515n;
        public TextView o;
        public TextView p;

        public b(@NonNull View view) {
            super(view);
            this.i = view.findViewById(R$id.itemRootView);
            this.f6513j = (TextView) view.findViewById(R$id.titleTv);
            this.k = (TextView) view.findViewById(R$id.artistTv);
            this.f6514l = (ImageView) view.findViewById(R$id.editIv);
            this.m = (COUICheckBox) view.findViewById(R$id.checkbox);
            this.f6515n = view.findViewById(R$id.headerView);
            this.o = (TextView) view.findViewById(R$id.headerTitleTv);
            this.p = (TextView) view.findViewById(R$id.rightTv);
        }
    }

    public MusicSongAdapter(a aVar) {
        this.p = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(View view) {
        a aVar = this.p;
        if (aVar != null) {
            aVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(dac dacVar, View view) {
        a aVar = this.p;
        if (aVar != null) {
            aVar.P4(dacVar);
        }
    }

    public static /* synthetic */ void m(b bVar, View view) {
        bVar.m.setPressed(true);
        COUICheckBox cOUICheckBox = bVar.m;
        cOUICheckBox.setChecked(true ^ cOUICheckBox.isChecked());
        bVar.m.setPressed(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(dac dacVar, b bVar, COUICheckBox cOUICheckBox, int i) {
        a aVar;
        if (cOUICheckBox.isPressed() && (aVar = this.p) != null) {
            aVar.n(dacVar, bVar.m.isChecked());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.k ? this.i.size() + 1 : this.i.size();
    }

    public List<dac> h() {
        return new ArrayList(this.i);
    }

    public final void i(b bVar) {
        bVar.i.setVisibility(8);
        bVar.f6515n.setVisibility(0);
        if (this.f6512n) {
            TextView textView = bVar.p;
            Resources resources = BaseApplication.a().getResources();
            int i = R$plurals.watch_music_add_failed_with_number;
            int i2 = this.m;
            textView.setText(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
            bVar.p.setTextColor(Color.parseColor("#FFEA3447"));
        } else {
            TextView textView2 = bVar.p;
            Resources resources2 = BaseApplication.a().getResources();
            int i3 = R$plurals.watch_music_adding_with_number;
            int i4 = this.f6511l;
            textView2.setText(resources2.getQuantityString(i3, i4, Integer.valueOf(i4)));
            bVar.p.setTextColor(Color.parseColor("#4D000000"));
        }
        if (this.o) {
            bVar.f6515n.setAlpha(0.2f);
            bVar.f6515n.setOnClickListener(null);
        } else {
            bVar.f6515n.setAlpha(1.0f);
            bVar.f6515n.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.occ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.i.k(view);
                }
            });
        }
    }

    public final void j(final b bVar, final dac dacVar) {
        bVar.i.setVisibility(0);
        bVar.f6515n.setVisibility(8);
        bVar.f6513j.setText(dacVar.n());
        bVar.k.setText(dacVar.c());
        bVar.f6514l.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.lcc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.l(dacVar, view);
            }
        });
        if (!this.o) {
            bVar.m.setVisibility(8);
            bVar.f6514l.setVisibility(0);
            bVar.i.setOnClickListener(null);
        } else {
            bVar.m.setVisibility(0);
            bVar.f6514l.setVisibility(8);
            bVar.m.setChecked(this.f6510j.contains(dacVar));
            bVar.i.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.mcc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MusicSongAdapter.m(bVar, view);
                }
            });
            bVar.m.setOnStateChangeListener(new COUICheckBox.c() { // from class: com.oplus.aiunit.vision.ncc
                @Override // com.coui.appcompat.checkbox.COUICheckBox.c
                public final void a(COUICheckBox cOUICheckBox, int i) {
                    this.a.n(dacVar, bVar, cOUICheckBox, i);
                }
            });
        }
    }

    public void o(boolean z) {
        this.o = z;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        b bVar = (b) viewHolder;
        if (!this.k) {
            j(bVar, this.i.get(i));
        } else if (i == 0) {
            i(bVar);
        } else {
            j(bVar, this.i.get(i - 1));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.watch_music_song_item_layout, viewGroup, false));
    }

    public void p(List<dac> list) {
        this.i.clear();
        this.i.addAll(list);
        notifyDataSetChanged();
    }

    public void q(List<dac> list) {
        this.f6510j.clear();
        this.f6510j.addAll(list);
        notifyDataSetChanged();
    }

    public void r(boolean z, int i) {
        this.k = z;
        this.f6511l = i;
        notifyDataSetChanged();
    }

    public void s(boolean z) {
        this.f6512n = z;
        if (z) {
            notifyItemChanged(0);
        }
    }

    public void t(int i) {
        this.m = i;
        if (this.k) {
            notifyItemChanged(0);
        }
    }
}
