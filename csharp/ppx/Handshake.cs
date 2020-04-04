// <auto-generated>
//  automatically generated by the FlatBuffers compiler, do not modify
// </auto-generated>

namespace ppx
{

using global::System;
using global::System.Collections.Generic;
using global::FlatBuffers;

public struct Handshake : IFlatbufferObject
{
  private Table __p;
  public ByteBuffer ByteBuffer { get { return __p.bb; } }
  public static void ValidateVersion() { FlatBufferConstants.FLATBUFFERS_1_12_0(); }
  public static Handshake GetRootAsHandshake(ByteBuffer _bb) { return GetRootAsHandshake(_bb, new Handshake()); }
  public static Handshake GetRootAsHandshake(ByteBuffer _bb, Handshake obj) { return (obj.__assign(_bb.GetInt(_bb.Position) + _bb.Position, _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __p = new Table(_i, _bb); }
  public Handshake __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public string SystemName { get { int o = __p.__offset(4); return o != 0 ? __p.__string(o + __p.bb_pos) : null; } }
#if ENABLE_SPAN_T
  public Span<byte> GetSystemNameBytes() { return __p.__vector_as_span<byte>(4, 1); }
#else
  public ArraySegment<byte>? GetSystemNameBytes() { return __p.__vector_as_arraysegment(4); }
#endif
  public byte[] GetSystemNameArray() { return __p.__vector_as_array<byte>(4); }

  public static Offset<ppx.Handshake> CreateHandshake(FlatBufferBuilder builder,
      StringOffset system_nameOffset = default(StringOffset)) {
    builder.StartTable(1);
    Handshake.AddSystemName(builder, system_nameOffset);
    return Handshake.EndHandshake(builder);
  }

  public static void StartHandshake(FlatBufferBuilder builder) { builder.StartTable(1); }
  public static void AddSystemName(FlatBufferBuilder builder, StringOffset systemNameOffset) { builder.AddOffset(0, systemNameOffset.Value, 0); }
  public static Offset<ppx.Handshake> EndHandshake(FlatBufferBuilder builder) {
    int o = builder.EndTable();
    return new Offset<ppx.Handshake>(o);
  }
};


}
