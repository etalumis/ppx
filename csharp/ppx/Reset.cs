// <auto-generated>
//  automatically generated by the FlatBuffers compiler, do not modify
// </auto-generated>

namespace ppx
{

using global::System;
using global::System.Collections.Generic;
using global::FlatBuffers;

public struct Reset : IFlatbufferObject
{
  private Table __p;
  public ByteBuffer ByteBuffer { get { return __p.bb; } }
  public static void ValidateVersion() { FlatBufferConstants.FLATBUFFERS_1_12_0(); }
  public static Reset GetRootAsReset(ByteBuffer _bb) { return GetRootAsReset(_bb, new Reset()); }
  public static Reset GetRootAsReset(ByteBuffer _bb, Reset obj) { return (obj.__assign(_bb.GetInt(_bb.Position) + _bb.Position, _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __p = new Table(_i, _bb); }
  public Reset __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }


  public static void StartReset(FlatBufferBuilder builder) { builder.StartTable(0); }
  public static Offset<ppx.Reset> EndReset(FlatBufferBuilder builder) {
    int o = builder.EndTable();
    return new Offset<ppx.Reset>(o);
  }
};


}
