plugins {
    java
    `maven-publish`
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "com.github.Bali0531-RC"
version = "2.5.8"
description = "IridiumTeams"

repositories {
    mavenCentral()
    mavenLocal()
    maven("https://repo.extendedclip.com/content/repositories/placeholderapi/")
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://ci.ender.zone/plugin/repository/everything/")
    maven("https://nexus.iridiumdevelopment.net/repository/maven-releases/")
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://repo.jeff-media.com/public/")
    maven("https://jitpack.io")
    maven("https://repo.rosewooddev.io/repository/public/")
    maven("https://repo.bg-software.com/repository/api/")
    maven("https://repo.essentialsx.net/releases/")
    maven("https://moyskleytech.com/debian/m2")
}

dependencies {
    implementation("org.jetbrains:annotations:24.1.0")
    implementation("com.j256.ormlite:ormlite-core:6.1")
    implementation("com.j256.ormlite:ormlite-jdbc:6.1")
    implementation("com.iridium:IridiumCore:2.0.6")

    compileOnly("org.projectlombok:lombok:1.18.34")
    compileOnly("org.spigotmc:spigot-api:1.21.1-R0.1-SNAPSHOT")
    compileOnly("com.github.MilkBowl:VaultAPI:1.7")
    compileOnly("me.clip:placeholderapi:2.11.6")
    compileOnly("dev.rosewood:rosestacker:1.5.26")
    compileOnly("com.bgsoftware:WildStackerAPI:2024.3")
    compileOnly("com.moyskleytech:ObsidianStackerAPI:1.0.0")
    compileOnly("net.ess3:EssentialsXSpawn:2.16.1")

    implementation("de.jeff_media:SpigotUpdateChecker:1.3.2")
    implementation("org.bstats:bstats-bukkit:3.0.3")

    annotationProcessor("org.projectlombok:lombok:1.18.34")

    testImplementation(platform("org.junit:junit-bom:5.11.0"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.11.0")
    testImplementation("com.github.seeseemelk:MockBukkit-v1.18:2.85.2")
    testImplementation("com.github.MilkBowl:VaultAPI:1.7")
}

tasks {
    build {
        dependsOn(shadowJar)
    }

    shadowJar {
        archiveClassifier.set("")
    }

    compileJava {
        options.encoding = "UTF-8"
        sourceCompatibility = JavaVersion.VERSION_1_8.toString()
        targetCompatibility = JavaVersion.VERSION_1_8.toString()
    }

    compileTestJava {
        sourceCompatibility = JavaVersion.VERSION_17.toString()
        targetCompatibility = JavaVersion.VERSION_17.toString()
    }

    processResources {
        filesMatching("**/plugin.yml") {
            expand(rootProject.project.properties)
        }
        outputs.upToDateWhen { false }
    }

    test {
        // TODO: fix unit tests & re-enable this
        // useJUnitPlatform()
    }
}

publishing {
    publications.create<MavenPublication>("maven") {
        groupId = "com.github.Bali0531-RC"
        artifactId = "IridiumTeams"
        version = version
        artifact(tasks["shadowJar"])
    }

    // Ensure the publish task depends on jar
    tasks["publishMavenPublicationToMavenLocal"].dependsOn(tasks["jar"])
}
