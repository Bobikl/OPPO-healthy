package com.oplus.aiunit.vision;

import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u001f\u0010\b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H&J\b\u0010\u0010\u001a\u00020\u0006H&J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0006H&J\u0010\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0013H&¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/cr9;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, "c", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "", "d", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "getItemViewType", "getItemCount", CityBean.POS, "a", "Landroidx/lifecycle/MutableLiveData;", "b", "health_release"}, k = 1, mv = {1, 8, 0})
public interface cr9<T extends RecyclerView.ViewHolder> {
    void a(int pos);

    @Nullable
    MutableLiveData<T> b();

    @NotNull
    T c(@NotNull ViewGroup parent, int viewType);

    void d(@NotNull T holder, int position);

    int getItemCount();

    int getItemViewType(int position);
}
