# ResolveParser
A simple parser for fcpxml exported by Davinci Resolve written in kotlin

## Usage
```kotlin
val resolveXml = ResolveParser.parse(File("Your export file.fcpxml"))
// Do stuff with it, change something or do whatever

resolveXml.save(File("Modified project.fcpxml"))
```
> **NOTE:** This parser does not fully support everything that resolve exports yet. There might be some loses while modifing