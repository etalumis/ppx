// automatically generated by the FlatBuffers compiler, do not modify

package ppx;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Uniform extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static Uniform getRootAsUniform(ByteBuffer _bb) { return getRootAsUniform(_bb, new Uniform()); }
  public static Uniform getRootAsUniform(ByteBuffer _bb, Uniform obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Uniform __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public ppx.Tensor low() { return low(new ppx.Tensor()); }
  public ppx.Tensor low(ppx.Tensor obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public ppx.Tensor high() { return high(new ppx.Tensor()); }
  public ppx.Tensor high(ppx.Tensor obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createUniform(FlatBufferBuilder builder,
      int lowOffset,
      int highOffset) {
    builder.startTable(2);
    Uniform.addHigh(builder, highOffset);
    Uniform.addLow(builder, lowOffset);
    return Uniform.endUniform(builder);
  }

  public static void startUniform(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addLow(FlatBufferBuilder builder, int lowOffset) { builder.addOffset(0, lowOffset, 0); }
  public static void addHigh(FlatBufferBuilder builder, int highOffset) { builder.addOffset(1, highOffset, 0); }
  public static int endUniform(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Uniform get(int j) { return get(new Uniform(), j); }
    public Uniform get(Uniform obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

