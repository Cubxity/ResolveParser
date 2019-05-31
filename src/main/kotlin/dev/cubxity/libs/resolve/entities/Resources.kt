package dev.cubxity.libs.resolve.entities

import org.jonnyzzz.kotlin.xml.bind.XAttribute
import org.jonnyzzz.kotlin.xml.bind.XElements
import org.jonnyzzz.kotlin.xml.bind.XSub
import org.jonnyzzz.kotlin.xml.bind.jdom.JXML

class Resources {
    var formats by JXML / XElements("format") / XSub(Format::class.java)
    var effects by JXML / XElements("effect") / XSub(Format::class.java)
    var assets by JXML / XElements("asset") / XSub(Asset::class.java)

    class Format {
        var id by JXML / XAttribute("id")
        var name by JXML / XAttribute("name")
        var width by JXML / XAttribute("width")
        var height by JXML / XAttribute("height")
        var frameDuration by JXML / XAttribute("frameDuration")
    }

    class Effect {
        var id by JXML / XAttribute("id")
        var name by JXML / XAttribute("name")
        var uid by JXML / XAttribute("uid")
    }

    class Asset {
        var id by JXML / XAttribute("id")
        var name by JXML / XAttribute("name")
        var format by JXML / XAttribute("format")
        /**
         * Number
         */
        var autoChannels by JXML / XAttribute("audioChannels")
        /**
         * Number
         */
        var audioSources by JXML / XAttribute("audioSources")
        var src by JXML / XAttribute("src")
        /**
         * 1 = true
         * 0 = false
         */
        var hasAudio by JXML / XAttribute("hasAudio")
        /**
         * 1 = true
         * 0 = false
         */
        var hasVideo by JXML / XAttribute("hasAudio")

        var start by JXML / XAttribute("start")
        var duration by JXML / XAttribute("duration")
    }
}