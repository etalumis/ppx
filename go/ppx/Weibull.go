// Code generated by the FlatBuffers compiler. DO NOT EDIT.

package ppx

import (
	flatbuffers "github.com/google/flatbuffers/go"
)

type Weibull struct {
	_tab flatbuffers.Table
}

func GetRootAsWeibull(buf []byte, offset flatbuffers.UOffsetT) *Weibull {
	n := flatbuffers.GetUOffsetT(buf[offset:])
	x := &Weibull{}
	x.Init(buf, n+offset)
	return x
}

func GetSizePrefixedRootAsWeibull(buf []byte, offset flatbuffers.UOffsetT) *Weibull {
	n := flatbuffers.GetUOffsetT(buf[offset+flatbuffers.SizeUint32:])
	x := &Weibull{}
	x.Init(buf, n+offset+flatbuffers.SizeUint32)
	return x
}

func (rcv *Weibull) Init(buf []byte, i flatbuffers.UOffsetT) {
	rcv._tab.Bytes = buf
	rcv._tab.Pos = i
}

func (rcv *Weibull) Table() flatbuffers.Table {
	return rcv._tab
}

func (rcv *Weibull) Scale(obj *Tensor) *Tensor {
	o := flatbuffers.UOffsetT(rcv._tab.Offset(4))
	if o != 0 {
		x := rcv._tab.Indirect(o + rcv._tab.Pos)
		if obj == nil {
			obj = new(Tensor)
		}
		obj.Init(rcv._tab.Bytes, x)
		return obj
	}
	return nil
}

func (rcv *Weibull) Concentration(obj *Tensor) *Tensor {
	o := flatbuffers.UOffsetT(rcv._tab.Offset(6))
	if o != 0 {
		x := rcv._tab.Indirect(o + rcv._tab.Pos)
		if obj == nil {
			obj = new(Tensor)
		}
		obj.Init(rcv._tab.Bytes, x)
		return obj
	}
	return nil
}

func WeibullStart(builder *flatbuffers.Builder) {
	builder.StartObject(2)
}
func WeibullAddScale(builder *flatbuffers.Builder, scale flatbuffers.UOffsetT) {
	builder.PrependUOffsetTSlot(0, flatbuffers.UOffsetT(scale), 0)
}
func WeibullAddConcentration(builder *flatbuffers.Builder, concentration flatbuffers.UOffsetT) {
	builder.PrependUOffsetTSlot(1, flatbuffers.UOffsetT(concentration), 0)
}
func WeibullEnd(builder *flatbuffers.Builder) flatbuffers.UOffsetT {
	return builder.EndObject()
}
