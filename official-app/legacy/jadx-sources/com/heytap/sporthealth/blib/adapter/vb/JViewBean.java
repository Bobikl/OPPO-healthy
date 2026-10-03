package com.heytap.sporthealth.blib.adapter.vb;

import androidx.annotation.Keep;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import com.heytap.sporthealth.blib.adapter.face.IRecvDataDiff;
import com.heytap.sporthealth.blib.adapter.holder.JViewHolder;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class JViewBean implements IRecvDataDiff {
    private int mPosition;

    @Override // com.heytap.sporthealth.blib.adapter.face.IRecvDataDiff
    public boolean areContentsTheSame(IRecvDataDiff iRecvDataDiff, IRecvDataDiff iRecvDataDiff2) {
        return false;
    }

    @Override // com.heytap.sporthealth.blib.adapter.face.IRecvDataDiff
    public boolean areItemsTheSame(IRecvDataDiff iRecvDataDiff, IRecvDataDiff iRecvDataDiff2) {
        return false;
    }

    @LayoutRes
    public abstract int bindLayout();

    @Override // com.heytap.sporthealth.blib.adapter.face.IRecvDataDiff
    public Object getChangePayload(IRecvDataDiff iRecvDataDiff, IRecvDataDiff iRecvDataDiff2) {
        return null;
    }

    public int getPosition() {
        return this.mPosition;
    }

    @Override // com.heytap.sporthealth.blib.adapter.face.IRecvData
    public void onViewAttachedToWindow(@NonNull JViewHolder jViewHolder) {
    }

    @Override // com.heytap.sporthealth.blib.adapter.face.IRecvData
    public void onViewDetachedFromWindow(@NonNull JViewHolder jViewHolder) {
    }

    public void onViewRecycled(@NonNull JViewHolder jViewHolder) {
    }

    public void setPosition(int i) {
        this.mPosition = i;
    }
}
