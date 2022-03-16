// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { Tensor } from '../ppx/tensor';


export class LogNormal {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):LogNormal {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsLogNormal(bb:flatbuffers.ByteBuffer, obj?:LogNormal):LogNormal {
  return (obj || new LogNormal()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsLogNormal(bb:flatbuffers.ByteBuffer, obj?:LogNormal):LogNormal {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new LogNormal()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

loc(obj?:Tensor):Tensor|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? (obj || new Tensor()).__init(this.bb!.__indirect(this.bb_pos + offset), this.bb!) : null;
}

scale(obj?:Tensor):Tensor|null {
  const offset = this.bb!.__offset(this.bb_pos, 6);
  return offset ? (obj || new Tensor()).__init(this.bb!.__indirect(this.bb_pos + offset), this.bb!) : null;
}

static startLogNormal(builder:flatbuffers.Builder) {
  builder.startObject(2);
}

static addLoc(builder:flatbuffers.Builder, locOffset:flatbuffers.Offset) {
  builder.addFieldOffset(0, locOffset, 0);
}

static addScale(builder:flatbuffers.Builder, scaleOffset:flatbuffers.Offset) {
  builder.addFieldOffset(1, scaleOffset, 0);
}

static endLogNormal(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

}
