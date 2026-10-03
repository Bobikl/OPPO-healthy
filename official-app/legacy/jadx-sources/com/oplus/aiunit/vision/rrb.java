package com.oplus.aiunit.vision;

import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.support.v4.media.MediaMetadataCompat;
import android.text.format.DateUtils;
import io.protostuff.MapSchema;
import java.util.LinkedList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u001d2\u00020\u0001:\u0002\r\u0007B\u0011\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\t\u001a\u00020\bJ\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/rrb;", "", "Landroid/media/session/PlaybackState;", "playbackState", "c", "Landroid/media/MediaMetadata;", "mediaMetadata", "b", "", "d", "Lcom/oplus/aiunit/vision/rrb$b;", MapSchema.FIELD_NAME_ENTRY, "mediaOperation", "a", b2n.f, "", "Ljava/lang/String;", "packageName", "Ljava/util/LinkedList;", "Ljava/util/LinkedList;", "mMediaOperationLinkedList", "", "I", "mFraction", "f", "()Landroid/media/MediaMetadata;", "mEmptyMediaMetadata", "<init>", "(Ljava/lang/String;)V", "Companion", "music_impl_release"}, k = 1, mv = {1, 8, 0})
public final class rrb {
    public static final int TYPE_MEDIA_METADATA = 1;
    public static final int TYPE_PLAYBACK_STATE = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final String packageName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final LinkedList<b> mMediaOperationLinkedList = new LinkedList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int mFraction;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0004B3\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/rrb$b;", "", "mediaOperation", "", "a", "", "toString", "J", "timestamp", "", "b", "I", "type", "Landroid/media/session/PlaybackState;", "c", "Landroid/media/session/PlaybackState;", "playbackState", "Landroid/media/MediaMetadata;", "d", "Landroid/media/MediaMetadata;", "mediaMetadata", "", "()Z", "isPlaybackState", "isMediaMetadata", "<init>", "(JILandroid/media/session/PlaybackState;Landroid/media/MediaMetadata;)V", "Companion", "music_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final long timestamp;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final PlaybackState playbackState;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final MediaMetadata mediaMetadata;

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.rrb$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/rrb$b$a;", "", "Landroid/media/session/PlaybackState;", "playbackState", "Lcom/oplus/aiunit/vision/rrb$b;", "b", "Landroid/media/MediaMetadata;", "mediaMetadata", "a", "<init>", "()V", "music_impl_release"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final b a(@Nullable MediaMetadata mediaMetadata) {
                return new b(System.currentTimeMillis(), 1, null, mediaMetadata);
            }

            @NotNull
            public final b b(@Nullable PlaybackState playbackState) {
                return new b(System.currentTimeMillis(), 2, playbackState, null);
            }
        }

        public b() {
            this(0L, 0, null, null, 15, null);
        }

        public final long a(@NotNull b mediaOperation) {
            Intrinsics.checkNotNullParameter(mediaOperation, "mediaOperation");
            return this.timestamp - mediaOperation.timestamp;
        }

        public final boolean b() {
            return this.type == 1;
        }

        public final boolean c() {
            return this.type == 2;
        }

        @NotNull
        public String toString() {
            String dateTime = DateUtils.formatDateTime(b78.a(), this.timestamp, 1);
            int i = this.type;
            PlaybackState playbackState = this.playbackState;
            Object objValueOf = playbackState != null ? Integer.valueOf(playbackState.getState()) : "";
            MediaMetadata mediaMetadata = this.mediaMetadata;
            String string = mediaMetadata != null ? mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_TITLE) : null;
            return "MediaOperation[timestamp=" + dateTime + ",type=" + i + ",state=" + objValueOf + ",title=" + (string != null ? string : "") + "]";
        }

        public b(long j2, int i, @Nullable PlaybackState playbackState, @Nullable MediaMetadata mediaMetadata) {
            this.timestamp = j2;
            this.type = i;
            this.playbackState = playbackState;
            this.mediaMetadata = mediaMetadata;
        }

        public /* synthetic */ b(long j2, int i, PlaybackState playbackState, MediaMetadata mediaMetadata, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0L : j2, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : playbackState, (i2 & 8) != 0 ? null : mediaMetadata);
        }
    }

    public rrb(@Nullable String str) {
        this.packageName = str;
    }

    public final void a(b mediaOperation) {
        if (this.mMediaOperationLinkedList.size() >= 12) {
            g();
        }
        this.mMediaOperationLinkedList.addFirst(mediaOperation);
        if (mediaOperation.c()) {
            this.mFraction--;
        }
        if (mediaOperation.b()) {
            this.mFraction++;
        }
        this.mMediaOperationLinkedList.toString();
    }

    @Nullable
    public final MediaMetadata b(@Nullable MediaMetadata mediaMetadata) {
        b bVarE = e();
        a(b.INSTANCE.a(mediaMetadata));
        if (this.mFraction < 6) {
            return mediaMetadata;
        }
        b bVarPeekFirst = this.mMediaOperationLinkedList.peekFirst();
        return (bVarE == null || bVarPeekFirst == null || bVarPeekFirst.a(bVarE) <= 30000) ? f() : mediaMetadata;
    }

    @NotNull
    public final PlaybackState c(@NotNull PlaybackState playbackState) {
        Intrinsics.checkNotNullParameter(playbackState, "playbackState");
        b bVarPeekFirst = this.mMediaOperationLinkedList.peekFirst();
        if (bVarPeekFirst == null || !bVarPeekFirst.c()) {
            a(b.INSTANCE.b(playbackState));
        }
        return playbackState;
    }

    public final void d() {
        this.mMediaOperationLinkedList.clear();
        this.mFraction = 0;
    }

    public final b e() {
        for (b bVar : this.mMediaOperationLinkedList) {
            if (bVar.b()) {
                return bVar;
            }
        }
        return null;
    }

    public final MediaMetadata f() {
        MediaMetadata mediaMetadataBuild = new MediaMetadata.Builder().putString(MediaMetadataCompat.METADATA_KEY_TITLE, qe0.d(this.packageName)).putString(MediaMetadataCompat.METADATA_KEY_ARTIST, " ").build();
        Intrinsics.checkNotNullExpressionValue(mediaMetadataBuild, "Builder()\n              …\n                .build()");
        return mediaMetadataBuild;
    }

    public final void g() {
        b bVarRemoveLast = this.mMediaOperationLinkedList.removeLast();
        if (bVarRemoveLast.b()) {
            this.mFraction--;
        }
        if (bVarRemoveLast.c()) {
            this.mFraction++;
        }
    }
}
