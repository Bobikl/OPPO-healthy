package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes13.dex */
public class SVGImageView extends ImageView {
    public static Method k;
    public SVG i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.caverock.androidsvg.a f1473j;

    public class b extends AsyncTask<Integer, Integer, SVG> {
        public Context a;
        public int b;

        public b(Context context, int i) {
            this.a = context;
            this.b = i;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SVG doInBackground(Integer... numArr) {
            try {
                return SVG.m(this.a, this.b);
            } catch (SVGParseException e2) {
                Log.e("SVGImageView", String.format("Error loading resource 0x%x: %s", Integer.valueOf(this.b), e2.getMessage()));
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(SVG svg) {
            SVGImageView.this.i = svg;
            SVGImageView.this.c();
        }
    }

    public class c extends AsyncTask<InputStream, Integer, SVG> {
        public c() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SVG doInBackground(InputStream... inputStreamArr) {
            try {
                return SVG.l(inputStreamArr[0]);
            } catch (SVGParseException e2) {
                Log.e("SVGImageView", "Parse error loading URI: " + e2.getMessage());
                try {
                    return null;
                } catch (IOException unused) {
                    return null;
                }
            } finally {
                try {
                    inputStreamArr[0].close();
                } catch (IOException unused2) {
                }
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(SVG svg) {
            SVGImageView.this.i = svg;
            SVGImageView.this.c();
        }
    }

    static {
        try {
            k = View.class.getMethod("setLayerType", Integer.TYPE, Paint.class);
        } catch (NoSuchMethodException unused) {
        }
    }

    public SVGImageView(Context context) {
        super(context);
        this.i = null;
        this.f1473j = new com.caverock.androidsvg.a();
    }

    private void setFromString(String str) {
        try {
            this.i = SVG.o(str);
            c();
        } catch (SVGParseException unused) {
            Log.e("SVGImageView", "Could not find SVG at: " + str);
        }
    }

    public final void c() {
        SVG svg = this.i;
        if (svg == null) {
            return;
        }
        Picture pictureT = svg.t(this.f1473j);
        g();
        setImageDrawable(new PictureDrawable(pictureT));
    }

    public final void d(AttributeSet attributeSet, int i) {
        if (isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R$styleable.SVGImageView, i, 0);
        try {
            String string = typedArrayObtainStyledAttributes.getString(R$styleable.SVGImageView_css);
            if (string != null) {
                this.f1473j.a(string);
            }
            int i2 = R$styleable.SVGImageView_svg;
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, -1);
            if (resourceId != -1) {
                setImageResource(resourceId);
                return;
            }
            String string2 = typedArrayObtainStyledAttributes.getString(i2);
            if (string2 != null) {
                if (f(Uri.parse(string2))) {
                    return;
                }
                if (e(string2)) {
                } else {
                    setFromString(string2);
                }
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final boolean e(String str) {
        try {
            new c().execute(getContext().getAssets().open(str));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean f(Uri uri) {
        try {
            new c().execute(getContext().getContentResolver().openInputStream(uri));
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    public final void g() {
        if (k == null) {
            return;
        }
        try {
            k.invoke(this, Integer.valueOf(View.class.getField("LAYER_TYPE_SOFTWARE").getInt(new View(getContext()))), null);
        } catch (Exception e2) {
            Log.w("SVGImageView", "Unexpected failure calling setLayerType", e2);
        }
    }

    public void setCSS(String str) {
        this.f1473j.a(str);
        c();
    }

    public void setImageAsset(String str) {
        if (e(str)) {
            return;
        }
        Log.e("SVGImageView", "File not found: " + str);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        new b(getContext(), i).execute(new Integer[0]);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        if (f(uri)) {
            return;
        }
        Log.e("SVGImageView", "File not found: " + uri);
    }

    public void setSVG(SVG svg) {
        if (svg == null) {
            throw new IllegalArgumentException("Null value passed to setSVG()");
        }
        this.i = svg;
        c();
    }

    public SVGImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.i = null;
        this.f1473j = new com.caverock.androidsvg.a();
        d(attributeSet, 0);
    }

    public SVGImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = null;
        this.f1473j = new com.caverock.androidsvg.a();
        d(attributeSet, i);
    }
}
