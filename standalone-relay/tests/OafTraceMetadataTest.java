package com.example.opponotificationrelay;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.zip.Deflater;

public final class OafTraceMetadataTest {
    private static int assertions;
    private static void check(boolean value,String name) {assertions++;if(!value) throw new AssertionError(name);}
    private static byte[] text(String s) {return s.getBytes(StandardCharsets.UTF_8);}
    private static byte[] hex(String s) {byte[] out=new byte[s.length()/2];for(int i=0;i<out.length;i++)out[i]=(byte)Integer.parseInt(s.substring(2*i,2*i+2),16);return out;}
    private static byte[] compressed(byte[] data) {
        Deflater zip=new Deflater();try {zip.setInput(data);zip.finish();byte[] buffer=new byte[65536];int n=zip.deflate(buffer);return Arrays.copyOf(buffer,n);}finally{zip.end();}
    }
    private static void metadata() {
        check(OafTraceMetadata.digest(text("abc"),0,3).equals("ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad"),"SHA256 published vector");
        byte[] jpeg=hex("ffd8616263ffd9");
        RelayIcon icon=new RelayIcon("private.package","private.key",jpeg,144,144);
        RelayEvent post=RelayEvent.posted(1,"tag","key","private.package","private app","secret title","secret body","",1,false);
        RelayPayloadEncoder.EventEnvelope envelope=RelayPayloadEncoder.encodeLarge144Probe(post,icon);
        byte[] image=OafCrypto.concat(hex("00ca"),envelope.picture.payload);
        String meta=OafTraceMetadata.message(image,0,image.length);
        check(meta.contains("cid=202") && meta.contains("sdkFlags=0"),"plain picture metadata");
        check(meta.contains("type=_large_144") && meta.contains("imageBytes=7") && meta.contains("jpeg=true"),"picture encoding metadata");
        check(meta.contains("width=144 height=144 index=0"),"dimensions and omitted index");
        check(!meta.contains("private") && !meta.contains("secret") && !meta.contains("ffd8"),"no keys or image bytes emitted");
        String ref=OafTraceMetadata.message(OafCrypto.concat(hex("00c8"),envelope.payload),0,envelope.payload.length+2);
        check(ref.contains("refField=30") && ref.contains("keySha256="+OafTraceMetadata.digest(text("private.key_large_144"),0,text("private.key_large_144").length)),"upload reference hashes correlate");
        check(!ref.contains("secret") && !ref.contains("private") && !ref.contains("imageBytes="),"post content never emitted");
        byte[] zipped=OafCrypto.concat(hex("10"),compressed(Arrays.copyOfRange(image,1,image.length)));
        String zipMeta=OafTraceMetadata.message(zipped,0,zipped.length);
        check(zipMeta.contains("sdkFlags=16 cid=202") && zipMeta.contains("imageBytes=7"),"actual zlib codec metadata");
        byte[] encrypted=OafCrypto.concat(hex("14"),Arrays.copyOfRange(image,1,image.length));
        String secure=OafTraceMetadata.message(encrypted,0,encrypted.length);
        check(secure.contains("encrypted=true cid=unknown") && !secure.contains("keySha256") && !secure.contains("imageBytes"),"never interpret encrypted ciphertext as protobuf");
        byte[] bomb=OafCrypto.concat(hex("10"),compressed(new byte[20481]));
        check(OafTraceMetadata.message(bomb,0,bomb.length).contains("metadata=unparsed"),"bounded inflate rejects expansion");
        byte[] malformed=hex("00ca1affffffff0f");
        check(OafTraceMetadata.message(malformed,0,malformed.length).contains("metadata=unparsed"),"invalid protobuf length bounded");
        check(OafTraceMetadata.message(hex("0054"),0,2)==null,"other control CID ignored");
        check(OafTraceMetadata.message(image,-1,image.length)==null,"invalid range rejected");
        String frame=OafTraceMetadata.frame(hex("0fff0102aabb"),0,6,true);
        check(frame.contains("session=1023 flag=3 header=0fff0102 sequence=258 frameBytes=6 chunkBytes=2"),"official sequence frame known vector");
        check(OafTraceMetadata.frame(hex("0fff0102aabb"),0,6,false).contains("sequence=-1 frameBytes=6 chunkBytes=4"),"basic mode has no sequence");
        byte[] endpoint=new byte[41];endpoint[0]=1;endpoint[39]=16;endpoint[40]=4;
        endpoint=OafCrypto.concat(endpoint,hex("01000050000203d405000a0b02"));
        check(OafTraceMetadata.endpoint(endpoint).equals("peerCL=0 peerTL=1 apdu=20480 ssdu=980 window=10 compression=2"),"endpoint feature known vector");
        check(!OafTraceMetadata.endpoint(endpoint).contains("OAFP"),"endpoint peer identity omitted");
        check(OafTraceMetadata.endpoint(Arrays.copyOf(endpoint,endpoint.length-1)).contains("features=unparsed"),"truncated endpoint guarded");
    }
    private static void pngChunk(DataOutputStream out,String type,byte[] data) throws Exception {
        byte[] name=text(type);java.util.zip.CRC32 crc=new java.util.zip.CRC32();crc.update(name);crc.update(data);
        out.writeInt(data.length);out.write(name);out.write(data);out.writeInt((int)crc.getValue());
    }
    private static byte[] png216() throws Exception {
        byte[] pixels=new byte[216*(216*4+1)];Random random=new Random(7);
        for(int y=0;y<55;y++)for(int x=0;x<55;x++)for(int c=0;c<4;c++)pixels[y*(216*4+1)+1+x*4+c]=(byte)random.nextInt(256);
        ByteArrayOutputStream bytes=new ByteArrayOutputStream();DataOutputStream out=new DataOutputStream(bytes);
        out.write(hex("89504e470d0a1a0a"));pngChunk(out,"IHDR",hex("000000d8000000d80806000000"));
        pngChunk(out,"IDAT",compressed(pixels));pngChunk(out,"IEND",new byte[0]);return bytes.toByteArray();
    }
    private static void officialMainProbe() throws Exception {
        byte[] png=png216();
        check(png.length>8192 && png.length<=16384,"valid PNG spans former JPEG budget but remains within APDU budget");
        java.awt.image.BufferedImage decoded=javax.imageio.ImageIO.read(new ByteArrayInputStream(png));
        check(decoded!=null && decoded.getWidth()==216 && decoded.getHeight()==216,"real fixture decoded by independent PNG decoder");
        RelayIcon icon=new RelayIcon("test","test",png,216,216).withFreshKey();
        RelayEvent event=RelayEvent.posted(3,"tag","key","test","App","Title","Body","",1,false);
        RelayPayloadEncoder.EventEnvelope post=RelayPayloadEncoder.encodeOfficialMainProbe(event,icon);
        String imageMeta=OafTraceMetadata.message(OafCrypto.concat(hex("00ca"),post.picture.payload),0,post.picture.payload.length+2);
        String postMeta=OafTraceMetadata.message(OafCrypto.concat(hex("00c8"),post.payload),0,post.payload.length+2);
        check(imageMeta.contains("format=png") && imageMeta.contains("width=216 height=216 index=0"),"216 main PNG has no large144 chunk index");
        check(imageMeta.contains("type=_large") && postMeta.contains("refField=17") && !postMeta.contains("refField=30"),"official primary picture role and post reference");
        String keyHash=OafTraceMetadata.digest(text(icon.key+"_large"),0,text(icon.key+"_large").length);
        check(imageMeta.contains("keySha256="+keyHash) && postMeta.contains("keySha256="+keyHash),"new PNG key matches upload and reference");
        ByteArrayOutputStream incoming=new ByteArrayOutputStream(),outgoing=new ByteArrayOutputStream();
        new OafWire(new ByteArrayInputStream(new byte[0]),incoming).send(1,
            OafCrypto.concat(hex("017d650004"),text("wear:notification;"),hex("000100200001040200")));
        OafSession session=new OafSession(new OafWire(new ByteArrayInputStream(incoming.toByteArray()),outgoing),new OafSession.Events(){
            public void status(String s){}public void ready(){}
        });session.readAndHandle();outgoing.reset();session.send(post);
        ByteArrayInputStream stream=new ByteArrayInputStream(outgoing.toByteArray());OafWire reader=new OafWire(stream,new ByteArrayOutputStream());
        ByteArrayOutputStream image=new ByteArrayOutputStream();int fragments=0;
        while(true) {byte[] frame=reader.read();int flag=frame[1]&3;
            check(frame.length<=962 && (fragments==0?flag==1:flag==2||flag==3),"PNG frame flags and limits");
            fragments++;image.write(frame,2,frame.length-2);if(flag==3)break;
        }
        check(Arrays.equals(image.toByteArray(),OafCrypto.concat(hex("00ca"),post.picture.payload)),"larger real PNG exact bytes survive OAF reassembly");
        byte[] body=reader.read();check((body[1]&3)==0 && (body[3]&255)==200 && stream.available()==0,"post is written only after entire PNG");
        for(byte[] bad:new byte[][]{new byte[17000],png.clone()}) {
            if(bad.length==png.length)bad[19]=0;
            try {new RelayIcon("test","test",bad,216,216);throw new AssertionError("bad PNG accepted");}catch(IllegalArgumentException expected){assertions++;}
        }
        try {RelayPayloadEncoder.encodeOfficialMainProbe(RelayEvent.removed(1,"tag","key","test"),icon);throw new AssertionError("removed probe accepted");}
        catch(IllegalArgumentException expected){assertions++;}
        try {RelayPayloadEncoder.encodeOfficialMainProbe(RelayEvent.posted(1,"tag","key","other","Other","t","b","",1,false),icon);throw new AssertionError("wrong source accepted");}
        catch(IllegalArgumentException expected){assertions++;}
    }
    private static void bitmapMainProbe() throws Exception {
        int[] pixels=new int[4096];pixels[0]=0xff800000;pixels[1]=0xff800000;
        pixels[63]=0xff0000ff;pixels[4032]=0xff00ff00;pixels[4095]=0xffffffff;
        byte[] bmp=WatchIconBitmap.encode(pixels);
        check(bmp.length==8246 && WatchIconBitmap.valid(bmp),"official fixed BMP payload size");
        byte[] header=hex("424d36200000000000003600000028000000400000004000000001001000000000000000000000000000000000000000000000000000");
        check(Arrays.equals(Arrays.copyOf(bmp,54),header),"independent little endian BMP header vector");
        check(bmp[54]==15 && (bmp[55]&255)==128 && bmp[56]==15 && (bmp[57]&255)==112,
            "RGBA4444 channel order and signed error diffusion golden pixels");
        check((bmp[54+126]&255)==255 && bmp[55+126]==0,"top right blue retains alpha in low nibble");
        check(bmp[54+4032*2]==15 && bmp[55+4032*2]==15,"bottom left green proves official top down storage");
        check((bmp[bmp.length-2]&255)==255 && (bmp[bmp.length-1]&255)==255,"opaque white RGBA4444");
        check(bmp[54+64*2]==0 && bmp[55+64*2]==0,"transparent pixel stays transparent");
        RelayIcon icon=new RelayIcon("test","test",bmp,201,201).withFreshKey();
        RelayEvent event=RelayEvent.posted(3,"tag","key","test","App","Title","Body","",1,false);
        RelayPayloadEncoder.EventEnvelope post=RelayPayloadEncoder.encodeBitmapMainProbe(event,icon);
        String imageMeta=OafTraceMetadata.message(OafCrypto.concat(hex("00ca"),post.picture.payload),0,post.picture.payload.length+2);
        String bodyMeta=OafTraceMetadata.message(OafCrypto.concat(hex("00c8"),post.payload),0,post.payload.length+2);
        check(imageMeta.contains("format=bmp imageBytes=8246") && imageMeta.contains("width=201 height=201 index=0"),
            "original dimensions preserved separately from BMP64 header");
        String keyHash=OafTraceMetadata.digest(text(icon.key+"_large"),0,text(icon.key+"_large").length);
        check(imageMeta.contains("keySha256="+keyHash) && bodyMeta.contains("refField=17") && bodyMeta.contains("keySha256="+keyHash),
            "fresh BMP upload and post use the same main key");
        ByteArrayOutputStream incoming=new ByteArrayOutputStream(),outgoing=new ByteArrayOutputStream();
        new OafWire(new ByteArrayInputStream(new byte[0]),incoming).send(1,
            OafCrypto.concat(hex("017d650004"),text("wear:notification;"),hex("000100200001040200")));
        OafSession session=new OafSession(new OafWire(new ByteArrayInputStream(incoming.toByteArray()),outgoing),new OafSession.Events(){
            public void status(String s){}public void ready(){}
        });session.readAndHandle();outgoing.reset();session.send(post);
        ByteArrayInputStream stream=new ByteArrayInputStream(outgoing.toByteArray());OafWire reader=new OafWire(stream,new ByteArrayOutputStream());
        ByteArrayOutputStream assembled=new ByteArrayOutputStream();int count=0;
        while(true) {
            byte[] frame=reader.read();int flag=frame[1]&3;count++;
            check(frame.length<=962 && (count==1?flag==1:flag==2||flag==3),"BMP frame flags and size");
            assembled.write(frame,2,frame.length-2);if(flag==3)break;
        }
        check(count==9 && Arrays.equals(assembled.toByteArray(),OafCrypto.concat(hex("00ca"),post.picture.payload)),
            "complete BMP exact bytes survive nine TL fragments");
        byte[] body=reader.read();check((body[3]&255)==200 && stream.available()==0,"body follows all BMP fragments");
        byte[] corrupt=bmp.clone();corrupt[28]=24;
        check(!WatchIconBitmap.valid(corrupt),"reject wrong bit depth");
        try {new RelayIcon("test","test",corrupt,201,201);throw new AssertionError("invalid BMP accepted");}
        catch(IllegalArgumentException expected){assertions++;}
        try {WatchIconBitmap.encode(new int[4095]);throw new AssertionError("missing pixel accepted");}
        catch(IllegalArgumentException expected){assertions++;}
        try {RelayPayloadEncoder.encodeBitmapMainProbe(RelayEvent.posted(3,"t","k","other","App","t","b","",1,false),icon);
            throw new AssertionError("wrong source accepted");}catch(IllegalArgumentException expected){assertions++;}
    }
    private static void boundaries() throws Exception {
        ByteArrayOutputStream incoming=new ByteArrayOutputStream(),outgoing=new ByteArrayOutputStream();
        new OafWire(new ByteArrayInputStream(new byte[0]),incoming).send(1,
            OafCrypto.concat(hex("017d650004"),text("wear:notification;"),hex("000100200001040200")));
        List<String> traces=new ArrayList<>();
        OafSession session=new OafSession(new OafWire(new ByteArrayInputStream(incoming.toByteArray()),outgoing),new OafSession.Events(){
            public void status(String s){traces.add(s);}public void ready(){}public boolean traceEnabled(){return true;}
        });session.readAndHandle();check(session.isReady(),"accepted known session fixture");
        int[] lengths={959,960,961,1920,1921};int[][] flags={{0},{0},{1,3},{1,3},{1,2,3}};
        for(int i=0;i<lengths.length;i++) {
            outgoing.reset();traces.clear();byte[] payload=new byte[lengths[i]-2];Arrays.fill(payload,(byte)65);
            session.send(new RelayPayloadEncoder.EventEnvelope(2,202,payload,"test"));
            byte[] raw=outgoing.toByteArray();ByteArrayInputStream input=new ByteArrayInputStream(raw);
            OafWire reader=new OafWire(input,new ByteArrayOutputStream());ByteArrayOutputStream assembled=new ByteArrayOutputStream();
            for(int j=0;j<flags[i].length;j++) {
                byte[] frame=reader.read();check((frame[1]&3)==flags[i][j],"boundary fragment flag "+lengths[i]+"/"+j);
                check(frame[0]==0 && (frame[1]&252)==128,"known session32 two-byte header");
                check(frame.length<=962,"RFCOMM frame includes TL header within bound");
                assembled.write(frame,2,frame.length-2);
            }
            check(input.available()==0,"no extra trailing frame");
            check(Arrays.equals(assembled.toByteArray(),OafCrypto.concat(hex("00ca"),payload)),"no lost or duplicated bytes across boundary "+lengths[i]);
            int written=0;for(String s:traces)if(s.startsWith("OAF-WIRE written"))written++;
            check(written==flags[i].length,"every locally successful write traced");
        }
    }
    public static void main(String[] args) throws Exception {metadata();boundaries();officialMainProbe();bitmapMainProbe();System.out.println("PASS "+assertions+" wire metadata/boundary assertions");}
}
