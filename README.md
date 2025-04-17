# Hostname
[![Build Status](https://github.com/evolution-gaming/hostname/workflows/CI/badge.svg)](https://github.com/evolution-gaming/hostname/actions?query=workflow%3ACI)
[![Coverage Status](https://coveralls.io/repos/github/evolution-gaming/hostname/badge.svg?branch=master)](https://coveralls.io/github/evolution-gaming/hostname?branch=master)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/3f8b40b1c23e45cdaa7b1f96bb4f1bf9)](https://app.codacy.com/gh/evolution-gaming/hostname/dashboard?utm_source=gh&utm_medium=referral&utm_content=&utm_campaign=Badge_grade)
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
