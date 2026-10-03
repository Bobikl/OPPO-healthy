package com.heytap.wearable.health.gpshandler;

import androidx.annotation.Keep;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\b¨\u0006-"}, d2 = {"Lcom/heytap/wearable/health/gpshandler/GpsPoint;", "", "()V", "accuracyCog", "", "getAccuracyCog", "()I", "setAccuracyCog", "(I)V", "accuracyPosE", "getAccuracyPosE", "setAccuracyPosE", "accuracyPosH", "getAccuracyPosH", "setAccuracyPosH", "accuracyPosN", "getAccuracyPosN", "setAccuracyPosN", "cog", "", "getCog", "()F", "setCog", "(F)V", "latitude", "", "getLatitude", "()D", "setLatitude", "(D)V", "longitude", "getLongitude", "setLongitude", "posHeadingFixState", "getPosHeadingFixState", "setPosHeadingFixState", "speed", "getSpeed", "setSpeed", "state", "getState", "setState", "timestamp", "getTimestamp", "setTimestamp", "lib_gpshandler_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GpsPoint {
    private int accuracyCog;
    private int accuracyPosE;
    private int accuracyPosH;
    private int accuracyPosN;
    private float cog;
    private double latitude;
    private double longitude;
    private int posHeadingFixState;
    private float speed;
    private int state;
    private int timestamp;

    public final int getAccuracyCog() {
        return this.accuracyCog;
    }

    public final int getAccuracyPosE() {
        return this.accuracyPosE;
    }

    public final int getAccuracyPosH() {
        return this.accuracyPosH;
    }

    public final int getAccuracyPosN() {
        return this.accuracyPosN;
    }

    public final float getCog() {
        return this.cog;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final int getPosHeadingFixState() {
        return this.posHeadingFixState;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final int getState() {
        return this.state;
    }

    public final int getTimestamp() {
        return this.timestamp;
    }

    public final void setAccuracyCog(int i) {
        this.accuracyCog = i;
    }

    public final void setAccuracyPosE(int i) {
        this.accuracyPosE = i;
    }

    public final void setAccuracyPosH(int i) {
        this.accuracyPosH = i;
    }

    public final void setAccuracyPosN(int i) {
        this.accuracyPosN = i;
    }

    public final void setCog(float f) {
        this.cog = f;
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    public final void setLongitude(double d) {
        this.longitude = d;
    }

    public final void setPosHeadingFixState(int i) {
        this.posHeadingFixState = i;
    }

    public final void setSpeed(float f) {
        this.speed = f;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final void setTimestamp(int i) {
        this.timestamp = i;
    }
}
