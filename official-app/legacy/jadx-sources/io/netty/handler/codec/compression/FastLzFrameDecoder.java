package io.netty.handler.codec.compression;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;
import java.util.zip.Adler32;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes10.dex */
public class FastLzFrameDecoder extends ByteToMessageDecoder {
    private final ByteBufChecksum checksum;
    private int chunkLength;
    private int currentChecksum;
    private State currentState;
    private boolean hasChecksum;
    private boolean isCompressed;
    private int originalLength;

    /* JADX INFO: renamed from: io.netty.handler.codec.compression.FastLzFrameDecoder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$compression$FastLzFrameDecoder$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$io$netty$handler$codec$compression$FastLzFrameDecoder$State = iArr;
            try {
                iArr[State.INIT_BLOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$compression$FastLzFrameDecoder$State[State.INIT_BLOCK_PARAMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$compression$FastLzFrameDecoder$State[State.DECOMPRESS_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$compression$FastLzFrameDecoder$State[State.CORRUPTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum State {
        INIT_BLOCK,
        INIT_BLOCK_PARAMS,
        DECOMPRESS_DATA,
        CORRUPTED
    }

    public FastLzFrameDecoder() {
        this(false);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091 A[Catch: Exception -> 0x013c, TRY_LEAVE, TryCatch #0 {Exception -> 0x013c, blocks: (B:2:0x0000, B:8:0x0017, B:9:0x0020, B:10:0x0025, B:43:0x0087, B:46:0x0091, B:75:0x0130, B:76:0x0133, B:25:0x0052, B:29:0x005d, B:33:0x0064, B:37:0x006b, B:39:0x0071, B:41:0x007d, B:42:0x0081, B:11:0x0026, B:14:0x002e, B:16:0x0037, B:20:0x0042, B:24:0x004c, B:77:0x0134, B:78:0x013b), top: B:82:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x009c A[Catch: all -> 0x012d, TRY_LEAVE, TryCatch #2 {all -> 0x012d, blocks: (B:48:0x0098, B:50:0x009c, B:69:0x0122, B:56:0x00d5), top: B:84:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b2 A[Catch: all -> 0x012a, TryCatch #1 {all -> 0x012a, blocks: (B:51:0x00a4, B:53:0x00b2, B:57:0x00d9, B:60:0x00e1, B:63:0x00f9, B:64:0x0114, B:65:0x0115, B:67:0x011b, B:68:0x011f, B:54:0x00bb, B:55:0x00d4), top: B:83:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00bb A[Catch: all -> 0x012a, TryCatch #1 {all -> 0x012a, blocks: (B:51:0x00a4, B:53:0x00b2, B:57:0x00d9, B:60:0x00e1, B:63:0x00f9, B:64:0x0114, B:65:0x0115, B:67:0x011b, B:68:0x011f, B:54:0x00bb, B:55:0x00d4), top: B:83:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5 A[Catch: all -> 0x012d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x012d, blocks: (B:48:0x0098, B:50:0x009c, B:69:0x0122, B:56:0x00d5), top: B:84:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9 A[Catch: all -> 0x012a, TryCatch #1 {all -> 0x012a, blocks: (B:51:0x00a4, B:53:0x00b2, B:57:0x00d9, B:60:0x00e1, B:63:0x00f9, B:64:0x0114, B:65:0x0115, B:67:0x011b, B:68:0x011f, B:54:0x00bb, B:55:0x00d4), top: B:83:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x011b A[Catch: all -> 0x012a, TryCatch #1 {all -> 0x012a, blocks: (B:51:0x00a4, B:53:0x00b2, B:57:0x00d9, B:60:0x00e1, B:63:0x00f9, B:64:0x0114, B:65:0x0115, B:67:0x011b, B:68:0x011f, B:54:0x00bb, B:55:0x00d4), top: B:83:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x011f A[Catch: all -> 0x012a, TRY_LEAVE, TryCatch #1 {all -> 0x012a, blocks: (B:51:0x00a4, B:53:0x00b2, B:57:0x00d9, B:60:0x00e1, B:63:0x00f9, B:64:0x0114, B:65:0x0115, B:67:0x011b, B:68:0x011f, B:54:0x00bb, B:55:0x00d4), top: B:83:0x00a4 }] */
    @Override // io.netty.handler.codec.ByteToMessageDecoder
    public void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        int i;
        int i2;
        int i3;
        ByteBuf byteBufRetainedSlice;
        ByteBufChecksum byteBufChecksum;
        int value;
        int iDecompress;
        try {
            int i4 = AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$FastLzFrameDecoder$State[this.currentState.ordinal()];
            int i5 = 4;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            throw new IllegalStateException();
                        }
                        byteBuf.skipBytes(byteBuf.readableBytes());
                        return;
                    }
                }
                i = this.chunkLength;
                if (byteBuf.readableBytes() < i) {
                    return;
                }
                i2 = byteBuf.readerIndex();
                i3 = this.originalLength;
                ByteBuf byteBuf2 = null;
                try {
                    if (this.isCompressed) {
                        byteBufRetainedSlice = channelHandlerContext.alloc().buffer(i3);
                        try {
                            iDecompress = FastLz.decompress(byteBuf, i2, i, byteBufRetainedSlice, byteBufRetainedSlice.writerIndex(), i3);
                            if (i3 == iDecompress) {
                                throw new DecompressionException(String.format("stream corrupted: originalLength(%d) and actual length(%d) mismatch", Integer.valueOf(i3), Integer.valueOf(iDecompress)));
                            }
                            byteBufRetainedSlice.writerIndex(byteBufRetainedSlice.writerIndex() + iDecompress);
                        } catch (Throwable th) {
                            th = th;
                            byteBuf2 = byteBufRetainedSlice;
                            if (byteBuf2 != null) {
                                byteBuf2.release();
                            }
                            throw th;
                        }
                    } else {
                        byteBufRetainedSlice = byteBuf.retainedSlice(i2, i);
                    }
                    byteBufChecksum = this.checksum;
                    if (this.hasChecksum && byteBufChecksum != null) {
                        byteBufChecksum.reset();
                        byteBufChecksum.update(byteBufRetainedSlice, byteBufRetainedSlice.readerIndex(), byteBufRetainedSlice.readableBytes());
                        value = (int) byteBufChecksum.getValue();
                        if (value == this.currentChecksum) {
                            throw new DecompressionException(String.format("stream corrupted: mismatching checksum: %d (expected: %d)", Integer.valueOf(value), Integer.valueOf(this.currentChecksum)));
                        }
                    }
                    if (byteBufRetainedSlice.readableBytes() > 0) {
                        list.add(byteBufRetainedSlice);
                    } else {
                        byteBufRetainedSlice.release();
                    }
                    byteBuf.skipBytes(i);
                    this.currentState = State.INIT_BLOCK;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                if (byteBuf.readableBytes() < 4) {
                    return;
                }
                if (byteBuf.readUnsignedMedium() != 4607066) {
                    throw new DecompressionException("unexpected block identifier");
                }
                byte b = byteBuf.readByte();
                this.isCompressed = (b & 1) == 1;
                this.hasChecksum = (b & 16) == 16;
                this.currentState = State.INIT_BLOCK_PARAMS;
            }
            int i6 = byteBuf.readableBytes();
            int i7 = (this.isCompressed ? 2 : 0) + 2;
            boolean z = this.hasChecksum;
            if (!z) {
                i5 = 0;
            }
            if (i6 < i7 + i5) {
                return;
            }
            this.currentChecksum = z ? byteBuf.readInt() : 0;
            int unsignedShort = byteBuf.readUnsignedShort();
            this.chunkLength = unsignedShort;
            if (this.isCompressed) {
                unsignedShort = byteBuf.readUnsignedShort();
            }
            this.originalLength = unsignedShort;
            this.currentState = State.DECOMPRESS_DATA;
            i = this.chunkLength;
            if (byteBuf.readableBytes() < i) {
                return;
            }
            i2 = byteBuf.readerIndex();
            i3 = this.originalLength;
            ByteBuf byteBuf3 = null;
            if (this.isCompressed) {
                byteBufRetainedSlice = channelHandlerContext.alloc().buffer(i3);
                iDecompress = FastLz.decompress(byteBuf, i2, i, byteBufRetainedSlice, byteBufRetainedSlice.writerIndex(), i3);
                if (i3 == iDecompress) {
                    throw new DecompressionException(String.format("stream corrupted: originalLength(%d) and actual length(%d) mismatch", Integer.valueOf(i3), Integer.valueOf(iDecompress)));
                }
                byteBufRetainedSlice.writerIndex(byteBufRetainedSlice.writerIndex() + iDecompress);
            } else {
                byteBufRetainedSlice = byteBuf.retainedSlice(i2, i);
            }
            byteBufChecksum = this.checksum;
            if (this.hasChecksum) {
                byteBufChecksum.reset();
                byteBufChecksum.update(byteBufRetainedSlice, byteBufRetainedSlice.readerIndex(), byteBufRetainedSlice.readableBytes());
                value = (int) byteBufChecksum.getValue();
                if (value == this.currentChecksum) {
                    throw new DecompressionException(String.format("stream corrupted: mismatching checksum: %d (expected: %d)", Integer.valueOf(value), Integer.valueOf(this.currentChecksum)));
                }
            }
            if (byteBufRetainedSlice.readableBytes() > 0) {
                list.add(byteBufRetainedSlice);
            } else {
                byteBufRetainedSlice.release();
            }
            byteBuf.skipBytes(i);
            this.currentState = State.INIT_BLOCK;
        } catch (Exception e2) {
            this.currentState = State.CORRUPTED;
            throw e2;
        }
    }

    public FastLzFrameDecoder(boolean z) {
        this(z ? new Adler32() : null);
    }

    public FastLzFrameDecoder(Checksum checksum) {
        this.currentState = State.INIT_BLOCK;
        this.checksum = checksum == null ? null : ByteBufChecksum.wrapChecksum(checksum);
    }
}
