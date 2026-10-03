package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.c.a;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATMusicInfoSetting extends LSDeviceSyncSetting {
    private int favorite;
    private int maxVolume;
    private int playState;
    private int playTime;
    private String songName;
    private int songNameType;
    private int songTime;
    private int volumeLevel;

    @Deprecated
    private String author = "N";

    @Deprecated
    private String albumName = "N";

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        int length;
        try {
            byte[] bArrA = a.a(this.songName);
            if (bArrA != null) {
                if (bArrA.length > 90) {
                    byte[] bArr = new byte[90];
                    System.arraycopy(bArrA, 0, bArr, 0, 90);
                    bArrA = bArr;
                }
                length = bArrA.length;
            } else {
                length = 0;
            }
            byte[] bArrA2 = a.a(this.author);
            int length2 = bArrA2 != null ? bArrA2.length : 0;
            byte[] bArrA3 = a.a(this.albumName);
            int length3 = bArrA3 != null ? bArrA3.length : 0;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(length3 + length2 + length + 7 + 3 + 1 + 1 + 3).order(ByteOrder.BIG_ENDIAN);
            byteBufferOrder.put((byte) getCmd());
            byteBufferOrder.put((byte) this.playState);
            byteBufferOrder.put((byte) this.volumeLevel);
            byteBufferOrder.putShort((short) this.playTime);
            byteBufferOrder.putShort((short) this.songTime);
            byteBufferOrder.put((byte) this.favorite);
            byteBufferOrder.put((byte) length);
            byteBufferOrder.put(bArrA);
            byteBufferOrder.put((byte) length2);
            byteBufferOrder.put(bArrA2);
            byteBufferOrder.put((byte) length3);
            byteBufferOrder.put(bArrA3);
            byteBufferOrder.put((byte) this.songNameType);
            byteBufferOrder.put((byte) this.maxVolume);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.put((byte) 0);
            return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Deprecated
    public String getAlbumName() {
        return this.albumName;
    }

    @Deprecated
    public String getAuthor() {
        return this.author;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = 242;
        return 242;
    }

    public int getFavorite() {
        return this.favorite;
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }

    public int getPlayState() {
        return this.playState;
    }

    public int getPlayTime() {
        return this.playTime;
    }

    public String getSongName() {
        return this.songName;
    }

    public int getSongNameType() {
        return this.songNameType;
    }

    public int getSongTime() {
        return this.songTime;
    }

    public int getVolumeLevel() {
        return this.volumeLevel;
    }

    public void parse(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
        this.cmd = a.a(byteBufferOrder.get());
        this.playState = a.a(byteBufferOrder.get());
        this.volumeLevel = a.a(byteBufferOrder.get());
        this.playTime = a.a(byteBufferOrder.getShort());
        this.songTime = a.a(byteBufferOrder.getShort());
        this.favorite = a.a(byteBufferOrder.get());
        int iA = a.a(byteBufferOrder.get());
        byte[] bArr2 = new byte[iA];
        byteBufferOrder.get(bArr2, 0, iA);
        this.songName = a.i(bArr2);
        int iA2 = a.a(byteBufferOrder.get());
        byte[] bArr3 = new byte[iA2];
        byteBufferOrder.get(bArr3, 0, iA2);
        this.author = a.i(bArr3);
        int iA3 = a.a(byteBufferOrder.get());
        byte[] bArr4 = new byte[iA3];
        byteBufferOrder.get(bArr4, 0, iA3);
        this.albumName = a.i(bArr4);
        this.songNameType = a.a(byteBufferOrder.get());
        this.maxVolume = a.a(byteBufferOrder.get());
    }

    @Deprecated
    public void setAlbumName(String str) {
    }

    @Deprecated
    public void setAuthor(String str) {
    }

    public void setFavorite(int i) {
        this.favorite = i;
    }

    public void setMaxVolume(int i) {
        this.maxVolume = i;
    }

    public void setPlayState(int i) {
        this.playState = i;
    }

    public void setPlayTime(int i) {
        this.playTime = i;
    }

    public void setSongName(String str) {
        this.songName = str;
    }

    public void setSongNameType(int i) {
        this.songNameType = i;
    }

    public void setSongTime(int i) {
        this.songTime = i;
    }

    public void setVolumeLevel(int i) {
        this.volumeLevel = i;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATMusicInfoSetting{playState=" + this.playState + ", volumeLevel=" + this.volumeLevel + ", playTime=" + this.playTime + ", songTime=" + this.songTime + ", favorite=" + this.favorite + ", songName='" + this.songName + "', author='" + this.author + "', albumName='" + this.albumName + "', songNameType=" + this.songNameType + ", maxVolume=" + this.maxVolume + '}';
    }
}
