package com.heytap.health.bandface.watchface.bean;

import androidx.annotation.Keep;
import com.heytap.health.bandface.data.BandFace$city;
import com.heytap.health.bandface.data.BandFace$visual;
import com.heytap.health.bandface.data.BandFace$watchface;
import com.oplus.aiunit.vision.kw0;
import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class BandFaceBean implements Comparable<BandFaceBean> {
    public static final String TAG = "BandFaceBean";
    public static final int TYPE_ALBUM = 1;
    public static final int TYPE_CLOCK = 2;
    public static final int TYPE_ONLINE = 0;
    private long fileSize;
    private int id;
    private int index;
    private boolean isCurrent;
    private boolean isSelected;
    private String name;
    private String resPath;
    private String showResPath;
    private BandFace$watchface watchface;

    public static BandFaceBean buildAlbumBean(int i, File file, File file2, String str) {
        BandFaceBean bandFaceBean = new BandFaceBean();
        bandFaceBean.watchface = BandFace$watchface.newBuilder().setWatchDialId(str).setType(1).setVisual(BandFace$visual.newBuilder().setStyleId(i).addBackgrounds(file.getName()).build()).build();
        bandFaceBean.fileSize = getFileSize(file);
        bandFaceBean.resPath = file.getAbsolutePath();
        bandFaceBean.showResPath = file2.getAbsolutePath();
        return bandFaceBean;
    }

    public static BandFaceBean buildBean(int i, BandFace$watchface bandFace$watchface) {
        BandFaceBean bandFaceBean = new BandFaceBean();
        bandFaceBean.watchface = bandFace$watchface;
        bandFaceBean.setIndex(i);
        return bandFaceBean;
    }

    public static BandFaceBean buildWork(String str, String str2, int i) {
        BandFaceBean bandFaceBean = new BandFaceBean();
        bandFaceBean.watchface = BandFace$watchface.newBuilder().setWatchDialId(str).setType(2).setCity(BandFace$city.newBuilder().setName(str2).setTimezone(i).build()).build();
        return bandFaceBean;
    }

    public BandFace$watchface getFace() {
        return this.watchface;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public int getId() {
        return this.id;
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        String str = this.name;
        return str == null ? "" : str;
    }

    public String getResPath() {
        return this.resPath;
    }

    public String getShowResPath() {
        return this.showResPath;
    }

    public boolean isCurrent() {
        return this.isCurrent;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setCurrent(boolean z) {
        this.isCurrent = z;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    private static long getFileSize(File file) throws Throwable {
        FileInputStream fileInputStream = null;
        long jAvailable = 0;
        try {
            try {
                try {
                    if (file.exists()) {
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            jAvailable = fileInputStream2.available();
                            fileInputStream = fileInputStream2;
                        } catch (Exception e2) {
                            e = e2;
                            fileInputStream = fileInputStream2;
                            kw0.b(TAG, e.getMessage());
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return jAvailable;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e3) {
                                    kw0.b(TAG, e3.getMessage());
                                }
                            }
                            throw th;
                        }
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            kw0.b(TAG, e5.getMessage());
        }
        return jAvailable;
    }

    @Override // java.lang.Comparable
    public int compareTo(BandFaceBean bandFaceBean) {
        return this.index - bandFaceBean.getIndex();
    }

    public static BandFaceBean buildBean(BandFaceOnlineBean bandFaceOnlineBean, File file) {
        BandFaceBean bandFaceBean = new BandFaceBean();
        bandFaceBean.watchface = BandFace$watchface.newBuilder().setWatchDialId(bandFaceOnlineBean.dialKey).setType(0).setFileName(file.getName()).setVersion(bandFaceOnlineBean.version).build();
        bandFaceBean.fileSize = getFileSize(file);
        bandFaceBean.resPath = file.getAbsolutePath();
        bandFaceBean.showResPath = file.getAbsolutePath();
        return bandFaceBean;
    }
}
