package dev.cubxity.libs.resolve

import dev.cubxity.libs.resolve.ResolveParser.parse
import dev.cubxity.libs.resolve.entities.ResolveXML
import org.jonnyzzz.kotlin.xml.bind.jdom.JDOM
import java.io.File
import org.jdom2.input.SAXBuilder



object ResolveParser {
    val builder = SAXBuilder()

    fun parse(file: File) = JDOM.load(builder.build(file).rootElement, ResolveXML::class.java)
}

fun main() {
    val s1 = parse(File("sample 1.fcpxml"))
    println(s1)
    val s2 = parse(File("sample 2.fcpxml"))
    println(s2)
}
