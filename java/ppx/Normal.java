// automatically generated by the FlatBuffers compiler, do not modify

package ppx;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Normal extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static Normal getRootAsNormal(ByteBuffer _bb) { return getRootAsNormal(_bb, new Normal()); }
  public static Normal getRootAsNormal(ByteBuffer _bb, Normal obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Normal __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public ppx.Tensor mean() { return mean(new ppx.Tensor()); }
  public ppx.Tensor mean(ppx.Tensor obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public ppx.Tensor stddev() { return stddev(new ppx.Tensor()); }
  public ppx.Tensor stddev(ppx.Tensor obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createNormal(FlatBufferBuilder builder,
      int meanOffset,
      int stddevOffset) {
    builder.startTable(2);
    Normal.addStddev(builder, stddevOffset);
    Normal.addMean(builder, meanOffset);
    return Normal.endNormal(builder);
  }

  public static void startNormal(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addMean(FlatBufferBuilder builder, int meanOffset) { builder.addOffset(0, meanOffset, 0); }
  public static void addStddev(FlatBufferBuilder builder, int stddevOffset) { builder.addOffset(1, stddevOffset, 0); }
  public static int endNormal(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Normal get(int j) { return get(new Normal(), j); }
    public Normal get(Normal obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

