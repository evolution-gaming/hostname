# Hostname
[![Build Status](https://travis-ci.org/evolution-gaming/hostname.svg)](https://travis-ci.org/evolution-gaming/hostname)
[![Coverage Status](https://coveralls.io/repos/github/evolution-gaming/hostname/badge.svg?branch=master)](https://coveralls.io/github/evolution-gaming/hostname?branch=master)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/56de85f1728d4f1d806008aaaefbfa69)](https://www.codacy.com/app/evolution-gaming/hostname?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=evolution-gaming/hostname&amp;utm_campaign=Badge_Grade)
[![Version](https://img.shields.io/badge/version-click-blue)](https://evolution.jfrog.io/artifactory/api/search/latestVersion?g=com.evolutiongaming&a=hostname_2.13&repos=public)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellowgreen.svg)](https://opensource.org/licenses/MIT)

## Usage

```scala
  com.evolutiongaming.hostname.HostName() // MacBook-t3hnar 
```

## Setup

```scala
addSbtPlugin("com.evolution" % "sbt-artifactory-plugin" % "0.0.2")

libraryDependencies += "com.evolutiongaming" %% "hostname" % "0.2.0"
```