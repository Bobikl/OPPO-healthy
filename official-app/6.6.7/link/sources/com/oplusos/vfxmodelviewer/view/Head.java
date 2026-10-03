package com.oplusos.vfxmodelviewer.view;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010$\u001a\u00020\u0004J\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(J\u0006\u0010)\u001a\u00020*R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b¨\u0006+"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/Head;", "", "()V", "animationLength", "", "getAnimationLength", "()I", "setAnimationLength", "(I)V", "animationStart", "getAnimationStart", "setAnimationStart", "configLength", "getConfigLength", "setConfigLength", "configStart", "getConfigStart", "setConfigStart", "glbLength", "getGlbLength", "setGlbLength", "glbStart", "getGlbStart", "setGlbStart", "iblLength", "getIblLength", "setIblLength", "iblStart", "getIblStart", "setIblStart", "skyboxLength", "getSkyboxLength", "setSkyboxLength", "skyboxStart", "getSkyboxStart", "setSkyboxStart", "getHeadByteSize", "read", "", "buffer", "Ljava/nio/ByteBuffer;", "toBytes", "", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Head {
    private int animationLength;
    private int animationStart;
    private int configLength;
    private int configStart;
    private int glbLength;
    private int glbStart;
    private int iblLength;
    private int iblStart;
    private int skyboxLength;
    private int skyboxStart;

    public final int getAnimationLength() {
        return this.animationLength;
    }

    public final int getAnimationStart() {
        return this.animationStart;
    }

    public final int getConfigLength() {
        return this.configLength;
    }

    public final int getConfigStart() {
        return this.configStart;
    }

    public final int getGlbLength() {
        return this.glbLength;
    }

    public final int getGlbStart() {
        return this.glbStart;
    }

    public final int getHeadByteSize() {
        return 40;
    }

    public final int getIblLength() {
        return this.iblLength;
    }

    public final int getIblStart() {
        return this.iblStart;
    }

    public final int getSkyboxLength() {
        return this.skyboxLength;
    }

    public final int getSkyboxStart() {
        return this.skyboxStart;
    }

    public final void read(@NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.configStart = buffer.getInt();
        this.configLength = buffer.getInt();
        this.glbStart = buffer.getInt();
        this.glbLength = buffer.getInt();
        this.iblStart = buffer.getInt();
        this.iblLength = buffer.getInt();
        this.skyboxStart = buffer.getInt();
        this.skyboxLength = buffer.getInt();
        this.animationStart = buffer.getInt();
        this.animationLength = buffer.getInt();
    }

    public final void setAnimationLength(int i) {
        this.animationLength = i;
    }

    public final void setAnimationStart(int i) {
        this.animationStart = i;
    }

    public final void setConfigLength(int i) {
        this.configLength = i;
    }

    public final void setConfigStart(int i) {
        this.configStart = i;
    }

    public final void setGlbLength(int i) {
        this.glbLength = i;
    }

    public final void setGlbStart(int i) {
        this.glbStart = i;
    }

    public final void setIblLength(int i) {
        this.iblLength = i;
    }

    public final void setIblStart(int i) {
        this.iblStart = i;
    }

    public final void setSkyboxLength(int i) {
        this.skyboxLength = i;
    }

    public final void setSkyboxStart(int i) {
        this.skyboxStart = i;
    }

    @NotNull
    public final byte[] toBytes() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(getHeadByteSize());
        byteBufferAllocate.putInt(this.configStart);
        byteBufferAllocate.putInt(this.configLength);
        byteBufferAllocate.putInt(this.glbStart);
        byteBufferAllocate.putInt(this.glbLength);
        byteBufferAllocate.putInt(this.iblStart);
        byteBufferAllocate.putInt(this.iblLength);
        byteBufferAllocate.putInt(this.skyboxStart);
        byteBufferAllocate.putInt(this.skyboxLength);
        byteBufferAllocate.putInt(this.animationStart);
        byteBufferAllocate.putInt(this.animationLength);
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "buffer.array()");
        return bArrArray;
    }
}
