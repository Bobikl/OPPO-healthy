package com.heytap.wearable.music.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface MusicProto$MusicFileInfoOrBuilder extends MessageLiteOrBuilder {
    String getMusicAlbum();

    ByteString getMusicAlbumBytes();

    String getMusicArtist();

    ByteString getMusicArtistBytes();

    String getMusicName();

    ByteString getMusicNameBytes();

    String getMusicTitle();

    ByteString getMusicTitleBytes();
}
