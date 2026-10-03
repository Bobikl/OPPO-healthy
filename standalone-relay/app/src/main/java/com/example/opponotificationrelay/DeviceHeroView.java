package com.example.opponotificationrelay;

import android.content.Context;
import android.util.AttributeSet;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.view.View;

/** Original official shell + bundled static face, composed with official 176x262 / 133 geometry. */
public final class DeviceHeroView extends View {
    private final Paint paint=new Paint(Paint.ANTI_ALIAS_FLAG|Paint.FILTER_BITMAP_FLAG);
    private final Path circle=new Path();private final RectF shellRect=new RectF(0,0,528,786),faceRect=new RectF(64.5f,193.5f,463.5f,592.5f);
    private final Drawable placeholder;private Bitmap shell,face;private boolean blue;
    public DeviceHeroView(Context context,AttributeSet attrs){super(context,attrs);placeholder=context.getDrawable(R.drawable.device_watch_hero);setImportantForAccessibility(IMPORTANT_FOR_ACCESSIBILITY_NO);circle.addCircle(264,393,199.5f,Path.Direction.CW);}
    public void identity(DeviceIdentity identity){boolean next=identity!=null && identity.blueWatchX2();if(next==blue)return;blue=next;
        if(blue && shell==null){BitmapFactory.Options o=new BitmapFactory.Options();o.inScaled=false;shell=BitmapFactory.decodeResource(getResources(),R.drawable.official_watch_x2_blue,o);face=BitmapFactory.decodeResource(getResources(),R.drawable.official_watch_x2_face,o);}invalidate();}
    @Override protected void onDraw(Canvas canvas){super.onDraw(canvas);
        if(!blue || shell==null || face==null){placeholder.setBounds(0,0,getWidth(),getHeight());placeholder.draw(canvas);return;}
        float scale=Math.min(getWidth()/528f,getHeight()/786f);int saved=canvas.save();canvas.translate((getWidth()-528*scale)/2,(getHeight()-786*scale)/2);canvas.scale(scale,scale);
        int clipped=canvas.save();canvas.clipPath(circle);paint.setColor(Color.BLACK);canvas.drawCircle(264,393,199.5f,paint);canvas.drawBitmap(face,null,faceRect,paint);canvas.restoreToCount(clipped);
        canvas.drawBitmap(shell,null,shellRect,paint);canvas.restoreToCount(saved);
    }
}
