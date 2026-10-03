package com.heytap.wearable.watch.bandclock.clockdetail;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.coui.appcompat.checkbox.COUICheckBox;
import com.heytap.wearable.watch.R$array;
import com.heytap.wearable.watch.R$id;
import com.heytap.wearable.watch.R$layout;
import com.oplus.aiunit.vision.b78;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class WeekdayAdapter extends RecyclerView.Adapter<EditViewHolder> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f8456l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean[] f8455j = new boolean[7];
    public boolean[] k = new boolean[7];
    public String[] i = b78.a().getResources().getStringArray(R$array.band_weekday_list);

    public class EditViewHolder extends RecyclerView.ViewHolder {
        public COUICheckBox i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public TextView f8457j;

        public EditViewHolder(View view) {
            super(view);
            this.i = (COUICheckBox) view.findViewById(R$id.cb_theme);
            this.f8457j = (TextView) view.findViewById(R$id.tv_weekday);
        }
    }

    public class a implements View.OnClickListener {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ EditViewHolder f8458j;

        public a(int i, EditViewHolder editViewHolder) {
            this.i = i;
            this.f8458j = editViewHolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean[] zArr = WeekdayAdapter.this.f8455j;
            int i = this.i;
            boolean z = !zArr[i];
            zArr[i] = z;
            this.f8458j.i.setState(z ? 2 : 0);
            if (WeekdayAdapter.this.f8456l != null) {
                b bVar = WeekdayAdapter.this.f8456l;
                WeekdayAdapter weekdayAdapter = WeekdayAdapter.this;
                bVar.a(!Arrays.equals(weekdayAdapter.f8455j, weekdayAdapter.k));
            }
        }
    }

    public interface b {
        void a(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i, COUICheckBox cOUICheckBox, int i2) {
        if (cOUICheckBox.isPressed()) {
            if (i2 == 2) {
                this.f8455j[i] = true;
            } else if (i2 == 0) {
                this.f8455j[i] = false;
            }
            b bVar = this.f8456l;
            if (bVar != null) {
                bVar.a(!Arrays.equals(this.f8455j, this.k));
            }
        }
    }

    public boolean[] f() {
        return this.f8455j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull EditViewHolder editViewHolder, @SuppressLint({"RecyclerView"}) final int i) {
        editViewHolder.f8457j.setText(this.i[i]);
        editViewHolder.i.setState(this.f8455j[i] ? 2 : 0);
        editViewHolder.i.setOnStateChangeListener(new COUICheckBox.c() { // from class: com.oplus.aiunit.vision.tpl
            @Override // com.coui.appcompat.checkbox.COUICheckBox.c
            public final void a(COUICheckBox cOUICheckBox, int i2) {
                this.a.g(i, cOUICheckBox, i2);
            }
        });
        editViewHolder.itemView.setOnClickListener(new a(i, editViewHolder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public EditViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new EditViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.band_item_clock_weekday, viewGroup, false));
    }

    public void j(boolean[] zArr) {
        this.f8455j = zArr;
        this.k = Arrays.copyOf(zArr, zArr.length);
        notifyDataSetChanged();
    }

    public void setOnSelectChangeListener(b bVar) {
        this.f8456l = bVar;
    }
}
