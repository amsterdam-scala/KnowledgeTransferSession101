name := "Kennisoverdrachtssessie101"

version := "0.1"

scalaVersion := "2.11.5"

scalacOptions in(Compile, doc) += s"-doc-external-doc:${scalaInstance.value.libraryJar}#http://www.scala-lang.org/api/${scalaVersion.value}/"

scalacOptions in(Compile, doc) ++= Seq("-doc-root-content", baseDirectory.value + "/src/main/scala/nl/amsscala/academy6/rootdoc.txt")

//scalacOptions in(Compile, doc) ++= Seq("-doc-root-content", baseDirectory.value + "/src/main/scala/rootdoc.txt")

scalacOptions ++= Seq("-deprecation", "-feature")

scalacOptions in(Compile, doc) ++= Seq("-doc-title", "Scala 101")

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"
