-- automatically generated by the FlatBuffers compiler, do not modify

-- namespace: ppx

local flatbuffers = require('flatbuffers')

local SampleResult = {} -- the module
local SampleResult_mt = {} -- the class metatable

function SampleResult.New()
    local o = {}
    setmetatable(o, {__index = SampleResult_mt})
    return o
end
function SampleResult.GetRootAsSampleResult(buf, offset)
    if type(buf) == "string" then
        buf = flatbuffers.binaryArray.New(buf)
    end
    local n = flatbuffers.N.UOffsetT:Unpack(buf, offset)
    local o = SampleResult.New()
    o:Init(buf, n + offset)
    return o
end
function SampleResult_mt:Init(buf, pos)
    self.view = flatbuffers.view.New(buf, pos)
end
function SampleResult_mt:Result()
    local o = self.view:Offset(4)
    if o ~= 0 then
        local x = self.view:Indirect(o + self.view.pos)
        local obj = require('ppx.Tensor').New()
        obj:Init(self.view.bytes, x)
        return obj
    end
end
function SampleResult.Start(builder) builder:StartObject(1) end
function SampleResult.AddResult(builder, result) builder:PrependUOffsetTRelativeSlot(0, result, 0) end
function SampleResult.End(builder) return builder:EndObject() end

return SampleResult -- return the module