plugins {
    id("application")
    id("com.github.ben-manes.versions") version "0.52.0"
    id("com.diffplug.spotless") version "7.2.1"
}

spotless {
    java {
        importOrder()
        removeUnusedImports()
        googleJavaFormat().aosp()
        formatAnnotations()
        leadingTabsToSpaces(4)
    }
}

application {
    mainClass.set("hexlet.code.App")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}