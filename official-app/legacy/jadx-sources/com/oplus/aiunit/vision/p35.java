package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class p35 implements w10 {
    public final SoundPool i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AudioManager f15170j;
    public final List<w20> k = new ArrayList();

    public p35(Context context, u10 u10Var) {
        this.i = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(4).build()).setMaxStreams(u10Var.p).build();
        this.f15170j = (AudioManager) context.getSystemService("audio");
        if (context instanceof Activity) {
            ((Activity) context).setVolumeControlStream(3);
        }
    }

    @Override // com.oplus.aiunit.vision.yj0
    public t8c b(kb7 kb7Var) {
        j20 j20Var = (j20) kb7Var;
        MediaPlayer mediaPlayerN = n();
        if (j20Var.t() != Files.FileType.Internal) {
            try {
                mediaPlayerN.setDataSource(j20Var.e().getPath());
                mediaPlayerN.prepare();
                w20 w20Var = new w20(this, mediaPlayerN);
                synchronized (this.k) {
                    this.k.add(w20Var);
                }
                return w20Var;
            } catch (Exception e2) {
                throw new GdxRuntimeException("Error loading audio file: " + kb7Var, e2);
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorU = j20Var.u();
            mediaPlayerN.setDataSource(assetFileDescriptorU.getFileDescriptor(), assetFileDescriptorU.getStartOffset(), assetFileDescriptorU.getLength());
            assetFileDescriptorU.close();
            mediaPlayerN.prepare();
            w20 w20Var2 = new w20(this, mediaPlayerN);
            synchronized (this.k) {
                this.k.add(w20Var2);
            }
            return w20Var2;
        } catch (Exception e3) {
            throw new GdxRuntimeException("Error loading audio file: " + kb7Var + "\nNote: Internal audio files must be placed in the assets directory.", e3);
        }
    }

    @Override // com.oplus.aiunit.vision.bv5
    public void dispose() {
        synchronized (this.k) {
            Iterator it = new ArrayList(this.k).iterator();
            while (it.hasNext()) {
                ((w20) it.next()).dispose();
            }
        }
        this.i.release();
    }

    @Override // com.oplus.aiunit.vision.w10
    public void h(w20 w20Var) {
        synchronized (this.k) {
            this.k.remove(this);
        }
    }

    @Override // com.oplus.aiunit.vision.yj0
    public a3i i(kb7 kb7Var) {
        j20 j20Var = (j20) kb7Var;
        if (j20Var.t() != Files.FileType.Internal) {
            try {
                SoundPool soundPool = this.i;
                return new g30(soundPool, this.f15170j, soundPool.load(j20Var.e().getPath(), 1));
            } catch (Exception e2) {
                throw new GdxRuntimeException("Error loading audio file: " + kb7Var, e2);
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorU = j20Var.u();
            SoundPool soundPool2 = this.i;
            g30 g30Var = new g30(soundPool2, this.f15170j, soundPool2.load(assetFileDescriptorU, 1));
            assetFileDescriptorU.close();
            return g30Var;
        } catch (IOException e3) {
            throw new GdxRuntimeException("Error loading audio file: " + kb7Var + "\nNote: Internal audio files must be placed in the assets directory.", e3);
        }
    }

    public MediaPlayer n() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(14).build());
        return mediaPlayer;
    }

    @Override // com.oplus.aiunit.vision.w10
    public void pause() {
        synchronized (this.k) {
            for (w20 w20Var : this.k) {
                if (w20Var.b()) {
                    w20Var.pause();
                    w20Var.f18083l = true;
                } else {
                    w20Var.f18083l = false;
                }
            }
        }
        this.i.autoPause();
    }

    @Override // com.oplus.aiunit.vision.w10
    public void resume() {
        synchronized (this.k) {
            for (int i = 0; i < this.k.size(); i++) {
                if (this.k.get(i).f18083l) {
                    this.k.get(i).i();
                }
            }
        }
        this.i.autoResume();
    }
}
