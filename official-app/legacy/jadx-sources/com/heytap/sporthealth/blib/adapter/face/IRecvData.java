package com.heytap.sporthealth.blib.adapter.face;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.sporthealth.blib.adapter.holder.JViewHolder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public interface IRecvData {
    void onBindViewHolder(JViewHolder jViewHolder, int i, @Nullable List<Object> list, @Nullable OnViewClickListener onViewClickListener);

    void onViewAttachedToWindow(@NonNull JViewHolder jViewHolder);

    void onViewDetachedFromWindow(@NonNull JViewHolder jViewHolder);
}
