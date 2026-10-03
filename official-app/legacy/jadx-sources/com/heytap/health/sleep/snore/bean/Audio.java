package com.heytap.health.sleep.snore.bean;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.md7;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class Audio {
    private static final String TAG = "Audio";
    private String clientFileId;
    private int duration;
    private long end;
    private List<FragmentInfoBean> fragmentInfoBeanList;
    private long lastModified;
    private String name;
    private String path;
    private long start;
    private long timeMillis;
    private float volume = 1.0f;
    private int channel = 2;
    private int sampleRate = 44100;
    private int bitNum = 16;
    private int progress = 0;
    private boolean isPlay = false;

    public static synchronized Audio createAudioFromFile(File file) throws Exception {
        Audio audio;
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(file.getPath());
        } catch (Exception e2) {
            a7b.b(TAG, "createAudioFromFile " + e2.getMessage());
            mediaExtractor.setDataSource(new FileInputStream(file).getFD());
        }
        int trackCount = mediaExtractor.getTrackCount();
        MediaFormat trackFormat = null;
        int i = 0;
        while (i < trackCount) {
            trackFormat = mediaExtractor.getTrackFormat(i);
            if (trackFormat.getString("mime").startsWith("audio/")) {
                mediaExtractor.selectTrack(i);
                break;
            }
            i++;
        }
        if (i == trackCount) {
            throw new Exception("No audio track found in " + file);
        }
        audio = new Audio();
        audio.name = file.getName();
        audio.path = file.getAbsolutePath();
        audio.lastModified = file.lastModified() / 1000;
        if (trackFormat != null) {
            audio.sampleRate = trackFormat.containsKey("sample-rate") ? trackFormat.getInteger("sample-rate") : 8000;
            audio.channel = trackFormat.containsKey("channel-count") ? trackFormat.getInteger("channel-count") : 1;
            audio.timeMillis = trackFormat.getLong("durationUs") / 1000;
            int integer = trackFormat.containsKey("pcm-encoding") ? trackFormat.getInteger("pcm-encoding") : 2;
            if (integer == 3) {
                audio.bitNum = 8;
            } else if (integer != 4) {
                audio.bitNum = 16;
            } else {
                audio.bitNum = 32;
            }
        }
        audio.duration = (int) md7.h(audio.path);
        mediaExtractor.release();
        return audio;
    }

    public int getBitNum() {
        return this.bitNum;
    }

    public int getChannel() {
        return this.channel;
    }

    public String getClientFileId() {
        return this.clientFileId;
    }

    public int getDuration() {
        return this.duration;
    }

    public long getEnd() {
        return this.end;
    }

    public List<FragmentInfoBean> getFragmentInfoBeanList() {
        return this.fragmentInfoBeanList;
    }

    public long getLastModified() {
        return this.lastModified;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public int getProgress() {
        return this.progress;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public long getStart() {
        return this.start;
    }

    public boolean isPlay() {
        return this.isPlay;
    }

    public void setClientFileId(String str) {
        this.clientFileId = str;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setEnd(long j2) {
        this.end = j2;
    }

    public void setFragmentInfoBeanList(List<FragmentInfoBean> list) {
        this.fragmentInfoBeanList = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPlay(boolean z) {
        this.isPlay = z;
    }

    public void setProgress(int i) {
        this.progress = i;
    }

    public void setStart(long j2) {
        this.start = j2;
    }

    public void setTimeMillis(long j2) {
        this.timeMillis = j2;
    }

    public String toString() {
        return "Audio{path='" + this.path + "', name='" + this.name + "', volume=" + this.volume + ", channel=" + this.channel + ", sampleRate=" + this.sampleRate + ", bitNum=" + this.bitNum + ", timeMillis=" + this.timeMillis + ", duration=" + this.duration + ", start=" + this.start + ", end=" + this.end + ", progress=" + this.progress + '}';
    }
}
