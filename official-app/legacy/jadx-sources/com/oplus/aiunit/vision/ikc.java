package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public class ikc extends dgc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12571c;
    public final RenderScript d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScriptIntrinsicBlur f12572e;
    public Allocation f;
    public Allocation g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Bitmap f12573j;
    public HashMap<Integer, Bitmap> k;

    public ikc(Context context, com.heytap.nearx.uikit.internal.utils.blur.a aVar) {
        super(aVar);
        this.f12571c = new Object();
        this.k = new HashMap<>();
        RenderScript renderScriptCreate = RenderScript.create(context);
        this.d = renderScriptCreate;
        this.f12572e = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
    }

    @Override // com.oplus.aiunit.vision.fgc
    public Bitmap a(Bitmap bitmap, boolean z, int i) {
        return b(bitmap);
    }

    public final Bitmap b(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmap2 = this.k.get(Integer.valueOf(height));
        if (bitmap2 != null && bitmap2.getWidth() == width && bitmap2.getHeight() == height) {
            this.f12573j = bitmap2;
        } else {
            this.f12573j = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.k.put(Integer.valueOf(height), this.f12573j);
        }
        synchronized (this.f12571c) {
            if (this.f == null || this.h != width || this.i != height) {
                this.h = width;
                this.i = height;
                c();
                Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(this.d, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
                this.f = allocationCreateFromBitmap;
                this.g = Allocation.createTyped(this.d, allocationCreateFromBitmap.getType());
            }
            this.f.copyFrom(bitmap);
            this.f12572e.setRadius(this.b.e());
            this.f12572e.setInput(this.f);
            this.f12572e.forEach(this.g);
            this.g.copyTo(this.f12573j);
        }
        return this.f12573j;
    }

    public final void c() {
        Allocation allocation = this.f;
        if (allocation != null) {
            allocation.destroy();
            this.f = null;
        }
        Allocation allocation2 = this.g;
        if (allocation2 != null) {
            allocation2.destroy();
            this.g = null;
        }
    }

    @Override // com.oplus.aiunit.vision.dgc, com.oplus.aiunit.vision.fgc
    public void destroy() {
        super.destroy();
        synchronized (this.f12571c) {
            RenderScript renderScript = this.d;
            if (renderScript != null) {
                renderScript.destroy();
            }
            ScriptIntrinsicBlur scriptIntrinsicBlur = this.f12572e;
            if (scriptIntrinsicBlur != null) {
                scriptIntrinsicBlur.destroy();
            }
            c();
        }
    }
}
