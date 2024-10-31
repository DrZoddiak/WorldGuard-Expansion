plugins {
    java
    id("com.gradleup.shadow") version "8.3.4"
}

repositories {
    mavenCentral()
    maven("https://maven.enginehub.org/repo/")
    maven("https://repo.codemc.org/repository/maven-public/")
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://repo.extendedclip.com/content/repositories/placeholderapi/")
    maven("https://repo.minebench.de/")
    maven("https://maven.sk89q.com/repo/")

}

dependencies {
    compileOnly("me.clip:placeholderapi:2.10.9")
    implementation("org.codemc.worldguardwrapper:worldguardwrapper:1.2.1-SNAPSHOT")
    compileOnly("org.spigotmc:spigot-api:1.14.2-R0.1-SNAPSHOT")
    compileOnly("com.sk89q.worldguard:worldguard-bukkit:7.1.0-SNAPSHOT")
}

tasks.shadowJar {
    dependsOn(tasks.jar)

    relocate("org.codemc.worldguardwrapper", "com.extendedclip.libs.worldguardwrapper")
}