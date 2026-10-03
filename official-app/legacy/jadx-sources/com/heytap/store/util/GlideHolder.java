package com.heytap.store.util;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes15.dex */
public class GlideHolder {

    public static class Builder {
        int cornerRadius;
        ImageView imageView;
        IProductLoadImgListener mListener;
        boolean roundAsCircle;
        String url;
        boolean needReLayout = false;
        int edgeOffset = 0;
        int placeholder = -1;
        int df = 0;

        public Builder df(int i) {
            this.df = i;
            return this;
        }

        public Builder edgeOffset(int i) {
            this.edgeOffset = i;
            return this;
        }

        public void intoTarget(ImageView imageView) {
            this.imageView = imageView;
            GlideUtil.loadImage(this.url, imageView, this.needReLayout, this.edgeOffset, this.placeholder, this.roundAsCircle, this.cornerRadius, this.df, this.mListener);
        }

        public Builder listener(IProductLoadImgListener iProductLoadImgListener) {
            this.mListener = iProductLoadImgListener;
            return this;
        }

        public Builder needReLayout(boolean z) {
            this.needReLayout = z;
            return this;
        }

        public Builder placeholder(int i) {
            this.placeholder = i;
            return this;
        }

        public Builder radius(int i) {
            this.cornerRadius = i;
            return this;
        }

        public Builder roundAsCircle(boolean z) {
            this.roundAsCircle = z;
            return this;
        }

        public Builder setUrl(String str) {
            this.url = str;
            return this;
        }
    }

    public static Builder load(String str) {
        return new Builder().setUrl(str);
    }
}
