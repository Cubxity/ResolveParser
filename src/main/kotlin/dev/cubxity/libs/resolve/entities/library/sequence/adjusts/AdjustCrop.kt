package dev.cubxity.libs.resolve.entities.library.sequence.adjusts

import org.jonnyzzz.kotlin.xml.bind.XAttribute
import org.jonnyzzz.kotlin.xml.bind.jdom.JXML

class AdjustCrop {
        var mode by JXML / XAttribute("mode")

        class TrimRect {
            var top by JXML / XAttribute("top")
            var bottom by JXML / XAttribute("bottom")
        }
    }