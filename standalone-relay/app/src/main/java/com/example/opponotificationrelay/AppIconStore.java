package com.example.opponotificationrelay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.LruCache;
import java.io.ByteArrayOutputStream;

/** 小容量、按原包名分开的图标缓存；只在通知实际需要发送时读取。 */
public final class AppIconStore {
    private static final LruCache<String,Entry> cache=new LruCache<>(32);
    private static final class Entry {
        final RelayIcon icon; final long time=SystemClock.elapsedRealtime();
        Entry(RelayIcon icon) {this.icon=icon;}
    }
    /** 根据本机官方主图216像素、PNG编码分支增加的手动对照；不污染日常JPEG缓存。 */
    public static RelayIcon getOfficialMainProbe(Context context,String pkg) {
        Bitmap bitmap=null;
        try {
            Drawable drawable=context.getPackageManager().getApplicationIcon(pkg).mutate();
            bitmap=Bitmap.createBitmap(216,216,Bitmap.Config.ARGB_8888);
            Canvas canvas=new Canvas(bitmap);android.graphics.Path mask=new android.graphics.Path();
            mask.addRoundRect(new android.graphics.RectF(0,0,216,216),16,16,android.graphics.Path.Direction.CW);
            canvas.clipPath(mask);drawable.setBounds(0,0,216,216);drawable.draw(canvas);
            ByteArrayOutputStream bytes=new ByteArrayOutputStream();
            if(bitmap.compress(Bitmap.CompressFormat.PNG,100,bytes) && bytes.size()<=16384)
                return new RelayIcon(pkg,pkg,bytes.toByteArray(),216,216);
            FileLogger.w("IconProbe","216主图PNG超过诊断尺寸上限，未改尺寸或回退其他格式 bytes="+bytes.size());
        } catch(Exception e) {FileLogger.w("IconProbe","216主图生成失败："+e.getClass().getSimpleName());}
        finally {if(bitmap!=null)bitmap.recycle();}
        return null;
    }
    /** 本机官方与新键实测均使用BMP主图；protobuf沿用Drawable原尺寸，BMP内固定64像素。 */
    public static RelayIcon createWatchMainIcon(Context context,String pkg) {
        Bitmap bitmap=null;
        try {
            Drawable drawable=context.getPackageManager().getApplicationIcon(pkg).mutate();
            int width=Math.max(1,Math.min(512,drawable.getIntrinsicWidth()));
            int height=Math.max(1,Math.min(512,drawable.getIntrinsicHeight()));
            bitmap=Bitmap.createBitmap(64,64,Bitmap.Config.ARGB_8888);
            Canvas canvas=new Canvas(bitmap);android.graphics.Path mask=new android.graphics.Path();
            mask.addCircle(32,32,32,android.graphics.Path.Direction.CW);canvas.clipPath(mask);
            drawable.setBounds(0,0,64,64);drawable.draw(canvas);
            int[] pixels=new int[4096];bitmap.getPixels(pixels,0,64,0,0,64,64);
            return new RelayIcon(pkg,pkg,WatchIconBitmap.encode(pixels),width,height);
        } catch(Exception e) {FileLogger.w("IconProbe","BMP主图生成失败："+e.getClass().getSimpleName());}
        finally {if(bitmap!=null)bitmap.recycle();}
        return null;
    }
    public static synchronized void trim() {cache.trimToSize(8);}
    public static synchronized void invalidate(String pkg) {if(pkg==null)cache.evictAll();else cache.remove(pkg);}
    public static synchronized RelayIcon get(Context context,String pkg) {
        Entry old=cache.get(pkg);
        if(old!=null && SystemClock.elapsedRealtime()-old.time<600000) return old.icon;
        RelayIcon icon=createWatchMainIcon(context,pkg);
        // 来源图标读取失败就留空；不改用转发器图标，不把失败永久缓存。
        cache.put(pkg,new Entry(icon));
        return icon;
    }
}
