package com.example.opponotificationrelay;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/** 当前手表官方主图：BMP头 + 小端RGBA4444，按fxc.k的四通道误差扩散编码。 */
public final class WatchIconBitmap {
    public static final int SIZE=64, BYTES=54+SIZE*SIZE*2;
    private WatchIconBitmap() { }
    public static byte[] encode(int[] argb) {
        if(argb==null || argb.length!=SIZE*SIZE) throw new IllegalArgumentException("64px pixels required");
        ByteBuffer out=ByteBuffer.allocate(BYTES).order(ByteOrder.LITTLE_ENDIAN);
        out.putShort((short)0x4d42).putInt(BYTES).putInt(0).putInt(54).putInt(40)
            .putInt(SIZE).putInt(SIZE).putShort((short)1).putShort((short)16);
        out.position(54);
        int[][] above=new int[SIZE+2][4];
        for(int y=0;y<SIZE;y++) {
            int[][] below=new int[SIZE+2][4];int[] left=new int[4];
            for(int x=0;x<SIZE;x++) {
                int pixel=argb[y*SIZE+x],packed=0;
                for(int c=0;c<4;c++) {
                    int raw=(pixel>>>(c==3?24:16-c*8))&255;
                    int corrected=raw+(left[c]+above[x+1][c])/16;
                    int quantized=Math.max(0,Math.min(255,corrected))>>>4;
                    packed|=quantized<<(12-c*4);
                    int error=corrected-quantized*255/15;
                    left[c]=error*7;below[x][c]+=error*3;below[x+1][c]+=error*5;below[x+2][c]=error;
                }
                out.putShort((short)packed);
            }
            above=below;
        }
        return out.array();
    }
    public static boolean valid(byte[] data) {
        if(data==null || data.length!=BYTES) return false;
        ByteBuffer b=ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        return b.getShort(0)==0x4d42 && b.getInt(2)==BYTES && b.getInt(6)==0
            && b.getInt(10)==54 && b.getInt(14)==40 && b.getInt(18)==SIZE && b.getInt(22)==SIZE
            && b.getShort(26)==1 && b.getShort(28)==16 && b.getInt(30)==0;
    }
}
