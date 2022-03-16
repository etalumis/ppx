-- automatically generated by the FlatBuffers compiler, do not modify

-- namespace: ppx

local flatbuffers = require('flatbuffers')

local Exponential = {} -- the module
local Exponential_mt = {} -- the class metatable

function Exponential.New()
    local o = {}
    setmetatable(o, {__index = Exponential_mt})
    return o
end
function Exponential.GetRootAsExponential(buf, offset)
    if type(buf) == "string" then
        buf = flatbuffers.binaryArray.New(buf)
    end
    local n = flatbuffers.N.UOffsetT:Unpack(buf, offset)
    local o = Exponential.New()
    o:Init(buf, n + offset)
    return o
end
function Exponential_mt:Init(buf, pos)
    self.view = flatbuffers.view.New(buf, pos)
end
function Exponential_mt:Rate()
    local o = self.view:Offset(4)
    if o ~= 0 then
        local x = self.view:Indirect(o + self.view.pos)
        local obj = require('ppx.Tensor').New()
        obj:Init(self.view.bytes, x)
        return obj
    end
end
function Exponential.Start(builder) builder:StartObject(1) end
function Exponential.AddRate(builder, rate) builder:PrependUOffsetTRelativeSlot(0, rate, 0) end
function Exponential.End(builder) return builder:EndObject() end

return Exponential -- return the module