lazy val root = (project in file(".")).
  settings(
    name := "StrategicMonitoring",
    version := "1",
    scalaVersion := "2.11.7",
    libraryDependencies += "junit" % "junit" % "4.11" % "test",
    libraryDependencies += "com.novocode" % "junit-interface" % "0.10" % "test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test",
    libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4.1",
    libraryDependencies += "com.typesafe.akka" %% "akka-slf4j" % "2.4.1",
    libraryDependencies += "com.typesafe.akka" %% "akka-http-core-experimental" % "2.0.2",
    libraryDependencies += "com.typesafe.akka" %% "akka-http-experimental" % "2.0.2",
    libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.4.1",
    libraryDependencies += "com.typesafe.akka" %% "akka-multi-node-testkit" % "2.4.1",
    libraryDependencies += "com.typesafe.akka" %% "akka-remote" % "2.4.1",
    libraryDependencies += "com.typesafe.akka" %% "akka-cluster" % "2.4.1",
    libraryDependencies += "com.typesafe.akka" %% "akka-cluster-sharding" % "2.4.1",
    libraryDependencies += "com.typesafe.akka" %% "akka-cluster-tools" % "2.4.1",
    libraryDependencies += "com.typesafe.akka" %% "akka-persistence" % "2.4.1",
    libraryDependencies += "com.typesafe.akka" %% "akka-http-spray-json-experimental" % "2.0.2",
    libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.0.2",
    libraryDependencies += "net.liftweb" %% "lift-json" % "2.6+",
    libraryDependencies += "com.typesafe.slick" %% "slick" % "3.1.1",
    libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.5",
    libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.5",
    libraryDependencies += "com.typesafe.slick" %% "slick-codegen" % "3.1.1",
    libraryDependencies += "com.h2database" % "h2" % "1.4.187",
    libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.12",
    libraryDependencies += "com.zaxxer" % "HikariCP" % "2.3.3",
    libraryDependencies += "com.twitter" %% "storehaus-cache" % "0.12.0",
    testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")
  )

