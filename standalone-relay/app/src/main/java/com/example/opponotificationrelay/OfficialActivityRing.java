package com.example.opponotificationrelay;
import android.graphics.*;
/** Canvas port of 6.6.7 DailyProgressWithBlurShadowKt.i; keep its cap order and radial borders. */
final class OfficialActivityRing {
    private static final int[][] COLORS={{0xff1ae766,(int)4279688543L,(int)4283361671L,0xff1ae766},{0xffea740c,(int)4294280483L,(int)4294880357L,0xffea740c},{0xffffb200,(int)4294226718L,(int)4294889573L,0xffffb200},{0xff00a1ff,(int)4278235903L,(int)4285385215L,0xff00a1ff}};
    private static final int[] BORDER={(int)4284153762L,(int)4294953319L,(int)4294959449L,(int)4283102975L};
    static void draw(Canvas c,Paint p,float x,float y,int index,float progress){
        float radius=28,stroke=14,border=stroke/12,half=stroke/2,sweep=Math.min(progress,1)*360;int[] colors=COLORS[index];int edge=BORDER[index];float[] stops={0,.25f,index<2?.8f:.7f,1};
        p.setShader(null);p.setStyle(Paint.Style.STROKE);p.setStrokeCap(Paint.Cap.BUTT);p.setStrokeWidth(stroke);p.setColor(0x1f778899);c.drawCircle(x,y,radius,p);if(progress<=0){p.setStyle(Paint.Style.FILL);p.setAlpha(255);return;}p.setColor(Color.WHITE);p.setAlpha(255);
        if(progress<1)cap(c,p,x,y-radius,half,border,colors[0],edge,90);
        SweepGradient gradient=new SweepGradient(x,y,colors,stops);Matrix rotation=new Matrix();rotation.setRotate(-90,x,y);gradient.setLocalMatrix(rotation);p.setStyle(Paint.Style.STROKE);p.setStrokeWidth(stroke);p.setShader(gradient);arc(c,p,x,y,radius,progress<1?-91:-90,progress<1?sweep+1:sweep);
        float inner=radius-half,outer=radius+half;
        p.setStrokeWidth(border);p.setShader(new RadialGradient(x,y,inner+border,new int[]{edge,edge,edge&0x00ffffff},new float[]{0,1-border/(inner+border),1},Shader.TileMode.CLAMP));arc(c,p,x,y,inner+border/2,progress<1?-91:-90,progress<1?sweep+1:sweep);
        p.setShader(new RadialGradient(x,y,outer,new int[]{edge&0x00ffffff,edge&0x00ffffff,edge},new float[]{0,1-border/outer,1},Shader.TileMode.CLAMP));arc(c,p,x,y,outer-border/2,progress<1?-91:-90,progress<1?sweep+1:sweep);
        float angle=progress*360-90;
        if(progress>=1){double radians=Math.toRadians(angle+3);float sx=x+(float)Math.cos(radians)*radius,sy=y+(float)Math.sin(radians)*radius;p.setStyle(Paint.Style.FILL);p.setShader(new RadialGradient(sx,sy,half,new int[]{0xff000000,0x00000000},null,Shader.TileMode.CLAMP));c.drawArc(sx-half,sy-half,sx+half,sy+half,angle,180,true,p);}
        double radians=Math.toRadians(angle-1);cap(c,p,x+(float)Math.cos(radians)*radius,y+(float)Math.sin(radians)*radius,half,border,color(progress%1,colors,stops),edge,angle);
        p.setShader(null);p.setStyle(Paint.Style.FILL);p.setStrokeCap(Paint.Cap.BUTT);
    }
    private static void arc(Canvas c,Paint p,float x,float y,float r,float start,float sweep){c.drawArc(x-r,y-r,x+r,y+r,start,sweep,false,p);}
    private static void cap(Canvas c,Paint p,float x,float y,float r,float border,int fill,int edge,float start){p.setStyle(Paint.Style.FILL);p.setShader(new RadialGradient(x,y,r,new int[]{fill,fill,edge},new float[]{0,1-border/r,1},Shader.TileMode.CLAMP));c.drawArc(x-r,y-r,x+r,y+r,start,180,true,p);}
    private static int color(float value,int[] colors,float[] stops){for(int i=1;i<stops.length;i++)if(value<=stops[i]){float t=(value-stops[i-1])/(stops[i]-stops[i-1]);int a=colors[i-1],b=colors[i];return Color.rgb(Math.round(Color.red(a)+(Color.red(b)-Color.red(a))*t),Math.round(Color.green(a)+(Color.green(b)-Color.green(a))*t),Math.round(Color.blue(a)+(Color.blue(b)-Color.blue(a))*t));}return colors[colors.length-1];}
}
