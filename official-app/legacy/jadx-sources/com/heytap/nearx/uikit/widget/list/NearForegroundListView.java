package com.heytap.nearx.uikit.widget.list;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ListView;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes18.dex */
public class NearForegroundListView extends ListView {
    private Paint mPaint;

    public NearForegroundListView(Context context) {
        super(context);
        this.mPaint = new Paint();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawText(" ", 0.0f, 0.0f, this.mPaint);
    }

    public NearForegroundListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPaint = new Paint();
    }

    public NearForegroundListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPaint = new Paint();
    }

    @RequiresApi(api = 21)
    public NearForegroundListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mPaint = new Paint();
    }
}
