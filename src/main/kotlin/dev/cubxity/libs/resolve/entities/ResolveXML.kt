package dev.cubxity.libs.resolve.entities

import dev.cubxity.libs.resolve.entities.library.Library
import org.jonnyzzz.kotlin.xml.bind.XSub
import org.jonnyzzz.kotlin.xml.bind.jdom.JDOM
import org.jonnyzzz.kotlin.xml.bind.jdom.JXML
import java.io.File

class ResolveXML {
    var resources by JXML / "resources" / XSub(Resources::class.java)
    var library by JXML / "library" / XSub(Library::class.java)

    fun save(file: File) {
        file.writeText(JDOM.save(this).text)
    }
}