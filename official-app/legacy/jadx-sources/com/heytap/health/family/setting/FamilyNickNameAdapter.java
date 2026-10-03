package com.heytap.health.family.setting;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.coui.appcompat.button.COUIButton;
import com.heytap.health.family.family.R$id;
import com.heytap.health.family.family.R$layout;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.s47;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class FamilyNickNameAdapter extends RecyclerView.Adapter<a> {
    public final Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecyclerView f4242j;
    public List<String> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LayoutInflater f4243l;
    public int m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f4244n;

    public static final class a extends RecyclerView.ViewHolder {
        public final COUIButton i;

        public a(@NonNull View view) {
            super(view);
            this.i = (COUIButton) view.findViewById(R$id.btn_nick);
        }
    }

    public interface b {
        void a(int i);
    }

    public FamilyNickNameAdapter(Context context, List<String> list, RecyclerView recyclerView) {
        this.i = context;
        this.f4243l = LayoutInflater.from(context);
        this.k = list;
        this.f4242j = recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(int i, a aVar, View view) {
        s47.a("FamilyNickNameAdapter", "onBindViewHolder pos: " + i);
        this.f4244n.a(i);
        a aVar2 = (a) this.f4242j.findViewHolderForAdapterPosition(this.m);
        if (i == this.m) {
            return;
        }
        if (aVar2 != null) {
            e(this.i, aVar2.i);
        }
        h(aVar.i);
        this.m = i;
    }

    public final void e(Context context, COUIButton cOUIButton) {
        if (qe0.y(context)) {
            g(cOUIButton);
        } else {
            f(cOUIButton);
        }
    }

    public final void f(COUIButton cOUIButton) {
        cOUIButton.setDrawableColor(Color.parseColor("#0A000000"));
        cOUIButton.setTextColor(Color.parseColor("#4D000000"));
    }

    public final void g(COUIButton cOUIButton) {
        cOUIButton.setDrawableColor(Color.parseColor("#1AFFFFFF"));
        cOUIButton.setTextColor(Color.parseColor("#4DFFFFFF"));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.k.size();
    }

    public final void h(COUIButton cOUIButton) {
        cOUIButton.setDrawableColor(Color.parseColor("#FF2DC84E"));
        cOUIButton.setTextColor(Color.parseColor("#FFFFFFFF"));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull final a aVar, final int i) {
        s47.a("FamilyNickNameAdapter", "onBindViewHolder enter!");
        s47.a("FamilyNickNameAdapter", "selectedPos: " + this.m);
        aVar.i.setText(this.k.get(i));
        if (i == this.m) {
            h(aVar.i);
        } else {
            e(this.i, aVar.i);
        }
        aVar.i.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.d57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.i(i, aVar, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        s47.a("FamilyNickNameAdapter", "onCreateViewHolder enter!");
        return new a(this.f4243l.inflate(R$layout.health_family_nick_name_btn, viewGroup, false));
    }

    public void l(b bVar) {
        this.f4244n = bVar;
    }
}
