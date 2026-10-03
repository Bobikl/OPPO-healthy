package com.heytap.health.watch.contactsync.ui.adapter;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.coui.appcompat.checkbox.COUICheckBox;
import com.heytap.health.watch.contactsync.R$drawable;
import com.heytap.health.watch.contactsync.R$id;
import com.heytap.health.watch.contactsync.R$layout;
import com.heytap.health.watch.contactsync.R$string;
import com.heytap.health.watch.contactsync.ui.bean.ContactItemBean;
import com.heytap.health.watch.contactsync.ui.model.ContactViewModel;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.qe0;
import com.oplus.weatherservicesdk.data.Weather;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ContactSettingAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int STATE_EDIT = 2;
    public static final int STATE_NORMAL = 1;
    public static final int TYPE_LIST = 1;
    public static final int TYPE_NOPERMISSION = 3;
    public static final int TYPE_NORESULT = 4;
    public int i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<ContactItemBean> f6474j = new ArrayList();
    public ContactViewModel k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f6475l;

    public class CommonHolder extends RecyclerView.ViewHolder {
        public final TextView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final COUICheckBox f6476j;
        public final ImageView k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f6477l;
        public String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f6478n;
        public AnimatorSet o;
        public AnimatorSet p;

        public class a implements View.OnLongClickListener {
            public final /* synthetic */ ContactSettingAdapter i;

            public a(ContactSettingAdapter contactSettingAdapter) {
                this.i = contactSettingAdapter;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                CommonHolder commonHolder = CommonHolder.this;
                a aVar = ContactSettingAdapter.this.f6475l;
                if (aVar == null) {
                    return false;
                }
                aVar.L0(commonHolder.getLayoutPosition());
                return true;
            }
        }

        public CommonHolder(View view) {
            super(view);
            this.f6477l = "elevation";
            this.m = "scaleX";
            this.f6478n = "scaleY";
            this.i = (TextView) view.findViewById(R$id.tv_contactsync_name);
            ImageView imageView = (ImageView) view.findViewById(R$id.iv_contactsync_move);
            this.k = imageView;
            this.f6476j = (COUICheckBox) view.findViewById(R$id.cb_contactsync);
            view.setOnLongClickListener(new a(ContactSettingAdapter.this));
            imageView.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.m44
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return this.i.h(view2, motionEvent);
                }
            });
            e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean h(View view, MotionEvent motionEvent) {
            if (ContactSettingAdapter.this.f6475l == null) {
                return false;
            }
            if (motionEvent.getAction() != 0) {
                return true;
            }
            ContactSettingAdapter.this.f6475l.f6(this);
            return true;
        }

        public final void e() {
            g();
            f();
        }

        public final void f() {
            this.p = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.itemView, this.m, 1.1f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.itemView, this.f6478n, 1.1f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.itemView, this.f6477l, 16.0f, 0.0f);
            this.p.setDuration(400L);
            this.p.setInterpolator(PathInterpolatorCompat.create(0.15f, 0.0f, 0.0f, 1.0f));
            this.p.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
        }

        public final void g() {
            this.o = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.itemView, this.f6477l, 0.0f, 16.0f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.setInterpolator(PathInterpolatorCompat.create(0.4f, 0.0f, 0.2f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.itemView, this.m, 1.0f, 1.1f);
            objectAnimatorOfFloat2.setDuration(300L);
            objectAnimatorOfFloat2.setInterpolator(PathInterpolatorCompat.create(0.15f, 0.0f, 0.0f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.itemView, this.f6478n, 1.0f, 1.1f);
            objectAnimatorOfFloat3.setDuration(300L);
            objectAnimatorOfFloat3.setInterpolator(PathInterpolatorCompat.create(0.15f, 0.0f, 0.0f, 1.0f));
            this.o.play(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat);
        }

        public void i() {
            AnimatorSet animatorSet = this.o;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.o.end();
            }
            this.p.start();
        }

        public void j() {
            AnimatorSet animatorSet = this.p;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.p.end();
            }
            this.o.start();
        }
    }

    public static class NoResultHolder extends RecyclerView.ViewHolder {
        public final TextView i;

        public NoResultHolder(@NonNull View view) {
            super(view);
            this.i = (TextView) view.findViewById(R$id.tv_noresult_tip);
        }
    }

    public static class PersimissHolder extends RecyclerView.ViewHolder {
        public final Button i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public TextView f6480j;

        public PersimissHolder(@NonNull View view) {
            super(view);
            this.i = (Button) view.findViewById(R$id.btn_permissions_open);
            this.f6480j = (TextView) view.findViewById(R$id.tv_permissions_tip);
        }
    }

    public interface a {
        void L0(int i);

        void Q5();

        void f6(RecyclerView.ViewHolder viewHolder);
    }

    public ContactSettingAdapter(ContactViewModel contactViewModel) {
        this.k = contactViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(RecyclerView.ViewHolder viewHolder, View view) {
        r(viewHolder.getLayoutPosition(), ((CommonHolder) viewHolder).f6476j.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(RecyclerView.ViewHolder viewHolder, View view) {
        if (i()) {
            return;
        }
        COUICheckBox cOUICheckBox = ((CommonHolder) viewHolder).f6476j;
        cOUICheckBox.setChecked(!cOUICheckBox.isChecked());
        r(viewHolder.getLayoutPosition(), cOUICheckBox.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(View view) {
        a aVar = this.f6475l;
        if (aVar != null) {
            aVar.Q5();
        }
    }

    public boolean g() {
        return this.f6474j.size() > 0 && this.f6474j.get(0).getItemType() == 4;
    }

    public List<ContactItemBean> getData() {
        return this.f6474j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f6474j.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f6474j.get(i).getItemType();
    }

    public boolean h() {
        return this.f6474j.size() > 0 && this.f6474j.get(0).getItemType() == 3;
    }

    public final boolean i() {
        return this.i == 1;
    }

    public void m(List<ContactItemBean> list) {
        List<ContactItemBean> list2 = this.f6474j;
        if (list2 != list) {
            list2.clear();
            this.f6474j.addAll(list);
        }
        notifyDataSetChanged();
    }

    public void n(int i, int i2) {
        Collections.swap(this.f6474j, i, i2);
        notifyItemMoved(i, i2);
    }

    public final void o(PersimissHolder persimissHolder, int i) {
        Context context = persimissHolder.itemView.getContext();
        String string = context.getResources().getString(R$string.watch_contactsync_contact_permission);
        SpannableString spannableString = new SpannableString(string + Weather.SEPARATOR + context.getResources().getString(R$string.watch_contactsync_contact_permission_tip));
        spannableString.setSpan(new AbsoluteSizeSpan(ejg.a(b78.a(), 12.0f), false), string.length(), spannableString.length(), 33);
        persimissHolder.f6480j.setText(spannableString);
        persimissHolder.i.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.l44
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.l(view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 1) {
            q((CommonHolder) viewHolder, i);
        } else if (itemViewType == 3) {
            o((PersimissHolder) viewHolder, i);
        } else {
            if (itemViewType != 4) {
                return;
            }
            p((NoResultHolder) viewHolder, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 3) {
            PersimissHolder persimissHolder = new PersimissHolder(layoutInflaterFrom.inflate(R$layout.watch_contactsync_item_nopermissions, viewGroup, false));
            Context context = viewGroup.getContext();
            Drawable drawable = ContextCompat.getDrawable(context, R$drawable.watch_contactsync_noresult);
            if (qe0.y(context)) {
                drawable.setAlpha(102);
            }
            persimissHolder.f6480j.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
            return persimissHolder;
        }
        if (i != 4) {
            final CommonHolder commonHolder = new CommonHolder(layoutInflaterFrom.inflate(R$layout.watch_contactsync_item_result, viewGroup, false));
            commonHolder.f6476j.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.j44
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.i.j(commonHolder, view);
                }
            });
            commonHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.k44
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.i.k(commonHolder, view);
                }
            });
            return commonHolder;
        }
        NoResultHolder noResultHolder = new NoResultHolder(layoutInflaterFrom.inflate(R$layout.watch_contactsync_item_noresult, viewGroup, false));
        Context context2 = viewGroup.getContext();
        Drawable drawable2 = ContextCompat.getDrawable(context2, R$drawable.watch_contactsync_noresult);
        if (qe0.y(context2)) {
            drawable2.setAlpha(102);
        }
        noResultHolder.i.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, (Drawable) null);
        return noResultHolder;
    }

    public final void p(NoResultHolder noResultHolder, int i) {
        Context context = noResultHolder.itemView.getContext();
        String string = context.getResources().getString(R$string.watch_contactsync_contact_noresult);
        SpannableString spannableString = new SpannableString(string + Weather.SEPARATOR + context.getResources().getString(R$string.watch_contactsync_contact_noresult_tip));
        spannableString.setSpan(new AbsoluteSizeSpan(ejg.a(b78.a(), 12.0f), false), string.length(), spannableString.length(), 33);
        noResultHolder.i.setText(spannableString);
    }

    public final void q(CommonHolder commonHolder, int i) {
        ContactItemBean contactItemBean = this.f6474j.get(i);
        commonHolder.i.setText(contactItemBean.getName());
        commonHolder.f6476j.setChecked(contactItemBean.isSelect());
        int i2 = i() ? 8 : 0;
        commonHolder.f6476j.setVisibility(i2);
        commonHolder.k.setVisibility(i2);
    }

    public final void r(int i, boolean z) {
        this.f6474j.get(i).setSelect(z);
        Iterator<ContactItemBean> it = this.f6474j.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().isSelect()) {
                i2++;
            }
        }
        this.k.M().setValue(Integer.valueOf(i2));
    }

    public void s(int i) {
        this.i = i;
        notifyDataSetChanged();
    }

    public void setAdapterOnClickListener(a aVar) {
        this.f6475l = aVar;
    }
}
