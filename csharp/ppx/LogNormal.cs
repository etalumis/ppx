// <auto-generated>
//  automatically generated by the FlatBuffers compiler, do not modify
// </auto-generated>

namespace ppx
{

using global::System;
using global::System.Collections.Generic;
using global::FlatBuffers;

public struct LogNormal : IFlatbufferObject
{
  private Table __p;
  public ByteBuffer ByteBuffer { get { return __p.bb; } }
  public static void ValidateVersion() { FlatBufferConstants.FLATBUFFERS_2_0_0(); }
  public static LogNormal GetRootAsLogNormal(ByteBuffer _bb) { return GetRootAsLogNormal(_bb, new LogNormal()); }
  public static LogNormal GetRootAsLogNormal(ByteBuffer _bb, LogNormal obj) { return (obj.__assign(_bb.GetInt(_bb.Position) + _bb.Position, _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __p = new Table(_i, _bb); }
  public LogNormal __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public ppx.Tensor? Loc { get { int o = __p.__offset(4); return o != 0 ? (ppx.Tensor?)(new ppx.Tensor()).__assign(__p.__indirect(o + __p.bb_pos), __p.bb) : null; } }
  public ppx.Tensor? Scale { get { int o = __p.__offset(6); return o != 0 ? (ppx.Tensor?)(new ppx.Tensor()).__assign(__p.__indirect(o + __p.bb_pos), __p.bb) : null; } }

  public static Offset<ppx.LogNormal> CreateLogNormal(FlatBufferBuilder builder,
      Offset<ppx.Tensor> locOffset = default(Offset<ppx.Tensor>),
      Offset<ppx.Tensor> scaleOffset = default(Offset<ppx.Tensor>)) {
    builder.StartTable(2);
    LogNormal.AddScale(builder, scaleOffset);
    LogNormal.AddLoc(builder, locOffset);
    return LogNormal.EndLogNormal(builder);
  }

  public static void StartLogNormal(FlatBufferBuilder builder) { builder.StartTable(2); }
  public static void AddLoc(FlatBufferBuilder builder, Offset<ppx.Tensor> locOffset) { builder.AddOffset(0, locOffset.Value, 0); }
  public static void AddScale(FlatBufferBuilder builder, Offset<ppx.Tensor> scaleOffset) { builder.AddOffset(1, scaleOffset.Value, 0); }
  public static Offset<ppx.LogNormal> EndLogNormal(FlatBufferBuilder builder) {
    int o = builder.EndTable();
    return new Offset<ppx.LogNormal>(o);
  }
};


}
