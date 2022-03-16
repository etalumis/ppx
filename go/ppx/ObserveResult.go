// Code generated by the FlatBuffers compiler. DO NOT EDIT.

package ppx

import (
	flatbuffers "github.com/google/flatbuffers/go"
)

type ObserveResult struct {
	_tab flatbuffers.Table
}

func GetRootAsObserveResult(buf []byte, offset flatbuffers.UOffsetT) *ObserveResult {
	n := flatbuffers.GetUOffsetT(buf[offset:])
	x := &ObserveResult{}
	x.Init(buf, n+offset)
	return x
}

func GetSizePrefixedRootAsObserveResult(buf []byte, offset flatbuffers.UOffsetT) *ObserveResult {
	n := flatbuffers.GetUOffsetT(buf[offset+flatbuffers.SizeUint32:])
	x := &ObserveResult{}
	x.Init(buf, n+offset+flatbuffers.SizeUint32)
	return x
}

func (rcv *ObserveResult) Init(buf []byte, i flatbuffers.UOffsetT) {
	rcv._tab.Bytes = buf
	rcv._tab.Pos = i
}

func (rcv *ObserveResult) Table() flatbuffers.Table {
	return rcv._tab
}

func ObserveResultStart(builder *flatbuffers.Builder) {
	builder.StartObject(0)
}
func ObserveResultEnd(builder *flatbuffers.Builder) flatbuffers.UOffsetT {
	return builder.EndObject()
}
