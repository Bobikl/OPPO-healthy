package com.lifesense.plugin.ble.data;

/* JADX INFO: loaded from: classes5.dex */
public interface IPacketEncoder {
    byte[] encodeCmdBytes();

    int getCmd();
}
