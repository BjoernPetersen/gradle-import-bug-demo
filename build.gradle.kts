import test.brokenEcho

plugins {
    // Fully qualified name works
    id("io.gitlab.arturbosch.detekt") version test.brokenEcho("1.15.0")
    // Using function in base package works, too (technically fully qualified as well)
    kotlin("jvm") version workingEcho("1.4.21")
    // Using imported function doesn't work
    id("com.diffplug.spotless") version brokenEcho("5.9.0")
}

// Never reached while last line in plugins block is uncommented
logger.lifecycle(brokenEcho("brokenEcho works outside of plugins block"))

repositories {
    jcenter()
}
