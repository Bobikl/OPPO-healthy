package com.heytap.wearable.music.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface MusicProto$PlayInfoOrBuilder extends MessageLiteOrBuilder {
    int getDuration();

    String getMusicAlbum();

    ByteString getMusicAlbumBytes();

    String getMusicAppName();

    ByteString getMusicAppNameBytes();

    String getMusicArtist();

    ByteString getMusicArtistBytes();

    String getMusicPackageName();

    ByteString getMusicPackageNameBytes();

    String getMusicTitle();

    ByteString getMusicTitleBytes();
}
