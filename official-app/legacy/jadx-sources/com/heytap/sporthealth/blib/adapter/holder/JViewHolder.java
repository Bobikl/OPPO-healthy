package com.heytap.sporthealth.blib.adapter.holder;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.sporthealth.blib.adapter.vb.JViewBean;
import com.oplus.aiunit.vision.rg7;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class JViewHolder extends RecyclerView.ViewHolder {
    public final SparseArray<WeakReference<View>> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WeakReference<Activity> f7696j;
    public JViewBean k;

    @Keep
    public JViewHolder(View view) {
        super(view);
        this.f7696j = new WeakReference<>(getActivity(view));
        this.i = new SparseArray<>(10);
    }

    @Nullable
    @Keep
    public static <T> T getViewTag(View view) {
        return (T) view.getTag(538510849);
    }

    @Keep
    public static void setViewTag(View view, Object obj) {
        if (obj != null) {
            view.setTag(538510849, obj);
        }
    }

    public JViewHolder a(int i, boolean z) {
        getView(i).setSelected(z);
        return this;
    }

    @Keep
    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.f7696j;
        return (weakReference == null || weakReference.get() == null) ? getActivity(this.itemView) : this.f7696j.get();
    }

    @Keep
    public JViewBean getHoldVBean() {
        return this.k;
    }

    @Keep
    public <V extends View> V getView(int i) {
        return (V) getView(this.itemView, i);
    }

    @Keep
    public int getVisibility(int i) {
        View view = getView(i);
        if (view == null) {
            return 8;
        }
        return view.getVisibility();
    }

    @Keep
    public JViewHolder goneViews(int... iArr) {
        return setVisibility(8, iArr);
    }

    @Keep
    public <D extends JViewBean> void setHoldVBean(JViewBean jViewBean) {
        this.k = jViewBean;
    }

    @Keep
    public JViewHolder setImageBitmap(int i, Bitmap bitmap) {
        ((ImageView) getView(i)).setImageBitmap(bitmap);
        return this;
    }

    @Keep
    public JViewHolder setImageResource(int i, int i2) {
        ((ImageView) getView(i)).setImageResource(i2);
        return this;
    }

    @Keep
    public JViewHolder setOnClickListener(View.OnClickListener onClickListener, int... iArr) {
        for (int i : iArr) {
            getView(i).setOnClickListener(onClickListener);
        }
        return this;
    }

    @Keep
    public JViewHolder setText(int i, CharSequence charSequence) {
        return setText(i, charSequence, -19910113);
    }

    @Keep
    public JViewHolder setText2(int i, CharSequence charSequence) {
        return setText2(i, charSequence, -19910113);
    }

    @Keep
    public JViewHolder setVisibility(int i, int... iArr) {
        for (int i2 : iArr) {
            View view = getView(i2);
            if (view != null) {
                view.setVisibility(i);
            }
        }
        return this;
    }

    @Keep
    public JViewHolder visibleViews(int... iArr) {
        return setVisibility(0, iArr);
    }

    @Keep
    public <V extends View> V getView(View view, int i) {
        if (this.i.get(i) == null) {
            V v = (V) view.findViewById(i);
            this.i.put(i, new WeakReference<>(v));
            return v;
        }
        V v2 = (V) this.i.get(i).get();
        if (v2 != null) {
            return v2;
        }
        V v3 = (V) view.findViewById(i);
        this.i.put(i, new WeakReference<>(v3));
        return v3;
    }

    @Keep
    public JViewHolder setText(int i, CharSequence charSequence, int i2) {
        TextView textView = (TextView) getView(i);
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(0);
            if (i2 != -19910113) {
                textView.setTextColor(ContextCompat.getColor(textView.getContext(), i2));
            }
            textView.setText(charSequence);
        }
        return this;
    }

    @Keep
    public JViewHolder setText2(int i, CharSequence charSequence, @ColorInt int i2) {
        TextView textView = (TextView) getView(i);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            if (-19910113 != i2) {
                textView.setTextColor(i2);
            }
            textView.setText(charSequence);
        }
        return this;
    }

    @Keep
    public JViewHolder setOnClickListener(View.OnClickListener onClickListener) {
        this.itemView.setOnClickListener(onClickListener);
        return this;
    }

    @Keep
    public Activity getActivity(View view) {
        return rg7.g(view);
    }

    @Keep
    public JViewHolder setText(int i, int i2, int i3) {
        TextView textView = (TextView) getView(i);
        String string = textView.getContext().getResources().getString(i2);
        if (!TextUtils.isEmpty(string)) {
            textView.setVisibility(0);
            if (i3 != -19910113) {
                textView.setTextColor(ContextCompat.getColor(textView.getContext(), i3));
            }
            textView.setText(string);
        }
        return this;
    }

    @Keep
    public JViewHolder setText(int i, int i2) {
        return setText(i, i2, -19910113);
    }
}
