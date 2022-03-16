-- automatically generated by the FlatBuffers compiler, do not modify

-- namespace: ppx

local flatbuffers = require('flatbuffers')

local Categorical = {} -- the module
local Categorical_mt = {} -- the class metatable

function Categorical.New()
    local o = {}
    setmetatable(o, {__index = Categorical_mt})
    return o
end
function Categorical.GetRootAsCategorical(buf, offset)
    if type(buf) == "string" then
        buf = flatbuffers.binaryArray.New(buf)
    end
    local n = flatbuffers.N.UOffsetT:Unpack(buf, offset)
    local o = Categorical.New()
    o:Init(buf, n + offset)
    return o
end
function Categorical_mt:Init(buf, pos)
    self.view = flatbuffers.view.New(buf, pos)
end
function Categorical_mt:Probs()
    local o = self.view:Offset(4)
    if o ~= 0 then
        local x = self.view:Indirect(o + self.view.pos)
        local obj = require('ppx.Tensor').New()
        obj:Init(self.view.bytes, x)
        return obj
    end
end
function Categorical.Start(builder) builder:StartObject(1) end
function Categorical.AddProbs(builder, probs) builder:PrependUOffsetTRelativeSlot(0, probs, 0) end
function Categorical.End(builder) return builder:EndObject() end

return Categorical -- return the module