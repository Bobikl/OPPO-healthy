package com.heytap.nearx.uikit.widget.edittext;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes18.dex */
public class NearEditTextOperateUtil {
    private TextDrawable drawable = new TextDrawable();
    private NearEditText editText;
    private View.OnClickListener listener;
    private boolean operateButton;

    public class TextDrawable extends Drawable {
        private float maxWidth;
        private Paint paint;
        private Paint paintBack;
        private int textSize;
        private String originText = "";
        private String text = "";
        private int color = -1;
        private int colorback = -16711936;

        public TextDrawable() {
            this.textSize = (int) TypedValue.applyDimension(2, 14.0f, NearEditTextOperateUtil.this.editText.getResources().getDisplayMetrics());
            this.maxWidth = TypedValue.applyDimension(1, 112.0f, NearEditTextOperateUtil.this.editText.getResources().getDisplayMetrics());
            Paint paint = new Paint();
            this.paint = paint;
            paint.setTextSize(this.textSize);
            this.paintBack = new Paint();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            this.paintBack.setColor(this.colorback);
            this.paintBack.setAntiAlias(true);
            this.paintBack.setStyle(Paint.Style.FILL);
            this.paint.setTextSize(this.textSize);
            this.paint.setColor(this.color);
            this.paint.setAntiAlias(true);
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setTextAlign(Paint.Align.LEFT);
            Paint.FontMetrics fontMetrics = this.paint.getFontMetrics();
            canvas.drawRoundRect(new RectF(0.0f, 0.0f, getwidth(), getheight()), TypedValue.applyDimension(1, 5.7f, NearEditTextOperateUtil.this.editText.getResources().getDisplayMetrics()), TypedValue.applyDimension(1, 5.7f, NearEditTextOperateUtil.this.editText.getResources().getDisplayMetrics()), this.paintBack);
            String str = this.text;
            float fApplyDimension = (int) TypedValue.applyDimension(1, 7.0f, NearEditTextOperateUtil.this.editText.getResources().getDisplayMetrics());
            float f = getheight() / 2.0f;
            float f2 = fontMetrics.descent;
            canvas.drawText(str, fApplyDimension, (f + ((f2 - fontMetrics.ascent) / 2.0f)) - f2, this.paint);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        public float getheight() {
            return TypedValue.applyDimension(1, 24.0f, NearEditTextOperateUtil.this.editText.getResources().getDisplayMetrics());
        }

        public float getwidth() {
            return this.paint.measureText(this.text) + TypedValue.applyDimension(1, 14.0f, NearEditTextOperateUtil.this.editText.getResources().getDisplayMetrics());
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            this.paintBack.setAlpha(i);
        }

        public void setBackColor(int i) {
            this.colorback = i;
        }

        public void setBold(boolean z) {
            this.paint.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.paintBack.setColorFilter(colorFilter);
        }

        public void setText(String str) {
            this.originText = str;
            this.text = str;
            if (getwidth() > this.maxWidth) {
                while (this.text.length() > 1) {
                    String str2 = this.text;
                    this.text = str2.substring(0, str2.length() - 1);
                    if (getwidth() <= this.maxWidth) {
                        break;
                    }
                }
                StringBuilder sb = new StringBuilder();
                String str3 = this.text;
                sb.append(str3.substring(0, str3.length() - 1));
                sb.append("…");
                this.text = sb.toString();
            }
        }

        public void setTextColor(int i) {
            this.color = i;
        }

        public void setTextSize(int i) {
            this.textSize = i;
            this.paint.setTextSize(i);
            this.maxWidth = i * 8;
            setText(this.originText);
        }
    }

    public NearEditTextOperateUtil(NearEditText nearEditText, AttributeSet attributeSet, boolean z) {
        this.editText = nearEditText;
        this.operateButton = z;
        nearEditText.setPadding(nearEditText.getPaddingLeft(), nearEditText.getPaddingTop(), nearEditText.getPaddingRight(), (int) (nearEditText.getPaddingBottom() + TypedValue.applyDimension(1, 6.0f, nearEditText.getResources().getDisplayMetrics())));
        if (attributeSet == null) {
            nearEditText.setTextSize(16.0f);
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = nearEditText.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.textSize});
        nearEditText.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(0, (int) TypedValue.applyDimension(2, 16.0f, nearEditText.getResources().getDisplayMetrics())));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void invalidate() {
        if (this.operateButton) {
            TextDrawable textDrawable = this.drawable;
            textDrawable.setBounds(0, 0, (int) textDrawable.getwidth(), (int) this.drawable.getheight());
            Drawable[] compoundDrawablesRelative = this.editText.getCompoundDrawablesRelative();
            this.editText.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.drawable, compoundDrawablesRelative[3]);
            if (this.editText.getCompoundDrawablePadding() == 0) {
                NearEditText nearEditText = this.editText;
                nearEditText.setCompoundDrawablePadding((int) TypedValue.applyDimension(2, 4.0f, nearEditText.getResources().getDisplayMetrics()));
            }
        }
    }

    public boolean haveOperateButton() {
        return this.operateButton;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.operateButton && motionEvent.getAction() == 0 && this.listener != null) {
            if (this.editText.getLayoutDirection() == 1) {
                if (this.drawable.getBounds().contains((int) (motionEvent.getX() - this.editText.getPaddingEnd()), (int) (motionEvent.getY() - ((this.editText.getHeight() - this.drawable.getheight()) / 2.0f)))) {
                    this.listener.onClick(this.editText);
                    return true;
                }
            } else {
                if (this.drawable.getBounds().contains((int) (motionEvent.getX() - ((this.editText.getWidth() - this.editText.getPaddingEnd()) - this.drawable.getwidth())), (int) (motionEvent.getY() - ((this.editText.getHeight() - this.drawable.getheight()) / 2.0f)))) {
                    this.listener.onClick(this.editText);
                    return true;
                }
            }
        }
        return this.editText.superOnTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i) {
        this.drawable.setBackColor(i);
        invalidate();
    }

    public void setHaveOperateButton(boolean z) {
        this.operateButton = z;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.listener = onClickListener;
    }

    public void setText(String str) {
        this.drawable.setText(str);
        invalidate();
    }

    public void setTextBold(boolean z) {
        this.drawable.setBold(z);
        invalidate();
    }

    public void setTextColor(int i) {
        this.drawable.setTextColor(i);
        invalidate();
    }

    public void setTextSize(int i) {
        this.drawable.setTextSize(i);
        invalidate();
    }
}
