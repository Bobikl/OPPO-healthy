package com.heytap.sporthealth.blib.adapter.face;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public interface IRecvDataDiff extends IRecvData {
    boolean areContentsTheSame(IRecvDataDiff iRecvDataDiff, IRecvDataDiff iRecvDataDiff2);

    boolean areItemsTheSame(IRecvDataDiff iRecvDataDiff, IRecvDataDiff iRecvDataDiff2);

    Object getChangePayload(IRecvDataDiff iRecvDataDiff, IRecvDataDiff iRecvDataDiff2);
}
