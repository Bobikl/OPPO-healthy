package com.lifesense.android.bluetooth.core.business;

import com.lifesense.android.bluetooth.core.bean.constant.ErrorCode;
import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;

/* JADX INFO: loaded from: classes4.dex */
public interface g extends a {
    void a(String str, PacketProfile packetProfile);

    void a(String str, PacketProfile packetProfile, ErrorCode errorCode);
}
