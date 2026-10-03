package com.example.opponotificationrelay;

import java.util.UUID;

/** 图标数据与来源绑定，不能把转发器自己的图标作为其他应用的回退。 */
public final class RelayIcon {
    public final String sourcePackage,key;
    public final byte[] data;
    public final int width,height;
    public RelayIcon(String source,String key,byte[] data,int width,int height) {
        boolean jpeg=data!=null && data.length>=4 && data.length<=8192 && width>=1 && height>=1 && width<=144 && height<=144
            && (data[0]&255)==255 && (data[1]&255)==216 && (data[data.length-2]&255)==255 && (data[data.length-1]&255)==217;
        boolean png=data!=null && data.length>=45 && data.length<=16384 && width==216 && height==216
            && java.util.Arrays.equals(java.util.Arrays.copyOfRange(data,0,8),new byte[]{(byte)137,80,78,71,13,10,26,10})
            && read32(data,8)==13 && read32(data,12)==0x49484452 && read32(data,16)==216 && read32(data,20)==216
            && read32(data,data.length-12)==0 && read32(data,data.length-8)==0x49454e44 && read32(data,data.length-4)==0xae426082;
        boolean bmp=WatchIconBitmap.valid(data) && width>=1 && width<=512 && height>=1 && height<=512;
        if(source==null || key==null || (!jpeg && !png && !bmp)) throw new IllegalArgumentException("invalid icon");
        this.sourcePackage=MessageBudget.identifier(source,256);this.key=MessageBudget.identifier(key,1024);this.data=data.clone();this.width=width;this.height=height;
    }
    private static int read32(byte[] data,int off) {return java.nio.ByteBuffer.wrap(data,off,4).getInt();}
    /** 手动核对新图标上传，图片内容与来源不变，仅避开既有图片缓存键。 */
    public RelayIcon withFreshKey() {
        return new RelayIcon(sourcePackage,key+".relayprobe."+UUID.randomUUID().toString().replace("-",""),data,width,height);
    }
}
