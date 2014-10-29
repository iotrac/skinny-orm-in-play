lazy val root = (project in file(".")).enablePlugins(PlayScala)
  .settings(
    name := "skinny-orm-in-play",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.11.2",
    libraryDependencies ++= Seq(
      filters,
      jdbc,
      "org.skinny-framework" %% "skinny-orm"                        % skinnyVersion, // instead of anorm
      "org.skinny-framework" %% "skinny-http-client"                % skinnyVersion, // instead of ws
      "org.scalikejdbc"      %% "scalikejdbc-play-dbplugin-adapter" % "2.3.2",
      "com.github.tototoshi" %% "play-flyway"                       % "1.1.2",
      "com.h2database"       %  "h2"                                % "1.4.182"
    )
  ).settings(scalariformSettings: _*)

lazy val skinnyVersion = "1.3.4"
