package dev.cubxity.libs.resolve.entities.library.sequence

import dev.cubxity.libs.resolve.entities.Resources
import dev.cubxity.libs.resolve.entities.library.sequence.adjusts.AdjustBlend
import dev.cubxity.libs.resolve.entities.library.sequence.adjusts.AdjustCrop
import dev.cubxity.libs.resolve.entities.library.sequence.adjusts.AdjustTransform
import org.jonnyzzz.kotlin.xml.bind.XAttribute
import org.jonnyzzz.kotlin.xml.bind.XElements
import org.jonnyzzz.kotlin.xml.bind.XSub
import org.jonnyzzz.kotlin.xml.bind.XText
import org.jonnyzzz.kotlin.xml.bind.jdom.JXML

class Title {
    var ref by JXML / XAttribute("ref")
    var name by JXML / XAttribute("name")
    var lane by JXML / XAttribute("lane")
    /**
     * 1 = true
     * 0 = false
     */
    var enabled by JXML / XAttribute("enabled")
    var offset by JXML / XAttribute("offset")
    var start by JXML / XAttribute("start")
    var duration by JXML / XAttribute("duration")

    var text by JXML / "text" / XSub(Text::class.java)
    var styleDefs by JXML / XElements("text-style-def") / XSub(TextStyleDef::class.java)

    var adjustCrop by JXML / "adjust-crop" / XSub(AdjustCrop::class.java)
    var adjustTransform by JXML / "adjust-transform" / XSub(AdjustTransform::class.java)
    var adjustBlend by JXML / "adjust-blend" / XSub(AdjustBlend::class.java)

    fun findEffect(resources: Resources) = resources.effects?.find { it.id == ref }

    class Text {
        var rollUpHeight by JXML / XAttribute("roll-up-height")
        var texts by JXML / XElements("text-style") / XSub(StyledText::class.java)

        class StyledText {
            var ref by JXML / XAttribute("ref")
            var text by JXML / XText

            fun findDef(title: Title) = title.styleDefs?.find { it.id == ref }
        }
    }

    class TextStyleDef {
        var id by JXML / XAttribute("id")
        var style by JXML / "text-style" / XSub(TextStyle::class.java)

        class TextStyle {
            /**
             * 1 = true
             * 0 = false
             */
            var italic by JXML / XAttribute("italic")
            /**
             * 1 = true
             * 0 = false
             */
            var bold by JXML / XAttribute("bold")
            var font by JXML / XAttribute("font")
            var fontSize by JXML / XAttribute("fontSize")
            var strokeColor by JXML / XAttribute("strokeColor")
            var fontColor by JXML / XAttribute("fontColor")
            var strokeWidth by JXML / XAttribute("strokeWidth")
            var alignment by JXML / XAttribute("alignment")
            var lineSpacing by JXML / XAttribute("lineSpacing")
        }
    }
}