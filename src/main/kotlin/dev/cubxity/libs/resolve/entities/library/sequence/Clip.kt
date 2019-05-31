package dev.cubxity.libs.resolve.entities.library.sequence

import dev.cubxity.libs.resolve.entities.library.sequence.adjusts.AdjustBlend
import dev.cubxity.libs.resolve.entities.library.sequence.adjusts.AdjustCrop
import dev.cubxity.libs.resolve.entities.library.sequence.adjusts.AdjustTransform
import org.jonnyzzz.kotlin.xml.bind.XAttribute
import org.jonnyzzz.kotlin.xml.bind.XElements
import org.jonnyzzz.kotlin.xml.bind.XSub
import org.jonnyzzz.kotlin.xml.bind.jdom.JXML

class Clip {
    /**
     * 1 = true
     * 0 = false
     */
    var enabled by JXML / XAttribute("enabled")
    var name by JXML / XAttribute("name")
    var lane by JXML / XAttribute("lane")
    var format by JXML / XAttribute("format")
    var tcFormat by JXML / XAttribute("tcFormat")
    var offset by JXML / XAttribute("offset")
    var start by JXML / XAttribute("start")
    var duration by JXML / XAttribute("duration")
    var clips by JXML / XElements("clip") / XSub(Clip::class.java)
    var titles by JXML / XElements("title") / XSub(Title::class.java)
    var videos by JXML / XElements("videos") / XSub(Video::class.java)
    var audios by JXML / XElements("audio") / XSub(Audio::class.java)
    var audioAuxSources  by JXML / XElements("audio-aux-source") / XSub(AudioAuxSource::class.java)
    var adjustCrop by JXML / "adjust-crop" / XSub(AdjustCrop::class.java)
    var adjustTransform by JXML / "adjust-transform" / XSub(AdjustTransform::class.java)
    var adjustBlend by JXML / "adjust-blend" / XSub(AdjustBlend::class.java)
}