package com.heytap.health.bandface.api;

import androidx.annotation.Keep;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public abstract class SyncBandFaceCallback {
    public final int a;
    public final int b;

    @Keep
    public static class SimpleBandFaceBean {
        private String WfName;
        private String previewUrl;
        private String wfUnique;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SimpleBandFaceBean simpleBandFaceBean = (SimpleBandFaceBean) obj;
            return Objects.equals(this.wfUnique, simpleBandFaceBean.wfUnique) && Objects.equals(this.previewUrl, simpleBandFaceBean.previewUrl);
        }

        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public String getWfName() {
            return this.WfName;
        }

        public String getWfUnique() {
            return this.wfUnique;
        }

        public int hashCode() {
            return Objects.hash(this.wfUnique, this.previewUrl);
        }

        public void setPreviewUrl(String str) {
            this.previewUrl = str;
        }

        public void setWfName(String str) {
            this.WfName = str;
        }

        public void setWfUnique(String str) {
            this.wfUnique = str;
        }

        public String toString() {
            return "Band {wfUnique=" + this.wfUnique + ", previewUrl=" + this.previewUrl + "}";
        }
    }

    public SyncBandFaceCallback(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public abstract void a(String str, List<SimpleBandFaceBean> list);

    public abstract void b(String str);
}
